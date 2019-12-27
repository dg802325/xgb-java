package com.xgb.dao;

import com.xgb.model.StNjHfgxTb;
import com.xgb.model.StNjHfgxTbExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StNjHfgxTbMapper {
    int countByExample(StNjHfgxTbExample example);

    int deleteByExample(StNjHfgxTbExample example);

    int insert(StNjHfgxTb record);

    int insertSelective(StNjHfgxTb record);

    List<StNjHfgxTb> selectByExample(StNjHfgxTbExample example);

    int updateByExampleSelective(@Param("record") StNjHfgxTb record, @Param("example") StNjHfgxTbExample example);

    int updateByExample(@Param("record") StNjHfgxTb record, @Param("example") StNjHfgxTbExample example);
}