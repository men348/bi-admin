package com.chinadaas.platform.bi.server.service;

import com.chinadaas.platform.bi.model.domain.JobFileQuery;
import com.chinadaas.platform.bi.model.domain.JobQuery;
import com.chinadaas.platform.bi.model.domain.PaginateHolder;
import com.chinadaas.platform.bi.server.entity.Job;
import com.chinadaas.platform.bi.server.entity.JobFile;
import com.chinadaas.platform.product.model.provider.ColumnGroup;

import java.util.List;

/**
 * Created by xie on 16/7/27.
 */
public interface JobService {
    Job addJob(Job job);

    PaginateHolder<Job> queryJobList(JobQuery query);

    Job pauseJob(String jobId);

    Job renewJob(String jobId);

    Job deleteJob(String jobId);

    JobFile addJobFile(JobFile jobFile);

    PaginateHolder<JobFile> queryJobFileList(JobFileQuery query);

    List<Job> queryJobs();

    Job completeJob(String jobId);

    ColumnGroup getMetadata();

    ColumnGroup getMetadata(List<String> columnIds);
}
