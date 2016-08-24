package com.chinadaas.platform.bi.model.response;

import com.chinadaas.platform.bi.model.domain.JobModel;
import com.chinadaas.platform.bi.model.domain.PaginateHolder;
import com.chinadaas.platform.bi.model.dto.JobDTO;
import com.chinadaas.platform.common.util.CommonResponse;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by xie on 16/7/28.
 */
public class JobListResponse extends CommonResponse {
    private long totalCount;
    private long pageSize;
    private long totalPage;

    private List<JobDTO> jobs = new LinkedList<JobDTO>();

    public long getTotalCount() {
        return totalCount;
    }

    public JobListResponse setTotalCount(long totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    public long getPageSize() {
        return pageSize;
    }

    public JobListResponse setPageSize(long pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    public long getTotalPage() {
        return totalPage;
    }

    public JobListResponse setTotalPage(long totalPage) {
        this.totalPage = totalPage;
        return this;
    }

    public List<JobDTO> getJobs() {
        return jobs;
    }

    public JobListResponse setJobs(List<JobDTO> jobs) {
        this.jobs = jobs;
        return this;
    }
}
