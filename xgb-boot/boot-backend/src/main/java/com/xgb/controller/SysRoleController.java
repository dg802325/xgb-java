package com.xgb.controller;

import com.xgb.lang.R;
import com.xgb.model.SysRole;
import com.xgb.service.SysRoleService;
import com.xgb.service.SysUserService;
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
@Controller
@RequestMapping("/admin/")
public class SysRoleController {

    protected static final Logger logger = LoggerFactory.getLogger(SysRoleController.class);

    @Autowired
    private SysRoleService sysRoleService;


    /**
    * 列表分页查询
    * @return
    */
    @ResponseBody
    @GetMapping(value = "getSysRoleForPage")
    public R getSysRoleForPage(@RequestParam Map mapParam) {
        logger.info("------request-address----------------：/admin/getSysRoleForPage");
        Map<String,Object> map = new HashMap<String,Object>();
        int begin = Integer.valueOf(mapParam.get("begin").toString());
        int end = 10;
        //查询代码
        List<Map<String, Object>> maps = sysRoleService.selectRoleMapByDeptId(null,begin,end);
        Integer roleMapByDeptId = sysRoleService.getRoleMapByDeptId(null);
        sysRoleService
        if(maps.size()>0){
            map.put("roles",maps);
            map.put("count",roleMapByDeptId);
            return R.ok(map,"查询成功");
        }
        //默认返回查询结果
        return R.error(996,"未找到内容");
    }

}
