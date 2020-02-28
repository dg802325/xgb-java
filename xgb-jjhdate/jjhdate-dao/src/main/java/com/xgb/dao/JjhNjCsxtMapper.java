package com.xgb.dao;

import com.xgb.model.JjhNjCsxt;
import com.xgb.model.JjhNjCsxtExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JjhNjCsxtMapper {
    int countByExample(JjhNjCsxtExample example);

    int deleteByExample(JjhNjCsxtExample example);

    int insert(JjhNjCsxt record);

    int insertSelective(JjhNjCsxt record);

    List<JjhNjCsxt> selectByExample(JjhNjCsxtExample example);

    int updateByExampleSelective(@Param("record") JjhNjCsxt record, @Param("example") JjhNjCsxtExample example);

    int updateByExample(@Param("record") JjhNjCsxt record, @Param("example") JjhNjCsxtExample example);
}