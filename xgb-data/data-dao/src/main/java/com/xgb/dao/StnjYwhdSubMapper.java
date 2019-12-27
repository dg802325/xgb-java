package com.xgb.dao;

import com.xgb.model.StnjYwhdSub;
import com.xgb.model.StnjYwhdSubExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StnjYwhdSubMapper {
    int countByExample(StnjYwhdSubExample example);

    int deleteByExample(StnjYwhdSubExample example);

    int deleteByPrimaryKey(Long id);

    int insert(StnjYwhdSub record);

    int insertSelective(StnjYwhdSub record);

    List<StnjYwhdSub> selectByExample(StnjYwhdSubExample example);

    StnjYwhdSub selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") StnjYwhdSub record, @Param("example") StnjYwhdSubExample example);

    int updateByExample(@Param("record") StnjYwhdSub record, @Param("example") StnjYwhdSubExample example);

    int updateByPrimaryKeySelective(StnjYwhdSub record);

    int updateByPrimaryKey(StnjYwhdSub record);
}