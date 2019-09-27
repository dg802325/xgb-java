package com.xgb.heliPay.incoming.entity;


import com.xgb.heliPay.incoming.enums.MerchantCredentialType;
import com.xgb.heliPay.incoming.enums.MerchantCredentialUrlUploadStatus;

public class MerchantCredentialUrlParam {


    /**
     * 子商户编号
     */
    private String merchantNo;
    /**
     * 进件订单号
     */
    private String orderNo;
    /**
     * 资质图片类型，用于查询接口
     */
    private MerchantCredentialType credentialType;
    /**
     * 备注
     */
    private String remark;
    /**
     * 当前状态
     */
    private MerchantCredentialUrlUploadStatus status;
    /**
     * 资质文件url
     */
    private String credentialUrl;


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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public MerchantCredentialUrlUploadStatus getStatus() {
        return status;
    }

    public void setStatus(MerchantCredentialUrlUploadStatus status) {
        this.status = status;
    }


    public MerchantCredentialType getCredentialType() {
        return credentialType;
    }

    public void setCredentialType(MerchantCredentialType credentialType) {
        this.credentialType = credentialType;
    }

    public String getCredentialUrl() {
        return credentialUrl;
    }

    public void setCredentialUrl(String credentialUrl) {
        this.credentialUrl = credentialUrl;
    }
}
