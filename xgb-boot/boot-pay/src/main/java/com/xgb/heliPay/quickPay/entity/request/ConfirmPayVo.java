package com.xgb.heliPay.quickPay.entity.request;

import com.xgb.heliPay.quickPay.annotation.FieldEncrypt;
import com.xgb.heliPay.quickPay.annotation.SignExclude;

/**
 * Created by heli50 on 2017/4/14.
 */
public class ConfirmPayVo {
    private String P1_bizType;

    private String P2_customerNumber;

    private String P3_orderId;

    private String P4_timestamp;

    @FieldEncrypt
    private String P5_validateCode;

    private String P6_orderIp;

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

    public String getP3_orderId() {
        return P3_orderId;
    }

    public void setP3_orderId(String p3_orderId) {
        P3_orderId = p3_orderId;
    }

    public String getP4_timestamp() {
        return P4_timestamp;
    }

    public void setP4_timestamp(String p4_timestamp) {
        P4_timestamp = p4_timestamp;
    }

    public String getP5_validateCode() {
        return P5_validateCode;
    }

    public void setP5_validateCode(String p5_validateCode) {
        P5_validateCode = p5_validateCode;
    }

    public String getP6_orderIp() {
        return P6_orderIp;
    }

    public void setP6_orderIp(String p6_orderIp) {
        P6_orderIp = p6_orderIp;
    }

    public String getSignatureType() {
        return signatureType;
    }
    public void setSignatureType(String signatureType) {
        this.signatureType = signatureType;
    }

}
