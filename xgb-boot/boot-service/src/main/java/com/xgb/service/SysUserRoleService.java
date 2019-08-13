package com.xgb.service;

import com.xgb.dao.SysUserRoleMapper;
import com.xgb.model.SysUserRole;
import com.xgb.model.SysUserRoleExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 * Created by Mr Xgb on 2019/07/28.
 */
@Service
public class SysUserRoleService {

	@Autowired
    private SysUserRoleMapper sysUserRoleMapper;
    
            public long countByExample(SysUserRoleExample example){
                return sysUserRoleMapper.countByExample(example);
            }

            public int deleteByExample(SysUserRoleExample example){
                return sysUserRoleMapper.deleteByExample(example);
            }

            public int deleteByPrimaryKey(String id){
                return sysUserRoleMapper.deleteByPrimaryKey(id);
            }

            public int insert(SysUserRole record){
                return sysUserRoleMapper.insert(record);
            }

            public int insertSelective(SysUserRole record){
                return sysUserRoleMapper.insertSelective(record);
            }

            public List<SysUserRole> selectByExample(SysUserRoleExample example){
                return sysUserRoleMapper.selectByExample(example);
            }

            public SysUserRole selectByPrimaryKey(String id){
                return sysUserRoleMapper.selectByPrimaryKey(id);
            }

            public int updateByExampleSelective(@Param("record") SysUserRole record, @Param("example") SysUserRoleExample example){
                return sysUserRoleMapper.updateByExampleSelective(record,example);
            }

            public int updateByExample(@Param("record") SysUserRole record, @Param("example") SysUserRoleExample example){
                return sysUserRoleMapper.updateByExample(record,example);
            }

            public int updateByPrimaryKeySelective(SysUserRole record){
                return sysUserRoleMapper.updateByPrimaryKeySelective(record);
            }

            public int updateByPrimaryKey(SysUserRole record){
                return sysUserRoleMapper.updateByPrimaryKey(record);
            }

}
