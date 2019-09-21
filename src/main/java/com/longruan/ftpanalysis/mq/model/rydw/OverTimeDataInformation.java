package com.longruan.ftpanalysis.mq.model.rydw;

import com.longruan.ftpanalysis.batch.entity.MsgName;
import com.longruan.ftpanalysis.mq.consts.BatchConstants;
import com.longruan.ftpanalysis.mq.consts.MQConstants;

@MsgName(job = "实时数据", filePath = "*_HJSS_*", sysType = BatchConstants.SystemType.rydw, exchangeName = MQConstants.ExChanges.NC_PL_OVERTIMEDATA)

public class OverTimeDataInformation {
    private java.lang.String id;
    private java.lang.String dataTime;
    private java.lang.Integer cardId;
    private java.lang.Integer personId;
    /**
     * 入井时间
     */
    private java.lang.String timeInWell;
    /**
     * 报警开始时间
     */
    private java.lang.String alarmSTime;
    private java.lang.String alarmETime;
    /**
     * 区域编号
     */
    private java.lang.Integer areaId;
    /**
     * 进入区域时间
     */
    private java.lang.String timeInArea;
    /**
     * 分站编号
     */
    private java.lang.String stationId;
    /**
     * 进入分站时间
     */
    private java.lang.String timeInStation;
    /**
     * 上传标识
     */
    private java.lang.Integer uploadFlag;
    /**
     * 上传时间
     */
    private java.lang.String uploadTime;
    /**
     * 上传说明
     */
    private java.lang.String uploadRemark;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDataTime() {
        return dataTime;
    }

    public void setDataTime(String dataTime) {
        this.dataTime = dataTime;
    }

    public Integer getCardId() {
        return cardId;
    }

    public void setCardId(Integer cardId) {
        this.cardId = cardId;
    }

    public Integer getPersonId() {
        return personId;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    public String getTimeInWell() {
        return timeInWell;
    }

    public void setTimeInWell(String timeInWell) {
        this.timeInWell = timeInWell;
    }

    public String getAlarmSTime() {
        return alarmSTime;
    }

    public void setAlarmSTime(String alarmSTime) {
        this.alarmSTime = alarmSTime;
    }

    public String getAlarmETime() {
        return alarmETime;
    }

    public void setAlarmETime(String alarmETime) {
        this.alarmETime = alarmETime;
    }

    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    public String getTimeInArea() {
        return timeInArea;
    }

    public void setTimeInArea(String timeInArea) {
        this.timeInArea = timeInArea;
    }

    public String getStationId() {
        return stationId;
    }

    public void setStationId(String stationId) {
        this.stationId = stationId;
    }

    public String getTimeInStation() {
        return timeInStation;
    }

    public void setTimeInStation(String timeInStation) {
        this.timeInStation = timeInStation;
    }

    public Integer getUploadFlag() {
        return uploadFlag;
    }

    public void setUploadFlag(Integer uploadFlag) {
        this.uploadFlag = uploadFlag;
    }

    public String getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(String uploadTime) {
        this.uploadTime = uploadTime;
    }

    public String getUploadRemark() {
        return uploadRemark;
    }

    public void setUploadRemark(String uploadRemark) {
        this.uploadRemark = uploadRemark;
    }
}
