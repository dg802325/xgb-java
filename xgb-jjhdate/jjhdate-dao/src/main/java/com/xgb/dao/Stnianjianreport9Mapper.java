package com.xgb.dao;

import com.xgb.model.Stnianjianreport9;
import com.xgb.model.Stnianjianreport9Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Stnianjianreport9Mapper {
    int countByExample(Stnianjianreport9Example example);

    int deleteByExample(Stnianjianreport9Example example);

    int insert(Stnianjianreport9 record);

    int insertSelective(Stnianjianreport9 record);

    List<Stnianjianreport9> selectByExample(Stnianjianreport9Example example);

    int updateByExampleSelective(@Param("record") Stnianjianreport9 record, @Param("example") Stnianjianreport9Example example);

    int updateByExample(@Param("record") Stnianjianreport9 record, @Param("example") Stnianjianreport9Example example);
}