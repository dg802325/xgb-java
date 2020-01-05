package com.xgb.dao;

import com.xgb.model.StNjReport3;
import com.xgb.model.StNjReport3Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StNjReport3Mapper {
    int countByExample(StNjReport3Example example);

    int deleteByExample(StNjReport3Example example);

    int deleteByPrimaryKey(Long id);

    int insert(StNjReport3 record);

    int insertSelective(StNjReport3 record);

    List<StNjReport3> selectByExample(StNjReport3Example example);

    StNjReport3 selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") StNjReport3 record, @Param("example") StNjReport3Example example);

    int updateByExample(@Param("record") StNjReport3 record, @Param("example") StNjReport3Example example);

    int updateByPrimaryKeySelective(StNjReport3 record);

    int updateByPrimaryKey(StNjReport3 record);
}