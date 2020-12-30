package com.pvsoul.datacollection.jinlang.mapper;

import com.pvsoul.datacollection.jinlang.entity.InverterAcData;

public interface InverterAcDataMapper {
    int deleteByPrimaryKey(Object id);

    int insert(InverterAcData record);

    int insertSelective(InverterAcData record);

    InverterAcData selectByPrimaryKey(Object id);

    int updateByPrimaryKeySelective(InverterAcData record);

    int updateByPrimaryKey(InverterAcData record);
}