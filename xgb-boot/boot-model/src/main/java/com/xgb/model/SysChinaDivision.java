package com.xgb.model;

import java.util.Date;

public class SysChinaDivision {
    private String id;

    private String divisionName;

    private String parentId;

    private String divisionCode;

    private String regionId;

    private String postCode;

    private Boolean isForbidden;

    private Boolean isDel;

    private String creatorId;

    private Date createTime;

    private String modifierId;

    private Date modifyTime;

    private String hlbDivisionCode;

    public SysChinaDivision(String id, String divisionName, String parentId, String divisionCode, String regionId, String postCode, Boolean isForbidden, Boolean isDel, String creatorId, Date createTime, String modifierId, Date modifyTime, String hlbDivisionCode) {
        this.id = id;
        this.divisionName = divisionName;
        this.parentId = parentId;
        this.divisionCode = divisionCode;
        this.regionId = regionId;
        this.postCode = postCode;
        this.isForbidden = isForbidden;
        this.isDel = isDel;
        this.creatorId = creatorId;
        this.createTime = createTime;
        this.modifierId = modifierId;
        this.modifyTime = modifyTime;
        this.hlbDivisionCode = hlbDivisionCode;
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

    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId == null ? null : regionId.trim();
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode == null ? null : postCode.trim();
    }

    public Boolean getIsForbidden() {
        return isForbidden;
    }

    public void setIsForbidden(Boolean isForbidden) {
        this.isForbidden = isForbidden;
    }

    public Boolean getIsDel() {
        return isDel;
    }

    public void setIsDel(Boolean isDel) {
        this.isDel = isDel;
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
}