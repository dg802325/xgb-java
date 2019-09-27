package com.xgb.service;

import com.xgb.pojo.CrawlResultPojo;
import com.xgb.pojo.UrlPojo;

public interface ICrawler {
	public CrawlResultPojo crawl(UrlPojo urlPojo);
}
