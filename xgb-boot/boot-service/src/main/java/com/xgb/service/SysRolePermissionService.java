package com.xgb.service;

import com.xgb.dao.SysPermissionMapper;
import com.xgb.dao.SysRolePermissionMapper;
import com.xgb.model.SysPermission;
import com.xgb.model.SysPermissionExample;
import com.xgb.model.SysRolePermission;
import com.xgb.model.SysRolePermissionExample;
import com.xgb.utils.UUIDUtils;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * Created by Mr Xgb on 2019/07/28.
 */
@Service
public class SysRolePermissionService {

	@Autowired
    private SysRolePermissionMapper sysRolePermissionMapper;
	@Autowired
    private SysPermissionMapper sysPermissionMapper;
    
    public long countByExample(SysRolePermissionExample example){
        return sysRolePermissionMapper.countByExample(example);
    }

    public int deleteByExample(SysRolePermissionExample example){
        return sysRolePermissionMapper.deleteByExample(example);
    }

    public int deleteByPrimaryKey(String id){
        return sysRolePermissionMapper.deleteByPrimaryKey(id);
    }

    public int insert(SysRolePermission record){
        return sysRolePermissionMapper.insert(record);
    }

    public int insertSelective(SysRolePermission record){
        return sysRolePermissionMapper.insertSelective(record);
    }

    public List<SysRolePermission> selectByExample(SysRolePermissionExample example){
        return sysRolePermissionMapper.selectByExample(example);
    }

    public SysRolePermission selectByPrimaryKey(String id){
        return sysRolePermissionMapper.selectByPrimaryKey(id);
    }

    public int updateByExampleSelective(@Param("record") SysRolePermission record, @Param("example") SysRolePermissionExample example){
        return sysRolePermissionMapper.updateByExampleSelective(record,example);
    }

    public int updateByExample(@Param("record") SysRolePermission record, @Param("example") SysRolePermissionExample example){
        return sysRolePermissionMapper.updateByExample(record,example);
    }

    public int updateByPrimaryKeySelective(SysRolePermission record){
        return sysRolePermissionMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(SysRolePermission record){
        return sysRolePermissionMapper.updateByPrimaryKey(record);
    }

    public List<SysPermission> getPermissionByParentId(String parentId){
        List<SysPermission> lists = new ArrayList<>();
        SysPermission sysPermission = sysPermissionMapper.selectByPrimaryKey(parentId);
        if("0".equals(sysPermission.getPermissionType())){
            //查询一级权限下所有权限
            SysPermissionExample twoPermissionExample = new SysPermissionExample();
            twoPermissionExample.createCriteria().andParentIdEqualTo(sysPermission.getId()).andPermissionTypeEqualTo("1");
            List<SysPermission> twoSysPermissions = sysPermissionMapper.selectByExample(twoPermissionExample);
            if(twoSysPermissions.size()>0){
                twoSysPermissions.forEach(oneItem->{
                    SysPermissionExample threePermissionExample = new SysPermissionExample();
                    threePermissionExample.createCriteria().andParentIdEqualTo(oneItem.getId()).andPermissionTypeEqualTo("2");
                    List<SysPermission> threeSysPermissions = sysPermissionMapper.selectByExample(threePermissionExample);
                    if(threeSysPermissions.size()>0){
                        threeSysPermissions.forEach(twoItem->{
                            SysPermissionExample fourPermissionExample = new SysPermissionExample();
                            fourPermissionExample.createCriteria().andParentIdEqualTo(twoItem.getId()).andPermissionTypeEqualTo("3");
                            List<SysPermission> fourSysPermissions = sysPermissionMapper.selectByExample(fourPermissionExample);
                            if(fourSysPermissions.size()>0){
                                fourSysPermissions.forEach(fourItem->{
                                    lists.add(fourItem);
                                });
                            }
                            lists.add(twoItem);
                        });
                    }
                    lists.add(oneItem);
                });
            }
            lists.add(sysPermission);
        }else if("1".equals(sysPermission.getPermissionType())){
            //查询一级权限下所有权限
            SysPermissionExample twoPermissionExample = new SysPermissionExample();
            twoPermissionExample.createCriteria().andParentIdEqualTo(sysPermission.getId()).andPermissionTypeEqualTo("2");
            List<SysPermission> twoSysPermissions = sysPermissionMapper.selectByExample(twoPermissionExample);
            if(twoSysPermissions.size()>0){
                twoSysPermissions.forEach(oneItem->{
                    SysPermissionExample threePermissionExample = new SysPermissionExample();
                    threePermissionExample.createCriteria().andParentIdEqualTo(oneItem.getId()).andPermissionTypeEqualTo("3");
                    List<SysPermission> threeSysPermissions = sysPermissionMapper.selectByExample(threePermissionExample);
                    if(threeSysPermissions.size()>0){
                        threeSysPermissions.forEach(twoItem->{
                            lists.add(twoItem);
                        });
                    }
                    lists.add(oneItem);
                });
            }
            lists.add(sysPermission);
        }else if("2".equals(sysPermission.getPermissionType())){
            //查询一级权限下所有权限
            SysPermissionExample twoPermissionExample = new SysPermissionExample();
            twoPermissionExample.createCriteria().andParentIdEqualTo(sysPermission.getId()).andPermissionTypeEqualTo("3");
            List<SysPermission> twoSysPermissions = sysPermissionMapper.selectByExample(twoPermissionExample);
            if(twoSysPermissions.size()>0){
                twoSysPermissions.forEach(oneItem->{
                    lists.add(oneItem);
                });
            }
            lists.add(sysPermission);
        }else if("3".equals(sysPermission.getPermissionType())){
            lists.add(sysPermission);
        }
        return lists;
    }

    @Transactional
    public int deleteByPrimaryKeyList(List<SysRolePermission> lists) {
        lists.forEach(i->{
            sysRolePermissionMapper.deleteByPrimaryKey(i.getId());
        });
        return 1;
    }

    @Transactional
    public int insertList(List<SysPermission> permissionByParentId, String roleId,String sysUserId) {
        permissionByParentId.forEach(i->{
            SysRolePermission sysRolePermission = new SysRolePermission();
            sysRolePermission.setId(UUIDUtils.getUUID());
            sysRolePermission.setCreateId(sysUserId);
            sysRolePermission.setCreateTime(new Date());
            sysRolePermission.setPermissionType(i.getPermissionType());
            sysRolePermission.setPermissionId(i.getId());
            sysRolePermission.setRoleId(roleId);
            sysRolePermission.setStatus("0");
            sysRolePermission.setUpdateId(sysUserId);
            sysRolePermission.setUpdateTime(new Date());
            sysRolePermissionMapper.insert(sysRolePermission);
        });
        return 1;
    }
}
