package com.pvsoul.datacollection.jinlang.mapper;

import com.pvsoul.datacollection.jinlang.entity.InverterData;

public interface InverterDataMapper {
    int deleteByPrimaryKey(Object id);

    int insert(InverterData record);

    int insertSelective(InverterData record);

    InverterData selectByPrimaryKey(Object id);

    int updateByPrimaryKeySelective(InverterData record);

    int updateByPrimaryKey(InverterData record);
}