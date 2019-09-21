package com.longruan.ftpanalysis.mq.send.impl;

import com.longruan.ftpanalysis.mq.config.SendRabbitMQConfig;
import com.longruan.ftpanalysis.mq.send.ISenderService;
import com.longruan.ftpanalysis.util.UUIDGenerator;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageProperties;
import org.springframework.amqp.rabbit.connection.CorrelationData;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 消息推送服务类
 * @author zoyation
 * @version 1.0.0
 * @ClassName com.longruan.dc.message.mq.sender.impl.SenderServiceImpl
 * @date 2019/5/16 14:42
 * @since 1.0.0
 **/
@Service
public class SenderServiceImpl implements ISenderService {
    @Resource(name = "sendToRabbitTemplate")
    private RabbitTemplate sendToRabbitTemplate;

    @Resource(name="sendRabbitMQConfig")
    private SendRabbitMQConfig sendRabbitMQConfig;
    @Override
    public String send(String exchange, String routingKey, Message message) {
        String messageId = UUIDGenerator.generate();
        MessageProperties messageProperties = message.getMessageProperties();
        messageProperties.setMessageId(messageId);
        message.getMessageProperties().setCorrelationId(messageId);
        messageProperties.setContentEncoding(sendRabbitMQConfig.getEncoding());
        CorrelationData correlationData = new CorrelationData(messageId);
        sendToRabbitTemplate.send(exchange, routingKey, message,correlationData);
        return messageId;
    }

    @Override
    public String send(String exchange, byte[] data) {
        MessageProperties messageProperties = new MessageProperties();
        Message message = new Message(data, messageProperties);
        return send(exchange, null, message);
    }

    @Override
    public String send(String exchange, Message message) {
        return send(exchange, null, message);
    }

    @Override
    public String send(String exchange, String routingKey, byte[] data) {
        MessageProperties messageProperties = new MessageProperties();
        Message message = new Message(data, messageProperties);
        return send(exchange, routingKey, message);
    }
}
