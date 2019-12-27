package com.xgb.dao;

import com.xgb.model.StNjReport15;
import com.xgb.model.StNjReport15Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StNjReport15Mapper {
    int countByExample(StNjReport15Example example);

    int deleteByExample(StNjReport15Example example);

    int deleteByPrimaryKey(Long id);

    int insert(StNjReport15 record);

    int insertSelective(StNjReport15 record);

    List<StNjReport15> selectByExample(StNjReport15Example example);

    StNjReport15 selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") StNjReport15 record, @Param("example") StNjReport15Example example);

    int updateByExample(@Param("record") StNjReport15 record, @Param("example") StNjReport15Example example);

    int updateByPrimaryKeySelective(StNjReport15 record);

    int updateByPrimaryKey(StNjReport15 record);
}