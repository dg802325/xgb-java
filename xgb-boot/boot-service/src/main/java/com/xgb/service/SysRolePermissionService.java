package com.xgb.service;

import com.xgb.dao.SysRolePermissionMapper;
import com.xgb.model.SysRolePermission;
import com.xgb.model.SysRolePermissionExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 * Created by Mr Xgb on 2019/07/28.
 */
@Service
public class SysRolePermissionService {

	@Autowired
    private SysRolePermissionMapper sysRolePermissionMapper;
    
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

}
