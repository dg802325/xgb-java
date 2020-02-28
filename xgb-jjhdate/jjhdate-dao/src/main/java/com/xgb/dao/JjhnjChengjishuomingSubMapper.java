package com.xgb.dao;

import com.xgb.model.JjhnjChengjishuomingSub;
import com.xgb.model.JjhnjChengjishuomingSubExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JjhnjChengjishuomingSubMapper {
    int countByExample(JjhnjChengjishuomingSubExample example);

    int deleteByExample(JjhnjChengjishuomingSubExample example);

    int deleteByPrimaryKey(Long id);

    int insert(JjhnjChengjishuomingSub record);

    int insertSelective(JjhnjChengjishuomingSub record);

    List<JjhnjChengjishuomingSub> selectByExample(JjhnjChengjishuomingSubExample example);

    JjhnjChengjishuomingSub selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") JjhnjChengjishuomingSub record, @Param("example") JjhnjChengjishuomingSubExample example);

    int updateByExample(@Param("record") JjhnjChengjishuomingSub record, @Param("example") JjhnjChengjishuomingSubExample example);

    int updateByPrimaryKeySelective(JjhnjChengjishuomingSub record);

    int updateByPrimaryKey(JjhnjChengjishuomingSub record);
}