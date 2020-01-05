package com.xgb.heliPay.incoming.service;

import java.io.File;

/** 仅供参考 **/
public interface EntryService {

    class SignAndEncryptedContent {

        private final String sign;
        private final String cont;

        public SignAndEncryptedContent(String sign, String cont) {
            this.sign = sign;
            this.cont = cont;
        }

        public String getSign() {
            return sign;
        }

        public String getCont() {
            return cont;
        }
    }

    /**
     * @param str
     * @param merchantNo 商户商编
     * @param encryptKey 加密秘钥
     * @param signKey 签名秘钥
     */
    SignAndEncryptedContent encryptAndSign(String str, String merchantNo, String encryptKey, String signKey);

    <T> T postForm(String interfaceName, String encrypted, String sign, String merchantNo, String url,
                   Class<T> clazz, String encryptKey, String signKey, File... files);

    /** 验签成功进行解密，获取明文 **/
    String verificationAndDecrypt(String encrypted, String sign, String encryptKey, String signKey);

}
