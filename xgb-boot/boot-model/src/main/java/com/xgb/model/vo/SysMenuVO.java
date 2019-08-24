package com.xgb.model.vo;

import com.xgb.model.SysMenu;

import java.util.List;

public class SysMenuVO extends SysMenu {
    private String permissionName;
    private List<SysMenuVO> children;
    private List<SysMenuVO> menuItemTwo;
    private List<SysMenuVO> menuItemThree;

    public String getPermissionName() {
        return permissionName;
    }

    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName;
    }

    public List<SysMenuVO> getChildren() {
        return children;
    }

    public void setChildren(List<SysMenuVO> children) {
        this.children = children;
    }

    public List<SysMenuVO> getMenuItemTwo() {
        return menuItemTwo;
    }

    public void setMenuItemTwo(List<SysMenuVO> menuItemTwo) {
        this.menuItemTwo = menuItemTwo;
    }

    public List<SysMenuVO> getMenuItemThree() {
        return menuItemThree;
    }

    public void setMenuItemThree(List<SysMenuVO> menuItemThree) {
        this.menuItemThree = menuItemThree;
    }
}
