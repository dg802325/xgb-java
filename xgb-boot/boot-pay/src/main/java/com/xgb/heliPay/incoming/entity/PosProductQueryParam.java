package com.xgb.heliPay.incoming.entity;


import com.xgb.heliPay.incoming.enums.ProductEnumType;

public class PosProductQueryParam extends CommonProductQueryParam {

    public PosProductQueryParam() {
        setProductType(ProductEnumType.POS);
    }
}
