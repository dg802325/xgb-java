package com.xgb.iterator;

import org.jsoup.Jsoup;
import org.jsoup.nodes.*;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.processor.PageProcessor;

import java.util.List;

public class RegionalCrawlerController implements PageProcessor {

    // 部分一：抓取网站的相关配置，包括编码、抓取间隔、重试次数等
    private Site site = Site.me().setRetryTimes(3).setSleepTime(1000);

    @Override
    // process是定制爬虫逻辑的核心接口，在这里编写抽取逻辑
    public void process(Page page) {
        // 部分二：定义如何抽取页面信息，并保存下来
        Document document = page.getHtml().getDocument();
        Elements allElements = document.select("tr.provincetr");
        for (Element element : allElements) {
            Elements elements = element.select("a");
            String Cyte = elements.first().childNodes().get(0).toString();
            for (Element el : elements) {
                String s = el.baseUri();
                String s1 = el.attributes().toString();
                List<Node>  pro=el.childNodes();
                String cy= pro.get(0).toString();
                System.out.println(cy);
                if(!Cyte.equals(cy)){
                    continue;
                }
            }
            System.out.println("1-----");
        }
        // 部分三：从页面发现后续的url地址来抓取

    }

    @Override
    public Site getSite() {
        return site;
    }

    public static void main(String[] args) {

        Spider.create(new RegionalCrawlerController())
                //从"https://github.com/code4craft"开始抓
                .addUrl("http://www.stats.gov.cn/tjsj/tjbz/tjyqhdmhcxhfdm/2018/")
                //开启5个线程抓取
                .thread(5)
                //启动爬虫
                .run();
    }

}
