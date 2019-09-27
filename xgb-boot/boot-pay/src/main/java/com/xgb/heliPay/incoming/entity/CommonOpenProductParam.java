package com.xgb.heliPay.incoming.entity;

import com.xgb.heliPay.incoming.enums.ProductEnumType;

import java.math.BigDecimal;

public class CommonOpenProductParam {
    /**
     * 产品类型
     */
    private ProductEnumType productType;
    /**
     * 子商户编号
     */
    private String merchantNo;

    /**
     * 费率
     */
    private BigDecimal value;

    /**
     * 最低费率金额
     */
    private BigDecimal minFee;


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

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public BigDecimal getMinFee() {
        return minFee;
    }

    public void setMinFee(BigDecimal minFee) {
        this.minFee = minFee;
    }
}
