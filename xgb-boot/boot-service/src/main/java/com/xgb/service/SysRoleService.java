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
    
    public List<SysRole> selectAllRole() {
       return sysRoleMapper.selectByExample(new SysRoleExample());
    }
}
