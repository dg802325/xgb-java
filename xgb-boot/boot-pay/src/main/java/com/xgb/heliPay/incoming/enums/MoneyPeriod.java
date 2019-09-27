package com.xgb.heliPay.incoming.enums;

public enum MoneyPeriod {

	T1("T1",1),

	D0("D0",2);

	
	MoneyPeriod(String s,Integer i){
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
