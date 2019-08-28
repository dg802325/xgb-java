package com.xgb.service;

import com.xgb.dao.SysPermissionMapper;
import com.xgb.model.SysPermission;
import com.xgb.model.SysPermissionExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * Created by Mr Xgb on 2019/07/28.
 */
@Service
public class SysPermissionService {

	@Autowired
    private SysPermissionMapper sysPermissionMapper;

    public long countByExample(SysPermissionExample example){
        return sysPermissionMapper.countByExample(example);
    }

    public int deleteByExample(SysPermissionExample example){
        return sysPermissionMapper.deleteByExample(example);
    }

    public int deleteByPrimaryKey(String id){
        return sysPermissionMapper.deleteByPrimaryKey(id);
    }

    public int insert(SysPermission record){
        return sysPermissionMapper.insert(record);
    }

    public int insertSelective(SysPermission record){
        return sysPermissionMapper.insertSelective(record);
    }

    public List<SysPermission> selectByParentId(String parentId){
        SysPermissionExample example = new SysPermissionExample();
        example.createCriteria().andParentIdEqualTo(parentId);
        return sysPermissionMapper.selectByExample(example);
    }

    public SysPermission selectByPrimaryKey(String id){
        return sysPermissionMapper.selectByPrimaryKey(id);
    }

    public int updateByExampleSelective(@Param("record") SysPermission record, @Param("example") SysPermissionExample example){
        return sysPermissionMapper.updateByExampleSelective(record,example);
    }

    public int updateByExample(@Param("record") SysPermission record, @Param("example") SysPermissionExample example){
        return sysPermissionMapper.updateByExample(record,example);
    }

    public int updateByPrimaryKeySelective(SysPermission record){
        return sysPermissionMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(SysPermission record){
        return sysPermissionMapper.updateByPrimaryKey(record);
    }

    //查询权限列表
    public List<Map<String,Object>> selectAllPermissionList(String parentId) {
        List<Map<String,Object>> lists = new ArrayList<Map<String,Object>>();
        SysPermissionExample oneSysPermissionExample = new SysPermissionExample();
        oneSysPermissionExample.createCriteria().andParentIdEqualTo(parentId);
        List<SysPermission> oneSysPermissions = sysPermissionMapper.selectByExample(oneSysPermissionExample);
        oneSysPermissions.forEach(oneSysPermission -> {
            //创建二级菜单集合
            List<Map<String,Object>> twoPermissionList = new ArrayList<Map<String,Object>>();
            Map<String,Object> oneParentMap = new HashMap<String,Object>();
            oneParentMap.put("id",oneSysPermission.getId());
            oneParentMap.put("permissionName",oneSysPermission.getPermissionName());
            oneParentMap.put("remark",oneSysPermission.getRemark());
            oneParentMap.put("permissionType",oneSysPermission.getPermissionType());
            SysPermissionExample twoSysPermissionExample = new SysPermissionExample();
            twoSysPermissionExample.createCriteria().andParentIdEqualTo(oneSysPermission.getId());
            List<SysPermission> twoSysPermissions = sysPermissionMapper.selectByExample(twoSysPermissionExample);
            twoSysPermissions.forEach(twoSysPermission->{
                //创建三级菜单集合
                List<Map<String,Object>> threePermissionList = new ArrayList<Map<String,Object>>();
                Map<String,Object> twoParentMap = new HashMap<String,Object>();
                twoParentMap.put("id",twoSysPermission.getId());
                twoParentMap.put("permissionName",twoSysPermission.getPermissionName());
                twoParentMap.put("remark",twoSysPermission.getRemark());
                twoParentMap.put("permissionType",twoSysPermission.getPermissionType());
                SysPermissionExample threeSysPermissionExample = new SysPermissionExample();
                threeSysPermissionExample.createCriteria().andParentIdEqualTo(twoSysPermission.getId());
                List<SysPermission> threeSysPermissions = sysPermissionMapper.selectByExample(threeSysPermissionExample);
                threeSysPermissions.forEach(threeSysPermission->{
                    Map<String,Object> threeParentMap = new HashMap<String,Object>();
                    threeParentMap.put("id",threeSysPermission.getId());
                    threeParentMap.put("permissionName",threeSysPermission.getPermissionName());
                    threeParentMap.put("remark",threeSysPermission.getRemark());
                    threeParentMap.put("permissionType",threeSysPermission.getPermissionType());
                    threePermissionList.add(threeParentMap);
                });
                twoParentMap.put("children",threePermissionList);
                twoPermissionList.add(twoParentMap);
            });
            oneParentMap.put("children",twoPermissionList);
            lists.add(oneParentMap);
        });
        return lists;
    }
    //根据父级id查询权限列表
    public List<SysPermission> selectPermissionByParentId(String parentId) {
        SysPermissionExample example = new SysPermissionExample();
        example.createCriteria().andParentIdEqualTo(parentId);
        return sysPermissionMapper.selectByExample(example);
    }

    public List<SysPermission> selectByExample(SysPermissionExample sysPermissionExample){
        return sysPermissionMapper.selectByExample(sysPermissionExample);
    }
}
