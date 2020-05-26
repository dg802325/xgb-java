package com.xgb.model;

import java.util.Date;

public class SysMenu {
    private String id;

    private String parentId;

    private String menuName;

    private String menuUrl;

    private String menuCode;

    private String permissionId;

    private String menuType;

    private String menuIcon;

    private Integer sort;

    private Date createTime;

    private Date updateTime;

    private String createId;

    private String updateId;

    private String status;

    public SysMenu(String id, String parentId, String menuName, String menuUrl, String menuCode, String permissionId, String menuType, String menuIcon, Integer sort, Date createTime, Date updateTime, String createId, String updateId, String status) {
        this.id = id;
        this.parentId = parentId;
        this.menuName = menuName;
        this.menuUrl = menuUrl;
        this.menuCode = menuCode;
        this.permissionId = permissionId;
        this.menuType = menuType;
        this.menuIcon = menuIcon;
        this.sort = sort;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.createId = createId;
        this.updateId = updateId;
        this.status = status;
    }

    public SysMenu() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId == null ? null : parentId.trim();
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName == null ? null : menuName.trim();
    }

    public String getMenuUrl() {
        return menuUrl;
    }

    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl == null ? null : menuUrl.trim();
    }

    public String getMenuCode() {
        return menuCode;
    }

    public void setMenuCode(String menuCode) {
        this.menuCode = menuCode == null ? null : menuCode.trim();
    }

    public String getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(String permissionId) {
        this.permissionId = permissionId == null ? null : permissionId.trim();
    }

    public String getMenuType() {
        return menuType;
    }

    public void setMenuType(String menuType) {
        this.menuType = menuType == null ? null : menuType.trim();
    }

    public String getMenuIcon() {
        return menuIcon;
    }

    public void setMenuIcon(String menuIcon) {
        this.menuIcon = menuIcon == null ? null : menuIcon.trim();
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getCreateId() {
        return createId;
    }

    public void setCreateId(String createId) {
        this.createId = createId == null ? null : createId.trim();
    }

    public String getUpdateId() {
        return updateId;
    }

    public void setUpdateId(String updateId) {
        this.updateId = updateId == null ? null : updateId.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}