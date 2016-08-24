package com.chinadaas.platform.bi.model.enums;

/**
 * Created by xie on 16/7/27.
 */
public enum  JobTypeEnum {
    ONCE,
    DAY,
    WEEK,
    MONTH;

    JobTypeEnum() {

    }


    public String getChineseCode() {
        if(this == JobTypeEnum.ONCE) {
            return "临时任务";
        }
        if(this == JobTypeEnum.DAY) {
            return "每日一次";
        }
        if(this == JobTypeEnum.WEEK) {
            return "每周一次";
        }
        if(this == JobTypeEnum.MONTH) {
            return "每月一次";
        }
        return "";
    }

}
