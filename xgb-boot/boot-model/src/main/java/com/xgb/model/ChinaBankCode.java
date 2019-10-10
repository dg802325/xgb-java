package com.xgb.model;

import java.util.Date;

public class ChinaBankCode {
    private String id;

    private String bankName;

    private String bankCode;

    private String createId;

    private Date createTime;

    private String updateId;

    private Date updateTime;

    private String status;

    private String isDel;

    private String bankColor;

    private String bankIcon;

    public ChinaBankCode(String id, String bankName, String bankCode, String createId, Date createTime, String updateId, Date updateTime, String status, String isDel, String bankColor, String bankIcon) {
        this.id = id;
        this.bankName = bankName;
        this.bankCode = bankCode;
        this.createId = createId;
        this.createTime = createTime;
        this.updateId = updateId;
        this.updateTime = updateTime;
        this.status = status;
        this.isDel = isDel;
        this.bankColor = bankColor;
        this.bankIcon = bankIcon;
    }

    public ChinaBankCode() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName == null ? null : bankName.trim();
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode == null ? null : bankCode.trim();
    }

    public String getCreateId() {
        return createId;
    }

    public void setCreateId(String createId) {
        this.createId = createId == null ? null : createId.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
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

    public String getIsDel() {
        return isDel;
    }

    public void setIsDel(String isDel) {
        this.isDel = isDel == null ? null : isDel.trim();
    }

    public String getBankColor() {
        return bankColor;
    }

    public void setBankColor(String bankColor) {
        this.bankColor = bankColor == null ? null : bankColor.trim();
    }

    public String getBankIcon() {
        return bankIcon;
    }

    public void setBankIcon(String bankIcon) {
        this.bankIcon = bankIcon == null ? null : bankIcon.trim();
    }
}