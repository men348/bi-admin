package com.chinadaas.platform.bi.model.domain;

/**
 * Created by xie on 16/7/25.
 */
public class PaginateQuery {

    private int pageSize = 10;
    private int targetPage = 1;
    private String orderBy = "create_date desc";

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getTargetPage() {
        return targetPage;
    }

    public void setTargetPage(int targetPage) {
        this.targetPage = targetPage;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    public int getStartIndex() {
        return targetPage < 1 ? 0 : (targetPage - 1) * pageSize;
    }
}
