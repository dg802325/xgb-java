package com.xgb.utils.Jjh;

;

import com.xgb.model.JcContentAttr1;
import com.xgb.model.JjhnjJjhyglfjySub;
import com.xgb.util.MyTools;

import java.util.ArrayList;
import java.util.List;
/**
* @Auther: 
* @Date: 
* @Description:
*/
public class Save2402 {

    public static List<JcContentAttr1> getEntity(Integer contentId, JjhnjJjhyglfjySub oldTable) {
        List<JcContentAttr1> lists = new ArrayList<>();
        JcContentAttr1 jc = null;

        if(MyTools.isNotEmpty(oldTable.getGuanlianfang())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("glf");
            jc.setAttrValue(oldTable.getGuanlianfang());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getTigongjine())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("tgje");
            jc.setAttrValue(oldTable.getTigongjine().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getTigongyue())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("tgye");
            jc.setAttrValue(oldTable.getTigongyue().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getGoumaijine())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("gmje");
            jc.setAttrValue(oldTable.getGoumaijine().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getGoumaiyue())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("gmye");
            jc.setAttrValue(oldTable.getGoumaiyue().toString());lists.add(jc);}



        jc = null;

        return lists;
    }
}

