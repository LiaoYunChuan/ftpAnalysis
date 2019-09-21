package com.longruan.ftpanalysis.mq.model;

public class PeronRTData {
    /**
     * 入井标识
     */
    private java.lang.Integer state;
    /**
     * 人员编号
     */
    private java.lang.String cardId;
    /**
     * 人员卡编号
     */
    private java.lang.String personId;
    /**
     * 数据生成时间
     */
    private java.lang.String dataTime;
    /**
     * 井下人数
     */
    private java.lang.Integer personCountInWell;
    /**
     * 入井时间
     */
    private java.lang.String timeInWell;
    /**
     * 出井时间
     */
    private java.lang.String timeOutWell;
    /**
     * 区域编号
     */
    private java.lang.Integer areaId;
    /**
     * 区域人数
     */
    private java.lang.Integer personCountInArea;
    /**
     * 进入区域时间
     */
    private java.lang.String timeInArea;
    /**
     * 分站编号
     */
    private java.lang.Integer stationId;
    /**
     * 分站人数
     */
    private java.lang.Integer personCountInStation;
    /**
     * 进入分站时间
     */
    private java.lang.String timeInStation;

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
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

    public String getDataTime() {
        return dataTime;
    }

    public void setDataTime(String dataTime) {
        this.dataTime = dataTime;
    }

    public Integer getPersonCountInWell() {
        return personCountInWell;
    }

    public void setPersonCountInWell(Integer personCountInWell) {
        this.personCountInWell = personCountInWell;
    }

    public String getTimeInWell() {
        return timeInWell;
    }

    public void setTimeInWell(String timeInWell) {
        this.timeInWell = timeInWell;
    }

    public String getTimeOutWell() {
        return timeOutWell;
    }

    public void setTimeOutWell(String timeOutWell) {
        this.timeOutWell = timeOutWell;
    }

    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    public Integer getPersonCountInArea() {
        return personCountInArea;
    }

    public void setPersonCountInArea(Integer personCountInArea) {
        this.personCountInArea = personCountInArea;
    }

    public String getTimeInArea() {
        return timeInArea;
    }

    public void setTimeInArea(String timeInArea) {
        this.timeInArea = timeInArea;
    }

    public Integer getStationId() {
        return stationId;
    }

    public void setStationId(Integer stationId) {
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
