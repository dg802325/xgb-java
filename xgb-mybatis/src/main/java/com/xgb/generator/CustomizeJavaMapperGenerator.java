package com.xgb.generator;

import org.mybatis.generator.api.dom.java.CompilationUnit;
import org.mybatis.generator.codegen.mybatis3.javamapper.JavaMapperGenerator;

import java.util.List;

/**
 * ClassName:CustomizeJavaMapperGenerator <br/>
 * Date: 2019年7月26日 下午11:05:05 <br/>
 * 
 * @author 295841112@qq.com
 * @Blog http://www.lovexgb.com(域名是有了，就是不知道多会会用)
 * @version
 * @see
 */
public class CustomizeJavaMapperGenerator extends JavaMapperGenerator {

    @Override
    public List<CompilationUnit> getCompilationUnits() {
        return super.getCompilationUnits();
    }
}
