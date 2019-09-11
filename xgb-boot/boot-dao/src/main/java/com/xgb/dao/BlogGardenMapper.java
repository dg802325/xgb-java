package com.xgb.dao;

import com.xgb.model.BlogGarden;
import java.util.List;

import com.xgb.model.BlogGardenExample;
import org.apache.ibatis.annotations.Param;


/**
* @Auther: Mr Deng
* @Date: 2019-09-11 11:44:18
* @Description:
*/
public interface BlogGardenMapper {

    int countByExample(BlogGardenExample example);

    int deleteByExample(BlogGardenExample example);

    int deleteByPrimaryKey(String id);

    int insert(BlogGarden record);

    int insertSelective(BlogGarden record);

    List<BlogGarden> selectByExample(BlogGardenExample example);

    BlogGarden selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") BlogGarden record, @Param("example") BlogGardenExample example);

    int updateByExample(@Param("record") BlogGarden record, @Param("example") BlogGardenExample example);

    int updateByPrimaryKeySelective(BlogGarden record);

    int updateByPrimaryKey(BlogGarden record);
}
