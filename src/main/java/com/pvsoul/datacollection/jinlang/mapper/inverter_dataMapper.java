package com.pvsoul.datacollection.jinlang.mapper;

import com.pvsoul.datacollection.jinlang.entity.inverter_data;

public interface inverter_dataMapper {
    int deleteByPrimaryKey(Object id);

    int insert(inverter_data record);

    int insertSelective(inverter_data record);

    inverter_data selectByPrimaryKey(Object id);

    int updateByPrimaryKeySelective(inverter_data record);

    int updateByPrimaryKey(inverter_data record);
}