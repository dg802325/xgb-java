package com.xgb.utils.St;

import com.xgb.model.JcContentAttr1;
import com.xgb.model.StNjInner4;
import com.xgb.model.StNjReport16Sub1;
import com.xgb.util.MyTools;

import java.util.ArrayList;
import java.util.List;

public class Save2190 {

    public static List<JcContentAttr1> getEntity(Integer contentId, StNjReport16Sub1 stNjReport16Sub1) {
        List<JcContentAttr1> lists = new ArrayList<>();
        JcContentAttr1 jc = null;
        //批准机关
        if(MyTools.isNotEmpty(stNjReport16Sub1.getPizhunjiguan())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("jwdw");
            jc.setAttrValue(stNjReport16Sub1.getPizhunjiguan());lists.add(jc);}

        //合作单位
        if(MyTools.isNotEmpty(stNjReport16Sub1.getHezuodanwei())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("jwhzdw");
            jc.setAttrValue(stNjReport16Sub1.getHezuodanwei());lists.add(jc);}

        //境内
        if(MyTools.isNotEmpty(stNjReport16Sub1.getJingnei())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("jingnei");
            jc.setAttrValue(stNjReport16Sub1.getJingnei().toString());lists.add(jc);}

        //境外
        if(MyTools.isNotEmpty(stNjReport16Sub1.getJingwai())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("jingwai");
            jc.setAttrValue(stNjReport16Sub1.getJingwai().toString());lists.add(jc);}

        //项目类别
        if(MyTools.isNotEmpty(stNjReport16Sub1.getXiangmuleibie())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("xmfl");
            jc.setAttrValue(stNjReport16Sub1.getXiangmuleibie());lists.add(jc);}

        //实施开始时间
        if(MyTools.isNotEmpty(stNjReport16Sub1.getShishikaishishijian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("xmsssj");
            jc.setAttrValue(stNjReport16Sub1.getShishikaishishijian().toString());lists.add(jc);}

        //实施地
        if(MyTools.isNotEmpty(stNjReport16Sub1.getShishidi())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("xmssd");
            jc.setAttrValue(stNjReport16Sub1.getShishidi());lists.add(jc);}

        jc = null;

        return lists;
    }
}
