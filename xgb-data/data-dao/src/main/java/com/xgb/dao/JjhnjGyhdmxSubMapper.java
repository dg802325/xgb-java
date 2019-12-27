package com.xgb.dao;

import com.xgb.model.JjhnjGyhdmxSub;
import com.xgb.model.JjhnjGyhdmxSubExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JjhnjGyhdmxSubMapper {
    int countByExample(JjhnjGyhdmxSubExample example);

    int deleteByExample(JjhnjGyhdmxSubExample example);

    int deleteByPrimaryKey(Long id);

    int insert(JjhnjGyhdmxSub record);

    int insertSelective(JjhnjGyhdmxSub record);

    List<JjhnjGyhdmxSub> selectByExample(JjhnjGyhdmxSubExample example);

    JjhnjGyhdmxSub selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") JjhnjGyhdmxSub record, @Param("example") JjhnjGyhdmxSubExample example);

    int updateByExample(@Param("record") JjhnjGyhdmxSub record, @Param("example") JjhnjGyhdmxSubExample example);

    int updateByPrimaryKeySelective(JjhnjGyhdmxSub record);

    int updateByPrimaryKey(JjhnjGyhdmxSub record);
}