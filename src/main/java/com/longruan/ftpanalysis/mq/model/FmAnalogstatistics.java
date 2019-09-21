package com.longruan.ftpanalysis.mq.model;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;
import java.util.Date;

public class FmAnalogstatistics implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @JSONField(name = "id")
    private String id;
    /**
     * 传感器编号
     */
    @JSONField(name = "sensorid")
    private String sensorid;
    /**
     * 统计值平均值
     */
    @JSONField(name = "avgvalue")
    private String avgvalue;
    /**
     * 统计值最大值
     */
    @JSONField(name = "统计值最大值")
    private String maxvalues;
    /**
     * 统计值最大值时刻
     */
    @JSONField(name = "maxvaluetime")
    private String maxvaluetime;
    /**
     * 统计值最小值
     */
    @JSONField(name = "minvalues")
    private String minvalues;
    /**
     * 统计值最小值时刻
     */
    @JSONField(name = "minvaluetime")
    private String minvaluetime;
    @JSONField(name = "upload_flag")
    private Integer uploadFlag;
    @JSONField(name = "send_time")
    private Date sendTime;
    @JSONField(name = "upload_remark")
    private String uploadRemark;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSensorid() {
        return sensorid;
    }

    public void setSensorid(String sensorid) {
        this.sensorid = sensorid;
    }

    public String getAvgvalue() {
        return avgvalue;
    }

    public void setAvgvalue(String avgvalue) {
        this.avgvalue = avgvalue;
    }

    public String getMaxvalues() {
        return maxvalues;
    }

    public void setMaxvalues(String maxvalues) {
        this.maxvalues = maxvalues;
    }

    public String getMaxvaluetime() {
        return maxvaluetime;
    }

    public void setMaxvaluetime(String maxvaluetime) {
        this.maxvaluetime = maxvaluetime;
    }

    public String getMinvalues() {
        return minvalues;
    }

    public void setMinvalues(String minvalues) {
        this.minvalues = minvalues;
    }

    public String getMinvaluetime() {
        return minvaluetime;
    }

    public void setMinvaluetime(String minvaluetime) {
        this.minvaluetime = minvaluetime;
    }

    public Integer getUploadFlag() {
        return uploadFlag;
    }

    public void setUploadFlag(Integer uploadFlag) {
        this.uploadFlag = uploadFlag;
    }

    public Date getSendTime() {
        return sendTime;
    }

    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }

    public String getUploadRemark() {
        return uploadRemark;
    }

    public void setUploadRemark(String uploadRemark) {
        this.uploadRemark = uploadRemark;
    }
}
