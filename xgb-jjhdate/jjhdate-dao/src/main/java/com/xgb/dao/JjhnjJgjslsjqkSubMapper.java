package com.xgb.dao;

import java.util.List;

import com.xgb.model.JjhnjJgjslsjqkSub;
import com.xgb.model.JjhnjJgjslsjqkSubExample;
import org.apache.ibatis.annotations.Param;

public interface JjhnjJgjslsjqkSubMapper {
    int countByExample(JjhnjJgjslsjqkSubExample example);

    int deleteByExample(JjhnjJgjslsjqkSubExample example);

    int deleteByPrimaryKey(Long id);

    int insert(JjhnjJgjslsjqkSub record);

    int insertSelective(JjhnjJgjslsjqkSub record);

    List<JjhnjJgjslsjqkSub> selectByExample(JjhnjJgjslsjqkSubExample example);

    JjhnjJgjslsjqkSub selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") JjhnjJgjslsjqkSub record, @Param("example") JjhnjJgjslsjqkSubExample example);

    int updateByExample(@Param("record") JjhnjJgjslsjqkSub record, @Param("example") JjhnjJgjslsjqkSubExample example);

    int updateByPrimaryKeySelective(JjhnjJgjslsjqkSub record);

    int updateByPrimaryKey(JjhnjJgjslsjqkSub record);
}