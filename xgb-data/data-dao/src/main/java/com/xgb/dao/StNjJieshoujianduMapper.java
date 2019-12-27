package com.xgb.dao;

import com.xgb.model.StNjJieshoujiandu;
import com.xgb.model.StNjJieshoujianduExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StNjJieshoujianduMapper {
    int countByExample(StNjJieshoujianduExample example);

    int deleteByExample(StNjJieshoujianduExample example);

    int deleteByPrimaryKey(Long id);

    int insert(StNjJieshoujiandu record);

    int insertSelective(StNjJieshoujiandu record);

    List<StNjJieshoujiandu> selectByExample(StNjJieshoujianduExample example);

    StNjJieshoujiandu selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") StNjJieshoujiandu record, @Param("example") StNjJieshoujianduExample example);

    int updateByExample(@Param("record") StNjJieshoujiandu record, @Param("example") StNjJieshoujianduExample example);

    int updateByPrimaryKeySelective(StNjJieshoujiandu record);

    int updateByPrimaryKey(StNjJieshoujiandu record);
}