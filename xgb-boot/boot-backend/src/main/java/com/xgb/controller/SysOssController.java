package com.xgb.controller;

import com.xgb.lang.R;
import com.xgb.model.SysOss;
import com.xgb.service.SysOssService;
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
public class SysOssController {

    protected static final Logger logger = LoggerFactory.getLogger(SysOssController.class);

    @Autowired
    private SysOssService sysOssService;


    /**
    * 查看列表显示
    * @return
    */
    @RequiresPermissions("SYS:OSS:MENU")
    @GetMapping("/view_sysOss")
	public ModelAndView viewSysOss(ModelAndView mv){
        logger.info("------request-address----------------：/admin/view_sysOss");
        mv.setViewName("admin/view_sys_oss");
        return mv;
    }


    /**
    * 列表分页查询
    * @return
    */
    @RequiresPermissions("SYS:OSS:MENU")
    @ResponseBody
    @GetMapping(value = "getSysOssForPage")
    public R getSysOssForPage(@RequestParam Map mapParam) {
        logger.info("------request-address----------------：/admin/getSysOssForPage");
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
    @RequiresPermissions("SYS:OSS:INSERT")
    @GetMapping("insert_sysOss")
    public ModelAndView insertSysOss(ModelAndView mv){
        logger.info("------request-address----------------：/admin/insert_sysOss");
        mv.setViewName("admin/insert_sys_oss");
        return mv;
    }

    /**
    * 编辑页面跳转
    * @return
    */
    @RequiresPermissions("SYS:OSS:EDIT")
    @GetMapping("edit_sysOss")
    public ModelAndView editSysOss(ModelAndView mv){
        logger.info("------request-address----------------：/admin/edit_sysOss");
        mv.setViewName("admin/edit_sys_oss");
        return mv;
    }

    /**
    * 保存
    * @return
    */
    @ResponseBody
    @RequiresPermissions("SYS:OSS:SAVE")
    @PostMapping("save_sysOss")
    public R saveSysOss(SysOss sysOss){
        logger.info("------request-address----------------：/admin/save_sysOss");
        Map<String,Object> map = new HashMap<String,Object>();
        if(MyUtils.isEmpty(sysOss.getId())){
            sysOss.setId(UUIDUtils.getUUID());
            if(sysOssService.insert(sysOss) > 0){
                R.ok("添加成功");
            }else{
                R.error(996,"添加失败");
            }
        }else{
            if(sysOssService.updateByPrimaryKeySelective(sysOss) > 0){
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
    @RequiresPermissions("SYS:OSS:DELETE")
    @ResponseBody
    @PostMapping("delete_sysOss")
    public R deleteSysOss(SysOss sysOss) {
        logger.info("------request-address-----------------：/admin/delete_sysOss");
        Map<String,Object> map = new HashMap<String,Object>();
        int delete = sysOssService.deleteByPrimaryKey(sysOss.getId());
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
    @RequiresPermissions("SYS:OSS:MENU")
    @GetMapping("select_sysOss")
    public ModelAndView selectSysOss(ModelAndView mv, String id){
        logger.info("------request-address----------------：/admin/select_sysOss");
        SysOss sysOss = sysOssService.selectByPrimaryKey(id);
        mv.setViewName("admin/select_sysOss");
        mv.addObject("sys_oss",sysOss);
        return mv;
    }
}
