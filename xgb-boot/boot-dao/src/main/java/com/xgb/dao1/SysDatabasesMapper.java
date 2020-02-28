package com.xgb.dao1;

import com.xgb.model.SysDatabases;
import com.xgb.model.SysDatabasesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysDatabasesMapper {
    int countByExample(SysDatabasesExample example);

    int deleteByExample(SysDatabasesExample example);

    int deleteByPrimaryKey(String id);

    int insert(SysDatabases record);

    int insertSelective(SysDatabases record);

    List<SysDatabases> selectByExample(SysDatabasesExample example);

    SysDatabases selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") SysDatabases record, @Param("example") SysDatabasesExample example);

    int updateByExample(@Param("record") SysDatabases record, @Param("example") SysDatabasesExample example);

    int updateByPrimaryKeySelective(SysDatabases record);

    int updateByPrimaryKey(SysDatabases record);
}