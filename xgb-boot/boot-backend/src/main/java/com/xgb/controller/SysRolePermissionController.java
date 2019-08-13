package com.xgb.controller;

import com.xgb.lang.R;
import com.xgb.model.SysRolePermission;
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

import java.util.HashMap;
import java.util.Map;

/**
 *
 * Created by Mr Xgb on 2019/07/28.
 */
@Controller
@RequestMapping("/admin/")
public class SysRolePermissionController {

    protected static final Logger logger = LoggerFactory.getLogger(SysRolePermissionController.class);

    @Autowired
    private SysRolePermissionService sysRolePermissionService;


    /**
    * 查看列表显示
    * @return
    */
    @RequiresPermissions("SYS:ROLE:PERMISSION:MENU")
    @GetMapping("/view_sysRolePermission")
	public ModelAndView viewSysRolePermission(ModelAndView mv){
        logger.info("------request-address----------------：/admin/view_sysRolePermission");
        mv.setViewName("admin/view_sys_role_permission");
        return mv;
    }


    /**
    * 列表分页查询
    * @return
    */
    @RequiresPermissions("SYS:ROLE:PERMISSION:MENU")
    @ResponseBody
    @GetMapping(value = "getSysRolePermissionForPage")
    public R getSysRolePermissionForPage(@RequestParam Map mapParam) {
        logger.info("------request-address----------------：/admin/getSysRolePermissionForPage");
        Map<String,Object> map = new HashMap<String,Object>();
        int begin = Integer.valueOf(mapParam.get("begin").toString());
        int end = Integer.valueOf(mapParam.get("end").toString());
        //查询代码

        //默认返回查询结果
        return R.error(996,"未找到内容");
    }

    /**
    * 新增页面跳转
    * @return
    */
    @RequiresPermissions("SYS:ROLE:PERMISSION:INSERT")
    @GetMapping("insert_sysRolePermission")
    public ModelAndView insertSysRolePermission(ModelAndView mv){
        logger.info("------request-address----------------：/admin/insert_sysRolePermission");
        mv.setViewName("admin/insert_sys_role_permission");
        return mv;
    }

    /**
    * 编辑页面跳转
    * @return
    */
    @RequiresPermissions("SYS:ROLE:PERMISSION:EDIT")
    @GetMapping("edit_sysRolePermission")
    public ModelAndView editSysRolePermission(ModelAndView mv){
        logger.info("------request-address----------------：/admin/edit_sysRolePermission");
        mv.setViewName("admin/edit_sys_role_permission");
        return mv;
    }

    /**
    * 保存
    * @return
    */
    @ResponseBody
    @RequiresPermissions("SYS:ROLE:PERMISSION:SAVE")
    @PostMapping("save_sysRolePermission")
    public R saveSysRolePermission(SysRolePermission sysRolePermission){
        logger.info("------request-address----------------：/admin/save_sysRolePermission");
        Map<String,Object> map = new HashMap<String,Object>();
        if(MyUtils.isEmpty(sysRolePermission.getId())){
            sysRolePermission.setId(UUIDUtils.getUUID());
            if(sysRolePermissionService.insert(sysRolePermission) > 0){
                R.ok("添加成功");
            }else{
                R.error(996,"添加失败");
            }
        }else{
            if(sysRolePermissionService.updateByPrimaryKeySelective(sysRolePermission) > 0){
                R.ok("编辑成功");
            }else{
                R.error(996,"编辑失败");
            }
        }
        return R.error(996,"未做任何操作");
    }

    /**
    * 删除
    * @return
    */
    @RequiresPermissions("SYS:ROLE:PERMISSION:DELETE")
    @ResponseBody
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

    /**
    * freemarker 模板 使用方法
    * 根据id查询一个条数据
    * @return
    */
    @RequiresPermissions("SYS:ROLE:PERMISSION:MENU")
    @GetMapping("select_sysRolePermission")
    public ModelAndView selectSysRolePermission(ModelAndView mv, String id){
        logger.info("------request-address----------------：/admin/select_sysRolePermission");
        SysRolePermission sysRolePermission = sysRolePermissionService.selectByPrimaryKey(id);
        mv.setViewName("admin/select_sysRolePermission");
        mv.addObject("sys_role_permission",sysRolePermission);
        return mv;
    }
}
