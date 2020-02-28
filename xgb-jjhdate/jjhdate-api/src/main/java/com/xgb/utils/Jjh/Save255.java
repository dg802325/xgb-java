package com.xgb.utils.Jjh;

import com.xgb.model.JcContentAttr1;
import com.xgb.model.JjhNjGmzcqkItem;
import com.xgb.util.MyTools;

import java.util.ArrayList;
import java.util.List;

;

/**
* @Auther: 
* @Date: 
* @Description:
*/
public class Save255 {

    public static List<JcContentAttr1> getEntity(Integer contentId, JjhNjGmzcqkItem oldTable) {
        List<JcContentAttr1> lists = new ArrayList<>();
        JcContentAttr1 jc = null;

        if(MyTools.isNotEmpty(oldTable.getMingcheng   ())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("title");
            jc.setAttrValue(oldTable.getMingcheng  ().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getGoumaijine  ())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("gmje");
            jc.setAttrValue(oldTable.getGoumaijine  ().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getShijishouyi        ())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("dnsjsyje");
            jc.setAttrValue(oldTable.getShijishouyi        ().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getShijishouhui      ())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("dnsjsrje");
            jc.setAttrValue(oldTable.getShijishouhui      ().toString());lists.add(jc);}



        jc = null;

        return lists;
    }
}

