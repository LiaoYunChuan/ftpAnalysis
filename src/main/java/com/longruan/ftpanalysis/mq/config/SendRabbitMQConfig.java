package com.longruan.ftpanalysis.mq.config;

import com.longruan.ftpanalysis.mq.service.impl.RabbitTemplateCallbackService;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitAdmin;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.SimpleMessageConverter;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 服务器推送配置
 *
 * @author zoyation
 * @version 1.0.0
 * @ClassName com.longruan.dc.message.mq.config.SendRabbitMQConfig
 * @date 2019/4/15 17:44
 * @since 1.0.0
 **/
@Configuration(value = "sendRabbitMQConfig")
public class SendRabbitMQConfig {
    /**
     * 接收服务器地址
     */
    @Value("${spring.rabbitmq.addresses}")
    private String addresses;

    /**
     * 接收服务器用户名
     */
    @Value("${spring.rabbitmq.username}")
    private String username;
    /**
     * 接收服务器密码
     */
    @Value("${spring.rabbitmq.password}")
    private String password;

    @Value("${spring.rabbitmq.virtual-host}")
    private String virtualHost;

    @Value("${rabbitmq.encoding}")
    private String encoding;

    /**
     * ConfirmCallback 接口，消息发送到 Broker 后触发回调，确认消息是否到达 Broker 服务器，也就是只确认是否正确到达 Exchange 中
     */
    @Value("${spring.rabbitmq.publisher-confirms}")
    private boolean publisherConfirms;
    /**
     * ReturnCallback  启动消息失败返回，比如路由不到队列时触发回调
     */
    @Value("${spring.rabbitmq.publisher-returns}")
    private boolean publisherReturns;

    /**
     * 创建工厂连接
     *
     * @return
     */
    @Bean(name = "sendToConnectionFactory")
    public ConnectionFactory connectionFactory() {
        CachingConnectionFactory connectionFactory = new CachingConnectionFactory();
        connectionFactory.setAddresses(this.addresses);
        connectionFactory.setUsername(this.username);
        connectionFactory.setPassword(this.password);
        connectionFactory.setVirtualHost(virtualHost);
        // 设置 生产者 confirms
        connectionFactory.setPublisherConfirms(publisherConfirms);
        // 设置 生产者 Returns
        connectionFactory.setPublisherReturns(publisherReturns);
        return connectionFactory;
    }

    //rabbitmq的模板配置
    @Bean(name = "sendToRabbitTemplate")
    public RabbitTemplate getSendToRabbitTemplate(RabbitTemplateCallbackService rabbitTemplateCallback, @Qualifier("sendToConnectionFactory") ConnectionFactory connectionFactory) {
        RabbitTemplate rabbitTemplate = new RabbitTemplate(connectionFactory);
        rabbitTemplate.setMessageConverter(new SimpleMessageConverter());
        //Mandatory参数设为true时，如果目的不可达，会发送消息给生产者，生产者通过调函数来获取该信息
        rabbitTemplate.setMandatory(true);
        //消息发送到 Broker 后触发回调，确认消息是否到达 Broker 服务器，也就是只确认是否正确到达 Exchange 中
        rabbitTemplate.setConfirmCallback(rabbitTemplateCallback);
        // 设置 ReturnCallback 回调 如果发送到交换器成功，但是没有匹配的队列，就会触发这个回调
        rabbitTemplate.setReturnCallback(rabbitTemplateCallback);
        return rabbitTemplate;
    }
    //    配置RabbitAdmin来管理rabbit
    @Bean
    public RabbitAdmin rabbitAdmin(@Qualifier("sendToConnectionFactory") ConnectionFactory connectionFactory) {
        RabbitAdmin rabbitAdmin = new RabbitAdmin(connectionFactory);
        //用RabbitAdmin一定要配置这个，spring加载的是后就会加载这个类================特别重要
        rabbitAdmin.setAutoStartup(true);
        return rabbitAdmin;
    }
    public String getAddresses() {
        return addresses;
    }

    public void setAddresses(String addresses) {
        this.addresses = addresses;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getVirtualHost() {
        return virtualHost;
    }

    public void setVirtualHost(String virtualHost) {
        this.virtualHost = virtualHost;
    }

    public String getEncoding() {
        return encoding;
    }

    public void setEncoding(String encoding) {
        this.encoding = encoding;
    }

    public boolean isPublisherConfirms() {
        return publisherConfirms;
    }

    public void setPublisherConfirms(boolean publisherConfirms) {
        this.publisherConfirms = publisherConfirms;
    }

    public boolean isPublisherReturns() {
        return publisherReturns;
    }

    public void setPublisherReturns(boolean publisherReturns) {
        this.publisherReturns = publisherReturns;
    }
}
