package com.longruan.ftpanalysis.mq.model;

import com.longruan.ftpanalysis.batch.entity.FieldOrder;

/**
 * 自动化消息头
 *
 * @author zoyation
 * @version 1.0.0
 * @ClassName com.longruan.dc.message.mq.receiver.model.Head
 * @date 2019/5/13 14:40
 * @since 1.0.0
 **/
public class AutoMsgHead {

    @FieldOrder(order = 1)
    String province;// 省
    @FieldOrder(order = 2)
    String city;// 市
    @FieldOrder(order = 3)
    String mine_name;// 矿名
    @FieldOrder(order = 3)
    String mine_id;// 矿id

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

    public String getMine_name() {
        return mine_name;
    }

    public void setMine_name(String mine_name) {
        this.mine_name = mine_name;
    }

    public String getMine_id() {
        return mine_id;
    }

    public void setMine_id(String mine_id) {
        this.mine_id = mine_id;
    }
}
