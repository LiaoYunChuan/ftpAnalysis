package com.longruan.ftpanalysis.mq.model;

public class AreaInformation implements java.io.Serializable {
    /**
     * 区域编号
     */
    private java.lang.Integer areaId;
    /**
     * 区域名称
     */
    private java.lang.Integer areaName;
    /**
     * 区域类型
     */
    private java.lang.Integer areaType;
    /**
     * 数据生成时间
     */
    private java.lang.String dataTime;
    /**
     * 区域限定人数
     */
    private java.lang.Integer areaLimitPersonNum;
    /**
     * 删除标识
     */
    private java.lang.Integer deleteFlag;

    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    public Integer getAreaName() {
        return areaName;
    }

    public void setAreaName(Integer areaName) {
        this.areaName = areaName;
    }

    public Integer getAreaType() {
        return areaType;
    }

    public void setAreaType(Integer areaType) {
        this.areaType = areaType;
    }

    public String getDataTime() {
        return dataTime;
    }

    public void setDataTime(String dataTime) {
        this.dataTime = dataTime;
    }

    public Integer getAreaLimitPersonNum() {
        return areaLimitPersonNum;
    }

    public void setAreaLimitPersonNum(Integer areaLimitPersonNum) {
        this.areaLimitPersonNum = areaLimitPersonNum;
    }

    public Integer getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Integer deleteFlag) {
        this.deleteFlag = deleteFlag;
    }
}
