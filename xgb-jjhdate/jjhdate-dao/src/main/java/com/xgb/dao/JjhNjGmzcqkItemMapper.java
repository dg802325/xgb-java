package com.xgb.dao;

import java.util.List;

import com.xgb.model.JjhNjGmzcqkItem;
import com.xgb.model.JjhNjGmzcqkItemExample;
import org.apache.ibatis.annotations.Param;

public interface JjhNjGmzcqkItemMapper {
    int countByExample(JjhNjGmzcqkItemExample example);

    int deleteByExample(JjhNjGmzcqkItemExample example);

    int deleteByPrimaryKey(Long id);

    int insert(JjhNjGmzcqkItem record);

    int insertSelective(JjhNjGmzcqkItem record);

    List<JjhNjGmzcqkItem> selectByExample(JjhNjGmzcqkItemExample example);

    JjhNjGmzcqkItem selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") JjhNjGmzcqkItem record, @Param("example") JjhNjGmzcqkItemExample example);

    int updateByExample(@Param("record") JjhNjGmzcqkItem record, @Param("example") JjhNjGmzcqkItemExample example);

    int updateByPrimaryKeySelective(JjhNjGmzcqkItem record);

    int updateByPrimaryKey(JjhNjGmzcqkItem record);
}