package com.xgb.dao;

import com.xgb.model.StNjReport17Sub1;
import com.xgb.model.StNjReport17Sub1Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StNjReport17Sub1Mapper {
    int countByExample(StNjReport17Sub1Example example);

    int deleteByExample(StNjReport17Sub1Example example);

    int deleteByPrimaryKey(Long id);

    int insert(StNjReport17Sub1 record);

    int insertSelective(StNjReport17Sub1 record);

    List<StNjReport17Sub1> selectByExample(StNjReport17Sub1Example example);

    StNjReport17Sub1 selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") StNjReport17Sub1 record, @Param("example") StNjReport17Sub1Example example);

    int updateByExample(@Param("record") StNjReport17Sub1 record, @Param("example") StNjReport17Sub1Example example);

    int updateByPrimaryKeySelective(StNjReport17Sub1 record);

    int updateByPrimaryKey(StNjReport17Sub1 record);
}