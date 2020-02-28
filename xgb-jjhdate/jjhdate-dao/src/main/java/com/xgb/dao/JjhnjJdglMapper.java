package com.xgb.dao;

import java.util.List;

import com.xgb.model.JjhnjJdgl;
import com.xgb.model.JjhnjJdglExample;
import org.apache.ibatis.annotations.Param;

public interface JjhnjJdglMapper {
    int countByExample(JjhnjJdglExample example);

    int deleteByExample(JjhnjJdglExample example);

    int deleteByPrimaryKey(Long id);

    int insert(JjhnjJdgl record);

    int insertSelective(JjhnjJdgl record);

    List<JjhnjJdgl> selectByExample(JjhnjJdglExample example);

    JjhnjJdgl selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") JjhnjJdgl record, @Param("example") JjhnjJdglExample example);

    int updateByExample(@Param("record") JjhnjJdgl record, @Param("example") JjhnjJdglExample example);

    int updateByPrimaryKeySelective(JjhnjJdgl record);

    int updateByPrimaryKey(JjhnjJdgl record);
}