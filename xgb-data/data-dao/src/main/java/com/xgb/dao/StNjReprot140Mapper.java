package com.xgb.dao;

import com.xgb.model.StNjReprot140;
import com.xgb.model.StNjReprot140Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StNjReprot140Mapper {
    int countByExample(StNjReprot140Example example);

    int deleteByExample(StNjReprot140Example example);

    int insert(StNjReprot140 record);

    int insertSelective(StNjReprot140 record);

    List<StNjReprot140> selectByExample(StNjReprot140Example example);

    int updateByExampleSelective(@Param("record") StNjReprot140 record, @Param("example") StNjReprot140Example example);

    int updateByExample(@Param("record") StNjReprot140 record, @Param("example") StNjReprot140Example example);
}