package com.xgb.model;

import java.util.Date;

public class HlbCompanyAuthen {
    private String id;

    private String companyName;

    private String showName;

    private String webSite;

    private String accessUrl;

    private String merchantType;

    private String legalPerson;

    private String legalPersonId;

    private String orgNum;

    private String businessLicense;

    private String provinceId;

    private String cityId;

    private String areaId;

    private String regionCode;

    private String address;

    private String linkman;

    private String linkPhone;

    private String email;

    private String bindMobile;

    private String servicePhone;

    private String bankCode;

    private String accountName;

    private String accountNo;

    private String settleBankType;

    private String settlementPeriod;

    private String settlementMode;

    private String settlementRemark;

    private String merchantCategory;

    private String industryTypeCode;

    private String authorizationFlag;

    private String unionPayQrCode;

    private String needPosFunction;

    private String idCardStartDate;

    private String idCardEndDate;

    private Date businessDateStart;

    private Date businessDateLimit;

    private String accountIdCard;

    private String mcc;

    private String agreeprotocol;

    private String callbackUrl;

    private String settleMode;

    private String settlementAuth;

    private String postalAddress;

    private String microBizType;

    private String certType;

    private String linkManId;

    private String needAuthorize;

    private String specialSignName;

    private String status;

    private String remark;

    private String createId;

    private String updateId;

    private Date createTime;

    private Date updateTime;

    public HlbCompanyAuthen(String id, String companyName, String showName, String webSite, String accessUrl, String merchantType, String legalPerson, String legalPersonId, String orgNum, String businessLicense, String provinceId, String cityId, String areaId, String regionCode, String address, String linkman, String linkPhone, String email, String bindMobile, String servicePhone, String bankCode, String accountName, String accountNo, String settleBankType, String settlementPeriod, String settlementMode, String settlementRemark, String merchantCategory, String industryTypeCode, String authorizationFlag, String unionPayQrCode, String needPosFunction, String idCardStartDate, String idCardEndDate, Date businessDateStart, Date businessDateLimit, String accountIdCard, String mcc, String agreeprotocol, String callbackUrl, String settleMode, String settlementAuth, String postalAddress, String microBizType, String certType, String linkManId, String needAuthorize, String specialSignName, String status, String remark, String createId, String updateId, Date createTime, Date updateTime) {
        this.id = id;
        this.companyName = companyName;
        this.showName = showName;
        this.webSite = webSite;
        this.accessUrl = accessUrl;
        this.merchantType = merchantType;
        this.legalPerson = legalPerson;
        this.legalPersonId = legalPersonId;
        this.orgNum = orgNum;
        this.businessLicense = businessLicense;
        this.provinceId = provinceId;
        this.cityId = cityId;
        this.areaId = areaId;
        this.regionCode = regionCode;
        this.address = address;
        this.linkman = linkman;
        this.linkPhone = linkPhone;
        this.email = email;
        this.bindMobile = bindMobile;
        this.servicePhone = servicePhone;
        this.bankCode = bankCode;
        this.accountName = accountName;
        this.accountNo = accountNo;
        this.settleBankType = settleBankType;
        this.settlementPeriod = settlementPeriod;
        this.settlementMode = settlementMode;
        this.settlementRemark = settlementRemark;
        this.merchantCategory = merchantCategory;
        this.industryTypeCode = industryTypeCode;
        this.authorizationFlag = authorizationFlag;
        this.unionPayQrCode = unionPayQrCode;
        this.needPosFunction = needPosFunction;
        this.idCardStartDate = idCardStartDate;
        this.idCardEndDate = idCardEndDate;
        this.businessDateStart = businessDateStart;
        this.businessDateLimit = businessDateLimit;
        this.accountIdCard = accountIdCard;
        this.mcc = mcc;
        this.agreeprotocol = agreeprotocol;
        this.callbackUrl = callbackUrl;
        this.settleMode = settleMode;
        this.settlementAuth = settlementAuth;
        this.postalAddress = postalAddress;
        this.microBizType = microBizType;
        this.certType = certType;
        this.linkManId = linkManId;
        this.needAuthorize = needAuthorize;
        this.specialSignName = specialSignName;
        this.status = status;
        this.remark = remark;
        this.createId = createId;
        this.updateId = updateId;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public HlbCompanyAuthen() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName == null ? null : companyName.trim();
    }

    public String getShowName() {
        return showName;
    }

    public void setShowName(String showName) {
        this.showName = showName == null ? null : showName.trim();
    }

    public String getWebSite() {
        return webSite;
    }

    public void setWebSite(String webSite) {
        this.webSite = webSite == null ? null : webSite.trim();
    }

    public String getAccessUrl() {
        return accessUrl;
    }

    public void setAccessUrl(String accessUrl) {
        this.accessUrl = accessUrl == null ? null : accessUrl.trim();
    }

    public String getMerchantType() {
        return merchantType;
    }

    public void setMerchantType(String merchantType) {
        this.merchantType = merchantType == null ? null : merchantType.trim();
    }

    public String getLegalPerson() {
        return legalPerson;
    }

    public void setLegalPerson(String legalPerson) {
        this.legalPerson = legalPerson == null ? null : legalPerson.trim();
    }

    public String getLegalPersonId() {
        return legalPersonId;
    }

    public void setLegalPersonId(String legalPersonId) {
        this.legalPersonId = legalPersonId == null ? null : legalPersonId.trim();
    }

    public String getOrgNum() {
        return orgNum;
    }

    public void setOrgNum(String orgNum) {
        this.orgNum = orgNum == null ? null : orgNum.trim();
    }

    public String getBusinessLicense() {
        return businessLicense;
    }

    public void setBusinessLicense(String businessLicense) {
        this.businessLicense = businessLicense == null ? null : businessLicense.trim();
    }

    public String getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(String provinceId) {
        this.provinceId = provinceId == null ? null : provinceId.trim();
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId == null ? null : cityId.trim();
    }

    public String getAreaId() {
        return areaId;
    }

    public void setAreaId(String areaId) {
        this.areaId = areaId == null ? null : areaId.trim();
    }

    public String getRegionCode() {
        return regionCode;
    }

    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode == null ? null : regionCode.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getLinkman() {
        return linkman;
    }

    public void setLinkman(String linkman) {
        this.linkman = linkman == null ? null : linkman.trim();
    }

    public String getLinkPhone() {
        return linkPhone;
    }

    public void setLinkPhone(String linkPhone) {
        this.linkPhone = linkPhone == null ? null : linkPhone.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getBindMobile() {
        return bindMobile;
    }

    public void setBindMobile(String bindMobile) {
        this.bindMobile = bindMobile == null ? null : bindMobile.trim();
    }

    public String getServicePhone() {
        return servicePhone;
    }

    public void setServicePhone(String servicePhone) {
        this.servicePhone = servicePhone == null ? null : servicePhone.trim();
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode == null ? null : bankCode.trim();
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName == null ? null : accountName.trim();
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo == null ? null : accountNo.trim();
    }

    public String getSettleBankType() {
        return settleBankType;
    }

    public void setSettleBankType(String settleBankType) {
        this.settleBankType = settleBankType == null ? null : settleBankType.trim();
    }

    public String getSettlementPeriod() {
        return settlementPeriod;
    }

    public void setSettlementPeriod(String settlementPeriod) {
        this.settlementPeriod = settlementPeriod == null ? null : settlementPeriod.trim();
    }

    public String getSettlementMode() {
        return settlementMode;
    }

    public void setSettlementMode(String settlementMode) {
        this.settlementMode = settlementMode == null ? null : settlementMode.trim();
    }

    public String getSettlementRemark() {
        return settlementRemark;
    }

    public void setSettlementRemark(String settlementRemark) {
        this.settlementRemark = settlementRemark == null ? null : settlementRemark.trim();
    }

    public String getMerchantCategory() {
        return merchantCategory;
    }

    public void setMerchantCategory(String merchantCategory) {
        this.merchantCategory = merchantCategory == null ? null : merchantCategory.trim();
    }

    public String getIndustryTypeCode() {
        return industryTypeCode;
    }

    public void setIndustryTypeCode(String industryTypeCode) {
        this.industryTypeCode = industryTypeCode == null ? null : industryTypeCode.trim();
    }

    public String getAuthorizationFlag() {
        return authorizationFlag;
    }

    public void setAuthorizationFlag(String authorizationFlag) {
        this.authorizationFlag = authorizationFlag == null ? null : authorizationFlag.trim();
    }

    public String getUnionPayQrCode() {
        return unionPayQrCode;
    }

    public void setUnionPayQrCode(String unionPayQrCode) {
        this.unionPayQrCode = unionPayQrCode == null ? null : unionPayQrCode.trim();
    }

    public String getNeedPosFunction() {
        return needPosFunction;
    }

    public void setNeedPosFunction(String needPosFunction) {
        this.needPosFunction = needPosFunction == null ? null : needPosFunction.trim();
    }

    public String getIdCardStartDate() {
        return idCardStartDate;
    }

    public void setIdCardStartDate(String idCardStartDate) {
        this.idCardStartDate = idCardStartDate == null ? null : idCardStartDate.trim();
    }

    public String getIdCardEndDate() {
        return idCardEndDate;
    }

    public void setIdCardEndDate(String idCardEndDate) {
        this.idCardEndDate = idCardEndDate == null ? null : idCardEndDate.trim();
    }

    public Date getBusinessDateStart() {
        return businessDateStart;
    }

    public void setBusinessDateStart(Date businessDateStart) {
        this.businessDateStart = businessDateStart;
    }

    public Date getBusinessDateLimit() {
        return businessDateLimit;
    }

    public void setBusinessDateLimit(Date businessDateLimit) {
        this.businessDateLimit = businessDateLimit;
    }

    public String getAccountIdCard() {
        return accountIdCard;
    }

    public void setAccountIdCard(String accountIdCard) {
        this.accountIdCard = accountIdCard == null ? null : accountIdCard.trim();
    }

    public String getMcc() {
        return mcc;
    }

    public void setMcc(String mcc) {
        this.mcc = mcc == null ? null : mcc.trim();
    }

    public String getAgreeprotocol() {
        return agreeprotocol;
    }

    public void setAgreeprotocol(String agreeprotocol) {
        this.agreeprotocol = agreeprotocol == null ? null : agreeprotocol.trim();
    }

    public String getCallbackUrl() {
        return callbackUrl;
    }

    public void setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl == null ? null : callbackUrl.trim();
    }

    public String getSettleMode() {
        return settleMode;
    }

    public void setSettleMode(String settleMode) {
        this.settleMode = settleMode == null ? null : settleMode.trim();
    }

    public String getSettlementAuth() {
        return settlementAuth;
    }

    public void setSettlementAuth(String settlementAuth) {
        this.settlementAuth = settlementAuth == null ? null : settlementAuth.trim();
    }

    public String getPostalAddress() {
        return postalAddress;
    }

    public void setPostalAddress(String postalAddress) {
        this.postalAddress = postalAddress == null ? null : postalAddress.trim();
    }

    public String getMicroBizType() {
        return microBizType;
    }

    public void setMicroBizType(String microBizType) {
        this.microBizType = microBizType == null ? null : microBizType.trim();
    }

    public String getCertType() {
        return certType;
    }

    public void setCertType(String certType) {
        this.certType = certType == null ? null : certType.trim();
    }

    public String getLinkManId() {
        return linkManId;
    }

    public void setLinkManId(String linkManId) {
        this.linkManId = linkManId == null ? null : linkManId.trim();
    }

    public String getNeedAuthorize() {
        return needAuthorize;
    }

    public void setNeedAuthorize(String needAuthorize) {
        this.needAuthorize = needAuthorize == null ? null : needAuthorize.trim();
    }

    public String getSpecialSignName() {
        return specialSignName;
    }

    public void setSpecialSignName(String specialSignName) {
        this.specialSignName = specialSignName == null ? null : specialSignName.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getCreateId() {
        return createId;
    }

    public void setCreateId(String createId) {
        this.createId = createId == null ? null : createId.trim();
    }

    public String getUpdateId() {
        return updateId;
    }

    public void setUpdateId(String updateId) {
        this.updateId = updateId == null ? null : updateId.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}