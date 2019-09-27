package com.xgb.heliPay.quickPay.entity.request;

import com.xgb.heliPay.quickPay.annotation.SignExclude;

/**
 * Created by heli50 on 2017/4/14.
 */
public class QueryOrderVo {
    private String P1_bizType;
    private String P2_orderId;
    private String P3_customerNumber;
    @SignExclude
    private String signatureType;

    public String getP1_bizType() {
        return P1_bizType;
    }

    public void setP1_bizType(String p1_bizType) {
        P1_bizType = p1_bizType;
    }

    public String getP2_orderId() {
        return P2_orderId;
    }

    public void setP2_orderId(String p2_orderId) {
        P2_orderId = p2_orderId;
    }

    public String getP3_customerNumber() {
        return P3_customerNumber;
    }

    public void setP3_customerNumber(String p3_customerNumber) {
        P3_customerNumber = p3_customerNumber;
    }

    public String getSignatureType() {
        return signatureType;
    }

    public void setSignatureType(String signatureType) {
        this.signatureType = signatureType;
    }
}
