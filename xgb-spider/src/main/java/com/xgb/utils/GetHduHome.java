package com.xgb.utils;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class GetHduHome {

    public void loadPage(String path) throws Exception{
        //创建客户端
        CloseableHttpClient httpClient = HttpClientBuilder.create().build();
        HttpGet httpGet = new HttpGet(path);
        String fileName = "d:/hduhome.html";
        OutputStream fout = null;
        //获取页面请求
        HttpResponse response = httpClient.execute(httpGet);
        int statusCode = response.getStatusLine().getStatusCode();
        //对状态码进行处理
        if(statusCode == HttpStatus.SC_OK){
            HttpEntity resEntity = response.getEntity();
            //获取页面html数据
            byte[] pageContext = EntityUtils.toByteArray(resEntity);
            //写入到文件
            fout = new FileOutputStream(fileName);
            fout.write(pageContext);
        }
        if(fout != null)
            fout.close();
        httpGet.abort();

    }

    public static void main(String[] args) {
        //抓取"http://acm.hdu.edu.cn"页面
        GetHduHome hduHome = new GetHduHome();
        String path = "http://acm.hdu.edu.cn";
        try {
            hduHome.loadPage(path);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
