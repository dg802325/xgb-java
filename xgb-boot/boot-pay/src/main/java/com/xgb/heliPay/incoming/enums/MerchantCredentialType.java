package com.xgb.heliPay.incoming.enums;

public enum MerchantCredentialType {

    UNIFIED_CODE_CERTIFICATE("三证合一营业执照", 0),

    ORG_CERTIFICATE("组织机构证", 1),

    TAX_REG_CERTIFICATE("税务登记证", 2),

    BUSINESS_LICENSE("营业执照", 3),

    PERMIT_FOR_BANK_ACCOUNT("开户许可证", 4),

    SIGN_BOARD("门头照", 5),

    FRONT_OF_ID_CARD("身份证正面", 6),

    BACK_OF_ID_CARD("身份证反面", 7),

    HANDHELD_OF_ID_CARD("手持身份证照", 9),

    HANDHELD_OF_BANK_CARD("手持银行卡照", 10),

    CHECKOUT_COUNTER("收银台照", 12),

    INTERIOR_PHOTO("室内照", 13),

    ATTACHMENTINFO_1("附件一", 14),

    ATTACHMENTINFO_2("附件二", 15),

    ATTACHMENTINFO_3("附件三", 16),

    ATTACHMENTINFO_4("附件四", 17),

    ATTACHMENTINFO_5("附件五", 18),

    BANK_CARD("结算卡", 19),

    SETTLE_FRONT_OF_ID_CARD("结算人身份证正面", 20),

    SETTLE_BACK_OF_ID_CARD("结算人身份证反面", 21),

    ACTIVITY_CHECKOUT_COUNTER("绿洲活动收银台照", 22),
    ;

    private final String desc;
    private final Integer index;

    MerchantCredentialType(String desc, Integer index) {
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
