package com.xgb.dao;

import java.util.List;

import com.xgb.model.JjhNianjianDangjmes;
import com.xgb.model.JjhNianjianDangjmesExample;
import org.apache.ibatis.annotations.Param;

public interface JjhNianjianDangjmesMapper {
    int countByExample(JjhNianjianDangjmesExample example);

    int deleteByExample(JjhNianjianDangjmesExample example);

    int deleteByPrimaryKey(Long id);

    int insert(JjhNianjianDangjmes record);

    int insertSelective(JjhNianjianDangjmes record);

    List<JjhNianjianDangjmes> selectByExample(JjhNianjianDangjmesExample example);

    JjhNianjianDangjmes selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") JjhNianjianDangjmes record, @Param("example") JjhNianjianDangjmesExample example);

    int updateByExample(@Param("record") JjhNianjianDangjmes record, @Param("example") JjhNianjianDangjmesExample example);

    int updateByPrimaryKeySelective(JjhNianjianDangjmes record);

    int updateByPrimaryKey(JjhNianjianDangjmes record);
}