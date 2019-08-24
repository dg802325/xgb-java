package com.xgb.dao;

import com.xgb.model.SysOss;
import com.xgb.model.SysOssExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysOssMapper {
    int countByExample(SysOssExample example);

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