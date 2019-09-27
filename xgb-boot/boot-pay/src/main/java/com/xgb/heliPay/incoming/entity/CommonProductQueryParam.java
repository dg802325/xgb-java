package com.xgb.heliPay.incoming.entity;


import com.xgb.heliPay.incoming.enums.ProductEnumType;

public class CommonProductQueryParam {

    /**
     * 产品类型
     */
    private ProductEnumType productType;
    /**
     * 子商户编号
     */
    private String merchantNo;

    public ProductEnumType getProductType() {
        return productType;
    }

    public void setProductType(ProductEnumType productType) {
        this.productType = productType;
    }

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }
}
