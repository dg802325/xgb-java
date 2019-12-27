package com.xgb.dao;

import com.xgb.model.StNjCgfw;
import com.xgb.model.StNjCgfwExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StNjCgfwMapper {
    int countByExample(StNjCgfwExample example);

    int deleteByExample(StNjCgfwExample example);

    int deleteByPrimaryKey(Long id);

    int insert(StNjCgfw record);

    int insertSelective(StNjCgfw record);

    List<StNjCgfw> selectByExample(StNjCgfwExample example);

    StNjCgfw selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") StNjCgfw record, @Param("example") StNjCgfwExample example);

    int updateByExample(@Param("record") StNjCgfw record, @Param("example") StNjCgfwExample example);

    int updateByPrimaryKeySelective(StNjCgfw record);

    int updateByPrimaryKey(StNjCgfw record);
}