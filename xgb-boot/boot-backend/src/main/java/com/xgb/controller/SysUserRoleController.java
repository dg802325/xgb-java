package com.xgb.controller;

import com.xgb.lang.IntegerUtils;
import com.xgb.lang.R;
import com.xgb.model.SysRole;
import com.xgb.model.SysUser;
import com.xgb.model.SysUserExample;
import com.xgb.model.SysUserRole;
import com.xgb.service.SysRoleService;
import com.xgb.service.SysUserRoleService;
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

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * Created by Mr Xgb on 2019/07/28.
 */
@RestController
@RequestMapping("/admin/")
public class SysUserRoleController {

    protected static final Logger logger = LoggerFactory.getLogger(SysUserRoleController.class);

    @Autowired
    private SysUserRoleService sysUserRoleService;
    @Autowired
    private SysUserService sysUserService;
    @Autowired
    private SysRoleService sysRoleService;

    /**
     * 列表分页查询
     * @return
     */
    @GetMapping("getSysUserRoleForPage")
    public R getSysUserRoleForPage(@RequestParam Map mapParam) {
        logger.info("------request-address----------------：/admin/getSysUserRoleForPage");
        Map<String,Object> map = new HashMap<String,Object>();
        int begin = Integer.valueOf(mapParam.get("begin").toString());
        int end = Integer.valueOf(mapParam.get("end").toString());
        begin = IntegerUtils.getBegin(begin,end);//根据第几页查询数据
        //查询代码
        List<Map<String, Object>> maps = sysUserRoleService.selectRoleMapByDeptId(null,begin,end);
        int roleMapByDeptId = sysUserService.getUserCount();
//        sysRoleService
        if(maps.size()>0){
            map.put("roles",maps);
            map.put("count",roleMapByDeptId);
            return R.ok(map,"查询成功");
        }
        //默认返回查询结果
        return R.error(996,"未找到内容");
    }

    @PostMapping("saveSysUserRole")
    public R saveSysUserRole(@RequestParam Map mapParam){
        logger.info("------request-address----------------：/admin/saveSysUserRole");
        String id = mapParam.get("id").toString();
        String roleId = mapParam.get("roleId").toString();
        SysUserRole sysUserRole = sysUserRoleService.selectRoleIdByUserId(id);
        sysUserRole.setRoleId(roleId);
        int update = sysUserRoleService.update(sysUserRole);
        if (update>0) {
            return R.ok("更新成功");
        }else {
            return R.error(999,"更新失败");
        }
    }

    }
