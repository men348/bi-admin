package com.chinadaas.platform.bi.server.ententity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.security.Timestamp;
import java.util.Date;

/**
 * Created by xie on 16/8/8.
 */

@Entity
@Table(name = "E_INV_INVESTMENT")
public class EnterpriseInv {

    private String s_ext_nodenum;       //省份代码
    private String pripid;              //主体身份代码
    private String invid;               //投资人身份标识
    private String inv;                 //投资人
    private String invtype;             //投资人类型
    private String certype;             //证件类型
    private String cerno;               //证件号码
    private String blictype;            //证件类型
    private String blicno;              //证件编号;
    private String country;             //国家
    private String currency;            //币种
    private BigDecimal subconam;        //认缴出资额
    private BigDecimal acconam;         //实缴出资额
    private BigDecimal subconamusd;     //认缴出资额折万美元
    private BigDecimal acconamusd;      //实缴出资额折万美元
    private BigDecimal conprop;         //出资比例
    private String conform;             //出资方式
    private Date condate;               //出资日期
    private Date baldelper;             //余额缴付期限
    private BigDecimal conam;           //出资额
    private String exeaffsign;          //执行合伙事务标志
    private Timestamp s_ext_timestamp;  //入库时间
    private String s_ext_batch;         //入库批次
    private String s_ext_sequence;      //
    private String s_ext_validflag;     //
    private String linkman;             //联系人
    private String jobid;               //
    private String ent_id;              //
    private String typedisplay;
    private BigDecimal handle_type;

    @Column
    public String getS_ext_nodenum() {
        return s_ext_nodenum;
    }

    public void setS_ext_nodenum(String s_ext_nodenum) {
        this.s_ext_nodenum = s_ext_nodenum;
    }

    @Column
    public String getPripid() {
        return pripid;
    }

    public void setPripid(String pripid) {
        this.pripid = pripid;
    }

    @Id
    public String getInvid() {
        return invid;
    }

    public void setInvid(String invid) {
        this.invid = invid;
    }

    @Column
    public String getInv() {
        return inv;
    }

    public void setInv(String inv) {
        this.inv = inv;
    }

    @Column
    public String getInvtype() {
        return invtype;
    }

    public void setInvtype(String invtype) {
        this.invtype = invtype;
    }

    @Column
    public String getCertype() {
        return certype;
    }

    public void setCertype(String certype) {
        this.certype = certype;
    }
    @Column
    public String getCerno() {
        return cerno;
    }

    public void setCerno(String cerno) {
        this.cerno = cerno;
    }
    @Column
    public String getBlictype() {
        return blictype;
    }

    public void setBlictype(String blictype) {
        this.blictype = blictype;
    }
    @Column
    public String getBlicno() {
        return blicno;
    }

    public void setBlicno(String blicno) {
        this.blicno = blicno;
    }
    @Column
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    @Column
    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
    @Column
    public BigDecimal getSubconam() {
        return subconam;
    }

    public void setSubconam(BigDecimal subconam) {
        this.subconam = subconam;
    }
    @Column
    public BigDecimal getAcconam() {
        return acconam;
    }

    public void setAcconam(BigDecimal acconam) {
        this.acconam = acconam;
    }
    @Column
    public BigDecimal getSubconamusd() {
        return subconamusd;
    }

    public void setSubconamusd(BigDecimal subconamusd) {
        this.subconamusd = subconamusd;
    }
    @Column
    public BigDecimal getAcconamusd() {
        return acconamusd;
    }

    public void setAcconamusd(BigDecimal acconamusd) {
        this.acconamusd = acconamusd;
    }
    @Column
    public BigDecimal getConprop() {
        return conprop;
    }

    public void setConprop(BigDecimal conprop) {
        this.conprop = conprop;
    }
    @Column
    public String getConform() {
        return conform;
    }

    public void setConform(String conform) {
        this.conform = conform;
    }
    @Column
    public Date getCondate() {
        return condate;
    }

    public void setCondate(Date condate) {
        this.condate = condate;
    }
    @Column
    public Date getBaldelper() {
        return baldelper;
    }

    public void setBaldelper(Date baldelper) {
        this.baldelper = baldelper;
    }
    @Column
    public BigDecimal getConam() {
        return conam;
    }

    public void setConam(BigDecimal conam) {
        this.conam = conam;
    }
    @Column
    public String getExeaffsign() {
        return exeaffsign;
    }

    public void setExeaffsign(String exeaffsign) {
        this.exeaffsign = exeaffsign;
    }
    @Column
    public Timestamp getS_ext_timestamp() {
        return s_ext_timestamp;
    }

    public void setS_ext_timestamp(Timestamp s_ext_timestampp) {
        this.s_ext_timestamp = s_ext_timestamp;
    }
    @Column
    public String getS_ext_batch() {
        return s_ext_batch;
    }

    public void setS_ext_batch(String s_ext_batch) {
        this.s_ext_batch = s_ext_batch;
    }
    @Column
    public String getS_ext_sequence() {
        return s_ext_sequence;
    }

    public void setS_ext_sequence(String s_ext_sequence) {
        this.s_ext_sequence = s_ext_sequence;
    }
    @Column
    public String getS_ext_validflag() {
        return s_ext_validflag;
    }

    public void setS_ext_validflag(String s_ext_validflag) {
        this.s_ext_validflag = s_ext_validflag;
    }
    @Column
    public String getLinkman() {
        return linkman;
    }

    public void setLinkman(String linkman) {
        this.linkman = linkman;
    }
    @Column
    public String getJobid() {
        return jobid;
    }

    public void setJobid(String jobid) {
        this.jobid = jobid;
    }
    @Column
    public String getEnt_id() {
        return ent_id;
    }

    public void setEnt_id(String ent_id) {
        this.ent_id = ent_id;
    }
    @Column
    public String getTypedisplay() {
        return typedisplay;
    }

    public void setTypedisplay(String typedisplay) {
        this.typedisplay = typedisplay;
    }
    @Column
    public BigDecimal getHandle_type() {
        return handle_type;
    }

    public void setHandle_type(BigDecimal handle_type) {
        this.handle_type = handle_type;
    }
}
