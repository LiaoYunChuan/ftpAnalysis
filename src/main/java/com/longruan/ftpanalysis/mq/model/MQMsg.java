package com.longruan.ftpanalysis.mq.model;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

/**
 * 接收消息基础对象
 *
 * @author zoyation
 * @version 1.0.0
 * @ClassName com.longruan.dc.message.mq.receiver.model.BaseModel
 * @date 2019/5/13 14:39
 * @since 1.0.0
 **/
public class MQMsg {
    /**
     * 消息头部
     */
    @JSONField(name = "head")
    private MsgHead head;
    /**
     * 消息体
     */
    @JSONField(name = "data")
    private List<?> data;
    /**
     * 消息主键id列表
     */
    @JSONField(serialize = false, deserialize = false)
    private List<String> idList;

    public MsgHead getHead() {
        return head;
    }

    public void setHead(MsgHead head) {
        this.head = head;
    }

    public List<?> getData() {
        return data;
    }

    public void setData(List<?> data) {
        this.data = data;
    }

    public List<String> getIdList() {
        return idList;
    }

    public void setIdList(List<String> idList) {
        this.idList = idList;
    }

    @Override
    public String toString() {
        return "MQMsg{" +
                "head=" + head +
                ", data=" + data +
                ", idList=" + idList +
                '}';
    }
}
