package com.xgb.dao;

import com.xgb.model.LshGzry;
import com.xgb.model.LshGzryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LshGzryMapper {
    int countByExample(LshGzryExample example);

    int deleteByExample(LshGzryExample example);

    int deleteByPrimaryKey(Long id);

    int insert(LshGzry record);

    int insertSelective(LshGzry record);

    List<LshGzry> selectByExample(LshGzryExample example);

    LshGzry selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") LshGzry record, @Param("example") LshGzryExample example);

    int updateByExample(@Param("record") LshGzry record, @Param("example") LshGzryExample example);

    int updateByPrimaryKeySelective(LshGzry record);

    int updateByPrimaryKey(LshGzry record);
}