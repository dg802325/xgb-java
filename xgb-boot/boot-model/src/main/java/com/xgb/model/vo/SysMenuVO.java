package com.xgb.model.vo;

import com.xgb.model.SysMenu;

import java.util.List;

public class SysMenuVO extends SysMenu {

    private List<SysMenuVO> children;

    public List<SysMenuVO> getChildren() {
        return children;
    }

    public void setChildren(List<SysMenuVO> children) {
        this.children = children;
    }
}
