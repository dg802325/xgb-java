package com.xgb.controller;

import com.xgb.lang.R;
import com.xgb.model.SysUserRole;
import com.xgb.service.SysUserRoleService;
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
public class SysUserRoleController {

    protected static final Logger logger = LoggerFactory.getLogger(SysUserRoleController.class);

    @Autowired
    private SysUserRoleService sysUserRoleService;


    /**
    * 查看列表显示
    * @return
    */
    @RequiresPermissions("SYS:USER:ROLE:MENU")
    @GetMapping("/view_sysUserRole")
	public ModelAndView viewSysUserRole(ModelAndView mv){
        logger.info("------request-address----------------：/admin/view_sysUserRole");
        mv.setViewName("admin/view_sys_user_role");
        return mv;
    }


    /**
    * 列表分页查询
    * @return
    */
    @RequiresPermissions("SYS:USER:ROLE:MENU")
    @ResponseBody
    @GetMapping(value = "getSysUserRoleForPage")
    public R getSysUserRoleForPage(@RequestParam Map mapParam) {
        logger.info("------request-address----------------：/admin/getSysUserRoleForPage");
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
    @RequiresPermissions("SYS:USER:ROLE:INSERT")
    @GetMapping("insert_sysUserRole")
    public ModelAndView insertSysUserRole(ModelAndView mv){
        logger.info("------request-address----------------：/admin/insert_sysUserRole");
        mv.setViewName("admin/insert_sys_user_role");
        return mv;
    }

    /**
    * 编辑页面跳转
    * @return
    */
    @RequiresPermissions("SYS:USER:ROLE:EDIT")
    @GetMapping("edit_sysUserRole")
    public ModelAndView editSysUserRole(ModelAndView mv){
        logger.info("------request-address----------------：/admin/edit_sysUserRole");
        mv.setViewName("admin/edit_sys_user_role");
        return mv;
    }

    /**
    * 保存
    * @return
    */
    @ResponseBody
    @RequiresPermissions("SYS:USER:ROLE:SAVE")
    @PostMapping("save_sysUserRole")
    public R saveSysUserRole(SysUserRole sysUserRole){
        logger.info("------request-address----------------：/admin/save_sysUserRole");
        Map<String,Object> map = new HashMap<String,Object>();
        if(MyUtils.isEmpty(sysUserRole.getId())){
            sysUserRole.setId(UUIDUtils.getUUID());
            if(sysUserRoleService.insert(sysUserRole) > 0){
                R.ok("添加成功");
            }else{
                R.error(996,"添加失败");
            }
        }else{
            if(sysUserRoleService.updateByPrimaryKeySelective(sysUserRole) > 0){
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
    @RequiresPermissions("SYS:USER:ROLE:DELETE")
    @ResponseBody
    @PostMapping("delete_sysUserRole")
    public R deleteSysUserRole(SysUserRole sysUserRole) {
        logger.info("------request-address-----------------：/admin/delete_sysUserRole");
        Map<String,Object> map = new HashMap<String,Object>();
        int delete = sysUserRoleService.deleteByPrimaryKey(sysUserRole.getId());
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
    @RequiresPermissions("SYS:USER:ROLE:MENU")
    @GetMapping("select_sysUserRole")
    public ModelAndView selectSysUserRole(ModelAndView mv, String id){
        logger.info("------request-address----------------：/admin/select_sysUserRole");
        SysUserRole sysUserRole = sysUserRoleService.selectByPrimaryKey(id);
        mv.setViewName("admin/select_sysUserRole");
        mv.addObject("sys_user_role",sysUserRole);
        return mv;
    }
}
