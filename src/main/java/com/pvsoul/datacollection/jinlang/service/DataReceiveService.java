package com.pvsoul.datacollection.jinlang.service;

import com.pvsoul.datacollection.jinlang.dao.JinLangDataDao;
import com.pvsoul.datacollection.jinlang.dao.ResultDao;

public interface DataReceiveService {

    public ResultDao SaveData(JinLangDataDao data);
}
