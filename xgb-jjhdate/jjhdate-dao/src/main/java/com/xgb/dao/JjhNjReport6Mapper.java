package com.xgb.dao;

import java.util.List;

import com.xgb.model.JjhNjReport6;
import com.xgb.model.JjhNjReport6Example;
import org.apache.ibatis.annotations.Param;

public interface JjhNjReport6Mapper {
    int countByExample(JjhNjReport6Example example);

    int deleteByExample(JjhNjReport6Example example);

    int deleteByPrimaryKey(Long id);

    int insert(JjhNjReport6 record);

    int insertSelective(JjhNjReport6 record);

    List<JjhNjReport6> selectByExample(JjhNjReport6Example example);

    JjhNjReport6 selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") JjhNjReport6 record, @Param("example") JjhNjReport6Example example);

    int updateByExample(@Param("record") JjhNjReport6 record, @Param("example") JjhNjReport6Example example);

    int updateByPrimaryKeySelective(JjhNjReport6 record);

    int updateByPrimaryKey(JjhNjReport6 record);
}