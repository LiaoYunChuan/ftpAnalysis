package com.longruan.ftpanalysis.mq.model.hjjc;

import com.alibaba.fastjson.annotation.JSONField;
import com.longruan.ftpanalysis.batch.entity.FieldOrder;
import com.longruan.ftpanalysis.batch.entity.FieldOrders;
import com.longruan.ftpanalysis.batch.entity.MsgName;
import com.longruan.ftpanalysis.mq.consts.BatchConstants;
import com.longruan.ftpanalysis.mq.consts.MQConstants;

@MsgName(job = "生产经营单位参数",filePath = "*_HJDW_*", sysType = BatchConstants.SystemType.hjjc, exchangeName = MQConstants.ExChanges.NC_COMPANY)
public class CompanyInfomation {
    private static final long serialVersionUID = 1L;
    /**
     * 行政区域代码
     */
    @JSONField(name = "orgCode")
    private String orgCode;
    /**
     * 企业编号
     */
    @FieldOrders(value={
            @FieldOrder(order = 1),
            @FieldOrder(group="g2",order = 2),
            @FieldOrder(group="g3",order = 2)
    })
    @JSONField(name="companyCode")
    private String S1;

    /**
     *工作班次数量
     */
    @FieldOrders({
            @FieldOrder(order = 2),
            @FieldOrder(group="g2",order = 1)
    })
    private String S2;
    /**
     * 企业名称
     */
    @FieldOrders({
            @FieldOrder(order = 3),
            @FieldOrder(group="g2",order = 3)
    })
    @JSONField(name = "companyName")
    private String companyName;
    /**
     * 企业简称
     */
    @FieldOrders({
            @FieldOrder(order = 4)
    })
    @JSONField(name = "companySname")
    private String companySname;
    /**
     * 父级企业
     */
    @JSONField(name = "pCompanyCode")
    private String pCompanyCode;
    /**
     * 数据更新时间
     */
    @JSONField(name = "updateTime")
    private Long updateTime;
    /**
     * 删除标志
     */
    @JSONField(name = "deleteFlag")
    private String deleteFlag;
    /**
     * 联系人
     */
    @JSONField(name = "respPerson")
    private String respPerson;
    /**
     * 联系电话
     */
    @JSONField(name = "respPhone")
    private String respPhone;
    /**
     * 手机
     */
    @JSONField(name = "respMobile")
    private String respMobile;
    /**
     * 上传标识
     */
    @JSONField(name = "uploadFlag")
    private String uploadFlag;
    @JSONField(name = "uploadReamrk")
    private String uploadReamrk;
    @JSONField(name = "limitPersoncount")
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
