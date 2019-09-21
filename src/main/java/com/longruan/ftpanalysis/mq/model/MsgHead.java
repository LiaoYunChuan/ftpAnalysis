package com.longruan.ftpanalysis.mq.model;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/**
 * 消息头
 *
 * @author zoyation
 * @version 1.0.0
 * @ClassName com.longruan.dc.message.mq.receiver.model.Head
 * @date 2019/5/13 14:40
 * @since 1.0.0
 **/
@JsonSerialize(include = JsonSerialize.Inclusion.NON_EMPTY)
public class MsgHead {
    private String upTime;
    /**
     * 公司id
     */
    private String companyId;
    /**
     * 公司编码
     */
    private String orgCode;
    /**
     * 预留字段
     */
    private String arg1;
    /**
     * 预留字段
     */
    private String arg2;
    /**
     * 预留字段
     */
    private String arg3;
    /**
     * 预留字段
     */
    private String arg4;
    /**
     * 预留字段
     */
    private String arg5;

//    public Date getUploadDate() {
//        return uploadDate;
//    }
//
//    public void setUploadDate(Date uploadDate) {
//        this.uploadDate = uploadDate;
//    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    public String getUpTime() {
        return upTime;
    }

    public void setUpTime(String upTime) {
        this.upTime = upTime;
    }

    public String getArg1() {
        return arg1;
    }

    public void setArg1(String arg1) {
        this.arg1 = arg1;
    }

    public String getArg2() {
        return arg2;
    }

    public void setArg2(String arg2) {
        this.arg2 = arg2;
    }

    public String getArg3() {
        return arg3;
    }

    public void setArg3(String arg3) {
        this.arg3 = arg3;
    }

    public String getArg4() {
        return arg4;
    }

    public void setArg4(String arg4) {
        this.arg4 = arg4;
    }

    public String getArg5() {
        return arg5;
    }

    public void setArg5(String arg5) {
        this.arg5 = arg5;
    }

    @Override
    public String toString() {
        return "MsgHead{" +
//                "uploadDate=" + uploadDate +
                ", companyId='" + companyId + '\'' +
                ", orgCode='" + orgCode + '\'' +
                ", upTime=" + upTime +
                ", arg1='" + arg1 + '\'' +
                ", arg2='" + arg2 + '\'' +
                ", arg3='" + arg3 + '\'' +
                ", arg4='" + arg4 + '\'' +
                ", arg5='" + arg5 + '\'' +
                '}';
    }
}
