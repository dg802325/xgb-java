package com.xgb.heliPay.incoming.entity;

import com.xgb.heliPay.incoming.enums.CalcType;
import com.xgb.heliPay.incoming.enums.ProductEnumType;

public class AccountPayProductQueryParam extends CommonProductQueryParam {

    private CalcType calcType;


    public AccountPayProductQueryParam() {
        setProductType(ProductEnumType.ACCOUNT_PAY);
    }

    public CalcType getCalcType() {
        return calcType;
    }

    public void setCalcType(CalcType calcType) {
        this.calcType = calcType;
    }
}
