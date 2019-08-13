package com.xgb.dao;

import com.xgb.model.SysDivistion;
import com.xgb.model.SysDivistionExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SysDivistionMapper {
    int countByExample(SysDivistionExample example);

    int deleteByExample(SysDivistionExample example);

    int deleteByPrimaryKey(String id);

    int insert(SysDivistion record);

    int insertSelective(SysDivistion record);

    List<SysDivistion> selectByExample(SysDivistionExample example);

    SysDivistion selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") SysDivistion record, @Param("example") SysDivistionExample example);

    int updateByExample(@Param("record") SysDivistion record, @Param("example") SysDivistionExample example);

    int updateByPrimaryKeySelective(SysDivistion record);

    int updateByPrimaryKey(SysDivistion record);
}