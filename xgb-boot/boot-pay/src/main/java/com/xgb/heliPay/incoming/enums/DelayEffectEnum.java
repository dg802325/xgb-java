package com.xgb.heliPay.incoming.enums;

/**
 * Created by lankun on 2018/1/22.
 */
public enum DelayEffectEnum {

    NOW("即刻",0),
    TOMORROW("次日凌晨", 1),

    ;
    private final String desc;
    private final Integer index;

    DelayEffectEnum(String desc, Integer index) {
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
