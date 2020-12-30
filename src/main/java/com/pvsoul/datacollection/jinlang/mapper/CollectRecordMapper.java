package com.pvsoul.datacollection.jinlang.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.pvsoul.datacollection.jinlang.entity.CollectRecord;

public interface CollectRecordMapper extends BaseMapper<CollectRecord> {
    int deleteByPrimaryKey(Object id);

    int insert(CollectRecord record);

    int insertSelective(CollectRecord record);

    CollectRecord selectByPrimaryKey(Object id);

    int updateByPrimaryKeySelective(CollectRecord record);

    int updateByPrimaryKey(CollectRecord record);
}