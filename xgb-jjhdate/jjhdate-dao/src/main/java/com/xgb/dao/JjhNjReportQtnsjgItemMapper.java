package com.xgb.dao;

import com.xgb.model.JjhNjReportQtnsjgItem;
import com.xgb.model.JjhNjReportQtnsjgItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JjhNjReportQtnsjgItemMapper {
    int countByExample(JjhNjReportQtnsjgItemExample example);

    int deleteByExample(JjhNjReportQtnsjgItemExample example);

    int deleteByPrimaryKey(Long id);

    int insert(JjhNjReportQtnsjgItem record);

    int insertSelective(JjhNjReportQtnsjgItem record);

    List<JjhNjReportQtnsjgItem> selectByExample(JjhNjReportQtnsjgItemExample example);

    JjhNjReportQtnsjgItem selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") JjhNjReportQtnsjgItem record, @Param("example") JjhNjReportQtnsjgItemExample example);

    int updateByExample(@Param("record") JjhNjReportQtnsjgItem record, @Param("example") JjhNjReportQtnsjgItemExample example);

    int updateByPrimaryKeySelective(JjhNjReportQtnsjgItem record);

    int updateByPrimaryKey(JjhNjReportQtnsjgItem record);
}