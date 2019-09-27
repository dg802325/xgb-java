package com.xgb.heliPay.incoming.entity;

import com.xgb.heliPay.incoming.enums.*;

import java.math.BigDecimal;

public class OpenQuickPayProductParam extends CommonOpenProductParam {

    public OpenQuickPayProductParam() {
        setProductType(ProductEnumType.QUICKPAY);
    }


    private CalcType calcType;

    /**
     * 计算方式
     */
    private OnlineBankType onlineBankType;
    /**
     * 借贷记
     */
    private OnlineCardType onlineCardType;
    /**
     * 费率区间开始金额
     */
    private BigDecimal startMoneyRegion;
    /**
     * 费率区间结束金额
     */
    private BigDecimal endMoneyRegion;
    /**
     * 积分计费
     */
    private IntegralTypeEnum integralType;
    /**
     * 最高费率金额
     */
    private BigDecimal maxFee;

    public OnlineCardType getOnlineCardType() {
        return onlineCardType;
    }

    public void setOnlineCardType(OnlineCardType onlineCardType) {
        this.onlineCardType = onlineCardType;
    }

    public BigDecimal getStartMoneyRegion() {
        return startMoneyRegion;
    }

    public void setStartMoneyRegion(BigDecimal startMoneyRegion) {
        this.startMoneyRegion = startMoneyRegion;
    }

    public BigDecimal getEndMoneyRegion() {
        return endMoneyRegion;
    }

    public void setEndMoneyRegion(BigDecimal endMoneyRegion) {
        this.endMoneyRegion = endMoneyRegion;
    }

    public IntegralTypeEnum getIntegralType() {
        return integralType;
    }

    public void setIntegralType(IntegralTypeEnum integralType) {
        this.integralType = integralType;
    }

    public OnlineBankType getOnlineBankType() {
        return onlineBankType;
    }

    public void setOnlineBankType(OnlineBankType onlineBankType) {
        this.onlineBankType = onlineBankType;
    }

    public CalcType getCalcType() {
        return calcType;
    }

    public void setCalcType(CalcType calcType) {
        this.calcType = calcType;
    }

    public BigDecimal getMaxFee() {
        return maxFee;
    }

    public void setMaxFee(BigDecimal maxFee) {
        this.maxFee = maxFee;
    }
}
