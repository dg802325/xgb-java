package com.xgb.dao;

import com.xgb.model.SysMenu;
import com.xgb.model.vo.SysMenuVO;

import java.util.List;
import java.util.Map;


/**
 *
 * Created by Mr Xgb on 2019/07/28.
 */
public interface SysMenuSqlMapper {

	public Integer getSysMenuCount();

    public List<SysMenu> getSysMenuList(Map<String, Object> paramMap);

    public SysMenu selectOne(Map<String, Object> paramMap);

    public List<SysMenuVO> selectByParentId(String parentId);

    public List<SysMenuVO> selectMenuByRoleId(String id);
}
