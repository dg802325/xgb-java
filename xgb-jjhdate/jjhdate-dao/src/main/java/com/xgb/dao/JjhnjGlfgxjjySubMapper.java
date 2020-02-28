package com.xgb.dao;

import com.xgb.model.JjhnjGlfgxjjySub;
import com.xgb.model.JjhnjGlfgxjjySubExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JjhnjGlfgxjjySubMapper {
    int countByExample(JjhnjGlfgxjjySubExample example);

    int deleteByExample(JjhnjGlfgxjjySubExample example);

    int deleteByPrimaryKey(Long id);

    int insert(JjhnjGlfgxjjySub record);

    int insertSelective(JjhnjGlfgxjjySub record);

    List<JjhnjGlfgxjjySub> selectByExample(JjhnjGlfgxjjySubExample example);

    JjhnjGlfgxjjySub selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") JjhnjGlfgxjjySub record, @Param("example") JjhnjGlfgxjjySubExample example);

    int updateByExample(@Param("record") JjhnjGlfgxjjySub record, @Param("example") JjhnjGlfgxjjySubExample example);

    int updateByPrimaryKeySelective(JjhnjGlfgxjjySub record);

    int updateByPrimaryKey(JjhnjGlfgxjjySub record);
}