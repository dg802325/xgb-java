package com.xgb.heliPay.incoming.entity;

import com.xgb.heliPay.incoming.enums.MerchantCredentialType;
import com.xgb.heliPay.incoming.enums.MerchantEntryAlterationType;
import com.xgb.heliPay.incoming.enums.SettleBankType;

import java.util.Date;
import java.util.Map;

public class MerchantEntryAlterationParam {



    /**
     * 子商户编号
     */
    private String merchantNo;
    /**
     * 进件订单号
     */
    private String orderNo;
    /**
     * 开户名
     */
    private String accountName;
    /**
     * 开户账号
     */
    private String accountNo;
    /**
     * 资质类型
     */
    private MerchantCredentialType credentialType;
    /**
     * 审核时间
     */
    private Date operateDateTime;
    /**
     * 联行号
     */
    private String bankCode;
    /**
     * 变更后开户名
     */
    private String updateAccountName;
    /**
     * 变更后结算卡号
     */
    private String updateAccountNo;
    /**
     * 变更后联行号
     */
    private String updateBankCode;
    /**
     * 变更类型
     */
    private MerchantEntryAlterationType merchantEntryAlterationType;

    /**
     * 变更展示名
     */
    private String updateShowName;
    /**
     * 审核结果
     */
    private String result;
    /**
     * 原结算卡类型
     */
    private SettleBankType settleBankType;
    /**
     * 变更联系电话
     */
    private String updateLinkPhone;
    /**
     * 变更结算卡类型
     */
    private SettleBankType updateSettleBankType;
    /**
     * 上传结果
     */
    private MerchantCredentialStatus merchantCredentialStatus;
    /**
     * 文件签名
     */
    private String fileSign;
    /**
     * 文件签名列表
     */
    private Map<String,String> fileSigns;
    /**
     * 备注
     */
    private String remark;

    /**
     * 联系人
     */
    private String linkman;

    /**
     * 联系电话
     */
    private String linkPhone;

    /**
     * 营业执照
     */
    private String businessLicense;

    /**
     * 身份证号
     */
    private String legalPersonID;

    /**
     * 地址
     */
    private String address;

    /**
     * 区县编码
     */
    private String regionCode;

    /**
     * 省
     */
    private String province;

    /**
     * 市
     */
    private String city;

    /**
     * 经营类别
     */
    private String merchantCategory;


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


    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }


    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public MerchantCredentialType getCredentialType() {
        return credentialType;
    }

    public void setCredentialType(MerchantCredentialType credentialType) {
        this.credentialType = credentialType;
    }

    public Date getOperateDateTime() {
        return operateDateTime;
    }

    public void setOperateDateTime(Date operateDateTime) {
        this.operateDateTime = operateDateTime;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }


    public String getUpdateAccountNo() {
        return updateAccountNo;
    }

    public void setUpdateAccountNo(String updateAccountNo) {
        this.updateAccountNo = updateAccountNo;
    }


    public MerchantEntryAlterationType getMerchantEntryAlterationType() {
        return merchantEntryAlterationType;
    }

    public void setMerchantEntryAlterationType(MerchantEntryAlterationType merchantEntryAlterationType) {
        this.merchantEntryAlterationType = merchantEntryAlterationType;
    }


    public String getUpdateShowName() {
        return updateShowName;
    }

    public void setUpdateShowName(String updateShowName) {
        this.updateShowName = updateShowName;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public SettleBankType getSettleBankType() {
        return settleBankType;
    }

    public void setSettleBankType(SettleBankType settleBankType) {
        this.settleBankType = settleBankType;
    }

    public String getUpdateLinkPhone() {
        return updateLinkPhone;
    }

    public void setUpdateLinkPhone(String updateLinkPhone) {
        this.updateLinkPhone = updateLinkPhone;
    }

    public MerchantCredentialStatus getMerchantCredentialStatus() {
        return merchantCredentialStatus;
    }

    public void setMerchantCredentialStatus(MerchantCredentialStatus merchantCredentialStatus) {
        this.merchantCredentialStatus = merchantCredentialStatus;
    }

    public String getFileSign() {
        return fileSign;
    }

    public void setFileSign(String fileSign) {
        this.fileSign = fileSign;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getUpdateAccountName() {
        return updateAccountName;
    }

    public void setUpdateAccountName(String updateAccountName) {
        this.updateAccountName = updateAccountName;
    }

    public String getUpdateBankCode() {
        return updateBankCode;
    }

    public void setUpdateBankCode(String updateBankCode) {
        this.updateBankCode = updateBankCode;
    }

    public SettleBankType getUpdateSettleBankType() {
        return updateSettleBankType;
    }

    public void setUpdateSettleBankType(SettleBankType updateSettleBankType) {
        this.updateSettleBankType = updateSettleBankType;
    }

    public Map<String, String> getFileSigns() {
        return fileSigns;
    }

    public void setFileSigns(Map<String, String> fileSigns) {
        this.fileSigns = fileSigns;
    }

    public String getLinkman() {
        return linkman;
    }

    public void setLinkman(String linkman) {
        this.linkman = linkman;
    }

    public String getLinkPhone() {
        return linkPhone;
    }

    public void setLinkPhone(String linkPhone) {
        this.linkPhone = linkPhone;
    }

    public String getBusinessLicense() {
        return businessLicense;
    }

    public void setBusinessLicense(String businessLicense) {
        this.businessLicense = businessLicense;
    }

    public String getLegalPersonID() {
        return legalPersonID;
    }

    public void setLegalPersonID(String legalPersonID) {
        this.legalPersonID = legalPersonID;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRegionCode() {
        return regionCode;
    }

    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getMerchantCategory() {
        return merchantCategory;
    }

    public void setMerchantCategory(String merchantCategory) {
        this.merchantCategory = merchantCategory;
    }
}