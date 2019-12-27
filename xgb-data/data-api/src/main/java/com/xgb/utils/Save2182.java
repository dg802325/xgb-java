package com.xgb.utils;

import com.xgb.model.JcContentAttr1;
import com.xgb.model.JjhnjGyhdmxSub;
import com.xgb.util.MyTools;

import java.util.ArrayList;
import java.util.List;

public class Save2182 {

    public static List<JcContentAttr1> getEntity(Integer contentId, JjhnjGyhdmxSub jjhnjGyhdmxSub) {
        List<JcContentAttr1> lists = new ArrayList<>();

        //购买主体
        if(MyTools.isNotEmpty(jjhnjGyhdmxSub.getJianshu())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("gmzt");
            jc.setAttrValue(jjhnjGyhdmxSub.getJianshu());lists.add(jc);jc=null;}

        //自
        if(MyTools.isNotEmpty(jjhnjGyhdmxSub.getZi())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("xmzqsj1");
            jc.setAttrValue(jjhnjGyhdmxSub.getZi());lists.add(jc);jc=null;}

        //至
        if(MyTools.isNotEmpty(jjhnjGyhdmxSub.getZhi())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("xmzqsj2");
            jc.setAttrValue(jjhnjGyhdmxSub.getZhi());lists.add(jc);jc=null;}

        //项目资金
        if(MyTools.isNotEmpty(jjhnjGyhdmxSub.getZhichu())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("xmzj");
            jc.setAttrValue(jjhnjGyhdmxSub.getZhichu().toString());lists.add(jc);jc=null;}

        return lists;
    }
}
