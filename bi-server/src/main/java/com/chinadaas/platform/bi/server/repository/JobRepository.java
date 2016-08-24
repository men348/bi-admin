package com.chinadaas.platform.bi.server.repository;

import com.chinadaas.platform.bi.model.domain.JobFileQuery;
import com.chinadaas.platform.bi.model.domain.JobQuery;
import com.chinadaas.platform.bi.model.domain.PaginateHolder;
import com.chinadaas.platform.bi.server.entity.Job;
import com.chinadaas.platform.bi.server.entity.JobFile;

import java.util.List;

/**
 * Created by xie on 16/7/27.
 */
public interface JobRepository {

    PaginateHolder<Job> queryJobList(JobQuery query);

    PaginateHolder<JobFile> queryJobFileList(JobFileQuery query);

    List<Job> queryJobs();
}
