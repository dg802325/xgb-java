package com.xgb.dao;

import java.util.List;

import com.xgb.model.JjhnjYszkSub;
import com.xgb.model.JjhnjYszkSubExample;
import org.apache.ibatis.annotations.Param;

public interface JjhnjYszkSubMapper {
    int countByExample(JjhnjYszkSubExample example);

    int deleteByExample(JjhnjYszkSubExample example);

    int deleteByPrimaryKey(Long id);

    int insert(JjhnjYszkSub record);

    int insertSelective(JjhnjYszkSub record);

    List<JjhnjYszkSub> selectByExample(JjhnjYszkSubExample example);

    JjhnjYszkSub selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") JjhnjYszkSub record, @Param("example") JjhnjYszkSubExample example);

    int updateByExample(@Param("record") JjhnjYszkSub record, @Param("example") JjhnjYszkSubExample example);

    int updateByPrimaryKeySelective(JjhnjYszkSub record);

    int updateByPrimaryKey(JjhnjYszkSub record);
}