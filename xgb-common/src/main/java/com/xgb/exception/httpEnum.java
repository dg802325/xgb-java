package com.xgb.exception;

public enum httpEnum {

    SUCCESS(200,"请求成功"),
    ERROR(999,"请求失败"),

    USERNAMENULL(201,"用户不存在"),
    USERNAMEERROR(202,"用户异常"),
    USERNAMEROLM(203,"用户没有该权限"),
    USERNAMENOTNULL(204,"用户名不能为空"),

    PASSWORDNULL(250,"密码不能为空"),
    PASSWORDERROR(251,"密码错误");

    private Integer code;
    private String msg;

    httpEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
