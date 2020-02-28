package com.xgb.dao;

import com.xgb.model.JjhnjWjsysxmyeSub;
import com.xgb.model.JjhnjWjsysxmyeSubExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JjhnjWjsysxmyeSubMapper {
    int countByExample(JjhnjWjsysxmyeSubExample example);

    int deleteByExample(JjhnjWjsysxmyeSubExample example);

    int deleteByPrimaryKey(Long id);

    int insert(JjhnjWjsysxmyeSub record);

    int insertSelective(JjhnjWjsysxmyeSub record);

    List<JjhnjWjsysxmyeSub> selectByExample(JjhnjWjsysxmyeSubExample example);

    JjhnjWjsysxmyeSub selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") JjhnjWjsysxmyeSub record, @Param("example") JjhnjWjsysxmyeSubExample example);

    int updateByExample(@Param("record") JjhnjWjsysxmyeSub record, @Param("example") JjhnjWjsysxmyeSubExample example);

    int updateByPrimaryKeySelective(JjhnjWjsysxmyeSub record);

    int updateByPrimaryKey(JjhnjWjsysxmyeSub record);
}