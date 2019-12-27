package com.xgb.dao;

import com.xgb.model.StNjReport13Sub;
import com.xgb.model.StNjReport13SubExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StNjReport13SubMapper {
    int countByExample(StNjReport13SubExample example);

    int deleteByExample(StNjReport13SubExample example);

    int deleteByPrimaryKey(Long id);

    int insert(StNjReport13Sub record);

    int insertSelective(StNjReport13Sub record);

    List<StNjReport13Sub> selectByExample(StNjReport13SubExample example);

    StNjReport13Sub selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") StNjReport13Sub record, @Param("example") StNjReport13SubExample example);

    int updateByExample(@Param("record") StNjReport13Sub record, @Param("example") StNjReport13SubExample example);

    int updateByPrimaryKeySelective(StNjReport13Sub record);

    int updateByPrimaryKey(StNjReport13Sub record);
}