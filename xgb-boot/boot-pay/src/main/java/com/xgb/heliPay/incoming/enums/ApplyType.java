package com.xgb.heliPay.incoming.enums;

public enum ApplyType {

    BlueOcean("蓝海绿洲报名", 1),
    ;
    private final String desc;
    private final Integer index;


    private ApplyType(String desc, Integer index) {
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
