package com.xgb.dao;

import java.util.List;

import com.xgb.model.JjhnjYewhddaejzpageSub;
import com.xgb.model.JjhnjYewhddaejzpageSubExample;
import org.apache.ibatis.annotations.Param;

public interface JjhnjYewhddaejzpageSubMapper {
    int countByExample(JjhnjYewhddaejzpageSubExample example);

    int deleteByExample(JjhnjYewhddaejzpageSubExample example);

    int deleteByPrimaryKey(Long id);

    int insert(JjhnjYewhddaejzpageSub record);

    int insertSelective(JjhnjYewhddaejzpageSub record);

    List<JjhnjYewhddaejzpageSub> selectByExample(JjhnjYewhddaejzpageSubExample example);

    JjhnjYewhddaejzpageSub selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") JjhnjYewhddaejzpageSub record, @Param("example") JjhnjYewhddaejzpageSubExample example);

    int updateByExample(@Param("record") JjhnjYewhddaejzpageSub record, @Param("example") JjhnjYewhddaejzpageSubExample example);

    int updateByPrimaryKeySelective(JjhnjYewhddaejzpageSub record);

    int updateByPrimaryKey(JjhnjYewhddaejzpageSub record);
}