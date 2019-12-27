package com.xgb.dao;

import com.xgb.model.StNjQgadvise;
import com.xgb.model.StNjQgadviseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StNjQgadviseMapper {
    int countByExample(StNjQgadviseExample example);

    int deleteByExample(StNjQgadviseExample example);

    int deleteByPrimaryKey(Long id);

    int insert(StNjQgadvise record);

    int insertSelective(StNjQgadvise record);

    List<StNjQgadvise> selectByExample(StNjQgadviseExample example);

    StNjQgadvise selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") StNjQgadvise record, @Param("example") StNjQgadviseExample example);

    int updateByExample(@Param("record") StNjQgadvise record, @Param("example") StNjQgadviseExample example);

    int updateByPrimaryKeySelective(StNjQgadvise record);

    int updateByPrimaryKey(StNjQgadvise record);
}