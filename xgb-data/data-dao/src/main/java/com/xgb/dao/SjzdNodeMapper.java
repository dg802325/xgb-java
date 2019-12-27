package com.xgb.dao;

import com.xgb.model.SjzdNode;
import com.xgb.model.SjzdNodeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SjzdNodeMapper {
    int countByExample(SjzdNodeExample example);

    int deleteByExample(SjzdNodeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SjzdNode record);

    int insertSelective(SjzdNode record);

    List<SjzdNode> selectByExample(SjzdNodeExample example);

    SjzdNode selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SjzdNode record, @Param("example") SjzdNodeExample example);

    int updateByExample(@Param("record") SjzdNode record, @Param("example") SjzdNodeExample example);

    int updateByPrimaryKeySelective(SjzdNode record);

    int updateByPrimaryKey(SjzdNode record);
}