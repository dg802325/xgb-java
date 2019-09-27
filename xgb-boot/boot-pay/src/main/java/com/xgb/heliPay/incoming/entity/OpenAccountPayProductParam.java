package com.xgb.heliPay.incoming.entity;


import com.xgb.heliPay.incoming.enums.CalcType;
import com.xgb.heliPay.incoming.enums.ProductEnumType;

/**
 * 开通虚拟账户支付 商户产品参数
 */
public class OpenAccountPayProductParam extends CommonOpenProductParam implements Cloneable {

    private CalcType calcType;


    public OpenAccountPayProductParam() {
        setProductType(ProductEnumType.ACCOUNT_PAY);
    }

    public CalcType getCalcType() {
        return calcType;
    }

    public void setCalcType(CalcType calcType) {
        this.calcType = calcType;
    }
}
