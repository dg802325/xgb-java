package com.xgb.heliPay.quickPay.entity.request;

import com.xgb.heliPay.quickPay.annotation.FieldEncrypt;
import com.xgb.heliPay.quickPay.annotation.SignExclude;

/**
 * Created by heli50 on 2017/4/14.
 */
public class BindPayValidateCodeVo {
    private String P1_bizType;

    private String P2_customerNumber;

    private String P3_bindId;

    private String P4_userId;

    private String P5_orderId;

    private String P6_timestamp;

    private String P7_currency;

    private String P8_orderAmount;

    @FieldEncrypt
    private String P9_phone;

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

    public String getP3_bindId() {
        return P3_bindId;
    }

    public void setP3_bindId(String p3_bindId) {
        P3_bindId = p3_bindId;
    }

    public String getP4_userId() {
        return P4_userId;
    }

    public void setP4_userId(String p4_userId) {
        P4_userId = p4_userId;
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

    public String getP7_currency() {
        return P7_currency;
    }

    public void setP7_currency(String p7_currency) {
        P7_currency = p7_currency;
    }

    public String getP8_orderAmount() {
        return P8_orderAmount;
    }

    public void setP8_orderAmount(String p8_orderAmount) {
        P8_orderAmount = p8_orderAmount;
    }

    public String getP9_phone() {
        return P9_phone;
    }

    public void setP9_phone(String p9_phone) {
        P9_phone = p9_phone;
    }

    public String getSignatureType() {
        return signatureType;
    }

    public void setSignatureType(String signatureType) {
        this.signatureType = signatureType;
    }
}
