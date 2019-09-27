package com.xgb.heliPay.incoming.entity;

import com.xgb.heliPay.incoming.enums.AppApplyOperateType;
import com.xgb.heliPay.incoming.enums.ApplyType;

import java.util.List;

public class WXPublicApplyParam {

    /**
     * 子商户编号
     */
    private String merchantNo;

    /**
     * 关注公众号
     */
    private List<String> subscribeAppIds;

    /**
     * 支付公众号列表
     */
    private List<String> appIds;

    /**
     * 支付授权目录列表
     */
    private List<String> authPayDirs;

    /**
     * 渠道名 - 平台商报表主体简称
     */
    private String merchantChannelName;

    /**
     * 订单号
     */
    private String orderNo;

    private AppApplyOperateType operateType;

    private String reportId;

    private ApplyType applyType;

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }

    public List<String> getSubscribeAppIds() {
        return subscribeAppIds;
    }

    public void setSubscribeAppIds(List<String> subscribeAppIds) {
        this.subscribeAppIds = subscribeAppIds;
    }

    public List<String> getAppIds() {
        return appIds;
    }

    public void setAppIds(List<String> appIds) {
        this.appIds = appIds;
    }

    public List<String> getAuthPayDirs() {
        return authPayDirs;
    }

    public void setAuthPayDirs(List<String> authPayDirs) {
        this.authPayDirs = authPayDirs;
    }

    public String getMerchantChannelName() {
        return merchantChannelName;
    }

    public void setMerchantChannelName(String merchantChannelName) {
        this.merchantChannelName = merchantChannelName;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public AppApplyOperateType getOperateType() {
        return operateType;
    }

    public void setOperateType(AppApplyOperateType operateType) {
        this.operateType = operateType;
    }


    public String getReportId() {
        return reportId;
    }

    public void setReportId(String reportId) {
        this.reportId = reportId;
    }

    public ApplyType getApplyType() {
        return applyType;
    }

    public void setApplyType(ApplyType applyType) {
        this.applyType = applyType;
    }
}
