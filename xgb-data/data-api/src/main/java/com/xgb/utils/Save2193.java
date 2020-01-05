package com.xgb.utils;

import com.xgb.model.JcContentAttr1;
import com.xgb.model.StNjInner4;
import com.xgb.model.StNjReport17Sub1;
import com.xgb.model.StNjReport17Sub2;
import com.xgb.util.MyTools;

import java.util.ArrayList;
import java.util.List;

public class Save2193 {

    public static List<JcContentAttr1> getEntity(Integer contentId, StNjReport17Sub2 stNjReport17Sub2) {
        List<JcContentAttr1> lists = new ArrayList<>();

        //出访开始时间
        if(MyTools.isNotEmpty(stNjReport17Sub2.getChufangkaishishijian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("cfsj");
            jc.setAttrValue(stNjReport17Sub2.getChufangkaishishijian().toString());lists.add(jc);jc=null;}

        //出访人数
        if(MyTools.isNotEmpty(stNjReport17Sub2.getChufangrenshu())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("cfrs");
            jc.setAttrValue(stNjReport17Sub2.getChufangrenshu().toString());lists.add(jc);jc=null;}

        //出访目的
        if(MyTools.isNotEmpty(stNjReport17Sub2.getChufangmude())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("cfmd");
            jc.setAttrValue(stNjReport17Sub2.getChufangmude());lists.add(jc);jc=null;}

        //经费来源
        if(MyTools.isNotEmpty(stNjReport17Sub2.getJingfeilaiyuan())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("jfly");
            jc.setAttrValue(stNjReport17Sub2.getJingfeilaiyuan());lists.add(jc);jc=null;}

        //境外邀请单位名称
        if(MyTools.isNotEmpty(stNjReport17Sub2.getJingwaiyaoqingdanweimingcheng())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("jwyqdw");
            jc.setAttrValue(stNjReport17Sub2.getJingwaiyaoqingdanweimingcheng());lists.add(jc);jc=null;}

        //批准机关
        if(MyTools.isNotEmpty(stNjReport17Sub2.getPizhunjiguan())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("pzjg");
            jc.setAttrValue(stNjReport17Sub2.getPizhunjiguan());lists.add(jc);jc=null;}



        return lists;
    }
}
