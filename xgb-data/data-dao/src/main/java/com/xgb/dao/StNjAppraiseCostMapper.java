package com.xgb.dao;

import com.xgb.model.StNjAppraiseCost;
import com.xgb.model.StNjAppraiseCostExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StNjAppraiseCostMapper {
    int countByExample(StNjAppraiseCostExample example);

    int deleteByExample(StNjAppraiseCostExample example);

    int deleteByPrimaryKey(Long id);

    int insert(StNjAppraiseCost record);

    int insertSelective(StNjAppraiseCost record);

    List<StNjAppraiseCost> selectByExample(StNjAppraiseCostExample example);

    StNjAppraiseCost selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") StNjAppraiseCost record, @Param("example") StNjAppraiseCostExample example);

    int updateByExample(@Param("record") StNjAppraiseCost record, @Param("example") StNjAppraiseCostExample example);

    int updateByPrimaryKeySelective(StNjAppraiseCost record);

    int updateByPrimaryKey(StNjAppraiseCost record);
}