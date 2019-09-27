package com.xgb.heliPay.incoming.entity;

public enum FeeCollector {

	FEEACCOUNT("收手续费账户",1),
	
	OWN_CASHACCOUNT("自身资金账户",2);
	
	
	FeeCollector(String s,Integer i){
		this.desc = s;
		this.index = i;
	}
	private String desc;
	private Integer index;
	public String getDesc() {
		return desc;
	}
	public Integer getIndex() {
		return index;
	}

}
