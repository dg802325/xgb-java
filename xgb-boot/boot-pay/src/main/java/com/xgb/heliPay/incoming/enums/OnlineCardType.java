package com.xgb.heliPay.incoming.enums;

public enum OnlineCardType {
	/**
	 * 借记卡
	 */
	DEBIT("借记卡",1),
	/**
	 * 贷记卡
	 */
	CREDIT("贷记卡",2);
	
	OnlineCardType(String s,Integer i){
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
	
	public static OnlineCardType getOnlineCardType(String cardDesc){
		OnlineCardType[] types = OnlineCardType.values();
		for(OnlineCardType type : types){
			if(type.desc.equals(cardDesc)) return type;
		}
		return null;
	}
		
	public static boolean contains(String cardType){
		OnlineCardType[] types = OnlineCardType.values();
		for(OnlineCardType type : types){
			if(type.name().equals(cardType)) return true;
		}
		return false;
	}

}
