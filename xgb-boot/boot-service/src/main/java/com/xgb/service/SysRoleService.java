package com.xgb.service;

import com.xgb.dao.*;
import com.xgb.model.*;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 *
 * Created by Mr Xgb on 2019/07/28.
 */
@Service
public class SysRoleService {

	@Autowired
    private SysRoleMapper sysRoleMapper;
	@Autowired
    private SysUserMapper sysUserMapper;
	@Autowired
    private SysUserRoleMapper sysUserRoleMapper;
	@Autowired
    private SysDeptMapper sysDeptMapper;

    public List<Map<String,Object>> selectRoleMapByDeptId(String deptId,Integer begin,Integer end) {
        SysRoleExample sysRoleExample = new SysRoleExample();
        sysRoleExample.createCriteria();
        sysRoleExample.setOrderByClause("limit"+begin+","+end);
        List<SysRole> sysRoles = sysRoleMapper.selectByExample(sysRoleExample);
        List<Map<String,Object>> lists = new ArrayList<>();
        Iterator<SysRole> iterator = sysRoles.iterator();
        while (iterator.hasNext()) {
            SysRole next = iterator.next();
            SysUserRoleExample example = new SysUserRoleExample();
            example.createCriteria().andRoleIdEqualTo(next.getId());
            SysUserRole sysUserRole = sysUserRoleMapper.selectByExample(example).get(0);
            SysUser sysUser = sysUserMapper.selectByPrimaryKey(sysUserRole.getUserId());
            //获得部门
            SysDept sysDept = sysDeptMapper.selectByPrimaryKey(sysUser.getDeptId());
            Map<String,Object> parentMap = new HashMap<String,Object>();
            parentMap.put("userName",sysUser.getUserName());
            parentMap.put("nickName",sysUser.getNickName());
            parentMap.put("deptName",sysDept.getDeptName());
            parentMap.put("createTime",sysUser.getCreateTime());
            parentMap.put("lastLogin",sysUser.getUpdateTime());
            lists.add(parentMap);
        }
       return lists;
    }

    public Integer getRoleMapByDeptId(String deptId) {
        return sysRoleMapper.countByExample(new SysRoleExample());
    }
}
