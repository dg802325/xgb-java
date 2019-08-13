package com.xgb.dao;

import com.xgb.model.SysRole;

import java.util.List;
import java.util.Map;


/**
 *
 * Created by Mr Xgb on 2019/07/28.
 */
public interface SysRoleSqlMapper {

	public Integer getSysRoleCount();

    public List<SysRole> getSysRoleList(Map<String, Object> paramMap);

    public SysRole selectOne(Map<String, Object> paramMap);
}
