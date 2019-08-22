package com.xgb.service;

import com.xgb.dao.SysMenuMapper;
import com.xgb.dao.SysMenuSqlMapper;
import com.xgb.dao.SysRoleMapper;
import com.xgb.dao.SysRoleSqlMapper;
import com.xgb.model.SysMenu;
import com.xgb.model.SysMenuExample;
import com.xgb.model.SysRole;
import com.xgb.model.vo.SysMenuVO;
import com.xgb.model.vo.SysPermissionVO;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 * Created by Mr Xgb on 2019/07/28.
 */
@Service
public class SysMenuService {

	@Autowired
    private SysMenuMapper sysMenuMapper;
	@Autowired
    private SysMenuSqlMapper sysMenuSqlMapper;
	@Autowired
    private SysRoleMapper sysRoleMapper;
	@Autowired
    private SysRoleSqlMapper sysRoleSqlMapper;
    
        public long countByExample(SysMenuExample example){
            return sysMenuMapper.countByExample(example);
        }

        public int deleteByExample(SysMenuExample example){
            return sysMenuMapper.deleteByExample(example);
        }

        public int deleteByPrimaryKey(String id){
            return sysMenuMapper.deleteByPrimaryKey(id);
        }

        public int insert(SysMenu record){
            return sysMenuMapper.insert(record);
        }

        public int insertSelective(SysMenu record){
            return sysMenuMapper.insertSelective(record);
        }

        public List<SysMenu> selectByExample(SysMenuExample example){
            return sysMenuMapper.selectByExample(example);
        }

        public SysMenu selectByPrimaryKey(String id){
            return sysMenuMapper.selectByPrimaryKey(id);
        }

        public int updateByExampleSelective(@Param("record") SysMenu record, @Param("example") SysMenuExample example){
            return sysMenuMapper.updateByExampleSelective(record,example);
        }

        public int updateByExample(@Param("record") SysMenu record, @Param("example") SysMenuExample example){
            return sysMenuMapper.updateByExample(record,example);
        }

        public int updateByPrimaryKeySelective(SysMenu record){
            return sysMenuMapper.updateByPrimaryKeySelective(record);
        }

        public int updateByPrimaryKey(SysMenu record){
            return sysMenuMapper.updateByPrimaryKey(record);
        }

        public List<SysMenuVO> selectAllMenuList(String parentId) {
            //查询主权限
            List<SysMenuVO> zhuMenus = sysMenuSqlMapper.selectByParentId(parentId);
            int size = zhuMenus.size();
            for(int i=0;i<size;i++){
                List<SysMenuVO> ziMenus = sysMenuSqlMapper.selectByParentId(zhuMenus.get(i).getId());
                if(ziMenus.size()>0){
                    zhuMenus.get(i).setChildren(ziMenus);
                    int ziSize = ziMenus.size();
                    for(int y=0;y<ziSize;y++){
                        List<SysMenuVO> fuPermissions = sysMenuSqlMapper.selectByParentId(ziMenus.get(y).getId());
                        if(fuPermissions.size()>0)
                            ziMenus.get(y).setChildren(fuPermissions);
                    }
                }
            }
            return zhuMenus;
        }

    //获得当前登录人拥有的菜单权限
    public List<SysMenuVO> getMenuByUserId(String sysUserId) {
        //获得当前登录人拥有的角色
        SysRole sysRole = sysRoleSqlMapper.selectRoleByUserId(sysUserId);
        List<SysMenuVO> sysMenuVOS = sysMenuSqlMapper.selectMenuByRoleId(sysRole.getId());
        for (SysMenuVO sysMenuVO : sysMenuVOS) {
            List<SysMenuVO> menusTwoList = sysMenuSqlMapper.selectByParentId(sysMenuVO.getId());
            sysMenuVO.setMenuItemTwo(menusTwoList);
            for (SysMenuVO menuTwo : menusTwoList) {
                List<SysMenuVO> menuThreeList = sysMenuSqlMapper.selectByParentId(menuTwo.getId());
                menuTwo.setMenuItemThree(menuThreeList);
            }
        }
        return sysMenuVOS;
    }
}
