package com.xgb.heliPay.incoming.enums;

public enum AppPayFeePurpose {
    /**
     * 普通费率
     */
    DEFAULT("默认普通", 1),
    /**
     * 绿洲/蓝海费率
     */
    WAI_MEAL("绿洲/蓝海", 2),;


    AppPayFeePurpose(String s, Integer i) {
        this.desc = s;
        this.index = i;
    }


    private String desc;
    private Integer index;

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

}

