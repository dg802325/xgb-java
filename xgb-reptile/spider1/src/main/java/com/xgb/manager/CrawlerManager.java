package com.xgb.manager;


import com.xgb.pojo.CrawlResultPojo;
import com.xgb.pojo.UrlPojo;
import com.xgb.service.ICrawler;
import com.xgb.serviceImpl.HttpUrlConnectionCrawlerImpl;
import com.xgb.serviceImpl.SocketCrawlerImpl;

/**
 *
 * @author zel
 * 
 */
public class CrawlerManager {
	private ICrawler crawler;

	public CrawlerManager(boolean isSocket) {
		if (isSocket) {
			this.crawler = new SocketCrawlerImpl();
		} else {
			this.crawler = new HttpUrlConnectionCrawlerImpl();
		}
	}

	public CrawlResultPojo crawl(UrlPojo urlPojo) {
		return this.crawler.crawl(urlPojo);
	}

	public static void main(String[] args) {
		CrawlerManager crawlerManager = new CrawlerManager(false);
		UrlPojo urlPojo = new UrlPojo("http://www.qq.com");
		CrawlResultPojo crawlResultPojo=crawlerManager.crawl(urlPojo);
		
		System.out.println("CrawlResultPojo---"+crawlResultPojo.getPageContent());
		
	}

}
