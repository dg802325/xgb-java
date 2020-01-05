package com.xgb.heliPay.incoming.service;

import com.alibaba.fastjson.JSON;
import com.xgb.heliPay.incoming.api.IncomingBase;
import com.xgb.heliPay.incoming.entity.GenericResponse;
import com.xgb.heliPay.utils.Des3Encryption;
import com.xgb.heliPay.utils.Disguiser;
import okhttp3.*;
import org.apache.commons.lang.time.StopWatch;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.xgb.heliPay.incoming.enums.MerchantEntryCodeEnum.SUCCESS;

/** 仅供参考 **/
@Service("entryService")
public class EntryServiceImpl implements EntryService {

    private final Log logger = LogFactory.getLog(this.getClass());

    private static final String SPLIT = "&";

    private OkHttpClient client =new OkHttpClient.Builder()
            .connectTimeout(3, TimeUnit.SECONDS)
            .readTimeout(20, TimeUnit.SECONDS)
            .build();

    private static final MediaType MEDIA_TYPE_JPG = MediaType.parse("image/jpg");

    @Override
    public SignAndEncryptedContent encryptAndSign(String str, String merchantNo, String encryptKey, String signKey) {
        if (StringUtils.isBlank(str)) {
            throw new IllegalArgumentException("str 不能为空");
        }
        if (StringUtils.isBlank(merchantNo)) {
            throw new IllegalArgumentException("merchantNo 不能为空");
        }
        if (StringUtils.isBlank(encryptKey)) {
            throw new IllegalArgumentException("encryptKey 不能为空");
        }
        if (StringUtils.isBlank(signKey)) {
            throw new IllegalArgumentException("signKey 不能为空");
        }
        String encryptedStr = Des3Encryption.encode(encryptKey, str);
        if (encryptedStr == null) {
            throw new IllegalStateException("加密失败了");
        }
        String sign = Disguiser.disguiseMD5(encryptedStr + SPLIT + merchantNo + SPLIT + signKey);
        logger.info("encryptedStr:"+ encryptedStr + SPLIT + merchantNo + SPLIT + signKey);
        logger.info("sign:"+ sign);
        return new SignAndEncryptedContent(sign, encryptedStr);
    }

    @Override
    public <T> T postForm(String interfaceName, String encrypted, String sign, String merchantNo, String url,
                          Class<T> clazz, String encryptKey, String signKey, File... files) {


        RequestBody requestBody = null;
        if (files.length == 0 ) {
            requestBody = new FormBody.Builder()
                    .add("interfaceName", interfaceName)
                    .add("body", encrypted)
                    .add("sign", sign)
                    .add("merchantNo", merchantNo)
                    .build();
        } else if (files.length == 1){
            requestBody = new MultipartBody.Builder()
                    .setType(MultipartBody.FORM)
                    .addFormDataPart("interfaceName", interfaceName)
                    .addFormDataPart("body", encrypted)
                    .addFormDataPart("sign", sign)
                    .addFormDataPart("merchantNo", merchantNo)
                    .addFormDataPart("file", files[0].getName(),
                            RequestBody.create(MEDIA_TYPE_JPG, files[0]))
                    .build();
        } else {
            MultipartBody.Builder builder = new MultipartBody.Builder();
            builder.setType(MultipartBody.FORM);
            builder.addFormDataPart("interfaceName", interfaceName);
            builder.addFormDataPart("body", encrypted);
            builder.addFormDataPart("sign", sign);
            builder.addFormDataPart("merchantNo", merchantNo);
            builder.addFormDataPart("authorizationForSettlement", "authorizationForSettlement",
                    RequestBody.create(MEDIA_TYPE_JPG, files[0]));
            String[] fileNames = {"accountOpeningCertificate","frontOfIdCard","backOfIdCard","handheldOfIdCard","handheldOfBankCard","subleaseCertificate"};
            for (int i = 1;i < files.length;i++) {
                File file = files[i];
                if (file.length() == 0) {
                    builder.addFormDataPart(fileNames[i-1], "",
                            RequestBody.create(MediaType.parse("application/octet-stream"), file));
                } else {
                    builder.addFormDataPart(fileNames[i-1], file.getName(),
                            RequestBody.create(MEDIA_TYPE_JPG, file));
                }
            }
            requestBody = builder.build();
        }

        Request request = new Request.Builder() // okHttp post
                .url(url)
                .post(requestBody)
                .build();
        Response response = null;

        StopWatch watch = new StopWatch();
        watch.start();
        try {
            response = client.newCall(request).execute();
        } catch (IOException e) {
            logger.error("postForm interfaceName:"+interfaceName,e);
            throw new RuntimeException("请求出错", e);
        }
        watch.split();
        logger.info("处理时间：" + watch.getSplitTime() + "ms");
        watch.stop();

        if (!response.isSuccessful()) {
            try {
                logger.info(response.body().string());
            } catch (IOException e) {
                e.printStackTrace();
            }
            throw new RuntimeException("请求失败了: http response code: " + response.code());
        }
        ResponseBody body = response.body();
        String str = null;
        try {
            if (body == null) {
                throw new RuntimeException("响应 body 体为空");
            }
            str = body.string();
        } catch (Exception e) {
            throw new RuntimeException("处理响应消息过程中出错了", e);
        }
        logger.info("返回的JSON串：" + str);
        GenericResponse genericResponse = JSON.parseObject(str, GenericResponse.class);
        /** 业务处理是否成功 **/
        if (!genericResponse.isSuccess()) {
            throw new RuntimeException(genericResponse.getMessage());
        }
        if (!genericResponse.getCode().equals(SUCCESS.getCode())) {
            throw new RuntimeException(genericResponse.getMessage());
        }

        /** 响应码为 0000 需进行验签操作 **/
        String decrypted = verificationAndDecrypt(genericResponse.getData(), genericResponse.getSign(), encryptKey, signKey);
        return JSON.parseObject(decrypted, clazz);
    }

    @Override
    public String verificationAndDecrypt(String encrypted, String sign, String encryptKey, String signKey) {
        String generateSign = Disguiser.disguiseMD5(encrypted + SPLIT + signKey);
        if(!generateSign.equalsIgnoreCase(sign)){
            throw new RuntimeException("验签失败了");
        }
        String decrypted = Des3Encryption.decode(encryptKey, encrypted);
        logger.info("解密后的数据：" + decrypted);
        if (decrypted == null) {
            logger.info("加密串：" + encrypted);
            logger.info("解密秘钥：" + encryptKey);
            throw new RuntimeException("解密失败了");
        }
        return decrypted;
    }

    public static String agreementRequestForm(String interfaceName,String merchantNo,String email,String phone,String idCard,String callBackUrl,String orderNo,String body,String sign){
        Map<String,String> sPara = new HashMap<String,String>();
        sPara.put("interfaceName",interfaceName);
        sPara.put("merchantNo",merchantNo);
        sPara.put("email",email);
        sPara.put("phone",phone);
        sPara.put("orderNo",orderNo);
        sPara.put("idCard",idCard);
        sPara.put("callBackUrl",callBackUrl);
        sPara.put("body",body);
        sPara.put("sign",sign);

        StringBuffer sbHtml = new StringBuffer();
        List<String> keys = new ArrayList<String>(sPara.keySet());

        //post方式传递
        sbHtml.append("<form id=\"agreementForm\" name=\"agreementForm\" action=\"").append(IncomingBase.MERCHANT_AGREEMENT_URL).append("\" method=\"post\">");

        String name ="";
        String value ="";
        for (int i = 0; i < keys.size(); i++) {
            name=(String) keys.get(i);
            value=(String) sPara.get(name);
            if(value!=null && !"".equals(value)){
                sbHtml.append("<input type=\"hidden\" name=\"").append(name).append("\" value=\"" + value + "\"/>");
            }
        }

        //submit按钮控件请不要含有name属性
        sbHtml.append("<input type=\"submit\" value=\"提交\"></form>");
        System.out.println("sbHtml:"+sbHtml);
        return sbHtml.toString();
    }

    public static String signContractForm(String interfaceName,String merchantNo,String email,String phone,String legalPerson,String legalPersonID,String signName,String address ,String body,String sign,String callBackUrl){
        Map<String,String> sPara = new HashMap<String,String>();
        sPara.put("email", email);
        sPara.put("phone", phone);
        sPara.put("legalPerson", legalPerson);
        sPara.put("legalPersonID", legalPersonID);
        sPara.put("signName", signName);
        sPara.put("address", address);
        sPara.put("interfaceName",interfaceName);
        sPara.put("merchantNo",merchantNo);
        sPara.put("callBackUrl",callBackUrl);
        sPara.put("body",body);
        sPara.put("sign",sign);

        StringBuffer sbHtml = new StringBuffer();
        List<String> keys = new ArrayList<>(sPara.keySet());

        //post方式传递
        sbHtml.append("<form id=\"agreementForm\" name=\"agreementForm\" action=\"").append(IncomingBase.MERCHANT_SIGNCONTRACT_URL).append("\" method=\"post\">");

        String name ="";
        String value ="";
        for (int i = 0; i < keys.size(); i++) {
            name=(String) keys.get(i);
            value=(String) sPara.get(name);
            if(value!=null && !"".equals(value)){
                sbHtml.append("<input type=\"hidden\" name=\"").append(name).append("\" value=\"" + value + "\"/>");
            }
        }

        //submit按钮控件请不要含有name属性
        sbHtml.append("<input type=\"submit\" value=\"提交\"></form>");
        System.out.println("sbHtml:"+sbHtml);
        return sbHtml.toString();
    }
}
