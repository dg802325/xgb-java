package com.xgb.error;

public enum ApiResultCodeEnum {
    SUCCESS("0", "成功"),
    WARN("500", "警告"),
    ERROR("700", "异常");

    ApiResultCodeEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }

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
