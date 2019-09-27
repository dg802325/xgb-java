package com.xgb.heliPay.incoming.entity;

public enum MerchantCredentialStatus {

    NOT_UPLOADED("未上传", 0),

    UPLOADED("已上传", 1),

    ;

    private String desc;
    private Integer index;

    MerchantCredentialStatus(String desc, Integer index) {
        this.desc = desc;
        this.index = index;
    }

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
