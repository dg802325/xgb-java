package com.xgb.dao;

import com.xgb.model.StnjYwhdTb;
import com.xgb.model.StnjYwhdTbExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StnjYwhdTbMapper {
    int countByExample(StnjYwhdTbExample example);

    int deleteByExample(StnjYwhdTbExample example);

    int insert(StnjYwhdTb record);

    int insertSelective(StnjYwhdTb record);

    List<StnjYwhdTb> selectByExample(StnjYwhdTbExample example);

    int updateByExampleSelective(@Param("record") StnjYwhdTb record, @Param("example") StnjYwhdTbExample example);

    int updateByExample(@Param("record") StnjYwhdTb record, @Param("example") StnjYwhdTbExample example);
}