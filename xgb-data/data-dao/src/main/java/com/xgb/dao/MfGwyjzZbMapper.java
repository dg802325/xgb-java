package com.xgb.dao;

import com.xgb.model.MfGwyjzZb;
import com.xgb.model.MfGwyjzZbExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MfGwyjzZbMapper {
    int countByExample(MfGwyjzZbExample example);

    int deleteByExample(MfGwyjzZbExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MfGwyjzZb record);

    int insertSelective(MfGwyjzZb record);

    List<MfGwyjzZb> selectByExample(MfGwyjzZbExample example);

    MfGwyjzZb selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MfGwyjzZb record, @Param("example") MfGwyjzZbExample example);

    int updateByExample(@Param("record") MfGwyjzZb record, @Param("example") MfGwyjzZbExample example);

    int updateByPrimaryKeySelective(MfGwyjzZb record);

    int updateByPrimaryKey(MfGwyjzZb record);
}