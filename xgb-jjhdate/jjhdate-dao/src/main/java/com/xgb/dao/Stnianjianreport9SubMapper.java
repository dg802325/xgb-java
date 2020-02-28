package com.xgb.dao;

import com.xgb.model.Stnianjianreport9Sub;
import com.xgb.model.Stnianjianreport9SubExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Stnianjianreport9SubMapper {
    int countByExample(Stnianjianreport9SubExample example);

    int deleteByExample(Stnianjianreport9SubExample example);

    int insert(Stnianjianreport9Sub record);

    int insertSelective(Stnianjianreport9Sub record);

    List<Stnianjianreport9Sub> selectByExample(Stnianjianreport9SubExample example);

    int updateByExampleSelective(@Param("record") Stnianjianreport9Sub record, @Param("example") Stnianjianreport9SubExample example);

    int updateByExample(@Param("record") Stnianjianreport9Sub record, @Param("example") Stnianjianreport9SubExample example);
}