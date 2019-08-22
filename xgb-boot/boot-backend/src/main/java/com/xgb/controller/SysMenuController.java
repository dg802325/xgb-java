package com.xgb.controller;

import com.xgb.common.SessionUtil;
import com.xgb.lang.R;
import com.xgb.model.SysMenu;
import com.xgb.model.SysUser;
import com.xgb.model.vo.SysMenuVO;
import com.xgb.model.vo.SysPermissionVO;
import com.xgb.service.SysMenuService;
import com.xgb.service.SysUserRoleService;
import com.xgb.service.SysUserService;
import com.xgb.utils.MyUtils;
import com.xgb.utils.UUIDUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * Created by Mr Xgb on 2019/07/28.
 */
@Controller
@RequestMapping("/admin/")
public class SysMenuController {

    protected static final Logger logger = LoggerFactory.getLogger(SysMenuController.class);

    @Autowired
    private SysMenuService sysMenuService;
    @Autowired
    private SysUserService sysUserService;
    @Autowired
    private SysUserRoleService sysUserRoleService;


    /**
     * 查询菜单列表
     * @return
     */
    @ResponseBody
    @PostMapping(value = "getSysMenuList")
    public List<SysMenuVO> getSysMenuList(String id) {
        logger.info("------request-address----------------：/admin/getSysMenuList");
        //查询代码
        List<SysMenuVO> sysMenuVOS = sysMenuService.selectAllMenuList(id);
        return sysMenuVOS;
    }


    //新增权限
    @ResponseBody
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
        if (sysMenuService.insert(sysMenu)>0) {
            return R.ok("添加成功");
        }
        return R.error(996,"添加失败");
    }

    //编辑权限
    @ResponseBody
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
//    @RequiresPermissions("SYS:MENU:DELETE")
    @ResponseBody
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

    @ResponseBody
    @GetMapping("getUserMenuList")
    public R getUserMenuList() {
        logger.info("------request-address-----------------：/admin/getUserMenuList");
        //获得当前登录人id
        String sysUserId = SessionUtil.getSysUserId();
        //根据当前登录人查询拥有的角色
        List<SysMenuVO> menuList = sysMenuService.getMenuByUserId(sysUserId);
        return R.ok("menuList",menuList,"成功");
    }

}
