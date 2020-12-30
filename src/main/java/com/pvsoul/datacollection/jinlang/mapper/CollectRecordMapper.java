package com.pvsoul.datacollection.jinlang.mapper;

import com.pvsoul.datacollection.jinlang.entity.CollectRecord;

public interface CollectRecordMapper {
    int deleteByPrimaryKey(Object id);

    int insert(CollectRecord record);

    int insertSelective(CollectRecord record);

    CollectRecord selectByPrimaryKey(Object id);

    int updateByPrimaryKeySelective(CollectRecord record);

    int updateByPrimaryKey(CollectRecord record);
}