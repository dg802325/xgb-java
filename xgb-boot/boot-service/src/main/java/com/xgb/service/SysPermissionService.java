package com.xgb.service;

import com.xgb.dao.SysPermissionMapper;
import com.xgb.dao.SysPermissionSqlMapper;
import com.xgb.model.SysPermission;
import com.xgb.model.SysPermissionExample;
import com.xgb.model.vo.SysPermissionVO;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.List;

/**
 *
 * Created by Mr Xgb on 2019/07/28.
 */
@Service
public class SysPermissionService {

	@Autowired
    private SysPermissionMapper sysPermissionMapper;
	@Autowired
    private SysPermissionSqlMapper sysPermissionSqlMapper;
    
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
    public List<SysPermissionVO> selectAllPermissionList(String parentId) {
        //查询主权限
        List<SysPermissionVO> zhuPermissions = sysPermissionSqlMapper.selectByParentId(parentId);
        int size = zhuPermissions.size();
        for(int i=0;i<size;i++){
            List<SysPermissionVO> ziPermissions = sysPermissionSqlMapper.selectByParentId(zhuPermissions.get(i).getId());
            if(ziPermissions.size()>0){
                zhuPermissions.get(i).setChildren(ziPermissions);
                int ziSize = ziPermissions.size();
                for(int y=0;y<ziSize;y++){
                    List<SysPermissionVO> fuPermissions = sysPermissionSqlMapper.selectByParentId(ziPermissions.get(y).getId());
                    if(fuPermissions.size()>0)
                        ziPermissions.get(y).setChildren(fuPermissions);
                }
            }
        }
        return zhuPermissions;
    }
    //根据父级id查询权限列表
    public List<SysPermission> selectPermissionByParentId(String parentId) {
        SysPermissionExample example = new SysPermissionExample();
        example.createCriteria().andParentIdEqualTo(parentId);
        return sysPermissionMapper.selectByExample(example);
    }

}
