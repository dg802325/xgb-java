package com.xgb;

import org.jsoup.Jsoup;
import org.jsoup.nodes.DataNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.processor.PageProcessor;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.*;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import static redis.clients.jedis.Protocol.CHARSET;

public class GithubRepoPageProcessor {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        for(int i=1;i<26;i++){
            String url = "http://111.164.113.15:8088/tjfrk/app/manager/biz/biz_list.do";
            try {
                String html = getContent(url);
                Document doc = Jsoup.parse(html);
                Elements contents = doc.select("div.sk");
                for (Element e : contents) {
                    Pattern pattern = Pattern.compile("电话");
                    Elements elementsMatchingText = e.getElementsMatchingText(pattern);
                    String text = elementsMatchingText.text();
                    strings.add(text);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        //北京市丰台方庄鹤立实验幼儿园电话：010-67603610 邮编：100078 地址：北京市丰台区方庄芳古园一区11号楼
        for (String string : strings) {
            if(!string.trim().equals("")&&string.trim()!=""&&string.trim()!=" "&&string.length()>1){
                String[] split = string.split("：");
                String t1 = split[0];
                t1 = t1.substring(0, t1.length() - 2);
                String t2 = split[1];
                t2 = t2.substring(0, t2.length() - 2);
                String t3 = split[2];
                t3 = t3.substring(0, t3.length() - 2);
                String t4 = split[3];
                t1 = "名称："+t1+"|";
                t2 = "电话："+t2+"|";
                t3 = "邮编："+t3+"|";
                System.out.print(t1);
                System.out.print(t2);
                System.out.print(t3);
                System.out.println();
            }
        }

    }

    //获取网页的内容
    public static String getContent(String strUrl) throws Exception {
        try {
            //防止没有检查到cookie，一直循环重定向
            CookieHandler.setDefault(new CookieManager(null, CookiePolicy.ACCEPT_ALL));
            URL url = new URL(strUrl);
            java.net.HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            //因为没有验证通过，导致没有跳到下一个地址，还是返回当前地址。
            //这样的结果是，相同地址不断地跳回自己，变成死循环。20次以后，就报异常了
            //java.net.ProtocolException: Server redirected too many times (20)
            conn.setInstanceFollowRedirects(false);
            BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream(), Charset.forName(CHARSET)));
            String s = "";
            StringBuffer sb = new StringBuffer("");
            while ((s = br.readLine()) != null) {
                sb.append(s);
            }

            br.close();
            return sb.toString();
        } catch (Exception e) {
            System.out.println("can't open url:"+strUrl);
            throw e;
        }
    }
}
