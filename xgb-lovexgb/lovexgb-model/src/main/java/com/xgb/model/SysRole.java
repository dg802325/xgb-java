package com.xgb.model;

import java.util.Date;

public class SysRole {
    private String id;

    private String roleName;

    private String remark;

    private Date createTime;

    private Date updateTime;

    private String createId;

    private String updateId;

    private String status;

    private String deptId;

    public SysRole(String id, String roleName, String remark, Date createTime, Date updateTime, String createId, String updateId, String status, String deptId) {
        this.id = id;
        this.roleName = roleName;
        this.remark = remark;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.createId = createId;
        this.updateId = updateId;
        this.status = status;
        this.deptId = deptId;
    }

    public SysRole() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
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

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId == null ? null : deptId.trim();
    }
}