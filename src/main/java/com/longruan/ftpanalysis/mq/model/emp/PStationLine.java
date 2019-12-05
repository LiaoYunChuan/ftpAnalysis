package com.longruan.ftpanalysis.mq.model.emp;

import com.longruan.ftpanalysis.batch.entity.FieldOrder;
import com.longruan.ftpanalysis.batch.entity.MsgName;
import com.longruan.ftpanalysis.mq.consts.BatchConstants;
import com.longruan.ftpanalysis.mq.consts.MQConstants;

@MsgName(job = "轨迹线数据", filePath = "*RYGJ", sysType = BatchConstants.SystemType.rydw, exchangeName = MQConstants.ExChanges.EMP_PSTATION_LINE)
public class PStationLine {

    @FieldOrder(order = 1)
    private String  mine_id;//煤矿编码1
    @FieldOrder(order = 2)
    private Integer gid;//轨迹线序号 2
    @FieldOrder(order = 3)
    private Integer startgid;//轨迹线起点顺序号 3
    @FieldOrder(order = 4)
    private Integer endgid;//轨迹线终点顺序号 4

    public String getMine_id() {
        return mine_id;
    }

    public void setMine_id(String mine_id) {
        this.mine_id = mine_id;
    }

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public Integer getStartgid() {
        return startgid;
    }

    public void setStartgid(Integer startgid) {
        this.startgid = startgid;
    }

    public Integer getEndgid() {
        return endgid;
    }

    public void setEndgid(Integer endgid) {
        this.endgid = endgid;
    }
}
