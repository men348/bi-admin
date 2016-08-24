package com.chinadaas.platform.bi.server.ententity;

import com.chinadaas.platform.bi.model.dto.EnterpriseBaseInfoDTO;
import com.chinadaas.platform.common.util.BeanUtil;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

/**
 * Created by xie on 16/8/5.
 */

@Entity
@Table(name = "ENTERPRISEBASEINFOCOLLECT")
public class EnterpriseBasic {

    private String pripid;              //主体身份代码
    private String s_ext_nodenum;       //省份代码
    private String entname;             //企业名称
    private String oriregno;            //原注册号
    private String regno;               //注册号
    private String enttype;             //企业类型
    private String ppripid;             //隶属企业主体身份代码
    private String pentname;            //隶属企业机构名称
    private String pregno;              //隶属企业注册号
    private String hypotaxis;           //隶属关系
    private String industryphy;         //行业门类
    private String industryco;          //行业代码
    private String abuitem;             //许可经营项目
    private String cbuitem;             //一般经营项目
    private Date opfrom;                //经营期限自
    private Date opto;                  //经营期限至
    private String postalcode;          //邮政编码
    private String tel;                 //联系电话
    private String email;               //电子邮箱
    private String localadm;            //属地监管工商所
    private String credlevel;           //信用等级
    private Date assdate;               //信用等级评定日期
    private Date esdate;                //城里日期
    private Date apprdate;              //核准日期
    private String regorg;              //等级机关
    private String entcat;              //企业分类码
    private String entstatus;           //企业状态
    private BigDecimal regcap;          //注册资金
    private String opscope;             //经营范围
    private String opform;              //经营方式
    private String opscoandform;        //经营范围及方式
    private String ptbusscope;          //兼营范围
    private String domdistrict;         //住所所在行政区划
    private String dom;                 //住所
    private String ecotecdevzone;       //住所所在经济开发区
    private String domproright;         //住所产权
    private String oplocdistrict;       //经营产所所在行政区划
    private String oploc;               //经营产所
    private BigDecimal reccap;          //实收资本(万元)
    private String insform;             //设立方式
    private BigDecimal parnum;          //合伙人数
    private String parform;             //合伙方式
    private BigDecimal exenum;          //执行人数
    private BigDecimal empnum;          //从业人数
    private String sconform;            //出资方式或组成形式
    private String forcapindcode;       //外资产业代码
    private String midpreindcode;       //中西部优势产业代码
    private String protype;             //项目类型
    private BigDecimal congro;          //投资总额(万元)
    private String congrocur;           //投资总额币种
    private BigDecimal congrousd;       //投资总额折万美元
    private BigDecimal regcapusd;       //注册资本折万美元
    private String regcapcur;           //注册资本币种
    private BigDecimal regcaprmb;       //注册资本折万人民币
    private String forregcapcur;        //外方注册资本币种
    private BigDecimal forregcapusd;    //外方注册资本折万美元
    private BigDecimal forreccapusd;    //外方实收资本折万美元
    private BigDecimal worcap;          //营运资金
    private Date chamecdate;            //转型日期
    private String opracttype;          //活动经营类型
    private String forentname;          //外国企业名称
    private String depincha;            //主管部门
    private String country;             //国别
    private String itemofoporcpro;      //承包工程或经营管理项目
    private String conofcontrpro;       //承包工程或经营管理内容
    private String fordom;              //境外住所
    private BigDecimal forregecap;      //境外注册资本
    private String foropscope;          //境外经营范围
    private String s_ext_entproperty;   //企业性质
    private Timestamp s_ext_timestamp;
    private String s_ext_batch;
    private String s_ext_sequence;
    private String s_ext_validflag;
    private String s_ext_induscat;
    private String s_ext_enttype;
    private String manacate;
    private BigDecimal limparnum;
    private String foreignbodytype;
    private String person_id;
    private String name;
    private String certype;
    private String cerno;
    private String ancheyear;
    private Date candate;
    private Date revdate;
    private String entname_old;
    private String credit_code;
    private String jobid;
    private BigDecimal is_new;
    private String countrydisplay;
    private String statusdisplay;
    private String typedisplay;
    private String regorgdisplay;
    private String regcapcurdisplay;
    private String entid;
    private BigDecimal handle_type;

    public EnterpriseBaseInfoDTO toDto() {
        return BeanUtil.propertiesCopy(this, EnterpriseBaseInfoDTO.class);
    }


    @Id
    public String getPripid() {
        return pripid;
    }

    public void setPripid(String pripid) {
        this.pripid = pripid;
    }
    @Column
    public String getS_ext_nodenum() {
        return s_ext_nodenum;
    }

    public void setS_ext_nodenum(String s_ext_nodenum) {
        this.s_ext_nodenum = s_ext_nodenum;
    }
    @Column
    public String getEntname() {
        return entname;
    }

    public void setEntname(String entname) {
        this.entname = entname;
    }
    @Column
    public String getOriregno() {
        return oriregno;
    }

    public void setOriregno(String oriregno) {
        this.oriregno = oriregno;
    }
    @Column
    public String getRegno() {
        return regno;
    }

    public void setRegno(String regno) {
        this.regno = regno;
    }
    @Column
    public String getEnttype() {
        return enttype;
    }

    public void setEnttype(String enttype) {
        this.enttype = enttype;
    }
    @Column
    public String getPpripid() {
        return ppripid;
    }

    public void setPpripid(String ppripid) {
        this.ppripid = ppripid;
    }
    @Column
    public String getPentname() {
        return pentname;
    }

    public void setPentname(String pentname) {
        this.pentname = pentname;
    }
    @Column
    public String getPregno() {
        return pregno;
    }

    public void setPregno(String pregno) {
        this.pregno = pregno;
    }
    @Column
    public String getHypotaxis() {
        return hypotaxis;
    }

    public void setHypotaxis(String hypotaxis) {
        this.hypotaxis = hypotaxis;
    }
    @Column
    public String getIndustryphy() {
        return industryphy;
    }

    public void setIndustryphy(String industryphy) {
        this.industryphy = industryphy;
    }
    @Column
    public String getIndustryco() {
        return industryco;
    }

    public void setIndustryco(String industryco) {
        this.industryco = industryco;
    }
    @Column
    public String getAbuitem() {
        return abuitem;
    }

    public void setAbuitem(String abuitem) {
        this.abuitem = abuitem;
    }
    @Column
    public String getCbuitem() {
        return cbuitem;
    }

    public void setCbuitem(String cbuitem) {
        this.cbuitem = cbuitem;
    }
    @Column
    public Date getOpfrom() {
        return opfrom;
    }

    public void setOpfrom(Date opfrom) {
        this.opfrom = opfrom;
    }
    @Column
    public Date getOpto() {
        return opto;
    }

    public void setOpto(Date opto) {
        this.opto = opto;
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
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    @Column
    public String getLocaladm() {
        return localadm;
    }

    public void setLocaladm(String localadm) {
        this.localadm = localadm;
    }
    @Column
    public String getCredlevel() {
        return credlevel;
    }

    public void setCredlevel(String credlevel) {
        this.credlevel = credlevel;
    }
    @Column
    public Date getAssdate() {
        return assdate;
    }

    public void setAssdate(Date assdate) {
        this.assdate = assdate;
    }
    @Column
    public Date getEsdate() {
        return esdate;
    }

    public void setEsdate(Date esdate) {
        this.esdate = esdate;
    }
    @Column
    public Date getApprdate() {
        return apprdate;
    }

    public void setApprdate(Date apprdate) {
        this.apprdate = apprdate;
    }
    @Column
    public String getRegorg() {
        return regorg;
    }

    public void setRegorg(String regorg) {
        this.regorg = regorg;
    }
    @Column
    public String getEntcat() {
        return entcat;
    }

    public void setEntcat(String entcat) {
        this.entcat = entcat;
    }
    @Column
    public String getEntstatus() {
        return entstatus;
    }

    public void setEntstatus(String entstatus) {
        this.entstatus = entstatus;
    }
    @Column
    public BigDecimal getRegcap() {
        return regcap;
    }

    public void setRegcap(BigDecimal regcap) {
        this.regcap = regcap;
    }
    @Column
    public String getOpscope() {
        return opscope;
    }

    public void setOpscope(String opscope) {
        this.opscope = opscope;
    }
    @Column
    public String getOpform() {
        return opform;
    }

    public void setOpform(String opform) {
        this.opform = opform;
    }
    @Column
    public String getOpscoandform() {
        return opscoandform;
    }

    public void setOpscoandform(String opscoandform) {
        this.opscoandform = opscoandform;
    }
    @Column
    public String getPtbusscope() {
        return ptbusscope;
    }

    public void setPtbusscope(String ptbusscope) {
        this.ptbusscope = ptbusscope;
    }
    @Column
    public String getDomdistrict() {
        return domdistrict;
    }

    public void setDomdistrict(String domdistrict) {
        this.domdistrict = domdistrict;
    }
    @Column
    public String getDom() {
        return dom;
    }

    public void setDom(String dom) {
        this.dom = dom;
    }
    @Column
    public String getEcotecdevzone() {
        return ecotecdevzone;
    }

    public void setEcotecdevzone(String ecotecdevzone) {
        this.ecotecdevzone = ecotecdevzone;
    }
    @Column
    public String getDomproright() {
        return domproright;
    }

    public void setDomproright(String domproright) {
        this.domproright = domproright;
    }
    @Column
    public String getOplocdistrict() {
        return oplocdistrict;
    }

    public void setOplocdistrict(String oplocdistrict) {
        this.oplocdistrict = oplocdistrict;
    }
    @Column
    public String getOploc() {
        return oploc;
    }

    public void setOploc(String oploc) {
        this.oploc = oploc;
    }
    @Column
    public BigDecimal getReccap() {
        return reccap;
    }

    public void setReccap(BigDecimal reccap) {
        this.reccap = reccap;
    }
    @Column
    public String getInsform() {
        return insform;
    }

    public void setInsform(String insform) {
        this.insform = insform;
    }
    @Column
    public BigDecimal getParnum() {
        return parnum;
    }

    public void setParnum(BigDecimal parnum) {
        this.parnum = parnum;
    }
    @Column
    public String getParform() {
        return parform;
    }

    public void setParform(String parform) {
        this.parform = parform;
    }
    @Column
    public BigDecimal getExenum() {
        return exenum;
    }

    public void setExenum(BigDecimal exenum) {
        this.exenum = exenum;
    }
    @Column
    public BigDecimal getEmpnum() {
        return empnum;
    }

    public void setEmpnum(BigDecimal empnum) {
        this.empnum = empnum;
    }
    @Column
    public String getSconform() {
        return sconform;
    }

    public void setSconform(String sconform) {
        this.sconform = sconform;
    }
    @Column
    public String getForcapindcode() {
        return forcapindcode;
    }

    public void setForcapindcode(String forcapindcode) {
        this.forcapindcode = forcapindcode;
    }
    @Column
    public String getMidpreindcode() {
        return midpreindcode;
    }

    public void setMidpreindcode(String midpreindcode) {
        this.midpreindcode = midpreindcode;
    }
    @Column
    public String getProtype() {
        return protype;
    }

    public void setProtype(String protype) {
        this.protype = protype;
    }
    @Column
    public BigDecimal getCongro() {
        return congro;
    }

    public void setCongro(BigDecimal congro) {
        this.congro = congro;
    }
    @Column
    public String getCongrocur() {
        return congrocur;
    }

    public void setCongrocur(String congrocur) {
        this.congrocur = congrocur;
    }
    @Column
    public BigDecimal getCongrousd() {
        return congrousd;
    }

    public void setCongrousd(BigDecimal congrousd) {
        this.congrousd = congrousd;
    }
    @Column
    public BigDecimal getRegcapusd() {
        return regcapusd;
    }

    public void setRegcapusd(BigDecimal regcapusd) {
        this.regcapusd = regcapusd;
    }
    @Column
    public String getRegcapcur() {
        return regcapcur;
    }

    public void setRegcapcur(String regcapcur) {
        this.regcapcur = regcapcur;
    }
    @Column
    public BigDecimal getRegcaprmb() {
        return regcaprmb;
    }

    public void setRegcaprmb(BigDecimal regcaprmb) {
        this.regcaprmb = regcaprmb;
    }
    @Column
    public String getForregcapcur() {
        return forregcapcur;
    }

    public void setForregcapcur(String forregcapcur) {
        this.forregcapcur = forregcapcur;
    }
    @Column
    public BigDecimal getForregcapusd() {
        return forregcapusd;
    }

    public void setForregcapusd(BigDecimal forregcapusd) {
        this.forregcapusd = forregcapusd;
    }
    @Column
    public BigDecimal getForreccapusd() {
        return forreccapusd;
    }

    public void setForreccapusd(BigDecimal forreccapusd) {
        this.forreccapusd = forreccapusd;
    }
    @Column
    public BigDecimal getWorcap() {
        return worcap;
    }

    public void setWorcap(BigDecimal worcap) {
        this.worcap = worcap;
    }
    @Column
    public Date getChamecdate() {
        return chamecdate;
    }

    public void setChamecdate(Date chamecdate) {
        this.chamecdate = chamecdate;
    }
    @Column
    public String getOpracttype() {
        return opracttype;
    }

    public void setOpracttype(String opracttype) {
        this.opracttype = opracttype;
    }
    @Column
    public String getForentname() {
        return forentname;
    }

    public void setForentname(String forentname) {
        this.forentname = forentname;
    }
    @Column
    public String getDepincha() {
        return depincha;
    }

    public void setDepincha(String depincha) {
        this.depincha = depincha;
    }
    @Column
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    @Column
    public String getItemofoporcpro() {
        return itemofoporcpro;
    }

    public void setItemofoporcpro(String itemofoporcpro) {
        this.itemofoporcpro = itemofoporcpro;
    }
    @Column
    public String getConofcontrpro() {
        return conofcontrpro;
    }

    public void setConofcontrpro(String conofcontrpro) {
        this.conofcontrpro = conofcontrpro;
    }
    @Column
    public String getFordom() {
        return fordom;
    }

    public void setFordom(String fordom) {
        this.fordom = fordom;
    }
    @Column
    public BigDecimal getForregecap() {
        return forregecap;
    }

    public void setForregecap(BigDecimal forregecap) {
        this.forregecap = forregecap;
    }
    @Column
    public String getForopscope() {
        return foropscope;
    }

    public void setForopscope(String foropscope) {
        this.foropscope = foropscope;
    }
    @Column
    public String getS_ext_entproperty() {
        return s_ext_entproperty;
    }

    public void setS_ext_entproperty(String s_ext_entproperty) {
        this.s_ext_entproperty = s_ext_entproperty;
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
    public String getS_ext_induscat() {
        return s_ext_induscat;
    }

    public void setS_ext_induscat(String s_ext_induscat) {
        this.s_ext_induscat = s_ext_induscat;
    }
    @Column
    public String getS_ext_enttype() {
        return s_ext_enttype;
    }

    public void setS_ext_enttype(String s_ext_enttype) {
        this.s_ext_enttype = s_ext_enttype;
    }
    @Column
    public String getManacate() {
        return manacate;
    }

    public void setManacate(String manacate) {
        this.manacate = manacate;
    }
    @Column
    public BigDecimal getLimparnum() {
        return limparnum;
    }

    public void setLimparnum(BigDecimal limparnum) {
        this.limparnum = limparnum;
    }
    @Column
    public String getForeignbodytype() {
        return foreignbodytype;
    }

    public void setForeignbodytype(String foreignbodytype) {
        this.foreignbodytype = foreignbodytype;
    }
    @Column
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
    @Column
    public String getCerno() {
        return cerno;
    }

    public void setCerno(String cerno) {
        this.cerno = cerno;
    }
    @Column
    public String getAncheyear() {
        return ancheyear;
    }

    public void setAncheyear(String ancheyear) {
        this.ancheyear = ancheyear;
    }
    @Column
    public Date getCandate() {
        return candate;
    }

    public void setCandate(Date candate) {
        this.candate = candate;
    }
    @Column
    public Date getRevdate() {
        return revdate;
    }

    public void setRevdate(Date revdate) {
        this.revdate = revdate;
    }
    @Column
    public String getEntname_old() {
        return entname_old;
    }

    public void setEntname_old(String entname_old) {
        this.entname_old = entname_old;
    }
    @Column
    public String getCredit_code() {
        return credit_code;
    }

    public void setCredit_code(String credit_code) {
        this.credit_code = credit_code;
    }
    @Column
    public String getJobid() {
        return jobid;
    }

    public void setJobid(String jobid) {
        this.jobid = jobid;
    }
    @Column
    public BigDecimal getIs_new() {
        return is_new;
    }

    public void setIs_new(BigDecimal is_new) {
        this.is_new = is_new;
    }
    @Column
    public String getCountrydisplay() {
        return countrydisplay;
    }

    public void setCountrydisplay(String countrydisplay) {
        this.countrydisplay = countrydisplay;
    }
    @Column
    public String getStatusdisplay() {
        return statusdisplay;
    }

    public void setStatusdisplay(String statusdisplay) {
        this.statusdisplay = statusdisplay;
    }
    @Column
    public String getTypedisplay() {
        return typedisplay;
    }

    public void setTypedisplay(String typedisplay) {
        this.typedisplay = typedisplay;
    }
    @Column
    public String getRegorgdisplay() {
        return regorgdisplay;
    }

    public void setRegorgdisplay(String regorgdisplay) {
        this.regorgdisplay = regorgdisplay;
    }
    @Column
    public String getRegcapcurdisplay() {
        return regcapcurdisplay;
    }

    public void setRegcapcurdisplay(String regcapcurdisplay) {
        this.regcapcurdisplay = regcapcurdisplay;
    }
    @Column
    public String getEntid() {
        return entid;
    }

    public void setEntid(String entid) {
        this.entid = entid;
    }
    @Column
    public BigDecimal getHandle_type() {
        return handle_type;
    }

    public void setHandle_type(BigDecimal handle_type) {
        this.handle_type = handle_type;
    }
}
