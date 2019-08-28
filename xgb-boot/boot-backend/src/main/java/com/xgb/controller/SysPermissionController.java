package com.xgb.controller;

import com.xgb.common.SessionUtil;
import com.xgb.lang.R;
import com.xgb.model.SysMenu;
import com.xgb.model.SysPermission;
import com.xgb.service.SysMenuService;
import com.xgb.service.SysPermissionService;
import com.xgb.utils.UUIDUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.*;

/**
 *
 * Created by Mr Xgb on 2019/07/28.
 */
@Controller
@RequestMapping("/admin/")
public class SysPermissionController {

    protected static final Logger logger = LoggerFactory.getLogger(SysPermissionController.class);

    @Autowired
    private SysPermissionService sysPermissionService;
    @Autowired
    private SysMenuService sysMenuService;

    /**
     * 查询权限列表
     * @return
     */
    @ResponseBody
    @PostMapping(value = "getSysPermission")
    public List<Map<String,Object>> getSysPermission() {
        logger.info("------request-address----------------：/admin/getSysPermission");
        //查询代码
        List<Map<String, Object>> list = sysPermissionService.selectAllPermissionList("0");
        return list;
    }


    //新增权限
    @ResponseBody
    @PostMapping(value = "addSysPermission")
    public R addSysPermission(String addParentId,String addPermissionName,String addPermissionKey,String addRemark,String addPermissionType) {
        logger.info("------request-address----------------：/admin/addSysPermission");
        SysPermission sysPermission = new SysPermission();
        String sysUserId = SessionUtil.getSysUserId();
        sysPermission.setId(UUIDUtils.getUUID());
        sysPermission.setCreateId(sysUserId);
        sysPermission.setUpdateId(sysUserId);
        sysPermission.setPermissionName(addPermissionName);
        sysPermission.setParentId(addParentId);
        sysPermission.setStatus("0");
        sysPermission.setCreateTime(new Date());
        sysPermission.setUpdateTime(new Date());
        sysPermission.setPermissionType(addPermissionType);
        sysPermission.setRemark(addRemark);
        if (sysPermissionService.insert(sysPermission)>0) {
            return R.ok("添加成功");
        }
            return R.error(996,"添加失败");
    }

    //编辑权限
    @ResponseBody
    @PostMapping(value = "editSysPermission")
    public R editSysPermission(String editPermissionId,String editPermissionName,String editPermissionKey,String editRemark) {
        logger.info("------request-address----------------：/admin/editSysPermission");
        String sysUserId = SessionUtil.getSysUserId();
        SysPermission sysPermission = sysPermissionService.selectByPrimaryKey(editPermissionId);
        sysPermission.setUpdateId(sysUserId);
        sysPermission.setPermissionName(editPermissionName);
        sysPermission.setRemark(editRemark);
        if (sysPermissionService.updateByPrimaryKeySelective(sysPermission)>0) {
            return R.ok("编辑成功");
        }
        return R.error(996,"编辑失败");
    }


    /**
    * 删除
    * @return
    */
//    @RequiresPermissions("SYS:PERMISSION:DELETE")
    @ResponseBody
    @PostMapping("deleteSysPermission")
    public R deleteSysPermission(String id) {
        logger.info("------request-address-----------------：/admin/delete_sysPermission");
        int delete = sysPermissionService.deleteByPrimaryKey(id);
        if(delete>0){
            return R.ok("删除成功");
        }else{
            return R.error(996,"删除失败");
        }
    }

    /**
     * 根据父级id查询权限列表
     * @return
     */
    @ResponseBody
    @PostMapping(value = "getSysPermissionByparentId")
    public List<SysPermission> getSysPermissionByparentId(String parentId) {
        logger.info("------request-address----------------：/admin/getSysPermission");
        //查询代码
        List<SysPermission> sysPermission = sysPermissionService.selectPermissionByParentId(parentId);
        return sysPermission;
    }

    /**
     * 根据父级菜单id查询权限列表
     * @return
     */
    @ResponseBody
    @PostMapping(value = "getSysPermissionByMenuId")
    public List<SysPermission> getSysPermissionByMenuId(String parentId) {
        logger.info("------request-address----------------：/admin/getSysPermission");
        //查询代码
        List<SysPermission> sysPermission = null;
        if("0".equals(parentId)){
            sysPermission = sysPermissionService.selectPermissionByParentId("0");
        }else {
            SysMenu sysMenu = sysMenuService.selectByPrimaryKey(parentId);
            sysPermission = sysPermissionService.selectPermissionByParentId(sysMenu.getPermissionId());
        }
        return sysPermission;
    }


}
