package com.xgb.dao1;

import com.xgb.model.BlogGarden;
import com.xgb.model.BlogGardenExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

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