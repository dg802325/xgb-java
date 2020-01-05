package com.xgb.heliPay.incoming.entity;

import com.xgb.heliPay.incoming.enums.MerchantCredentialType;

public class MerchantCredentialParam {

    /**
     * 图片类型
     */
    private MerchantCredentialType credentialType;

    /**
     * 子商户编号
     */
    private String merchantNo;

    /**
     * 请求单号
     */
    private String orderNo;

    /**
     * 文件签名
     */
    private String fileSign;

    public MerchantCredentialType getCredentialType() {
        return credentialType;
    }

    public void setCredentialType(MerchantCredentialType credentialType) {
        this.credentialType = credentialType;
    }

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getFileSign() {
        return fileSign;
    }

    public void setFileSign(String fileSign) {
        this.fileSign = fileSign;
    }
}
