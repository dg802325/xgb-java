package com.xgb.model;

import java.util.Date;

public class ShopAdver {
    private String id;

    private String adverName;

    private String adverLocation;

    private String adverImage;

    private String adverLink;

    private String adverRemark;

    private Date createTime;

    private String creatorId;

    private String updateId;

    private Date updateTime;

    private String status;

    private String upTop;

    private Date startTime;

    private Date endTime;

    public ShopAdver(String id, String adverName, String adverLocation, String adverImage, String adverLink, String adverRemark, Date createTime, String creatorId, String updateId, Date updateTime, String status, String upTop, Date startTime, Date endTime) {
        this.id = id;
        this.adverName = adverName;
        this.adverLocation = adverLocation;
        this.adverImage = adverImage;
        this.adverLink = adverLink;
        this.adverRemark = adverRemark;
        this.createTime = createTime;
        this.creatorId = creatorId;
        this.updateId = updateId;
        this.updateTime = updateTime;
        this.status = status;
        this.upTop = upTop;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public ShopAdver() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getAdverName() {
        return adverName;
    }

    public void setAdverName(String adverName) {
        this.adverName = adverName == null ? null : adverName.trim();
    }

    public String getAdverLocation() {
        return adverLocation;
    }

    public void setAdverLocation(String adverLocation) {
        this.adverLocation = adverLocation == null ? null : adverLocation.trim();
    }

    public String getAdverImage() {
        return adverImage;
    }

    public void setAdverImage(String adverImage) {
        this.adverImage = adverImage == null ? null : adverImage.trim();
    }

    public String getAdverLink() {
        return adverLink;
    }

    public void setAdverLink(String adverLink) {
        this.adverLink = adverLink == null ? null : adverLink.trim();
    }

    public String getAdverRemark() {
        return adverRemark;
    }

    public void setAdverRemark(String adverRemark) {
        this.adverRemark = adverRemark == null ? null : adverRemark.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId == null ? null : creatorId.trim();
    }

    public String getUpdateId() {
        return updateId;
    }

    public void setUpdateId(String updateId) {
        this.updateId = updateId == null ? null : updateId.trim();
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

    public String getUpTop() {
        return upTop;
    }

    public void setUpTop(String upTop) {
        this.upTop = upTop == null ? null : upTop.trim();
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
}