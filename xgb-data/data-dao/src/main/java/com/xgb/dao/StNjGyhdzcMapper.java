package com.xgb.dao;

import com.xgb.model.StNjGyhdzc;
import com.xgb.model.StNjGyhdzcExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StNjGyhdzcMapper {
    int countByExample(StNjGyhdzcExample example);

    int deleteByExample(StNjGyhdzcExample example);

    int deleteByPrimaryKey(Long id);

    int insert(StNjGyhdzc record);

    int insertSelective(StNjGyhdzc record);

    List<StNjGyhdzc> selectByExample(StNjGyhdzcExample example);

    StNjGyhdzc selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") StNjGyhdzc record, @Param("example") StNjGyhdzcExample example);

    int updateByExample(@Param("record") StNjGyhdzc record, @Param("example") StNjGyhdzcExample example);

    int updateByPrimaryKeySelective(StNjGyhdzc record);

    int updateByPrimaryKey(StNjGyhdzc record);
}