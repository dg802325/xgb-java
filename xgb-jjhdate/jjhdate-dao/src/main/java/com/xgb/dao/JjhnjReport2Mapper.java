package com.xgb.dao;

import java.util.List;

import com.xgb.model.JjhnjReport2;
import com.xgb.model.JjhnjReport2Example;
import org.apache.ibatis.annotations.Param;

public interface JjhnjReport2Mapper {
    int countByExample(JjhnjReport2Example example);

    int deleteByExample(JjhnjReport2Example example);

    int deleteByPrimaryKey(Long id);

    int insert(JjhnjReport2 record);

    int insertSelective(JjhnjReport2 record);

    List<JjhnjReport2> selectByExample(JjhnjReport2Example example);

    JjhnjReport2 selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") JjhnjReport2 record, @Param("example") JjhnjReport2Example example);

    int updateByExample(@Param("record") JjhnjReport2 record, @Param("example") JjhnjReport2Example example);

    int updateByPrimaryKeySelective(JjhnjReport2 record);

    int updateByPrimaryKey(JjhnjReport2 record);
}