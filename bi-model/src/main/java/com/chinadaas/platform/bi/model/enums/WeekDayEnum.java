package com.chinadaas.platform.bi.model.enums;

/**
 * Created by xie on 16/8/2.
 */
public enum WeekDayEnum {
    MON,
    TUE,
    WED,
    THU,
    FRI,
    SAT,
    SUN;

    public String getChineseCode() {
        if (this == WeekDayEnum.MON) {
            return "周一";
        }
        if (this == WeekDayEnum.TUE) {
            return "周二";
        }
        if (this == WeekDayEnum.WED) {
            return "周三";
        }
        if (this == WeekDayEnum.THU) {
            return "周四";
        }
        if (this == WeekDayEnum.FRI) {
            return "周五";
        }
        if (this == WeekDayEnum.SAT) {
            return "周六";
        }
        if (this == WeekDayEnum.SUN) {
            return "周日";
        }
        return null;
    }
}
