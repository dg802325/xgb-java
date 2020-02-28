package com.xgb.utils.Jjh;

;

import com.xgb.model.JcContentAttr1;
import com.xgb.model.JjhnjWtlcTest002;
import com.xgb.model.JjhnjWtlcTest002Sub;
import com.xgb.util.MyTools;

import java.util.ArrayList;
import java.util.List;
/**
* @Auther: 
* @Date: 
* @Description:
*/
public class Save260 {

    public static List<JcContentAttr1> getEntity(Integer contentId, JjhnjWtlcTest002Sub oldTable) {
        List<JcContentAttr1> lists = new ArrayList<>();
        JcContentAttr1 jc = null;

        if(MyTools.isNotEmpty(oldTable.getShoutuoren())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("title");
            jc.setAttrValue(oldTable.getShoutuoren());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getIszizhi  ())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("sfzzzgjn");
            jc.setAttrValue(oldTable.getIszizhi  ().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getWeituojine())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("wtje");
            jc.setAttrValue(oldTable.getWeituojine().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getWeituoqixian   ())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("wtqx");
            jc.setAttrValue(oldTable.getWeituoqixian   ());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getBaochou())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("syqdfs");
            jc.setAttrValue(oldTable.getBaochou());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getShijishouyi ())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("dnsjsrje");
            jc.setAttrValue(oldTable.getShijishouyi ());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getShouhuijine ())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("dnsjshqe");
            jc.setAttrValue(oldTable.getShouhuijine ().toString());lists.add(jc);}



        jc = null;

        return lists;
    }
}

