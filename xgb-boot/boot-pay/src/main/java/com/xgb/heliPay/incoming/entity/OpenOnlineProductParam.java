package com.xgb.heliPay.incoming.entity;

import com.xgb.heliPay.incoming.enums.CalcType;
import com.xgb.heliPay.incoming.enums.OnlineBankType;
import com.xgb.heliPay.incoming.enums.OnlineCardType;
import com.xgb.heliPay.incoming.enums.ProductEnumType;

/**
 * 开通商户产品参数
 */
public class OpenOnlineProductParam extends CommonOpenProductParam {
    /**
     * 对公、对私
     */
    private OnlineBankType onlineBankType;

    private CalcType calcType;
    /**
     * 借贷记
     */
    private OnlineCardType onlineCardType;


    public OpenOnlineProductParam() {
        setProductType(ProductEnumType.ONLINE);
    }

    public OnlineBankType getOnlineBankType() {
        return onlineBankType;
    }

    public void setOnlineBankType(OnlineBankType onlineBankType) {
        this.onlineBankType = onlineBankType;
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
