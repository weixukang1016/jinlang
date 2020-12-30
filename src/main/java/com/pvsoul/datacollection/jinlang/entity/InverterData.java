package com.pvsoul.datacollection.jinlang.entity;

import java.util.Date;

public class InverterData {
    private Object id;

    private Object collectRecordId;

    private String inverterSn;

    private String inverterModel;

    private Integer ratedPower;

    private String inverterVer;

    private Integer eToday;

    private Integer eMonth;

    private Integer eYear;

    private Integer eTotal;

    private Integer inverterTemp;

    private String state;

    private String alarmCn;

    private String alarmEn;

    private Integer fac;

    private Integer pac;

    private Integer nationalCode;

    private String national;

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

    public String getInverterSn() {
        return inverterSn;
    }

    public void setInverterSn(String inverterSn) {
        this.inverterSn = inverterSn;
    }

    public String getInverterModel() {
        return inverterModel;
    }

    public void setInverterModel(String inverterModel) {
        this.inverterModel = inverterModel;
    }

    public Integer getRatedPower() {
        return ratedPower;
    }

    public void setRatedPower(Integer ratedPower) {
        this.ratedPower = ratedPower;
    }

    public String getInverterVer() {
        return inverterVer;
    }

    public void setInverterVer(String inverterVer) {
        this.inverterVer = inverterVer;
    }

    public Integer geteToday() {
        return eToday;
    }

    public void seteToday(Integer eToday) {
        this.eToday = eToday;
    }

    public Integer geteMonth() {
        return eMonth;
    }

    public void seteMonth(Integer eMonth) {
        this.eMonth = eMonth;
    }

    public Integer geteYear() {
        return eYear;
    }

    public void seteYear(Integer eYear) {
        this.eYear = eYear;
    }

    public Integer geteTotal() {
        return eTotal;
    }

    public void seteTotal(Integer eTotal) {
        this.eTotal = eTotal;
    }

    public Integer getInverterTemp() {
        return inverterTemp;
    }

    public void setInverterTemp(Integer inverterTemp) {
        this.inverterTemp = inverterTemp;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getAlarmCn() {
        return alarmCn;
    }

    public void setAlarmCn(String alarmCn) {
        this.alarmCn = alarmCn;
    }

    public String getAlarmEn() {
        return alarmEn;
    }

    public void setAlarmEn(String alarmEn) {
        this.alarmEn = alarmEn;
    }

    public Integer getFac() {
        return fac;
    }

    public void setFac(Integer fac) {
        this.fac = fac;
    }

    public Integer getPac() {
        return pac;
    }

    public void setPac(Integer pac) {
        this.pac = pac;
    }

    public Integer getNationalCode() {
        return nationalCode;
    }

    public void setNationalCode(Integer nationalCode) {
        this.nationalCode = nationalCode;
    }

    public String getNational() {
        return national;
    }

    public void setNational(String national) {
        this.national = national;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}