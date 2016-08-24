package com.chinadaas.platform.bi.model.response;

import com.chinadaas.platform.bi.model.domain.JobModel;

/**
 * Created by xie on 16/7/27.
 */
public class JobResponse {
    private int code;
    private String msg;
    private JobModel job;

    public int getCode() {
        return code;
    }

    public JobResponse setCode(int code) {
        this.code = code;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public JobResponse setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public JobModel getJob() {
        return job;
    }

    public JobResponse setJob(JobModel job) {
        this.job = job;
        return this;
    }
}
