package com.xgb.service;

import com.xgb.dao.SysRoleMapper;
import com.xgb.model.SysRole;
import com.xgb.model.SysRoleExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 * Created by Mr Xgb on 2019/07/28.
 */
@Service
public class SysRoleService {

	@Autowired
    private SysRoleMapper sysRoleMapper;
    
            public long countByExample(SysRoleExample example){
                return sysRoleMapper.countByExample(example);
            }

            public int deleteByExample(SysRoleExample example){
                return sysRoleMapper.deleteByExample(example);
            }

            public int deleteByPrimaryKey(String id){
                return sysRoleMapper.deleteByPrimaryKey(id);
            }

            public int insert(SysRole record){
                return sysRoleMapper.insert(record);
            }

            public int insertSelective(SysRole record){
                return sysRoleMapper.insertSelective(record);
            }

            public List<SysRole> selectByExample(SysRoleExample example){
                return sysRoleMapper.selectByExample(example);
            }

            public SysRole selectByPrimaryKey(String id){
                return sysRoleMapper.selectByPrimaryKey(id);
            }

            public int updateByExampleSelective(@Param("record") SysRole record, @Param("example") SysRoleExample example){
                return sysRoleMapper.updateByExampleSelective(record,example);
            }

            public int updateByExample(@Param("record") SysRole record, @Param("example") SysRoleExample example){
                return sysRoleMapper.updateByExample(record,example);
            }

            public int updateByPrimaryKeySelective(SysRole record){
                return sysRoleMapper.updateByPrimaryKeySelective(record);
            }

            public int updateByPrimaryKey(SysRole record){
                return sysRoleMapper.updateByPrimaryKey(record);
            }

}
