package com.xgb.mybatis.service;

import com.xgb.model.Generator;
import com.xgb.model.SysDatabases;
import com.xgb.model.TableInformation;
import com.xgb.mybatis.service.impl.*;
import freemarker.template.Configuration;
import freemarker.template.TemplateExceptionHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Properties;

/**
 * 代码生成器基础项 (常量信息 & 通用方法) Created by xgb on 2019/07/26.
 */
public class CodeGeneratorManager extends CodeGeneratorConfig {

    protected static final Logger logger = LoggerFactory.getLogger(CodeGeneratorManager.class);

    private static Configuration configuration = null;

    /**
     * 获取 Freemarker 模板环境配置
     * 
     * @return
     */
    public Configuration getFreemarkerConfiguration() {
        if (configuration == null) {
            configuration = initFreemarkerConfiguration();
        }
        return configuration;
    }

    /**
     * 通过数据库表名, 生成代码 如表名为 gen_test_demo 将生成 Demo & DemoMapper & DemoService & DemoServiceImpl & DemoController
     * 
     * @param lists 表数组
     */
    public String genCode(List<TableInformation> lists, Generator generator,SysDatabases sysDatabases,String path) {
        //根据generator判断要生成的东西
            //生成Model
            if("true".equals(generator.getIsModel())){
                new ModelGenerator().genGeratorCode(lists,generator,sysDatabases,path);
            }
            //生成ModelExample
            if("true".equals(generator.getIsModelExample())){
                new ModelExampleGenerator().genGeratorCode(lists,generator,sysDatabases,path);
            }
            //生成Mapper
            if ("true".equals(generator.getIsMapper())){
                new MapperGenerator().genGeratorCode(lists,generator,sysDatabases,path);
            }
//            //生成Mapperxml
            if ("true".equals(generator.getIsMapperXml())){
                new MapperXmlGenerator().genGeratorCode(lists,generator,sysDatabases,path);
            }
//            //生成SqlMapper
            if ("true".equals(generator.getIsSqlMapper())){
                new SqlMapperGenerator().genGeratorCode(lists,generator,sysDatabases,path);
            }
//            //生成SqlMapperXml
            if ("true".equals(generator.getIsSqlMapperXml())){
                new SqlMapperXmlGenerator().genGeratorCode(lists,generator,sysDatabases,path);
            }
//            //生成Service
            if ("true".equals(generator.getIsService())){
                new ServiceGenerator().genGeratorCode(lists,generator,sysDatabases,path);
            }
//            //生成Controller
            if ("true".equals(generator.getIsController())){
                new ControllerGenerator().genGeratorCode(lists,generator,sysDatabases,path);
            }
//            //生成VueList
            if ("true".equals(generator.getIsVueList())){
                new VueListGenerator().genGeratorCode(lists,generator,sysDatabases,path);
            }

        return "success";

    }

    /**
     * Freemarker 模板环境配置
     * 
     * @return
     * @throws IOException
     */
    private Configuration initFreemarkerConfiguration() {
        Configuration cfg = null;
        try {
            cfg = new Configuration(Configuration.VERSION_2_3_23);
            cfg.setDirectoryForTemplateLoading(new File(System.getProperty("user.dir")+"/xgb-boot/boot-mybatis/src/main/resources/template"));
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
