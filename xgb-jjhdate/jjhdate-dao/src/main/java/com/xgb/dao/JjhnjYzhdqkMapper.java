package com.xgb.dao;

import com.xgb.model.JjhnjYzhdqk;
import com.xgb.model.JjhnjYzhdqkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JjhnjYzhdqkMapper {
    int countByExample(JjhnjYzhdqkExample example);

    int deleteByExample(JjhnjYzhdqkExample example);

    int deleteByPrimaryKey(Long id);

    int insert(JjhnjYzhdqk record);

    int insertSelective(JjhnjYzhdqk record);

    List<JjhnjYzhdqk> selectByExample(JjhnjYzhdqkExample example);

    JjhnjYzhdqk selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") JjhnjYzhdqk record, @Param("example") JjhnjYzhdqkExample example);

    int updateByExample(@Param("record") JjhnjYzhdqk record, @Param("example") JjhnjYzhdqkExample example);

    int updateByPrimaryKeySelective(JjhnjYzhdqk record);

    int updateByPrimaryKey(JjhnjYzhdqk record);
}