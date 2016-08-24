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
@Table(name = "E_PRI_PERSON")
public class EnterprisePerson {

    private String s_ext_nodenum;       //省份代码
    private String pripid;              //主体身份代码
    private String person_id;           //人员id
    private String name;                //姓名
    private String certype;             //证件类型
    private String cerno;               //证件号码
    private String sex;                 //性别
    private Date natdate;             //出生日期
    private String dom;                 //住址
    private String postalcode;          //邮政编码
    private String tel;                 //联系电话
    private String litdeg;              //文化程度
    private String nation;              //民族
    private String polstand;             //政治面貌
    private String occst;               //职业状况
    private String offsign;             //公务员标志
    private String accdside;            //委派方
    private String lerepsign;           //法定代表人标志
    private String character;           //经营者主体特征
    private String country;             //国别
    private Date arrchdate;           //来华日期
    private Date cerlssdate;          //签证签发日期
    private Date cervalper;           //签证有效期
    private String chiofthedelsign;     //首席代表标志
    private Timestamp s_ext_timestamp;     //入库时间
    private String s_ext_batch;         //入库批次
    private String notorg;              //身份核证文件核证机构
    private String notdocno;            //身份核证文件编号
    private String s_ext_sequence;      //
    private String s_ext_validflag;     //
    private String position;            //职务
    private Date offhfrom;            //任职起始日期
    private Date offhto;              //任职截止日期
    private String posbrform;           //职务产生方式
    private String appounit;            //任命单位
    private String jobid;
    private String entid;
    private String typedisplay;
    private String data_flag;
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
    public String getPerson_id() {
        return person_id;
    }

    public void setPerson_id(String person_id) {
        this.person_id = person_id;
    }
    @Column
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Column
    public String getCertype() {
        return certype;
    }

    public void setCertype(String certype) {
        this.certype = certype;
    }

    public String getCerno() {
        return cerno;
    }

    public void setCerno(String cerno) {
        this.cerno = cerno;
    }
    @Column
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
    @Column
    public Date getNatdate() {
        return natdate;
    }

    public void setNatdate(Date natdate) {
        this.natdate = natdate;
    }
    @Column
    public String getDom() {
        return dom;
    }

    public void setDom(String dom) {
        this.dom = dom;
    }
    @Column
    public String getPostalcode() {
        return postalcode;
    }

    public void setPostalcode(String postalcode) {
        this.postalcode = postalcode;
    }
    @Column
    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
    @Column
    public String getLitdeg() {
        return litdeg;
    }

    public void setLitdeg(String litdeg) {
        this.litdeg = litdeg;
    }
    @Column
    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }
    @Column
    public String getPlstand() {
        return polstand;
    }

    public void setPlstand(String polstand) {
        this.polstand = polstand;
    }
    @Column
    public String getOccst() {
        return occst;
    }

    public void setOccst(String occst) {
        this.occst = occst;
    }
    @Column
    public String getOffsign() {
        return offsign;
    }

    public void setOffsign(String offsign) {
        this.offsign = offsign;
    }
    @Column
    public String getAccdside() {
        return accdside;
    }

    public void setAccdside(String accdside) {
        this.accdside = accdside;
    }
    @Column
    public String getLerepsign() {
        return lerepsign;
    }

    public void setLerepsign(String lerepsign) {
        this.lerepsign = lerepsign;
    }
    @Column
    public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {
        this.character = character;
    }
    @Column
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    @Column
    public Date getArrchdate() {
        return arrchdate;
    }

    public void setArrchdate(Date arrchdate) {
        this.arrchdate = arrchdate;
    }
    @Column
    public Date getCerlssdate() {
        return cerlssdate;
    }

    public void setCerlssdate(Date cerlssdate) {
        this.cerlssdate = cerlssdate;
    }

    @Column
    public Date getCervalper() {
        return cervalper;
    }

    public void setCervalper(Date cervalper) {
        this.cervalper = cervalper;
    }

    @Column
    public String getChiofthedelsign() {
        return chiofthedelsign;
    }

    public void setChiofthedelsign(String chiofthedelsign) {
        this.chiofthedelsign = chiofthedelsign;
    }

    @Column
    public Timestamp getS_ext_timestamp() {
        return s_ext_timestamp;
    }

    public void setS_ext_timestamp(Timestamp s_ext_timestamp) {
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
    public String getNotorg() {
        return notorg;
    }

    public void setNotorg(String notorg) {
        this.notorg = notorg;
    }
    @Column
    public String getNotdocno() {
        return notdocno;
    }

    public void setNotdocno(String notdocno) {
        this.notdocno = notdocno;
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
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
    @Column
    public Date getOffhfrom() {
        return offhfrom;
    }

    public void setOffhfrom(Date offhfrom) {
        this.offhfrom = offhfrom;
    }
    @Column
    public Date getOffhto() {
        return offhto;
    }

    public void setOffhto(Date offhto) {
        this.offhto = offhto;
    }
    @Column
    public String getPosbrform() {
        return posbrform;
    }

    public void setPosbrform(String posbrform) {
        this.posbrform = posbrform;
    }
    @Column
    public String getAppounit() {
        return appounit;
    }

    public void setAppounit(String appounit) {
        this.appounit = appounit;
    }
    @Column
    public String getJobid() {
        return jobid;
    }

    public void setJobid(String jobid) {
        this.jobid = jobid;
    }
    @Column
    public String getEntid() {
        return entid;
    }

    public void setEntid(String entid) {
        this.entid = entid;
    }
    @Column
    public String getTypedisplay() {
        return typedisplay;
    }

    public void setTypedisplay(String typedisplay) {
        this.typedisplay = typedisplay;
    }
    @Column
    public String getData_flag() {
        return data_flag;
    }

    public void setData_flag(String data_flag) {
        this.data_flag = data_flag;
    }
    @Column
    public BigDecimal getHandle_type() {
        return handle_type;
    }

    public void setHandle_type(BigDecimal handle_type) {
        this.handle_type = handle_type;
    }
}
