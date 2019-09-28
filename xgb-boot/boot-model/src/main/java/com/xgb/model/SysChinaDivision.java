package com.xgb.model;

import java.util.Date;

public class SysChinaDivision {
    private String id;

    private String divisionName;

    private String parentId;

    private String divisionCode;

    private String postCode;

    private String status;

    private String creatorId;

    private Date createTime;

    private String modifierId;

    private Date modifyTime;

    private String hlbDivisionCode;

    private String divisionType;

    public SysChinaDivision(String id, String divisionName, String parentId, String divisionCode, String postCode, String status, String creatorId, Date createTime, String modifierId, Date modifyTime, String hlbDivisionCode, String divisionType) {
        this.id = id;
        this.divisionName = divisionName;
        this.parentId = parentId;
        this.divisionCode = divisionCode;
        this.postCode = postCode;
        this.status = status;
        this.creatorId = creatorId;
        this.createTime = createTime;
        this.modifierId = modifierId;
        this.modifyTime = modifyTime;
        this.hlbDivisionCode = hlbDivisionCode;
        this.divisionType = divisionType;
    }

    public SysChinaDivision() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getDivisionName() {
        return divisionName;
    }

    public void setDivisionName(String divisionName) {
        this.divisionName = divisionName == null ? null : divisionName.trim();
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId == null ? null : parentId.trim();
    }

    public String getDivisionCode() {
        return divisionCode;
    }

    public void setDivisionCode(String divisionCode) {
        this.divisionCode = divisionCode == null ? null : divisionCode.trim();
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode == null ? null : postCode.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId == null ? null : creatorId.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getModifierId() {
        return modifierId;
    }

    public void setModifierId(String modifierId) {
        this.modifierId = modifierId == null ? null : modifierId.trim();
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public String getHlbDivisionCode() {
        return hlbDivisionCode;
    }

    public void setHlbDivisionCode(String hlbDivisionCode) {
        this.hlbDivisionCode = hlbDivisionCode == null ? null : hlbDivisionCode.trim();
    }

    public String getDivisionType() {
        return divisionType;
    }

    public void setDivisionType(String divisionType) {
        this.divisionType = divisionType == null ? null : divisionType.trim();
    }
}