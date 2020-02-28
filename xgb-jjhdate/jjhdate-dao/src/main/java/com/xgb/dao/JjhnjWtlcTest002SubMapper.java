package com.xgb.dao;

import com.xgb.model.JjhnjWtlcTest002Sub;
import com.xgb.model.JjhnjWtlcTest002SubExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JjhnjWtlcTest002SubMapper {
    int countByExample(JjhnjWtlcTest002SubExample example);

    int deleteByExample(JjhnjWtlcTest002SubExample example);

    int deleteByPrimaryKey(Long id);

    int insert(JjhnjWtlcTest002Sub record);

    int insertSelective(JjhnjWtlcTest002Sub record);

    List<JjhnjWtlcTest002Sub> selectByExample(JjhnjWtlcTest002SubExample example);

    JjhnjWtlcTest002Sub selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") JjhnjWtlcTest002Sub record, @Param("example") JjhnjWtlcTest002SubExample example);

    int updateByExample(@Param("record") JjhnjWtlcTest002Sub record, @Param("example") JjhnjWtlcTest002SubExample example);

    int updateByPrimaryKeySelective(JjhnjWtlcTest002Sub record);

    int updateByPrimaryKey(JjhnjWtlcTest002Sub record);
}