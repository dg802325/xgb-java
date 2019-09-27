package com.xgb.heliPay.b2bUnion.service;

import com.xgb.heliPay.b2bUnion.api.B2bUnionBase;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @Auther: 邓根
 * @Date: 2019/9/27 19:56
 * @Description:
 */
public class Disguiser {



    public static String disguiseMD5(String message) {

        if (null == message) {

            return null;
        }

        return disguiseMD5(message, B2bUnionBase.ENCODE);
    }

    public static String disguise(String message){
        return disguise(message+B2bUnionBase.KEY,B2bUnionBase.ENCODE);

    }
    public static String disguise(String message,String encoding){
        message = message.trim();
        byte value[];
        try{
            value = message.getBytes(encoding);
        }
        catch(UnsupportedEncodingException e){
            value = message.getBytes();
        }
        MessageDigest md = null;
        try{
            md = MessageDigest.getInstance("SHA");
        }catch(NoSuchAlgorithmException e){
            e.printStackTrace();
            return null;
        }
        return ConvertUtils.toHex(md.digest(value));
    }

    public static String disguiseMD5(String message, String encoding) {

        if (null == message || null == encoding) {

            return null;
        }

        message = message.trim();
        byte value[];
        try {
            value = message.getBytes(encoding);
        } catch (UnsupportedEncodingException e) {
            value = message.getBytes();
        }
        MessageDigest md = null;
        try {
            md = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
        return ConvertUtils.toHex(md.digest(value));
    }
}
