package com.chinadaas.platform.bi.server.adapter;

import com.chinadaas.platform.product.resolver.ColumnType;
import com.chinadaas.platform.product.resolver.MetaColumn;
import com.chinadaas.platform.product.resolver.MetaColumnGroup;
import java.util.Date;

/**
 * Created by xie on 16/8/3.
 */
@MetaColumnGroup(name = "企业基本信息", code="BASIC")
public class EnterpriseBasic {

    private String PRIPID;              //主体身份代码
    private String S_EXT_NODENUM;      //省份代码
    private String ENTNAME;             //企业名称
    private String ORIREGNO;            //原注册号
    private String REGNO;               //注册号
    private String ENTTYPE;             //企业类型
    private String PPRIPID;             //隶属企业主体身份代码
    private String PENTNAME;            //隶属企业机构名称
    private String PREGNO;              //隶属企业注册号
    private String HYPOTAXIS;           //隶属关系
    private String INDUSTRYPHY;         //行业门类
    private String INDUSTRYCO;          //行业代码
    private String ABUITEM;             //许可经营项目
    private String CBUITEM;             //一般经营项目
    private String OPFROM;              //经营期限自
    private String OPTO;                //经营期限至
    private String POSTALCODE;         //邮政编码
    private String TEL;                 //联系电话
    private String EMAIL;               //电子邮箱
    private String LOCALADM;            //属地监管工商所
    private String CREDLEVEL;           //信用等级
    private String ASSDATE;             //信用等级评定日期
    private String ESDATE;              //城里日期
    private String APPRDATE;            //核准日期
    private String REGORG;              //等级机关
    private String ENTCAT;              //企业分类码
    private String ENTSTATUS;           //企业状态
    private String REGCAP;              //注册资金
    private String OPSCOPE;             //经营范围
    private String OPFORM;              //经营方式
    private String OPSCOANDFORM;        //经营范围及方式
    private String PTBUSSCOPE;          //兼营范围
    private String DOMDISTRICT;         //住所所在行政区划
    private String DOM;                 //住所
    private String ECOTECDEVZONE;       //住所所在经济开发区
    private String DOMPPRORIGHT;        //住所产权
    private String OPLOCDISTRICT;       //经营产所所在行政区划
    private String OPLOC;               //经营产所
    private String RECCAP;              //实收资本(万元)
    private String INSFORM;             //设立方式
    private String PARNUM;              //合伙人数
    private String PARFORM;             //合伙方式
    private String EXENUM;              //执行人数
    private String EMPNUM;              //从业人数
    private String SCONFORM;            //出资方式或组成形式
    private String FORCAPINDCODE;       //外资产业代码
    private String MIDPREINDCODE;       //中西部优势产业代码
    private String PROTYPE;             //项目类型
    private String CONGRO;              //投资总额(万元)
    private String CONGROCUR;           //投资总额币种
    private String CONGROUSD;           //投资总额折万美元
    private String REGCAPUSD;           //注册资本折万美元
    private String REGCAPCUR;           //注册资本币种
    private String REGCAPRMB;           //注册资本折万人民币
    private String FORREGCAPCUR;        //外方注册资本币种
    private String FORREGCAPUSD;        //外方注册资本折万美元
    private String FORRECCAPUSD;        //外方实收资本折万美元
    private String WORCAP;              //营运资金
    private String CHAMECDATE;          //转型日期
    private String OPRACTTYPE;          //活动经营类型
    private String FORENTNAME;          //外国企业名称
    private String DEPINCHA;            //主管部门
    private String COUNTRY;             //国别
    private String ITEMOFOPORCPRO;      //承包工程或经营管理项目
    private String CONOFCONTRPRO;       //承包工程或经营管理内容
    private String FORDOM;              //境外住所
    private String FORREGECAP;          //境外注册资本
    private String FOROPSCOPE;          //境外经营范围
    private String S_EXT_ENTPROPERTY;   //企业性质
    private String S_EXT_TIMESTAMP;
    private String S_EXT_BATCH;
    private String S_EXT_SEQUENCE;
    private String S_EXT_VALIDFLAG;
    private String S_EXT_INDUSCAT;
    private String S_EXT_ENTTYPE;
    private String MANACATE;
    private String LIMPARNUM;
    private String FOREIGNBODYTYPE;
    private String PERSON_ID;
    private String NAME;
    private String CERTYPE;
    private String CERNO;
    private String ANCHEYEAR;
    private String CANDATE;
    private String REVDATE;
    private String ENTNAME_OLD;
    private String CREDIT_CODE;
    private String JOBID;
    private String IS_NEW;
    private String COUNTRYDISPLAY;
    private String STATUSDISPLAY;
    private String TYPEDISPLAY;
    private String REGORGDISPLAY;
    private String REGCAPCURDISPLAY;
    private String ENTID;
    private String HANDLE_TYPE;

    @MetaColumn(name = "主体身份代码", code = "PRIPID", length = 36)
    public String getPRIPID() {
        return PRIPID;
    }

    public void setPRIPID(String PRIPID) {
        this.PRIPID = PRIPID;
    }

    @MetaColumn(name = "省份代码", code = "EXT_NODENUM", length = 40)
    public String getS_EXT_NODENUM() {
        return S_EXT_NODENUM;
    }

    public void setS_EXT_NODENUM(String S_EXT_NODENUM) {
        this.S_EXT_NODENUM = S_EXT_NODENUM;
    }

    @MetaColumn(name = "企业名称", code = "ENTNAME", length = 2000)
    public String getENTNAME() {
        return ENTNAME;
    }

    public void setENTNAME(String ENTNAME) {
        this.ENTNAME = ENTNAME;
    }

    @MetaColumn(name = "原注册号", code = "ORIREGNO", length = 200)
    public String getORIREGNO() {
        return ORIREGNO;
    }

    public void setORIREGNO(String ORIREGNO) {
        this.ORIREGNO = ORIREGNO;
    }

    @MetaColumn(name = "注册号", code = "REGNO", length = 50)
    public String getREGNO() {
        return REGNO;
    }

    public void setREGNO(String REGNO) {
        this.REGNO = REGNO;
    }

    @MetaColumn(name = "企业类型", code = "ENTTYPE", length = 200)
    public String getENTTYPE() {
        return ENTTYPE;
    }

    public void setENTTYPE(String ENTTYPE) {
        this.ENTTYPE = ENTTYPE;
    }

    @MetaColumn(name = "隶属企业主体身份代码", code = "PPRIPID", length = 36)
    public String getPPRIPID() {
        return PPRIPID;
    }

    public void setPPRIPID(String PPRIPID) {
        this.PPRIPID = PPRIPID;
    }

    @MetaColumn(name = "隶属企业名称", code = "PENTNAME", length = 200)
    public String getPENTNAME() {
        return PENTNAME;
    }

    public void setPENTNAME(String PENTNAME) {
        this.PENTNAME = PENTNAME;
    }

    @MetaColumn(name = "隶属企业注册号", code = "PREGNO", length = 200)
    public String getPREGNO() {
        return PREGNO;
    }

    public void setPREGNO(String PREGNO) {
        this.PREGNO = PREGNO;
    }

    @MetaColumn(name = "隶属关系", code = "HYPOTAXIS", length = 64)
    public String getHYPOTAXIS() {
        return HYPOTAXIS;
    }

    public void setHYPOTAXIS(String HYPOTAXIS) {
        this.HYPOTAXIS = HYPOTAXIS;
    }

    @MetaColumn(name = "行业门类", code = "INDUSTRYPHY", length = 64)
    public String getINDUSTRYPHY() {
        return INDUSTRYPHY;
    }

    public void setINDUSTRYPHY(String INDUSTRYPHY) {
        this.INDUSTRYPHY = INDUSTRYPHY;
    }

    @MetaColumn(name = "行业代码", code = "INDUSTRYCO", length = 64)
    public String getINDUSTRYCO() {
        return INDUSTRYCO;
    }

    public void setINDUSTRYCO(String INDUSTRYCO) {
        this.INDUSTRYCO = INDUSTRYCO;
    }

    @MetaColumn(name = "许可经营项目", code = "ABUITEM", length = 4000)
    public String getABUITEM() {
        return ABUITEM;
    }

    public void setABUITEM(String ABUITEM) {
        this.ABUITEM = ABUITEM;
    }

    @MetaColumn(name = "一般经营项目", code = "CBUITEM", length = 4000)
    public String getCBUITEM() {
        return CBUITEM;
    }

    public void setCBUITEM(String CBUITEM) {
        this.CBUITEM = CBUITEM;
    }

    @MetaColumn(name = "经营期限至", code = "OPFROM", type = ColumnType.DATE)
    public String getOPFROM() {
        return OPFROM;
    }

    public void setOPFROM(String OPFROM) {
        this.OPFROM = OPFROM;
    }

    @MetaColumn(name = "经营期限至", code = "OPTO", type = ColumnType.DATE)
    public String getOPTO() {
        return OPTO;
    }

    public void setOPTO(String OPTO) {
        this.OPTO = OPTO;
    }

    @MetaColumn(name = "邮政编码", code = "POSTALCODE", length = 200)
    public String getPOSTALCODE() {
        return POSTALCODE;
    }

    public void setPOSTALCODE(String POSTALCODE) {
        this.POSTALCODE = POSTALCODE;
    }

    @MetaColumn(name = "联系电话", code = "TEL", length = 200)
    public String getTEL() {
        return TEL;
    }

    public void setTEL(String TEL) {
        this.TEL = TEL;
    }

    @MetaColumn(name = "电子邮箱", code = "EMAIL", length = 100)
    public String getEMAIL() {
        return EMAIL;
    }

    public void setEMAIL(String EMAIL) {
        this.EMAIL = EMAIL;
    }

    @MetaColumn(name = "属地监管工商所", code = "LOCALLADM", length = 64)
    public String getLOCALADM() {
        return LOCALADM;
    }

    public void setLOCALADM(String LOCALADM) {
        this.LOCALADM = LOCALADM;
    }

    @MetaColumn(name = "信用等级", code = "CREDLEVEL", length = 64)
    public String getCREDLEVEL() {
        return CREDLEVEL;
    }

    public void setCREDLEVEL(String CREDLEVEL) {
        this.CREDLEVEL = CREDLEVEL;
    }

    @MetaColumn(name = "分类日期", code = "ASSDATE", type = ColumnType.DATE)
    public String getASSDATE() {
        return ASSDATE;
    }

    public void setASSDATE(String ASSDATE) {
        this.ASSDATE = ASSDATE;
    }

    @MetaColumn(name = "成立日期", code = "ESDATE", type = ColumnType.DATE)
    public String getESDATE() {
        return ESDATE;
    }

    public void setESDATE(String ESDATE) {
        this.ESDATE = ESDATE;
    }

    @MetaColumn(name = "核准日期", code = "APPRDATE", type = ColumnType.DATE)
    public String getAPPRDATE() {
        return APPRDATE;
    }

    public void setAPPRDATE(String APPRDATE) {
        this.APPRDATE = APPRDATE;
    }

    @MetaColumn(name = "登记机关", code = "REGORG", length = 4000)
    public String getREGORG() {
        return REGORG;
    }

    public void setREGORG(String REGORG) {
        this.REGORG = REGORG;
    }

    @MetaColumn(name = "企业分类码", code = "ENTCAT", length = 64)
    public String getENTCAT() {
        return ENTCAT;
    }

    public void setENTCAT(String ENTCAT) {
        this.ENTCAT = ENTCAT;
    }

    @MetaColumn(name = "企业状态", code = "ENTSTATUS", length = 64)
    public String getENTSTATUS() {
        return ENTSTATUS;
    }

    public void setENTSTATUS(String ENTSTATUS) {
        this.ENTSTATUS = ENTSTATUS;
    }

    @MetaColumn(name = "注册资金", code = "REGCAP", type = ColumnType.NUMBER)
    public String getREGCAP() {
        return REGCAP;
    }

    public void setREGCAP(String REGCAP) {
        this.REGCAP = REGCAP;
    }

    @MetaColumn(name = "经营范围", code = "OPSCOPE", length = 4000)
    public String getOPSCOPE() {
        return OPSCOPE;
    }

    public void setOPSCOPE(String OPSCOPE) {
        this.OPSCOPE = OPSCOPE;
    }

    @MetaColumn(name = "经营方式", code = "OPFORM", length = 1000)
    public String getOPFORM() {
        return OPFORM;
    }

    public void setOPFORM(String OPFORM) {
        this.OPFORM = OPFORM;
    }

    @MetaColumn(name = "经营方式和范围", code = "OPSCOANDFORM", length = 4000)
    public String getOPSCOANDFORM() {
        return OPSCOANDFORM;
    }

    public void setOPSCOANDFORM(String OPSCOANDFORM) {
        this.OPSCOANDFORM = OPSCOANDFORM;
    }

    @MetaColumn(name = "兼营范围", code = "PTBUSSCOPE", length = 2000)
    public String getPTBUSSCOPE() {
        return PTBUSSCOPE;
    }

    public void setPTBUSSCOPE(String PTBUSSCOPE) {
        this.PTBUSSCOPE = PTBUSSCOPE;
    }

    @MetaColumn(name = "住所所在行政区划", code = "DOMDISTRICT", length = 64)
    public String getDOMDISTRICT() {
        return DOMDISTRICT;
    }

    public void setDOMDISTRICT(String DOMDISTRICT) {
        this.DOMDISTRICT = DOMDISTRICT;
    }

    @MetaColumn(name = "住所", code = "DOM", length = 4000)
    public String getDOM() {
        return DOM;
    }

    public void setDOM(String DOM) {
        this.DOM = DOM;
    }

    @MetaColumn(name = "住所所在经济开发区", code = "ECOTECDEVZONE", length = 64)
    public String getECOTECDEVZONE() {
        return ECOTECDEVZONE;
    }

    public void setECOTECDEVZONE(String ECOTECDEVZONE) {
        this.ECOTECDEVZONE = ECOTECDEVZONE;
    }

    @MetaColumn(name = "住所产权", code = "DOMPPRORIGHT", length = 200)
    public String getDOMPPRORIGHT() {
        return DOMPPRORIGHT;
    }

    public void setDOMPPRORIGHT(String DOMPPRORIGHT) {
        this.DOMPPRORIGHT = DOMPPRORIGHT;
    }

    @MetaColumn(name = "经营产所所在行政区划", code = "OPLOCDISTRICT", length = 64)
    public String getOPLOCDISTRICT() {
        return OPLOCDISTRICT;
    }

    public void setOPLOCDISTRICT(String OPLOCDISTRICT) {
        this.OPLOCDISTRICT = OPLOCDISTRICT;
    }

    @MetaColumn(name = "经营产所", code = "OPLOC", length = 600)
    public String getOPLOC() {
        return OPLOC;
    }

    public void setOPLOC(String OPLOC) {
        this.OPLOC = OPLOC;
    }

    @MetaColumn(name = "实收资本", code = "RECCAP", type = ColumnType.NUMBER)
    public String getRECCAP() {
        return RECCAP;
    }

    public void setRECCAP(String RECCAP) {
        this.RECCAP = RECCAP;
    }

    @MetaColumn(name = "设立方式", code = "INSFORM", length = 64)
    public String getINSFORM() {
        return INSFORM;
    }

    public void setINSFORM(String INSFORM) {
        this.INSFORM = INSFORM;
    }

    @MetaColumn(name = "合伙人数", code = "PARNUM", type = ColumnType.NUMBER)
    public String getPARNUM() {
        return PARNUM;
    }

    public void setPARNUM(String PARNUM) {
        this.PARNUM = PARNUM;
    }

    @MetaColumn(name = "合伙方式", code = "PARFORM", length = 64)
    public String getPARFORM() {
        return PARFORM;
    }

    public void setPARFORM(String PARFORM) {
        this.PARFORM = PARFORM;
    }

    @MetaColumn(name = "执行人数", code = "EXENUM", type = ColumnType.NUMBER)
    public String getEXENUM() {
        return EXENUM;
    }

    public void setEXENUM(String EXENUM) {
        this.EXENUM = EXENUM;
    }

    @MetaColumn(name = "从业人数", code = "EMPNUM", type = ColumnType.NUMBER)
    public String getEMPNUM() {
        return EMPNUM;
    }

    public void setEMPNUM(String EMPNUM) {
        this.EMPNUM = EMPNUM;
    }

    @MetaColumn(name = "执行人数", code = "SCONFORM", length = 64)
    public String getSCONFORM() {
        return SCONFORM;
    }

    public void setSCONFORM(String SCONFORM) {
        this.SCONFORM = SCONFORM;
    }

    @MetaColumn(name = "外资产业代码", code = "FORCAPINDCODE", length = 64)
    public String getFORCAPINDCODE() {
        return FORCAPINDCODE;
    }

    public void setFORCAPINDCODE(String FORCAPINDCODE) {
        this.FORCAPINDCODE = FORCAPINDCODE;
    }

    @MetaColumn(name = "中西部优势产业代码", code = "MIDPREINDCODE", length = 64)
    public String getMIDPREINDCODE() {
        return MIDPREINDCODE;
    }

    public void setMIDPREINDCODE(String MIDPREINDCODE) {
        this.MIDPREINDCODE = MIDPREINDCODE;
    }

    @MetaColumn(name = "项目类型", code = "PROTYPE", length = 64)
    public String getPROTYPE() {
        return PROTYPE;
    }

    public void setPROTYPE(String PROTYPE) {
        this.PROTYPE = PROTYPE;
    }

    @MetaColumn(name = "投资总额", code = "CONGRO", type = ColumnType.NUMBER)
    public String getCONGRO() {
        return CONGRO;
    }

    public void setCONGRO(String CONGRO) {
        this.CONGRO = CONGRO;
    }

    @MetaColumn(name = "投资总额币种", code = "CONGROCUR", length = 64)
    public String getCONGROCUR() {
        return CONGROCUR;
    }

    public void setCONGROCUR(String CONGROCUR) {
        this.CONGROCUR = CONGROCUR;
    }

    @MetaColumn(name = "投资总额折万美元", code = "CONGROUSD", type = ColumnType.NUMBER)
    public String getCONGROUSD() {
        return CONGROUSD;
    }

    public void setCONGROUSD(String CONGROUSD) {
        this.CONGROUSD = CONGROUSD;
    }

    @MetaColumn(name = "注册资本折万美元", code = "REGCAPUSD", type = ColumnType.NUMBER)
    public String getREGCAPUSD() {
        return REGCAPUSD;
    }

    public void setREGCAPUSD(String REGCAPUSD) {
        this.REGCAPUSD = REGCAPUSD;
    }

    @MetaColumn(name = "注册资本币种", code = "REGCAPCUR", length = 64)
    public String getREGCAPCUR() {
        return REGCAPCUR;
    }

    public void setREGCAPCUR(String REGCAPCUR) {
        this.REGCAPCUR = REGCAPCUR;
    }

    @MetaColumn(name = "注册资本折万人民币", code = "REGCAPRMB", type = ColumnType.NUMBER)
    public String getREGCAPRMB() {
        return REGCAPRMB;
    }

    public void setREGCAPRMB(String REGCAPRMB) {
        this.REGCAPRMB = REGCAPRMB;
    }

    @MetaColumn(name = "外方注册资本币种", code = "FORREGCAPCUR", length = 64)
    public String getFORREGCAPCUR() {
        return FORREGCAPCUR;
    }

    public void setFORREGCAPCUR(String FORREGCAPCUR) {
        this.FORREGCAPCUR = FORREGCAPCUR;
    }

    @MetaColumn(name = "外方注册资本折万美元", code = "FORREGCAPUSD", type  = ColumnType.NUMBER)
    public String getFORREGCAPUSD() {
        return FORREGCAPUSD;
    }

    public void setFORREGCAPUSD(String FORREGCAPUSD) {
        this.FORREGCAPUSD = FORREGCAPUSD;
    }

    @MetaColumn(name = "外方实收资本折万美元", code = "FORRECCAPUSD", type = ColumnType.NUMBER )
    public String getFORRECCAPUSD() {
        return FORRECCAPUSD;
    }

    public void setFORRECCAPUSD(String FORRECCAPUSD) {
        this.FORRECCAPUSD = FORRECCAPUSD;
    }

    @MetaColumn(name = "营运资金", code = "WORCAP", type = ColumnType.NUMBER)
    public String getWORCAP() {
        return WORCAP;
    }

    public void setWORCAP(String WORCAP) {
        this.WORCAP = WORCAP;
    }

    @MetaColumn(name = "转行日期", code = "CHAMEDATE", type = ColumnType.DATE)
    public String getCHAMECDATE() {
        return CHAMECDATE;
    }

    public void setCHAMECDATE(String CHAMECDATE) {
        this.CHAMECDATE = CHAMECDATE;
    }

    @MetaColumn(name = "经营活动类型", code = "OPRACTTYPE", length = 64)
    public String getOPRACTTYPE() {
        return OPRACTTYPE;
    }

    public void setOPRACTTYPE(String OPRACTTYPE) {
        this.OPRACTTYPE = OPRACTTYPE;
    }

    @MetaColumn(name = "外国企业名称", code = "FORENTNAME", length = 200)
    public String getFORENTNAME() {
        return FORENTNAME;
    }

    public void setFORENTNAME(String FORENTNAME) {
        this.FORENTNAME = FORENTNAME;
    }

    @MetaColumn(name = "主管部门", code = "DEPINCHA", length = 4000)
    public String getDEPINCHA() {
        return DEPINCHA;
    }

    public void setDEPINCHA(String DEPINCHA) {
        this.DEPINCHA = DEPINCHA;
    }

    @MetaColumn(name = "国别", code = "COUNTRY", length = 128)
    public String getCOUNTRY() {
        return COUNTRY;
    }

    public void setCOUNTRY(String COUNTRY) {
        this.COUNTRY = COUNTRY;
    }

    @MetaColumn(name = "承包工程或经营管理项目", code = "ITEMMOFOPORCPRO", length = 512)
    public String getITEMOFOPORCPRO() {
        return ITEMOFOPORCPRO;
    }

    public void setITEMOFOPORCPRO(String ITEMOFOPORCPRO) {
        this.ITEMOFOPORCPRO = ITEMOFOPORCPRO;
    }

    @MetaColumn(name = "承包工程或经营管理内容", code = "CONOFCONTRPRO", length = 3000)
    public String getCONOFCONTRPRO() {
        return CONOFCONTRPRO;
    }

    public void setCONOFCONTRPRO(String CONOFCONTRPRO) {
        this.CONOFCONTRPRO = CONOFCONTRPRO;
    }

    @MetaColumn(name = "境外住所", code = "FORDOM", length = 200)
    public String getFORDOM() {
        return FORDOM;
    }

    public void setFORDOM(String FORDOM) {
        this.FORDOM = FORDOM;
    }

    @MetaColumn(name = "境外注册资本", code = "FORREGECAP", type = ColumnType.NUMBER)
    public String getFORREGECAP() {
        return FORREGECAP;
    }

    public void setFORREGECAP(String FORREGECAP) {
        this.FORREGECAP = FORREGECAP;
    }

    @MetaColumn(name = "境外经营范围", code = "FOROPSCOPE", length = 1500)
    public String getFOROPSCOPE() {
        return FOROPSCOPE;
    }

    public void setFOROPSCOPE(String FOROPSCOPE) {
        this.FOROPSCOPE = FOROPSCOPE;
    }

    @MetaColumn(name = "企业性质", code = "S_EXT_ENT_PROPERTY", length = 64)
    public String getS_EXT_ENTPROPERTY() {
        return S_EXT_ENTPROPERTY;
    }

    public void setS_EXT_ENTPROPERTY(String S_EXT_ENTPROPERTY) {
        this.S_EXT_ENTPROPERTY = S_EXT_ENTPROPERTY;
    }

    @MetaColumn(name = "企业性质", code = "S_EXT_ENT_PROPERTY", length = 64)
    public String getS_EXT_TIMESTAMP() {
        return S_EXT_TIMESTAMP;
    }

    public void setS_EXT_TIMESTAMP(String S_EXT_TIMESTAMP) {
        this.S_EXT_TIMESTAMP = S_EXT_TIMESTAMP;
    }

    @MetaColumn(name = "入库时间", code = "S_EXT_BATCH", length = 40)
    public String getS_EXT_BATCH() {
        return S_EXT_BATCH;
    }

    public void setS_EXT_BATCH(String S_EXT_BATCH) {
        this.S_EXT_BATCH = S_EXT_BATCH;
    }

    @MetaColumn(name = "入库序列号", code = "S_EXT_SEQUENCE", length = 32)
    public String getS_EXT_SEQUENCE() {
        return S_EXT_SEQUENCE;
    }

    public void setS_EXT_SEQUENCE(String S_EXT_SEQUENCE) {
        this.S_EXT_SEQUENCE = S_EXT_SEQUENCE;
    }

    @MetaColumn(name = "入库合法标签", code = "S_EXT_VALIDFLAG", length = 1)
    public String getS_EXT_VALIDFLAG() {
        return S_EXT_VALIDFLAG;
    }

    public void setS_EXT_VALIDFLAG(String S_EXT_VALIDFLAG) {
        this.S_EXT_VALIDFLAG = S_EXT_VALIDFLAG;
    }

    @MetaColumn(name = "未知", code = "S_EXT_INDUSCAT", length = 64)
    public String getS_EXT_INDUSCAT() {
        return S_EXT_INDUSCAT;
    }

    public void setS_EXT_INDUSCAT(String S_EXT_INDUSCAT) {
        this.S_EXT_INDUSCAT = S_EXT_INDUSCAT;
    }

    @MetaColumn(name = "未知", code = "S_EXT_ENTTYPE", length = 64)
    public String getS_EXT_ENTTYPE() {
        return S_EXT_ENTTYPE;
    }

    public void setS_EXT_ENTTYPE(String S_EXT_ENTTYPE) {
        this.S_EXT_ENTTYPE = S_EXT_ENTTYPE;
    }

    @MetaColumn(name = "经营类型", code = "MANACATE", length = 20)
    public String getMANACATE() {
        return MANACATE;
    }

    public void setMANACATE(String MANACATE) {
        this.MANACATE = MANACATE;
    }

    @MetaColumn(name = "未知", code = "LIMPARNUM", type = ColumnType.NUMBER)
    public String getLIMPARNUM() {
        return LIMPARNUM;
    }

    public void setLIMPARNUM(String LIMPARNUM) {
        this.LIMPARNUM = LIMPARNUM;
    }

    @MetaColumn(name = "境外主体类型", code = "FOREIGNBODYTYPE", length = 200)
    public String getFOREIGNBODYTYPE() {
        return FOREIGNBODYTYPE;
    }

    public void setFOREIGNBODYTYPE(String FOREIGNBODYTYPE) {
        this.FOREIGNBODYTYPE = FOREIGNBODYTYPE;
    }

    @MetaColumn(name = "法人唯一标识", code = "PERSON_ID", length = 60)
    public String getPERSON_ID() {
        return PERSON_ID;
    }

    public void setPERSON_ID(String PERSON_ID) {
        this.PERSON_ID = PERSON_ID;
    }

    @MetaColumn(name = "法人", code = "NAME", length = 2000)
    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    @MetaColumn(name = "证件类型", code = "CERTYPE", length = 20)
    public String getCERTYPE() {
        return CERTYPE;
    }

    public void setCERTYPE(String CERTYPE) {
        this.CERTYPE = CERTYPE;
    }

    @MetaColumn(name = "证件编号", code = "CERNO", length = 50)
    public String getCERNO() {
        return CERNO;
    }

    public void setCERNO(String CERNO) {
        this.CERNO = CERNO;
    }

    @MetaColumn(name = "最后年检年度", code = "ANCHEYEAR", length = 10)
    public String getANCHEYEAR() {
        return ANCHEYEAR;
    }

    public void setANCHEYEAR(String ANCHEYEAR) {
        this.ANCHEYEAR = ANCHEYEAR;
    }

    @MetaColumn(name = "注销日期", code = "CANDATE", type = ColumnType.DATE)
    public String getCANDATE() {
        return CANDATE;
    }

    public void setCANDATE(String CANDATE) {
        this.CANDATE = CANDATE;
    }

    @MetaColumn(name = "吊销日期", code = "REVDATE", type = ColumnType.DATE)
    public String getREVDATE() {
        return REVDATE;
    }

    public void setREVDATE(String REVDATE) {
        this.REVDATE = REVDATE;
    }

    @MetaColumn(name = "企业曾用名", code = "ENTNAME_OLD", length = 200)
    public String getENTNAME_OLD() {
        return ENTNAME_OLD;
    }

    public void setENTNAME_OLD(String ENTNAME_OLD) {
        this.ENTNAME_OLD = ENTNAME_OLD;
    }

    @MetaColumn(name = "统一社会信用代码", code = "CREDIT_CODE", length = 50)
    public String getCREDIT_CODE() {
        return CREDIT_CODE;
    }

    public void setCREDIT_CODE(String CREDIT_CODE) {
        this.CREDIT_CODE = CREDIT_CODE;
    }

    @MetaColumn(name = "任务唯一标识", code = "JOBID", length = 200)
    public String getJOBID() {
        return JOBID;
    }

    public void setJOBID(String JOBID) {
        this.JOBID = JOBID;
    }

    @MetaColumn(name = "是否新企业", code = "IS_NEW", type = ColumnType.NUMBER)
    public String getIS_NEW() {
        return IS_NEW;
    }

    public void setIS_NEW(String IS_NEW) {
        this.IS_NEW = IS_NEW;
    }

    @MetaColumn(name = "国家展示", code = "COUNTRYDISPLAY", length = 200)
    public String getCOUNTRYDISPLAY() {
        return COUNTRYDISPLAY;
    }

    public void setCOUNTRYDISPLAY(String COUNTRYDISPLAY) {
        this.COUNTRYDISPLAY = COUNTRYDISPLAY;
    }

    @MetaColumn(name = "状态展示", code = "STATUSDISPLAY", length = 200)
    public String getSTATUSDISPLAY() {
        return STATUSDISPLAY;
    }

    public void setSTATUSDISPLAY(String STATUSDISPLAY) {
        this.STATUSDISPLAY = STATUSDISPLAY;
    }

    @MetaColumn(name = "类型展示", code = "TYPEDISPLAY", length = 200)
    public String getTYPEDISPLAY() {
        return TYPEDISPLAY;
    }

    public void setTYPEDISPLAY(String TYPEDISPLAY) {
        this.TYPEDISPLAY = TYPEDISPLAY;
    }

    @MetaColumn(name = "注册机构展示", code = "REGORGDISPLAY", length = 200)
    public String getREGORGDISPLAY() {
        return REGORGDISPLAY;
    }

    public void setREGORGDISPLAY(String REGORGDISPLAY) {
        this.REGORGDISPLAY = REGORGDISPLAY;
    }

    @MetaColumn(name = "注册资本币种展示", code = "REGCAPCURDISPLAY", length = 200)
    public String getREGCAPCURDISPLAY() {
        return REGCAPCURDISPLAY;
    }

    public void setREGCAPCURDISPLAY(String REGCAPCURDISPLAY) {
        this.REGCAPCURDISPLAY = REGCAPCURDISPLAY;
    }

    @MetaColumn(name = "企业唯一标识", code = "ENTID", length = 200)
    public String getENTID() {
        return ENTID;
    }

    public void setENTID(String ENTID) {
        this.ENTID = ENTID;
    }

    @MetaColumn(name = "操作类型", code = "HANDLE_TYPE", type = ColumnType.NUMBER)
    public String getHANDLE_TYPE() {
        return HANDLE_TYPE;
    }

    public void setHANDLE_TYPE(String HANDLE_TYPE) {
        this.HANDLE_TYPE = HANDLE_TYPE;
    }
}
