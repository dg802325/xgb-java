package com.xgb.dao;

import com.xgb.model.JjhnjZhdgyhdshzSub;
import com.xgb.model.JjhnjZhdgyhdshzSubExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JjhnjZhdgyhdshzSubMapper {
    int countByExample(JjhnjZhdgyhdshzSubExample example);

    int deleteByExample(JjhnjZhdgyhdshzSubExample example);

    int insert(JjhnjZhdgyhdshzSub record);

    int insertSelective(JjhnjZhdgyhdshzSub record);

    List<JjhnjZhdgyhdshzSub> selectByExample(JjhnjZhdgyhdshzSubExample example);

    int updateByExampleSelective(@Param("record") JjhnjZhdgyhdshzSub record, @Param("example") JjhnjZhdgyhdshzSubExample example);

    int updateByExample(@Param("record") JjhnjZhdgyhdshzSub record, @Param("example") JjhnjZhdgyhdshzSubExample example);
}