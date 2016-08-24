package com.chinadaas.platform.bi.model.response;

import com.chinadaas.platform.bi.model.domain.JobFileModel;

/**
 * Created by xie on 16/7/29.
 */
public class JobFileResponse {

    private int code;
    private String msg;
    private JobFileModel jobFile;

    public int getCode() {
        return code;
    }

    public JobFileResponse setCode(int code) {
        this.code = code;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public JobFileResponse setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public JobFileModel getJobFile() {
        return jobFile;
    }

    public JobFileResponse setJobFile(JobFileModel jobFile) {
        this.jobFile = jobFile;
        return this;
    }
}
