package com.xgb.dao;

import com.xgb.model.StNjReport11;
import com.xgb.model.StNjReport11Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StNjReport11Mapper {
    int countByExample(StNjReport11Example example);

    int deleteByExample(StNjReport11Example example);

    int deleteByPrimaryKey(Long id);

    int insert(StNjReport11 record);

    int insertSelective(StNjReport11 record);

    List<StNjReport11> selectByExample(StNjReport11Example example);

    StNjReport11 selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") StNjReport11 record, @Param("example") StNjReport11Example example);

    int updateByExample(@Param("record") StNjReport11 record, @Param("example") StNjReport11Example example);

    int updateByPrimaryKeySelective(StNjReport11 record);

    int updateByPrimaryKey(StNjReport11 record);
}