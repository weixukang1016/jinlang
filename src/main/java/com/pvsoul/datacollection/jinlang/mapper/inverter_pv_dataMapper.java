package com.pvsoul.datacollection.jinlang.mapper;

import com.pvsoul.datacollection.jinlang.entity.inverter_pv_data;

public interface inverter_pv_dataMapper {
    int deleteByPrimaryKey(Object id);

    int insert(inverter_pv_data record);

    int insertSelective(inverter_pv_data record);

    inverter_pv_data selectByPrimaryKey(Object id);

    int updateByPrimaryKeySelective(inverter_pv_data record);

    int updateByPrimaryKey(inverter_pv_data record);
}