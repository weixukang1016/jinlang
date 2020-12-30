package com.pvsoul.datacollection.jinlang.entity;

import java.util.Date;

public class collect_record {
    private Object id;

    private String sn;

    private String collectorVer;

    private Short collectorType;

    private Short rssiLevel;

    private Short rssi;

    private Date collectTime;

    private Date createTime;

    public Object getId() {
        return id;
    }

    public void setId(Object id) {
        this.id = id;
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public String getCollectorVer() {
        return collectorVer;
    }

    public void setCollectorVer(String collectorVer) {
        this.collectorVer = collectorVer;
    }

    public Short getCollectorType() {
        return collectorType;
    }

    public void setCollectorType(Short collectorType) {
        this.collectorType = collectorType;
    }

    public Short getRssiLevel() {
        return rssiLevel;
    }

    public void setRssiLevel(Short rssiLevel) {
        this.rssiLevel = rssiLevel;
    }

    public Short getRssi() {
        return rssi;
    }

    public void setRssi(Short rssi) {
        this.rssi = rssi;
    }

    public Date getCollectTime() {
        return collectTime;
    }

    public void setCollectTime(Date collectTime) {
        this.collectTime = collectTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}