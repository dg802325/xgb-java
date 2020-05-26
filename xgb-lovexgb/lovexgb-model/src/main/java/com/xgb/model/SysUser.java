package com.xgb.model;

import java.util.Date;

public class SysUser {
    private String id;

    private String userName;

    private String password;

    private String salt;

    private String email;

    private String mobile;

    private String sex;

    private Integer status;

    private String deptId;

    private Date createTime;

    private Date updateTime;

    private String createId;

    private String updateId;

    private String nickName;

    private Date lastLogin;

    private String userHeaderUrl;

    private String lastLoginIp;

    private String lastLoginArea;

    public SysUser(String id, String userName, String password, String salt, String email, String mobile, String sex, Integer status, String deptId, Date createTime, Date updateTime, String createId, String updateId, String nickName, Date lastLogin, String userHeaderUrl, String lastLoginIp, String lastLoginArea) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.salt = salt;
        this.email = email;
        this.mobile = mobile;
        this.sex = sex;
        this.status = status;
        this.deptId = deptId;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.createId = createId;
        this.updateId = updateId;
        this.nickName = nickName;
        this.lastLogin = lastLogin;
        this.userHeaderUrl = userHeaderUrl;
        this.lastLoginIp = lastLoginIp;
        this.lastLoginArea = lastLoginArea;
    }

    public SysUser() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt == null ? null : salt.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId == null ? null : deptId.trim();
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

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    public Date getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(Date lastLogin) {
        this.lastLogin = lastLogin;
    }

    public String getUserHeaderUrl() {
        return userHeaderUrl;
    }

    public void setUserHeaderUrl(String userHeaderUrl) {
        this.userHeaderUrl = userHeaderUrl == null ? null : userHeaderUrl.trim();
    }

    public String getLastLoginIp() {
        return lastLoginIp;
    }

    public void setLastLoginIp(String lastLoginIp) {
        this.lastLoginIp = lastLoginIp == null ? null : lastLoginIp.trim();
    }

    public String getLastLoginArea() {
        return lastLoginArea;
    }

    public void setLastLoginArea(String lastLoginArea) {
        this.lastLoginArea = lastLoginArea == null ? null : lastLoginArea.trim();
    }
}