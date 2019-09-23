package com.longruan.ftpanalysis.mq.model.rydw;

import com.longruan.ftpanalysis.batch.entity.FieldOrder;
import com.longruan.ftpanalysis.batch.entity.FieldOrders;
import com.longruan.ftpanalysis.batch.entity.MsgName;
import com.longruan.ftpanalysis.mq.consts.BatchConstants;
import com.longruan.ftpanalysis.mq.consts.MQConstants;

@MsgName(job = "生产经营单位参数", filePath = "*_HJDW_*", sysType = BatchConstants.SystemType.hjjc, exchangeName = MQConstants.ExChanges.NC_COMPANY)
public class CompanyInfomation {
    private static final long serialVersionUID = 1L;
    /**
     * 行政区域代码
     */
    @FieldOrders(value = {
            @FieldOrder(order = 1)
    })
    private String id;
    /**
     * 工作班次数量
     */
    @FieldOrders({
            @FieldOrder(order = 2),
    })
    private String S2;
    /**
     * 分公司名称
     */
    @FieldOrders({
            @FieldOrder(order = 3),
    })
    private String S3;

    /**
     * 矿井名称
     */
    @FieldOrders({
            @FieldOrder(order = 4)
    })
    private String companyName;
    /**
     * 企业简称
     */
    @FieldOrders({
            @FieldOrder(order = 5)
    })
    private String companySname;
    /**
     * 经济类型
     */
    @FieldOrders({
            @FieldOrder(order = 6)
    })
    private String s6;
    /**
     * 隶属关系
     */
    @FieldOrders({
            @FieldOrder(order = 7)
    })
    private String s7;
    /**
     * 详细地址
     */
    @FieldOrders({
            @FieldOrder(order = 8)
    })
    private String s8;
    /**
     * 核定生产能力
     */
    @FieldOrders({
            @FieldOrder(order = 9)
    })
    private String s9;
    /**
     * 企业编号
     */
//    @FieldOrders(value={
//            @FieldOrder(order = 1)
//    })
    private String companyCode;
    /**
     * 公司编码
     */
    private String orgCode;

    /**
     * 父级企业
     */
//    @JSONField(name = "pCompanyCode")
    private String pCompanyCode;
    /**
     * 数据更新时间
     */
//    @JSONField(name = "updateTime")
    private Long updateTime;
    /**
     * 删除标志
     */
//    @JSONField(name = "deleteFlag")
    private String deleteFlag;
    /**
     * 核定生产能力
     */
    @FieldOrders({
            @FieldOrder(order = 10)
    })
    private String s10;
    /**
     * 核定生产能力
     */
    @FieldOrders({
            @FieldOrder(order = 11)
    })
    private String s11;
    /**
     * 核定生产能力
     */
    @FieldOrders({
            @FieldOrder(order = 12)
    })
    private String s12;
    /**
     * 矿联系电话
     */
    @FieldOrders({
            @FieldOrder(order = 13)
    })
    private String respPhone;
    @FieldOrders({
            @FieldOrder(order = 14)
    })
    private String s14;
    @FieldOrders({
            @FieldOrder(order = 15)
    })
    private String s15;
    @FieldOrders({
            @FieldOrder(order = 16)
    })
    private String s16;
    @FieldOrders({
            @FieldOrder(order = 17)
    })
    private String s17;
    /**
     * 联系人
     */
//    @JSONField(name = "respPerson")
    @FieldOrders({
            @FieldOrder(order = 18)
    })
    private String respPerson;
    @FieldOrders({
            @FieldOrder(order = 19)
    })
    private String s19;
    @FieldOrders({
            @FieldOrder(order = 20)
    })
    private String s20;
    @FieldOrders({
            @FieldOrder(order = 21)
    })
    private String s21;
    @FieldOrders({
            @FieldOrder(order = 22)
    })
    private String s22;
    @FieldOrders({
            @FieldOrder(order = 23)
    })
    private String s23;
    @FieldOrders({
            @FieldOrder(order = 24)
    })
    private String s24;
    @FieldOrders({
            @FieldOrder(order = 25)
    })
    private String s25;
    @FieldOrders({
            @FieldOrder(order = 26)
    })
    private String s26;
    @FieldOrders({
            @FieldOrder(order = 27)
    })
    private String s27;
    /**
     * 手机
     */
//    @JSONField(name = "respMobile")
    private String respMobile;
    /**
     * 上传标识
     */
//    @JSONField(name = "uploadFlag")
    private String uploadFlag;
    //    @JSONField(name = "uploadReamrk")
    private String uploadReamrk;
    //    @JSONField(name = "limitPersoncount")
    private String limitPersoncount;


    public String getLimitPersoncount() {
        return limitPersoncount;
    }

    public void setLimitPersoncount(String limitPersoncount) {
        this.limitPersoncount = limitPersoncount;
    }

    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanySname() {
        return companySname;
    }

    public void setCompanySname(String companySname) {
        this.companySname = companySname;
    }

    public String getpCompanyCode() {
        return pCompanyCode;
    }

    public void setpCompanyCode(String pCompanyCode) {
        this.pCompanyCode = pCompanyCode;
    }

    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public String getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(String deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public String getRespPerson() {
        return respPerson;
    }

    public void setRespPerson(String respPerson) {
        this.respPerson = respPerson;
    }

    public String getRespPhone() {
        return respPhone;
    }

    public void setRespPhone(String respPhone) {
        this.respPhone = respPhone;
    }

    public String getRespMobile() {
        return respMobile;
    }

    public void setRespMobile(String respMobile) {
        this.respMobile = respMobile;
    }

    public String getUploadFlag() {
        return uploadFlag;
    }

    public void setUploadFlag(String uploadFlag) {
        this.uploadFlag = uploadFlag;
    }

    public String getUploadReamrk() {
        return uploadReamrk;
    }

    public void setUploadReamrk(String uploadReamrk) {
        this.uploadReamrk = uploadReamrk;
    }
}
