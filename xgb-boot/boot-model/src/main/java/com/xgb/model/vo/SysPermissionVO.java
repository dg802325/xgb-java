package com.xgb.model.vo;

import com.xgb.model.SysPermission;

import java.util.List;

public class SysPermissionVO extends SysPermission {

    private List<SysPermissionVO> children;

    public List<SysPermissionVO> getChildren() {
        return children;
    }

    public void setChildren(List<SysPermissionVO> children) {
        this.children = children;
    }

}
