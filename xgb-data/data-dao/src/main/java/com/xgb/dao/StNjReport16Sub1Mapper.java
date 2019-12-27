package com.xgb.dao;

import com.xgb.model.StNjReport16Sub1;
import com.xgb.model.StNjReport16Sub1Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StNjReport16Sub1Mapper {
    int countByExample(StNjReport16Sub1Example example);

    int deleteByExample(StNjReport16Sub1Example example);

    int deleteByPrimaryKey(Long id);

    int insert(StNjReport16Sub1 record);

    int insertSelective(StNjReport16Sub1 record);

    List<StNjReport16Sub1> selectByExample(StNjReport16Sub1Example example);

    StNjReport16Sub1 selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") StNjReport16Sub1 record, @Param("example") StNjReport16Sub1Example example);

    int updateByExample(@Param("record") StNjReport16Sub1 record, @Param("example") StNjReport16Sub1Example example);

    int updateByPrimaryKeySelective(StNjReport16Sub1 record);

    int updateByPrimaryKey(StNjReport16Sub1 record);
}