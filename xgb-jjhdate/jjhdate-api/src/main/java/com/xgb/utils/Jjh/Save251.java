package com.xgb.utils.Jjh;

import com.xgb.model.JcContentAttr1;
import com.xgb.model.JjhnjJshjdgltab;
import com.xgb.util.DateUtils;
import com.xgb.util.MyTools;

import java.util.ArrayList;
import java.util.List;

;

/**
* @Auther: 
* @Date: 
* @Description:
*/
public class Save251 {

    public static List<JcContentAttr1> getEntity(Integer contentId, JjhnjJshjdgltab oldTable) {
        List<JcContentAttr1> lists = new ArrayList<>();
        JcContentAttr1 jc = null;

        if(MyTools.isNotEmpty(oldTable.getShifouqu())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("AcGpgAZo");
            jc.setAttrValue(oldTable.getShifouqu().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getYouhuishijian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("qPmpcvki");
            jc.setAttrValue(DateUtils.dateToyyyyMMdd(oldTable.getYouhuishijian()));lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getPizhuibumen())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("wmgNHKcG");
            jc.setAttrValue(oldTable.getPizhuibumen ());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getYouxiaoqijieshu ())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("LBcrwRWXyouxiaoqi2");
            jc.setAttrValue(oldTable.getYouxiaoqijieshu ());lists.add(jc);}



        jc = null;

        return lists;
    }
}

