package com.xgb.heliPay.incoming.entity;

/**
 * 电子协议-合同参数
 * Created by lankun on 2017/12/19.
 */
public class MerchantAgreementParam {


    /** 邮箱 +*/
    private String email;

    /** 商户编号 **/
    private String merchantNo;

    /** 手机号 **/
    private String phone;

    /** 身份证号 **/
    private String idCard;

    /** 回调地址 **/
    private String callBackUrl;

    /** 订单号 **/
    private String orderNo;

    /** 状态 **/
    private String status;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getCallBackUrl() {
        return callBackUrl;
    }

    public void setCallBackUrl(String callBackUrl) {
        this.callBackUrl = callBackUrl;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
