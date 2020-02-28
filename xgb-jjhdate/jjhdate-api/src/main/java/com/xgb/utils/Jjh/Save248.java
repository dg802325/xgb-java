package com.xgb.utils.Jjh;

import com.xgb.model.JcContentAttr1;
import com.xgb.model.JjhnjYszkSub;
import com.xgb.util.MyTools;

import java.util.ArrayList;
import java.util.List;

;

/**
* @Auther: 
* @Date: 
* @Description:
*/
public class Save248 {

    public static List<JcContentAttr1> getEntity(Integer contentId, JjhnjYszkSub oldTable) {
        List<JcContentAttr1> lists = new ArrayList<>();
        JcContentAttr1 jc = null;

        if(MyTools.isNotEmpty(oldTable.getXiangmu    ())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("title");
            jc.setAttrValue(oldTable.getXiangmu    ());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getNianchuyue      ())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("nzmye");
            jc.setAttrValue(oldTable.getNianchuyue      ().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getZengjiae    ())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("bjzje");
            jc.setAttrValue(oldTable.getZengjiae    ().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getJianshaoe())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("bnjse");
            jc.setAttrValue(oldTable.getJianshaoe().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getNianmoyue    ())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("nmzmye");
            jc.setAttrValue(oldTable.getNianmoyue    ().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getKehu  ())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("khmc");
            jc.setAttrValue(oldTable.getKehu  ());lists.add(jc);}



        jc = null;

        return lists;
    }
}

