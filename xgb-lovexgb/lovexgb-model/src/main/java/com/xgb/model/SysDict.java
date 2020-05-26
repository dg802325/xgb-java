package com.xgb.model;

import java.util.Date;

public class SysDict {
    private String id;

    private String dictName;

    private String dictType;

    private String dictCode;

    private String dictValue;

    private Integer sort;

    private String remark;

    private String status;

    private Date createTime;

    private Date updateTime;

    private String createId;

    private String updateId;

    private String parentId;

    public SysDict(String id, String dictName, String dictType, String dictCode, String dictValue, Integer sort, String remark, String status, Date createTime, Date updateTime, String createId, String updateId, String parentId) {
        this.id = id;
        this.dictName = dictName;
        this.dictType = dictType;
        this.dictCode = dictCode;
        this.dictValue = dictValue;
        this.sort = sort;
        this.remark = remark;
        this.status = status;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.createId = createId;
        this.updateId = updateId;
        this.parentId = parentId;
    }

    public SysDict() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getDictName() {
        return dictName;
    }

    public void setDictName(String dictName) {
        this.dictName = dictName == null ? null : dictName.trim();
    }

    public String getDictType() {
        return dictType;
    }

    public void setDictType(String dictType) {
        this.dictType = dictType == null ? null : dictType.trim();
    }

    public String getDictCode() {
        return dictCode;
    }

    public void setDictCode(String dictCode) {
        this.dictCode = dictCode == null ? null : dictCode.trim();
    }

    public String getDictValue() {
        return dictValue;
    }

    public void setDictValue(String dictValue) {
        this.dictValue = dictValue == null ? null : dictValue.trim();
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
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

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId == null ? null : parentId.trim();
    }
}