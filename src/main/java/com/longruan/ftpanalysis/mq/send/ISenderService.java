package com.longruan.ftpanalysis.mq.send;

import org.springframework.amqp.core.Message;

/**
 * 消息转发
 * @author zoyation
 * @version 1.0.0
 * @ClassName com.longruan.dc.message.mq.sender.ISenderService
 * @date 2019/5/16 14:40
 * @since 1.0.0
 **/
public interface ISenderService {
    /**
     * 发送rabbitMQ消息
     * @param exchange 交换器
     * @param routingKey 路由
     * @param message 消息
     */
    String send(String exchange, String routingKey, Message message);
    /**
     * 发送rabbitMQ消息
     * @param exchange 交换器
     * @param data 消息
     */
    String send(String exchange, byte[] data);

    /**
     * 发送rabbitMQ消息
     * @param exchange 交换器
     * @param message 消息
     */
    String send(String exchange, Message message);
    /**
     * 发送rabbitMQ消息
     * @param exchange 交换器
     * @param routingKey 路由
     * @param data 消息
     */
    String send(String exchange, String routingKey, byte[] data);
}
