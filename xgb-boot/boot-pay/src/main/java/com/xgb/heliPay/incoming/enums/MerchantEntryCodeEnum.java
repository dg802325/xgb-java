package com.xgb.heliPay.incoming.enums;

public enum MerchantEntryCodeEnum {

    SUCCESS("0000", "成功"),
    IO_ERROR("0001", "文件IO异常"),
    WRONG_ACCESS_IP("0002", "接入IP不匹配"),
    FREQUENT_REQUESTS("0003", "请求太频繁，请稍后再试"),
    COMMON_PARAMS_ERROR("1001", "参数错误"),
    INVALID_ID_CARD("1002", "非法的身份证号码"),
    INVALID_REGION_CODE("1003", "非法的区域编码"),
    INVALID_INDUSTRY_TYPE_CODE("1004", "非法的行业编码"),
    OCCUPIED_EMAIL("1005", "邮箱已被占用"),
    OCCUPIED_SIGN_NAME("1006", "签约名已经存在"),
    OCCUPIED_BUSINESS_LICENSE("1007", "营业执照号已存在"),
    INVALID_ACCOUNT_NO("1008", "非法的结算卡号"),
    INVALID_BANK_CODE("1009", "找不着联行号对应的记录"),
    INVALID_MERCHANT("1010", "非法的商户号"),
    INVALID_MERCHANT_STATUS("1011", "商户状态异常"),
    INTERFACE_NOT_AVAILABLE("1012", "平台商未开通商户进件接口"),
    SIGN_MISMATCH("1013", "验签失败了"),
    INVALID_JSON_STR("1014", "非法的 JSON 串"),
    DECRYPTION_FAIL("1015", "body 解密失败了"),
    INVALID_FEE("1016", "非法的费率值"),
    LESSER_FEE("1017", "费率不能小于自身产品的费率"),
    INVALID_MIN_FEE("1018", "非法最低费率金额"),
    LESSER_FLOATING("1019", "浮动值不能小于自身的浮动值"),
    LESSER_MIN_FEE("1020", "最低费率金额不能小于自身的金额"),
    PRODUCT_NOT_AVAILABLE("1021", "大商户未开通此产品"),
    UNAUTHORIZED_FEE_SETTING("1022", "不允许对该产品进行费率设置"),
    INVALID_FLOATING("1023", "非法的浮动值"),
    MERCHANT_ENTRY_NOT_FOUND("1024", "未找着对应的子商户"),
    MERCHANT_ENTRY_NOT_AUDITED("1025", "子商户尚未通过审核"),
    MERCHANT_WAIT_FOR_AUDIT("1026", "进件信息待审核"),
    MERCHANT_ENTRY_EXISTENCE("1027", "商户已进件，不允许重复提交"),
    MERCHANT_ENTRY_ORDER_NOT_MATCH("1028", "重新进件失败，订单不匹配"),
    MERCHANT_ENTRY_ORDER_EXISTENCE("1029", "订单号重复了"),
    PRODUCT_OPEN_FAIL("1030", "产品开通失败"),
    PRODUCT_SETTING_FAIL("1031", "产品设置失败了"),
    PRODUCT_FEE_NOT_FOUND("1032", "未找着对应商品费率记录"),
    UNSUPPORTED_OPERATION("1033", "尚未支持此产品"),
    MERCHANT_ENTRY_EMAIL_EXISTENCE("1034", "邮箱重复了"),
    MERCHANT_ENTRY_BUSINESS_LICENSE_EXISTENCE("1035", "营业执照号重复了"),
    INVALID_MAX_FEE("1036", "非法最高费率金额"),
    GREATER_MAX_FEE("1037", "最高费率金额不能大于自身的金额"),
    MERCHANT_REENTRY_BUSINESS_LICENSE_EXISTENCE("1038", "进件信息重新提交申请，营业执照号已存在"),
    MERCHANT_REENTRY_EMAIL_EXISTENCE("1039", "进件信息重新提交申请，邮箱已存在"),
    MERCHANT_REENTRY_OCCUPIED_SIGN_NAME("1040", "进件信息重新提交申请，签约名已存在"),
    INVALID_DELAY_EFFECT_ENUM_VALUE("1041", "非法的DelayEffectEnum值"),
    INVALID_SUB_MERCHANT_STATUS("1044", "子商户状态异常"),  // 进件审核通过了，但是 merchant 状态异常

    WITHOUT_ACCESS_AUTHORITY("1045", "没有调用权限"),
    LIST_CONTAINS_BLANK_ELEMENT("1046", "不能包含空元素"),
    LIST_CONTAINS_DUPLICATE_ELEMENT("1047", "不能包含重复元素"),
    INVALID_AUTH_DIR("1048", "非法的授权目录"),
    INVALID_ACCOUNT_NAME("1049", "非法的结算账户名"),

    MERCHANT_ORIGINAL_ERROR("1050","商户原结算卡信息错误"),
    MERCHANT_UPDATE_ERROR("1051","变更结算卡信息有误"),
    MERCHANT_ENTRY_ALTERATION_NOT_FOUND("1052","未找到对应的变更请求"),
    MERCHANT_ENTRY_ALTERATION_TO_AUDIT("1053","该变更申请正在处理中"),
    MERCHANT_ENTRY_ALTERATION_AUDIT_FAIL("1054","子商户变更请求失败"),
    INVALID_MERCHANT_ENTRY_ALTERATION_STATUS("1055", "变更请求状态异常"),
    INVALID_SETTLEMENT_BANK_TYPE("1056","非法的结算卡类型"),

    CREDENTIAL_EXCEEDS_LIMIT("1100", "图片超过限制"),
    INVALID_CREDENTIAL_FILE_TYPE("1101", "非法的图片类型"),
    FILE_SIGN_MISMATCH("1102", "文件hash校验失败"),
    LACK_OF_FRONT_OF_ID_CARD("1103", "未上传身份证正面照"),
    LACK_OF_BACK_OF_ID_CARD("1104", "未上传身份证反面照"),
    LACK_OF_BUSINESS_LICENSE("1105", "未上传营业执照"),
    LACK_OF_ORG_CERTIFICATE("1106", "未上传组织机构证"),
    LACK_OF_TAX_REG_CERTIFICATE("1107", "未上传税务登记证"),
    LACK_OF_UNIFIED_CODE_CERTIFICATE("1108", "未上传三证合一营业执照"),
    LACK_OF_PERMIT_FOR_BANK_ACCOUNT("1109", "未上传开户许可证"),
    FAIL_UPDATE_CREDENTIAL("1110","无法修改图片"),
    LACK_OF_AUTH_FOR_SETTLEMENT("1111","未上传结算账户指定书"),
    NOT_EXISTS_NOT_PASSED_PICS("1112","商户图片错误项不包含该资质类型"),
    LACK_OF_HANDHELD_ID_CARD("1113","未上传持卡人手持身份证照"),
    LACK_OF_HANDHELD_BANK_CARD("1114","未上传持卡人手持银行卡照"),
    LACK_OF_ACCOUNT_OPENING_CERTIFICATE("1115","未上传银行开户证明"),

    SAVE_FILE_FAIL("1200","提交失败，请稍后重试"),
    WAITING_AUDIT("1201","正在审核中"),
    ALREADY_AUDIT("1202","支付服务协议签署提交成功"),
    COMMIT_SUCCESS("1203","支付服务协议签署提交成功"),
    NOT_FOUND("1204","未在数据库中找到对应的记录"),
    ;

    private final String code;
    private final String message;

    MerchantEntryCodeEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public static MerchantEntryCodeEnum fromCode(String code) {
        for (MerchantEntryCodeEnum e : values()) {
            if (code.equals(e.getCode())) {
                return e;
            }
        }
        return null;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
