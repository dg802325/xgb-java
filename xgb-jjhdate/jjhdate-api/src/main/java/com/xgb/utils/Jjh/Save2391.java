package com.xgb.utils.Jjh;

;

import com.xgb.model.JcContentAttr1;
import com.xgb.model.JjhNjCsxt;
import com.xgb.util.MyTools;

import java.util.ArrayList;
import java.util.List;
/**
* @Auther: 
* @Date: 
* @Description:
*/
public class Save2391 {

    public static List<JcContentAttr1> getEntity(Integer contentId, JjhNjCsxt oldTable) {
        List<JcContentAttr1> lists = new ArrayList<>();
        JcContentAttr1 jc = null;

        if(MyTools.isNotEmpty(oldTable.getMingcheng())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("csxtmc");
            jc.setAttrValue(oldTable.getMingcheng());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getXintuotaiwuyue())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("xtcwye");
            jc.setAttrValue(oldTable.getXintuotaiwuyue().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getWietuo())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("wtf");
            jc.setAttrValue(oldTable.getWietuo());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getYongtu())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("yt");
            jc.setAttrValue(oldTable.getYongtu());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getGongtongshoutuofang())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("gtstf");
            jc.setAttrValue(oldTable.getGongtongshoutuofang());lists.add(jc);}



        jc = null;

        return lists;
    }
}

