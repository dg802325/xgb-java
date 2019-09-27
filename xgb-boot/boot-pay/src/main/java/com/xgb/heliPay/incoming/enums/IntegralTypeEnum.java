package com.xgb.heliPay.incoming.enums;

public enum IntegralTypeEnum {

    DISCOUNTS("优惠",1),//有积分
    STANDARD("标准",2),//有积分
    PUBLIC("公共",3);//无积分

    IntegralTypeEnum(String desc,Integer index){
        this.desc=desc;
        this.index=index;
    }

    private String desc;
    private Integer index;
    public String getDesc() {
        return desc;
    }
    public void setDesc(String desc) {
        this.desc = desc;
    }
    public Integer getIndex() {
        return index;
    }
    public void setIndex(Integer index) {
        this.index = index;
    }

}
