package com.xgb.heliPay.incoming.enums;

public enum AuthenticationType {

    TRADE("1", "交易鉴权"),
    INDEPENDENCE("2", "独立鉴权");

    private String index;
    private String desc;

    private AuthenticationType(String index, String desc) {
        this.index = index;
        this.desc = desc;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
   
}
