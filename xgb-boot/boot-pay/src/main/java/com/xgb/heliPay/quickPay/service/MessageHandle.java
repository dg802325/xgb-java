package com.xgb.heliPay.quickPay.service;

import com.xgb.heliPay.quickPay.annotation.FieldEncrypt;
import com.xgb.heliPay.quickPay.annotation.SignExclude;
import com.xgb.heliPay.quickPay.api.QuickBase;
import com.xgb.heliPay.utils.AES;
import com.xgb.heliPay.utils.RSA;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.lang.reflect.Field;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by heli50 on 2018-06-25.
 */
public class MessageHandle {

	private static final Log log = LogFactory.getLog(MessageHandle.class);

	/**
	 * 获取map
	 */
	public static Map getReqestMap(Object bean) throws Exception {

		Map retMap = new HashMap();

		boolean isEncrypt = false;
		String aesKey = AES.generateString(16);
		StringBuilder sb = new StringBuilder();

		Class clazz = bean.getClass();
		Field[] fields = clazz.getDeclaredFields();
		for (Field field : fields) {
			field.setAccessible(true);
			String key = field.toString().substring(field.toString().lastIndexOf(".") + 1);
			String value = (String) field.get(bean);
			if (value == null) {
				value = "";
			}
			//查看是否有需要加密字段的注解,有则加密
			//这部分是将需要加密的字段先进行加密
			if (field.isAnnotationPresent(FieldEncrypt.class) && StringUtils.isNotEmpty(value)) {
				isEncrypt = true;
				value = AES.encryptToBase64(value, aesKey);
			}

			//字段没有@SignExclude注解的拼签名串
			//这部分是把需要参与签名的字段拼成一个待签名的字符串
			if (!field.isAnnotationPresent(SignExclude.class)) {
				sb.append(QuickBase.SPLIT);
				sb.append(value);
			}

			retMap.put(key, value);
		}

		//如果有加密的，需要用合利宝的公钥将AES加密的KEY进行加密使用BASE64编码上送
		if (isEncrypt) {
			PublicKey publicKey = RSA.getPublicKeyByCert(QuickBase.CERT_PATH);
			String encrytionKey = RSA.encodeToBase64(aesKey, publicKey, QuickBase.KEY_ALGORITHM);
			retMap.put(QuickBase.ENCRYPTION_KEY, encrytionKey);
		}


		log.info("原签名串：" + sb.toString());
		//使用商户的私钥进行签名
		PrivateKey privateKey = RSA.getPrivateKey(QuickBase.PFX_PATH, QuickBase.PFX_PWD);
		String sign = RSA.sign(sb.toString(), privateKey);
		retMap.put(QuickBase.SIGN, sign);
		log.info("签名sign：" + sign);


		return retMap;
	}


	public static boolean checkSign(Object bean) throws Exception {

		boolean flag = false;

		StringBuilder sb = new StringBuilder();

		Class clazz = bean.getClass();
		Field[] fields = clazz.getDeclaredFields();
		String sign = "";
		for (Field field : fields) {
			field.setAccessible(true);
			String key = field.toString().substring(field.toString().lastIndexOf(".") + 1);
			String value = (String) field.get(bean);
			if (value == null) {
				value = "";
			}

			if (QuickBase.SIGN.equals(key)) {
				sign = value;
			}

			//字段没有@SignExclude注解的拼签名串
			//这部分是把需要参与签名的字段拼成一个待签名的字符串
			if (!field.isAnnotationPresent(SignExclude.class)) {
				sb.append(QuickBase.SPLIT);
				sb.append(value);
			}

		}
		log.info("response验签原签名串：" + sb.toString());

		//使用合利宝的公钥进行验签
		PublicKey publicKey = RSA.getPublicKeyByCert(QuickBase.CERT_PATH);
		flag = RSA.verifySign(sb.toString(), sign, publicKey);
		if (flag) {
			log.info("验签成功");
		} else {
			log.info("验签失败");
		}
		return flag;

	}


}
