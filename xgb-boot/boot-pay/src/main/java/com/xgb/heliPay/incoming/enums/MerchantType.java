package com.xgb.heliPay.incoming.enums;

public enum MerchantType {


	ENTERPRISE("企业商户",1),INSTITUTION("事业单位商户",2),INDIVIDUALBISS("个体工商户",3),PERSON("个人商户",4);

	MerchantType(String s,Integer i){
		this.desc = s;
		this.index = i;
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
