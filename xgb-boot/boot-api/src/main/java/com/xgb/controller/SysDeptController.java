package com.xgb.controller;

import com.xgb.common.SessionUtil;
import com.xgb.entity.R;
import com.xgb.model.*;
import com.xgb.service.SysDeptService;
import com.xgb.service.SysRoleService;
import com.xgb.service.SysUserRoleService;
import com.xgb.util.IntegerUtils;
import com.xgb.util.MyTools;
import com.xgb.util.UUIDUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

/**
 *
 * Created by Mr Xgb on 2019/07/28.
 */
@RestController
@RequestMapping("/admin/")
public class SysDeptController {

    protected static final Logger logger = LoggerFactory.getLogger(SysDeptController.class);

    @Autowired
    private SysDeptService sysDeptService;
    @Autowired
    private SysRoleService sysRoleService;
    @Autowired
    private SysUserRoleService sysUserRoleService;

    @RequiresPermissions("SYS:DEPT:MENU")
    @GetMapping("getAllDept")
    public List<SysDept> getAllDept(){
        logger.info("------request-address----------------：/admin/getAllDept");
        List<SysDept> sysDepts = sysDeptService.selectByExample(new SysDeptExample());
        return sysDepts;
    }

    /**
     * 列表分页查询
     * @return
     */
    @RequiresPermissions("SYS:DEPT:MENU")
    @GetMapping("getSysDeptForPage")
    public R getSysDeptForPage(@RequestParam Map mapParam) {
        logger.info("------request-address----------------：/admin/getSysDeptForPage");
        int begin = Integer.valueOf(mapParam.get("begin").toString());
        int end = Integer.valueOf(mapParam.get("end").toString());
        begin = IntegerUtils.getBegin(begin,end);//根据第几页查询数据
        //查询代码
        SysDeptExample sysDeptExample = new SysDeptExample();
        SysDeptExample.Criteria criteria = sysDeptExample.createCriteria();
        sysDeptExample.setOrderByClause("CREATE_TIME DESC LIMIT "+begin+", "+end);
        List<Map<String,Object>> lists = new ArrayList<Map<String,Object>>();
        List<SysDept> sysDepts = sysDeptService.selectByExample(sysDeptExample);
        sysDepts.forEach(item->{
            Map<String,Object> map = new HashMap<String,Object>();
            map.put("id",item.getId());
            map.put("deptName",item.getDeptName());
            map.put("deptCount",sysDeptService.getDeptCountById(item.getId()));
            map.put("remark",item.getRemark());
            map.put("createTime",item.getCreateTime());
            lists.add(map);
        });
        int deptCount = sysDeptService.getDeptCount();
        //默认返回查询结果
        if(sysDepts.size()>0){
            Map<String,Object> parentMap = new HashMap<String,Object>();
            parentMap.put("databases",lists);
            parentMap.put("count",deptCount);
            return R.ok(parentMap,"成功");
        }
        return R.error(999,"查询失败");
    }

    /**
     * 保存部门/更新部门
     * @param sysDept
     * @return
     */
    @RequiresPermissions("SYS:DEPT:SAVE")
    @PostMapping("saveSysDept")
    public R saveSysDept(SysDept sysDept){
        logger.info("------request-address----------------：/admin/saveSysDept");
        String sysUserId = SessionUtil.getSysUserId();
        sysDept.setUpdateId(sysUserId);
        sysDept.setUpdateTime(new Date());
        if (MyTools.isEmpty(sysDept)) {
            //添加流程
            sysDept.setId(UUIDUtils.getUUID());
            sysDept.setCreateTime(new Date());
            sysDept.setCreateId(sysUserId);
            if (sysDeptService.insert(sysDept)>0) {
                return R.ok("添加成功");
            }else {
                return R.error(999,"添加失败");
            }
        }else {
            if (sysDeptService.update(sysDept)>0) {
                return R.ok("更新成功");
            }else {
                return R.error(999,"更新失败");
            }
        }
    }

    /**
     * 根据id删除部门
     * @param id
     * @return
     */
    @RequiresPermissions("SYS:DEPT:DELETE")
    @PostMapping("delSysDept")
    public R delSysDept(String id){
        //查询部门
        SysDept sysDept = sysDeptService.selectByPrimaryKey(id);
        //查询部门下的角色
        SysRoleExample example = new SysRoleExample();
        example.createCriteria().andDeptIdEqualTo(id);
        List<SysRole> sysRoles = sysRoleService.selectByExample(example);
        //查询角色是否管理用户
        List<SysUserRole> sysUserRoles = null;
        sysRoles.forEach(item->{
            List<SysUserRole> sysUserRoles1 = sysUserRoleService.selectUserRoleByRoleId(item.getId());
            sysUserRoles1.forEach(roles->{
                sysUserRoles.add(roles);
            });
        });
        //删除方法
        if (sysDeptService.delete(sysDept,sysRoles,sysUserRoles)>0) {
            return R.ok("删除成功");
        }else {
            return R.error(999,"删除失败");
        }

    }
}
