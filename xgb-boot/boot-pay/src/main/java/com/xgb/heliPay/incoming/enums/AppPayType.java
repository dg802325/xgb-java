package com.xgb.heliPay.incoming.enums;

public enum AppPayType {
	ALIPAY("支付宝",1),
	WXPAY("微信支付",2),
	UNIONPAY("银联",3),
	QQPAY("QQ钱包",4),
	JDPAY("京东",5);
	
	
	AppPayType(String s,Integer i){
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
