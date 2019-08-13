package com.xgb.dao;

import com.xgb.model.SysDept;

import java.util.List;
import java.util.Map;


/**
 *
 * Created by Mr Xgb on 2019/07/28.
 */
public interface SysDeptSqlMapper {

	public Integer getSysDeptCount();

    public List<SysDept> getSysDeptList(Map<String, Object> paramMap);

    public SysDept selectOne(Map<String, Object> paramMap);
}
