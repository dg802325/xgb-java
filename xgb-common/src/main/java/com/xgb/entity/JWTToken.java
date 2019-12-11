package com.xgb.entity;


import org.apache.shiro.authc.UsernamePasswordToken;

public class JWTToken extends UsernamePasswordToken {
    private String token;

    private String userType;

    public JWTToken(String token) {
        this.token = token;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public Object getPrincipal() {
        return token;
    }

    public Object getCredentials() {
        return token;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
