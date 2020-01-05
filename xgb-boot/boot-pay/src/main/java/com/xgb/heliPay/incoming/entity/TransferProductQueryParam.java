package com.xgb.heliPay.incoming.entity;

import com.xgb.heliPay.incoming.enums.CalcType;
import com.xgb.heliPay.incoming.enums.MoneyPeriod;
import com.xgb.heliPay.incoming.enums.OnlineBankType;
import com.xgb.heliPay.incoming.enums.ProductEnumType;

import java.math.BigDecimal;

public class TransferProductQueryParam extends CommonProductQueryParam {

    private CalcType calcType;

    private OnlineBankType onlineBankType;

    private MoneyPeriod moneyPeriod;

    private BigDecimal floating;

    public TransferProductQueryParam() {
        setProductType(ProductEnumType.TRANSFER);
    }

    public CalcType getCalcType() {
        return calcType;
    }

    public void setCalcType(CalcType calcType) {
        this.calcType = calcType;
    }

    public OnlineBankType getOnlineBankType() {
        return onlineBankType;
    }

    public void setOnlineBankType(OnlineBankType onlineBankType) {
        this.onlineBankType = onlineBankType;
    }

    public MoneyPeriod getMoneyPeriod() {
        return moneyPeriod;
    }

    public void setMoneyPeriod(MoneyPeriod moneyPeriod) {
        this.moneyPeriod = moneyPeriod;
    }

    public BigDecimal getFloating() {
        return floating;
    }

    public void setFloating(BigDecimal floating) {
        this.floating = floating;
    }

}
