package com.xgb.dao;

import com.xgb.model.JjhnjYzhdqkSub;
import com.xgb.model.JjhnjYzhdqkSubExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JjhnjYzhdqkSubMapper {
    int countByExample(JjhnjYzhdqkSubExample example);

    int deleteByExample(JjhnjYzhdqkSubExample example);

    int insert(JjhnjYzhdqkSub record);

    int insertSelective(JjhnjYzhdqkSub record);

    List<JjhnjYzhdqkSub> selectByExample(JjhnjYzhdqkSubExample example);

    int updateByExampleSelective(@Param("record") JjhnjYzhdqkSub record, @Param("example") JjhnjYzhdqkSubExample example);

    int updateByExample(@Param("record") JjhnjYzhdqkSub record, @Param("example") JjhnjYzhdqkSubExample example);
}