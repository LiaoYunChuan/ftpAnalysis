package com.longruan.ftpanalysis.mq.service.impl;

import com.longruan.ftpanalysis.mq.model.SendMsgCache;
import com.longruan.ftpanalysis.mq.enums.EUploadFlag;
import com.longruan.ftpanalysis.mq.service.IMqUploadService;
import com.longruan.ftpanalysis.util.ApplicationContextUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.connection.CorrelationData;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * 消息发送不成功时，消息回调
 *
 * @author zoyation
 * @version 1.0.0
 * @ClassName com.jeecg.dc.mq.send.impl.RabbitTemplateCallbackImpl
 * @date 2019/5/20 18:21
 * @since 1.0.0
 **/
@Service
public class RabbitTemplateCallbackService implements RabbitTemplate.ConfirmCallback, RabbitTemplate.ReturnCallback {
    @Autowired
    private MsgRedisService msgRedisService;
    Logger log = LoggerFactory.getLogger(this.getClass());
    /**
     * 消息发送到 Broker 后触发回调，确认消息是否到达 Broker 服务器，也就是只确认是否正确到达 Exchange 中
     *
     * @param correlationData
     * @param ack
     * @param cause
     */
    @Override
    public void confirm(CorrelationData correlationData, boolean ack, String cause) {
        EUploadFlag uploadFlag = ack ? EUploadFlag.上传成功 : EUploadFlag.上传失败;
        String messageId = correlationData.getId();
        System.err.println("消息 " + messageId + ","+ uploadFlag );
//        updateSendStatus(messageId, uploadFlag,cause);
    }

    /**
     * 失败后return回调
     * 如果发送到交换器成功，但是没有匹配的队列，就会触发这个回调
     *
     * @param message
     * @param replyCode
     * @param replyText
     * @param exchange
     * @param routingKey
     */
    @Override
    public void returnedMessage(Message message, int replyCode, String replyText, String exchange, String routingKey) {
        String messageId = message.getMessageProperties().getMessageId();
        updateSendStatus(messageId, EUploadFlag.上传失败, replyText);
//        System.out.println("send fail return-message = " + new String(message.getBody()) + ", replyCode: " + replyCode + ", replyText: " + replyText + ", exchange: " + exchange + ", routingKey: " + routingKey);
    }

    /**
     * 通过messageId结合缓存异步更新数据推送状态
     *
     * @param messageId    消息id
     * @param uploadFlag   消息上传状态
     * @param uploadRemark 上传备注
     */
    public void updateSendStatus(String messageId, EUploadFlag uploadFlag, String uploadRemark) {
        SendMsgCache sendMsgCache = msgRedisService.getCacheData(messageId);
        sendMsgCache.setMessageId(messageId);
        updateUploadStatus(uploadFlag,uploadRemark, sendMsgCache);
    }

    /**
     * 更新上传状态
     *
     * @param uploadFlag   上传状态
     * @param uploadRemark 上传备注
     * @param sendMsgCache 上传数据list
     */
    public void updateUploadStatus(EUploadFlag uploadFlag, String uploadRemark, SendMsgCache sendMsgCache) {
        if (sendMsgCache != null) {
            sendMsgCache.setUploadRemark(uploadRemark);
            sendMsgCache.setUploadFlag(uploadFlag);
            IMqUploadService uploadService = ApplicationContextUtil.getContext().getBean(sendMsgCache.getUploadBeanId(), IMqUploadService.class);
            uploadService.batchUpdateCallBack(sendMsgCache);
        }
    }
}
