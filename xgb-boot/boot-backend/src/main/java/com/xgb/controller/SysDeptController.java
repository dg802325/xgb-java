package com.xgb.controller;

import com.xgb.lang.R;
import com.xgb.model.SysDept;
import com.xgb.service.SysDeptService;
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
public class SysDeptController {

    protected static final Logger logger = LoggerFactory.getLogger(SysDeptController.class);

    @Autowired
    private SysDeptService sysDeptService;


    /**
    * 查看列表显示
    * @return
    */
    @RequiresPermissions("SYS:DEPT:MENU")
    @GetMapping("/view_sysDept")
	public ModelAndView viewSysDept(ModelAndView mv){
        logger.info("------request-address----------------：/admin/view_sysDept");
        mv.setViewName("admin/view_sys_dept");
        return mv;
    }


    /**
    * 列表分页查询
    * @return
    */
    @RequiresPermissions("SYS:DEPT:MENU")
    @ResponseBody
    @GetMapping(value = "getSysDeptForPage")
    public R getSysDeptForPage(@RequestParam Map mapParam) {
        logger.info("------request-address----------------：/admin/getSysDeptForPage");
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
    @RequiresPermissions("SYS:DEPT:INSERT")
    @GetMapping("insert_sysDept")
    public ModelAndView insertSysDept(ModelAndView mv){
        logger.info("------request-address----------------：/admin/insert_sysDept");
        mv.setViewName("admin/insert_sys_dept");
        return mv;
    }

    /**
    * 编辑页面跳转
    * @return
    */
    @RequiresPermissions("SYS:DEPT:EDIT")
    @GetMapping("edit_sysDept")
    public ModelAndView editSysDept(ModelAndView mv){
        logger.info("------request-address----------------：/admin/edit_sysDept");
        mv.setViewName("admin/edit_sys_dept");
        return mv;
    }

    /**
    * 保存
    * @return
    */
    @ResponseBody
    @RequiresPermissions("SYS:DEPT:SAVE")
    @PostMapping("save_sysDept")
    public R saveSysDept(SysDept sysDept){
        logger.info("------request-address----------------：/admin/save_sysDept");
        Map<String,Object> map = new HashMap<String,Object>();
        if(MyUtils.isEmpty(sysDept.getId())){
            sysDept.setId(UUIDUtils.getUUID());
            if(sysDeptService.insert(sysDept) > 0){
                R.ok("添加成功");
            }else{
                R.error(996,"添加失败");
            }
        }else{
            if(sysDeptService.updateByPrimaryKeySelective(sysDept) > 0){
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
    @RequiresPermissions("SYS:DEPT:DELETE")
    @ResponseBody
    @PostMapping("delete_sysDept")
    public R deleteSysDept(SysDept sysDept) {
        logger.info("------request-address-----------------：/admin/delete_sysDept");
        Map<String,Object> map = new HashMap<String,Object>();
        int delete = sysDeptService.deleteByPrimaryKey(sysDept.getId());
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
    @RequiresPermissions("SYS:DEPT:MENU")
    @GetMapping("select_sysDept")
    public ModelAndView selectSysDept(ModelAndView mv, String id){
        logger.info("------request-address----------------：/admin/select_sysDept");
        SysDept sysDept = sysDeptService.selectByPrimaryKey(id);
        mv.setViewName("admin/select_sysDept");
        mv.addObject("sys_dept",sysDept);
        return mv;
    }
}
