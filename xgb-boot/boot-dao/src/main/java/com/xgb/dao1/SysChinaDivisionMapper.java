package com.xgb.dao1;

import com.xgb.model.SysChinaDivision;
import com.xgb.model.SysChinaDivisionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysChinaDivisionMapper {
    int countByExample(SysChinaDivisionExample example);

    int deleteByExample(SysChinaDivisionExample example);

    int deleteByPrimaryKey(String id);

    int insert(SysChinaDivision record);

    int insertSelective(SysChinaDivision record);

    List<SysChinaDivision> selectByExample(SysChinaDivisionExample example);

    SysChinaDivision selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") SysChinaDivision record, @Param("example") SysChinaDivisionExample example);

    int updateByExample(@Param("record") SysChinaDivision record, @Param("example") SysChinaDivisionExample example);

    int updateByPrimaryKeySelective(SysChinaDivision record);

    int updateByPrimaryKey(SysChinaDivision record);
}