package com.xgb.dao;

import com.xgb.model.NjGwyjzTb;
import com.xgb.model.NjGwyjzTbExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NjGwyjzTbMapper {
    int countByExample(NjGwyjzTbExample example);

    int deleteByExample(NjGwyjzTbExample example);

    int insert(NjGwyjzTb record);

    int insertSelective(NjGwyjzTb record);

    List<NjGwyjzTb> selectByExample(NjGwyjzTbExample example);

    int updateByExampleSelective(@Param("record") NjGwyjzTb record, @Param("example") NjGwyjzTbExample example);

    int updateByExample(@Param("record") NjGwyjzTb record, @Param("example") NjGwyjzTbExample example);
}