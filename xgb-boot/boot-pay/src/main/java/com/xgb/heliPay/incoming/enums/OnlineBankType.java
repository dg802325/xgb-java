package com.xgb.heliPay.incoming.enums;

public enum OnlineBankType {

	B2C("对私",1),
	
	
	B2B("对公",2);
	
	OnlineBankType(String s,Integer i){
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
	
	public static OnlineBankType getByIndex(int value) {    //    从int到enum的转换函数  
		OnlineBankType[] onbkBankTypes=OnlineBankType.values();
		for (OnlineBankType onlineBankType : onbkBankTypes) {
			if (onlineBankType.index==value) {
				return onlineBankType;
			}
		}
		return null;
    }  
}
