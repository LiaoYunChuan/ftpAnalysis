package com.longruan.ftpanalysis.mq.model.emp;

import com.longruan.ftpanalysis.batch.entity.FieldOrder;
import com.longruan.ftpanalysis.batch.entity.MsgName;
import com.longruan.ftpanalysis.mq.consts.BatchConstants;
import com.longruan.ftpanalysis.mq.consts.MQConstants;

@MsgName(job = "区域参数", filePath = "*RYQY", sysType = BatchConstants.SystemType.rydw, exchangeName = MQConstants.ExChanges.EMP_AREA)
public class Area {

    @FieldOrder(order = 1)
    private String station_id;//分站编码
    @FieldOrder(order = 2)
    private String area_type;//区域类型
    @FieldOrder(order = 3)
    private String area_id;//区域编码
    @FieldOrder(order = 4)
    private String area_limit;//区域核定人数
    @FieldOrder(order = 5)
    private String area_name;//区域名称

    public String getStation_id() {
        return station_id;
    }

    public void setStation_id(String station_id) {
        this.station_id = station_id;
    }

    public String getArea_type() {
        return area_type;
    }

    public void setArea_type(String area_type) {
        this.area_type = area_type;
    }

    public String getArea_id() {
        return area_id;
    }

    public void setArea_id(String area_id) {
        this.area_id = area_id;
    }

    public String getArea_limit() {
        return area_limit;
    }

    public void setArea_limit(String area_limit) {
        this.area_limit = area_limit;
    }

    public String getArea_name() {
        return area_name;
    }

    public void setArea_name(String area_name) {
        this.area_name = area_name;
    }
}
