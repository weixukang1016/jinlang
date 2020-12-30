package com.pvsoul.datacollection.jinlang.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.pvsoul.datacollection.jinlang.entity.InverterAcData;

public interface InverterAcDataMapper extends BaseMapper<InverterAcData> {
    int deleteByPrimaryKey(Object id);

    int insert(InverterAcData record);

    int insertSelective(InverterAcData record);

    InverterAcData selectByPrimaryKey(Object id);

    int updateByPrimaryKeySelective(InverterAcData record);

    int updateByPrimaryKey(InverterAcData record);
}