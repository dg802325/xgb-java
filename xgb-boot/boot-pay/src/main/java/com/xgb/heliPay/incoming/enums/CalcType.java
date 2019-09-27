package com.xgb.heliPay.incoming.enums;

public enum CalcType {

	SINGLE("单笔收费",1),RATIO("比率收费",2);
	
	CalcType(String s,Integer i){
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
