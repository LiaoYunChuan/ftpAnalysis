package com.longruan.ftpanalysis.mq.model;

import java.io.Serializable;

/*安监异常数据*/
public class AbnormaldataInformation implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 传感器ID
     */
    private String sensorId;
    /**
     * 数据生成时间
     */
    private String dataTime;
    /**
     * 传感器时间
     */
    private String sensorTime;
    /**
     * 报警类型
     */
    private String warnType;
    /**
     * 当前值
     */
    private String monitorVal;
    /**
     * 最大值
     */
    private String maxVal;
    /**
     * 最大值时刻
     */
    private String maxValTime;
    /**
     * 最小值
     */
    private String minVal;
    /**
     * 最小值时刻
     */
    private String minValTime;
    /**
     * 平均值
     */
    private String avgVal;
    /**
     * 报警起始时刻
     */
    private String sTime;
    /**
     * 报警结束时间
     */
    private String eTime;
    /**
     * 是否反馈
     */
    private Integer replyStatus;
    /**
     * 反馈时间
     */
    private String replyTime;
    /**
     * 反馈内容
     */
    private String replyRemark;
    /**
     * 反馈人
     */
    private String replyPerson;
    /**
     * 反馈负责人
     */
    private String replyRespPerson;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getSensorId() {
        return sensorId;
    }

    public void setSensorId(String sensorId) {
        this.sensorId = sensorId;
    }

    public String getDataTime() {
        return dataTime;
    }

    public void setDataTime(String dataTime) {
        this.dataTime = dataTime;
    }

    public String getSensorTime() {
        return sensorTime;
    }

    public void setSensorTime(String sensorTime) {
        this.sensorTime = sensorTime;
    }

    public String getWarnType() {
        return warnType;
    }

    public void setWarnType(String warnType) {
        this.warnType = warnType;
    }

    public String getMonitorVal() {
        return monitorVal;
    }

    public void setMonitorVal(String monitorVal) {
        this.monitorVal = monitorVal;
    }

    public String getMaxVal() {
        return maxVal;
    }

    public void setMaxVal(String maxVal) {
        this.maxVal = maxVal;
    }

    public String getMaxValTime() {
        return maxValTime;
    }

    public void setMaxValTime(String maxValTime) {
        this.maxValTime = maxValTime;
    }

    public String getMinVal() {
        return minVal;
    }

    public void setMinVal(String minVal) {
        this.minVal = minVal;
    }

    public String getMinValTime() {
        return minValTime;
    }

    public void setMinValTime(String minValTime) {
        this.minValTime = minValTime;
    }

    public String getAvgVal() {
        return avgVal;
    }

    public void setAvgVal(String avgVal) {
        this.avgVal = avgVal;
    }

    public String getsTime() {
        return sTime;
    }

    public void setsTime(String sTime) {
        this.sTime = sTime;
    }

    public String geteTime() {
        return eTime;
    }

    public void seteTime(String eTime) {
        this.eTime = eTime;
    }

    public Integer getReplyStatus() {
        return replyStatus;
    }

    public void setReplyStatus(Integer replyStatus) {
        this.replyStatus = replyStatus;
    }

    public String getReplyTime() {
        return replyTime;
    }

    public void setReplyTime(String replyTime) {
        this.replyTime = replyTime;
    }

    public String getReplyRemark() {
        return replyRemark;
    }

    public void setReplyRemark(String replyRemark) {
        this.replyRemark = replyRemark;
    }

    public String getReplyPerson() {
        return replyPerson;
    }

    public void setReplyPerson(String replyPerson) {
        this.replyPerson = replyPerson;
    }

    public String getReplyRespPerson() {
        return replyRespPerson;
    }

    public void setReplyRespPerson(String replyRespPerson) {
        this.replyRespPerson = replyRespPerson;
    }
}
