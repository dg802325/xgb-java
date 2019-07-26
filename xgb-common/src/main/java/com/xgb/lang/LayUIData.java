package com.xgb.lang;

import java.util.List;

public class LayUIData<T> {
    private Integer code;
    private String msg;
    private String count;
    private Integer score;
    private List<T> data;

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

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

    public LayUIData() {}

    public LayUIData(Integer code, String msg, String count, Integer score, List<T> data) {
        this.code = code;
        this.msg = msg;
        this.count = count;
        this.score = score;
        this.data = data;
    }
}
