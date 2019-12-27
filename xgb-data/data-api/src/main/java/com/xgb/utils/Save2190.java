package com.xgb.utils;

import com.xgb.model.JcContentAttr1;
import com.xgb.model.StNjInner4;
import com.xgb.model.StNjReport16Sub1;
import com.xgb.util.MyTools;

import java.util.ArrayList;
import java.util.List;

public class Save2190 {

    public static List<JcContentAttr1> getEntity(Integer contentId, StNjReport16Sub1 stNjReport16Sub1) {
        List<JcContentAttr1> lists = new ArrayList<>();

        //批准机关
        if(MyTools.isNotEmpty(stNjReport16Sub1.getPizhunjiguan())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("jwdw");
            jc.setAttrValue(stNjReport16Sub1.getPizhunjiguan());lists.add(jc);jc=null;}

        //合作单位
        if(MyTools.isNotEmpty(stNjReport16Sub1.getHezuodanwei())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("jwhzdw");
            jc.setAttrValue(stNjReport16Sub1.getHezuodanwei());lists.add(jc);jc=null;}

        //境内
        if(MyTools.isNotEmpty(stNjReport16Sub1.getJingnei())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("jingnei");
            jc.setAttrValue(stNjReport16Sub1.getJingnei().toString());lists.add(jc);jc=null;}

        //境外
        if(MyTools.isNotEmpty(stNjReport16Sub1.getJingwai())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("jingwai");
            jc.setAttrValue(stNjReport16Sub1.getJingwai().toString());lists.add(jc);jc=null;}

        //项目类别
        if(MyTools.isNotEmpty(stNjReport16Sub1.getXiangmuleibie())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("xmfl");
            jc.setAttrValue(stNjReport16Sub1.getXiangmuleibie());lists.add(jc);jc=null;}

        //实施开始时间
        if(MyTools.isNotEmpty(stNjReport16Sub1.getShishikaishishijian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("xmsssj");
            jc.setAttrValue(stNjReport16Sub1.getShishikaishishijian().toString());lists.add(jc);jc=null;}

        //实施地
        if(MyTools.isNotEmpty(stNjReport16Sub1.getShishidi())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("xmssd");
            jc.setAttrValue(stNjReport16Sub1.getShishidi());lists.add(jc);jc=null;}

        return lists;
    }
}
