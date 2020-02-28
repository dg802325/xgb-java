package com.xgb.dao;

import com.xgb.model.JjhnjJshjdglSub;
import com.xgb.model.JjhnjJshjdglSubExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JjhnjJshjdglSubMapper {
    int countByExample(JjhnjJshjdglSubExample example);

    int deleteByExample(JjhnjJshjdglSubExample example);

    int deleteByPrimaryKey(Long id);

    int insert(JjhnjJshjdglSub record);

    int insertSelective(JjhnjJshjdglSub record);

    List<JjhnjJshjdglSub> selectByExample(JjhnjJshjdglSubExample example);

    JjhnjJshjdglSub selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") JjhnjJshjdglSub record, @Param("example") JjhnjJshjdglSubExample example);

    int updateByExample(@Param("record") JjhnjJshjdglSub record, @Param("example") JjhnjJshjdglSubExample example);

    int updateByPrimaryKeySelective(JjhnjJshjdglSub record);

    int updateByPrimaryKey(JjhnjJshjdglSub record);
}