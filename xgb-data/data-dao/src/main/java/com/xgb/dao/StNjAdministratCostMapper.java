package com.xgb.dao;

import com.xgb.model.StNjAdministratCost;
import com.xgb.model.StNjAdministratCostExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StNjAdministratCostMapper {
    int countByExample(StNjAdministratCostExample example);

    int deleteByExample(StNjAdministratCostExample example);

    int deleteByPrimaryKey(Long id);

    int insert(StNjAdministratCost record);

    int insertSelective(StNjAdministratCost record);

    List<StNjAdministratCost> selectByExample(StNjAdministratCostExample example);

    StNjAdministratCost selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") StNjAdministratCost record, @Param("example") StNjAdministratCostExample example);

    int updateByExample(@Param("record") StNjAdministratCost record, @Param("example") StNjAdministratCostExample example);

    int updateByPrimaryKeySelective(StNjAdministratCost record);

    int updateByPrimaryKey(StNjAdministratCost record);
}