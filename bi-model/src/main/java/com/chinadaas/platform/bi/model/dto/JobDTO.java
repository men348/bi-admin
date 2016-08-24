package com.chinadaas.platform.bi.model.dto;

import com.chinadaas.platform.bi.model.enums.JobStatusEnum;
import com.chinadaas.platform.bi.model.enums.JobTypeEnum;
import org.springframework.util.StringUtils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by xie on 16/7/28.
 */
public class JobDTO {
    private String id;
    private JobTypeEnum type;
    private String execTime;
    private String customerId;
    private String userId;
    private String entProvince;
    private String entCapital;
    private JobStatusEnum status;
    private Date entCreateStartDate;
    private Date entCreateEndDate;
    private Date createDate;
    private String customerName;
    private String userName;
    private Date modifyDate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public JobTypeEnum getType() {
        return type;
    }

    public void setType(JobTypeEnum type) {
        this.type = type;
    }

    public String getExecTime() {
        if (type == JobTypeEnum.WEEK) {
            String[] t = execTime.split(",");
            String s = JobTypeEnum.valueOf(t[0]).getChineseCode();
            return s + "," + t[1];
        }
        return execTime;
    }

    public void setExecTime(String execTime) {
        this.execTime = execTime;
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

    public String getEntProvince() {
        return StringUtils.isEmpty(entProvince) ? "所有省" : entProvince;
    }

    public void setEntProvince(String entProvince) {
        this.entProvince = entProvince;
    }

    public String getEntCapital() {
        return entCapital;
    }

    public void setEntCapital(String entCapital) {
        this.entCapital = entCapital;
    }

    public JobStatusEnum getStatus() {
        return status;
    }

    public void setStatus(JobStatusEnum status) {
        this.status = status;
    }

    public Date getEntCreateStartDate() {
        return entCreateStartDate;
    }

    public void setEntCreateStartDate(Date entCreateStartDate) {
        this.entCreateStartDate = entCreateStartDate;
    }

    public Date getEntCreateEndDate() {
        return entCreateEndDate;
    }

    public void setEntCreateEndDate(Date entCreateEndDate) {
        this.entCreateEndDate = entCreateEndDate;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public String getCreateDateFormat() {
        return createDate == null ? "" : new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(createDate);
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getJobType() {
        return type.getChineseCode();
    }

    public String getJobStatus() {
        return status.getChineseCode();
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

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    public String getCapital() {
        if (!StringUtils.isEmpty(entCapital)) {
            StringBuilder result = new StringBuilder("[");
            String[] caps = entCapital.split(",");
            if (caps[0].equals("-1")) {
                result.append("0, ");
            } else {
                result.append(caps[0] + ", ");
            }

            if (caps[1].equals("-1")) {
                result.append("+∞]");
            } else {
                result.append(caps[1] + "]");
            }
            return result.toString();
        }
        return "";
    }
}
