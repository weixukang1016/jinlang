package com.pvsoul.datacollection.jinlang.mapper;

import com.pvsoul.datacollection.jinlang.entity.inverter_ac_data;

public interface inverter_ac_dataMapper {
    int deleteByPrimaryKey(Object id);

    int insert(inverter_ac_data record);

    int insertSelective(inverter_ac_data record);

    inverter_ac_data selectByPrimaryKey(Object id);

    int updateByPrimaryKeySelective(inverter_ac_data record);

    int updateByPrimaryKey(inverter_ac_data record);
}