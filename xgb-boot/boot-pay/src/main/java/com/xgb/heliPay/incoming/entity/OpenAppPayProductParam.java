package com.xgb.heliPay.incoming.entity;


import com.xgb.heliPay.incoming.enums.*;

import java.math.BigDecimal;
import java.util.List;


public class OpenAppPayProductParam extends CommonOpenProductParam {

    /**
     * 刷卡\扫码\wap 支付类型
     */
    private PayType payType;
    /**
     * 客户端类型
     */
    private AppPayType appPayType;
    /**
     * 费率延迟生效时长
     */
    private DelayEffectEnum delayEffectEnum;
	/**
	 * 银联扫码分段费率
	 */
    List<FeeRange> feeRanges;

	private AppFeeMode appFeeMode = AppFeeMode.DEFAULT;

	private AppPayFeePurpose feePurpose;

    
    public OpenAppPayProductParam() {
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

    public DelayEffectEnum getDelayEffectEnum() {
        return delayEffectEnum;
    }

    public void setDelayEffectEnum(DelayEffectEnum delayEffectEnum) {
        this.delayEffectEnum = delayEffectEnum;
    }

	public List<FeeRange> getFeeRanges() {
		return feeRanges;
	}

	public void setFeeRanges(List<FeeRange> feeRanges) {
		this.feeRanges = feeRanges;
	}

	public AppFeeMode getAppFeeMode() {
		return appFeeMode;
	}

	public void setAppFeeMode(AppFeeMode appFeeMode) {
		this.appFeeMode = appFeeMode;
	}

	public AppPayFeePurpose getFeePurpose() {
		return feePurpose;
	}

	public void setFeePurpose(AppPayFeePurpose feePurpose) {
		this.feePurpose = feePurpose;
	}

	public static class FeeRange {
    	private BigDecimal start;//开始区间
    	private BigDecimal end;//结束区间
    	private BigDecimal fee;//费率
    	private BigDecimal minFee;//最小费率
    	private BigDecimal maxFee;//最大费率
    	private CalcType calcType = CalcType.RATIO;//计费类型
    	private OnlineCardType onlineCardType;//卡类型 银联使用
    	
		public FeeRange() {
		}
		public FeeRange(BigDecimal start, BigDecimal end, BigDecimal fee, BigDecimal minFee, BigDecimal maxFee,
				CalcType calcType, OnlineCardType onlineCardType) {
			super();
			this.start = start;
			this.end = end;
			this.fee = fee;
			this.minFee = minFee;
			this.maxFee = maxFee;
			this.calcType = calcType;
			this.onlineCardType = onlineCardType;
		}
		public BigDecimal getStart() {
			return start;
		}
		public void setStart(BigDecimal start) {
			this.start = start;
		}
		public BigDecimal getEnd() {
			return end;
		}
		public void setEnd(BigDecimal end) {
			this.end = end;
		}
		public BigDecimal getFee() {
			return fee;
		}
		public void setFee(BigDecimal fee) {
			this.fee = fee;
		}
		public BigDecimal getMinFee() {
			return minFee;
		}
		public void setMinFee(BigDecimal minFee) {
			this.minFee = minFee;
		}
        public BigDecimal getMaxFee() {
			return maxFee;
		}
		public void setMaxFee(BigDecimal maxFee) {
			this.maxFee = maxFee;
		}
		public CalcType getCalcType() {
			return calcType;
		}
		public void setCalcType(CalcType calcType) {
			this.calcType = calcType;
		}
		public OnlineCardType getOnlineCardType() {
			return onlineCardType;
		}
		public void setOnlineCardType(OnlineCardType onlineCardType) {
			this.onlineCardType = onlineCardType;
		}
    } 
    
}
