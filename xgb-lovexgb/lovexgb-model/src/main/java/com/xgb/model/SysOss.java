package com.xgb.model;

import java.util.Date;

public class SysOss {
    private String id;

    private String oosUrl;

    private Date createTime;

    private Date updateTime;

    private String createId;

    private String updateId;

    private String status;

    private String oosName;

    private String oosSuffix;

    private String oosType;

    public SysOss(String id, String oosUrl, Date createTime, Date updateTime, String createId, String updateId, String status, String oosName, String oosSuffix, String oosType) {
        this.id = id;
        this.oosUrl = oosUrl;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.createId = createId;
        this.updateId = updateId;
        this.status = status;
        this.oosName = oosName;
        this.oosSuffix = oosSuffix;
        this.oosType = oosType;
    }

    public SysOss() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getOosUrl() {
        return oosUrl;
    }

    public void setOosUrl(String oosUrl) {
        this.oosUrl = oosUrl == null ? null : oosUrl.trim();
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

    public String getOosName() {
        return oosName;
    }

    public void setOosName(String oosName) {
        this.oosName = oosName == null ? null : oosName.trim();
    }

    public String getOosSuffix() {
        return oosSuffix;
    }

    public void setOosSuffix(String oosSuffix) {
        this.oosSuffix = oosSuffix == null ? null : oosSuffix.trim();
    }

    public String getOosType() {
        return oosType;
    }

    public void setOosType(String oosType) {
        this.oosType = oosType == null ? null : oosType.trim();
    }
}