package com.longruan.ftpanalysis.mq.model.emp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.longruan.ftpanalysis.batch.entity.FieldOrder;
import com.longruan.ftpanalysis.batch.entity.MsgName;
import com.longruan.ftpanalysis.mq.consts.BatchConstants;
import com.longruan.ftpanalysis.mq.consts.MQConstants;
import com.longruan.ftpanalysis.mq.model.MsgHead;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;

@MsgName(job = "人员实时数据", filePath = "*PersonRealSync*", sysType = BatchConstants.SystemType.rydw, exchangeName = MQConstants.ExChanges.EMP_SYNC_RTDATA)
public class PersonRtData extends MsgHead {

    @FieldOrder(order = 5)
    private String person_id;//人员卡编码
    @FieldOrder(order = 6)
    private String person_name;//人员姓名
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
    private String station_id;//当前位置
    @FieldOrder(order = 13)
    @JsonFormat(pattern = "yyyy/MM/dd HH:mm:ss", timezone = "GMT+8")
    private String snap_time_str;//当前位置时间
    private Timestamp snap_time;
    @FieldOrder(order = 14)
    private String in_well_location;//下井位置
    @FieldOrder(order = 15)
    @JsonFormat(pattern = "yyyy/MM/dd HH:mm:ss", timezone = "GMT+8")
    private String well_in_str;//下井时间
    private Timestamp well_in;
    @FieldOrder(order = 16)
    private String source_location;//来源位置
    @FieldOrder(order = 17)
    @JsonFormat(pattern = "yyyy/MM/dd HH:mm:ss", timezone = "GMT+8")
    private String source_time_str;//来源时间
    private Timestamp source_time;
    @FieldOrder(order = 18)
    private String bc_name;//班次名称
    @FieldOrder(order = 19)
    private String remark;

    public String getPerson_id() {
        return person_id;
    }

    public void setPerson_id(String person_id) {
        this.person_id = person_id;
    }

    public String getPerson_name() {
        return person_name;
    }

    public void setPerson_name(String person_name) {
        this.person_name = person_name;
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

    public String getStation_id() {
        return station_id;
    }

    public void setStation_id(String station_id) {
        this.station_id = station_id;
    }

    public String getSnap_time_str() {
        return snap_time_str;
    }

    public void setSnap_time_str(String snap_time_str) throws ParseException {
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        this.snap_time_str = snap_time_str;
        this.snap_time=Timestamp.valueOf(sdf2.format(sdf1.parse(snap_time_str)));
    }

    public Timestamp getSnap_time() {
        return snap_time;
    }

    public void setSnap_time(Timestamp snap_time) {
        this.snap_time = snap_time;
    }

    public String getIn_well_location() {
        return in_well_location;
    }

    public void setIn_well_location(String in_well_location) {
        this.in_well_location = in_well_location;
    }

    public String getWell_in_str() {
        return well_in_str;
    }

    public void setWell_in_str(String well_in_str) throws ParseException {
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        this.well_in_str = well_in_str;
        this.well_in=Timestamp.valueOf(sdf2.format(sdf1.parse(well_in_str)));
    }

    public Timestamp getWell_in() {
        return well_in;
    }

    public void setWell_in(Timestamp well_in) {
        this.well_in = well_in;
    }

    public String getSource_location() {
        return source_location;
    }

    public void setSource_location(String source_location) {
        this.source_location = source_location;
    }

    public String getSource_time_str() {
        return source_time_str;
    }

    public void setSource_time_str(String source_time_str) throws ParseException {
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        this.source_time_str = source_time_str;
        this.source_time=Timestamp.valueOf(sdf2.format(sdf1.parse(source_time_str)));
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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

}
