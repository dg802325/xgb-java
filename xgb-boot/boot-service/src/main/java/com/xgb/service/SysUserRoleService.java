package com.xgb.service;

import com.xgb.dao.SysDeptMapper;
import com.xgb.dao.SysRoleMapper;
import com.xgb.dao.SysUserMapper;
import com.xgb.dao.SysUserRoleMapper;
import com.xgb.model.*;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

/**
 *
 * Created by Mr Xgb on 2019/07/28.
 */
@Service
public class SysUserRoleService {

    @Autowired
    private SysRoleMapper sysRoleMapper;
    @Autowired
    private SysUserMapper sysUserMapper;
    @Autowired
    private SysUserRoleMapper sysUserRoleMapper;
    @Autowired
    private SysDeptMapper sysDeptMapper;

    public List<Map<String,Object>> selectRoleMapByDeptId(String deptId, Integer begin, Integer end) {
        SysUserExample sysRoleExample = new SysUserExample();
        sysRoleExample.createCriteria();
        sysRoleExample.setOrderByClause("CREATE_TIME DESC LIMIT "+begin+","+end);
        List<SysUser> sysUsers = sysUserMapper.selectByExample(sysRoleExample);
        List<Map<String,Object>> lists = new ArrayList<>();
        Iterator<SysUser> iterator = sysUsers.iterator();
        while (iterator.hasNext()) {
            SysUser next = iterator.next();
            SysUserRoleExample example = new SysUserRoleExample();
            example.createCriteria().andUserIdEqualTo(next.getId());
            SysUserRole sysUserRole = sysUserRoleMapper.selectByExample(example).get(0);
            SysRole sysRole = sysRoleMapper.selectByPrimaryKey(sysUserRole.getRoleId());
            //获得部门
            SysDept sysDept = sysDeptMapper.selectByPrimaryKey(sysRole.getDeptId());
            Map<String,Object> parentMap = new HashMap<String,Object>();
            parentMap.put("id",next.getId());
            parentMap.put("userName",next.getUserName());
            parentMap.put("nickName",next.getNickName());
            parentMap.put("roleName",sysRole.getRoleName());
            parentMap.put("roleId",sysRole.getId());
            parentMap.put("deptName",sysDept.getDeptName());
            parentMap.put("deptId",sysDept.getId());
            parentMap.put("createTime",next.getCreateTime());
            parentMap.put("lastLogin",next.getUpdateTime());
            lists.add(parentMap);
        }
        return lists;
    }

    public int getRoleMapByDeptId(String deptId) {
        return sysRoleMapper.countByExample(new SysRoleExample());
    }


    public int insert(SysUserRole sysUserRole) {
        return sysUserRoleMapper.insert(sysUserRole);
    }

    public SysUserRole selectRoleIdByUserId(String userId) {
        SysUserRoleExample sysUserRoleExample = new SysUserRoleExample();
        sysUserRoleExample.createCriteria().andUserIdEqualTo(userId);
        return sysUserRoleMapper.selectByExample(sysUserRoleExample).get(0);
    }

    @Transactional
    public int update(SysUserRole sysUserRole) {
        return sysUserRoleMapper.updateByPrimaryKey(sysUserRole);
    }

    public List<SysUserRole> selectUserRoleByRoleId(String roleId) {
        SysUserRoleExample example = new SysUserRoleExample();
        example.createCriteria().andRoleIdEqualTo(roleId);
        return sysUserRoleMapper.selectByExample(example);
    }
}
