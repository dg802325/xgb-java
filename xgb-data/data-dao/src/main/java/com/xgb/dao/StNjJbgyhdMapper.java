package com.xgb.dao;

import com.xgb.model.StNjJbgyhd;
import com.xgb.model.StNjJbgyhdExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StNjJbgyhdMapper {
    int countByExample(StNjJbgyhdExample example);

    int deleteByExample(StNjJbgyhdExample example);

    int deleteByPrimaryKey(Long id);

    int insert(StNjJbgyhd record);

    int insertSelective(StNjJbgyhd record);

    List<StNjJbgyhd> selectByExample(StNjJbgyhdExample example);

    StNjJbgyhd selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") StNjJbgyhd record, @Param("example") StNjJbgyhdExample example);

    int updateByExample(@Param("record") StNjJbgyhd record, @Param("example") StNjJbgyhdExample example);

    int updateByPrimaryKeySelective(StNjJbgyhd record);

    int updateByPrimaryKey(StNjJbgyhd record);
}