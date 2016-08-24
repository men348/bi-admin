package com.chinadaas.platform.bi.model.domain;

import org.springframework.util.StringUtils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by xie on 16/7/29.
 */
public class JobFileQuery extends PaginateQuery{
    private String jobId;
    private String createStartDate;
    private String createEndDate;
    private String customerId;
    private String userId;

    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public String getCreateStartDate() {
        return createStartDate;
    }

    public void setCreateStartDate(String createStartDate) {
        this.createStartDate = createStartDate;
    }

    public String getCreateEndDate() {
        return createEndDate;
    }

    public void setCreateEndDate(String createEndDate) {
        this.createEndDate = createEndDate;
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

    public Date getCreateStartDateFor() {
        try {
            if (!StringUtils.isEmpty(createStartDate))
                return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(createStartDate + " 00:00:00");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public Date getCreateEndDateFor() {
        try {
            if (!StringUtils.isEmpty(createEndDate)) {
                return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(createEndDate + " 23:59:59");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
