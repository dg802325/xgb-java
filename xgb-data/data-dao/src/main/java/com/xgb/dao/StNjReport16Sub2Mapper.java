package com.xgb.dao;

import com.xgb.model.StNjReport16Sub2;
import com.xgb.model.StNjReport16Sub2Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StNjReport16Sub2Mapper {
    int countByExample(StNjReport16Sub2Example example);

    int deleteByExample(StNjReport16Sub2Example example);

    int deleteByPrimaryKey(Long id);

    int insert(StNjReport16Sub2 record);

    int insertSelective(StNjReport16Sub2 record);

    List<StNjReport16Sub2> selectByExample(StNjReport16Sub2Example example);

    StNjReport16Sub2 selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") StNjReport16Sub2 record, @Param("example") StNjReport16Sub2Example example);

    int updateByExample(@Param("record") StNjReport16Sub2 record, @Param("example") StNjReport16Sub2Example example);

    int updateByPrimaryKeySelective(StNjReport16Sub2 record);

    int updateByPrimaryKey(StNjReport16Sub2 record);
}