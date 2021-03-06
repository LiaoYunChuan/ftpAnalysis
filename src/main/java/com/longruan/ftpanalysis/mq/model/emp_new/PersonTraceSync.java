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

@MsgName(job = "人员轨迹数据", filePath = "*PersonTraceSync*", sysType = BatchConstants.SystemType.rydw, exchangeName = MQConstants.ExChanges.EMP_SYNC_TRACE)
public class PersonTraceSync extends MsgHead {

    @FieldOrder(order = 5)
    private String person_id;//人员唯一编码
    @FieldOrder(order = 6)
    private String name;//人员姓名
    @FieldOrder(order = 7)
    private String department;//部门
    @FieldOrder(order = 8)
    private String duty;//职务
    @FieldOrder(order = 9)
    private String work_type;//工种
    @FieldOrder(order = 10)
    private String card_id;//卡号
    @FieldOrder(order = 11)
    private String job_num;//工号
    @FieldOrder(order = 12)
    private String current_dev_id;//所在位置设备编号
    @FieldOrder(order = 13)
    private String current_dev_location;//所在位置设备地址
    @FieldOrder(order = 14)
    @JsonFormat(pattern = "yyyy/MM/dd HH:mm:ss", timezone = "GMT+8")
    private String collect_time_str;//采集时间
    private Timestamp collect_time;
    @FieldOrder(order = 15)
    private Float distance;//距离， 精确人员定位使用
    @FieldOrder(order = 16)
    private String remakr;

    private String time;

    @Override
    public String getTime() {
        return time;
    }

    @Override
    public void setTime(String time) {
        this.time = time;
    }

    public String getPerson_id() {
        return person_id;
    }

    public void setPerson_id(String person_id) {
        this.person_id = person_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDuty() {
        return duty;
    }

    public void setDuty(String duty) {
        this.duty = duty;
    }

    public String getWork_type() {
        return work_type;
    }

    public void setWork_type(String work_type) {
        this.work_type = work_type;
    }

    public String getCard_id() {
        return card_id;
    }

    public void setCard_id(String card_id) {
        this.card_id = card_id;
    }

    public String getJob_num() {
        return job_num;
    }

    public void setJob_num(String job_num) {
        this.job_num = job_num;
    }

    public String getCurrent_dev_id() {
        return current_dev_id;
    }

    public void setCurrent_dev_id(String current_dev_id) {
        this.current_dev_id = current_dev_id;
    }

    public String getCurrent_dev_location() {
        return current_dev_location;
    }

    public void setCurrent_dev_location(String current_dev_location) {
        this.current_dev_location = current_dev_location;
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
        this.collect_time = Timestamp.valueOf(formatTime);
        this.time = sdf3.format(sdf1.parse(collect_time_str));
        ;
    }

    public Timestamp getCollect_time() {
        return collect_time;
    }

    public void setCollect_time(Timestamp collect_time) {
        this.collect_time = collect_time;
    }

    public Float getDistance() {
        return distance;
    }

    public void setDistance(Float distance) {
        this.distance = distance;
    }

    public String getRemakr() {
        return remakr;
    }

    public void setRemakr(String remakr) {
        this.remakr = remakr;
    }
}
