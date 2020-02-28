package com.xgb.utils.Jjh;

;

import com.xgb.model.JcContentAttr1;
import com.xgb.model.JjhnjJshjdglSub;
import com.xgb.util.DateUtils;
import com.xgb.util.MyTools;

import java.util.ArrayList;
import java.util.List;
/**
* @Auther: 
* @Date: 
* @Description:
*/
public class Save252 {

    public static List<JcContentAttr1> getEntity(Integer contentId, JjhnjJshjdglSub oldTable) {
        List<JcContentAttr1> lists = new ArrayList<>();
        JcContentAttr1 jc = null;

        if(MyTools.isNotEmpty(oldTable.getChufazhonglei   ())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("xzcfzl");
            jc.setAttrValue(oldTable.getChufazhonglei   ());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getChufashishijiguan())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("xzcfssjg");
            jc.setAttrValue(oldTable.getChufashishijiguan());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getChufashijian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("xzcfsj");
            jc.setAttrValue(DateUtils.dateToyyyyMMdd(oldTable.getChufashijian()));lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getWeifaxingwei ())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("wfxw");
            jc.setAttrValue(oldTable.getWeifaxingwei ());lists.add(jc);}



        jc = null;

        return lists;
    }
}

