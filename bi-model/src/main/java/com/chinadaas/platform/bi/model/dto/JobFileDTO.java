package com.chinadaas.platform.bi.model.dto;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by xie on 16/7/29.
 */
public class JobFileDTO {
    private String id;
    private String jobId;
    private String customerId;
    private String userId;
    private long entCount;
    private String fileName;
    private Date createDate;
    private String customerName;
    private String userName;

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

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
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

    public String getCreateDateFormat() {
        return createDate == null ? "" : new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(createDate);
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
