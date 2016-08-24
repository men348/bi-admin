package com.chinadaas.platform.bi.server.repository.impl;

import com.chinadaas.platform.bi.model.domain.JobFileQuery;
import com.chinadaas.platform.bi.model.domain.JobQuery;
import com.chinadaas.platform.bi.model.domain.PaginateHolder;
import com.chinadaas.platform.bi.model.enums.JobStatusEnum;
import com.chinadaas.platform.bi.server.entity.Job;
import com.chinadaas.platform.bi.server.entity.JobFile;
import com.chinadaas.platform.bi.server.repository.GenericRepository;
import com.chinadaas.platform.bi.server.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.util.StringUtils;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by xie on 16/7/27.
 */
@Repository
public class JobRepositoryImpl implements JobRepository {
    @Autowired
    private GenericRepository repository;

    @Override
    public PaginateHolder<Job> queryJobList(JobQuery query) {
        StringBuilder jpql = new StringBuilder();
        jpql.append(" from Job j where 1=1");
        HashMap params = new HashMap();

        String customerId = query.getCustomerId();
        if (!StringUtils.isEmpty(customerId)) {
            jpql.append(" and j.customerId = :customerId");
            params.put("customerId", customerId);
        }

        String userId = query.getUserId();
        if (!StringUtils.isEmpty(userId)) {
            jpql.append(" and j.userId = :userId");
            params.put("userId", userId);
        }

        String entProvince = query.getEntProvince();
        if (!StringUtils.isEmpty(entProvince)) {
            jpql.append(" and j.entProvince = :entProvince");
            params.put("entProvince", entProvince);
        }

        Date startDate = query.getStartDateFor();
        if (startDate != null) {
            jpql.append(" and j.createDate > :startDate");
            params.put("startDate", startDate);
        }

        Date endDate = query.getEndDateFor();
        if (endDate != null) {
            jpql.append(" and j.createDate < :endDate");
            params.put("endDate", endDate);
        }

        List<JobStatusEnum> statusList = query.getStatusList();
        if (statusList != null && statusList.size() != 0) {
            jpql.append(" and j.status in (");
            int lastIndex = statusList.size() - 1;
            for(int i = 0; i < lastIndex; i++) {
                jpql.append(":status" + i + ",");
                params.put("status" + i, statusList.get(i));
            }
            jpql.append(":status" + lastIndex + ")");
            params.put("status" + lastIndex, statusList.get(lastIndex));
        }

        String countJpql = "select count(j) " + jpql.toString();
        String queryJpql = "select j " + jpql.toString() + " order by " + query.getOrderBy();
        return repository.paginate(Job.class, queryJpql, countJpql, query.getStartIndex(), query.getPageSize(), params);
    }

    @Override
    public PaginateHolder<JobFile> queryJobFileList(JobFileQuery query) {
        StringBuilder jpql = new StringBuilder();
        jpql.append(" from JobFile f where 1=1");
        Map<String, Object> params = new HashMap<>();

        String jobId = query.getJobId();
        if (!StringUtils.isEmpty(jobId)) {
            jpql.append(" and f.jobId = :jobId");
            params.put("jobId", jobId);
        }

        Date createStartDate = query.getCreateStartDateFor();
        if(createStartDate != null) {
            jpql.append(" and f.createDate > :createStartDate");
            params.put("createStartDate", createStartDate);
        }

        Date createEndDate = query.getCreateEndDateFor();
        if(createEndDate != null) {
            jpql.append(" and f.createDate < :createEndDate");
            params.put("createEndDate", createEndDate);
        }

        String queryJpql = "select f" + jpql.toString() + " order by " + query.getOrderBy();
        String countJpql = "select count(f)" + jpql.toString();


        return repository.paginate(JobFile.class, queryJpql, countJpql, query.getStartIndex(), query.getPageSize(),params);
    }

    @Override
    public List<Job> queryJobs() {
        StringBuilder jpql = new StringBuilder();
        jpql.append("select j from Job j where j.status = :status1 or j.status = :status2");
        Map<String, Object> params = new HashMap<>();
        params.put("status1", JobStatusEnum.NORMAL);
        params.put("status2", JobStatusEnum.WAIT);
        List<Job> jobs = repository.queryJobs(Job.class, jpql.toString(), params);
        return jobs;
    }
}
