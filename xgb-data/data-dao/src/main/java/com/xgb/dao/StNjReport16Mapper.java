package com.xgb.dao;

import com.xgb.model.StNjReport16;
import com.xgb.model.StNjReport16Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StNjReport16Mapper {
    int countByExample(StNjReport16Example example);

    int deleteByExample(StNjReport16Example example);

    int deleteByPrimaryKey(Long id);

    int insert(StNjReport16 record);

    int insertSelective(StNjReport16 record);

    List<StNjReport16> selectByExample(StNjReport16Example example);

    StNjReport16 selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") StNjReport16 record, @Param("example") StNjReport16Example example);

    int updateByExample(@Param("record") StNjReport16 record, @Param("example") StNjReport16Example example);

    int updateByPrimaryKeySelective(StNjReport16 record);

    int updateByPrimaryKey(StNjReport16 record);
}