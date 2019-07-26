package com.xgb.exception;

/**
 * 异常枚举
 */
public enum ExceptionEnum implements ServiceExceptionEnum {

    /**
     * 错误的请求
     */
    REQUEST_NULL("400", "请求有误"),

    /**
     * 未知错误
     */
    UNKNOW_ERROR("999", "服务处理异常");


    private String code;

    private String message;

    public void setCode(String code) {
        this.code = code;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    ExceptionEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public String getCode() {
        return null;
    }

    @Override
    public String getMessage() {
        return null;
    }

}
