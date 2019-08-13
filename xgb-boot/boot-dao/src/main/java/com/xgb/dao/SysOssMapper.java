package com.xgb.dao;

import com.xgb.model.SysOss;
import com.xgb.model.SysOssExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SysOssMapper {
    long countByExample(SysOssExample example);

    int deleteByExample(SysOssExample example);

    int deleteByPrimaryKey(String id);

    int insert(SysOss record);

    int insertSelective(SysOss record);

    List<SysOss> selectByExample(SysOssExample example);

    SysOss selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") SysOss record, @Param("example") SysOssExample example);

    int updateByExample(@Param("record") SysOss record, @Param("example") SysOssExample example);

    int updateByPrimaryKeySelective(SysOss record);

    int updateByPrimaryKey(SysOss record);
}