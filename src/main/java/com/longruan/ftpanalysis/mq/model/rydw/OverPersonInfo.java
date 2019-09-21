package com.longruan.ftpanalysis.mq.model.rydw;

import com.longruan.ftpanalysis.batch.entity.FieldOrder;
import com.longruan.ftpanalysis.batch.entity.FieldOrders;
import com.longruan.ftpanalysis.batch.entity.MsgName;
import com.longruan.ftpanalysis.mq.consts.BatchConstants;
import com.longruan.ftpanalysis.mq.consts.MQConstants;

import java.util.Date;

@MsgName(job = "超员/进入限制区域报警", filePath = "*_DWCY_*", sysType = BatchConstants.SystemType.rydw, exchangeName = MQConstants.ExChanges.NC_PL_OVERPERSONDATA)
public class OverPersonInfo {

    /**
     * 数据时间
     */
    private java.lang.String dataTime;
    /**
     * 人员编号
     */

    private java.lang.String cardId;
    /**
     * 人员卡编号
     */
    private java.lang.String personId;
    /**
     * 超员类别
     */
    @FieldOrders({
            @FieldOrder(order = 1),
    })
    private java.lang.Integer overPersonType;
    /**
     * 矿井限定人数
     */
    @FieldOrders({
            @FieldOrder(order = 2),
    })
    private java.lang.Integer limitPersonNum;
    /**
     * 井下人数
     */
    @FieldOrders({
            @FieldOrder(order = 3),
    })
    private java.lang.Integer personCount;
    /**
     * 入井时间
     */
    private String timeInWell;
    /**
     * 报警开始时间
     */
    @FieldOrders({
            @FieldOrder(order = 6)
    })
    private String alarmSTime;
    /**
     * 报警结束时间
     */
    @FieldOrders({
            @FieldOrder(order = 7),
    })
    private String alarmETime;
    /**
     * 区域编号
     */
    @FieldOrders({
            @FieldOrder(order = 4),
    })
    private java.lang.String areaId;
    /**
     * 进入区域时间
     */
    private java.util.Date timeInArea;
    /**
     * 分站编号
     */
    @FieldOrders({
            @FieldOrder(order = 4),
    })
    private java.lang.String stationId;
    /**
     * 分站人数
     */
    @FieldOrders({
            @FieldOrder(order = 3),
    })
    private java.lang.Integer personCountInStation;
    /**
     * 进入分站时间
     */
    private String timeInStation;

    public String getDataTime() {
        return dataTime;
    }

    public void setDataTime(String dataTime) {
        this.dataTime = dataTime;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public Integer getOverPersonType() {
        return overPersonType;
    }

    public void setOverPersonType(Integer overPersonType) {
        this.overPersonType = overPersonType;
    }

    public Integer getLimitPersonNum() {
        return limitPersonNum;
    }

    public void setLimitPersonNum(Integer limitPersonNum) {
        this.limitPersonNum = limitPersonNum;
    }

    public Integer getPersonCount() {
        return personCount;
    }

    public void setPersonCount(Integer personCount) {
        this.personCount = personCount;
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

    public String getAreaId() {
        return areaId;
    }

    public void setAreaId(String areaId) {
        this.areaId = areaId;
    }

    public Date getTimeInArea() {
        return timeInArea;
    }

    public void setTimeInArea(Date timeInArea) {
        this.timeInArea = timeInArea;
    }

    public String getStationId() {
        return stationId;
    }

    public void setStationId(String stationId) {
        this.stationId = stationId;
    }

    public Integer getPersonCountInStation() {
        return personCountInStation;
    }

    public void setPersonCountInStation(Integer personCountInStation) {
        this.personCountInStation = personCountInStation;
    }

    public String getTimeInStation() {
        return timeInStation;
    }

    public void setTimeInStation(String timeInStation) {
        this.timeInStation = timeInStation;
    }
}