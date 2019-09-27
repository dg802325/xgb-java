package com.xgb.heliPay.incoming.entity;

import com.xgb.heliPay.incoming.enums.ApplyType;

import java.util.List;

public class AddAuthPayDirsDevConfigParam {
    /**
     * 订单号
     */
    private String orderNo;
    /**
     * 子商户编号
     */
    private String merchantNo;

    /**
     * 微信子商户号
     * 商户通过进件查询接口获得,配置授权目录时上游需要
     */
    private String subMerchantNo;
    /**
     * 支付授权目录
     * 单次传一个
     */
    private String authPayDir;
    /**
     * 预留参数,非必填
     */
    private ApplyType applyType;

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
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

    public String getSubMerchantNo() {
        return subMerchantNo;
    }

    public void setSubMerchantNo(String subMerchantNo) {
        this.subMerchantNo = subMerchantNo;
    }

    public String getAuthPayDir() {
        return authPayDir;
    }

    public void setAuthPayDir(String authPayDir) {
        this.authPayDir = authPayDir;
    }
}
