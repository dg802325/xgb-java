package com.xgb.model;

import java.util.Date;

public class SysPermission {
    private String id;

    private String permissionName;

    private String parentId;

    private String permissionCode;

    private String status;

    private String remark;

    private Date createTime;

    private String createId;

    private Date updateTime;

    private String updateId;

    private String permissionType;

    public SysPermission(String id, String permissionName, String parentId, String permissionCode, String status, String remark, Date createTime, String createId, Date updateTime, String updateId, String permissionType) {
        this.id = id;
        this.permissionName = permissionName;
        this.parentId = parentId;
        this.permissionCode = permissionCode;
        this.status = status;
        this.remark = remark;
        this.createTime = createTime;
        this.createId = createId;
        this.updateTime = updateTime;
        this.updateId = updateId;
        this.permissionType = permissionType;
    }

    public SysPermission() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getPermissionName() {
        return permissionName;
    }

    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName == null ? null : permissionName.trim();
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId == null ? null : parentId.trim();
    }

    public String getPermissionCode() {
        return permissionCode;
    }

    public void setPermissionCode(String permissionCode) {
        this.permissionCode = permissionCode == null ? null : permissionCode.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateId() {
        return createId;
    }

    public void setCreateId(String createId) {
        this.createId = createId == null ? null : createId.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdateId() {
        return updateId;
    }

    public void setUpdateId(String updateId) {
        this.updateId = updateId == null ? null : updateId.trim();
    }

    public String getPermissionType() {
        return permissionType;
    }

    public void setPermissionType(String permissionType) {
        this.permissionType = permissionType == null ? null : permissionType.trim();
    }
}