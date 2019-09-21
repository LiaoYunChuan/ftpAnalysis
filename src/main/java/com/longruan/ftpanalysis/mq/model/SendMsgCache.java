package com.longruan.ftpanalysis.mq.model;

import com.longruan.ftpanalysis.mq.enums.EUploadFlag;

import java.io.Serializable;
import java.util.List;

/**
 * 推送消息缓存，用于RabbitMQ回调更新状态
 *
 * @author zoyation
 * @version 1.0.0
 * @ClassName com.longruan.dc.message.mq.receiver.model.BaseModel
 * @date 2019/5/13 14:39
 * @since 1.0.0
 **/
public class SendMsgCache implements Serializable {
    /**
     * redis Key
     */
    private String messageId;
    /**
     * 上传标志
     */
    private EUploadFlag uploadFlag;
    /**
     * 上传备注
     */
    private String uploadRemark;
    /**
     * 上传服务类beanId
     */
    private String uploadBeanId;
    /**
     * 数据主键id列表
     */
    private List<String> idList;

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public SendMsgCache() {

    }

    public SendMsgCache(String uploadBeanId, List<String> idList) {
        this.uploadBeanId = uploadBeanId;
        this.idList = idList;

    }

    public EUploadFlag getUploadFlag() {
        return uploadFlag;
    }

    public void setUploadFlag(EUploadFlag uploadFlag) {
        this.uploadFlag = uploadFlag;
    }

    public String getUploadRemark() {
        return uploadRemark;
    }

    public void setUploadRemark(String uploadRemark) {
        this.uploadRemark = uploadRemark;
    }

    public String getUploadBeanId() {
        return uploadBeanId;
    }

    public void setUploadBeanId(String uploadBeanId) {
        this.uploadBeanId = uploadBeanId;
    }

    public List<String> getIdList() {
        return idList;
    }

    public void setIdList(List<String> idList) {
        this.idList = idList;
    }

    @Override
    public String toString() {
        return "SendMsgCache{" +
                "uploadFlag=" + uploadFlag +
                ", uploadRemark='" + uploadRemark + '\'' +
                ", uploadBeanId='" + uploadBeanId + '\'' +
                ", idList=" + idList +
                '}';
    }
}
