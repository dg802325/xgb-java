package com.xgb.dao;

import com.xgb.model.SysPermission;
import com.xgb.model.vo.SysPermissionVO;

import java.util.List;
import java.util.Map;


/**
 *
 * Created by Mr Xgb on 2019/07/28.
 */
public interface SysPermissionSqlMapper {

	public Integer getSysPermissionCount();

    public List<SysPermission> getSysPermissionList(Map<String, Object> paramMap);

    public SysPermission selectOne(Map<String, Object> paramMap);

    public List<SysPermissionVO> selectByParentId(String parentId);


}
