package com.xgb.dao;

import com.xgb.model.MjzzDictionary;
import com.xgb.model.MjzzDictionaryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MjzzDictionaryMapper {
    int countByExample(MjzzDictionaryExample example);

    int deleteByExample(MjzzDictionaryExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MjzzDictionary record);

    int insertSelective(MjzzDictionary record);

    List<MjzzDictionary> selectByExample(MjzzDictionaryExample example);

    MjzzDictionary selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MjzzDictionary record, @Param("example") MjzzDictionaryExample example);

    int updateByExample(@Param("record") MjzzDictionary record, @Param("example") MjzzDictionaryExample example);

    int updateByPrimaryKeySelective(MjzzDictionary record);

    int updateByPrimaryKey(MjzzDictionary record);
}