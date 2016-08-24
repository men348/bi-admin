package com.chinadaas.platform.bi.server.entity;

import com.chinadaas.platform.bi.model.dto.JobDTO;
import com.chinadaas.platform.bi.model.enums.JobStatusEnum;
import com.chinadaas.platform.bi.model.enums.JobTypeEnum;
import com.chinadaas.platform.common.util.BeanUtil;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by xie on 16/7/27.
 */
@Entity
@Table(name = "job")
public class Job {
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
    private Date modifyDate;

    public JobDTO toJobDTO() {
        return BeanUtil.propertiesCopy(this, JobDTO.class);
    }

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Enumerated
    @Column(name = "type")
    public JobTypeEnum getType() {
        return type;
    }

    public void setType(JobTypeEnum type) {
        this.type = type;
    }

    @Column(name = "exec_time")
    public String getExecTime() {
        return execTime;
    }

    public void setExecTime(String execTime) {
        this.execTime = execTime;
    }

    @Column(name = "customer_id")
    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    @Column(name = "user_id")
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Column(name = "ent_capital")
    public String getEntCapital() {
        return entCapital;
    }

    public void setEntCapital(String entCapital) {
        this.entCapital = entCapital;
    }

    @Column(name = "ent_province")
    public String getEntProvince() {
        return entProvince;
    }

    public void setEntProvince(String entProvince) {
        this.entProvince = entProvince;
    }

    @Enumerated
    @Column(name = "status")
    public JobStatusEnum getStatus() {
        return status;
    }

    public void setStatus(JobStatusEnum status) {
        this.status = status;
    }

    @Column(name = "ent_create_start_date")
    public Date getEntCreateStartDate() {
        return entCreateStartDate;
    }

    public void setEntCreateStartDate(Date entCreateStartDate) {
        this.entCreateStartDate = entCreateStartDate;
    }

    @Column(name = "ent_create_end_date")
    public Date getEntCreateEndDate() {
        return entCreateEndDate;
    }

    public void setEntCreateEndDate(Date entCreateEndDate) {
        this.entCreateEndDate = entCreateEndDate;
    }

    @Column(name = "create_date")
    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Column(name = "modify_date")
    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }
}
