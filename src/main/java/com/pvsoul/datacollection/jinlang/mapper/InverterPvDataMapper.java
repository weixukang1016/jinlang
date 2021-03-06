package com.pvsoul.datacollection.jinlang.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.pvsoul.datacollection.jinlang.entity.InverterPvData;

public interface InverterPvDataMapper extends BaseMapper<InverterPvData> {
    int deleteByPrimaryKey(Object id);

    int insert(InverterPvData record);

    int insertSelective(InverterPvData record);

    InverterPvData selectByPrimaryKey(Object id);

    int updateByPrimaryKeySelective(InverterPvData record);

    int updateByPrimaryKey(InverterPvData record);
}