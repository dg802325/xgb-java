package com.xgb.dao;

import com.xgb.model.StNjGyhdzcSub;
import com.xgb.model.StNjGyhdzcSubExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StNjGyhdzcSubMapper {
    int countByExample(StNjGyhdzcSubExample example);

    int deleteByExample(StNjGyhdzcSubExample example);

    int insert(StNjGyhdzcSub record);

    int insertSelective(StNjGyhdzcSub record);

    List<StNjGyhdzcSub> selectByExample(StNjGyhdzcSubExample example);

    int updateByExampleSelective(@Param("record") StNjGyhdzcSub record, @Param("example") StNjGyhdzcSubExample example);

    int updateByExample(@Param("record") StNjGyhdzcSub record, @Param("example") StNjGyhdzcSubExample example);
}