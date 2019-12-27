package com.xgb.dao;

import com.xgb.model.StNjJbgyhdSub;
import com.xgb.model.StNjJbgyhdSubExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StNjJbgyhdSubMapper {
    int countByExample(StNjJbgyhdSubExample example);

    int deleteByExample(StNjJbgyhdSubExample example);

    int deleteByPrimaryKey(Long id);

    int insert(StNjJbgyhdSub record);

    int insertSelective(StNjJbgyhdSub record);

    List<StNjJbgyhdSub> selectByExample(StNjJbgyhdSubExample example);

    StNjJbgyhdSub selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") StNjJbgyhdSub record, @Param("example") StNjJbgyhdSubExample example);

    int updateByExample(@Param("record") StNjJbgyhdSub record, @Param("example") StNjJbgyhdSubExample example);

    int updateByPrimaryKeySelective(StNjJbgyhdSub record);

    int updateByPrimaryKey(StNjJbgyhdSub record);
}