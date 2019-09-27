package com.xgb.heliPay.incoming.entity;

import com.xgb.heliPay.incoming.enums.*;
import org.apache.commons.lang3.StringUtils;

public class MerchantEntryParam {

    /**
     * 签约名
     */
    private String signName;
    /**
     * 展示名 -  收银台展示
     */
    private String showName;
    /**
     * 进件订单号
     */
    private String orderNo;
    /**
     * 商户类型
     */
    private MerchantType merchantType;
    /**
     * 经营类别
     */
    private MerchantCategory merchantCategory;
    /**
     * 网站网址
     */
    private String webSite;
    /**
     * 接入地址 - 可为空
     */
    private String accessUrl;
    /**
     * 法人名字
     */
    private String legalPerson;
    /**
     * 法人证件号
     */
    private String legalPersonID;
    /**
     * 组织机构代码
     */
    private String orgNum;
    /**
     * 营业执照号
     */
    private String businessLicense;
    /**
     * 通讯地址
     */
    private String address;
    /**
     * 区域编码
     */
    private String regionCode;
    /**
     * 行业类型编码
     */
    private String industryTypeCode;
    /**
     * 联系人
     */
    private String linkman;
    /**
     * 联系电话
     */
    private String linkPhone;
    /**
     * 联系邮箱
     */
    private String email;
    /**
     * 绑定手机
     */
    private String bindMobile;
    /**
     * 联行号
     */
    private String bankCode;
    /**
     * 开户名
     */
    private String accountName;
    /**
     * 开户账号
     */
    private String accountNo;
    /**
     * 结算卡类型（对公、对私）
     */
    private SettleBankType settleBankType;
    /**
     * 结算周期
     */
    private SettlementPeriod settlementPeriod;
    /**
     * 结算方式
     */
    private SettlementMode settlementMode;
    /**
     * 是否授权大商户
     */
    private Boolean authorizationFlag;

    private String unionPayQrCode;

    /**
     * 是否已同意协议
     */
    private Boolean agreeProtocol;
    
    /**
     * 新增回调地址,手工审过的记录异步通知商户地址
     */
    private String callbackUrl;

    /**
     * 结算信息是否鉴权
     */
    private SettlementAuth settlementAuth;

    /************************  POS Start  ************************/
    /**
     * 是否需要开通 POS 功能
     * 若为是则 idCardStartDate、idCardEndDate、businessDateLimit、accountIdCard、mcc 必填
     */
    private Boolean needPosFunction;
    /**
     * 法人身份证开始日期
     */
    private String  idCardStartDate;
    /**
     * 法人身份证结束日期
     */
    private String idCardEndDate;
    /**
     * 经营起始日期
     */
    private String businessDateStart;
    /**
     * 经营期限
     */
    private String businessDateLimit;
    /**
     * 开户人身份证
     */
    private String accountIdCard;

    private String mcc;

    /************************  POS End  ************************/



    /************************ response data start ***************************/
    /**
     * 银行名称
     */
    private String bankName;
    /**
     * 所属省
     */
    private String bankProv;
    /**
     * 所属市
     */
    private String bankCity;
    /**
     * 分行名
     */
    private String bankBranch;

    private String merchantNo;

    private MerchantEntryStatus status;

    /**
     * 进件信息
     */
    private String msg;

    private String servicePhone;
    /**
     * 商户结算是否合并，合并结算新增参数
     */
    private SettleMode settleMode;


    /************************ response data end ***************************/

    public String getSignName() {
        return signName;
    }

    public void setSignName(String signName) {
        this.signName = signName;
    }

    public String getShowName() {
        return showName;
    }

    public void setShowName(String showName) {
        this.showName = showName;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getWebSite() {
        return webSite;
    }

    public void setWebSite(String webSite) {
        this.webSite = webSite;
    }

    public String getAccessUrl() {
        return accessUrl;
    }

    public void setAccessUrl(String accessUrl) {
        this.accessUrl = accessUrl;
    }

    public String getLegalPerson() {
        return legalPerson;
    }

    public void setLegalPerson(String legalPerson) {
        this.legalPerson = legalPerson;
    }

    public String getLegalPersonID() {
        return legalPersonID;
    }

    public void setLegalPersonID(String legalPersonID) {
        this.legalPersonID = legalPersonID;
    }

    public String getOrgNum() {
        return orgNum;
    }

    public void setOrgNum(String orgNum) {
        this.orgNum = orgNum;
    }

    public String getBusinessLicense() {
        return businessLicense;
    }

    public void setBusinessLicense(String businessLicense) {
        this.businessLicense = businessLicense;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBindMobile() {
        return bindMobile;
    }

    public void setBindMobile(String bindMobile) {
        this.bindMobile = bindMobile;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
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

    public SettleBankType getSettleBankType() {
        return settleBankType;
    }

    public void setSettleBankType(SettleBankType settleBankType) {
        this.settleBankType = settleBankType;
    }

    public MerchantCategory getMerchantCategory() {
        return merchantCategory;
    }

    public void setMerchantCategory(MerchantCategory merchantCategory) {
        this.merchantCategory = merchantCategory;
    }

    public SettlementPeriod getSettlementPeriod() {
        return settlementPeriod;
    }

    public void setSettlementPeriod(SettlementPeriod settlementPeriod) {
        this.settlementPeriod = settlementPeriod;
    }

    public Boolean getAuthorizationFlag() {
        return authorizationFlag;
    }

    public void setAuthorizationFlag(Boolean authorizationFlag) {
        this.authorizationFlag = authorizationFlag;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankProv() {
        return bankProv;
    }

    public void setBankProv(String bankProv) {
        this.bankProv = bankProv;
    }

    public String getBankCity() {
        return bankCity;
    }

    public void setBankCity(String bankCity) {
        this.bankCity = bankCity;
    }

    public String getBankBranch() {
        return bankBranch;
    }

    public void setBankBranch(String bankBranch) {
        this.bankBranch = bankBranch;
    }

    public MerchantEntryStatus getStatus() {
        return status;
    }

    public void setStatus(MerchantEntryStatus status) {
        this.status = status;
    }

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }

    public SettlementMode getSettlementMode() {
        return settlementMode;
    }

    public void setSettlementMode(SettlementMode settlementMode) {
        this.settlementMode = settlementMode;
    }

    public String getRegionCode() {
        return regionCode;
    }

    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }

    public String getIndustryTypeCode() {
        return industryTypeCode;
    }

    public void setIndustryTypeCode(String industryTypeCode) {
        this.industryTypeCode = industryTypeCode;
    }

    public MerchantType getMerchantType() {
        return merchantType;
    }

    public void setMerchantType(MerchantType merchantType) {
        this.merchantType = merchantType;
    }

    public String getUnionPayQrCode() {
        return unionPayQrCode;
    }

    public void setUnionPayQrCode(String unionPayQrCode) {
        this.unionPayQrCode = unionPayQrCode;
    }


    public Boolean getNeedPosFunction() {
        return needPosFunction;
    }

    public void setNeedPosFunction(Boolean needPosFunction) {
        this.needPosFunction = needPosFunction;
    }

    public String getIdCardStartDate() {
        return idCardStartDate;
    }

    public void setIdCardStartDate(String idCardStartDate) {
        this.idCardStartDate = StringUtils.isNotEmpty(idCardStartDate) ? idCardStartDate : null;
    }

    public String getIdCardEndDate() {
        return idCardEndDate;
    }

    public void setIdCardEndDate(String idCardEndDate) {
        this.idCardEndDate = StringUtils.isNotEmpty(idCardEndDate) ? idCardEndDate : null;
    }

    public String getBusinessDateLimit() {
        return businessDateLimit;
    }

    public void setBusinessDateLimit(String businessDateLimit) {
        this.businessDateLimit = StringUtils.isNotEmpty(businessDateLimit) ? businessDateLimit : null;
    }

    public String getAccountIdCard() {
        return accountIdCard;
    }

    public void setAccountIdCard(String accountIdCard) {
        this.accountIdCard = StringUtils.isNotEmpty(accountIdCard) ? accountIdCard : null;
    }

    public String getMcc() {
        return mcc;
    }

    public void setMcc(String mcc) {
        this.mcc = mcc;
    }


    public String getBusinessDateStart() {
        return businessDateStart;
    }

    public void setBusinessDateStart(String businessDateStart) {
        this.businessDateStart = StringUtils.isNotEmpty(businessDateStart) ? businessDateStart : null;
    }

    public Boolean getAgreeProtocol() {
        return agreeProtocol;
    }

    public void setAgreeProtocol(Boolean agreeProtocol) {
        this.agreeProtocol = agreeProtocol;
    }
    
	public String getCallbackUrl() {
		return callbackUrl;
	}

	public void setCallbackUrl(String callbackUrl) {
		this.callbackUrl = callbackUrl;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}


    public String getServicePhone() {
        return servicePhone;
    }

    public void setServicePhone(String servicePhone) {
        this.servicePhone = servicePhone;
    }


    public SettleMode getSettleMode() {
        return settleMode;
    }

    public void setSettleMode(SettleMode settleMode) {
        this.settleMode = settleMode;
    }
    
    public SettlementAuth getSettlementAuth() {
        return settlementAuth;
    }

    public void setSettlementAuth(SettlementAuth settlementAuth) {
        this.settlementAuth = settlementAuth;
    }
}
