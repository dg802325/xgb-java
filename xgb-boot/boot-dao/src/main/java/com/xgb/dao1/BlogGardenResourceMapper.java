package com.xgb.dao1;

import com.xgb.model.BlogGardenResource;
import com.xgb.model.BlogGardenResourceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BlogGardenResourceMapper {
    int countByExample(BlogGardenResourceExample example);

    int deleteByExample(BlogGardenResourceExample example);

    int deleteByPrimaryKey(String id);

    int insert(BlogGardenResource record);

    int insertSelective(BlogGardenResource record);

    List<BlogGardenResource> selectByExampleWithBLOBs(BlogGardenResourceExample example);

    List<BlogGardenResource> selectByExample(BlogGardenResourceExample example);

    BlogGardenResource selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") BlogGardenResource record, @Param("example") BlogGardenResourceExample example);

    int updateByExampleWithBLOBs(@Param("record") BlogGardenResource record, @Param("example") BlogGardenResourceExample example);

    int updateByExample(@Param("record") BlogGardenResource record, @Param("example") BlogGardenResourceExample example);

    int updateByPrimaryKeySelective(BlogGardenResource record);

    int updateByPrimaryKeyWithBLOBs(BlogGardenResource record);

    int updateByPrimaryKey(BlogGardenResource record);
}