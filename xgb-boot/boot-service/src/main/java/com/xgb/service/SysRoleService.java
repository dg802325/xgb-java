package com.xgb.service;

import com.xgb.dao.*;
import com.xgb.model.*;
import com.xgb.model.vo.SysMenuVO;
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
    private SysDeptMapper sysDeptMapper;


    public List<SysRole> selectByExample(SysRoleExample sysRoleExample) {
        return sysRoleMapper.selectByExample(sysRoleExample);
    }

    public SysRole selectByPrimaryKey(String id) {
        return sysRoleMapper.selectByPrimaryKey(id);
    }


    public List<Map<String,Object>> selectAllRoleList() {
        //查询主权限
        List<Map<String,Object>> lists = new ArrayList<Map<String,Object>>();
        List<SysDept> sysDepts = sysDeptMapper.selectByExample(new SysDeptExample());
        sysDepts.forEach(item->{
            Map<String,Object> parentMap = new HashMap<String,Object>();
            SysRoleExample sysRoleExample = new SysRoleExample();
            sysRoleExample.createCriteria().andDeptIdEqualTo(item.getId());
            List<SysRole> sysRoles = sysRoleMapper.selectByExample(sysRoleExample);
            List<Map<String,Object>> roleLists = new ArrayList<Map<String,Object>>();
            sysRoles.forEach(role->{
                Map<String,Object> roleMap = new HashMap<String,Object>();
                roleMap.put("id",role.getId());
                roleMap.put("name",role.getRoleName());
                roleMap.put("createTime",role.getCreateTime());
                roleMap.put("updateTime",role.getUpdateTime());
                roleMap.put("remark",role.getRemark());
                roleLists.add(roleMap);
            });
            parentMap.put("id",item.getId());
            parentMap.put("name",item.getDeptName());
            parentMap.put("createTime",item.getCreateTime());
            parentMap.put("updateTime",item.getUpdateTime());
            parentMap.put("remark",item.getRemark());
            parentMap.put("children",roleLists);
        });
        return lists;
    }

    public int getRoleCount(){
        return sysRoleMapper.countByExample(new SysRoleExample());
    }
}
