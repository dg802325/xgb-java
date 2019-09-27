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
public class TransferBase {

    //测试地址
    public static final String urlTransfer="http://test.trx.helipay.com/trx/transfer/interface.action";
    //生产地址
//    public static final String urlTransfer="http://transfer.trx.helipay.com/trx/transfer/interface.action";

    public static final String pubKey_setttlement = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCzJtue+U0Ogn93Gk+4Nh+FrESWOcmlsh1yn6hA4T6ikXBfdupqg66M0dovr1ZbcK6MvXaJWG8DPh55x2QkBcpMO4YW44ywMyK4FUy4p/bxz9yJ5epWVNDyQ4UlMX8WcEKyJGB9DIPUKA1gXRvtSzn0nqonU7Du32vioTlYISogGwIDAQAB" ; // RSA 公钥
    public static final String signKey_setttlement = "MIICdgIBADANBgkqhkiG9w0BAQEFAASCAmAwggJcAgEAAoGBALMm2575TQ6Cf3caT7g2H4WsRJY5yaWyHXKfqEDhPqKRcF926mqDrozR2i+vVltwroy9dolYbwM+HnnHZCQFykw7hhbjjLAzIrgVTLin9vHP3Inl6lZU0PJDhSUxfxZwQrIkYH0Mg9QoDWBdG+1LOfSeqidTsO7fa+KhOVghKiAbAgMBAAECgYA2urc7MKPmu90e0I3sE7S7jG4DirHcibZPTxECiQ0ucsnmkBh647GOWYmTKbhzBNB+NF8jBD4duntq7ovcKVysPAnccqujRMW6SgPJmvNPHmbrenA8Hu4P+yp5/+lbNf4v/PLupGs4HAWZwrPJqZzrF46qNLRcnmY1HZdNVFUzAQJBAOahx+DyBN1aleWU/7gaG5yi8xlLMPklqApAQikLqjy4nKZcVRsHKexzJHFlIjBfT1opg/BGQqO1Z66jgTPK8YECQQDG23rMIdzNFJ8+DOlTIDverfydPQB3ekEq+wrR4tFWsoczlivQKrwRJ541EEgtlDiM0E03A7LIdPSM7Tyfn2ebAkEAt1awUC/UkiqqsoEJ785BWPloixjs64J13QBMF9kAEZkoXk9UEFJXj3HQ7Jva291IdYI/MkiIPR++NmQgF44jAQJAOOn2QlhqvpNpZDQDz5PJLtlzFHmyGX/3CNsi5KFbMsoT4hLX5VNl0i8Zm6xWTB1A9iRkBRvc3nyCxZbco/7WgwJAEsmdLyuPpcyWWOmSNmDYZ2XPtEdMbOqD4EKFe0quhmDIw8zd07UoSPuV+wjqUvoikDotY3PFRDOujv0OK0zKAQ==" ; // RSA 私钥


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
