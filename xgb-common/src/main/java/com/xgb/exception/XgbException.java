package com.xgb.exception;

/**
 * 封装的异常
 *
 */
public class XgbException extends RuntimeException {

    private String code;

    private String message;

    public XgbException(ServiceExceptionEnum serviceExceptionEnum) {
        this.code = serviceExceptionEnum.getCode();
        this.message = serviceExceptionEnum.getMessage();
    }

    public XgbException(ServiceExceptionEnum serviceExceptionEnum, String msg) {
        this.code = serviceExceptionEnum.getCode();
        this.message = serviceExceptionEnum.getMessage() + msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
