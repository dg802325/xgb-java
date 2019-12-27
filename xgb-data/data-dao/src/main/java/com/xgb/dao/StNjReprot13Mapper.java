package com.xgb.dao;

import com.xgb.model.StNjReprot13;
import com.xgb.model.StNjReprot13Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StNjReprot13Mapper {
    int countByExample(StNjReprot13Example example);

    int deleteByExample(StNjReprot13Example example);

    int deleteByPrimaryKey(Long id);

    int insert(StNjReprot13 record);

    int insertSelective(StNjReprot13 record);

    List<StNjReprot13> selectByExample(StNjReprot13Example example);

    StNjReprot13 selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") StNjReprot13 record, @Param("example") StNjReprot13Example example);

    int updateByExample(@Param("record") StNjReprot13 record, @Param("example") StNjReprot13Example example);

    int updateByPrimaryKeySelective(StNjReprot13 record);

    int updateByPrimaryKey(StNjReprot13 record);
}