package com.xgb.dao;

import com.xgb.model.JjhnjJgjsljlqk;
import com.xgb.model.JjhnjJgjsljlqkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JjhnjJgjsljlqkMapper {
    int countByExample(JjhnjJgjsljlqkExample example);

    int deleteByExample(JjhnjJgjsljlqkExample example);

    int deleteByPrimaryKey(Long id);

    int insert(JjhnjJgjsljlqk record);

    int insertSelective(JjhnjJgjsljlqk record);

    List<JjhnjJgjsljlqk> selectByExample(JjhnjJgjsljlqkExample example);

    JjhnjJgjsljlqk selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") JjhnjJgjsljlqk record, @Param("example") JjhnjJgjsljlqkExample example);

    int updateByExample(@Param("record") JjhnjJgjsljlqk record, @Param("example") JjhnjJgjsljlqkExample example);

    int updateByPrimaryKeySelective(JjhnjJgjsljlqk record);

    int updateByPrimaryKey(JjhnjJgjsljlqk record);
}