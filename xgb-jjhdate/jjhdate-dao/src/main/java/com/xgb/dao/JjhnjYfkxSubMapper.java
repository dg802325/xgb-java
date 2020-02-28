package com.xgb.dao;

import java.util.List;

import com.xgb.model.JjhnjYfkxSub;
import com.xgb.model.JjhnjYfkxSubExample;
import org.apache.ibatis.annotations.Param;

public interface JjhnjYfkxSubMapper {
    int countByExample(JjhnjYfkxSubExample example);

    int deleteByExample(JjhnjYfkxSubExample example);

    int deleteByPrimaryKey(Long id);

    int insert(JjhnjYfkxSub record);

    int insertSelective(JjhnjYfkxSub record);

    List<JjhnjYfkxSub> selectByExample(JjhnjYfkxSubExample example);

    JjhnjYfkxSub selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") JjhnjYfkxSub record, @Param("example") JjhnjYfkxSubExample example);

    int updateByExample(@Param("record") JjhnjYfkxSub record, @Param("example") JjhnjYfkxSubExample example);

    int updateByPrimaryKeySelective(JjhnjYfkxSub record);

    int updateByPrimaryKey(JjhnjYfkxSub record);
}