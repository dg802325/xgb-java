package com.xgb.heliPay.incoming.enums;


public enum MerchantEntryAlterationType {

    SETTLE_BANKCARD("结算卡", 1),
    MERCHANT_INFO("商户信息", 2),
    MERCHANT_CREDENTIAL("资质", 3),

    ;

    private final String desc;
    private final Integer index;

    MerchantEntryAlterationType(String desc, Integer index) {
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
