package com.xgb.dao;

import com.xgb.model.MfNianjianJbxx;
import com.xgb.model.MfNianjianJbxxExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MfNianjianJbxxMapper {
    int countByExample(MfNianjianJbxxExample example);

    int deleteByExample(MfNianjianJbxxExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MfNianjianJbxx record);

    int insertSelective(MfNianjianJbxx record);

    List<MfNianjianJbxx> selectByExample(MfNianjianJbxxExample example);

    MfNianjianJbxx selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MfNianjianJbxx record, @Param("example") MfNianjianJbxxExample example);

    int updateByExample(@Param("record") MfNianjianJbxx record, @Param("example") MfNianjianJbxxExample example);

    int updateByPrimaryKeySelective(MfNianjianJbxx record);

    int updateByPrimaryKey(MfNianjianJbxx record);
}