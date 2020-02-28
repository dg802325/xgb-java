package com.xgb.dao;

import java.util.List;

import com.xgb.model.JjhNjMl;
import com.xgb.model.JjhNjMlExample;
import org.apache.ibatis.annotations.Param;

public interface JjhNjMlMapper {
    int countByExample(JjhNjMlExample example);

    int deleteByExample(JjhNjMlExample example);

    int deleteByPrimaryKey(Long id);

    int insert(JjhNjMl record);

    int insertSelective(JjhNjMl record);

    List<JjhNjMl> selectByExample(JjhNjMlExample example);

    JjhNjMl selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") JjhNjMl record, @Param("example") JjhNjMlExample example);

    int updateByExample(@Param("record") JjhNjMl record, @Param("example") JjhNjMlExample example);

    int updateByPrimaryKeySelective(JjhNjMl record);

    int updateByPrimaryKey(JjhNjMl record);
}