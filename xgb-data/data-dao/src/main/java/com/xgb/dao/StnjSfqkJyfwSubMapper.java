package com.xgb.dao;

import com.xgb.model.StnjSfqkJyfwSub;
import com.xgb.model.StnjSfqkJyfwSubExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StnjSfqkJyfwSubMapper {
    int countByExample(StnjSfqkJyfwSubExample example);

    int deleteByExample(StnjSfqkJyfwSubExample example);

    int deleteByPrimaryKey(Long id);

    int insert(StnjSfqkJyfwSub record);

    int insertSelective(StnjSfqkJyfwSub record);

    List<StnjSfqkJyfwSub> selectByExample(StnjSfqkJyfwSubExample example);

    StnjSfqkJyfwSub selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") StnjSfqkJyfwSub record, @Param("example") StnjSfqkJyfwSubExample example);

    int updateByExample(@Param("record") StnjSfqkJyfwSub record, @Param("example") StnjSfqkJyfwSubExample example);

    int updateByPrimaryKeySelective(StnjSfqkJyfwSub record);

    int updateByPrimaryKey(StnjSfqkJyfwSub record);
}