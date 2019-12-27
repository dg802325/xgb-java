package com.xgb.dao;

import com.xgb.model.StnjSfqkJyfw;
import com.xgb.model.StnjSfqkJyfwExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StnjSfqkJyfwMapper {
    int countByExample(StnjSfqkJyfwExample example);

    int deleteByExample(StnjSfqkJyfwExample example);

    int deleteByPrimaryKey(Long id);

    int insert(StnjSfqkJyfw record);

    int insertSelective(StnjSfqkJyfw record);

    List<StnjSfqkJyfw> selectByExample(StnjSfqkJyfwExample example);

    StnjSfqkJyfw selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") StnjSfqkJyfw record, @Param("example") StnjSfqkJyfwExample example);

    int updateByExample(@Param("record") StnjSfqkJyfw record, @Param("example") StnjSfqkJyfwExample example);

    int updateByPrimaryKeySelective(StnjSfqkJyfw record);

    int updateByPrimaryKey(StnjSfqkJyfw record);
}