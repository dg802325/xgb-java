package com.xgb.dao;

import com.xgb.model.StNjInner4;
import com.xgb.model.StNjInner4Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StNjInner4Mapper {
    int countByExample(StNjInner4Example example);

    int deleteByExample(StNjInner4Example example);

    int deleteByPrimaryKey(Long id);

    int insert(StNjInner4 record);

    int insertSelective(StNjInner4 record);

    List<StNjInner4> selectByExample(StNjInner4Example example);

    StNjInner4 selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") StNjInner4 record, @Param("example") StNjInner4Example example);

    int updateByExample(@Param("record") StNjInner4 record, @Param("example") StNjInner4Example example);

    int updateByPrimaryKeySelective(StNjInner4 record);

    int updateByPrimaryKey(StNjInner4 record);
}