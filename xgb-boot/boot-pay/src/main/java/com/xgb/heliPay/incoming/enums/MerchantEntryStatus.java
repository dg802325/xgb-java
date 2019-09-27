package com.xgb.heliPay.incoming.enums;

public enum MerchantEntryStatus {

    INIT("待审核", 1),
    OVERRULE("申请驳回", 2),
    AUDITED("审核通过", 3),
    ;

    private final String desc;
    private final Integer index;

    MerchantEntryStatus(String desc, Integer index) {
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
