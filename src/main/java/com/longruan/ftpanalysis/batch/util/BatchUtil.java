package com.longruan.ftpanalysis.batch.util;

import com.longruan.ftpanalysis.batch.entity.MsgName;

public class BatchUtil {

    public static MsgName getMsgNameAttr(Class jobClass){
       return  (MsgName) jobClass.getAnnotation(MsgName.class);
    }

}
