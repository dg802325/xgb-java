package com.xgb.heliPay.quickPay.entity.request;

import com.xgb.heliPay.quickPay.annotation.FieldEncrypt;
import com.xgb.heliPay.quickPay.annotation.SignExclude;

/**
 * Created by heli50 on 2017/4/15.
 */
public class BindCardPayVo {
    private String P1_bizType;
    private String P2_customerNumber;
    private String P3_bindId;
    private String P4_userId;
    private String P5_orderId;
    private String P6_timestamp;
    private String P7_currency;
    private String P8_orderAmount;
    private String P9_goodsName;
    private String P10_goodsDesc;
    private String P11_terminalType;
    private String P12_terminalId;
    private String P13_orderIp;
    private String P14_period;
    private String P15_periodUnit;
    private String P16_serverCallbackUrl;
    @SignExclude
    @FieldEncrypt
    private String P17_validateCode;
    private String P18_ruleJson;
    private String P19_splitBillType;
    @SignExclude
    private String signatureType;

    public String getP18_ruleJson() {
        return P18_ruleJson;
    }

    public void setP18_ruleJson(String p18_ruleJson) {
        P18_ruleJson = p18_ruleJson;
    }

    public String getP19_splitBillType() {
        return P19_splitBillType;
    }

    public void setP19_splitBillType(String p19_splitBillType) {
        P19_splitBillType = p19_splitBillType;
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

    public String getP9_goodsName() {
        return P9_goodsName;
    }

    public void setP9_goodsName(String p9_goodsName) {
        P9_goodsName = p9_goodsName;
    }

    public String getP10_goodsDesc() {
        return P10_goodsDesc;
    }

    public void setP10_goodsDesc(String p10_goodsDesc) {
        P10_goodsDesc = p10_goodsDesc;
    }

    public String getP11_terminalType() {
        return P11_terminalType;
    }

    public void setP11_terminalType(String p11_terminalType) {
        P11_terminalType = p11_terminalType;
    }

    public String getP12_terminalId() {
        return P12_terminalId;
    }

    public void setP12_terminalId(String p12_terminalId) {
        P12_terminalId = p12_terminalId;
    }

    public String getP13_orderIp() {
        return P13_orderIp;
    }

    public void setP13_orderIp(String p13_orderIp) {
        P13_orderIp = p13_orderIp;
    }

    public String getP14_period() {
        return P14_period;
    }

    public void setP14_period(String p14_period) {
        P14_period = p14_period;
    }

    public String getP15_periodUnit() {
        return P15_periodUnit;
    }

    public void setP15_periodUnit(String p15_periodUnit) {
        P15_periodUnit = p15_periodUnit;
    }

    public String getP16_serverCallbackUrl() {
        return P16_serverCallbackUrl;
    }

    public void setP16_serverCallbackUrl(String p16_serverCallbackUrl) {
        P16_serverCallbackUrl = p16_serverCallbackUrl;
    }

    public String getP17_validateCode() {
        return P17_validateCode;
    }

    public void setP17_validateCode(String p17_validateCode) {
        P17_validateCode = p17_validateCode;
    }

    public String getSignatureType() {
        return signatureType;
    }

    public void setSignatureType(String signatureType) {
        this.signatureType = signatureType;
    }

}
