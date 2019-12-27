package com.xgb.dao;

import com.xgb.model.StNjServiceCost;
import com.xgb.model.StNjServiceCostExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StNjServiceCostMapper {
    int countByExample(StNjServiceCostExample example);

    int deleteByExample(StNjServiceCostExample example);

    int deleteByPrimaryKey(Long id);

    int insert(StNjServiceCost record);

    int insertSelective(StNjServiceCost record);

    List<StNjServiceCost> selectByExample(StNjServiceCostExample example);

    StNjServiceCost selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") StNjServiceCost record, @Param("example") StNjServiceCostExample example);

    int updateByExample(@Param("record") StNjServiceCost record, @Param("example") StNjServiceCostExample example);

    int updateByPrimaryKeySelective(StNjServiceCost record);

    int updateByPrimaryKey(StNjServiceCost record);
}