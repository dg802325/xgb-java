package com.xgb.dao;

import com.xgb.model.NjGwyjzSub;
import com.xgb.model.NjGwyjzSubExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NjGwyjzSubMapper {
    int countByExample(NjGwyjzSubExample example);

    int deleteByExample(NjGwyjzSubExample example);

    int deleteByPrimaryKey(Long id);

    int insert(NjGwyjzSub record);

    int insertSelective(NjGwyjzSub record);

    List<NjGwyjzSub> selectByExample(NjGwyjzSubExample example);

    NjGwyjzSub selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") NjGwyjzSub record, @Param("example") NjGwyjzSubExample example);

    int updateByExample(@Param("record") NjGwyjzSub record, @Param("example") NjGwyjzSubExample example);

    int updateByPrimaryKeySelective(NjGwyjzSub record);

    int updateByPrimaryKey(NjGwyjzSub record);
}