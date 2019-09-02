package com.xgb.mybatisplus.service;

/**
 * 配置信息变量
 * Created by xgb on 2019/07/26.
 */
public class CodeGeneratorConfig {
	// 项目在硬盘上的基础路径
	public static final String PROJECT_PATH = System.getProperty("user.dir");
	// java文件路径
	public static String JAVA_PATH;

	// 模板存放位置
	public static String TEMPLATE_FILE_PATH = "";
	
	// 项目 Model 所在包
	public static String MODEL_PACKAGE;
	// 项目 Mapper 所在包
	public static String MAPPER_PACKAGE;
	// 项目 Service 所在包
	public static String SERVICE_PACKAGE;
	// 项目 Controller 所在包
	public static String CONTROLLER_PACKAGE;
	// 项目 中 公共 Common工具包位置
	public static String MY_COMMON_PATH;
	
	// 生成的 Service 存放路径
	public static String PACKAGE_PATH_SERVICE;
	// 生成的 Controller 存放路径
	public static String PACKAGE_PATH_CONTROLLER;
	// 生成的 Mapper 存放路径
	public static String PACKAGE_PATH_MAPPER;
	// sqlmapper.java文件路径
	public static String PACKAGE_MAPPER_XML_PATH;
	// sqlmapper.xml文件路径
	public static String PACKAGE_MAPPER_SQL_XML_PATH;
	
	// 模板注释中 @author
	public static String AUTHOR;
	// 模板注释中 @date
	public static String DATE;
	
}
