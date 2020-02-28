package com.xgb.dao;

import com.xgb.model.LshCircs;
import com.xgb.model.LshCircsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LshCircsMapper {
    int countByExample(LshCircsExample example);

    int deleteByExample(LshCircsExample example);

    int insert(LshCircs record);

    int insertSelective(LshCircs record);

    List<LshCircs> selectByExample(LshCircsExample example);

    int updateByExampleSelective(@Param("record") LshCircs record, @Param("example") LshCircsExample example);

    int updateByExample(@Param("record") LshCircs record, @Param("example") LshCircsExample example);
}