package com.xgb.dao;

import com.xgb.model.StNjQgothercase19Sub;
import com.xgb.model.StNjQgothercase19SubExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StNjQgothercase19SubMapper {
    int countByExample(StNjQgothercase19SubExample example);

    int deleteByExample(StNjQgothercase19SubExample example);

    int deleteByPrimaryKey(Long id);

    int insert(StNjQgothercase19Sub record);

    int insertSelective(StNjQgothercase19Sub record);

    List<StNjQgothercase19Sub> selectByExample(StNjQgothercase19SubExample example);

    StNjQgothercase19Sub selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") StNjQgothercase19Sub record, @Param("example") StNjQgothercase19SubExample example);

    int updateByExample(@Param("record") StNjQgothercase19Sub record, @Param("example") StNjQgothercase19SubExample example);

    int updateByPrimaryKeySelective(StNjQgothercase19Sub record);

    int updateByPrimaryKey(StNjQgothercase19Sub record);
}