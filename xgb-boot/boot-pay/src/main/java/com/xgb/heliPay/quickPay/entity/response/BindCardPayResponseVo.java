package com.xgb.heliPay.quickPay.entity.response;

import com.xgb.heliPay.quickPay.annotation.SignExclude;
import com.xgb.heliPay.quickPay.annotation.SignExclude;

/**
 * Created by heli50 on 2017/4/15.
 */
public class BindCardPayResponseVo {
    private String rt1_bizType;
    private String rt2_retCode;
    private String rt3_retMsg;
    private String rt4_customerNumber;
    private String rt5_orderId;
    private String rt6_serialNumber;
    private String rt7_completeDate;
    private String rt8_orderAmount;
    private String rt9_orderStatus;
    private String rt10_bindId;
    private String rt11_bankId;
    private String rt12_onlineCardType;
    private String rt13_cardAfterFour;
    private String rt14_userId;
    @SignExclude
    private String sign;

    public String getRt1_bizType() {
        return rt1_bizType;
    }

    public void setRt1_bizType(String rt1_bizType) {
        this.rt1_bizType = rt1_bizType;
    }

    public String getRt2_retCode() {
        return rt2_retCode;
    }

    public void setRt2_retCode(String rt2_retCode) {
        this.rt2_retCode = rt2_retCode;
    }

    public String getRt3_retMsg() {
        return rt3_retMsg;
    }

    public void setRt3_retMsg(String rt3_retMsg) {
        this.rt3_retMsg = rt3_retMsg;
    }

    public String getRt4_customerNumber() {
        return rt4_customerNumber;
    }

    public void setRt4_customerNumber(String rt4_customerNumber) {
        this.rt4_customerNumber = rt4_customerNumber;
    }

    public String getRt5_orderId() {
        return rt5_orderId;
    }

    public void setRt5_orderId(String rt5_orderId) {
        this.rt5_orderId = rt5_orderId;
    }

    public String getRt6_serialNumber() {
        return rt6_serialNumber;
    }

    public void setRt6_serialNumber(String rt6_serialNumber) {
        this.rt6_serialNumber = rt6_serialNumber;
    }

    public String getRt7_completeDate() {
        return rt7_completeDate;
    }

    public void setRt7_completeDate(String rt7_completeDate) {
        this.rt7_completeDate = rt7_completeDate;
    }

    public String getRt8_orderAmount() {
        return rt8_orderAmount;
    }

    public void setRt8_orderAmount(String rt8_orderAmount) {
        this.rt8_orderAmount = rt8_orderAmount;
    }

    public String getRt9_orderStatus() {
        return rt9_orderStatus;
    }

    public void setRt9_orderStatus(String rt9_orderStatus) {
        this.rt9_orderStatus = rt9_orderStatus;
    }

    public String getRt10_bindId() {
        return rt10_bindId;
    }

    public void setRt10_bindId(String rt10_bindId) {
        this.rt10_bindId = rt10_bindId;
    }

    public String getRt11_bankId() {
        return rt11_bankId;
    }

    public void setRt11_bankId(String rt11_bankId) {
        this.rt11_bankId = rt11_bankId;
    }

    public String getRt12_onlineCardType() {
        return rt12_onlineCardType;
    }

    public void setRt12_onlineCardType(String rt12_onlineCardType) {
        this.rt12_onlineCardType = rt12_onlineCardType;
    }

    public String getRt13_cardAfterFour() {
        return rt13_cardAfterFour;
    }

    public void setRt13_cardAfterFour(String rt13_cardAfterFour) {
        this.rt13_cardAfterFour = rt13_cardAfterFour;
    }

    public String getRt14_userId() {
        return rt14_userId;
    }

    public void setRt14_userId(String rt14_userId) {
        this.rt14_userId = rt14_userId;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    @Override
    public String toString() {
        return "BindCardPayResponseVo{" +
                "rt1_bizType='" + rt1_bizType + '\'' +
                ", rt2_retCode='" + rt2_retCode + '\'' +
                ", rt3_retMsg='" + rt3_retMsg + '\'' +
                ", rt4_customerNumber='" + rt4_customerNumber + '\'' +
                ", rt5_orderId='" + rt5_orderId + '\'' +
                ", rt6_serialNumber='" + rt6_serialNumber + '\'' +
                ", rt7_completeDate='" + rt7_completeDate + '\'' +
                ", rt8_orderAmount='" + rt8_orderAmount + '\'' +
                ", rt9_orderStatus='" + rt9_orderStatus + '\'' +
                ", rt10_bindId='" + rt10_bindId + '\'' +
                ", rt11_bankId='" + rt11_bankId + '\'' +
                ", rt12_onlineCardType='" + rt12_onlineCardType + '\'' +
                ", rt13_cardAfterFour='" + rt13_cardAfterFour + '\'' +
                ", rt14_userId='" + rt14_userId + '\'' +
                ", sign='" + sign + '\'' +
                '}';
    }
}
