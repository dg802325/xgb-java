package com.xgb.heliPay.utils;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.io.UnsupportedEncodingException;


public class Des3Encryption  {
	
	public static final String CHAR_ENCODING = "UTF-8";
	
	public static byte[] encode(byte[] key, byte[] data) throws Exception {
		return MessageAuthenticationCode.des3Encryption(key, data);
	}

    public static byte[] decode(byte[] key, byte[] value) throws Exception {
        return MessageAuthenticationCode.des3Decryption(key, value);
    }

	public static String encode(String key, String data) {
		try {
			byte[] keyByte = key.getBytes(CHAR_ENCODING);
			byte[] dataByte = data.getBytes(CHAR_ENCODING);
			byte[] valueByte = MessageAuthenticationCode.des3Encryption(
					keyByte, dataByte);
			String value = new String(Base64.encode(valueByte), CHAR_ENCODING);
			return value;
		} catch (Exception e) {
			return null;
		}
	}

	public static String decode(String key, String value){
		try {
			byte[] keyByte = key.getBytes(CHAR_ENCODING);
			byte[] valueByte = Base64.decode(value.getBytes(CHAR_ENCODING));
			byte[] dataByte = MessageAuthenticationCode.des3Decryption(keyByte,
					valueByte);
			String data = new String(dataByte, CHAR_ENCODING);
			return data;
		} catch (Exception e) {
			return null;
		}
	}


    public static void main(String[] args) throws UnsupportedEncodingException {
        String key = "sv0MZSKWy7AaHRIESbr0nbrj";
        String src = "16864110548832799";
        String end = Des3Encryption.encode(key, src);
        System.out.println(src.equals(Des3Encryption.decode(key, end)));
    }

}