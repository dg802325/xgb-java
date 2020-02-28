package com.xgb.utils.Jjh;

import com.xgb.model.JcContentAttr1;
import com.xgb.model.JjhnjJdgl;
import com.xgb.model.JjhnjJshjdgltab;
import com.xgb.util.MyTools;

import java.util.ArrayList;
import java.util.List;

;

/**
* @Auther: 
* @Date: 
* @Description:
*/
public class Save250 {

    public static List<JcContentAttr1> getEntity(Integer contentId, JjhnjJshjdgltab oldTable) {
        List<JcContentAttr1> lists = new ArrayList<>();
        JcContentAttr1 jc = null;

        if(MyTools.isNotEmpty(oldTable.getWeicanjiapinggu())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("EtCEmqQE");
            jc.setAttrValue(oldTable.getWeicanjiapinggu());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getDengji())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("LBcrwRWX");
            jc.setAttrValue(oldTable.getDengji());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getYouxiaoqikaishi ())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("LBcrwRWXyouxiaoqi1");
            jc.setAttrValue(oldTable.getYouxiaoqikaishi ());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getYouxiaoqijieshu ())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("LBcrwRWXyouxiaoqi2");
            jc.setAttrValue(oldTable.getYouxiaoqijieshu ());lists.add(jc);}



        jc = null;

        return lists;
    }
}

