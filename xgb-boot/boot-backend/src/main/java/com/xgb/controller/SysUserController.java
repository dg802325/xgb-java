package com.xgb.controller;

import com.xgb.common.SessionUtil;
import com.xgb.entity.R;
import com.xgb.model.SysUser;
import com.xgb.service.SysUserService;
import com.xgb.util.MD5Util;
import com.xgb.util.MyTools;
import com.xgb.util.UUIDUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import static java.math.BigDecimal.ROUND_HALF_DOWN;
import static java.math.BigDecimal.ROUND_HALF_UP;

/**
 *
 * Created by Mr Xgb on 2019/07/28.
 */
@Controller
@RequestMapping("/admin/")
public class SysUserController {

    protected static final Logger logger = LoggerFactory.getLogger(SysUserController.class);

    @Autowired
    private SysUserService sysUserService;



    /**
    * 列表分页查询
    * @return
    */
    @RequiresPermissions("SYS:USER:MENU")
    @ResponseBody
    @GetMapping(value = "getSysUserForPage")
    public R getSysUserForPage(@RequestParam Map mapParam) {
        logger.info("------request-address----------------：/admin/getSysUserForPage");
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
    @ResponseBody
    @PostMapping("saveSysUserPassword")
    public R saveSysUserPassword(SysUser sysUser){
        String sysUserId = SessionUtil.getSysUserId();
        SysUser osysUser = sysUserService.selectByPrimaryKey(sysUserId);
        logger.info("------request-address----------------：/admin/saveSysUserPassword");
        if (osysUser.getPassword().equals(MD5Util.toMd5(sysUser.getPassword()))){
            return R.error(996,"新密码不能与旧密码一致");
        }
        sysUser.setPassword(MD5Util.toMd5(sysUser.getPassword()));
        if(sysUserService.update(sysUser) > 0){
            return R.ok("编辑成功");
        }else{
            return R.error(996,"编辑失败");
        }
    }



    /**
    * 保存
    * @return
    */
    @ResponseBody
    @PostMapping("saveSysUser")
    public R saveSysUser(SysUser sysUser){
        logger.info("------request-address----------------：/admin/saveSysUser");
        if(MyTools.isEmpty(sysUser.getId())){
            sysUser.setId(UUIDUtils.getUUID());
            if(sysUserService.insert(sysUser) > 0){
                return R.ok("添加成功");
            }else{
                return R.error(996,"添加失败");
            }
        }else{
            if(sysUserService.update(sysUser) > 0){
               return R.ok("编辑成功");
            }else{
                return R.error(996,"编辑失败");
            }
        }
    }

    /**
    * 删除
    * @return
    */
    @ResponseBody
    @PostMapping("delete_sysUser")
    public R deleteSysUser(SysUser sysUser) {
        logger.info("------request-address-----------------：/admin/delete_sysUser");
        Map<String,Object> map = new HashMap<String,Object>();
        int delete = sysUserService.deleteByPrimaryKey(sysUser.getId());
        if(delete>0){
            return R.ok("删除成功");
        }else{
            return R.error(996,"删除失败");
        }
    }

    /**
     * 根据当前登录人获取会员信息
     * @return
     */
    @ResponseBody
    @GetMapping("getNowUser")
    public R getNowUser() {
        logger.info("------request-address-----------------：/admin/getNowUser");
        String sysUserId = SessionUtil.getSysUserId();
        SysUser sysUser = sysUserService.selectByPrimaryKey(sysUserId);
        return R.ok("sys",sysUser,"查询成功");
    }

}
