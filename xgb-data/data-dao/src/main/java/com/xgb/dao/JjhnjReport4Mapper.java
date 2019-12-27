package com.xgb.dao;

import com.xgb.model.JjhnjReport4;
import com.xgb.model.JjhnjReport4Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JjhnjReport4Mapper {
    int countByExample(JjhnjReport4Example example);

    int deleteByExample(JjhnjReport4Example example);

    int deleteByPrimaryKey(Long id);

    int insert(JjhnjReport4 record);

    int insertSelective(JjhnjReport4 record);

    List<JjhnjReport4> selectByExample(JjhnjReport4Example example);

    JjhnjReport4 selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") JjhnjReport4 record, @Param("example") JjhnjReport4Example example);

    int updateByExample(@Param("record") JjhnjReport4 record, @Param("example") JjhnjReport4Example example);

    int updateByPrimaryKeySelective(JjhnjReport4 record);

    int updateByPrimaryKey(JjhnjReport4 record);
}