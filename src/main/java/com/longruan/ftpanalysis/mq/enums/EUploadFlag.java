package com.longruan.ftpanalysis.mq.enums;

/**
 * 数据字典 未上传("0"), 上传中("1"), 上传成功("2"), 上传失败("3")
 *
 * @author zoyation
 * @version 1.0.0
 * @ClassName com.jeecg.dc.mq.enums.EOperateType
 * @date 2019/5/13 10:25
 * @since 1.0.0
 **/
public enum EUploadFlag {
    未上传(0), 上传中(1), 上传成功(2), 上传失败(3);
    private Integer value;

    private EUploadFlag(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }
}
