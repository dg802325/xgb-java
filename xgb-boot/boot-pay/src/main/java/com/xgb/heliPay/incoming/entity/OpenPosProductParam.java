package com.xgb.heliPay.incoming.entity;

import com.xgb.heliPay.incoming.enums.ProductEnumType;
import com.xgb.heliPay.incoming.enums.ProductOpeningRecordStatus;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class OpenPosProductParam extends CommonOpenProductParam {

    /** 是否需要开通 pos 产品 **/
    private Boolean openPosFlag;

    /** 是否需要开通 mpos 产品 **/
    private Boolean openMPosFlag;

    /** 是否需要开通 云闪付 产品 **/
    private Boolean openQuickPassFlag;

    /** 借记卡交易费率 % **/
    private BigDecimal feeRate;

    /** 信用卡交易费率 % **/
    private BigDecimal creFeeRate;

    /** 借记卡封顶手续费 % **/
    private BigDecimal upLimit;

    /** D0垫资手续费 % **/
    private BigDecimal loanRateD0;

    /** D0固定垫资 元 **/
    private BigDecimal toFeeD0;

    /** 01：不开通；02：仅开通免签；03：开通免密免签 **/
    private String freeSign;

    /** 云闪付费率记录， openQuickPassFlag 为 true 时必传**/
    List<QuickPassFee> quickPassFees;

    private Boolean valid;

    /**
     * 审核时间
     */
    private Date completeDateTime;
    /**
     * 记录状态
     */
    private ProductOpeningRecordStatus productOpeningRecordStatus;
    /**
     * 审核意见
     */
    private String auditOpinion;

    /**
     * 审核结果通知回调地址
     */
    private String callbackUrl;

    public OpenPosProductParam() {
        setProductType(ProductEnumType.POS);
    }


    public static class QuickPassFee {
        private BigDecimal qpBeginValue;
        private BigDecimal qpEndValue;
        private BigDecimal qpFee;

        public QuickPassFee() {
        }

        public QuickPassFee(BigDecimal qpBeginValue, BigDecimal qpEndValue, BigDecimal qpFee) {
            this.qpBeginValue = qpBeginValue;
            this.qpEndValue = qpEndValue;
            this.qpFee = qpFee;
        }

        public BigDecimal getQpBeginValue() {
            return qpBeginValue;
        }

        public void setQpBeginValue(BigDecimal qpBeginValue) {
            this.qpBeginValue = qpBeginValue;
        }

        public BigDecimal getQpEndValue() {
            return qpEndValue;
        }

        public void setQpEndValue(BigDecimal qpEndValue) {
            this.qpEndValue = qpEndValue;
        }

        public BigDecimal getQpFee() {
            return qpFee;
        }

        public void setQpFee(BigDecimal qpFee) {
            this.qpFee = qpFee;
        }
    }


    public Boolean getOpenPosFlag() {
        return openPosFlag;
    }

    public void setOpenPosFlag(Boolean openPosFlag) {
        this.openPosFlag = openPosFlag;
    }

    public Boolean getOpenQuickPassFlag() {
        return openQuickPassFlag;
    }

    public void setOpenQuickPassFlag(Boolean openQuickPassFlag) {
        this.openQuickPassFlag = openQuickPassFlag;
    }

    public BigDecimal getFeeRate() {
        return feeRate;
    }

    public void setFeeRate(BigDecimal feeRate) {
        this.feeRate = feeRate;
    }

    public BigDecimal getCreFeeRate() {
        return creFeeRate;
    }

    public void setCreFeeRate(BigDecimal creFeeRate) {
        this.creFeeRate = creFeeRate;
    }

    public BigDecimal getUpLimit() {
        return upLimit;
    }

    public void setUpLimit(BigDecimal upLimit) {
        this.upLimit = upLimit;
    }

    public BigDecimal getLoanRateD0() {
        return loanRateD0;
    }

    public void setLoanRateD0(BigDecimal loanRateD0) {
        this.loanRateD0 = loanRateD0;
    }

    public BigDecimal getToFeeD0() {
        return toFeeD0;
    }

    public void setToFeeD0(BigDecimal toFeeD0) {
        this.toFeeD0 = toFeeD0;
    }

    public String getFreeSign() {
        return freeSign;
    }

    public void setFreeSign(String freeSign) {
        this.freeSign = freeSign;
    }

    public List<QuickPassFee> getQuickPassFees() {
        return quickPassFees;
    }

    public void setQuickPassFees(List<QuickPassFee> quickPassFees) {
        this.quickPassFees = quickPassFees;
    }

    public Boolean getValid() {
        return valid;
    }

    public void setValid(Boolean valid) {
        this.valid = valid;
    }

    public Date getCompleteDateTime() {
        return completeDateTime;
    }

    public void setCompleteDateTime(Date completeDateTime) {
        this.completeDateTime = completeDateTime;
    }

    public ProductOpeningRecordStatus getProductOpeningRecordStatus() {
        return productOpeningRecordStatus;
    }

    public void setProductOpeningRecordStatus(ProductOpeningRecordStatus productOpeningRecordStatus) {
        this.productOpeningRecordStatus = productOpeningRecordStatus;
    }

    public String getAuditOpinion() {
        return auditOpinion;
    }

    public void setAuditOpinion(String auditOpinion) {
        this.auditOpinion = auditOpinion;
    }

    public Boolean getOpenMPosFlag() {
        return openMPosFlag;
    }

    public void setOpenMPosFlag(Boolean openMPosFlag) {
        this.openMPosFlag = openMPosFlag;
    }

    public String getCallbackUrl() {
        return callbackUrl;
    }

    public void setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
    }
}
