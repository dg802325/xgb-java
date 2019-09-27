package com.xgb.heliPay.incoming.enums;

public enum PayType {

	SWIPE("刷卡",1),
	
	SCAN("扫码",2),
	
	WAP("WAP",3),
	
	PUBLIC("公众号支付",4),

	/**sdk-app模式*/
	SDK("SDK",5),
	
	APPLET("小程序",6)
	;
	
	PayType(String s, Integer i) {
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
	
	public static String getPayTypeName(String bankId){
		PayType[] codes = PayType.values();
		for(PayType code : codes){
			if(code.name().equals(bankId)) return code.getDesc();
		}
		return "";
	}
}
