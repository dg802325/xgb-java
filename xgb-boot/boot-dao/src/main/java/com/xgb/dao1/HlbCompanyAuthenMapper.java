package com.xgb.dao1;

import com.xgb.model.HlbCompanyAuthen;
import com.xgb.model.HlbCompanyAuthenExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HlbCompanyAuthenMapper {
    int countByExample(HlbCompanyAuthenExample example);

    int deleteByExample(HlbCompanyAuthenExample example);

    int deleteByPrimaryKey(String id);

    int insert(HlbCompanyAuthen record);

    int insertSelective(HlbCompanyAuthen record);

    List<HlbCompanyAuthen> selectByExample(HlbCompanyAuthenExample example);

    HlbCompanyAuthen selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") HlbCompanyAuthen record, @Param("example") HlbCompanyAuthenExample example);

    int updateByExample(@Param("record") HlbCompanyAuthen record, @Param("example") HlbCompanyAuthenExample example);

    int updateByPrimaryKeySelective(HlbCompanyAuthen record);

    int updateByPrimaryKey(HlbCompanyAuthen record);
}