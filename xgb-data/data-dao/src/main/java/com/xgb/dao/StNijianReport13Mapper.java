package com.xgb.dao;

import com.xgb.model.StNijianReport13;
import com.xgb.model.StNijianReport13Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StNijianReport13Mapper {
    int countByExample(StNijianReport13Example example);

    int deleteByExample(StNijianReport13Example example);

    int deleteByPrimaryKey(Long id);

    int insert(StNijianReport13 record);

    int insertSelective(StNijianReport13 record);

    List<StNijianReport13> selectByExample(StNijianReport13Example example);

    StNijianReport13 selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") StNijianReport13 record, @Param("example") StNijianReport13Example example);

    int updateByExample(@Param("record") StNijianReport13 record, @Param("example") StNijianReport13Example example);

    int updateByPrimaryKeySelective(StNijianReport13 record);

    int updateByPrimaryKey(StNijianReport13 record);
}