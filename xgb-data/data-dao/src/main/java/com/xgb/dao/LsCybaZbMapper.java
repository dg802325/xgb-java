package com.xgb.dao;

import com.xgb.model.LsCybaZb;
import com.xgb.model.LsCybaZbExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LsCybaZbMapper {
    int countByExample(LsCybaZbExample example);

    int deleteByExample(LsCybaZbExample example);

    int deleteByPrimaryKey(Long id);

    int insert(LsCybaZb record);

    int insertSelective(LsCybaZb record);

    List<LsCybaZb> selectByExample(LsCybaZbExample example);

    LsCybaZb selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") LsCybaZb record, @Param("example") LsCybaZbExample example);

    int updateByExample(@Param("record") LsCybaZb record, @Param("example") LsCybaZbExample example);

    int updateByPrimaryKeySelective(LsCybaZb record);

    int updateByPrimaryKey(LsCybaZb record);
}