package com.chinadaas.platform.bi.model.dto;

import java.util.Date;

/**
 * Created by xie on 16/8/5.
 */
public class EnterpriseBaseInfoDTO {
    private String pripid;
    private String entName;
    private String regNo;
    private String entType;
    private String abuItem;
    private String cbuItem;
    private Date assDate;
    private Date esDate;

    public String getPripid() {
        return pripid;
    }

    public void setPripid(String pripid) {
        this.pripid = pripid;
    }

    public String getEntName() {
        return entName;
    }

    public void setEntName(String entName) {
        this.entName = entName;
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public String getEntType() {
        return entType;
    }

    public void setEntType(String entType) {
        this.entType = entType;
    }

    public String getAbuItem() {
        return abuItem;
    }

    public void setAbuItem(String abuItem) {
        this.abuItem = abuItem;
    }

    public String getCbuItem() {
        return cbuItem;
    }

    public void setCbuItem(String cbuItem) {
        this.cbuItem = cbuItem;
    }

    public Date getAssDate() {
        return assDate;
    }

    public void setAssDate(Date assDate) {
        this.assDate = assDate;
    }

    public Date getEsDate() {
        return esDate;
    }

    public void setEsDate(Date esDate) {
        this.esDate = esDate;
    }
}
