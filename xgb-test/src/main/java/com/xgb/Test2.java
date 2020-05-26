package com.xgb;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class Test2 {


    public static void main(String[] args) {
        try{
            PrintWriter out = null;
            Map<String, String> param = new HashMap<>();
            param.put("cid","103");
            param.put("history","0");
            param.put("pageNo","1");
            String path = "http://111.164.113.15:8088/tjfrk/app/manager/biz/biz_list.do";
            URL url = new URL(path);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("POST");
        /*con.setRequestProperty("Content-Type",
                "application/x-www-form-urlencoded");
        con.setRequestProperty("Content-Length",
                String.valueOf(path.length()));*/
            con.setRequestProperty(
                    "User-Agent",
                    "Mozilla/5.0 (Windows NT 6.1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/38.0.2125.104 Safari/537.36");
            con.setRequestProperty("Cookie", "admin_tjfrk_8=yUfaXGFk; wangshuai=ZJ%24%5Eh7u2%26chX%23Zt3; 49BAC005-7D5B-4231-8CEA-16939BEACD67=admin_tjfrk_8; JSESSIONID=7E5BEFF51185D80E396ADFE0304C7382; _site_id_cookie=2; clientlanguage=zh_CN");
            con.setDoOutput(true);
            con.setDoInput(true);
            out = new PrintWriter(con.getOutputStream());
            // 发送请求参数
            out.print(getParam(param));

            con.connect();
            if (con.getResponseCode() == 200) {

                BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
                String line;
                StringBuilder sb = new StringBuilder();
                while ((line = br.readLine()) != null) {// 循环读取流
                    sb.append(line);
                }
                br.close();// 关闭流
                System.out.println(sb);
            }else{
                System.out.println(con.getResponseCode());
            }
            con.disconnect();// 断开连接
        }catch (Exception e){

            System.out.println(e);
        }
    }

    /**
     * 将参数以 key=123&v=456 返回
     * @param param
     * @return
     */
    public static String getParam(Map<String,String> param){
        StringBuilder str=new StringBuilder();
        int size=0;
        for (Map.Entry<String, String> m :param.entrySet())  {
            str.append(m.getKey());
            str.append("=");
            str.append(m.getValue());
            if(size<param.size()-1){
                str.append("&");
            }
            size++;
        }
        System.out.println(str.toString());
        return str.toString();
    }

}
