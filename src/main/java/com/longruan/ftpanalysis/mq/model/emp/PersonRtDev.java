package com.longruan.ftpanalysis.mq.model.emp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.longruan.ftpanalysis.batch.entity.FieldOrder;
import com.longruan.ftpanalysis.batch.entity.MsgName;
import com.longruan.ftpanalysis.mq.consts.BatchConstants;
import com.longruan.ftpanalysis.mq.consts.MQConstants;
import com.longruan.ftpanalysis.mq.model.MsgHead;

import java.sql.Timestamp;

@MsgName(job = "人员实时设备", filePath = "*PersonRealDevSync", sysType = BatchConstants.SystemType.rydw, exchangeName = MQConstants.ExChanges.EMP_SYNC_DEV)
public class PersonRtDev extends MsgHead {

    @FieldOrder(order = 5)
    private String dev_id;//设备编号， 唯一识别码
    @FieldOrder(order = 6)
    private String location;//测点地址
    @FieldOrder(order = 7)
    private String dev_type_name;//设备类型名称
    @FieldOrder(order = 8)
    @JsonFormat(pattern = "yyyy/MM/dd HH:mm:ss", timezone = "GMT+8")
    private Timestamp collect_time;//采集时间
    @FieldOrder(order = 9)
    private String dev_type;//设备类型（0:人员分站，8：人员识别器，9：人员区域）
    @FieldOrder(order = 10)
    private String status;//状态： 设备状态（分站：0：通讯中断，3：交流正常，4：直 流正常；识别器：21：正常，20：断线）
    @FieldOrder(order = 11)
    private String mac;//设备连接的 MAC 地址
    @FieldOrder(order = 12)
    private String ip;//设备连接的 IP 地址
    @FieldOrder(order = 13)
    private Integer current_time;//当前人数
    @FieldOrder(order = 14)
    private String in_well_location;//是否报警（0：正常，1：报警）
    @FieldOrder(order = 15)
    private String msg;//扩展实时数据信息


    public String getDev_id() {
        return dev_id;
    }

    public void setDev_id(String dev_id) {
        this.dev_id = dev_id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDev_type_name() {
        return dev_type_name;
    }

    public void setDev_type_name(String dev_type_name) {
        this.dev_type_name = dev_type_name;
    }

    public Timestamp getCollect_time() {
        return collect_time;
    }

    public void setCollect_time(Timestamp collect_time) {
        this.collect_time = collect_time;
    }

    public String getDev_type() {
        return dev_type;
    }

    public void setDev_type(String dev_type) {
        this.dev_type = dev_type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Integer getCurrent_time() {
        return current_time;
    }

    public void setCurrent_time(Integer current_time) {
        this.current_time = current_time;
    }

    public String getIn_well_location() {
        return in_well_location;
    }

    public void setIn_well_location(String in_well_location) {
        this.in_well_location = in_well_location;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
