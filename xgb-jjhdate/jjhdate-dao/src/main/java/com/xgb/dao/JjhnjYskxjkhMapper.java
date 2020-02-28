package com.xgb.dao;

import java.util.List;

import com.xgb.model.JjhnjYskxjkh;
import com.xgb.model.JjhnjYskxjkhExample;
import org.apache.ibatis.annotations.Param;

public interface JjhnjYskxjkhMapper {
    int countByExample(JjhnjYskxjkhExample example);

    int deleteByExample(JjhnjYskxjkhExample example);

    int deleteByPrimaryKey(Long id);

    int insert(JjhnjYskxjkh record);

    int insertSelective(JjhnjYskxjkh record);

    List<JjhnjYskxjkh> selectByExample(JjhnjYskxjkhExample example);

    JjhnjYskxjkh selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") JjhnjYskxjkh record, @Param("example") JjhnjYskxjkhExample example);

    int updateByExample(@Param("record") JjhnjYskxjkh record, @Param("example") JjhnjYskxjkhExample example);

    int updateByPrimaryKeySelective(JjhnjYskxjkh record);

    int updateByPrimaryKey(JjhnjYskxjkh record);
}