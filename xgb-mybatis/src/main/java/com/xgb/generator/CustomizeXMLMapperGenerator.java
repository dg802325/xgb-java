package com.xgb.generator;

import org.mybatis.generator.api.dom.xml.XmlElement;
import org.mybatis.generator.codegen.mybatis3.xmlmapper.XMLMapperGenerator;

/** 
 * ClassName:CustomizeXMLMapperGenerator <br/> 
 * Date: 2019年7月26日 下午11:05:05 <br/>
 * @author   @author 295841112@qq.com
 * @Blog     http://www.lovexgb.com(域名是有了，就是不知道多会会用。。。。)
 * @version  
 * @see       
 */
public class CustomizeXMLMapperGenerator extends XMLMapperGenerator{
    public CustomizeXMLMapperGenerator() {
        super();
    }
    @Override
    protected XmlElement getSqlMapElement() {
        return super.getSqlMapElement();
    }
}
