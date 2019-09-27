package com.xgb.heliPay.incoming.enums;

public enum SettlementPeriod {

	T1("T1",1),

	D1("D1",2),
	
	D0("D0",3);

	
	SettlementPeriod(String s,Integer i){
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
