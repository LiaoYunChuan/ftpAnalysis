package com.longruan.ftpanalysis.mq.model.safety;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.longruan.ftpanalysis.batch.entity.FieldOrder;
import com.longruan.ftpanalysis.batch.entity.MsgName;
import com.longruan.ftpanalysis.mq.consts.BatchConstants;
import com.longruan.ftpanalysis.mq.consts.MQConstants;
import com.longruan.ftpanalysis.mq.model.MsgHead;

import java.io.Serializable;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * @ClassName Expanding
 * @Description 扩播设备实时数据
 * @Author LiaoYunChuan
 * @Date 2020/4/23 15:56
 * @Version 1.0
 */
@MsgName(job = "报警数据", filePath = "*BroadcastSysPointSync*", sysType = BatchConstants.SystemType.hjjc, exchangeName = MQConstants.ExChanges.EXPANDING)
public class Expanding extends MsgHead {
    private static final long serialVersionUID = 1L;
    @FieldOrder(order = 5)
    String expanding_no;
    @FieldOrder(order = 6)
    String expanding_address;
    @FieldOrder(order = 7)
    String expanding_name;
    @FieldOrder(order = 8)
    String time;
    @FieldOrder(order = 9)
    String expanding_status;
    @FieldOrder(order = 10)
    String mac;
    @FieldOrder(order = 11)
    String ip;
    @FieldOrder(order = 12)
    String type;
    @FieldOrder(order = 13)
    String infomation;


    public String getExpanding_no() {
        return expanding_no;
    }

    public void setExpanding_no(String expanding_no) {
        this.expanding_no = expanding_no;
    }

    public String getExpanding_address() {
        return expanding_address;
    }

    public void setExpanding_address(String expanding_address) {
        this.expanding_address = expanding_address;
    }

    public String getExpanding_name() {
        return expanding_name;
    }

    public void setExpanding_name(String expanding_name) {
        this.expanding_name = expanding_name;
    }

    @Override
    public String getTime() {
        return time;
    }

    @Override
    public void setTime(String time) {
        this.time = time;
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd/HH:mm:ss");
        try {
            this.time=sdf2.format(sdf1.parse(time));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public String getExpanding_status() {
        return expanding_status;
    }

    public void setExpanding_status(String expanding_status) {
        this.expanding_status = expanding_status;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getInfomation() {
        return infomation;
    }

    public void setInfomation(String infomation) {
        this.infomation = infomation;
    }
}
