package com.xgb.dao;

import com.xgb.model.JjhNjZbCsxt;
import com.xgb.model.JjhNjZbCsxtExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JjhNjZbCsxtMapper {
    int countByExample(JjhNjZbCsxtExample example);

    int deleteByExample(JjhNjZbCsxtExample example);

    int insert(JjhNjZbCsxt record);

    int insertSelective(JjhNjZbCsxt record);

    List<JjhNjZbCsxt> selectByExample(JjhNjZbCsxtExample example);

    int updateByExampleSelective(@Param("record") JjhNjZbCsxt record, @Param("example") JjhNjZbCsxtExample example);

    int updateByExample(@Param("record") JjhNjZbCsxt record, @Param("example") JjhNjZbCsxtExample example);
}