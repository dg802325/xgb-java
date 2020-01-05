package com.xgb.heliPay.incoming.entity;


import com.xgb.heliPay.incoming.enums.ProductEnumType;

public class ModifyProductConfigParam {

    /**  变更类型 **/
    private ProductAttributeType type;

    private ProductEnumType productType;

    private String merchantNo;

    private String value;

    public ProductAttributeType getType() {
        return type;
    }

    public void setType(ProductAttributeType type) {
        this.type = type;
    }

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

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
