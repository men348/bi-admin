package com.chinadaas.platform.bi.model.domain;

import com.chinadaas.platform.bi.model.enums.JobStatusEnum;
import com.chinadaas.platform.bi.model.enums.JobTypeEnum;
import com.chinadaas.platform.bi.model.validate.ValidateOnAdd;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by xie on 16/7/27.
 */
public class JobModel {
    private String id;

    @NotBlank (message = "客户不能为空", groups = {ValidateOnAdd.class})
    private String customerId;

    @NotBlank (message = "用户不能为空", groups = {ValidateOnAdd.class})
    private String userId;

    @NotNull(message = "任务类型不能为空", groups = {ValidateOnAdd.class})
    private JobTypeEnum type;

    @NotBlank (message = "执行时间不能为空", groups = {ValidateOnAdd.class})
    private String execTime;

    private String entProvince;

    private String entCapital;

    private JobStatusEnum status;

    private Date entCreateStartDate;

    private Date entCreateEndDate;

    private Date createDate;

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

    public JobTypeEnum getType() {
        return type;
    }

    public void setType(JobTypeEnum type) {
        this.type = type;
    }

    public String getExecTime() {
        return execTime;
    }

    public void setExecTime(String execTime) {
        this.execTime = execTime;
    }

    public String getEntProvince() {
        return entProvince;
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}
