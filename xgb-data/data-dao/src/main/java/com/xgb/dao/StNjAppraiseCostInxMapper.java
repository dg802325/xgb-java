package com.xgb.dao;

import com.xgb.model.StNjAppraiseCostInx;
import com.xgb.model.StNjAppraiseCostInxExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StNjAppraiseCostInxMapper {
    int countByExample(StNjAppraiseCostInxExample example);

    int deleteByExample(StNjAppraiseCostInxExample example);

    int deleteByPrimaryKey(Long id);

    int insert(StNjAppraiseCostInx record);

    int insertSelective(StNjAppraiseCostInx record);

    List<StNjAppraiseCostInx> selectByExample(StNjAppraiseCostInxExample example);

    StNjAppraiseCostInx selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") StNjAppraiseCostInx record, @Param("example") StNjAppraiseCostInxExample example);

    int updateByExample(@Param("record") StNjAppraiseCostInx record, @Param("example") StNjAppraiseCostInxExample example);

    int updateByPrimaryKeySelective(StNjAppraiseCostInx record);

    int updateByPrimaryKey(StNjAppraiseCostInx record);
}