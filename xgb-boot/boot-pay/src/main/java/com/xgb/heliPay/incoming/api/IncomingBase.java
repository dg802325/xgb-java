package com.xgb.heliPay.incoming.api;

import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;

/**
 * @Auther: 邓根
 * @Date: 2019/9/27 13:52
 * @Description:
 */
public class IncomingBase {

    public final Log logger = LogFactory.getLog(this.getClass());

    //商户号
    public static final String PA_MERCHANT_NO = "C1800537538";
    //加密秘钥(公共产品)
    public static final String ENCRYPT_KEY_COMMON = "CyzzkLpQKUXW8b0gv4zRufun";
    //签名秘钥(公共产品)
    public static final String SIGNKEY_COMMON = "jajlUMsziRinEZ5R5FlI7LLhqAWEBxNw";

    //测试地址(进件)
    public static final String MERCHANT_ENTRY_URL = "http://test.trx.helipay.com/trx/merchantEntry/interface.action";
    //生产地址(进件)
//    public static final String MERCHANT_ENTRY_URL = "http://entry.trx.helipay.com/trx/merchantEntry/interface.action";

    //测试地址(签章合同)
    public static final String MERCHANT_SIGNCONTRACT_URL ="http://test.trx.helipay.com/trx/merchantAgreement/signContract.action";
    //生产地址(签章合同)
//    public static final String MERCHANT_SIGNCONTRACT_URL ="http://entry.trx.helipay.com/trx/merchantAgreement/ signContract.action";

    //测试地址(未知)
    public static final String MERCHANT_AGREEMENT_URL ="http://test.trx.helipay.com/trx/merchantAgreement/interface.action";

    public static final String SPLIT = "&";
    public final static String MERCHANT_ENTRY_INTERFACE = "register";  // 进件接口名称
    public final static String MERCHANT_ENTRY_QUERY_INTERFACE = "registerQuery"; // 进件查询接口名称
    public final static String PRODUCT_OPENING_INTERFACE = "openProduct";  // 产品开通接口名称
    public final static String PRODUCT_QUERY_INTERFACE = "productQuery";  // 产品查询接口名称
    public final static String CREDENTIAL_UPLOAD_INTERFACE = "uploadCredential";  // 资质上传接口名称
    public final static String CREDENTIAL_QUERY_INTERFACE = "credentialQuery";  // 资质上传结果查询接口名称
    public final static String WX_PUBLIC_APPLY_INTERFACE = "wxPublicApply";  // 微信报备接口
    public final static String WX_PUBLIC_APPLY_QUERY_INTERFACE = "wxPublicApplyQuery";  // 微信报备查询接口
    public final static String APP_APPLY_INTERFACE = "appApply";  // APP报备接口
    public final static String APP_APPLY_QUERY_INTERFACE = "appApplyQuery";  // APP报备查询接口
    public final static String MERCHANT_ENTRY_SETTLECARD_ALTERATION_INTERFACE = "settlementCardAlteration";//商户结算卡变更申请接口
    public final static String MERCHANT_ENTRY_ALTERATION_QUERY_INTERFACE = "queryAlteration";//商户变更查询接口
    public final static String MERCHANT_ENTRY_INFO_ALTERATION_INTERFACE = "infoAlteration";//商户信息变更
    public final static String MERCHANT_ENTRY_UPLOAD_ALTERATION_INTERFACE = "uploadAlterationAptitude";//商户资质变更
    public final static String MERCHANT_AGREEMENT_QUERY = "agreementQuery";//
    public final static String MODIFY_PRODUCT_CONFIG = "modifyProductConfig";  // 产品配置修改接口
    public final static String GET_PRODUCT_CONFIG = "getProductConfig"; // 产品配置查询接口
    public final static String PRODUCT_MODIFY_INTERFACE = "modifyProductDelay";  // 产品开通接口名称（延迟生效）
    public final static String UPLOAD_IMAGE_URL = "uploadImageUrl";
    public final static String IMAGE_URL_ALTERATION = "imageUrlAlteration";
    public final static String IMAGE_URL_QUERY = "imageUrlQuery";
    public final static String MODIFY_MERCHANT_INFO = "modifyMerchantInfo";
    public final static String SIGN_CONTRACT = "signContract";
    public final static String MERCHANT_ADD_AUTHPAYDIRS_DEVCONFIG = "addAuthPayDirsDevConfig";
    public final static String ALI_SUBMERCHANT_QUERY = "aliSubMerchantQuery";
    public final static String CONTRACT_QUERY = "contractQuery";

}
