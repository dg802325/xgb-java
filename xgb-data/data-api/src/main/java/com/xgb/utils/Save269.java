package com.xgb.utils;

import com.xgb.model.JcContentAttr1;
import com.xgb.model.LsCybaZb;
import com.xgb.model.StNjInner4;
import com.xgb.util.DateUtils;
import com.xgb.util.MyTools;

import java.util.ArrayList;
import java.util.List;

public class Save269 {

    public static List<JcContentAttr1> getEntity(Integer contentId, LsCybaZb lsCybaZb) {
        List<JcContentAttr1> lists = new ArrayList<>();

        //出生年月
        if(MyTools.isNotEmpty(lsCybaZb.getChushengnianyue())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("csny");
            jc.setAttrValue(DateUtils.dateToyyyyMMdd(lsCybaZb.getChushengnianyue()));lists.add(jc);jc=null;}

        //内职务
        if(MyTools.isNotEmpty(lsCybaZb.getNeizhiwu())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("mfzwnzw");
            jc.setAttrValue(lsCybaZb.getNeizhiwu());lists.add(jc);jc=null;}

        //理事
        if(MyTools.isNotEmpty(lsCybaZb.getLishi())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("lsjs");
            jc.setAttrValue(lsCybaZb.getLishi());lists.add(jc);jc=null;}

        //及职务
        if(MyTools.isNotEmpty(lsCybaZb.getJizhiwu())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("zw1");
            jc.setAttrValue(lsCybaZb.getJizhiwu());lists.add(jc);jc=null;}

        //签字
        if(MyTools.isNotEmpty(lsCybaZb.getQianzi())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("brqm");
            jc.setAttrValue(lsCybaZb.getQianzi());lists.add(jc);jc=null;}

        return lists;
    }
}
