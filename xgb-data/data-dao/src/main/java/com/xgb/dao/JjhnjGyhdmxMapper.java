package com.xgb.dao;

import com.xgb.model.JjhnjGyhdmx;
import com.xgb.model.JjhnjGyhdmxExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JjhnjGyhdmxMapper {
    int countByExample(JjhnjGyhdmxExample example);

    int deleteByExample(JjhnjGyhdmxExample example);

    int deleteByPrimaryKey(Long id);

    int insert(JjhnjGyhdmx record);

    int insertSelective(JjhnjGyhdmx record);

    List<JjhnjGyhdmx> selectByExample(JjhnjGyhdmxExample example);

    JjhnjGyhdmx selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") JjhnjGyhdmx record, @Param("example") JjhnjGyhdmxExample example);

    int updateByExample(@Param("record") JjhnjGyhdmx record, @Param("example") JjhnjGyhdmxExample example);

    int updateByPrimaryKeySelective(JjhnjGyhdmx record);

    int updateByPrimaryKey(JjhnjGyhdmx record);
}