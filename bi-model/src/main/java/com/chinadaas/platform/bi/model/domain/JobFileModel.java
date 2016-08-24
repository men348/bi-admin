package com.chinadaas.platform.bi.model.domain;

import java.util.Date;

/**
 * Created by xie on 16/7/28.
 */
public class JobFileModel {
    private String id;
    private String jobId;
    private String customer_id;
    private String user_id;
    private long entCount;
    private String fileName;
    private Date createDate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public String getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(String customer_id) {
        this.customer_id = customer_id;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public long getEntCount() {
        return entCount;
    }

    public void setEntCount(long entCount) {
        this.entCount = entCount;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}
