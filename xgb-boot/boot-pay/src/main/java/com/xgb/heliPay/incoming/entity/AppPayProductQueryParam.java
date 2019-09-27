package com.xgb.heliPay.incoming.entity;

import com.xgb.heliPay.incoming.enums.*;

public class AppPayProductQueryParam extends CommonProductQueryParam {

    /**
     * 刷卡\扫码\wap 支付类型
     */
    private PayType payType;
    /**
     * 客户端类型
     */
    private AppPayType appPayType;

    private ApplyType applyType;

	private AppPayFeePurpose feePurpose;

	private AppFeeMode appFeeMode = AppFeeMode.DEFAULT;

    public AppPayProductQueryParam() {
        setProductType(ProductEnumType.APPPAY);
    }

    public PayType getPayType() {
        return payType;
    }

    public void setPayType(PayType payType) {
        this.payType = payType;
    }

    public AppPayType getAppPayType() {
        return appPayType;
    }

    public void setAppPayType(AppPayType appPayType) {
        this.appPayType = appPayType;
    }

    public ApplyType getApplyType() {
        return applyType;
    }

    public void setApplyType(ApplyType applyType) {
        this.applyType = applyType;
    }

	public AppPayFeePurpose getFeePurpose() {
		return feePurpose;
	}

	public void setFeePurpose(AppPayFeePurpose feePurpose) {
		this.feePurpose = feePurpose;
	}


	public AppFeeMode getAppFeeMode() {
		return appFeeMode;
	}

	public void setAppFeeMode(AppFeeMode appFeeMode) {
		this.appFeeMode = appFeeMode;
	}
}
