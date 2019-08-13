package com.xgb.dao;

import com.xgb.model.SysUser;

import java.util.List;
import java.util.Map;


/**
 *
 * Created by Mr Xgb on 2019/07/28.
 */
public interface SysUserSqlMapper {

	public Integer getSysUserCount();

    public List<SysUser> getSysUserList(Map<String, Object> paramMap);

    public SysUser selectOne(Map<String, Object> paramMap);

    public List getPermissionListByUserName(Map<String, Object> map);
}
