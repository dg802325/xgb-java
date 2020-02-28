package com.xgb.service;

import com.xgb.dao1.SysDeptMapper;
import com.xgb.dao1.SysRoleMapper;
import com.xgb.dao1.SysUserRoleMapper;
import com.xgb.model.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 *
 * Created by Mr Xgb on 2019/07/28.
 */
@Service
public class SysDeptService {

	@Autowired
    private SysDeptMapper sysDeptMapper;
	@Autowired
    private SysRoleMapper sysRoleMapper;
	@Autowired
    private SysUserRoleMapper sysUserRoleMapper;
    
    public List<SysDept> selectByExample(SysDeptExample example){
        return sysDeptMapper.selectByExample(example);
    }

    public SysDept selectByPrimaryKey(String id){
                return sysDeptMapper.selectByPrimaryKey(id);
            }


    public int getDeptCount() {
        return sysDeptMapper.countByExample(new SysDeptExample());
    }

    public int getDeptCountById(String id){
        SysRoleExample example = new SysRoleExample();
        example.createCriteria().andDeptIdEqualTo(id);
        return sysRoleMapper.countByExample(example);
    }

    @Transactional
    public int insert(SysDept sysDept) {
        return sysDeptMapper.insertSelective(sysDept);
    }

    @Transactional
    public int update(SysDept sysDept){
        return sysDeptMapper.updateByPrimaryKeySelective(sysDept);
    }

    @Transactional
    public int delete(SysDept sysDept, List<SysRole> sysRoles, List<SysUserRole> sysUserRoles) {
        if(sysUserRoles.size()>0){
            sysUserRoles.forEach(item->{
                sysUserRoleMapper.deleteByPrimaryKey(item.getId());
            });
        }
        if(sysRoles.size()>0){
            sysRoles.forEach(item->{
                sysRoleMapper.deleteByPrimaryKey(item.getId());
            });
        }
        return sysDeptMapper.deleteByPrimaryKey(sysDept.getId());
    }
}
