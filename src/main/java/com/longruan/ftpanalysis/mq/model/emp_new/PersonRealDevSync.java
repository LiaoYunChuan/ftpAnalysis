package com.longruan.ftpanalysis.mq.model.emp_new;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.longruan.ftpanalysis.batch.entity.FieldOrder;
import com.longruan.ftpanalysis.batch.entity.MsgName;
import com.longruan.ftpanalysis.mq.consts.BatchConstants;
import com.longruan.ftpanalysis.mq.consts.MQConstants;
import com.longruan.ftpanalysis.mq.model.MsgHead;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;

@MsgName(job = "设备实时数据", filePath = "*PersonRealDevSync*", sysType = BatchConstants.SystemType.rydw, exchangeName = MQConstants.ExChanges.EMP_SYNC_DEV)
public class PersonRealDevSync extends MsgHead {

    @FieldOrder(order = 5)
    private String dev_id;//设备编号， 唯一识别码
    @FieldOrder(order = 6)
    private String location;//测点地址
    @FieldOrder(order = 7)
    private String type_name;//设备类型名称
    @FieldOrder(order = 8)
    @JsonFormat(pattern = "yyyy/MM/dd HH:mm:ss", timezone = "GMT+8")
    private String collect_time_str;//采集时间
    private Timestamp collect_time;
    @FieldOrder(order = 9)
    private String type;//设备类型（0:人员分站，8：人员识别器，9：人员区域）
    @FieldOrder(order = 10)
    private String status;//状态： 设备状态（分站：0：通讯中断，3：交流正常，4：直 流正常；识别器：21：正常，20：断线）
    @FieldOrder(order = 11)
    private String mac;//设备连接的 MAC 地址
    @FieldOrder(order = 12)
    private String ip;//设备连接的 IP 地址
    @FieldOrder(order = 13)
    private Integer person_num;//当前人数
    @FieldOrder(order = 14)
    private String is_alarm;//是否报警（0：正常，1：报警）
    @FieldOrder(order = 15)
    private String expand_info;//扩展实时数据信息
    @FieldOrder(order = 16)
    private String remark;//备注
    private String time;

    @Override
    public String getTime() {
        return time;
    }

    @Override
    public void setTime(String time) {
        this.time = time;
    }

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

    public String getType_name() {
        return type_name;
    }

    public void setType_name(String type_name) {
        this.type_name = type_name;
    }

    public String getCollect_time_str() {
        return collect_time_str;
    }

    public void setCollect_time_str(String collect_time_str) throws ParseException {
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd/HH:mm:ss");
        this.collect_time_str = collect_time_str;
        String formatTime = sdf2.format(sdf1.parse(collect_time_str));
        this.collect_time=Timestamp.valueOf(formatTime);
        this.time = sdf3.format(sdf1.parse(collect_time_str));
    }

    public Timestamp getCollect_time() {
        return collect_time;
    }

    public void setCollect_time(Timestamp collect_time) {
        this.collect_time = collect_time;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

    public Integer getPerson_num() {
        return person_num;
    }

    public void setPerson_num(Integer person_num) {
        this.person_num = person_num;
    }

    public String getIs_alarm() {
        return is_alarm;
    }

    public void setIs_alarm(String is_alarm) {
        this.is_alarm = is_alarm;
    }

    public String getExpand_info() {
        return expand_info;
    }

    public void setExpand_info(String expand_info) {
        this.expand_info = expand_info;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
