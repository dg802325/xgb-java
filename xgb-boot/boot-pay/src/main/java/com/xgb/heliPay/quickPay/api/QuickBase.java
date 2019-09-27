package com.xgb.heliPay.quickPay.api;

import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;

/**
 * @Auther: 邓根
 * @Date: 2019/9/27 14:29
 * @Description:
 */
public class QuickBase {

    public final Log logger = LogFactory.getLog(this.getClass());

    public static final String REQUEST_URL_QUICKPAY = "http://pay.trx.helipay.com/trx/quickPayApi/interface.action";

    //加密秘钥(快捷产品)
    public static final String ENCRYPT_KEY_COMMON = "MTDHvqXrGEHN1VICnN7P1ufs";
    //签名秘钥(快捷产品)
    public static final String SIGNKEY_COMMON = "M07ydyb0jA1hxdhlsP3CzesM6oJrHZCh";

    public static final String CERT_PATH = "d:/helipay.cer";    //合利宝cert
    public static final String PFX_PATH = "d:/merchant0002.pfx";        //商户pfx
    public static final String PFX_PWD = "1234qwer";    //pfx密码
    public static final String ENCRYPTION_KEY = "encryptionKey";
    public static final String SPLIT = "&";
    public static final String SIGN = "sign";

    public static final String CHAR_ENCODING = "UTF-8";
    public static final String KEY_ALGORITHM = "RSA";
    public static final String SIGNATURE_ALGORITHM = "MD5WITHRSA";
    public static final String AES_ALGORITHM = "AES";
    public static final String DES_ALGORITHM = "DESede";//3des加解密算法工具类;
    public static final String MD5_ALGORITHM = "MD5";
    public static final String SHA_ALGORITHM = "SHA";
    public static final String SEPERATOR = "$";
}
