package com.xgb.dao;

import com.xgb.model.MfGwyJzTb;
import com.xgb.model.MfGwyJzTbExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MfGwyJzTbMapper {
    int countByExample(MfGwyJzTbExample example);

    int deleteByExample(MfGwyJzTbExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MfGwyJzTb record);

    int insertSelective(MfGwyJzTb record);

    List<MfGwyJzTb> selectByExample(MfGwyJzTbExample example);

    MfGwyJzTb selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MfGwyJzTb record, @Param("example") MfGwyJzTbExample example);

    int updateByExample(@Param("record") MfGwyJzTb record, @Param("example") MfGwyJzTbExample example);

    int updateByPrimaryKeySelective(MfGwyJzTb record);

    int updateByPrimaryKey(MfGwyJzTb record);
}