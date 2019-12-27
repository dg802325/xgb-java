package com.xgb.dao;

import com.xgb.model.StNjReport14Sub;
import com.xgb.model.StNjReport14SubExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StNjReport14SubMapper {
    int countByExample(StNjReport14SubExample example);

    int deleteByExample(StNjReport14SubExample example);

    int deleteByPrimaryKey(Long id);

    int insert(StNjReport14Sub record);

    int insertSelective(StNjReport14Sub record);

    List<StNjReport14Sub> selectByExample(StNjReport14SubExample example);

    StNjReport14Sub selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") StNjReport14Sub record, @Param("example") StNjReport14SubExample example);

    int updateByExample(@Param("record") StNjReport14Sub record, @Param("example") StNjReport14SubExample example);

    int updateByPrimaryKeySelective(StNjReport14Sub record);

    int updateByPrimaryKey(StNjReport14Sub record);
}