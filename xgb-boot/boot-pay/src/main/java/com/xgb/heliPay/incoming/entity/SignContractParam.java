package com.xgb.heliPay.incoming.entity;


/**
 * @className: SignContractParam
 * @description: 签名参数
 * @author: cyf
 * @date: 2019-01-23 10:54
 */
public class SignContractParam {

    private String code;

    private String message;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
