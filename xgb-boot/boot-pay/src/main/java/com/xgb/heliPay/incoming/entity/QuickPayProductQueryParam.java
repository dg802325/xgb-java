package com.xgb.heliPay.incoming.entity;

import com.xgb.heliPay.incoming.enums.CalcType;
import com.xgb.heliPay.incoming.enums.OnlineBankType;
import com.xgb.heliPay.incoming.enums.OnlineCardType;
import com.xgb.heliPay.incoming.enums.ProductEnumType;

import java.math.BigDecimal;

public class QuickPayProductQueryParam extends CommonProductQueryParam {


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
    private Boolean isScore;

    public QuickPayProductQueryParam() {
        setProductType(ProductEnumType.QUICKPAY);
    }

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

    public Boolean getIsScore() {
        return isScore;
    }

    public void setIsScore(Boolean isScore) {
        this.isScore = isScore;
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

}
