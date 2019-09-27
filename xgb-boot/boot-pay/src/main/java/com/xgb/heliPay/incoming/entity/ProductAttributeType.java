package com.xgb.heliPay.incoming.entity;

public enum ProductAttributeType {

    FeeCollection("手续费收取方式", 0),


    ;
    private final String desc;
    private final Integer index;


    ProductAttributeType(String desc, Integer index) {
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
