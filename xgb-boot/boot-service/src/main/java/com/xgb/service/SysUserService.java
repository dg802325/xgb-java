package com.xgb.service;

import com.xgb.dao.SysUserMapper;
import com.xgb.dao.SysUserSqlMapper;
import com.xgb.model.SysUser;
import com.xgb.model.SysUserExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 *
 * Created by Mr Xgb on 2019/07/28.
 */
@Service
public class SysUserService {

	@Autowired
    private SysUserMapper sysUserMapper;
	@Autowired
    private SysUserSqlMapper sysUserSqlMapper;

	public SysUser selectUserByPassword(String userName, String password){
	    SysUserExample example = new SysUserExample();
	    example.createCriteria().andUserNameEqualTo(userName).andPasswordEqualTo(password);
        List<SysUser> sysUsers = sysUserMapper.selectByExample(example);
        if(sysUsers.size()>0){
            return sysUsers.get(0);
        }
        return null;
    }
    
    public int deleteByExample(SysUserExample example){
        return sysUserMapper.deleteByExample(example);
    }

    public int deleteByPrimaryKey(String id){
        return sysUserMapper.deleteByPrimaryKey(id);
    }

    public int insert(SysUser record){
        return sysUserMapper.insert(record);
    }

    public int insertSelective(SysUser record){
        return sysUserMapper.insertSelective(record);
    }

    public List<SysUser> selectByExample(SysUserExample example){
        return sysUserMapper.selectByExample(example);
    }

    public SysUser selectByPrimaryKey(String id){
        return sysUserMapper.selectByPrimaryKey(id);
    }

    public int updateByExampleSelective(@Param("record") SysUser record, @Param("example") SysUserExample example){
        return sysUserMapper.updateByExampleSelective(record,example);
    }

    public int updateByExample(@Param("record") SysUser record, @Param("example") SysUserExample example){
        return sysUserMapper.updateByExample(record,example);
    }

    public int update(SysUser sysUser){
	    return sysUserMapper.updateByPrimaryKeySelective(sysUser);
    }

    public int updateByPrimaryKeySelective(SysUser record){
        return sysUserMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(SysUser record){
        return sysUserMapper.updateByPrimaryKey(record);
            }

    @Cacheable(cacheNames = "permissions", key = "#map.get('userId')")
    public List<String> getPermissionListByUserName(Map map) {
        List permissionListByUserName = sysUserSqlMapper.getPermissionListByUserName(map);
        return permissionListByUserName;
    }

    public int getUserCount(){
	    return sysUserMapper.countByExample(new SysUserExample());
    }
}
