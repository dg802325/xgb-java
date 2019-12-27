package com.xgb.dao;

import com.xgb.model.MjzzUser;
import com.xgb.model.MjzzUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MjzzUserMapper {
    int countByExample(MjzzUserExample example);

    int deleteByExample(MjzzUserExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MjzzUser record);

    int insertSelective(MjzzUser record);

    List<MjzzUser> selectByExample(MjzzUserExample example);

    MjzzUser selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MjzzUser record, @Param("example") MjzzUserExample example);

    int updateByExample(@Param("record") MjzzUser record, @Param("example") MjzzUserExample example);

    int updateByPrimaryKeySelective(MjzzUser record);

    int updateByPrimaryKey(MjzzUser record);
}