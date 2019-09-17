package com.xgb.controller;

import com.xgb.common.SessionUtil;
import com.xgb.lang.R;
import com.xgb.model.SysMenu;
import com.xgb.model.SysPermission;
import com.xgb.model.SysPermissionExample;
import com.xgb.model.SysRolePermissionExample;
import com.xgb.service.SysMenuService;
import com.xgb.service.SysPermissionService;
import com.xgb.service.SysRolePermissionService;
import com.xgb.utils.MyUtils;
import com.xgb.utils.UUIDUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.*;

/**
 *
 * Created by Mr Xgb on 2019/07/28.
 */
@RestController
@RequestMapping("/admin/")
public class SysPermissionController {

    protected static final Logger logger = LoggerFactory.getLogger(SysPermissionController.class);

    @Autowired
    private SysPermissionService sysPermissionService;
    @Autowired
    private SysMenuService sysMenuService;

    /**
     * 根据用户token获得会员有的权限key
     * @return
     */
    @GetMapping("getPermissionList")
    public List<String> getPermissionList() {
        logger.info("------request-address----------------：/admin/getSysPermission");
        //查询代码
        String sysUserId = SessionUtil.getSysUserId();
        List<String> lists = sysPermissionService.getPermissionListByUserId(sysUserId);
        return lists;
    }

    /**
     * 查询权限列表
     * @return
     */
    @GetMapping("getSysPermission")
    public List<Map<String,Object>> getSysPermission() {
        logger.info("------request-address----------------：/admin/getSysPermission");
        //查询代码
        List<Map<String, Object>> list = sysPermissionService.selectAllPermissionList("0");
        return list;
    }


    //新增权限
    @PostMapping(value = "addSysPermission")
    public R addSysPermission(String addParentId,String addPermissionName,String addPermissionKey,String addRemark,String addPermissionType) {
        logger.info("------request-address----------------：/admin/addSysPermission");
        SysPermission sysPermission = new SysPermission();
        String sysUserId = SessionUtil.getSysUserId();
        sysPermission.setId(UUIDUtils.getUUID());
        sysPermission.setCreateId(sysUserId);
        sysPermission.setUpdateId(sysUserId);
        sysPermission.setPermissionKey(addPermissionKey);
        sysPermission.setPermissionName(addPermissionName);
        sysPermission.setParentId(addParentId);
        sysPermission.setStatus("0");
        sysPermission.setCreateTime(new Date());
        sysPermission.setUpdateTime(new Date());
        sysPermission.setPermissionType(addPermissionType);
        sysPermission.setRemark(addRemark);
        //获得当前权限permissionKey最大的值
        SysPermissionExample sysPermissionExample = new SysPermissionExample();
        if(addPermissionType.equals("0")){
            sysPermissionExample.createCriteria().andParentIdEqualTo("0").andPermissionCodeLike("___");
            sysPermissionExample.setOrderByClause("PERMISSION_CODE DESC");
            List<SysPermission> sysPermissions = sysPermissionService.selectByExample(sysPermissionExample);
            String newPermissionCode = "001";
            if(sysPermissions.size()>0){
                newPermissionCode = org.apache.commons.lang.StringUtils.leftPad(String.valueOf(Integer.parseInt(sysPermissions.get(0).getPermissionCode()) + 1), 3, "0");

            }
            sysPermission.setPermissionCode(newPermissionCode);
        }else if(addPermissionType.equals("1")){
            String permissionCode = sysPermissionService.selectByPrimaryKey(addParentId).getPermissionCode();
            sysPermissionExample.createCriteria().andParentIdEqualTo("1").andPermissionCodeLike(permissionCode+"___");
            sysPermissionExample.setOrderByClause("PERMISSION_CODE DESC");
            List<SysPermission> sysPermissions = sysPermissionService.selectByExample(sysPermissionExample);
            String newPermissionCode = permissionCode+"001";
            if(sysPermissions.size()>0){
                newPermissionCode = org.apache.commons.lang.StringUtils.leftPad(String.valueOf(Integer.parseInt(sysPermissions.get(0).getPermissionCode()) + 1), 6, "0");
            }
            sysPermission.setPermissionCode(newPermissionCode);
        }else if(addPermissionType.equals("2")){
            String permissionCode = sysPermissionService.selectByPrimaryKey(addParentId).getPermissionCode();
            sysPermissionExample.createCriteria().andParentIdEqualTo("2").andPermissionCodeLike(permissionCode+"___");
            sysPermissionExample.setOrderByClause("PERMISSION_CODE DESC");
            List<SysPermission> sysPermissions = sysPermissionService.selectByExample(sysPermissionExample);
            String newPermissionCode = permissionCode+"001";
            if(sysPermissions.size()>0){
                newPermissionCode = org.apache.commons.lang.StringUtils.leftPad(String.valueOf(Integer.parseInt(sysPermissions.get(0).getPermissionCode()) + 1), 9, "0");
            }
            sysPermission.setPermissionCode(newPermissionCode);
        }else if(addPermissionType.equals("3")){
            String permissionCode = sysPermissionService.selectByPrimaryKey(addParentId).getPermissionCode();
            sysPermissionExample.createCriteria().andParentIdEqualTo("3").andPermissionCodeLike(permissionCode+"___");
            sysPermissionExample.setOrderByClause("PERMISSION_CODE DESC");
            List<SysPermission> sysPermissions = sysPermissionService.selectByExample(sysPermissionExample);
            String newPermissionCode = permissionCode+"001";
            if(sysPermissions.size()>0){
                newPermissionCode = org.apache.commons.lang.StringUtils.leftPad(String.valueOf(Integer.parseInt(sysPermissions.get(0).getPermissionCode()) + 1), 12, "0");
            }
            sysPermission.setPermissionCode(newPermissionCode);
        }
        if (sysPermissionService.insert(sysPermission)>0) {
            return R.ok("添加成功");
        }
            return R.error(996,"添加失败");
    }

    //编辑权限
    @PostMapping(value = "editSysPermission")
    public R editSysPermission(String editPermissionId,String editPermissionName,String editPermissionKey,String editRemark) {
        logger.info("------request-address----------------：/admin/editSysPermission");
        String sysUserId = SessionUtil.getSysUserId();
        SysPermission sysPermission = sysPermissionService.selectByPrimaryKey(editPermissionId);
        sysPermission.setUpdateId(sysUserId);
        sysPermission.setPermissionName(editPermissionName);
        sysPermission.setPermissionKey(editPermissionKey);
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

//    /**
//     * 查询权限列表
//     * @return
//     */
//    @GetMapping(value = "getAllSysPermission")
//    public List<SysPermission> getAllSysPermission(String parentId) {
//        logger.info("------request-address----------------：/admin/getAllSysPermission");
//        //查询代码
//        List<SysPermission> sysPermission = sysPermissionService.selectByExample(new SysPermissionExample());
//        return sysPermission;
//    }

    /**
     * 查询权限列表
     * @return
     */
    @GetMapping(value = "getAllSysPermission")
    public R getAllSysPermission() {
        logger.info("------request-address----------------：/admin/getAllSysPermission");
        //查询代码
        Map<String,Object> parentMap = new HashMap<String,Object>();
        List<SysPermission> sysPermission = sysPermissionService.selectByExample(new SysPermissionExample());
        List<Map<String, Object>> list = sysPermissionService.selectAllRolePermissionList();
        if(list.size()>0){
            parentMap.put("lists",list);
            return R.ok(parentMap);
        }else {
            return R.error(999,"未查到数据");
        }
    }

    /**
     * 根据父级菜单id查询权限列表
     * @return
     */
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
