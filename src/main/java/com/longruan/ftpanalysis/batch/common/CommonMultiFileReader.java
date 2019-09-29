package com.longruan.ftpanalysis.batch.common;

import com.longruan.ftpanalysis.batch.config.BatchConfig;
import com.longruan.ftpanalysis.batch.entity.MsgName;
import org.springframework.batch.item.file.MultiResourceItemReader;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

public class CommonMultiFileReader extends MultiResourceItemReader {


    public CommonMultiFileReader(BatchConfig batchConfig, String stepMark, Class clz) throws Exception {
        MsgName msgName = (MsgName) clz.getAnnotation(MsgName.class);
        if (msgName == null) throw new ClassNotFoundException();

        PathMatchingResourcePatternResolver patternResolver = new PathMatchingResourcePatternResolver();
        String readPath = "file:" + batchConfig.getSystemPath(msgName.sysType()) + "/" + stepMark + "/" + msgName.filePath();
        System.err.println("读取文件路径: " + readPath);
        Resource[] resources = patternResolver.getResources(readPath);//动态读取资源列表
        System.err.println("文件个数: " + resources.length);
        setResources(resources);
        setDelegate(new CommonFileReader(clz));
    }

}
