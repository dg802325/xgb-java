package com.xgb.dao;

import com.xgb.model.StNjServiceCostInx;
import com.xgb.model.StNjServiceCostInxExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StNjServiceCostInxMapper {
    int countByExample(StNjServiceCostInxExample example);

    int deleteByExample(StNjServiceCostInxExample example);

    int deleteByPrimaryKey(Long id);

    int insert(StNjServiceCostInx record);

    int insertSelective(StNjServiceCostInx record);

    List<StNjServiceCostInx> selectByExample(StNjServiceCostInxExample example);

    StNjServiceCostInx selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") StNjServiceCostInx record, @Param("example") StNjServiceCostInxExample example);

    int updateByExample(@Param("record") StNjServiceCostInx record, @Param("example") StNjServiceCostInxExample example);

    int updateByPrimaryKeySelective(StNjServiceCostInx record);

    int updateByPrimaryKey(StNjServiceCostInx record);
}