package com.pvsoul.datacollection.jinlang.mapper;

import com.pvsoul.datacollection.jinlang.entity.collect_record;

public interface collect_recordMapper {
    int deleteByPrimaryKey(Object id);

    int insert(collect_record record);

    int insertSelective(collect_record record);

    collect_record selectByPrimaryKey(Object id);

    int updateByPrimaryKeySelective(collect_record record);

    int updateByPrimaryKey(collect_record record);
}