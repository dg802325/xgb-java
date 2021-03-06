package com.xgb.controller;

import com.xgb.common.SessionUtil;
import com.xgb.entity.R;
import com.xgb.model.SysRole;
import com.xgb.model.SysRoleExample;
import com.xgb.util.IntegerUtils;
import com.xgb.util.MyTools;
import com.xgb.util.UUIDUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.xgb.service.SysDeptService;
import com.xgb.service.SysRoleService;

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
public class SysRoleController {

    protected static final Logger logger = LoggerFactory.getLogger(SysRoleController.class);

    @Autowired
    private SysRoleService sysRoleService;
    @Autowired
    private SysDeptService sysDeptService;

    @RequiresPermissions("SYS:ROLE:MENU")
    @GetMapping("getAllRole")
    public List<SysRole> getAllRole(String deptId){
        logger.info("------request-address----------------：/admin/getAllRole");
        List<SysRole> sysRoles = null;
        if(MyTools.isEmpty(deptId)){
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
    @RequiresPermissions("SYS:ROLE:MENU")
    @GetMapping("getSysRoleForPage")
    public R getSysRoleForPage(@RequestParam Map mapParam) {
        logger.info("------request-address----------------：/admin/getSysRoleForPage");
        int begin = Integer.valueOf(mapParam.get("begin").toString());
        int end = Integer.valueOf(mapParam.get("end").toString());
        begin = IntegerUtils.getBegin(begin,end);//根据第几页查询数据
        //查询代码
        SysRoleExample sysRoleExample = new SysRoleExample();
        if(MyTools.isEmpty(mapParam.get("deptId"))){
            sysRoleExample.createCriteria();
            sysRoleExample.setOrderByClause("CREATE_TIME DESC LIMIT "+begin+", "+end);
        }else {
            sysRoleExample.createCriteria().andDeptIdEqualTo(mapParam.get("deptId").toString());
            sysRoleExample.setOrderByClause("CREATE_TIME DESC LIMIT "+begin+", "+end);
        }
        List<SysRole> sysRoles = sysRoleService.selectByExample(sysRoleExample);
        List<Map<String, Object>> maps = sysRoleService.selectAllRoleList();
        sysRoles.forEach(item->{
           Map<String,Object> map = new HashMap<String,Object>();
           map.put("id",item.getId());
           map.put("roleName",item.getRoleName());
           map.put("deptId",item.getDeptId());
           map.put("deptName",sysDeptService.selectByPrimaryKey(item.getDeptId()).getDeptName());
           map.put("remark",item.getRemark());
           map.put("createTime",item.getCreateTime());
           maps.add(map);
        });
        int roleCount = sysRoleService.getRoleCount();
        //默认返回查询结果
        if(sysRoles.size()>0){
            Map<String,Object> parentMap = new HashMap<String,Object>();
            parentMap.put("roles",maps);
            parentMap.put("count",roleCount);
            return R.ok(parentMap,"成功");
        }
        return R.error(999,"查询失败");
    }

    @RequiresPermissions("SYS:ROLE:SAVE")
    @PostMapping("saveSysRole")
    public R saveSysRole(SysRole sysRole){
        logger.info("------request-address----------------：/admin/saveSysRole");
        if(MyTools.isEmpty(sysRole.getId())){
            String sysUserId = SessionUtil.getSysUserId();
            sysRole.setId(UUIDUtils.getUUID());
            sysRole.setCreateId(sysUserId);
            sysRole.setCreateTime(new Date());
            sysRole.setUpdateId(sysUserId);
            sysRole.setStatus("0");
            sysRole.setUpdateTime(new Date());
            int insert = sysRoleService.insert(sysRole);
            if(insert>0){
                return R.ok("新增成功");
            }else {
                return R.error(999,"新增失败");
            }
        }else {
            String sysUserId = SessionUtil.getSysUserId();
            sysRole.setUpdateId(sysUserId);
            sysRole.setUpdateTime(new Date());
            int update = sysRoleService.update(sysRole);
            if(update>0){
                return R.ok("编辑成功");
            }else {
                return R.error(999,"编辑失败");
            }
        }
    }

    @RequiresPermissions("SYS:ROLE:DELETE")
    @PostMapping("delSysRole")
    public R delSysRole(SysRole sysRole){
       if(MyTools.isEmpty(sysRole.getId())){
           return R.error(999,"未传入id");
       }
       int i = sysRoleService.deleteByPrimaryKey(sysRole.getId());
       if(i>0){
           return R.ok("删除成功");
       }else {
           return R.error(999,"删除失败");
       }
    }
}
