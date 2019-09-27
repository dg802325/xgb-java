package com.xgb.heliPay.incoming.enums;

public enum AppFeeMode {


    DEFAULT("默认", 0),
    RANGE("分段区间", 1),;

    private final String desc;
    private final Integer index;

    AppFeeMode(String desc, Integer index) {
        this.desc = desc;
        this.index = index;
    }

    public String getDesc() {
        return desc;
    }

    public Integer getIndex() {
        return index;
    }
}
