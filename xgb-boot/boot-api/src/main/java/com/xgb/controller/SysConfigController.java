package com.xgb.controller;

import com.xgb.entity.R;
import com.xgb.model.SysConfig;
import com.xgb.service.SysConfigService;
import com.xgb.util.MyTools;
import com.xgb.util.UUIDUtils;
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
public class SysConfigController {

    protected static final Logger logger = LoggerFactory.getLogger(SysConfigController.class);

    @Autowired
    private SysConfigService sysConfigService;


    /**
    * 查看列表显示
    * @return
    */
    @RequiresPermissions("SYS:CONFIG:MENU")
    @GetMapping("/view_sysConfig")
	public ModelAndView viewSysConfig(ModelAndView mv){
        logger.info("------request-address----------------：/admin/view_sysConfig");
        mv.setViewName("admin/view_sys_config");
        return mv;
    }


    /**
    * 列表分页查询
    * @return
    */
    @RequiresPermissions("SYS:CONFIG:MENU")
    @ResponseBody
    @GetMapping(value = "getSysConfigForPage")
    public R getSysConfigForPage(@RequestParam Map mapParam) {
        logger.info("------request-address----------------：/admin/getSysConfigForPage");
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
    @RequiresPermissions("SYS:CONFIG:INSERT")
    @GetMapping("insert_sysConfig")
    public ModelAndView insertSysConfig(ModelAndView mv){
        logger.info("------request-address----------------：/admin/insert_sysConfig");
        mv.setViewName("admin/insert_sys_config");
        return mv;
    }

    /**
    * 编辑页面跳转
    * @return
    */
    @RequiresPermissions("SYS:CONFIG:EDIT")
    @GetMapping("edit_sysConfig")
    public ModelAndView editSysConfig(ModelAndView mv){
        logger.info("------request-address----------------：/admin/edit_sysConfig");
        mv.setViewName("admin/edit_sys_config");
        return mv;
    }

    /**
    * 保存
    * @return
    */
    @ResponseBody
    @RequiresPermissions("SYS:CONFIG:SAVE")
    @PostMapping("save_sysConfig")
    public R saveSysConfig(SysConfig sysConfig){
        logger.info("------request-address----------------：/admin/save_sysConfig");
        Map<String,Object> map = new HashMap<String,Object>();
        if(MyTools.isEmpty(sysConfig.getId())){
            sysConfig.setId(UUIDUtils.getUUID());
            if(sysConfigService.insert(sysConfig) > 0){
                R.ok("添加成功");
            }else{
                R.error(996,"添加失败");
            }
        }else{
            if(sysConfigService.updateByPrimaryKeySelective(sysConfig) > 0){
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
    @RequiresPermissions("SYS:CONFIG:DELETE")
    @ResponseBody
    @PostMapping("delete_sysConfig")
    public R deleteSysConfig(SysConfig sysConfig) {
        logger.info("------request-address-----------------：/admin/delete_sysConfig");
        Map<String,Object> map = new HashMap<String,Object>();
        int delete = sysConfigService.deleteByPrimaryKey(sysConfig.getId());
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
    @RequiresPermissions("SYS:CONFIG:MENU")
    @GetMapping("select_sysConfig")
    public ModelAndView selectSysConfig(ModelAndView mv, String id){
        logger.info("------request-address----------------：/admin/select_sysConfig");
        SysConfig sysConfig = sysConfigService.selectByPrimaryKey(id);
        mv.setViewName("admin/select_sysConfig");
        mv.addObject("sys_config",sysConfig);
        return mv;
    }
}
