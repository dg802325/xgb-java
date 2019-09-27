package com.xgb.heliPay.incoming.enums;

/**
 * 商户资质图片URL上传记录状态
 */
public enum MerchantCredentialUrlUploadStatus {



    FAIL("失败",1),
    SUCCESS("成功",2),
    DOING("处理中",3),
    ;

    private final String desc;
    private final Integer index;

    MerchantCredentialUrlUploadStatus(String desc, Integer index) {
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
