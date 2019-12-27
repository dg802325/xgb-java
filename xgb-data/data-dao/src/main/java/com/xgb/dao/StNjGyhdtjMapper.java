package com.xgb.dao;

import com.xgb.model.StNjGyhdtj;
import com.xgb.model.StNjGyhdtjExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StNjGyhdtjMapper {
    int countByExample(StNjGyhdtjExample example);

    int deleteByExample(StNjGyhdtjExample example);

    int deleteByPrimaryKey(Long id);

    int insert(StNjGyhdtj record);

    int insertSelective(StNjGyhdtj record);

    List<StNjGyhdtj> selectByExample(StNjGyhdtjExample example);

    StNjGyhdtj selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") StNjGyhdtj record, @Param("example") StNjGyhdtjExample example);

    int updateByExample(@Param("record") StNjGyhdtj record, @Param("example") StNjGyhdtjExample example);

    int updateByPrimaryKeySelective(StNjGyhdtj record);

    int updateByPrimaryKey(StNjGyhdtj record);
}