package com.chinadaas.platform.bi.server.adapter;


import com.chinadaas.platform.product.resolver.ColumnType;
import com.chinadaas.platform.product.resolver.MetaColumn;
import com.chinadaas.platform.product.resolver.MetaColumnGroup;

/**
 * Created by xie on 16/8/3.
 */
@MetaColumnGroup(name = "企业投资信息", code = "INVESTMENT")
public class EnterpriseInv {

    private String S_EXT_NODENUM;       //省份代码
    private String PRIPID;              //主体身份代码
    private String INVID;               //投资人身份标识
    private String INV;                 //投资人
    private String INVTYPE;             //投资人类型
    private String CERTYPE;             //证件类型
    private String CERNO;               //证件号码
    private String BLICTYPE;            //证照类型
    private String BLICNO;              //证照编号
    private String COUNTRY;             //国家
    private String CURRENCY;            //币种
    private String SUBCONAM;            //认缴出资额
    private String ACCONAM;             //实缴出资额
    private String SUBCONAMUSD;         //认缴出资额折万美元
    private String ACCONAMUSD;          //实缴出资额折万美元
    private String CONPROP;             //出资比例
    private String CONFORM;             //出资方式
    private String CONDATE;             //出资日期
    private String BALDELPER;           //余额缴付期限
    private String CONAM;               //出资额
    private String EXEAFFSIGN;          //执行合伙事务标志
    private String S_EXT_TIMESTAMP;     //入库时间
    private String S_EXT_BATCH;         //入库批次
    private String S_EXT_SEQUENCE;      //
    private String S_EXT_VALIDFLAG;     //
    private String LINKMAN;             //联系人
    private String JOBID;               //
    private String ENT_ID;              //
    private String TYPEDISPLAY;
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

    @MetaColumn(name = "投资人身份标识", code = "INVID", length = 200)
    public String getINVID() {
        return INVID;
    }

    public void setINVID(String INVID) {
        this.INVID = INVID;
    }

    @MetaColumn(name = "投资人", code = "INV", length = 400)
    public String getINV() {
        return INV;
    }

    public void setINV(String INV) {
        this.INV = INV;
    }

    @MetaColumn(name = "投资人类型", code = "INVTYPE", length = 64)
    public String getINVTYPE() {
        return INVTYPE;
    }

    public void setINVTYPE(String INVTYPE) {
        this.INVTYPE = INVTYPE;
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

    @MetaColumn(name = "证照类型", code = "BLICTYPE", length = 64)
    public String getBLICTYPE() {
        return BLICTYPE;
    }

    public void setBLICTYPE(String BLICTYPE) {
        this.BLICTYPE = BLICTYPE;
    }

    @MetaColumn(name = "证照编号", code = "BLICNO", length = 200)
    public String getBLICNO() {
        return BLICNO;
    }

    public void setBLICNO(String BLICNO) {
        this.BLICNO = BLICNO;
    }

    @MetaColumn(name = "国家", code = "COUNTRY", length = 128)
    public String getCOUNTRY() {
        return COUNTRY;
    }

    public void setCOUNTRY(String COUNTRY) {
        this.COUNTRY = COUNTRY;
    }

    @MetaColumn(name = "币种", code = "CURRENCY", length = 64)
    public String getCURRENCY() {
        return CURRENCY;
    }

    public void setCURRENCY(String CURRENCY) {
        this.CURRENCY = CURRENCY;
    }

    @MetaColumn(name = "认缴出资额", code = "SUBCONAM", type = ColumnType.NUMBER)
    public String getSUBCONAM() {
        return SUBCONAM;
    }

    public void setSUBCONAM(String SUBCONAM) {
        this.SUBCONAM = SUBCONAM;
    }

    @MetaColumn(name = "实缴出资额", code = "ACCONAM", type = ColumnType.NUMBER)
    public String getACCONAM() {
        return ACCONAM;
    }

    public void setACCONAM(String ACCONAM) {
        this.ACCONAM = ACCONAM;
    }

    @MetaColumn(name = "认缴出资额折万美元", code = "SUBCONAMUSD", type = ColumnType.NUMBER)
    public String getSUBCONAMUSD() {
        return SUBCONAMUSD;
    }

    public void setSUBCONAMUSD(String SUBCONAMUSD) {
        this.SUBCONAMUSD = SUBCONAMUSD;
    }

    @MetaColumn(name = "认缴出资额折万美元", code = "ACCONAMUSD", type = ColumnType.NUMBER)
    public String getACCONAMUSD() {
        return ACCONAMUSD;
    }

    public void setACCONAMUSD(String ACCONAMUSD) {
        this.ACCONAMUSD = ACCONAMUSD;
    }

    @MetaColumn(name = "出资比例", code = "CONPROP", type = ColumnType.NUMBER)
    public String getCONPROP() {
        return CONPROP;
    }

    public void setCONPROP(String CONPROP) {
        this.CONPROP = CONPROP;
    }

    @MetaColumn(name = "出资方式", code = "CONFORM", length = 200)
    public String getCONFORM() {
        return CONFORM;
    }

    public void setCONFORM(String CONFORM) {
        this.CONFORM = CONFORM;
    }

    @MetaColumn(name = "出资日期", code = "CONDATE", type = ColumnType.DATE)
    public String getCONDATE() {
        return CONDATE;
    }

    public void setCONDATE(String CONDATE) {
        this.CONDATE = CONDATE;
    }

    @MetaColumn(name = "余额缴付期限", code = "BALDELPER", type = ColumnType.DATE)
    public String getBALDELPER() {
        return BALDELPER;
    }

    public void setBALDELPER(String BALDELPER) {
        this.BALDELPER = BALDELPER;
    }

    @MetaColumn(name = "出资额", code = "CONAM", type = ColumnType.NUMBER)
    public String getCONAM() {
        return CONAM;
    }

    public void setCONAM(String CONAM) {
        this.CONAM = CONAM;
    }

    @MetaColumn(name = "执行合伙事务标志", code = "EXEAFFSIGN", length = 64)
    public String getEXEAFFSIGN() {
        return EXEAFFSIGN;
    }

    public void setEXEAFFSIGN(String EXEAFFSIGN) {
        this.EXEAFFSIGN = EXEAFFSIGN;
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

    @MetaColumn(name = "联系人", code = "LINKMAN", length = 60)
    public String getLINKMAN() {
        return LINKMAN;
    }

    public void setLINKMAN(String LINKMAN) {
        this.LINKMAN = LINKMAN;
    }

    @MetaColumn(name = "任务唯一标识", code = "JOBID", length = 200)
    public String getJOBID() {
        return JOBID;
    }

    public void setJOBID(String JOBID) {
        this.JOBID = JOBID;
    }

    @MetaColumn(name = "企业唯一标识", code = "ENT_ID", length = 200)
    public String getENT_ID() {
        return ENT_ID;
    }

    public void setENT_ID(String ENT_ID) {
        this.ENT_ID = ENT_ID;
    }

    @MetaColumn(name = "展示类型", code = "TYPEDISPLAY", length = 200)
    public String getTYPEDISPLAY() {
        return TYPEDISPLAY;
    }

    public void setTYPEDISPLAY(String TYPEDISPLAY) {
        this.TYPEDISPLAY = TYPEDISPLAY;
    }

    @MetaColumn(name = "操作类型", code = "HANDLE_TYPE", type = ColumnType.NUMBER)
    public String getHANDLE_TYPE() {
        return HANDLE_TYPE;
    }

    public void setHANDLE_TYPE(String HANDLE_TYPE) {
        this.HANDLE_TYPE = HANDLE_TYPE;
    }
}
