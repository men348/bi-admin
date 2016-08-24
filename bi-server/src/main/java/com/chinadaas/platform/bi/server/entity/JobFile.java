package com.chinadaas.platform.bi.server.entity;

import com.chinadaas.platform.bi.model.dto.JobFileDTO;
import com.chinadaas.platform.common.util.BeanUtil;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by xie on 16/7/29.
 */
@Entity
@Table(name = "job_file")
public class JobFile {
    private String id;
    private String jobId;
    private String customerId;
    private String userId;
    private long entCount;
    private String fileName;
    private Date createDate;

    public JobFileDTO toJobFileDTO() {
        return BeanUtil.propertiesCopy(this,JobFileDTO.class);
    }

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid",strategy = "uuid")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Column(name = "job_id")
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
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

    @Column(name = "ent_count")
    public long getEntCount() {
        return entCount;
    }

    public void setEntCount(long entCount) {
        this.entCount = entCount;
    }

    @Column(name = "file_name")
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    @Column(name = "create_date")
    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}
