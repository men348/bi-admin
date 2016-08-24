package com.chinadaas.platform.bi.model.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xie on 16/7/25.
 */
public class PaginateHolder<T> {
    private List<T> results = new ArrayList<>();
    private long totalCount = 0;
    private long pageSize = 10;

    public List<T> getResults() {
        return results;
    }

    public void setResults(List<T> results) {
        this.results = results;
    }

    public long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(long totalCount) {
        this.totalCount = totalCount;
    }

    public long getPageSize() {
        return pageSize;
    }

    public void setPageSize(long pageSize) {
        this.pageSize = pageSize;
    }

    public long getTotalPage() {
        return (totalCount - 1)/pageSize + 1;
    }
}
