package com.xgb.utils.Jjh;

;

import com.xgb.model.JcContentAttr1;
import com.xgb.model.JjhnjWjsysxmyeSub;
import com.xgb.util.MyTools;

import java.util.ArrayList;
import java.util.List;
/**
* @Auther: 
* @Date: 
* @Description:
*/
public class Save2404 {

    public static List<JcContentAttr1> getEntity(Integer contentId, JjhnjWjsysxmyeSub oldTable) {
        List<JcContentAttr1> lists = new ArrayList<>();
        JcContentAttr1 jc = null;

        if(MyTools.isNotEmpty(oldTable.getMingcheng())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("glfmc");
            jc.setAttrValue(oldTable.getMingcheng());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getNianchuyue1())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("je1");
            jc.setAttrValue(oldTable.getNianchuyue1().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getNianchubili1())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("zdnzyfbfb1");
            jc.setAttrValue(oldTable.getNianchubili1());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getNianmoyue1())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("je2");
            jc.setAttrValue(oldTable.getNianmoyue1().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getNianmobili1())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("zdnzyfbfb2");
            jc.setAttrValue(oldTable.getNianmobili1());lists.add(jc);}



        jc = null;

        return lists;
    }
}

