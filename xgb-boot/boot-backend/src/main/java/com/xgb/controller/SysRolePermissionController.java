package com.xgb.controller;

import com.xgb.common.SessionUtil;
import com.xgb.lang.R;
import com.xgb.model.SysPermission;
import com.xgb.model.SysRolePermission;
import com.xgb.model.SysRolePermissionExample;
import com.xgb.service.SysRolePermissionService;
import com.xgb.utils.MyUtils;
import com.xgb.utils.UUIDUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
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
@RestController
@RequestMapping("/admin/")
public class SysRolePermissionController {

    protected static final Logger logger = LoggerFactory.getLogger(SysRolePermissionController.class);

    @Autowired
    private SysRolePermissionService sysRolePermissionService;


    @GetMapping("getSysRolePermission")
    public List<String> getSysRolePermission(String roleId){
        SysRolePermissionExample sysRolePermissionExample = new SysRolePermissionExample();
        sysRolePermissionExample.createCriteria().andRoleIdEqualTo(roleId).andPermissionTypeEqualTo("2");
        List<SysRolePermission> sysRolePermissions = sysRolePermissionService.selectByExample(sysRolePermissionExample);
        List<String> lists = new ArrayList<>();
        sysRolePermissions.forEach(item->{
            lists.add(item.getPermissionId());
        });
        return lists;
    }

    /**
    * 保存
    * @return
    */
//    @RequiresPermissions("SYS:ROLE:PERMISSION:SAVE")
    @PostMapping("saveSysRolePermission")
    public R saveSysRolePermission(SysRolePermission sysRolePermission){
        logger.info("------request-address----------------：/admin/saveSysRolePermission");
        //判断权限为几级权限
        List<SysPermission> permissionByParentId = sysRolePermissionService.getPermissionByParentId(sysRolePermission.getId());
        List<SysRolePermission> lists = new ArrayList<>();
        permissionByParentId.forEach(item->{
            SysRolePermissionExample sysRolePermissionExample = new SysRolePermissionExample();
            sysRolePermissionExample.createCriteria().andRoleIdEqualTo(sysRolePermission.getRoleId()).andPermissionIdEqualTo(item.getId());
            List<SysRolePermission> sysRolePermissions = sysRolePermissionService.selectByExample(sysRolePermissionExample);
            if(sysRolePermissions.size()>0){
                lists.add(sysRolePermissions.get(0));
            }
        });
        String sysUserId = SessionUtil.getSysUserId();
        if(lists.size()>0){
            //删除角色权限
            int i = sysRolePermissionService.deleteByPrimaryKeyList(lists);
            if(i>0){
                return R.ok("删除成功");
            }else {
                return R.error(999,"删除失败");
            }
        }else {
            //增加角色权限
            int i = sysRolePermissionService.insertList(permissionByParentId, sysRolePermission.getRoleId(), sysUserId);
            if(i>0){
                return R.ok("增加成功");
            }else {
                return R.error(999,"增加失败");
            }
        }
    }

    /**
    * 删除
    * @return
    */
    @RequiresPermissions("SYS:ROLE:PERMISSION:DELETE")
    @PostMapping("delete_sysRolePermission")
    public R deleteSysRolePermission(SysRolePermission sysRolePermission) {
        logger.info("------request-address-----------------：/admin/delete_sysRolePermission");
        Map<String,Object> map = new HashMap<String,Object>();
        int delete = sysRolePermissionService.deleteByPrimaryKey(sysRolePermission.getId());
        if(delete>0){
            return R.ok("删除成功");
        }else{
            return R.error(996,"删除失败");
        }
    }

}
