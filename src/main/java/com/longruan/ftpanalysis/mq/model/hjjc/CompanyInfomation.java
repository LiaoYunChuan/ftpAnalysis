package com.longruan.ftpanalysis.mq.model.hjjc;

import com.alibaba.fastjson.annotation.JSONField;
import com.longruan.ftpanalysis.batch.entity.FieldOrder;
import com.longruan.ftpanalysis.batch.entity.MsgName;
import com.longruan.ftpanalysis.mq.consts.BatchConstants;
import com.longruan.ftpanalysis.mq.consts.MQConstants;

@MsgName(job = "生产经营单位参数", filePath = "*_HJDW_*", sysType = BatchConstants.SystemType.hjjc, exchangeName = MQConstants.ExChanges.NC_COMPANY)
public class CompanyInfomation {


    private String orgCode;
    @JSONField(name = "updateTime")
    private String dataTime;
    private Integer deleteFlag = 0;
    private String respMobile;
    @FieldOrder(order = 1)
    @JSONField(name = "id")
    private String S1;   //ID;	生产经营单位编码
    @FieldOrder(order = 2)
    private Integer S2;  //;	工作班次数量;
    @FieldOrder(order = 3)
    private String S3;    //分公司名称;
    @FieldOrder(order = 4)
    @JSONField(name = "companyName")
    private String S4;    //矿井名称;
    @FieldOrder(order = 5)
    @JSONField(name = "companysName")
    private String S5;    //矿井简称;
    @FieldOrder(order = 6)
    private String S6;    //经济类型;
    @FieldOrder(order = 7)
    private String S7;    //隶属关系;
    @FieldOrder(order = 8)
    private String S8;    //详细地址;
    @FieldOrder(order = 9)
    private Integer S9;    //核定生产能力;
    @FieldOrder(order = 10)
    private Integer S10;    //实际生产能力;
    @FieldOrder(order = 11)
    @JSONField(name = "limitPeroncount")
    private Integer S11;    //核定下井人数;
    @FieldOrder(order = 12)
    private Integer S12;    //核定每班下井时间;
    @FieldOrder(order = 13)
    @JSONField(name = "respPhone")
    private String S13;    //矿联系电话;
    @FieldOrder(order = 14)
    private String S14;    //开采方式;
    @FieldOrder(order = 15)
    private String S15;    //所采主要矿种;
    @FieldOrder(order = 16)
    private String S16;    //采矿许可证编号;
    @FieldOrder(order = 17)
    private String S17;    //安全生产许可证编号;
    @FieldOrder(order = 18)
    @JSONField(name = "respPerson")
    private String S18;    //矿长姓名;
    @FieldOrder(order = 19)
    private String S19;    //矿长安全生产许可资格证编号;
    @FieldOrder(order = 20)
    private String S20;    //矿长资格证编号;
    @FieldOrder(order = 21)
    private String S21;    //工商执照编号;
    @FieldOrder(order = 22)
    private String S22;    //主用服务器IP地址;
    @FieldOrder(order = 23)
    private String S23;    //备用服务器IP地址;
    @FieldOrder(order = 24)
    private String S24;    //备用IP地址;
    @FieldOrder(order = 25)
    private String S25;    //主井口Y坐标;
    @FieldOrder(order = 26)
    private String S26;    //主井口X坐标;
    @FieldOrder(order = 27)
    private String S27;    //备注;

    public String getS1() {
        return S1;
    }

    public void setS1(String s1) {
        S1 = s1;
    }

    public Integer getS2() {
        return S2;
    }

    public void setS2(Integer s2) {
        S2 = s2;
    }

    public String getS3() {
        return S3;
    }

    public void setS3(String s3) {
        S3 = s3;
    }

    public String getS4() {
        return S4;
    }

    public void setS4(String s4) {
        S4 = s4;
    }

    public String getS5() {
        return S5;
    }

    public void setS5(String s5) {
        S5 = s5;
    }

    public String getS6() {
        return S6;
    }

    public void setS6(String s6) {
        S6 = s6;
    }

    public String getS7() {
        return S7;
    }

    public void setS7(String s7) {
        S7 = s7;
    }

    public String getS8() {
        return S8;
    }

    public void setS8(String s8) {
        S8 = s8;
    }

    public Integer getS9() {
        return S9;
    }

    public void setS9(Integer s9) {
        S9 = s9;
    }

    public Integer getS10() {
        return S10;
    }

    public void setS10(Integer s10) {
        S10 = s10;
    }

    public Integer getS11() {
        return S11;
    }

    public void setS11(Integer s11) {
        S11 = s11;
    }

    public Integer getS12() {
        return S12;
    }

    public void setS12(Integer s12) {
        S12 = s12;
    }

    public String getS13() {
        return S13;
    }

    public void setS13(String s13) {
        S13 = s13;
        this.respMobile = s13;
    }

    public String getS14() {
        return S14;
    }

    public void setS14(String s14) {
        S14 = s14;
    }

    public String getS15() {
        return S15;
    }

    public void setS15(String s15) {
        S15 = s15;
    }

    public String getS16() {
        return S16;
    }

    public void setS16(String s16) {
        S16 = s16;
    }

    public String getS17() {
        return S17;
    }

    public void setS17(String s17) {
        S17 = s17;
    }

    public String getS18() {
        return S18;
    }

    public void setS18(String s18) {
        S18 = s18;
    }

    public String getS19() {
        return S19;
    }

    public void setS19(String s19) {
        S19 = s19;
    }

    public String getS20() {
        return S20;
    }

    public void setS20(String s20) {
        S20 = s20;
    }

    public String getS21() {
        return S21;
    }

    public void setS21(String s21) {
        S21 = s21;
    }

    public String getS22() {
        return S22;
    }

    public void setS22(String s22) {
        S22 = s22;
    }

    public String getS23() {
        return S23;
    }

    public void setS23(String s23) {
        S23 = s23;
    }

    public String getS24() {
        return S24;
    }

    public void setS24(String s24) {
        S24 = s24;
    }

    public String getS25() {
        return S25;
    }

    public void setS25(String s25) {
        S25 = s25;
    }

    public String getS26() {
        return S26;
    }

    public void setS26(String s26) {
        S26 = s26;
    }

    public String getS27() {
        return S27;
    }

    public void setS27(String s27) {
        S27 = s27;
    }

    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    public String getDataTime() {
        return dataTime;
    }

    public void setDataTime(String dataTime) {
        this.dataTime = dataTime;
    }

    public Integer getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Integer deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public String getRespMobile() {
        return respMobile;
    }

    public void setRespMobile(String respMobile) {
        this.respMobile = respMobile;
    }
}
