package com.xgb.service.impl;

import com.xgb.generator.CustomizeJavaMapperGenerator;
import com.xgb.service.CodeGenerator;
import com.xgb.service.CodeGeneratorManager;
import com.xgb.util.DataUtil;
import com.xgb.util.StringUtils;
import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.*;
import org.mybatis.generator.exception.InvalidConfigurationException;
import org.mybatis.generator.internal.DefaultShellCallback;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * Controller层 代码生成器 Created by xgb on 2019/07/26.
 */
public class SqlMapperXmlGenerator extends CodeGeneratorManager implements CodeGenerator {

    protected static final Logger logger        = LoggerFactory.getLogger(SqlMapperXmlGenerator.class);

    private static freemarker.template.Configuration configuration = null;

    /**
     * The primary columns of current generated table
     */
    public static List<String> primaryColumnsList = new ArrayList<String>();
    /**
     * all columns of current generated table.
     */
    public static List<String> allColumnsList = new ArrayList<String>();

    @Override
    public void genCode(String tableName) {
        String modelName = StringUtils.tableNameConvertUpperCamel(tableName);
        List<String> warnings = null;
        List<String> sqlMapperXmlModel = null;
        String sqlMapperXmlCount = null;
        freemarker.template.Configuration cfg = getFreemarkerConfiguration();
        String customMapping = "/";
        String modelNameUpperCamel = modelName;
        Map<String, Object> data = DataUtil.getDataMapInit(tableName, modelName, modelNameUpperCamel);
        try {
            sqlMapperXmlModel = getSqlMapperXmlModel(tableName, modelName, warnings);
            sqlMapperXmlCount = getSqlMapperXmlCount(tableName, modelName, warnings);
            data.put("sqlMapperXmlModel", sqlMapperXmlModel);
            data.put("tn",StringUtils.tableNameTotn(tableName));
            data.put("tableName",tableName);
            data.put("isModelNull",sqlMapperXmlCount);
            data.put("begin","#{begin}");
            data.put("end","#{end}");
            File controllerFile = new File(PROJECT_PATH + PACKAGE_MAPPER_SQL_XML_PATH + customMapping
                                           + modelNameUpperCamel + "SqlMapper.xml");
            if (!controllerFile.getParentFile().exists()) {
                controllerFile.getParentFile().mkdirs();
            }
            cfg.getTemplate("sqlMapperXml.ftl").process(data, new FileWriter(controllerFile));
            logger.info(modelNameUpperCamel + "sqlMapper.xml 生成成功!");
        } catch (Exception e) {
            throw new RuntimeException("sqlMapper.xml 生成失败!", e);
        }

    }

    /**
     * 从取得的表字段，生成SqlMapper中常用的方法
     * @param modelName
     * @param tableName
     * @param warnings
     * @return
     * @throws IOException
     */
    private List<String> getSqlMapperXmlModel(String tableName, String modelName,
                                           List<String> warnings) throws InvalidConfigurationException,
                                                                            SQLException, IOException,
            InterruptedException {
        MyBatisGenerator generator = null;
        Context initConfig = initConfig(tableName, modelName);
        org.mybatis.generator.config.Configuration cfg = new Configuration();
        cfg.addContext(initConfig);
        cfg.validate();
        DefaultShellCallback callback = new DefaultShellCallback(true);
        warnings = new ArrayList<String>();
        generator = new MyBatisGenerator(cfg, callback, warnings);
        generator.generate(null);
        try {
            Context context = cfg.getContexts().get(0);
            Field field = context.getClass().getDeclaredField("introspectedTables");
            field.setAccessible(true);
            @SuppressWarnings("unchecked")
            List<IntrospectedTable> list = (List<IntrospectedTable>)field.get(context);
            IntrospectedTable introspectedTable = list.get(0);
            List<IntrospectedColumn> allColumns = introspectedTable.getAllColumns();
            Iterator<IntrospectedColumn> iterator = allColumns.iterator();
            String tn = StringUtils.tableNameTotn(tableName);
            while (iterator.hasNext()){
                String actualColumnName = iterator.next().getActualColumnName();
                if(!iterator.hasNext()){
                    allColumnsList.add(tn+"."+ actualColumnName+" AS "+StringUtils.tableNameConvertLowerCamel(actualColumnName)+"");
                }else {
                    allColumnsList.add(tn+"."+ actualColumnName+" AS "+StringUtils.tableNameConvertLowerCamel(actualColumnName)+",");
                }
            }
            return allColumnsList;
        } catch (Exception e) {

        }
        return null;
    }

    /**
     * 从取得的表字段，生成SqlMapper中常用的判断方法
     * @param modelName
     * @param tableName
     * @param warnings
     * @return
     * @throws IOException
     */
    public String getSqlMapperXmlCount(String tableName, String modelName,
                                                      List<String> warnings) throws InvalidConfigurationException,
            SQLException, IOException,
            InterruptedException {
        MyBatisGenerator generator = null;
        Context initConfig = initConfig(tableName, modelName);
        org.mybatis.generator.config.Configuration cfg = new Configuration();
        cfg.addContext(initConfig);
        cfg.validate();
        DefaultShellCallback callback = new DefaultShellCallback(true);
        warnings = new ArrayList<String>();
        generator = new MyBatisGenerator(cfg, callback, warnings);
        generator.generate(null);
        try {
            Context context = cfg.getContexts().get(0);
            Field field = context.getClass().getDeclaredField("introspectedTables");
            field.setAccessible(true);
            @SuppressWarnings("unchecked")
            List<IntrospectedTable> list = (List<IntrospectedTable>)field.get(context);
            IntrospectedTable introspectedTable = list.get(0);
            List<IntrospectedColumn> allColumns = introspectedTable.getAllColumns();
            Iterator<IntrospectedColumn> iterator = allColumns.iterator();
            String tn = StringUtils.tableNameTotn(tableName);
            StringBuilder isModelNull = new StringBuilder();
            while (iterator.hasNext()){//<if test="status!=null and status!=''">
                IntrospectedColumn next = iterator.next();
                if(!"CREATE_TIME".equals(next.getActualColumnName())||!"UPDATE_TIME".equals(next.getActualColumnName())){
                    String actualColumnName = next.getActualColumnName();
                    isModelNull.append("\n");
                    isModelNull.append(StringUtils.FOUR_SPACES).append(StringUtils.FOUR_SPACES).append("<if test=\""+StringUtils.tableNameConvertLowerCamel(actualColumnName)+"!=null and "+StringUtils.tableNameConvertLowerCamel(actualColumnName)+"!=''\">\n");
                    isModelNull.append(StringUtils.FOUR_SPACES).append(StringUtils.FOUR_SPACES).append(StringUtils.FOUR_SPACES).append("AND "+ tn + "." + actualColumnName + " = #{" + StringUtils.tableNameConvertLowerCamel(actualColumnName) + "}\n");
                    isModelNull.append(StringUtils.FOUR_SPACES).append(StringUtils.FOUR_SPACES).append("</if>\n");
                }
            }
            isModelNull.append(StringUtils.FOUR_SPACES).append(StringUtils.FOUR_SPACES).append("order by "+ tn +".ID" +" asc");
            return isModelNull.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 完善初始化环境
     *
     * @param tableName 表名
     * @param modelName 自定义实体类名, 为null则默认将表名下划线转成大驼峰形式
     */
    private Context initConfig(String tableName, String modelName) {
        Context context = null;
        try {
            context = initMybatisGeneratorContext(MAPPER_PACKAGE);
            JavaModelGeneratorConfiguration javaModelGeneratorConfiguration = new JavaModelGeneratorConfiguration();
            javaModelGeneratorConfiguration.setTargetProject(PROJECT_PATH + JAVA_PATH);
            javaModelGeneratorConfiguration.setTargetPackage(MODEL_PACKAGE);
            context.setJavaModelGeneratorConfiguration(javaModelGeneratorConfiguration);

            JavaClientGeneratorConfiguration javaClientGeneratorConfiguration = new JavaClientGeneratorConfiguration();
            javaClientGeneratorConfiguration.setTargetProject(PROJECT_PATH + JAVA_PATH);
            javaClientGeneratorConfiguration.setTargetPackage(MAPPER_PACKAGE);
//             javaClientGeneratorConfiguration.setConfigurationType("XMLMAPPER");
//             javaClientGeneratorConfiguration.setConfigurationType("org.mybatis.generator.codegen.mybatis3.javamapper.JavaMapperGenerator");
            javaClientGeneratorConfiguration.setConfigurationType(CustomizeJavaMapperGenerator.class.getName());
            context.setJavaClientGeneratorConfiguration(javaClientGeneratorConfiguration);
            deleteExistsXmlMapperFile(tableName, modelName);

            TableConfiguration tableConfiguration = new TableConfiguration(context);
            tableConfiguration.setTableName(tableName);
            tableConfiguration.setDomainObjectName(modelName);
            tableConfiguration.setGeneratedKey(new GeneratedKey("id", "Mysql", true, null));
//            tableConfiguration.setCountByExampleStatementEnabled(true);
//             org.mybatis.generator.codegen.mybatis3.javamapper.JavaMapperGenerator
            tableConfiguration.setDeleteByExampleStatementEnabled(true);
            tableConfiguration.setSelectByExampleStatementEnabled(true);
            tableConfiguration.setUpdateByExampleStatementEnabled(true);
            context.addTableConfiguration(tableConfiguration);
        } catch (Exception e) {
            throw new RuntimeException("ModelAndMapperGenerator 初始化环境异常!", e);
        }
        return context;
    }

    private void deleteExistsXmlMapperFile(String tableName, String modelName) {
        String modelNameUpperCamel = modelName;
        String xmlMapperFilePath = PROJECT_PATH + PACKAGE_MAPPER_XML_PATH + "/" + MAPPER_PACKAGE.replaceAll("\\.", "/") + "/"
                + modelNameUpperCamel + "Mapper.xml";
        File xmlMapperFile = new File(xmlMapperFilePath);
        /**
         * delete the exists mapper file, or the content will be merged with the old when do regenerate.
         */
        if (xmlMapperFile.exists()) {
            xmlMapperFile.delete();
        }
    }



}
