package com.xgb.service;

import com.xgb.dao.SysPermissionMapper;
import com.xgb.dao.SysRolePermissionMapper;
import com.xgb.dao.SysUserRoleMapper;
import com.xgb.model.*;
import com.xgb.util.MyTools;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * Created by Mr Xgb on 2019/07/28.
 */
@Service
public class SysPermissionService {

	@Autowired
    private SysPermissionMapper sysPermissionMapper;
	@Autowired
    private SysUserRoleMapper sysUserRoleMapper;
	@Autowired
    private SysRolePermissionMapper sysRolePermissionMapper;

    public long countByExample(SysPermissionExample example){
        return sysPermissionMapper.countByExample(example);
    }

    public int deleteByExample(SysPermissionExample example){
        return sysPermissionMapper.deleteByExample(example);
    }

    public int deleteByPrimaryKey(String id){
        return sysPermissionMapper.deleteByPrimaryKey(id);
    }

    public int insert(SysPermission record){
        return sysPermissionMapper.insert(record);
    }

    public int insertSelective(SysPermission record){
        return sysPermissionMapper.insertSelective(record);
    }

    public List<SysPermission> selectByParentId(String parentId){
        SysPermissionExample example = new SysPermissionExample();
        example.createCriteria().andParentIdEqualTo(parentId);
        return sysPermissionMapper.selectByExample(example);
    }

    public SysPermission selectByPrimaryKey(String id){
        return sysPermissionMapper.selectByPrimaryKey(id);
    }

    public int updateByExampleSelective(@Param("record") SysPermission record, @Param("example") SysPermissionExample example){
        return sysPermissionMapper.updateByExampleSelective(record,example);
    }

    public int updateByExample(@Param("record") SysPermission record, @Param("example") SysPermissionExample example){
        return sysPermissionMapper.updateByExample(record,example);
    }

    public int updateByPrimaryKeySelective(SysPermission record){
        return sysPermissionMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(SysPermission record){
        return sysPermissionMapper.updateByPrimaryKey(record);
    }

    //根据登录人id获得当前登录人所有的权限key
    public List<String> getPermissionListByUserId(String userId){
        List<String> lists = new ArrayList<>();
        SysUserRoleExample sysUserRoleExample = new SysUserRoleExample();
        sysUserRoleExample.createCriteria().andUserIdEqualTo(userId);
        List<SysUserRole> sysUserRoles = sysUserRoleMapper.selectByExample(sysUserRoleExample);
        sysUserRoles.forEach(item->{
            SysRolePermissionExample sysRolePermissionExample = new SysRolePermissionExample();
            sysRolePermissionExample.createCriteria().andRoleIdEqualTo(item.getRoleId());
            List<SysRolePermission> sysRolePermissions = sysRolePermissionMapper.selectByExample(sysRolePermissionExample);
            sysRolePermissions.forEach(sysRolePermission->{
                String permissionKey = sysPermissionMapper.selectByPrimaryKey(sysRolePermission.getPermissionId()).getPermissionKey();
                if(MyTools.isNotEmpty(permissionKey)){
                    lists.add(permissionKey);
                }
            });
        });
        return lists;
    }

    //查询权限列表
    public List<Map<String,Object>> selectAllPermissionList(String parentId) {
        List<Map<String,Object>> lists = new ArrayList<Map<String,Object>>();
        SysPermissionExample oneSysPermissionExample = new SysPermissionExample();
        oneSysPermissionExample.createCriteria().andParentIdEqualTo(parentId);
        List<SysPermission> oneSysPermissions = sysPermissionMapper.selectByExample(oneSysPermissionExample);
        if(oneSysPermissions.size()>0){
            oneSysPermissions.forEach(oneSysPermission -> {
                //创建二级菜单集合
                List<Map<String,Object>> twoPermissionList = new ArrayList<Map<String,Object>>();
                Map<String,Object> oneParentMap = new HashMap<String,Object>();
                oneParentMap.put("id",oneSysPermission.getId());
                oneParentMap.put("permissionName",oneSysPermission.getPermissionName());
                oneParentMap.put("remark",oneSysPermission.getRemark());
                oneParentMap.put("permissionKey",oneSysPermission.getPermissionKey());
                oneParentMap.put("permissionType",oneSysPermission.getPermissionType());
                SysPermissionExample twoSysPermissionExample = new SysPermissionExample();
                twoSysPermissionExample.createCriteria().andParentIdEqualTo(oneSysPermission.getId());
                List<SysPermission> twoSysPermissions = sysPermissionMapper.selectByExample(twoSysPermissionExample);
                if(twoSysPermissions.size()>0){
                    twoSysPermissions.forEach(twoSysPermission->{
                        //创建三级菜单集合
                        List<Map<String,Object>> threePermissionList = new ArrayList<Map<String,Object>>();
                        Map<String,Object> twoParentMap = new HashMap<String,Object>();
                        twoParentMap.put("id",twoSysPermission.getId());
                        twoParentMap.put("permissionName",twoSysPermission.getPermissionName());
                        twoParentMap.put("remark",twoSysPermission.getRemark());
                        twoParentMap.put("permissionKey",twoSysPermission.getPermissionKey());
                        twoParentMap.put("permissionType",twoSysPermission.getPermissionType());
                        SysPermissionExample threeSysPermissionExample = new SysPermissionExample();
                        threeSysPermissionExample.createCriteria().andParentIdEqualTo(twoSysPermission.getId());
                        List<SysPermission> threeSysPermissions = sysPermissionMapper.selectByExample(threeSysPermissionExample);
                        if(threeSysPermissions.size()>0){
                            threeSysPermissions.forEach(threeSysPermission->{
                                //创建4级按钮
                                List<Map<String,Object>> fourPermissionList = new ArrayList<Map<String,Object>>();
                                SysPermissionExample fourSysPermissionExample = new SysPermissionExample();
                                fourSysPermissionExample.createCriteria().andParentIdEqualTo(threeSysPermission.getId());
                                List<SysPermission> fourSysPermissions = sysPermissionMapper.selectByExample(fourSysPermissionExample);
                                Map<String,Object> threeParentMap = new HashMap<String,Object>();
                                if (fourSysPermissions.size()>0){
                                    fourSysPermissions.forEach(fourSysPermission->{
                                        Map<String,Object> fourParentMap = new HashMap<String,Object>();
                                        fourParentMap.put("id",fourSysPermission.getId());
                                        fourParentMap.put("permissionName",fourSysPermission.getPermissionName());
                                        fourParentMap.put("remark",fourSysPermission.getRemark());
                                        fourParentMap.put("permissionKey",fourSysPermission.getPermissionKey());
                                        fourParentMap.put("permissionType",fourSysPermission.getPermissionType());
                                        fourPermissionList.add(fourParentMap);
                                    });
                                    threeParentMap.put("children",fourPermissionList);
                                }
                                threeParentMap.put("id",threeSysPermission.getId());
                                threeParentMap.put("permissionName",threeSysPermission.getPermissionName());
                                threeParentMap.put("remark",threeSysPermission.getRemark());
                                threeParentMap.put("permissionKey",threeSysPermission.getPermissionKey());
                                threeParentMap.put("permissionType",threeSysPermission.getPermissionType());
                                threePermissionList.add(threeParentMap);
                            });
                            twoParentMap.put("children",threePermissionList);
                        }
                        twoPermissionList.add(twoParentMap);
                    });
                }
                oneParentMap.put("children",twoPermissionList);
                lists.add(oneParentMap);
            });
        }
        return lists;
    }
    //根据父级id查询权限列表
    public List<SysPermission> selectPermissionByParentId(String parentId) {
        SysPermissionExample example = new SysPermissionExample();
        example.createCriteria().andParentIdEqualTo(parentId);
        return sysPermissionMapper.selectByExample(example);
    }

    public List<SysPermission> selectByExample(SysPermissionExample sysPermissionExample){
        return sysPermissionMapper.selectByExample(sysPermissionExample);
    }

    public List<Map<String,Object>> selectAllRolePermissionList() {
        List<Map<String,Object>> lists = new ArrayList<Map<String,Object>>();
        //查询一级权限列表
        SysPermissionExample oneSysPermissionExample = new SysPermissionExample();
        oneSysPermissionExample.createCriteria().andParentIdEqualTo("0").andPermissionTypeEqualTo("0");
        List<SysPermission> oneSysPermissions = sysPermissionMapper.selectByExample(oneSysPermissionExample);
        if(oneSysPermissions.size()>0){
            oneSysPermissions.forEach(oneItem->{
                List<Map<String,Object>> towLists = new ArrayList<>();
                //根据一级获取二级
                SysPermissionExample twoSysPermissionExample = new SysPermissionExample();
                twoSysPermissionExample.createCriteria().andParentIdEqualTo(oneItem.getId()).andPermissionTypeEqualTo("1");
                List<SysPermission> twoSysPermissions = sysPermissionMapper.selectByExample(twoSysPermissionExample);
                if(twoSysPermissions.size()>0){
                    twoSysPermissions.forEach(twoItem->{
                        List<Map<String,Object>> threeLists = new ArrayList<>();
                        SysPermissionExample threeSysPermissionExample = new SysPermissionExample();
                        threeSysPermissionExample.createCriteria().andParentIdEqualTo(twoItem.getId()).andPermissionTypeEqualTo("2");
                        List<SysPermission> threeSysPermissions = sysPermissionMapper.selectByExample(threeSysPermissionExample);
                        if(threeSysPermissions.size()>0){
                            threeSysPermissions.forEach(threeItem->{
                                List<Map<String,Object>> fourLists = new ArrayList<>();
                                SysPermissionExample fourSysPermissionExample = new SysPermissionExample();
                                fourSysPermissionExample.createCriteria().andParentIdEqualTo(threeItem.getId()).andPermissionTypeEqualTo("3");
                                List<SysPermission> fourSysPermissions = sysPermissionMapper.selectByExample(fourSysPermissionExample);
                                if(fourSysPermissions.size()>0){
                                    fourSysPermissions.forEach(fourItem->{
                                        Map<String,Object> fourMap = new HashMap<>();
                                        fourMap.put("id",fourItem.getId());
                                        fourMap.put("permissionName",fourItem.getPermissionName());
                                        fourMap.put("parentId",fourItem.getParentId());
                                        fourMap.put("permissionType",fourItem.getPermissionType());
                                        fourLists.add(fourMap);
                                    });
                                }
                                Map<String,Object> threeMap = new HashMap<>();
                                threeMap.put("id",threeItem.getId());
                                threeMap.put("permissionName",threeItem.getPermissionName());
                                threeMap.put("parentId",threeItem.getParentId());
                                threeMap.put("permissionType",threeItem.getPermissionType());
                                threeMap.put("children",fourLists);
                                threeLists.add(threeMap);
                            });
                        }
                        Map<String,Object> twoMap = new HashMap<>();
                        twoMap.put("id",twoItem.getId());
                        twoMap.put("permissionName",twoItem.getPermissionName());
                        twoMap.put("parentId",twoItem.getParentId());
                        twoMap.put("permissionType",twoItem.getPermissionType());
                        twoMap.put("children",threeLists);
                        towLists.add(twoMap);
                    });
                }
                Map<String,Object> oneMap = new HashMap<>();
                oneMap.put("id",oneItem.getId());
                oneMap.put("permissionName",oneItem.getPermissionName());
                oneMap.put("parentId",oneItem.getParentId());
                oneMap.put("permissionType",oneItem.getPermissionType());
                oneMap.put("children",towLists);
                lists.add(oneMap);
            });
        }
        return lists;
    }
}
