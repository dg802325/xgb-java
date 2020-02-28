package com.xgb.dao;

import java.util.List;

import com.xgb.model.JjhnjReportThr;
import com.xgb.model.JjhnjReportThrExample;
import org.apache.ibatis.annotations.Param;

public interface JjhnjReportThrMapper {
    int countByExample(JjhnjReportThrExample example);

    int deleteByExample(JjhnjReportThrExample example);

    int deleteByPrimaryKey(Long id);

    int insert(JjhnjReportThr record);

    int insertSelective(JjhnjReportThr record);

    List<JjhnjReportThr> selectByExample(JjhnjReportThrExample example);

    JjhnjReportThr selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") JjhnjReportThr record, @Param("example") JjhnjReportThrExample example);

    int updateByExample(@Param("record") JjhnjReportThr record, @Param("example") JjhnjReportThrExample example);

    int updateByPrimaryKeySelective(JjhnjReportThr record);

    int updateByPrimaryKey(JjhnjReportThr record);
}