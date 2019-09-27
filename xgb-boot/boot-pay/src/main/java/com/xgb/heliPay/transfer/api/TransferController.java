package com.xgb.heliPay.transfer.api;

import com.xgb.heliPay.utils.RSA;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * @Auther: 邓根
 * @Date: 2019/9/27 19:31
 * @Description:
 */
public class TransferController extends TransferBase {

    @ResponseBody
    @PostMapping("/transferSingleForm")
    public String transferSingleForm(String P1_bizType,String P2_orderId,String P3_customerNumber,String P4_amount, String P5_summary){
        Map<String,String> sPara = new LinkedHashMap<>();
        sPara.put("P1_bizType",P1_bizType);
        sPara.put("P2_orderId",P2_orderId);
        sPara.put("P3_customerNumber",P3_customerNumber);
        sPara.put("P4_amount",P4_amount);
        sPara.put("P5_summary","结算");
        sPara.put("signType", "RSA");
        String valuepinjie = valuepinjie(sPara);
        try {
            String signp = RSA.sign(valuepinjie, RSA.getPrivateKey(signKey_setttlement));
            boolean signs = RSA.verifySign(valuepinjie, signp, RSA.getPublicKey(pubKey_setttlement));
//			System.out.println(signp);
//            System.out.println(signs);
//			String sign = RSA.sign(valuepinjie, RSA.getPrivateKey(signKey_setttlement));
            sPara.put("sign", signp);
            System.out.println("-----Sign："+signp);
        } catch (Exception e) {
            e.printStackTrace();
        }
        String response = "";
        try {
            response = getResponse(urlTransfer, sPara);
            System.out.println("-----响应："+response);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return response;
    }

    public static String valuepinjie(Map<String,String> params){
        Set<Map.Entry<String, String>> entries = params.entrySet();
        Iterator<Map.Entry<String, String>> iterator = entries.iterator();
        StringBuffer sb = new StringBuffer();
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry) iterator.next();
            String k = (String) entry.getKey();
            Object v = entry.getValue();
            if ( !"sign".equals(k) ) {
                if(null==v){
                    System.out.println("-----拼接参数："+k+"："+v);
                    sb.append("&");
                }else {
                    System.out.println("-----拼接参数："+k+":"+v);
                    sb.append("&"+v);
                }
            }
        }
        return sb.toString();
    }


    public String getResponse(String uri,Map<String,String> params) throws IOException {
        //访问准备
        URL url = null;
        url = new URL(uri);
        //post参数
        //开始访问
        StringBuilder postData = new StringBuilder();
        for (Map.Entry<String,String> param : params.entrySet()) {
            if (postData.length() != 0) postData.append('&');
            postData.append(URLEncoder.encode(param.getKey(), "UTF-8"));
            postData.append('=');
            postData.append(URLEncoder.encode(String.valueOf(param.getValue()), "UTF-8"));
        }
        byte[] postDataBytes = postData.toString().getBytes("UTF-8");

        HttpURLConnection conn = (HttpURLConnection)url.openConnection();
        conn.setRequestMethod("POST");
        conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
        conn.setRequestProperty("Content-Length", String.valueOf(postDataBytes.length));
        conn.setDoOutput(true);
        conn.getOutputStream().write(postDataBytes);

        Reader in = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));
        StringBuilder sb = new StringBuilder();
        for (int c; (c = in.read()) >= 0;)
            sb.append((char)c);
        String response = sb.toString();
        return response;
    }
}
