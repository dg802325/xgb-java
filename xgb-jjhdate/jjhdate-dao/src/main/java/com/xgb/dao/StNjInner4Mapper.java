package com.xgb.dao;

import com.xgb.model.StNjInner4;
import com.xgb.model.StNjInner4Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StNjInner4Mapper {
    int countByExample(StNjInner4Example example);

    int deleteByExample(StNjInner4Example example);

    int insert(StNjInner4 record);

    int insertSelective(StNjInner4 record);

    List<StNjInner4> selectByExample(StNjInner4Example example);

    int updateByExampleSelective(@Param("record") StNjInner4 record, @Param("example") StNjInner4Example example);

    int updateByExample(@Param("record") StNjInner4 record, @Param("example") StNjInner4Example example);
}