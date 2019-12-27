package com.xgb.dao;

import com.xgb.model.StNjReprot14;
import com.xgb.model.StNjReprot14Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StNjReprot14Mapper {
    int countByExample(StNjReprot14Example example);

    int deleteByExample(StNjReprot14Example example);

    int deleteByPrimaryKey(Long id);

    int insert(StNjReprot14 record);

    int insertSelective(StNjReprot14 record);

    List<StNjReprot14> selectByExample(StNjReprot14Example example);

    StNjReprot14 selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") StNjReprot14 record, @Param("example") StNjReprot14Example example);

    int updateByExample(@Param("record") StNjReprot14 record, @Param("example") StNjReprot14Example example);

    int updateByPrimaryKeySelective(StNjReprot14 record);

    int updateByPrimaryKey(StNjReprot14 record);
}