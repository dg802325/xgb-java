package com.xgb.dao;

import java.util.List;

import com.xgb.model.JjhnjJjhyglfjySub;
import com.xgb.model.JjhnjJjhyglfjySubExample;
import org.apache.ibatis.annotations.Param;

public interface JjhnjJjhyglfjySubMapper {
    int countByExample(JjhnjJjhyglfjySubExample example);

    int deleteByExample(JjhnjJjhyglfjySubExample example);

    int deleteByPrimaryKey(Long id);

    int insert(JjhnjJjhyglfjySub record);

    int insertSelective(JjhnjJjhyglfjySub record);

    List<JjhnjJjhyglfjySub> selectByExample(JjhnjJjhyglfjySubExample example);

    JjhnjJjhyglfjySub selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") JjhnjJjhyglfjySub record, @Param("example") JjhnjJjhyglfjySubExample example);

    int updateByExample(@Param("record") JjhnjJjhyglfjySub record, @Param("example") JjhnjJjhyglfjySubExample example);

    int updateByPrimaryKeySelective(JjhnjJjhyglfjySub record);

    int updateByPrimaryKey(JjhnjJjhyglfjySub record);
}