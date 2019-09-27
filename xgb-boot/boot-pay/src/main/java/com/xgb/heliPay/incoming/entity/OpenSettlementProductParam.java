package com.xgb.heliPay.incoming.entity;

import com.xgb.heliPay.incoming.enums.CalcType;
import com.xgb.heliPay.incoming.enums.ProductEnumType;
import com.xgb.heliPay.incoming.enums.SettleBankType;
import com.xgb.heliPay.incoming.enums.SettlementPeriod;

import java.math.BigDecimal;

public class OpenSettlementProductParam extends CommonOpenProductParam implements Cloneable {

    private CalcType calcType;

    private SettleBankType settleBankType;

    private SettlementPeriod settlementPeriod;

    private BigDecimal floating;


    public OpenSettlementProductParam() {
        setProductType(ProductEnumType.SETTLEMENT);
    }

    public CalcType getCalcType() {
        return calcType;
    }

    public void setCalcType(CalcType calcType) {
        this.calcType = calcType;
    }

    public SettleBankType getSettleBankType() {
        return settleBankType;
    }

    public void setSettleBankType(SettleBankType settleBankType) {
        this.settleBankType = settleBankType;
    }

    public SettlementPeriod getSettlementPeriod() {
        return settlementPeriod;
    }

    public void setSettlementPeriod(SettlementPeriod settlementPeriod) {
        this.settlementPeriod = settlementPeriod;
    }

    public BigDecimal getFloating() {
        return floating;
    }

    public void setFloating(BigDecimal floating) {
        this.floating = floating;
    }

}