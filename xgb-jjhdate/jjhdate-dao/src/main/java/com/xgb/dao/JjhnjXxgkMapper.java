package com.xgb.dao;

import com.xgb.model.JjhnjXxgk;
import com.xgb.model.JjhnjXxgkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JjhnjXxgkMapper {
    int countByExample(JjhnjXxgkExample example);

    int deleteByExample(JjhnjXxgkExample example);

    int insert(JjhnjXxgk record);

    int insertSelective(JjhnjXxgk record);

    List<JjhnjXxgk> selectByExample(JjhnjXxgkExample example);

    int updateByExampleSelective(@Param("record") JjhnjXxgk record, @Param("example") JjhnjXxgkExample example);

    int updateByExample(@Param("record") JjhnjXxgk record, @Param("example") JjhnjXxgkExample example);
}