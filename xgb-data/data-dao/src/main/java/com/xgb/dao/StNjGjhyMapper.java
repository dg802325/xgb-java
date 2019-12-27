package com.xgb.dao;

import com.xgb.model.StNjGjhy;
import com.xgb.model.StNjGjhyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StNjGjhyMapper {
    int countByExample(StNjGjhyExample example);

    int deleteByExample(StNjGjhyExample example);

    int deleteByPrimaryKey(Long id);

    int insert(StNjGjhy record);

    int insertSelective(StNjGjhy record);

    List<StNjGjhy> selectByExample(StNjGjhyExample example);

    StNjGjhy selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") StNjGjhy record, @Param("example") StNjGjhyExample example);

    int updateByExample(@Param("record") StNjGjhy record, @Param("example") StNjGjhyExample example);

    int updateByPrimaryKeySelective(StNjGjhy record);

    int updateByPrimaryKey(StNjGjhy record);
}