package com.chinadaas.platform.bi.server.controller;

import com.chinadaas.platform.bi.model.domain.JobFileQuery;
import com.chinadaas.platform.bi.model.domain.JobModel;
import com.chinadaas.platform.bi.model.domain.JobQuery;
import com.chinadaas.platform.bi.model.domain.PaginateHolder;
import com.chinadaas.platform.bi.model.dto.JobDTO;
import com.chinadaas.platform.bi.model.dto.JobFileDTO;
import com.chinadaas.platform.bi.model.enums.JobStatusEnum;
import com.chinadaas.platform.bi.model.enums.JobTypeEnum;
import com.chinadaas.platform.bi.model.response.JobFileListResponse;
import com.chinadaas.platform.bi.model.response.JobListResponse;
import com.chinadaas.platform.bi.model.response.JobResponse;
import com.chinadaas.platform.bi.model.validate.ValidateOnAdd;
import com.chinadaas.platform.bi.server.entity.Job;
import com.chinadaas.platform.bi.server.entity.JobFile;
import com.chinadaas.platform.bi.server.service.JobService;
import com.chinadaas.platform.bi.server.util.JobProperties;
import com.chinadaas.platform.common.util.BeanUtil;
import com.chinadaas.platform.common.util.CommonResponse;
import com.chinadaas.platform.product.model.provider.ColumnGroup;
import com.chinadaas.platform.user.client.CustomerClient;
import com.chinadaas.platform.user.client.UserClient;
import com.chinadaas.platform.user.model.query.CustomerQuery;
import com.chinadaas.platform.user.model.reponse.*;
import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by xie on 16/7/26.
 */

@RestController
public class JobController extends BaseController {

    @Autowired
    private UserClient userClient;

    @Autowired
    private CustomerClient customerClient;

    @Autowired
    private JobService jobService;


    @RequestMapping(value = "/customers", method = RequestMethod.GET)
    public CustomerListResponse queryCustomers(CustomerQuery query) {
        query.setPageSize(Integer.MAX_VALUE);
        CustomerListResponse response = customerClient.queryCustomers(query);
        return response;
    }

    @RequestMapping(value = "/{customerId}/users", method = RequestMethod.GET)
    public UserInfoListResponse queryUserByCustomerId(@PathVariable("customerId") String customerId) {
        UserInfoListResponse response = customerClient.queryUsersByCustomerId(customerId);
        return response;
    }

    @RequestMapping(value = "/job", method = RequestMethod.POST)
    public JobResponse addJob(@RequestBody @Validated(ValidateOnAdd.class) JobModel jobModel, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return new JobResponse().setCode(CODE_BAD_REQUEST_PARAM).setMsg(super.wrapperBindingResult(bindingResult));
        }

        Job job = BeanUtil.propertiesCopy(jobModel, Job.class);
        job.setCreateDate(new Date());
        if (job.getType() == JobTypeEnum.ONCE) {
            job.setStatus(JobStatusEnum.WAIT);
        } else {
            job.setStatus(JobStatusEnum.NORMAL);
        }
        Job jobAdd = jobService.addJob(job);
        JobModel model = new JobModel();
        BeanUtil.propertiesCopy(jobAdd, model);
        return new JobResponse().setCode(200).setJob(model);
    }

    @RequestMapping(value = "/jobs", method = RequestMethod.GET)
    public JobListResponse queryJobList(JobQuery query) {
        PaginateHolder<Job> paginateHolder = jobService.queryJobList(query);

        JobListResponse response = new JobListResponse();

        List<JobDTO> jobList = paginateHolder.getResults().stream().map(Job::toJobDTO).collect(Collectors.toList());

        List<String> userIdList = jobList.stream().map(JobDTO::getUserId).collect(Collectors.toList());

        int i = 0;
        for (JobDTO dto : jobList) {
            CustomerResponse c = customerClient.getByCustomerId(dto.getCustomerId());
            if (c != null) {
                dto.setCustomerName(c.getCustomer().getName());
            }

            UserInfoResponse u = userClient.getUserInfoByUserId(dto.getUserId());
            if (u != null) {
                dto.setUserName(u.getUser().getUserName());
            }
        }
        response.setTotalCount(paginateHolder.getTotalCount()).setPageSize(paginateHolder.getPageSize())
                .setTotalPage(paginateHolder.getTotalPage()).setJobs(jobList);
        return response;
    }

    @RequestMapping(value = "/job/pause/{jobId}", method = RequestMethod.POST)
    public JobResponse pauseJob(@PathVariable("jobId") String jobId) {
        Job job = jobService.pauseJob(jobId);
        JobModel model = BeanUtil.propertiesCopy(job, JobModel.class);
        JobResponse response = new JobResponse();
        response.setJob(model);
        return response;
    }

    @RequestMapping(value = "/job/renew/{jobId}", method = RequestMethod.POST)
    public JobResponse renewJob(@PathVariable("jobId") String jobId) {
        Job job = jobService.renewJob(jobId);
        JobModel model = BeanUtil.propertiesCopy(job, JobModel.class);
        JobResponse response = new JobResponse();
        response.setCode(200);
        response.setJob(model);
        return response;
    }

    @RequestMapping(value = "/job/del/{jobId}", method = RequestMethod.POST)
    public CommonResponse deleteJob(@PathVariable("jobId") String jobId) {
        jobService.deleteJob(jobId);
        return new CommonResponse();
    }

    @RequestMapping(value = "/job/files", method = RequestMethod.GET)
    public JobFileListResponse queryJobFileList(JobFileQuery query) {
        PaginateHolder<JobFile> paginateHolder = jobService.queryJobFileList(query);

        JobFileListResponse response = new JobFileListResponse();
        List<JobFileDTO> jobFileList = paginateHolder.getResults().stream().map(JobFile::toJobFileDTO).collect(Collectors.toList());

        if (jobFileList != null && jobFileList.size() != 0) {
            String customerId = jobFileList.get(0).getCustomerId();
            CustomerResponse c = customerClient.getByCustomerId(customerId);
            String userId = jobFileList.get(0).getUserId();
            UserInfoResponse u = userClient.getUserInfoByUserId(userId);
            if (u != null && c != null)
                for (JobFileDTO dto : jobFileList) {
                    dto.setCustomerName(c.getCustomer().getName());
                    dto.setUserName(u.getUser().getUserName());
                }
        }
        return response.setTotalCount(paginateHolder.getTotalCount()).setTotalPage(paginateHolder.getTotalPage())
                .setPageSize(paginateHolder.getPageSize()).setJobFileList(jobFileList);
    }

    @RequestMapping(value = "/job/file", method = RequestMethod.GET)
    public void downloadJobFile(String fileName, HttpServletResponse response) {
        String filePath = JobProperties.getJobFilePath() + "/" + fileName;
        String name = fileName.substring(fileName.indexOf("/"));
        File file = new File(filePath);
        if (file.exists()) {
            response.setCharacterEncoding("UTF-8");
            response.setContentType("application/vnd.ms-excel");
            response.addHeader("Content-Disposition", "attachment;filename=" + name);
            try {
                InputStream in = new FileInputStream(file);
                OutputStream out = response.getOutputStream();
                IOUtils.copy(in, out);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @RequestMapping(value = "/bi/metadata", method = RequestMethod.GET)
    public ColumnGroup getMetaData(@RequestParam(value = "columnIds", required = false) String columnIds) {
        if (!StringUtils.isEmpty(columnIds)) {
            return jobService.getMetadata(Arrays.asList(columnIds.split(",")));
        }
        return jobService.getMetadata();
    }

}
