package com.xgb.model;

import java.util.Date;

public class BlogGarden {
    private String id;

    private String blogTaitl;

    private String blogAbout;

    private Integer volume;

    private Integer support;

    private Integer opposition;

    private String classificationId;

    private String status;

    private String createId;

    private String updateId;

    private Date createTime;

    private Date updateTime;

    private String keyWord;

    public BlogGarden(String id, String blogTaitl, String blogAbout, Integer volume, Integer support, Integer opposition, String classificationId, String status, String createId, String updateId, Date createTime, Date updateTime, String keyWord) {
        this.id = id;
        this.blogTaitl = blogTaitl;
        this.blogAbout = blogAbout;
        this.volume = volume;
        this.support = support;
        this.opposition = opposition;
        this.classificationId = classificationId;
        this.status = status;
        this.createId = createId;
        this.updateId = updateId;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.keyWord = keyWord;
    }

    public BlogGarden() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getBlogTaitl() {
        return blogTaitl;
    }

    public void setBlogTaitl(String blogTaitl) {
        this.blogTaitl = blogTaitl == null ? null : blogTaitl.trim();
    }

    public String getBlogAbout() {
        return blogAbout;
    }

    public void setBlogAbout(String blogAbout) {
        this.blogAbout = blogAbout == null ? null : blogAbout.trim();
    }

    public Integer getVolume() {
        return volume;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    public Integer getSupport() {
        return support;
    }

    public void setSupport(Integer support) {
        this.support = support;
    }

    public Integer getOpposition() {
        return opposition;
    }

    public void setOpposition(Integer opposition) {
        this.opposition = opposition;
    }

    public String getClassificationId() {
        return classificationId;
    }

    public void setClassificationId(String classificationId) {
        this.classificationId = classificationId == null ? null : classificationId.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
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

    public String getKeyWord() {
        return keyWord;
    }

    public void setKeyWord(String keyWord) {
        this.keyWord = keyWord == null ? null : keyWord.trim();
    }
}