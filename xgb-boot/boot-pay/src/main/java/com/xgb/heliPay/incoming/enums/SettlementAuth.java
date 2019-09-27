package com.xgb.heliPay.incoming.enums;

/**
 * 结算卡鉴权,
 * 传“存量”或不传，则不鉴权；传“新增”，则进行鉴权；
 */
public enum SettlementAuth {

    STOCK("存量", 1),
    INCREASE("新增", 2),
    ;
    private final String desc;
    private final Integer index;


    private SettlementAuth(String desc, Integer index) {
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
