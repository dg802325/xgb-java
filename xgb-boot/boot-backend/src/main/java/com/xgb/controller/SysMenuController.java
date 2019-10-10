package com.xgb.controller;

import com.xgb.common.SessionUtil;
import com.xgb.lang.R;
import com.xgb.model.SysMenu;
import com.xgb.model.SysMenuExample;
import com.xgb.service.SysMenuService;
import com.xgb.service.SysUserRoleService;
import com.xgb.service.SysUserService;
import com.xgb.utils.UUIDUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 *
 * Created by Mr Xgb on 2019/07/28.
 */
@RestController
@RequestMapping("/admin/")
public class SysMenuController {

    protected static final Logger logger = LoggerFactory.getLogger(SysMenuController.class);

    @Autowired
    private SysMenuService sysMenuService;


    /**
     * 查询菜单列表
     * @return
     */
    @RequiresPermissions("SYS:MENU:MENU")
    @PostMapping(value = "getSysMenuList")
    public List<Map<String,Object>> getSysMenuList(String id) {
        logger.info("------request-address----------------：/admin/getSysMenuList");
        //查询代码
        List<Map<String,Object>> list = sysMenuService.selectAllMenuList(id);
        return list;
    }


    //新增权限
    @RequiresPermissions("SYS:MENU:SAVE")
    @PostMapping(value = "addSysMenu")
    public R addSysPermission(SysMenu sysMenu) {
        logger.info("------request-address----------------：/admin/addSysMenu");
        String sysUserId = SessionUtil.getSysUserId();
        sysMenu.setId(UUIDUtils.getUUID());
        sysMenu.setCreateId(sysUserId);
        sysMenu.setUpdateId(sysUserId);
        sysMenu.setStatus("0");
        sysMenu.setCreateTime(new Date());
        sysMenu.setUpdateTime(new Date());
        //获得当前权限permissionKey最大的值
        SysMenuExample sysMenuExample = new SysMenuExample();
        if(sysMenu.getMenuType().equals("0")){
            sysMenuExample.createCriteria().andParentIdEqualTo("0").andMenuCodeLike("___");
            sysMenuExample.setOrderByClause("MENU_CODE DESC");
            List<SysMenu> sysPermissions = sysMenuService.selectByExample(sysMenuExample);
            String newMenuCode = "001";
            if(sysPermissions.size()>0){
                newMenuCode = org.apache.commons.lang.StringUtils.leftPad(String.valueOf(Integer.parseInt(sysPermissions.get(0).getMenuCode()) + 1), 3, "0");

            }
            sysMenu.setMenuCode(newMenuCode);
        }else if(sysMenu.getMenuType().equals("1")){
            String menuCode = sysMenuService.selectByPrimaryKey(sysMenu.getParentId()).getMenuCode();
            sysMenuExample.createCriteria().andParentIdEqualTo("1").andMenuCodeLike(menuCode+"___");
            sysMenuExample.setOrderByClause("MENU_CODE DESC");
            List<SysMenu> sysPermissions = sysMenuService.selectByExample(sysMenuExample);
            String newMenuCode = menuCode+"001";
            if(sysPermissions.size()>0){
                newMenuCode = org.apache.commons.lang.StringUtils.leftPad(String.valueOf(Integer.parseInt(sysPermissions.get(0).getMenuCode()) + 1), 6, "0");
            }
            sysMenu.setMenuCode(newMenuCode);
        }else if(sysMenu.getMenuType().equals("2")){
            String menuCode = sysMenuService.selectByPrimaryKey(sysMenu.getParentId()).getMenuCode();
            sysMenuExample.createCriteria().andParentIdEqualTo("2").andMenuCodeLike(menuCode+"___");
            sysMenuExample.setOrderByClause("MENU_CODE DESC");
            List<SysMenu> sysPermissions = sysMenuService.selectByExample(sysMenuExample);
            String newMenuCode = menuCode+"001";
            if(sysPermissions.size()>0){
                newMenuCode = org.apache.commons.lang.StringUtils.leftPad(String.valueOf(Integer.parseInt(sysPermissions.get(0).getMenuCode()) + 1), 9, "0");
            }
            sysMenu.setMenuCode(newMenuCode);
        }else if(sysMenu.getMenuType().equals("3")){
            String menuCode = sysMenuService.selectByPrimaryKey(sysMenu.getParentId()).getMenuCode();
            sysMenuExample.createCriteria().andParentIdEqualTo("3").andMenuCodeLike(menuCode+"___");
            sysMenuExample.setOrderByClause("MENU_CODE DESC");
            List<SysMenu> sysPermissions = sysMenuService.selectByExample(sysMenuExample);
            String newMenuCode = menuCode+"001";
            if(sysPermissions.size()>0){
                newMenuCode = org.apache.commons.lang.StringUtils.leftPad(String.valueOf(Integer.parseInt(sysPermissions.get(0).getMenuCode()) + 1), 12, "0");
            }
            sysMenu.setMenuCode(newMenuCode);
        }
        if (sysMenuService.insert(sysMenu)>0) {
            return R.ok("添加成功");
        }
        return R.error(996,"添加失败");
    }

    //编辑权限
    @RequiresPermissions("SYS:MENU:SAVE")
    @PostMapping(value = "editSysMenu")
    public R editSysPermission(SysMenu sysMenu) {
        logger.info("------request-address----------------：/admin/editSysMenu");
        String sysUserId = SessionUtil.getSysUserId();
        sysMenu.setUpdateId(sysUserId);
        sysMenu.setUpdateTime(new Date());
        if (sysMenuService.updateByPrimaryKeySelective(sysMenu)>0) {
            return R.ok("编辑成功");
        }
        return R.error(996,"编辑失败");
    }

    /**
    * 删除
    * @return
    */
    @RequiresPermissions("SYS:MENU:DELETE")
    @PostMapping("deleteSysMenu")
    public R deleteSysMenu(String id) {
        logger.info("------request-address-----------------：/admin/deleteSysMenu");
        int delete = sysMenuService.deleteByPrimaryKey(id);
        if(delete>0){
            return R.ok("删除成功");
        }else{
            return R.error(996,"删除失败");
        }
    }

    @GetMapping("getUserMenuList")
    public R getUserMenuList() {
        logger.info("------request-address-----------------：/admin/getUserMenuList");
        //获得当前登录人id
        String sysUserId = SessionUtil.getSysUserId();
        //根据当前登录人查询拥有的角色
        List<Map<String,Object>> menuList = sysMenuService.getMenuByUserId(sysUserId);
        return R.ok("menuList",menuList,"成功");
    }

}
