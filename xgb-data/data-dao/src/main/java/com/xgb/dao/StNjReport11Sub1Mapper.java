package com.xgb.dao;

import com.xgb.model.StNjReport11Sub1;
import com.xgb.model.StNjReport11Sub1Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StNjReport11Sub1Mapper {
    int countByExample(StNjReport11Sub1Example example);

    int deleteByExample(StNjReport11Sub1Example example);

    int deleteByPrimaryKey(Long id);

    int insert(StNjReport11Sub1 record);

    int insertSelective(StNjReport11Sub1 record);

    List<StNjReport11Sub1> selectByExample(StNjReport11Sub1Example example);

    StNjReport11Sub1 selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") StNjReport11Sub1 record, @Param("example") StNjReport11Sub1Example example);

    int updateByExample(@Param("record") StNjReport11Sub1 record, @Param("example") StNjReport11Sub1Example example);

    int updateByPrimaryKeySelective(StNjReport11Sub1 record);

    int updateByPrimaryKey(StNjReport11Sub1 record);
}