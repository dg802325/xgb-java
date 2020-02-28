package com.xgb.dao;

import java.util.List;

import com.xgb.model.JjhNjReportGqstqkItem;
import com.xgb.model.JjhNjReportGqstqkItemExample;
import org.apache.ibatis.annotations.Param;

public interface JjhNjReportGqstqkItemMapper {
    int countByExample(JjhNjReportGqstqkItemExample example);

    int deleteByExample(JjhNjReportGqstqkItemExample example);

    int deleteByPrimaryKey(Long id);

    int insert(JjhNjReportGqstqkItem record);

    int insertSelective(JjhNjReportGqstqkItem record);

    List<JjhNjReportGqstqkItem> selectByExample(JjhNjReportGqstqkItemExample example);

    JjhNjReportGqstqkItem selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") JjhNjReportGqstqkItem record, @Param("example") JjhNjReportGqstqkItemExample example);

    int updateByExample(@Param("record") JjhNjReportGqstqkItem record, @Param("example") JjhNjReportGqstqkItemExample example);

    int updateByPrimaryKeySelective(JjhNjReportGqstqkItem record);

    int updateByPrimaryKey(JjhNjReportGqstqkItem record);
}