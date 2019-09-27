package com.xgb.heliPay.incoming.entity;

public class ContractQuery {

    /**
     * 子商户号
     */
    private String merchantNo;

    /**
     * 邮箱
     */
    private String email;

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
