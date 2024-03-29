package com.xgb.service;

import com.xgb.dao1.*;
import com.xgb.model.*;
import com.xgb.util.MyTools;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * Created by Mr Xgb on 2019/07/28.
 */
@Service
public class SysUserService {

	@Autowired
    private SysUserMapper sysUserMapper;
	@Autowired
    private SysUserRoleMapper sysUserRoleMapper;
	@Autowired
    private SysRoleMapper sysRoleMapper;
	@Autowired
    private SysPermissionMapper sysPermissionMapper;
	@Autowired
    private SysRolePermissionMapper sysRolePermissionMapper;

	public SysUser selectUserByPassword(String userName, String password){
	    SysUserExample example = new SysUserExample();
	    example.createCriteria().andUserNameEqualTo(userName).andPasswordEqualTo(password);
        List<SysUser> sysUsers = sysUserMapper.selectByExample(example);
        if(sysUsers.size()>0){
            return sysUsers.get(0);
        }
        return null;
    }
    
    public int deleteByExample(SysUserExample example){
        return sysUserMapper.deleteByExample(example);
    }

    public int deleteByPrimaryKey(String id){
        return sysUserMapper.deleteByPrimaryKey(id);
    }

    public int insert(SysUser record){
        return sysUserMapper.insert(record);
    }

    public int insertSelective(SysUser record){
        return sysUserMapper.insertSelective(record);
    }

    public List<SysUser> selectByExample(SysUserExample example){
        return sysUserMapper.selectByExample(example);
    }

    public SysUser selectByPrimaryKey(String id){
        return sysUserMapper.selectByPrimaryKey(id);
    }

    public int updateByExampleSelective(@Param("record") SysUser record, @Param("example") SysUserExample example){
        return sysUserMapper.updateByExampleSelective(record,example);
    }


    public int update(SysUser sysUser){
	    return sysUserMapper.updateByPrimaryKeySelective(sysUser);
    }

    public int updateByPrimaryKeySelective(SysUser record){
        return sysUserMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(SysUser record){
        return sysUserMapper.updateByPrimaryKey(record);
    }

    public int getUserCount(SysUserExample sysUserExample){

	    return sysUserMapper.countByExample(sysUserExample);
    }

    public List<String> selectPermissionByUserId(String userId) {
	    List<String> lists = new ArrayList<String>();
        SysUserRoleExample sysUserRoleExample = new SysUserRoleExample();
        sysUserRoleExample.createCriteria().andUserIdEqualTo(userId);
        List<SysUserRole> sysUserRoles = sysUserRoleMapper.selectByExample(sysUserRoleExample);
        sysUserRoles.forEach(item->{
            SysRolePermissionExample sysRolePermissionExample = new SysRolePermissionExample();
            sysRolePermissionExample.createCriteria().andRoleIdEqualTo(item.getRoleId());
            List<SysRolePermission> sysRolePermissions = sysRolePermissionMapper.selectByExample(sysRolePermissionExample);
            sysRolePermissions.forEach(permissions->{
                String permissionKey = sysPermissionMapper.selectByPrimaryKey(permissions.getPermissionId()).getPermissionKey();
                if(MyTools.isNotEmpty(permissionKey)){
                    lists.add(permissionKey);
                }
            });
        });
        return lists;
    }
}
