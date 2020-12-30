package com.pvsoul.datacollection.jinlang.service.impl;

import com.pvsoul.datacollection.jinlang.dao.InverterDataDao;
import com.pvsoul.datacollection.jinlang.dao.JinLangDataDao;
import com.pvsoul.datacollection.jinlang.dao.ResultDao;
import com.pvsoul.datacollection.jinlang.dao.UIDataDao;
import com.pvsoul.datacollection.jinlang.entity.CollectRecord;
import com.pvsoul.datacollection.jinlang.entity.InverterAcData;
import com.pvsoul.datacollection.jinlang.entity.InverterData;
import com.pvsoul.datacollection.jinlang.entity.InverterPvData;
import com.pvsoul.datacollection.jinlang.mapper.CollectRecordMapper;
import com.pvsoul.datacollection.jinlang.mapper.InverterAcDataMapper;
import com.pvsoul.datacollection.jinlang.mapper.InverterDataMapper;
import com.pvsoul.datacollection.jinlang.mapper.InverterPvDataMapper;
import com.pvsoul.datacollection.jinlang.service.DataReceiveService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.UUID;

@Service
@Slf4j
public class DataReceiveServiceImpl implements DataReceiveService {

    @Autowired
    private CollectRecordMapper collectRecordMapper;

    @Autowired
    private InverterDataMapper inverterDataMapper;

    @Autowired
    private InverterPvDataMapper inverterPvDataMapper;

    @Autowired
    private InverterAcDataMapper inverterAcDataMapper;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public ResultDao SaveData(JinLangDataDao data) {
        ResultDao resultDao = new ResultDao();
        Date now = new Date();
        String collectRecordId = UUID.randomUUID().toString();

        CollectRecord collectRecord = new CollectRecord();
        collectRecord.setId(collectRecordId);
        collectRecord.setCollectTime(data.getTime());
        collectRecord.setSn(data.getSn());
        collectRecord.setIsRealtime(data.getIsRealtime());

        collectRecord.setCollectorVer(data.getCollector1().getCollectorVer());
        collectRecord.setCollectorType(data.getCollector1().getType());
        collectRecord.setRssiLevel(data.getCollector1().getRssiLevel());
        collectRecord.setRssi(data.getCollector1().getRssi());
        collectRecord.setCreateTime(now);
        collectRecordMapper.insert(collectRecord);

        for (InverterDataDao inverterDataDao:data.getInverter1()) {

            String inverterDataId = UUID.randomUUID().toString();
            InverterData inverterData = new InverterData();
            inverterData.setId(inverterDataId);
            inverterData.setCollectRecordId(collectRecordId);
            inverterData.setInverterSn(inverterDataDao.getInverterSn());
            inverterData.setInverterModel(inverterDataDao.getInverterModel());
            inverterData.setRatedPower(inverterDataDao.getRatedPower());
            inverterData.setInverterVer(inverterDataDao.getInverterVer());
            inverterData.seteToday(inverterDataDao.getEToday());
            inverterData.seteMonth(inverterDataDao.getEMonth());
            inverterData.seteYear(inverterDataDao.getEYear());
            inverterData.seteTotal(inverterDataDao.getETotal());
            inverterData.setInverterTemp(inverterDataDao.getInverterTemp());
            inverterData.setState(inverterDataDao.getState());
            inverterData.setAlarmCn(inverterDataDao.getAlarmCn());
            inverterData.setAlarmEn(inverterDataDao.getAlarmEn());

            inverterData.setFac(inverterDataDao.getFac());
            inverterData.setPac(inverterDataDao.getPac());
            inverterData.setNationalCode(inverterDataDao.getNationalCode());
            inverterData.setNational(inverterDataDao.getNational());
            inverterData.setCreateTime(now);

            inverterDataMapper.insert(inverterData);

            for (UIDataDao pvUI:inverterDataDao.getPv()) {
                String inverterPvDataId = UUID.randomUUID().toString();
                InverterPvData inverterPvData = new InverterPvData();
                inverterPvData.setId(inverterPvDataId);
                inverterPvData.setCollectRecordId(collectRecordId);
                inverterPvData.setInverterDataId(inverterDataId);
                inverterPvData.setU(pvUI.getU());
                inverterPvData.setI(pvUI.getI());
                inverterPvData.setCreateTime(now);
                inverterPvDataMapper.insert(inverterPvData);
            }
            for (UIDataDao acUI:inverterDataDao.getAc()) {
                String inverterAcDataId = UUID.randomUUID().toString();
                InverterAcData inverterAcData = new InverterAcData();
                inverterAcData.setId(inverterAcDataId);
                inverterAcData.setCollectRecordId(collectRecordId);
                inverterAcData.setInverterDataId(inverterDataId);
                inverterAcData.setU(acUI.getU());
                inverterAcData.setI(acUI.getI());
                inverterAcData.setCreateTime(now);
                inverterAcDataMapper.insert(inverterAcData);
            }
        }

        return resultDao;
    }
}
