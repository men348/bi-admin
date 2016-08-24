package com.chinadaas.platform.bi.model.response;

import com.chinadaas.platform.bi.model.dto.JobFileDTO;
import com.chinadaas.platform.common.util.CommonResponse;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by xie on 16/7/29.
 */
public class JobFileListResponse extends CommonResponse {

    private long totalCount;
    private long pageSize;
    private long totalPage;

    private List<JobFileDTO> jobFileList = new LinkedList<>();

    public long getTotalCount() {
        return totalCount;
    }

    public JobFileListResponse setTotalCount(long totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    public long getPageSize() {
        return pageSize;
    }

    public JobFileListResponse setPageSize(long pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    public long getTotalPage() {
        return totalPage;
    }

    public JobFileListResponse setTotalPage(long totalPage) {
        this.totalPage = totalPage;
        return this;
    }

    public List<JobFileDTO> getJobFileList() {
        return jobFileList;
    }

    public JobFileListResponse setJobFileList(List<JobFileDTO> jobFileList) {
        this.jobFileList = jobFileList;
        return this;
    }
}
