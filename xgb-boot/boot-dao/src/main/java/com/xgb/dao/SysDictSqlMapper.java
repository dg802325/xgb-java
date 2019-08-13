package com.xgb.dao;

import com.xgb.model.SysDict;

import java.util.List;
import java.util.Map;


/**
 *
 * Created by Mr Xgb on 2019/07/28.
 */
public interface SysDictSqlMapper {

	public Integer getSysDictCount();

    public List<SysDict> getSysDictList(Map<String, Object> paramMap);

    public SysDict selectOne(Map<String, Object> paramMap);
}
