package com.xgb.utils.St;

import com.xgb.model.JcContentAttr1;
import com.xgb.model.StNjInner4;
import com.xgb.model.StNjReport13Sub;
import com.xgb.util.MyTools;

import java.util.ArrayList;
import java.util.List;

public class Save2186 {

    public static List<JcContentAttr1> getEntity(Integer contentId, StNjReport13Sub stNjReport13Sub) {
        List<JcContentAttr1> lists = new ArrayList<>();
        JcContentAttr1 jc = null;
        //举办方式
        if(MyTools.isNotEmpty(stNjReport13Sub.getFangshi())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("jbfs");
            jc.setAttrValue(stNjReport13Sub.getFangshi());lists.add(jc);}

        //参加人数
        if(MyTools.isNotEmpty(stNjReport13Sub.getRenshu())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("cjrs");
            jc.setAttrValue(stNjReport13Sub.getRenshu());lists.add(jc);}


        //地点
        if(MyTools.isNotEmpty(stNjReport13Sub.getDidian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("didian");
            jc.setAttrValue(stNjReport13Sub.getDidian());lists.add(jc);}

        //经费来源
        if(MyTools.isNotEmpty(stNjReport13Sub.getJinfeilaiyuan())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("jfly");
            jc.setAttrValue(stNjReport13Sub.getJinfeilaiyuan());lists.add(jc);}

        jc = null;

        return lists;
    }
}
