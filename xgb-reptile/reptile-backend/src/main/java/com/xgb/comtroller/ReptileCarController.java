package com.xgb.comtroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.pipeline.ConsolePipeline;
import us.codecraft.webmagic.processor.PageProcessor;
import us.codecraft.webmagic.processor.example.GithubRepoPageProcessor;
import us.codecraft.webmagic.selector.Selectable;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
* @Auther: Mr Deng
* @Date: 2019-09-08 00:29:04
* @Description:
*/
public class ReptileCarController implements PageProcessor {

    private Site site = Site.me().setRetryTimes(3).setSleepTime(1000);

    @Override
    public Site getSite() {
        return site;
    }

    /**
     * 内容分析逻辑
     * 工具：1、正则表达式
     * 	   2、cssStyle
     *     3、Jsoup
     *     4、Xpath
     */
    @Override
    public void process(Page page) {
        //电影详情链接movieLink的正则表达式
        String movieLinkReg="/html/gndy/\\w{4}/\\d{8}/\\d{5}.html";
        Pattern movieLinkPattern=Pattern.compile(movieLinkReg);
        //写相应的xpath
        String movieNameXpath="//title/text()";
        String movieDownloadXpath="//a[starts-with(@href,'ftp')]/text()";
        String movieLinkXpath="//div[@class='co_content2']/ul/a[@href]";
        List<String> movieLinkList=new ArrayList<String>();
        //结果抽取
        Selectable moviePage;
        Selectable movieNameS;
        Selectable movieDownloadS;
        if("http://www.dytt8.net".equals(page.getUrl().toString())){
            //抽取结果
            moviePage=page.getHtml().xpath(movieLinkXpath);
            //选中结果
            movieLinkList=moviePage.all();
            //循环遍历
            String movieLink="";
            Matcher movieLinkMatcher;
            for(int i=1;i<10;i++){
                //第一条过滤，从第二条开始遍历
                movieLinkList.get(i);
                //正则匹配
                movieLinkMatcher=movieLinkPattern.matcher(movieLink);
                if(movieLinkMatcher.find()){//匹配子串
                    movieLink=movieLinkMatcher.group();//返回匹配到的字串
                    //将找到的链接放到ddTargetRequest里面，会自动发起请求
                    page.addTargetRequest(movieLink);
                    //输出到控制台
                    System.out.println(movieLink);
                }
            }
        }else{//第二次请求，电影详情页面
            //获取html
            movieNameS=page.getHtml().xpath(movieNameXpath);
            movieDownloadS=page.getHtml().xpath(movieDownloadXpath);
            page.putField("movieName",page.getHtml().xpath("//title/text()").toString());
            page.putField("downloadURL", page.getHtml().xpath("//a[starts-with(@href,'ftp')]/text()").toString());

        }
        movieLinkList.clear();
    }

    /**
     * 1、网络请求
     * 2、内容分析及抽取
     * @param args
     */
    public static void main(String[] args) {
        //爬取的路径URL---1个线程去执行
//        Spider.create(new InfoByWebMagic()).addUrl("http://www.dytt8.net").thread(1).run();
        //或者--也是输出到控制台
        Spider.create(new ReptileCarController()).addUrl("http://www.dytt8.net").addPipeline(new ConsolePipeline()).run();
    }

}
