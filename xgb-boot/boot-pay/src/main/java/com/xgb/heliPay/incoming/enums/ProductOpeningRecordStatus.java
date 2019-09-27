package com.xgb.heliPay.incoming.enums;

public enum ProductOpeningRecordStatus {

    INIT("处理中", 0),
    FAIL("失败", 1),
    SUCCESS("成功", 2),
    CHECK_PENDING("待审核",3),
    DISMISSAL("审核驳回",4),
    ;

    ProductOpeningRecordStatus(String s, Integer i) {
        this.desc = s;
        this.index = i;
    }

    private final String desc;
    private final Integer index;

    public String getDesc() {
        return desc;
    }

    public Integer getIndex() {
        return index;
    }
}
