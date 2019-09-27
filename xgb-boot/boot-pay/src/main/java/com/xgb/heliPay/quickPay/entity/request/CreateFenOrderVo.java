package com.xgb.heliPay.quickPay.entity.request;

import com.xgb.heliPay.quickPay.annotation.FieldEncrypt;
import com.xgb.heliPay.quickPay.annotation.SignExclude;

/**
 * @Auther: 邓根
 * @Date: 2019/9/27 14:43
 * @Description:
 */
public class CreateFenOrderVo {
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

    private String P14_currency;

    private String P15_orderAmount;

    private String P16_goodsName;

    private String P17_goodsDesc;

    private String P18_terminalType;

    private String P19_terminalId;

    private String P20_orderIp;

    private String P21_period;

    private String P22_periodUnit;

    private String P23_serverCallbackUrl;

    private String P24_ruleJson;

    private String P25_splitBillType;

    @SignExclude
    private String signatureType;

    public String getP25_splitBillType() {
        return P25_splitBillType;
    }

    public void setP25_splitBillType(String p25_splitBillType) {
        P25_splitBillType = p25_splitBillType;
    }

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

    public String getP14_currency() {
        return P14_currency;
    }

    public void setP14_currency(String p14_currency) {
        P14_currency = p14_currency;
    }

    public String getP15_orderAmount() {
        return P15_orderAmount;
    }

    public void setP15_orderAmount(String p15_orderAmount) {
        P15_orderAmount = p15_orderAmount;
    }

    public String getP16_goodsName() {
        return P16_goodsName;
    }

    public void setP16_goodsName(String p16_goodsName) {
        P16_goodsName = p16_goodsName;
    }

    public String getP17_goodsDesc() {
        return P17_goodsDesc;
    }

    public void setP17_goodsDesc(String p17_goodsDesc) {
        P17_goodsDesc = p17_goodsDesc;
    }

    public String getP18_terminalType() {
        return P18_terminalType;
    }

    public void setP18_terminalType(String p18_terminalType) {
        P18_terminalType = p18_terminalType;
    }

    public String getP19_terminalId() {
        return P19_terminalId;
    }

    public void setP19_terminalId(String p19_terminalId) {
        P19_terminalId = p19_terminalId;
    }

    public String getP20_orderIp() {
        return P20_orderIp;
    }

    public void setP20_orderIp(String p20_orderIp) {
        P20_orderIp = p20_orderIp;
    }

    public String getP21_period() {
        return P21_period;
    }

    public void setP21_period(String p21_period) {
        P21_period = p21_period;
    }

    public String getP22_periodUnit() {
        return P22_periodUnit;
    }

    public void setP22_periodUnit(String p22_periodUnit) {
        P22_periodUnit = p22_periodUnit;
    }

    public String getP23_serverCallbackUrl() {
        return P23_serverCallbackUrl;
    }

    public void setP23_serverCallbackUrl(String p23_serverCallbackUrl) {
        P23_serverCallbackUrl = p23_serverCallbackUrl;
    }

    public String getP24_ruleJson() {
        return P24_ruleJson;
    }

    public void setP24_ruleJson(String p24_ruleJson) {
        P24_ruleJson = p24_ruleJson;
    }

    public String getSignatureType() {
        return signatureType;
    }

    public void setSignatureType(String signatureType) {
        this.signatureType = signatureType;
    }
}
