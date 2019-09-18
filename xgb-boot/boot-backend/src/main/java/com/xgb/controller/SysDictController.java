package com.xgb.controller;

import com.xgb.lang.R;
import com.xgb.model.SysDict;
import com.xgb.service.SysDictService;
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
@RestController
@RequestMapping("/admin/")
public class SysDictController {

    protected static final Logger logger = LoggerFactory.getLogger(SysDictController.class);

    @Autowired
    private SysDictService sysDictService;


    /**
    * 列表分页查询
    * @return
    */
    @RequiresPermissions("SYS:DICT:MENU")
    @GetMapping(value = "getSysDictForPage")
    public R getSysDictForPage(@RequestParam Map mapParam) {
        logger.info("------request-address----------------：/admin/getSysDictForPage");
        Map<String,Object> map = new HashMap<String,Object>();
        int begin = Integer.valueOf(mapParam.get("begin").toString());
        int end = Integer.valueOf(mapParam.get("end").toString());
        //查询代码

        //默认返回查询结果
        return R.error(996,"未找到内容");
    }

    /**
    * 保存
    * @return
    */
    @RequiresPermissions("SYS:DICT:SAVE")
    @PostMapping("save_sysDict")
    public R saveSysDict(SysDict sysDict){
        logger.info("------request-address----------------：/admin/save_sysDict");
        Map<String,Object> map = new HashMap<String,Object>();
        if(MyUtils.isEmpty(sysDict.getId())){
            sysDict.setId(UUIDUtils.getUUID());
            if(sysDictService.insert(sysDict) > 0){
                R.ok("添加成功");
            }else{
                R.error(996,"添加失败");
            }
        }else{
            if(sysDictService.updateByPrimaryKeySelective(sysDict) > 0){
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
    @RequiresPermissions("SYS:DICT:DELETE")
    @PostMapping("delete_sysDict")
    public R deleteSysDict(SysDict sysDict) {
        logger.info("------request-address-----------------：/admin/delete_sysDict");
        Map<String,Object> map = new HashMap<String,Object>();
        int delete = sysDictService.deleteByPrimaryKey(sysDict.getId());
        if(delete>0){
            return R.ok("删除成功");
        }else{
            return R.error(996,"删除失败");
        }
    }

}
