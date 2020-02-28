package com.xgb.dao;

import com.xgb.model.SNianjianBranch;
import com.xgb.model.SNianjianBranchExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SNianjianBranchMapper {
    int countByExample(SNianjianBranchExample example);

    int deleteByExample(SNianjianBranchExample example);

    int insert(SNianjianBranch record);

    int insertSelective(SNianjianBranch record);

    List<SNianjianBranch> selectByExample(SNianjianBranchExample example);

    int updateByExampleSelective(@Param("record") SNianjianBranch record, @Param("example") SNianjianBranchExample example);

    int updateByExample(@Param("record") SNianjianBranch record, @Param("example") SNianjianBranchExample example);
}