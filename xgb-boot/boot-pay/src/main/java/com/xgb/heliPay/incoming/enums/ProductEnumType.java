package com.xgb.heliPay.incoming.enums;

public enum ProductEnumType {

    APPPAY("扫码", 1),

    TRANSFER("代付", 2),

    ONLINE("网银", 3),

    QUICKPAY("快捷", 4),

    AUTHENTICATION("鉴权", 5),

    POS("POS", 6),

    SETTLEMENT("结算", 7),
    
    ACCOUNT_PAY("虚拟账户支付", 8)

    ;

    ProductEnumType(String s, Integer i) {
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
