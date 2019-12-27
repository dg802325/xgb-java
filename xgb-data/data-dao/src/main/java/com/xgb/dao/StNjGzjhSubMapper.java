package com.xgb.dao;

import com.xgb.model.StNjGzjhSub;
import com.xgb.model.StNjGzjhSubExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StNjGzjhSubMapper {
    int countByExample(StNjGzjhSubExample example);

    int deleteByExample(StNjGzjhSubExample example);

    int deleteByPrimaryKey(Long id);

    int insert(StNjGzjhSub record);

    int insertSelective(StNjGzjhSub record);

    List<StNjGzjhSub> selectByExample(StNjGzjhSubExample example);

    StNjGzjhSub selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") StNjGzjhSub record, @Param("example") StNjGzjhSubExample example);

    int updateByExample(@Param("record") StNjGzjhSub record, @Param("example") StNjGzjhSubExample example);

    int updateByPrimaryKeySelective(StNjGzjhSub record);

    int updateByPrimaryKey(StNjGzjhSub record);
}