package com.pvsoul.datacollection.jinlang.service.impl;

import com.pvsoul.datacollection.jinlang.dao.JinLangDataDao;
import com.pvsoul.datacollection.jinlang.dao.ResultDao;
import com.pvsoul.datacollection.jinlang.service.DataReceiveService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DataReceiveServiceImpl implements DataReceiveService {


    @Override
    public ResultDao SaveData(JinLangDataDao data) {
        ResultDao resultDao = new ResultDao();
        return resultDao;
    }
}
