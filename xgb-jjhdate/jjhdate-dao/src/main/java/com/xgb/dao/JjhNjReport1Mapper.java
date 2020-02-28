package com.xgb.dao;

import java.util.List;

import com.xgb.model.JjhNjReport1;
import com.xgb.model.JjhNjReport1Example;
import org.apache.ibatis.annotations.Param;

public interface JjhNjReport1Mapper {
    int countByExample(JjhNjReport1Example example);

    int deleteByExample(JjhNjReport1Example example);

    int deleteByPrimaryKey(Long id);

    int insert(JjhNjReport1 record);

    int insertSelective(JjhNjReport1 record);

    List<JjhNjReport1> selectByExample(JjhNjReport1Example example);

    JjhNjReport1 selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") JjhNjReport1 record, @Param("example") JjhNjReport1Example example);

    int updateByExample(@Param("record") JjhNjReport1 record, @Param("example") JjhNjReport1Example example);

    int updateByPrimaryKeySelective(JjhNjReport1 record);

    int updateByPrimaryKey(JjhNjReport1 record);
}