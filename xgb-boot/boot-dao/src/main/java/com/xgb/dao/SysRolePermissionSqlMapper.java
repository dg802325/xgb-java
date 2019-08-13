package com.xgb.dao;

import com.xgb.model.SysRolePermission;

import java.util.List;
import java.util.Map;


/**
 *
 * Created by Mr Xgb on 2019/07/28.
 */
public interface SysRolePermissionSqlMapper {

	public Integer getSysRolePermissionCount();

    public List<SysRolePermission> getSysRolePermissionList(Map<String, Object> paramMap);

    public SysRolePermission selectOne(Map<String, Object> paramMap);
}
