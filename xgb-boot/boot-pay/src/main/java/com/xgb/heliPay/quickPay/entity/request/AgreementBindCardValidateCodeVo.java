package com.xgb.heliPay.quickPay.entity.request;


import com.xgb.heliPay.quickPay.annotation.FieldEncrypt;
import com.xgb.heliPay.quickPay.annotation.SignExclude;

/**
 * Created by heli50 on 2017/4/14.
 */
public class AgreementBindCardValidateCodeVo {

    private String P1_bizType;

    private String P2_customerNumber;

    private String P3_userId;

    private String P4_orderId;

    private String P5_timestamp;

    @FieldEncrypt
    private String P6_cardNo;

    @FieldEncrypt
    private String P7_phone;

    @FieldEncrypt
    private String P8_idCardNo;

    private String P9_idCardType;

    private String P10_payerName;

    @SignExclude
    private String P11_isEncrypt;

    @FieldEncrypt
    @SignExclude
    private String P12_year;

    @FieldEncrypt
    @SignExclude
    private String P13_month;

    @FieldEncrypt
    @SignExclude
    private String P14_cvv2;

    @SignExclude
    private String protocolType;

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

    public String getP6_cardNo() {
        return P6_cardNo;
    }

    public void setP6_cardNo(String p6_cardNo) {
        P6_cardNo = p6_cardNo;
    }

    public String getP7_phone() {
        return P7_phone;
    }

    public void setP7_phone(String p7_phone) {
        P7_phone = p7_phone;
    }

    public String getP8_idCardNo() {
        return P8_idCardNo;
    }

    public void setP8_idCardNo(String p8_idCardNo) {
        P8_idCardNo = p8_idCardNo;
    }

    public String getP9_idCardType() {
        return P9_idCardType;
    }

    public void setP9_idCardType(String p9_idCardType) {
        P9_idCardType = p9_idCardType;
    }

    public String getP10_payerName() {
        return P10_payerName;
    }

    public void setP10_payerName(String p10_payerName) {
        P10_payerName = p10_payerName;
    }

    public String getP11_isEncrypt() {
        return P11_isEncrypt;
    }

    public void setP11_isEncrypt(String p11_isEncrypt) {
        P11_isEncrypt = p11_isEncrypt;
    }

    public String getP12_year() {
        return P12_year;
    }

    public void setP12_year(String p12_year) {
        P12_year = p12_year;
    }

    public String getP13_month() {
        return P13_month;
    }

    public void setP13_month(String p13_month) {
        P13_month = p13_month;
    }

    public String getP14_cvv2() {
        return P14_cvv2;
    }

    public void setP14_cvv2(String p14_cvv2) {
        P14_cvv2 = p14_cvv2;
    }

    public String getProtocolType() {
        return protocolType;
    }

    public void setProtocolType(String protocolType) {
        this.protocolType = protocolType;
    }

    public String getSignatureType() {
        return signatureType;
    }

    public void setSignatureType(String signatureType) {
        this.signatureType = signatureType;
    }

}
