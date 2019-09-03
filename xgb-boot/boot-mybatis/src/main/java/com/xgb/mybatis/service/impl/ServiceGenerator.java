package com.xgb.mybatis.service.impl;//package com.xgb.mybatisplus.service.impl;
//
//import com.xgb.mybatisplus.service.CodeGenerator;
//import com.xgb.mybatisplus.service.CodeGeneratorManager;
//import com.xgb.mybatisplus.util.DataUtil;
//import com.xgb.mybatisplus.util.StringUtils;
//import com.xgb.service.CodeGenerator;
//import com.xgb.service.CodeGeneratorManager;
//import com.xgb.util.DataUtil;
//import com.xgb.util.FileUtil;
//import com.xgb.util.MethodUtil;
//import com.xgb.util.StringUtils;
//import freemarker.template.Configuration;
//
//import java.io.File;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Map;
//import java.util.regex.Pattern;
//
///**
// * Service层 代码生成器 Created by xgb on 2019/07/26.
// */
//public class ServiceGenerator extends CodeGeneratorManager implements CodeGenerator {
//
//    @Override
//    public void genCode(String tableName) {
//        String modelName = StringUtils.tableNameConvertUpperCamel(tableName);
//        Configuration cfg = getFreemarkerConfiguration();
//        String customMapping = "/";
//        String modelNameUpperCamel = modelName;
//
//        Map<String, Object> data = DataUtil.getDataMapInit(tableName, modelName, modelNameUpperCamel);
//        try {
//
//            List<String> serviceMethodsList = getServiceMethods(getMapperJavaFilePath(tableName, modelName,
//            data.put("serviceMethodsList", serviceMethodsList);
//
//            // 创建 Service 接口
//            File serviceFile = new File(PROJECT_PATH + JAVA_PATH + PACKAGE_PATH_SERVICE + customMapping
//                                        + modelNameUpperCamel + "Service.java");
//            // 查看父级目录是否存在, 不存在则创建
//            if (!serviceFile.getParentFile().exists()) {
//                serviceFile.getParentFile().mkdirs();
//            }
//            cfg.getTemplate("service.ftl").process(data, new FileWriter(serviceFile));
//            logger.info(modelNameUpperCamel + "Service.java 生成成功!");
//
//        } catch (Exception e) {
//            throw new RuntimeException("Service 生成失败!", e);
//        }
//    }
//
//    private String getMapperJavaFilePath(String tableName, String modelName, String customMapping,
//                                         String modelNameUpperCamel) {
//        String path = PROJECT_PATH + JAVA_PATH + PACKAGE_PATH_MAPPER + customMapping + modelNameUpperCamel
//                      + "Mapper.java";
//        return path;
//    }
//
//    /**
//     * 从给定的Mapper及其中的方法，生成Service需要的方法
//     *
//     * @param mapperJavaFilePath
//     * @return
//     * @throws IOException
//     */
//    public static List<String> getServiceMethods(String mapperJavaFilePath, String modelName) throws IOException {
//        List<String> serviceMethodsContentList = new ArrayList<String>();
//        String methodPattern = "([^import|^package]).*;";
//        List<String> contentList = FileUtil.readFile2List(mapperJavaFilePath);
//        for (String content : contentList) {
//            boolean match = Pattern.matches(methodPattern, content);
//            if (match) {
//                // 去掉前后的空格
//                content = content.trim();
//                // 去掉后面的";"
//                content = content.substring(0, content.length() - 1);
//                String methodType = MethodUtil.getMethodReturnType(content);
//                String methodName = MethodUtil.getMethodName(content);
//                List<String> methodParamTypeList = MethodUtil.getMethodParamTypeList(content);
//                List<String> methodParanNameList = MethodUtil.getMethodParamNameList(content);
//                String mapperName = StringUtils.toLowerCaseFirstOne(modelName) + "Mapper";
//                StringBuilder methodContent = new StringBuilder();
//                methodContent.append(StringUtils.FOUR_SPACES).append("public ").append(methodType).append(" ")
//                    .append(methodName).append("(");
//                int index = 0;
//                for(String methodParamType : methodParamTypeList) {
//                    methodContent.append(MethodUtil.getMethodParamType(methodName,methodParamType,modelName));
//                    methodContent.append(" ").append(methodParanNameList.get(index));
//                    if(index<methodParamTypeList.size()-1) {
//                        methodContent.append(", ");
//                    }
//                    index++;
//                }
//                methodContent.append(")").append("{\n");
//                methodContent.append(StringUtils.FOUR_SPACES).append(StringUtils.FOUR_SPACES).append(StringUtils.FOUR_SPACES).append(StringUtils.FOUR_SPACES);
//                methodContent.append("return ").append(mapperName).append("."
//                                     + methodName).append("(").append(MethodUtil.listToString(methodParanNameList)).append(")").append(";\n");
//                methodContent.append(StringUtils.FOUR_SPACES).append(StringUtils.FOUR_SPACES).append(StringUtils.FOUR_SPACES).append("}\n");
//                serviceMethodsContentList.add(methodContent.toString());
//            }
//        }
//        return serviceMethodsContentList;
//    }
//}
