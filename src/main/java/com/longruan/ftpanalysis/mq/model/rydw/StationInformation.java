package com.longruan.ftpanalysis.mq.model.rydw;

import com.longruan.ftpanalysis.batch.entity.MsgName;
import com.longruan.ftpanalysis.mq.consts.BatchConstants;
import com.longruan.ftpanalysis.mq.consts.MQConstants;

@MsgName(job = "实时数据", filePath = "*_HJSS_*", sysType = BatchConstants.SystemType.rydw, exchangeName = MQConstants.ExChanges.NC_PL_STATION)
public class StationInformation implements java.io.Serializable {
    /**
     * 数据时间
     */
    private java.lang.String dataTime;
    /**
     * 分站编号
     */
    private java.lang.Integer stationId;
    /**
     * 分站名称
     */
    private java.lang.String stationName;
    /**
     * x坐标
     */
    private java.lang.Double x;
    /**
     * y坐标
     */
    private java.lang.Double y;
    /**
     * 类型
     */
    private java.lang.String pointType;
    /**
     * 备注
     */
    private java.lang.String positionNote;
    /**
     * 重要分站
     */
    private java.lang.Integer isImportant;
    /**
     * 排序
     */
    private java.lang.Integer gId;
    /**
     * 删除标识
     */
    private java.lang.Integer deleteFlag;

    public String getDataTime() {
        return dataTime;
    }

    public void setDataTime(String dataTime) {
        this.dataTime = dataTime;
    }

    public Integer getStationId() {
        return stationId;
    }

    public void setStationId(Integer stationId) {
        this.stationId = stationId;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public Double getX() {
        return x;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public Double getY() {
        return y;
    }

    public void setY(Double y) {
        this.y = y;
    }

    public String getPointType() {
        return pointType;
    }

    public void setPointType(String pointType) {
        this.pointType = pointType;
    }

    public String getPositionNote() {
        return positionNote;
    }

    public void setPositionNote(String positionNote) {
        this.positionNote = positionNote;
    }

    public Integer getIsImportant() {
        return isImportant;
    }

    public void setIsImportant(Integer isImportant) {
        this.isImportant = isImportant;
    }

    public Integer getgId() {
        return gId;
    }

    public void setgId(Integer gId) {
        this.gId = gId;
    }

    public Integer getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Integer deleteFlag) {
        this.deleteFlag = deleteFlag;
    }
}
