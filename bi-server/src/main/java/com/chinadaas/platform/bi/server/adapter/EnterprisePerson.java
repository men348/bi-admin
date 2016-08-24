package com.chinadaas.platform.bi.server.adapter;


import com.chinadaas.platform.product.resolver.ColumnType;
import com.chinadaas.platform.product.resolver.MetaColumn;
import com.chinadaas.platform.product.resolver.MetaColumnGroup;

/**
 * Created by xie on 16/8/3.
 */
@MetaColumnGroup(name = "主要管理人员", code="PERSON")
public class EnterprisePerson {

    private String S_EXT_NODENUM;       //省份代码
    private String PRIPID;              //主体身份代码
    private String PERSON_ID;           //人员ID
    private String NAME;                //姓名
    private String CERTYPE;             //证件类型
    private String CERNO;               //证件号码
    private String SEX;                 //性别
    private String NATDATE;             //出生日期
    private String DOM;                 //住址
    private String POSTALCODE;          //邮政编码
    private String TEL;                 //联系电话
    private String LITDEG;              //文化程度
    private String NATION;              //民族
    private String PLSTAND;             //政治面貌
    private String OCCST;               //职业状况
    private String OFFSIGN;             //公务员标志
    private String ACCDSIDE;            //委派方
    private String LEREPSIGN;           //法定代表人标志
    private String CHARACTER;           //经营者主体特征
    private String COUNTRY;             //国别
    private String ARRCHDATE;           //来华日期
    private String CERLSSDATE;          //签证签发日期
    private String CERVALPER;           //签证有效期
    private String CHIOFTHEDELSIGN;     //首席代表标志
    private String S_EXT_TIMESTAMP;     //入库时间
    private String S_EXT_BATCH;         //入库批次
    private String NOTORG;              //身份核证文件核证机构
    private String NOTDOCNO;            //身份核证文件编号
    private String S_EXT_SEQUENCE;      //入库序列号
    private String S_EXT_VALIDFLAG;     //入库合法标签
    private String POSITION;            //职务
    private String OFFHFROM;            //任职起始日期
    private String OFFHTO;              //任职截止日期
    private String POSBRFORM;           //职务产生方式
    private String APPOUNIT;            //任命单位
    private String JOBID;
    private String ENTID;
    private String TYPEDISPLAY;
    private String DATA_FLAG;
    private String HANDLE_TYPE;


    @MetaColumn(name = "省份代码", code = "S_EXT_NODENUM", length = 40)
    public String getS_EXT_NODENUM() {
        return S_EXT_NODENUM;
    }

    public void setS_EXT_NODENUM(String S_EXT_NODENUM) {
        this.S_EXT_NODENUM = S_EXT_NODENUM;
    }

    @MetaColumn(name = "主体身份代码", code = "PRIPID", length = 36)
    public String getPRIPID() {
        return PRIPID;
    }

    public void setPRIPID(String PRIPID) {
        this.PRIPID = PRIPID;
    }

    @MetaColumn(name = "人员唯一标识", code = "PERSON_ID", length = 50)
    public String getPERSON_ID() {
        return PERSON_ID;
    }

    public void setPERSON_ID(String PERSON_ID) {
        this.PERSON_ID = PERSON_ID;
    }

    @MetaColumn(name = "姓名", code = "NAME", length = 200)
    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    @MetaColumn(name = "证件类型", code = "CERTYPE", length = 64)
    public String getCERTYPE() {
        return CERTYPE;
    }

    public void setCERTYPE(String CERTYPE) {
        this.CERTYPE = CERTYPE;
    }

    @MetaColumn(name = "证件号码", code = "CERNO", length = 200)
    public String getCERNO() {
        return CERNO;
    }

    public void setCERNO(String CERNO) {
        this.CERNO = CERNO;
    }

    @MetaColumn(name = "性别", code = "SEX", length = 64)
    public String getSEX() {
        return SEX;
    }

    public void setSEX(String SEX) {
        this.SEX = SEX;
    }

    @MetaColumn(name = "出生日期", code = "NATDATE", type = ColumnType.DATE)
    public String getNATDATE() {
        return NATDATE;
    }

    public void setNATDATE(String NATDATE) {
        this.NATDATE = NATDATE;
    }

    @MetaColumn(name = "住址", code = "DOM", length = 500)
    public String getDOM() {
        return DOM;
    }

    public void setDOM(String DOM) {
        this.DOM = DOM;
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

    @MetaColumn(name = "文化程度", code = "LITDEG", length = 64)
    public String getLITDEG() {
        return LITDEG;
    }

    public void setLITDEG(String LITDEG) {
        this.LITDEG = LITDEG;
    }

    @MetaColumn(name = "民族", code = "NATION", length = 64)
    public String getNATION() {
        return NATION;
    }

    public void setNATION(String NATION) {
        this.NATION = NATION;
    }

    @MetaColumn(name = "政治面貌", code = "PLSTAND", length = 64)
    public String getPLSTAND() {
        return PLSTAND;
    }

    public void setPLSTAND(String PLSTAND) {
        this.PLSTAND = PLSTAND;
    }

    @MetaColumn(name = "职业状况", code = "OCCST", length = 400)
    public String getOCCST() {
        return OCCST;
    }

    public void setOCCST(String OCCST) {
        this.OCCST = OCCST;
    }

    @MetaColumn(name = "公务员标志", code = "OFFSIGN", length = 64)
    public String getOFFSIGN() {
        return OFFSIGN;
    }

    public void setOFFSIGN(String OFFSIGN) {
        this.OFFSIGN = OFFSIGN;
    }

    @MetaColumn(name = "委派方", code = "ACCDSIDE", length = 500)
    public String getACCDSIDE() {
        return ACCDSIDE;
    }

    public void setACCDSIDE(String ACCDSIDE) {
        this.ACCDSIDE = ACCDSIDE;
    }

    @MetaColumn(name = "法定代表人标志", code = "LEREPSIGN", length = 64)
    public String getLEREPSIGN() {
        return LEREPSIGN;
    }

    public void setLEREPSIGN(String LEREPSIGN) {
        this.LEREPSIGN = LEREPSIGN;
    }

    @MetaColumn(name = "经营者主体特征", code = "CHARACTER", length = 64)
    public String getCHARACTER() {
        return CHARACTER;
    }

    public void setCHARACTER(String CHARACTER) {
        this.CHARACTER = CHARACTER;
    }

    @MetaColumn(name = "国家", code = "COUNTRY", length = 128)
    public String getCOUNTRY() {
        return COUNTRY;
    }

    public void setCOUNTRY(String COUNTRY) {
        this.COUNTRY = COUNTRY;
    }

    @MetaColumn(name = "来华日期", code = "ARRCHDATE", type = ColumnType.DATE)
    public String getARRCHDATE() {
        return ARRCHDATE;
    }

    public void setARRCHDATE(String ARRCHDATE) {
        this.ARRCHDATE = ARRCHDATE;
    }

    @MetaColumn(name = "签证签发日期", code = "CERLSSDATE", type = ColumnType.DATE)
    public String getCERLSSDATE() {
        return CERLSSDATE;
    }

    public void setCERLSSDATE(String CERLSSDATE) {
        this.CERLSSDATE = CERLSSDATE;
    }

    @MetaColumn(name = "签证有效期", code = "CERVALPER", type = ColumnType.DATE)
    public String getCERVALPER() {
        return CERVALPER;
    }

    public void setCERVALPER(String CERVALPER) {
        this.CERVALPER = CERVALPER;
    }

    @MetaColumn(name = "首席代表标志", code = "CHIOFTHEDELSIGN", length = 1)
    public String getCHIOFTHEDELSIGN() {
        return CHIOFTHEDELSIGN;
    }

    public void setCHIOFTHEDELSIGN(String CHIOFTHEDELSIGN) {
        this.CHIOFTHEDELSIGN = CHIOFTHEDELSIGN;
    }

    @MetaColumn(name = "入库时间", code = "S_EXT_TIMESTAMP", type = ColumnType.DATE)
    public String getS_EXT_TIMESTAMP() {
        return S_EXT_TIMESTAMP;
    }

    public void setS_EXT_TIMESTAMP(String S_EXT_TIMESTAMP) {
        this.S_EXT_TIMESTAMP = S_EXT_TIMESTAMP;
    }

    @MetaColumn(name = "入库批次", code = "S_EXT_BATCH", length = 40)
    public String getS_EXT_BATCH() {
        return S_EXT_BATCH;
    }

    public void setS_EXT_BATCH(String S_EXT_BATCH) {
        this.S_EXT_BATCH = S_EXT_BATCH;
    }

    @MetaColumn(name = "身份核证文件核证机构", code = "NOTORG", length = 100)
    public String getNOTORG() {
        return NOTORG;
    }

    public void setNOTORG(String NOTORG) {
        this.NOTORG = NOTORG;
    }

    @MetaColumn(name = "身份核证文件编号", code = "NOTDOCNO", length = 50)
    public String getNOTDOCNO() {
        return NOTDOCNO;
    }

    public void setNOTDOCNO(String NOTDOCNO) {
        this.NOTDOCNO = NOTDOCNO;
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

    @MetaColumn(name = "职务", code = "POSITION", length = 200)
    public String getPOSITION() {
        return POSITION;
    }

    public void setPOSITION(String POSITION) {
        this.POSITION = POSITION;
    }

    @MetaColumn(name = "任职起始日期", code = "OFFHFROM", type =ColumnType.DATE)
    public String getOFFHFROM() {
        return OFFHFROM;
    }

    public void setOFFHFROM(String OFFHFROM) {
        this.OFFHFROM = OFFHFROM;
    }

    @MetaColumn(name = "任职截止日期", code = "OFFHTO", type =ColumnType.DATE)
    public String getOFFHTO() {
        return OFFHTO;
    }

    public void setOFFHTO(String OFFHTO) {
        this.OFFHTO = OFFHTO;
    }

    @MetaColumn(name = "职务产生方式", code = "POSBRFORM", length = 64)
    public String getPOSBRFORM() {
        return POSBRFORM;
    }

    public void setPOSBRFORM(String POSBRFORM) {
        this.POSBRFORM = POSBRFORM;
    }

    @MetaColumn(name = "任命单位", code = "APPOUNIT", length = 500)
    public String getAPPOUNIT() {
        return APPOUNIT;
    }

    public void setAPPOUNIT(String APPOUNIT) {
        this.APPOUNIT = APPOUNIT;
    }

    @MetaColumn(name = "任务唯一标识", code = "JOBID", length = 200)
    public String getJOBID() {
        return JOBID;
    }

    public void setJOBID(String JOBID) {
        this.JOBID = JOBID;
    }

    @MetaColumn(name = "企业唯一标识", code = "ENTID", length = 200)
    public String getENTID() {
        return ENTID;
    }

    public void setENTID(String ENTID) {
        this.ENTID = ENTID;
    }

    @MetaColumn(name = "展示类型", code = "TYPEDISPLAY", length = 200)
    public String getTYPEDISPLAY() {
        return TYPEDISPLAY;
    }

    public void setTYPEDISPLAY(String TYPEDISPLAY) {
        this.TYPEDISPLAY = TYPEDISPLAY;
    }

    @MetaColumn(name = "数据标签", code = "DATA_FLAG", length = 1)
    public String getDATA_FLAG() {
        return DATA_FLAG;
    }

    public void setDATA_FLAG(String DATA_FLAG) {
        this.DATA_FLAG = DATA_FLAG;
    }

    @MetaColumn(name = "操作类型", code = "HANDLE_TYPE", type = ColumnType.NUMBER)
    public String getHANDLE_TYPE() {
        return HANDLE_TYPE;
    }

    public void setHANDLE_TYPE(String HANDLE_TYPE) {
        this.HANDLE_TYPE = HANDLE_TYPE;
    }
}
