package com.xgb.dao;

import com.xgb.model.ShopAdver;
import com.xgb.model.ShopAdverExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShopAdverMapper {
    int countByExample(ShopAdverExample example);

    int deleteByExample(ShopAdverExample example);

    int deleteByPrimaryKey(String id);

    int insert(ShopAdver record);

    int insertSelective(ShopAdver record);

    List<ShopAdver> selectByExample(ShopAdverExample example);

    ShopAdver selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ShopAdver record, @Param("example") ShopAdverExample example);

    int updateByExample(@Param("record") ShopAdver record, @Param("example") ShopAdverExample example);

    int updateByPrimaryKeySelective(ShopAdver record);

    int updateByPrimaryKey(ShopAdver record);
}