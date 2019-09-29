package com.longruan.ftpanalysis.mq.model;

import com.longruan.ftpanalysis.batch.entity.FieldOrder;
import org.apache.commons.lang3.time.DateFormatUtils;

import java.util.Date;

/**
 * 消息头
 *
 * @author zoyation
 * @version 1.0.0
 * @ClassName com.longruan.dc.message.mq.receiver.model.Head
 * @date 2019/5/13 14:40
 * @since 1.0.0
 **/
public class MsgHead {

    @FieldOrder(order = 1)
    String province;// 省
    @FieldOrder(order = 2)
    String city;// 市
    @FieldOrder(order = 3)
    String county;// 县
    @FieldOrder(order = 4)
    String mineId;// 矿
    private String upTime;


    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getMineId() {
        return mineId;
    }

    public void setMineId(String mineId) {
        this.mineId = mineId;
    }

    public String getUpTime() {
        return DateFormatUtils.format(new Date(), "yyyy-MM-dd HH:mm:ss");
    }

    public void setUpTime(String upTime) {
        this.upTime = upTime;
    }
}
