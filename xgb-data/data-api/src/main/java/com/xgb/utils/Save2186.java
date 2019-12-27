package com.xgb.utils;

import com.xgb.model.JcContentAttr1;
import com.xgb.model.StNjInner4;
import com.xgb.model.StNjReport13Sub;
import com.xgb.util.MyTools;

import java.util.ArrayList;
import java.util.List;

public class Save2186 {

    public static List<JcContentAttr1> getEntity(Integer contentId, StNjReport13Sub stNjReport13Sub) {
        List<JcContentAttr1> lists = new ArrayList<>();

        //举办方式
        if(MyTools.isNotEmpty(stNjReport13Sub.getFangshi())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("jbfs");
            jc.setAttrValue(stNjReport13Sub.getFangshi());lists.add(jc);jc=null;}

        //参加人数
        if(MyTools.isNotEmpty(stNjReport13Sub.getRenshu())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("cjrs");
            jc.setAttrValue(stNjReport13Sub.getRenshu());lists.add(jc);jc=null;}


        //地点
        if(MyTools.isNotEmpty(stNjReport13Sub.getDidian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("didian");
            jc.setAttrValue(stNjReport13Sub.getDidian());lists.add(jc);jc=null;}

        //经费来源
        if(MyTools.isNotEmpty(stNjReport13Sub.getJinfeilaiyuan())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("jfly");
            jc.setAttrValue(stNjReport13Sub.getJinfeilaiyuan());lists.add(jc);jc=null;}

        return lists;
    }
}
