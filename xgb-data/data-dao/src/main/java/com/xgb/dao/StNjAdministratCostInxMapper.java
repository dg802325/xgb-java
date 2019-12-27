package com.xgb.dao;

import com.xgb.model.StNjAdministratCostInx;
import com.xgb.model.StNjAdministratCostInxExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StNjAdministratCostInxMapper {
    int countByExample(StNjAdministratCostInxExample example);

    int deleteByExample(StNjAdministratCostInxExample example);

    int deleteByPrimaryKey(Long id);

    int insert(StNjAdministratCostInx record);

    int insertSelective(StNjAdministratCostInx record);

    List<StNjAdministratCostInx> selectByExample(StNjAdministratCostInxExample example);

    StNjAdministratCostInx selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") StNjAdministratCostInx record, @Param("example") StNjAdministratCostInxExample example);

    int updateByExample(@Param("record") StNjAdministratCostInx record, @Param("example") StNjAdministratCostInxExample example);

    int updateByPrimaryKeySelective(StNjAdministratCostInx record);

    int updateByPrimaryKey(StNjAdministratCostInx record);
}