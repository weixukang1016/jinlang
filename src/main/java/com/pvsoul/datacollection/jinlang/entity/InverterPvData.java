package com.pvsoul.datacollection.jinlang.entity;

import java.util.Date;

public class InverterPvData {
    private Object id;

    private Object collectRecordId;

    private Object inverterDataId;

    private Integer u;

    private Integer i;

    private Date createTime;

    public Object getId() {
        return id;
    }

    public void setId(Object id) {
        this.id = id;
    }

    public Object getCollectRecordId() {
        return collectRecordId;
    }

    public void setCollectRecordId(Object collectRecordId) {
        this.collectRecordId = collectRecordId;
    }

    public Object getInverterDataId() {
        return inverterDataId;
    }

    public void setInverterDataId(Object inverterDataId) {
        this.inverterDataId = inverterDataId;
    }

    public Integer getU() {
        return u;
    }

    public void setU(Integer u) {
        this.u = u;
    }

    public Integer getI() {
        return i;
    }

    public void setI(Integer i) {
        this.i = i;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}