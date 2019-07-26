package com.xgb.lang;

public class XgbMessage {

    private String code;
    private String msg;
    private String count;
    private Object obj;

    public XgbMessage(String code, String msg, String count, Object obj) {
        this.code = code;
        this.msg = msg;
        this.count = count;
        this.obj = obj;
    }

    @Override
    public String toString() {
        return "XgbMessage{" +
                "code='" + code + '\'' +
                ", msg='" + msg + '\'' +
                ", count='" + count + '\'' +
                ", obj=" + obj +
                '}';
    }

    public XgbMessage() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }
}
