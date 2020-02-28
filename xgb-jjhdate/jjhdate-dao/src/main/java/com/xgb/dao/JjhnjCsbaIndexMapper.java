package com.xgb.dao;

import com.xgb.model.JjhnjCsbaIndex;
import com.xgb.model.JjhnjCsbaIndexExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JjhnjCsbaIndexMapper {
    int countByExample(JjhnjCsbaIndexExample example);

    int deleteByExample(JjhnjCsbaIndexExample example);

    int insert(JjhnjCsbaIndex record);

    int insertSelective(JjhnjCsbaIndex record);

    List<JjhnjCsbaIndex> selectByExample(JjhnjCsbaIndexExample example);

    int updateByExampleSelective(@Param("record") JjhnjCsbaIndex record, @Param("example") JjhnjCsbaIndexExample example);

    int updateByExample(@Param("record") JjhnjCsbaIndex record, @Param("example") JjhnjCsbaIndexExample example);
}