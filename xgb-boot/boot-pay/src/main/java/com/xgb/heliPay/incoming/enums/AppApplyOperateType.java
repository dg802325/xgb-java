package com.xgb.heliPay.incoming.enums;

public enum  AppApplyOperateType {


    REPEAT("重复报备", 1),
    MODIFY("修改", 2),

    ;
    private final String desc;
    private final Integer index;

    AppApplyOperateType(String desc, Integer index) {
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
