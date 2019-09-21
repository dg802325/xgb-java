package com.xgb.dao;

import com.xgb.model.BlogClass;
import com.xgb.model.BlogClassExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BlogClassMapper {
    int countByExample(BlogClassExample example);

    int deleteByExample(BlogClassExample example);

    int deleteByPrimaryKey(String id);

    int insert(BlogClass record);

    int insertSelective(BlogClass record);

    List<BlogClass> selectByExample(BlogClassExample example);

    BlogClass selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") BlogClass record, @Param("example") BlogClassExample example);

    int updateByExample(@Param("record") BlogClass record, @Param("example") BlogClassExample example);

    int updateByPrimaryKeySelective(BlogClass record);

    int updateByPrimaryKey(BlogClass record);
}