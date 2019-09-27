package com.xgb.heliPay.incoming.enums;

/**
 * 结算方式
 * @author zouqile
 *
 */
public enum SettlementMode {
   NOTOPEN("不开通",1),
   AUTO("自动结算",2),
   SELF("自主结算",3);
 

SettlementMode(String s,Integer i){
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
