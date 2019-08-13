package com.xgb.controller;

import com.xgb.lang.R;
import com.xgb.model.SysRole;
import com.xgb.service.SysRoleService;
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
public class SysRoleController {

    protected static final Logger logger = LoggerFactory.getLogger(SysRoleController.class);

    @Autowired
    private SysRoleService sysRoleService;


    /**
    * 查看列表显示
    * @return
    */
    @RequiresPermissions("SYS:ROLE:MENU")
    @GetMapping("/view_sysRole")
	public ModelAndView viewSysRole(ModelAndView mv){
        logger.info("------request-address----------------：/admin/view_sysRole");
        mv.setViewName("admin/view_sys_role");
        return mv;
    }


    /**
    * 列表分页查询
    * @return
    */
    @RequiresPermissions("SYS:ROLE:MENU")
    @ResponseBody
    @GetMapping(value = "getSysRoleForPage")
    public R getSysRoleForPage(@RequestParam Map mapParam) {
        logger.info("------request-address----------------：/admin/getSysRoleForPage");
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
    @RequiresPermissions("SYS:ROLE:INSERT")
    @GetMapping("insert_sysRole")
    public ModelAndView insertSysRole(ModelAndView mv){
        logger.info("------request-address----------------：/admin/insert_sysRole");
        mv.setViewName("admin/insert_sys_role");
        return mv;
    }

    /**
    * 编辑页面跳转
    * @return
    */
    @RequiresPermissions("SYS:ROLE:EDIT")
    @GetMapping("edit_sysRole")
    public ModelAndView editSysRole(ModelAndView mv){
        logger.info("------request-address----------------：/admin/edit_sysRole");
        mv.setViewName("admin/edit_sys_role");
        return mv;
    }

    /**
    * 保存
    * @return
    */
    @ResponseBody
    @RequiresPermissions("SYS:ROLE:SAVE")
    @PostMapping("save_sysRole")
    public R saveSysRole(SysRole sysRole){
        logger.info("------request-address----------------：/admin/save_sysRole");
        Map<String,Object> map = new HashMap<String,Object>();
        if(MyUtils.isEmpty(sysRole.getId())){
            sysRole.setId(UUIDUtils.getUUID());
            if(sysRoleService.insert(sysRole) > 0){
                R.ok("添加成功");
            }else{
                R.error(996,"添加失败");
            }
        }else{
            if(sysRoleService.updateByPrimaryKeySelective(sysRole) > 0){
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
    @RequiresPermissions("SYS:ROLE:DELETE")
    @ResponseBody
    @PostMapping("delete_sysRole")
    public R deleteSysRole(SysRole sysRole) {
        logger.info("------request-address-----------------：/admin/delete_sysRole");
        Map<String,Object> map = new HashMap<String,Object>();
        int delete = sysRoleService.deleteByPrimaryKey(sysRole.getId());
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
    @RequiresPermissions("SYS:ROLE:MENU")
    @GetMapping("select_sysRole")
    public ModelAndView selectSysRole(ModelAndView mv, String id){
        logger.info("------request-address----------------：/admin/select_sysRole");
        SysRole sysRole = sysRoleService.selectByPrimaryKey(id);
        mv.setViewName("admin/select_sysRole");
        mv.addObject("sys_role",sysRole);
        return mv;
    }
}
