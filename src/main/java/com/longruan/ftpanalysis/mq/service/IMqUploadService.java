package com.longruan.ftpanalysis.mq.service;

import com.longruan.ftpanalysis.mq.model.SendMsgCache;

/**
 * 消息推送接口服务
 *
 * @author zoyation
 * @version 1.0.0
 * @ClassName com.jeecg.dc.mq.service.IMqUploadService
 * @date 2019/5/17 11:06
 * @since 1.0.0
 **/

public interface IMqUploadService  {

    /**
     * 上传消息
     */
    void uploadData();

    /**
     * 批量回调更新
     * @param sendMsgCache 发送消息类别
     */
    void batchUpdateCallBack(SendMsgCache sendMsgCache);
}
