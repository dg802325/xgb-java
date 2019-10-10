package com.xgb.heliPay.quickPay.entity.request;

import com.xgb.heliPay.quickPay.annotation.SignExclude;

/**
 * Created by heli50 on 2017/4/15.
 */
public class BankCardUnbindVo {
    private String P1_bizType;

    private String P2_customerNumber;

    private String P3_userId;

    private String P4_bindId;

    private String P5_orderId;

    private String P6_timestamp;

    @SignExclude
    private String signatureType;

    public String getP1_bizType() {
        return P1_bizType;
    }

    public void setP1_bizType(String p1_bizType) {
        P1_bizType = p1_bizType;
    }

    public String getP2_customerNumber() {
        return P2_customerNumber;
    }

    public void setP2_customerNumber(String p2_customerNumber) {
        P2_customerNumber = p2_customerNumber;
    }

    public String getP3_userId() {
        return P3_userId;
    }

    public void setP3_userId(String p3_userId) {
        P3_userId = p3_userId;
    }

    public String getP4_bindId() {
        return P4_bindId;
    }

    public void setP4_bindId(String p4_bindId) {
        P4_bindId = p4_bindId;
    }

    public String getP5_orderId() {
        return P5_orderId;
    }

    public void setP5_orderId(String p5_orderId) {
        P5_orderId = p5_orderId;
    }

    public String getP6_timestamp() {
        return P6_timestamp;
    }

    public void setP6_timestamp(String p6_timestamp) {
        P6_timestamp = p6_timestamp;
    }

    public String getSignatureType() {
        return signatureType;
    }

    public void setSignatureType(String signatureType) {
        this.signatureType = signatureType;
    }
}
