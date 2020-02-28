package com.xgb.dao;

import com.xgb.model.LsCircs;
import com.xgb.model.LsCircsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LsCircsMapper {
    int countByExample(LsCircsExample example);

    int deleteByExample(LsCircsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(LsCircs record);

    int insertSelective(LsCircs record);

    List<LsCircs> selectByExample(LsCircsExample example);

    LsCircs selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") LsCircs record, @Param("example") LsCircsExample example);

    int updateByExample(@Param("record") LsCircs record, @Param("example") LsCircsExample example);

    int updateByPrimaryKeySelective(LsCircs record);

    int updateByPrimaryKey(LsCircs record);
}