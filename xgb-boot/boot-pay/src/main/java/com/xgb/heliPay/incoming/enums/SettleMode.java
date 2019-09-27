package com.xgb.heliPay.incoming.enums;

public enum SettleMode {

	MERCHANT("商户结算",1),

	MERGE("合并结算",2),;


	SettleMode(String s,Integer i){
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