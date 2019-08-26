package com.xgb.controller;

import com.xgb.lang.IntegerUtils;
import com.xgb.lang.R;
import com.xgb.model.SysDept;
import com.xgb.model.SysDeptExample;
import com.xgb.model.SysRole;
import com.xgb.model.SysRoleExample;
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
@RestController
@RequestMapping("/admin/")
public class SysRoleController {

    protected static final Logger logger = LoggerFactory.getLogger(SysRoleController.class);

    @Autowired
    private SysRoleService sysRoleService;


    @GetMapping("getAllRole")
    public List<SysRole> getAllRole(String deptId){
        logger.info("------request-address----------------：/admin/getAllRole");
        List<SysRole> sysRoles = null;
        if(MyUtils.isEmpty(deptId)){
            sysRoles = sysRoleService.selectByExample(new SysRoleExample());
        }else {
            SysRoleExample sysRoleExample = new SysRoleExample();
            sysRoleExample.createCriteria().andDeptIdEqualTo(deptId);
            sysRoles = sysRoleService.selectByExample(sysRoleExample);
        }
        return sysRoles;
    }

    /**
     * 列表分页查询
     * @return
     */
    @GetMapping("getSysRoleForPage")
    public List<Map<String, Object>> getSysRoleForPage(@RequestParam Map mapParam) {
        logger.info("------request-address----------------：/admin/getSysRoleForPage");
        Map<String,Object> map = new HashMap<String,Object>();
        int begin = Integer.valueOf(mapParam.get("begin").toString());
        int end = Integer.valueOf(mapParam.get("end").toString());
        begin = IntegerUtils.getBegin(begin,end);//根据第几页查询数据
        //查询代码
        List<Map<String, Object>> maps = sysRoleService.selectAllRoleList();
        //默认返回查询结果
        return maps;
    }
}
