package com.xgb.heliPay.incoming.enums;

import java.util.HashMap;
import java.util.Map;

public enum MerchantCategory {

	OFFLINE_RETAIL("线下零售",1),

	FOOD_BEVERAGE("餐饮/食品",2),

	TICKETING_TRAVEL("票务/旅游",3),

	EDUCATION_TRAINING("教育/培训",4),

	LIFE_ADVISORY_SERVICE("生活/咨询服务",5),

	ENTERTAINMENT_FITNESS_SERVICES("娱乐/健身服务",6),

	MEDICAL_CARE("医疗",7),

	COLLECTION_AUCTION("收藏/拍卖",8),

	LOGISTICS_EXPRESS("物流/快递",9),

	PUBLIC_WELFARE("公益",10),

	COMMUNICATION("通讯",11),

	FINANCE_INSURANCE("金融/保险",12),

	NETWORK_VIRTUAL_SERVICE("网络虚拟服务",13),

	LIVING_PAYMENT("生活缴费",14),

	HOTEL("酒店",15),

	HOME_FURNISHING("家居",16),

	GROUP_PURCHASE("电商团购",17),

	LOTTERY("彩票", 18),

	FASHION("时尚", 19),

	UTILITIES_EXPENSE("公共事业缴费", 20),

	REAL_ESTATE("房地产", 21),

	TRANSPORTATION_SERVICE("交通运输服务类", 22),

	MACHINE_ELECTRON("机械/电子", 23),

	SOFTWARE("软件",25),

	DECORATION("装饰", 26),

	GREEN_SEEDLING("苗木/绿化", 27),

	MATERNAL_CHILD_PRODUCT("母婴/玩具", 28),

	COLLECTION_PET("收藏/宠物",29),

	BOOK_STATIONERY_AUDIO_VIDEO("书籍/音像/文具", 30),

	BUSINESS_PLATFORM("平台商", 31),

	DIGITAL("数码", 32),

	DIGITAL_ENTERTAINMENT("数字娱乐", 33),

	ABROAD("境外", 34),

	PREPAID_CARD("预付卡", 35),

	DIRECT_SELLING("直销", 36),

	CROWD_FUNDING("众筹", 37),

	OTHER("其他",38),
	;

	MerchantCategory(String s,Integer i){
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
	public static Map<String,MerchantCategory> map = new HashMap<String,MerchantCategory>();

	static{
		MerchantCategory [] enums = MerchantCategory.values();
		for(MerchantCategory enumItem : enums){
			map.put(enumItem.name(), enumItem);
			map.put(enumItem.getDesc(), enumItem);
		}
	}

	public static MerchantCategory getMerchantCategory(String key){
		for(String k : map.keySet()){
			if(k.contains(key)){
				return map.get(k);
			}
		}
		return OTHER;
	}

	public static String getMerchantCategoryKey(MerchantCategory enumItem ){
		for(String k:map.keySet()){
			if(k.contains(enumItem.getDesc())){
				return k;
			}
		}
		return null;
	}

	public static String getMerchantCategoryName(String categoryId ){
		MerchantCategory [] merchantCategorys = MerchantCategory.values();
		for (MerchantCategory merchantCategory : merchantCategorys) {
			if(merchantCategory.name().equals(categoryId)) return merchantCategory.getDesc();
		}
		return null;
	}

	public static MerchantCategory fromDesc(String desc) {
		MerchantCategory[] values = values();
		for (MerchantCategory value : values) {
			if (value.getDesc().contains(desc)) {
				return value;
			}
		}
		return null;
	}

}
