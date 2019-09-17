package com.xgb.dao;

import com.xgb.model.BbiChinaDivision;
import com.xgb.model.BbiChinaDivisionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BbiChinaDivisionMapper {
    int countByExample(BbiChinaDivisionExample example);

    int deleteByExample(BbiChinaDivisionExample example);

    int deleteByPrimaryKey(String id);

    int insert(BbiChinaDivision record);

    int insertSelective(BbiChinaDivision record);

    List<BbiChinaDivision> selectByExample(BbiChinaDivisionExample example);

    BbiChinaDivision selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") BbiChinaDivision record, @Param("example") BbiChinaDivisionExample example);

    int updateByExample(@Param("record") BbiChinaDivision record, @Param("example") BbiChinaDivisionExample example);

    int updateByPrimaryKeySelective(BbiChinaDivision record);

    int updateByPrimaryKey(BbiChinaDivision record);
}