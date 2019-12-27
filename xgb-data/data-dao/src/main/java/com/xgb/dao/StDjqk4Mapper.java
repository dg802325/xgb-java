package com.xgb.dao;

import com.xgb.model.StDjqk4;
import com.xgb.model.StDjqk4Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StDjqk4Mapper {
    int countByExample(StDjqk4Example example);

    int deleteByExample(StDjqk4Example example);

    int deleteByPrimaryKey(Long id);

    int insert(StDjqk4 record);

    int insertSelective(StDjqk4 record);

    List<StDjqk4> selectByExample(StDjqk4Example example);

    StDjqk4 selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") StDjqk4 record, @Param("example") StDjqk4Example example);

    int updateByExample(@Param("record") StDjqk4 record, @Param("example") StDjqk4Example example);

    int updateByPrimaryKeySelective(StDjqk4 record);

    int updateByPrimaryKey(StDjqk4 record);
}