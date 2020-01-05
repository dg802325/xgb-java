package com.xgb.heliPay.quickPay.entity.request;

import com.xgb.heliPay.quickPay.annotation.FieldEncrypt;
import com.xgb.heliPay.quickPay.annotation.SignExclude;

/**
 * Created by heli50 on 2017/4/15.
 */
public class BindCardVo {
    private String P1_bizType;

    private String P2_customerNumber;

    private String P3_userId;

    private String P4_orderId;

    private String P5_timestamp;

    private String P6_payerName;

    private String P7_idCardType;

    @FieldEncrypt
    private String P8_idCardNo;

    @FieldEncrypt
    private String P9_cardNo;

    @FieldEncrypt
    private String P10_year;

    @FieldEncrypt
    private String P11_month;

    @FieldEncrypt
    private String P12_cvv2;

    @FieldEncrypt
    private String P13_phone;

    @FieldEncrypt
    private String P14_validateCode;

    @SignExclude
    private String P15_isEncrypt;

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

    public String getP4_orderId() {
        return P4_orderId;
    }

    public void setP4_orderId(String p4_orderId) {
        P4_orderId = p4_orderId;
    }

    public String getP5_timestamp() {
        return P5_timestamp;
    }

    public void setP5_timestamp(String p5_timestamp) {
        P5_timestamp = p5_timestamp;
    }

    public String getP6_payerName() {
        return P6_payerName;
    }

    public void setP6_payerName(String p6_payerName) {
        P6_payerName = p6_payerName;
    }

    public String getP7_idCardType() {
        return P7_idCardType;
    }

    public void setP7_idCardType(String p7_idCardType) {
        P7_idCardType = p7_idCardType;
    }

    public String getP8_idCardNo() {
        return P8_idCardNo;
    }

    public void setP8_idCardNo(String p8_idCardNo) {
        P8_idCardNo = p8_idCardNo;
    }

    public String getP9_cardNo() {
        return P9_cardNo;
    }

    public void setP9_cardNo(String p9_cardNo) {
        P9_cardNo = p9_cardNo;
    }

    public String getP10_year() {
        return P10_year;
    }

    public void setP10_year(String p10_year) {
        P10_year = p10_year;
    }

    public String getP11_month() {
        return P11_month;
    }

    public void setP11_month(String p11_month) {
        P11_month = p11_month;
    }

    public String getP12_cvv2() {
        return P12_cvv2;
    }

    public void setP12_cvv2(String p12_cvv2) {
        P12_cvv2 = p12_cvv2;
    }

    public String getP13_phone() {
        return P13_phone;
    }

    public void setP13_phone(String p13_phone) {
        P13_phone = p13_phone;
    }

    public String getP14_validateCode() {
        return P14_validateCode;
    }

    public void setP14_validateCode(String p14_validateCode) {
        P14_validateCode = p14_validateCode;
    }

    public String getP15_isEncrypt() {
        return P15_isEncrypt;
    }

    public void setP15_isEncrypt(String p15_isEncrypt) {
        P15_isEncrypt = p15_isEncrypt;
    }

    public String getSignatureType() {
        return signatureType;
    }

    public void setSignatureType(String signatureType) {
        this.signatureType = signatureType;
    }
}
