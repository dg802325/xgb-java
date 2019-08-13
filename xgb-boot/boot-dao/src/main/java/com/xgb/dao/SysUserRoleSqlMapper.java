package com.xgb.dao;

import com.xgb.model.SysUserRole;

import java.util.List;
import java.util.Map;


/**
 *
 * Created by Mr Xgb on 2019/07/28.
 */
public interface SysUserRoleSqlMapper {

	public Integer getSysUserRoleCount();

    public List<SysUserRole> getSysUserRoleList(Map<String, Object> paramMap);

    public SysUserRole selectOne(Map<String, Object> paramMap);
}
