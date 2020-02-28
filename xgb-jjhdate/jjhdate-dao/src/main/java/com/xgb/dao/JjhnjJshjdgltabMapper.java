package com.xgb.dao;

import java.util.List;

import com.xgb.model.JjhnjJshjdgltab;
import com.xgb.model.JjhnjJshjdgltabExample;
import org.apache.ibatis.annotations.Param;

public interface JjhnjJshjdgltabMapper {
    int countByExample(JjhnjJshjdgltabExample example);

    int deleteByExample(JjhnjJshjdgltabExample example);

    int deleteByPrimaryKey(Long id);

    int insert(JjhnjJshjdgltab record);

    int insertSelective(JjhnjJshjdgltab record);

    List<JjhnjJshjdgltab> selectByExample(JjhnjJshjdgltabExample example);

    JjhnjJshjdgltab selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") JjhnjJshjdgltab record, @Param("example") JjhnjJshjdgltabExample example);

    int updateByExample(@Param("record") JjhnjJshjdgltab record, @Param("example") JjhnjJshjdgltabExample example);

    int updateByPrimaryKeySelective(JjhnjJshjdgltab record);

    int updateByPrimaryKey(JjhnjJshjdgltab record);
}