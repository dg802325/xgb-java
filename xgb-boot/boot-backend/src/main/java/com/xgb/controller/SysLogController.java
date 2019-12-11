package com.xgb.controller;

import com.xgb.entity.R;
import com.xgb.model.SysLog;
import com.xgb.service.SysLogService;
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
public class SysLogController {

    protected static final Logger logger = LoggerFactory.getLogger(SysLogController.class);

    @Autowired
    private SysLogService sysLogService;


    /**
    * 查看列表显示
    * @return
    */
    @RequiresPermissions("SYS:LOG:MENU")
    @GetMapping("/view_sysLog")
	public ModelAndView viewSysLog(ModelAndView mv){
        logger.info("------request-address----------------：/admin/view_sysLog");
        mv.setViewName("admin/view_sys_log");
        return mv;
    }


    /**
    * 列表分页查询
    * @return
    */
    @RequiresPermissions("SYS:LOG:MENU")
    @ResponseBody
    @GetMapping(value = "getSysLogForPage")
    public R getSysLogForPage(@RequestParam Map mapParam) {
        logger.info("------request-address----------------：/admin/getSysLogForPage");
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
    @RequiresPermissions("SYS:LOG:INSERT")
    @GetMapping("insert_sysLog")
    public ModelAndView insertSysLog(ModelAndView mv){
        logger.info("------request-address----------------：/admin/insert_sysLog");
        mv.setViewName("admin/insert_sys_log");
        return mv;
    }

    /**
    * 编辑页面跳转
    * @return
    */
    @RequiresPermissions("SYS:LOG:EDIT")
    @GetMapping("edit_sysLog")
    public ModelAndView editSysLog(ModelAndView mv){
        logger.info("------request-address----------------：/admin/edit_sysLog");
        mv.setViewName("admin/edit_sys_log");
        return mv;
    }

    /**
    * 保存
    * @return
    */
    @ResponseBody
    @RequiresPermissions("SYS:LOG:SAVE")
    @PostMapping("save_sysLog")
    public R saveSysLog(SysLog sysLog){
        logger.info("------request-address----------------：/admin/save_sysLog");
        Map<String,Object> map = new HashMap<String,Object>();
        if(MyTools.isEmpty(sysLog.getId())){
            sysLog.setId(UUIDUtils.getUUID());
            if(sysLogService.insert(sysLog) > 0){
                R.ok("添加成功");
            }else{
                R.error(996,"添加失败");
            }
        }else{
            if(sysLogService.updateByPrimaryKeySelective(sysLog) > 0){
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
    @RequiresPermissions("SYS:LOG:DELETE")
    @ResponseBody
    @PostMapping("delete_sysLog")
    public R deleteSysLog(SysLog sysLog) {
        logger.info("------request-address-----------------：/admin/delete_sysLog");
        Map<String,Object> map = new HashMap<String,Object>();
        int delete = sysLogService.deleteByPrimaryKey(sysLog.getId());
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
    @RequiresPermissions("SYS:LOG:MENU")
    @GetMapping("select_sysLog")
    public ModelAndView selectSysLog(ModelAndView mv, String id){
        logger.info("------request-address----------------：/admin/select_sysLog");
        SysLog sysLog = sysLogService.selectByPrimaryKey(id);
        mv.setViewName("admin/select_sysLog");
        mv.addObject("sys_log",sysLog);
        return mv;
    }
}
