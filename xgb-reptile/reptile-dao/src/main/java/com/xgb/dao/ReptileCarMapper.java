package com.xgb.dao;

import com.xgb.model.ReptileCar;
import com.xgb.model.ReptileCarExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReptileCarMapper {
    int countByExample(ReptileCarExample example);

    int deleteByExample(ReptileCarExample example);

    int deleteByPrimaryKey(String id);

    int insert(ReptileCar record);

    int insertSelective(ReptileCar record);

    List<ReptileCar> selectByExample(ReptileCarExample example);

    ReptileCar selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ReptileCar record, @Param("example") ReptileCarExample example);

    int updateByExample(@Param("record") ReptileCar record, @Param("example") ReptileCarExample example);

    int updateByPrimaryKeySelective(ReptileCar record);

    int updateByPrimaryKey(ReptileCar record);
}