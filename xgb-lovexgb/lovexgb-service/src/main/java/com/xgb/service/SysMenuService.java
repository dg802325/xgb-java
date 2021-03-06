package com.xgb.service;

import com.xgb.dao.*;
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
public class SysMenuService {

	@Autowired
    private SysMenuMapper sysMenuMapper;
	@Autowired
    private SysRoleMapper sysRoleMapper;
	@Autowired
    private SysUserRoleMapper sysUserRoleMapper;
	@Autowired
    private SysRolePermissionMapper sysRolePermissionMapper;
	@Autowired
    private SysPermissionMapper sysPermissionMapper;


        public long countByExample(SysMenuExample example){
            return sysMenuMapper.countByExample(example);
        }

        public int deleteByExample(SysMenuExample example){
            return sysMenuMapper.deleteByExample(example);
        }

        public int deleteByPrimaryKey(String id){
            return sysMenuMapper.deleteByPrimaryKey(id);
        }

        public int insert(SysMenu record){
            return sysMenuMapper.insert(record);
        }

        public int insertSelective(SysMenu record){
            return sysMenuMapper.insertSelective(record);
        }

        public List<SysMenu> selectByExample(SysMenuExample example){
            return sysMenuMapper.selectByExample(example);
        }

        public SysMenu selectByPrimaryKey(String id){
            return sysMenuMapper.selectByPrimaryKey(id);
        }

        public int updateByExampleSelective(@Param("record") SysMenu record, @Param("example") SysMenuExample example){
            return sysMenuMapper.updateByExampleSelective(record,example);
        }

        public int updateByExample(@Param("record") SysMenu record, @Param("example") SysMenuExample example){
            return sysMenuMapper.updateByExample(record,example);
        }

        public int updateByPrimaryKeySelective(SysMenu record){
            return sysMenuMapper.updateByPrimaryKeySelective(record);
        }

        public int updateByPrimaryKey(SysMenu record){
            return sysMenuMapper.updateByPrimaryKey(record);
        }

        public List<Map<String,Object>> selectAllMenuList(String parentId) {
            List<Map<String,Object>> lists = new ArrayList<Map<String,Object>>();
            SysMenuExample oneSysMenu = new SysMenuExample();
            oneSysMenu.createCriteria().andParentIdEqualTo(parentId);
            oneSysMenu.setOrderByClause("SORT ASC");
            List<SysMenu> oneMenus = sysMenuMapper.selectByExample(oneSysMenu);
            oneMenus.forEach(oneMenu->{
                Map<String,Object> oneMu = new HashMap<String,Object>();
                oneMu.put("id",oneMenu.getId());
                oneMu.put("menuName",oneMenu.getMenuName());
                oneMu.put("menuUrl",oneMenu.getMenuUrl());
                oneMu.put("permissionName",sysPermissionMapper.selectByPrimaryKey(oneMenu.getPermissionId()).getPermissionName());
                oneMu.put("parentId",oneMenu.getParentId());
                oneMu.put("permissionId",oneMenu.getPermissionId());
                oneMu.put("sort",oneMenu.getSort());
                oneMu.put("menuType",oneMenu.getMenuType());
                SysMenuExample twoSysMenu = new SysMenuExample();
                twoSysMenu.createCriteria().andParentIdEqualTo(oneMenu.getId());
                List<SysMenu> twoMenus = sysMenuMapper.selectByExample(twoSysMenu);
                List<Map<String,Object>> twolists = new ArrayList<Map<String,Object>>();
                twoMenus.forEach(twoMenu->{
                    Map<String,Object> twoMu = new HashMap<String,Object>();
                    twoMu.put("id",twoMenu.getId());
                    twoMu.put("menuName",twoMenu.getMenuName());
                    twoMu.put("menuUrl",twoMenu.getMenuUrl());
                    twoMu.put("permissionName",sysPermissionMapper.selectByPrimaryKey(twoMenu.getPermissionId()).getPermissionName());
                    twoMu.put("parentId",twoMenu.getParentId());
                    twoMu.put("permissionId",twoMenu.getPermissionId());
                    twoMu.put("sort",twoMenu.getSort());
                    twoMu.put("menuType",twoMenu.getMenuType());
                    SysMenuExample threeSysMenu = new SysMenuExample();
                    threeSysMenu.createCriteria().andParentIdEqualTo(twoMenu.getId());
                    List<SysMenu> threeMenus = sysMenuMapper.selectByExample(threeSysMenu);
                    List<Map<String,Object>> threelists = new ArrayList<Map<String,Object>>();
                    threeMenus.forEach(threeMenu->{
                        Map<String,Object> threeMu = new HashMap<String,Object>();
                        threeMu.put("id",threeMenu.getId());
                        threeMu.put("menuName",threeMenu.getMenuName());
                        threeMu.put("menuUrl",threeMenu.getMenuUrl());
                        threeMu.put("permissionName",sysPermissionMapper.selectByPrimaryKey(threeMenu.getPermissionId()).getPermissionName());
                        threeMu.put("parentId",threeMenu.getParentId());
                        threeMu.put("permissionId",threeMenu.getPermissionId());
                        threeMu.put("sort",threeMenu.getSort());
                        threeMu.put("menuType",threeMenu.getMenuType());
                        threelists.add(threeMu);
                    });
                    twoMu.put("children",threelists);
                    twolists.add(twoMu);
                });
                oneMu.put("children",twolists);
                lists.add(oneMu);
            });
            return lists;
        }

    //获得当前登录人拥有的菜单权限
    public List<Map<String,Object>> getMenuByUserId(String userId) {
        List<Map<String,Object>> lists = new ArrayList<Map<String,Object>>();
        //查询用户管理的角色
        SysUserRoleExample sysUserRoleExample = new SysUserRoleExample();
        sysUserRoleExample.createCriteria().andUserIdEqualTo(userId);
        List<SysUserRole> sysUserRoles = sysUserRoleMapper.selectByExample(sysUserRoleExample);
        sysUserRoles.forEach(item->{
            //获得用户的所有权限  用于比较
            SysRolePermissionExample allRole = new SysRolePermissionExample();
            allRole.createCriteria().andRoleIdEqualTo(item.getRoleId());
            List<SysRolePermission> allPermission = sysRolePermissionMapper.selectByExample(allRole);
            //根据角色查询用户所有的1级权限
            Map<String,Object> seMap = new HashMap<>();
            seMap.put("roleId",item.getRoleId());
            seMap.put("permissionType","0");
            List<SysRolePermission> sysRolePermissions = sysRolePermissionMapper.getSysRolePermissionList(seMap);
            sysRolePermissions.forEach(permissions->{
                //根据权限查询用户关联的菜单1级菜单
                SysMenuExample oneSysMenuExample = new SysMenuExample();
                oneSysMenuExample.createCriteria().andPermissionIdEqualTo(permissions.getPermissionId()).andParentIdEqualTo("0");
                SysMenu oneSysMenu = sysMenuMapper.selectByExample(oneSysMenuExample).get(0);
                Map<String,Object> oneMenu = new HashMap<>();
                oneMenu.put("id",oneSysMenu.getId());
                oneMenu.put("menuName",oneSysMenu.getMenuName());
                oneMenu.put("menuUrl",oneSysMenu.getMenuUrl());
                oneMenu.put("permissionName",sysPermissionMapper.selectByPrimaryKey(oneSysMenu.getPermissionId()).getPermissionName());
                oneMenu.put("sort",oneSysMenu.getSort());
                oneMenu.put("menuType",oneSysMenu.getMenuType());
                //根据一级菜单查询二级菜单
                SysMenuExample towSysMenuExample = new SysMenuExample();
                towSysMenuExample.createCriteria().andParentIdEqualTo(oneSysMenu.getId());
                towSysMenuExample.setOrderByClause("SORT ASC");
                List<SysMenu> twoSysMenus = sysMenuMapper.selectByExample(towSysMenuExample);
                List<Map<String,Object>> twoMenulist = new ArrayList<>();
                //根据二级菜单查询三级菜单
                twoSysMenus.forEach(towMenus->{
                    Map<String,Object> twoMenu = new HashMap<>();
                    twoMenu.put("id",towMenus.getId());
                    twoMenu.put("menuName",towMenus.getMenuName());
                    twoMenu.put("menuUrl",towMenus.getMenuUrl());
                    twoMenu.put("permissionName",sysPermissionMapper.selectByPrimaryKey(towMenus.getPermissionId()).getPermissionName());
                    twoMenu.put("sort",towMenus.getSort());
                    twoMenu.put("menuType",towMenus.getMenuType());
                    SysMenuExample threeSysMenuExample = new SysMenuExample();
                    threeSysMenuExample.createCriteria().andParentIdEqualTo(towMenus.getId());
                    threeSysMenuExample.setOrderByClause("SORT ASC");
                    List<SysMenu> threeSysMenus = sysMenuMapper.selectByExample(threeSysMenuExample);
                    List<Map<String,Object>> threeMenulist = new ArrayList<>();
                    threeSysMenus.forEach(threeMenus->{
                        Map<String,Object> threeMenu = new HashMap<>();
                        threeMenu.put("id",threeMenus.getId());
                        threeMenu.put("menuName",threeMenus.getMenuName());
                        threeMenu.put("menuUrl",threeMenus.getMenuUrl());
                        threeMenu.put("permissionName",sysPermissionMapper.selectByPrimaryKey(threeMenus.getPermissionId()).getPermissionName());
                        threeMenu.put("sort",threeMenus.getSort());
                        threeMenu.put("menuType",threeMenus.getMenuType());
                        SysRolePermission sysRolePermission = allPermission.stream().filter(o -> o.getPermissionId().equals(threeMenus.getPermissionId())).findAny().orElse(null);
                        if (MyTools.isNotEmpty(sysRolePermission)) {
                            threeMenulist.add(threeMenu);
                        }
                        twoMenu.put("menuItemThree",threeMenulist);
                    });
                    SysRolePermission sysRolePermission = allPermission.stream().filter(o -> o.getPermissionId().equals(towMenus.getPermissionId())).findAny().orElse(null);
                    if (MyTools.isNotEmpty(sysRolePermission)) {
                        twoMenulist.add(twoMenu);
                    }
                });
                oneMenu.put("menuItemTwo",twoMenulist);
                lists.add(oneMenu);
            });
        });
        return lists;
    }
}
