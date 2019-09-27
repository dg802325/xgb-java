package com.xgb.heliPay.incoming.enums;

public enum SettleBankType {

	TOPUBLIC("对公",1),

	TOPRIVATE("对私",2);

	
	SettleBankType(String s,Integer i){
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