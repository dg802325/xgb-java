package com.xgb.model;

import java.util.Date;

public class SysDatabases {
    private String id;

    private String databaseUrl;

    private String databasePortNumber;

    private String databaseName;

    private String databaseType;

    private String databaseLoginName;

    private String databaseLoginPassword;

    private String createId;

    private Date createTime;

    private String updateId;

    private Date updateTime;

    private String isDel;

    private String status;

    private String operationIp;

    private String directoryPrefix;

    private String packetType;

    private String packetAddress;

    private String updateOperationIp;

    private String commonPath;

    public SysDatabases(String id, String databaseUrl, String databasePortNumber, String databaseName, String databaseType, String databaseLoginName, String databaseLoginPassword, String createId, Date createTime, String updateId, Date updateTime, String isDel, String status, String operationIp, String directoryPrefix, String packetType, String packetAddress, String updateOperationIp, String commonPath) {
        this.id = id;
        this.databaseUrl = databaseUrl;
        this.databasePortNumber = databasePortNumber;
        this.databaseName = databaseName;
        this.databaseType = databaseType;
        this.databaseLoginName = databaseLoginName;
        this.databaseLoginPassword = databaseLoginPassword;
        this.createId = createId;
        this.createTime = createTime;
        this.updateId = updateId;
        this.updateTime = updateTime;
        this.isDel = isDel;
        this.status = status;
        this.operationIp = operationIp;
        this.directoryPrefix = directoryPrefix;
        this.packetType = packetType;
        this.packetAddress = packetAddress;
        this.updateOperationIp = updateOperationIp;
        this.commonPath = commonPath;
    }

    public SysDatabases() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getDatabaseUrl() {
        return databaseUrl;
    }

    public void setDatabaseUrl(String databaseUrl) {
        this.databaseUrl = databaseUrl == null ? null : databaseUrl.trim();
    }

    public String getDatabasePortNumber() {
        return databasePortNumber;
    }

    public void setDatabasePortNumber(String databasePortNumber) {
        this.databasePortNumber = databasePortNumber == null ? null : databasePortNumber.trim();
    }

    public String getDatabaseName() {
        return databaseName;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName == null ? null : databaseName.trim();
    }

    public String getDatabaseType() {
        return databaseType;
    }

    public void setDatabaseType(String databaseType) {
        this.databaseType = databaseType == null ? null : databaseType.trim();
    }

    public String getDatabaseLoginName() {
        return databaseLoginName;
    }

    public void setDatabaseLoginName(String databaseLoginName) {
        this.databaseLoginName = databaseLoginName == null ? null : databaseLoginName.trim();
    }

    public String getDatabaseLoginPassword() {
        return databaseLoginPassword;
    }

    public void setDatabaseLoginPassword(String databaseLoginPassword) {
        this.databaseLoginPassword = databaseLoginPassword == null ? null : databaseLoginPassword.trim();
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

    public String getIsDel() {
        return isDel;
    }

    public void setIsDel(String isDel) {
        this.isDel = isDel == null ? null : isDel.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getOperationIp() {
        return operationIp;
    }

    public void setOperationIp(String operationIp) {
        this.operationIp = operationIp == null ? null : operationIp.trim();
    }

    public String getDirectoryPrefix() {
        return directoryPrefix;
    }

    public void setDirectoryPrefix(String directoryPrefix) {
        this.directoryPrefix = directoryPrefix == null ? null : directoryPrefix.trim();
    }

    public String getPacketType() {
        return packetType;
    }

    public void setPacketType(String packetType) {
        this.packetType = packetType == null ? null : packetType.trim();
    }

    public String getPacketAddress() {
        return packetAddress;
    }

    public void setPacketAddress(String packetAddress) {
        this.packetAddress = packetAddress == null ? null : packetAddress.trim();
    }

    public String getUpdateOperationIp() {
        return updateOperationIp;
    }

    public void setUpdateOperationIp(String updateOperationIp) {
        this.updateOperationIp = updateOperationIp == null ? null : updateOperationIp.trim();
    }

    public String getCommonPath() {
        return commonPath;
    }

    public void setCommonPath(String commonPath) {
        this.commonPath = commonPath == null ? null : commonPath.trim();
    }
}