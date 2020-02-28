package com.xgb.dao;

import java.util.List;

import com.xgb.model.JjhnjWtlcTest002;
import com.xgb.model.JjhnjWtlcTest002Example;
import org.apache.ibatis.annotations.Param;

public interface JjhnjWtlcTest002Mapper {
    int countByExample(JjhnjWtlcTest002Example example);

    int deleteByExample(JjhnjWtlcTest002Example example);

    int deleteByPrimaryKey(Long id);

    int insert(JjhnjWtlcTest002 record);

    int insertSelective(JjhnjWtlcTest002 record);

    List<JjhnjWtlcTest002> selectByExample(JjhnjWtlcTest002Example example);

    JjhnjWtlcTest002 selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") JjhnjWtlcTest002 record, @Param("example") JjhnjWtlcTest002Example example);

    int updateByExample(@Param("record") JjhnjWtlcTest002 record, @Param("example") JjhnjWtlcTest002Example example);

    int updateByPrimaryKeySelective(JjhnjWtlcTest002 record);

    int updateByPrimaryKey(JjhnjWtlcTest002 record);
}