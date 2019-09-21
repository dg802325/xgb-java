package com.xgb.model;

import java.util.Date;

public class BlogClass {
    private String id;

    private String classIfication;

    private String createId;

    private String classType;

    private String updateId;

    private Date createTime;

    private Date updateTime;

    private String status;

    private String isDel;

    public BlogClass(String id, String classIfication, String createId, String classType, String updateId, Date createTime, Date updateTime, String status, String isDel) {
        this.id = id;
        this.classIfication = classIfication;
        this.createId = createId;
        this.classType = classType;
        this.updateId = updateId;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.status = status;
        this.isDel = isDel;
    }

    public BlogClass() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getClassIfication() {
        return classIfication;
    }

    public void setClassIfication(String classIfication) {
        this.classIfication = classIfication == null ? null : classIfication.trim();
    }

    public String getCreateId() {
        return createId;
    }

    public void setCreateId(String createId) {
        this.createId = createId == null ? null : createId.trim();
    }

    public String getClassType() {
        return classType;
    }

    public void setClassType(String classType) {
        this.classType = classType == null ? null : classType.trim();
    }

    public String getUpdateId() {
        return updateId;
    }

    public void setUpdateId(String updateId) {
        this.updateId = updateId == null ? null : updateId.trim();
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getIsDel() {
        return isDel;
    }

    public void setIsDel(String isDel) {
        this.isDel = isDel == null ? null : isDel.trim();
    }
}