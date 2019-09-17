//package com.xgb.comtroller;
//
//import org.jsoup.Jsoup;
//import org.jsoup.nodes.Document;
//import org.jsoup.nodes.Element;
//import org.jsoup.select.Elements;
//import us.codecraft.webmagic.Page;
//import us.codecraft.webmagic.Site;
//import us.codecraft.webmagic.Spider;
//import us.codecraft.webmagic.processor.PageProcessor;
//import us.codecraft.webmagic.processor.example.GithubRepoPageProcessor;
//
//import java.util.List;
//
//public class RegionalCrawlerController implements PageProcessor {
//
//    // 部分一：抓取网站的相关配置，包括编码、抓取间隔、重试次数等
//    private Site site = Site.me().setRetryTimes(3).setSleepTime(1000);
//
//    @Override
//    // process是定制爬虫逻辑的核心接口，在这里编写抽取逻辑
//    public void process(Page page) {
//    // 部分二：定义如何抽取页面信息，并保存下来
////        page.addTargetRequests(page.getHtml().links().regex("tr.").all());
//        List<String> all = page.getHtml().css("tr.provincetr").all();
//        for(String s :all){
//            Document doc = Jsoup.parse(s);
//            Elements allElements = doc.getAllElements();
//            Element body = doc.getElementById("body");
//
//            for (Element element : allElements) {
//                System.out.println(element);
//                Element a = element.getElementById("a");
//            }
//        }
//
//        // 部分三：从页面发现后续的url地址来抓取
////        page.addTargetRequests(page.getHtml().links().regex("(https://github\\.com/[\\w\\-]+/[\\w\\-]+)").all());
//    }
//
//    @Override
//    public Site getSite() {
//        return site;
//    }
//
//    public static void main(String[] args) {
//
//        Spider.create(new RegionalCrawlerController())
//                //从"https://github.com/code4craft"开始抓
//                .addUrl("http://www.stats.gov.cn/tjsj/tjbz/tjyqhdmhcxhfdm/2018/")
//                //开启5个线程抓取
//                .thread(5)
//                //启动爬虫
//                .run();
//    }
//}
