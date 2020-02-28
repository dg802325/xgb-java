package com.xgb.dao;

import java.util.List;

import com.xgb.model.JjhnjReport3;
import com.xgb.model.JjhnjReport3Example;
import org.apache.ibatis.annotations.Param;

public interface JjhnjReport3Mapper {
    int countByExample(JjhnjReport3Example example);

    int deleteByExample(JjhnjReport3Example example);

    int deleteByPrimaryKey(Long id);

    int insert(JjhnjReport3 record);

    int insertSelective(JjhnjReport3 record);

    List<JjhnjReport3> selectByExample(JjhnjReport3Example example);

    JjhnjReport3 selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") JjhnjReport3 record, @Param("example") JjhnjReport3Example example);

    int updateByExample(@Param("record") JjhnjReport3 record, @Param("example") JjhnjReport3Example example);

    int updateByPrimaryKeySelective(JjhnjReport3 record);

    int updateByPrimaryKey(JjhnjReport3 record);
}