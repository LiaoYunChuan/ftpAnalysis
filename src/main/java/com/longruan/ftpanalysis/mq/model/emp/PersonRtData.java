package com.longruan.ftpanalysis.mq.model.emp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.longruan.ftpanalysis.batch.entity.FieldOrder;
import com.longruan.ftpanalysis.batch.entity.MsgName;
import com.longruan.ftpanalysis.mq.consts.BatchConstants;
import com.longruan.ftpanalysis.mq.consts.MQConstants;
import com.longruan.ftpanalysis.mq.model.MsgHead;

import java.sql.Timestamp;

@MsgName(job = "人员实时数据", filePath = "*PersonRealSync", sysType = BatchConstants.SystemType.rydw, exchangeName = MQConstants.ExChanges.EMP_RYSS)
public class PersonRtData extends MsgHead {

    @FieldOrder(order = 5)
    private String person_id;//人员卡编码
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
    private String current_location;//当前位置
    @FieldOrder(order = 13)
    @JsonFormat(pattern = "yyyy/MM/dd HH:mm:ss", timezone = "GMT+8")
    private Timestamp current_time;//当前位置时间
    @FieldOrder(order = 14)
    private String in_well_location;//下井位置
    @FieldOrder(order = 15)
    @JsonFormat(pattern = "yyyy/MM/dd HH:mm:ss", timezone = "GMT+8")
    private Timestamp in_well_time;//下井时间
    @FieldOrder(order = 16)
    private String source_location;//来源位置
    @FieldOrder(order = 17)
    @JsonFormat(pattern = "yyyy/MM/dd HH:mm:ss", timezone = "GMT+8")
    private Timestamp source_time;//来源时间
    @FieldOrder(order = 18)
    private String bc_name;//班次名称

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

    public String getCurrent_location() {
        return current_location;
    }

    public void setCurrent_location(String current_location) {
        this.current_location = current_location;
    }

    public Timestamp getCurrent_time() {
        return current_time;
    }

    public void setCurrent_time(Timestamp current_time) {
        this.current_time = current_time;
    }

    public String getIn_well_location() {
        return in_well_location;
    }

    public void setIn_well_location(String in_well_location) {
        this.in_well_location = in_well_location;
    }

    public Timestamp getIn_well_time() {
        return in_well_time;
    }

    public void setIn_well_time(Timestamp in_well_time) {
        this.in_well_time = in_well_time;
    }

    public String getSource_location() {
        return source_location;
    }

    public void setSource_location(String source_location) {
        this.source_location = source_location;
    }

    public Timestamp getSource_time() {
        return source_time;
    }

    public void setSource_time(Timestamp source_time) {
        this.source_time = source_time;
    }

    public String getBc_name() {
        return bc_name;
    }

    public void setBc_name(String bc_name) {
        this.bc_name = bc_name;
    }
}
