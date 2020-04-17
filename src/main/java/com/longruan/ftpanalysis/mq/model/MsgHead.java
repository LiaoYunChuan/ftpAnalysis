package com.longruan.ftpanalysis.mq.model;

import com.longruan.ftpanalysis.batch.entity.FieldOrder;

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
    String mine_id;// 矿
    String mineid;// 矿
    private String time;

    public String getProvince() {
        this.province = "安徽省";
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

    public String getMine_id() {
        return mine_id;
    }

    public void setMine_id(String mine_id) {
        this.mine_id = mine_id;
        this.mineid = mine_id;
    }

    public String getMineid() {
        return mineid;
    }

    public void setMineid(String mineid) {
        this.mineid = mineid;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
