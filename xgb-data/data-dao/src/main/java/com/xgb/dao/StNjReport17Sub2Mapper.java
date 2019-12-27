package com.xgb.dao;

import com.xgb.model.StNjReport17Sub2;
import com.xgb.model.StNjReport17Sub2Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StNjReport17Sub2Mapper {
    int countByExample(StNjReport17Sub2Example example);

    int deleteByExample(StNjReport17Sub2Example example);

    int deleteByPrimaryKey(Long id);

    int insert(StNjReport17Sub2 record);

    int insertSelective(StNjReport17Sub2 record);

    List<StNjReport17Sub2> selectByExample(StNjReport17Sub2Example example);

    StNjReport17Sub2 selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") StNjReport17Sub2 record, @Param("example") StNjReport17Sub2Example example);

    int updateByExample(@Param("record") StNjReport17Sub2 record, @Param("example") StNjReport17Sub2Example example);

    int updateByPrimaryKeySelective(StNjReport17Sub2 record);

    int updateByPrimaryKey(StNjReport17Sub2 record);
}