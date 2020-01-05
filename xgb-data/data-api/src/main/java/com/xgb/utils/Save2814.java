package com.xgb.utils;

import com.xgb.model.JcContentAttr1;
import com.xgb.model.StNjInner4;
import com.xgb.model.StNjReprot140Sub;
import com.xgb.util.MyTools;

import java.util.ArrayList;
import java.util.List;

public class Save2814 {

    public static List<JcContentAttr1> getEntity(Integer contentId, StNjReprot140Sub stNjReprot140Sub) {
        List<JcContentAttr1> lists = new ArrayList<>();

        //时间
        if(MyTools.isNotEmpty(stNjReprot140Sub.getShijian())&&MyTools.isNotEmpty(stNjReprot140Sub.getZhishijian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("qssj");
            jc.setAttrValue(stNjReprot140Sub.getQishijian().toString()+"-"+stNjReprot140Sub.getZhishijian().toString());lists.add(jc);jc=null;}

        //评选范围或评比对象
        if(MyTools.isNotEmpty(stNjReprot140Sub.getDidian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("pxfw");
            jc.setAttrValue(stNjReprot140Sub.getDidian());lists.add(jc);jc=null;}

        //批准单位
        if(MyTools.isNotEmpty(stNjReprot140Sub.getPizhundanwei())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("pzdw");
            jc.setAttrValue(stNjReprot140Sub.getPizhundanwei());lists.add(jc);jc=null;}

        //经费来源
        if(MyTools.isNotEmpty(stNjReprot140Sub.getShoufeiqingkuang())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("jfly");
            jc.setAttrValue(stNjReprot140Sub.getShoufeiqingkuang());lists.add(jc);jc=null;}

        return lists;
    }
}
