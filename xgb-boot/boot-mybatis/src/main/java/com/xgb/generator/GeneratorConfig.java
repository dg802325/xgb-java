package com.xgb.generator;

import freemarker.template.Configuration;
import freemarker.template.TemplateExceptionHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;

import java.io.File;
import java.io.IOException;

/**
 * 配置信息变量
 * Created by xgb on 2019/07/26.
 */
public class GeneratorConfig {

	public Logger logger = LoggerFactory.getLogger(getClass());

	public static final String PROJECT_PATH = System.getProperty("user.dir");

	public static final String SLASH = "/";

	private static Configuration configuration = null;

	@Value("$template.path")
	private static String templatePath;

	/**
	 * 获取 Freemarker 模板环境配置
	 *
	 * @return
	 */
	public static Configuration getFreemarkerConfiguration() {
		if (configuration == null) {
			configuration = initFreemarkerConfiguration();
		}
		return configuration;
	}

	/**
	 * Freemarker 模板环境配置
	 *
	 * @return
	 * @throws IOException
	 */
	private static Configuration initFreemarkerConfiguration() {
		Configuration cfg = null;
		try {
			cfg = new Configuration(Configuration.VERSION_2_3_23);
			cfg.setDirectoryForTemplateLoading(new File(PROJECT_PATH+templatePath));
			cfg.setDefaultEncoding("UTF-8");
			cfg.setTemplateExceptionHandler(TemplateExceptionHandler.IGNORE_HANDLER);
		} catch (IOException e) {
			throw new RuntimeException("Freemarker 模板环境初始化异常!", e);
		}
		return cfg;
	}

	/**
	 * 包转成路径 eg: com.bigsea.sns ==> com/bigsea/sns
	 *
	 * @param packageName
	 * @return
	 */
	private static String packageConvertPath(String packageName) {
		return String.format("/%s/", packageName.contains(".") ? packageName.replaceAll("\\.", "/") : packageName);
	}
}
