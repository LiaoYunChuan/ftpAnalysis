package com.longruan.ftpanalysis.mq.model.emp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.longruan.ftpanalysis.batch.entity.FieldOrder;
import com.longruan.ftpanalysis.batch.entity.MsgName;
import com.longruan.ftpanalysis.mq.consts.BatchConstants;
import com.longruan.ftpanalysis.mq.consts.MQConstants;

import java.sql.Timestamp;

@MsgName(job = "人员异常数据", filePath = "*RYYC", sysType = BatchConstants.SystemType.rydw, exchangeName = MQConstants.ExChanges.EMP_SYS_EX)
public class SysEx {

    @FieldOrder(order = 1)
    private String mine_id;//煤矿编码
    @FieldOrder(order = 2)
    private String group_name;//	集团名称（不超过5个汉字长度）；
    @FieldOrder(order = 3)
    private String company_name;//	公司名称
    @FieldOrder(order = 4)
    private String short_mine_name;//	煤矿简称（不超过5个汉字长度）；
    @FieldOrder(order = 5)
    @JsonFormat(pattern = "yyyy-MM-dd/HH:mm:ss", timezone = "GMT+8")
    private Timestamp snap_time;//文件生成时刻
    @FieldOrder(order = 6)
    private String ex_status;//状态
    @FieldOrder(order = 7)
    @JsonFormat(pattern = "yyyy-MM-dd/HH:mm:ss", timezone = "GMT+8")
    private Timestamp ex_start;//发生异常时间
    @FieldOrder(order = 8)
    @JsonFormat(pattern = "yyyy-MM-dd/HH:mm:ss", timezone = "GMT+8")
    private Timestamp ex_end;//异常结束时间

    public String getMine_id() {
        return mine_id;
    }

    public void setMine_id(String mine_id) {
        this.mine_id = mine_id;
    }

    public String getGroup_name() {
        return group_name;
    }

    public void setGroup_name(String group_name) {
        this.group_name = group_name;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public String getShort_mine_name() {
        return short_mine_name;
    }

    public void setShort_mine_name(String short_mine_name) {
        this.short_mine_name = short_mine_name;
    }

    public Timestamp getSnap_time() {
        return snap_time;
    }

    public void setSnap_time(Timestamp snap_time) {
        this.snap_time = snap_time;
    }

    public String getEx_status() {
        return ex_status;
    }

    public void setEx_status(String ex_status) {
        this.ex_status = ex_status;
    }

    public Timestamp getEx_start() {
        return ex_start;
    }

    public void setEx_start(Timestamp ex_start) {
        this.ex_start = ex_start;
    }

    public Timestamp getEx_end() {
        return ex_end;
    }

    public void setEx_end(Timestamp ex_end) {
        this.ex_end = ex_end;
    }
}
