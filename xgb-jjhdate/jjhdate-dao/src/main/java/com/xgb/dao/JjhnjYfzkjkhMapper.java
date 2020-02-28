package com.xgb.dao;

import java.util.List;

import com.xgb.model.JjhnjYfzkjkh;
import com.xgb.model.JjhnjYfzkjkhExample;
import org.apache.ibatis.annotations.Param;

public interface JjhnjYfzkjkhMapper {
    int countByExample(JjhnjYfzkjkhExample example);

    int deleteByExample(JjhnjYfzkjkhExample example);

    int deleteByPrimaryKey(Long id);

    int insert(JjhnjYfzkjkh record);

    int insertSelective(JjhnjYfzkjkh record);

    List<JjhnjYfzkjkh> selectByExample(JjhnjYfzkjkhExample example);

    JjhnjYfzkjkh selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") JjhnjYfzkjkh record, @Param("example") JjhnjYfzkjkhExample example);

    int updateByExample(@Param("record") JjhnjYfzkjkh record, @Param("example") JjhnjYfzkjkhExample example);

    int updateByPrimaryKeySelective(JjhnjYfzkjkh record);

    int updateByPrimaryKey(JjhnjYfzkjkh record);
}