package com.chinadaas.platform.bi.model.enums;

/**
 * Created by xie on 16/7/27.
 */
public enum JobStatusEnum {
    NORMAL,     //周期任务的状态
    STOP,       //周期任务的状态
    WAIT,       //临时任务的状态
    COMPLETE,   //临时任务的状态
    DELETED,;

    public String getChineseCode() {
        if (this == JobStatusEnum.NORMAL) {
            return "正常";
        }
        if (this == JobStatusEnum.STOP) {
            return "暂停";
        }
        if (this == JobStatusEnum.WAIT) {
            return "等待";
        }
        if (this == JobStatusEnum.COMPLETE) {
            return "完成";
        }
        if (this == JobStatusEnum.DELETED) {
            return "已删除";
        }
        return "";
    }
}
