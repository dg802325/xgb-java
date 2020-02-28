package com.xgb.dao;

import com.xgb.model.JjhNjReportZxqkItem;
import com.xgb.model.JjhNjReportZxqkItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JjhNjReportZxqkItemMapper {
    int countByExample(JjhNjReportZxqkItemExample example);

    int deleteByExample(JjhNjReportZxqkItemExample example);

    int deleteByPrimaryKey(Long id);

    int insert(JjhNjReportZxqkItem record);

    int insertSelective(JjhNjReportZxqkItem record);

    List<JjhNjReportZxqkItem> selectByExample(JjhNjReportZxqkItemExample example);

    JjhNjReportZxqkItem selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") JjhNjReportZxqkItem record, @Param("example") JjhNjReportZxqkItemExample example);

    int updateByExample(@Param("record") JjhNjReportZxqkItem record, @Param("example") JjhNjReportZxqkItemExample example);

    int updateByPrimaryKeySelective(JjhNjReportZxqkItem record);

    int updateByPrimaryKey(JjhNjReportZxqkItem record);
}