package com.xgb.dao1;

import com.xgb.model.ChinaBankCode;
import com.xgb.model.ChinaBankCodeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ChinaBankCodeMapper {
    int countByExample(ChinaBankCodeExample example);

    int deleteByExample(ChinaBankCodeExample example);

    int deleteByPrimaryKey(String id);

    int insert(ChinaBankCode record);

    int insertSelective(ChinaBankCode record);

    List<ChinaBankCode> selectByExample(ChinaBankCodeExample example);

    ChinaBankCode selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ChinaBankCode record, @Param("example") ChinaBankCodeExample example);

    int updateByExample(@Param("record") ChinaBankCode record, @Param("example") ChinaBankCodeExample example);

    int updateByPrimaryKeySelective(ChinaBankCode record);

    int updateByPrimaryKey(ChinaBankCode record);
}