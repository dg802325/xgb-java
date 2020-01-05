package com.xgb.heliPay.incoming.entity;

import com.xgb.heliPay.incoming.enums.AppPayType;
import com.xgb.heliPay.incoming.enums.ApplyType;

public class AppApplyParam {
    /**
     * 子商户编号
     */
    private String merchantNo;

    /**
     * 客户端类型
     */
    private AppPayType appPayType;

    /**
     * 订单号
     */
    private String orderNo;

    private ApplyType applyType;
    /**
     * 报名成功回调
     */
    private String callBackUrl;

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }

    public AppPayType getAppPayType() {
        return appPayType;
    }

    public void setAppPayType(AppPayType appPayType) {
        this.appPayType = appPayType;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public ApplyType getApplyType() {
        return applyType;
    }

    public void setApplyType(ApplyType applyType) {
        this.applyType = applyType;
    }

    public String getCallBackUrl() {
        return callBackUrl;
    }

    public void setCallBackUrl(String callBackUrl) {
        this.callBackUrl = callBackUrl;
    }
}
