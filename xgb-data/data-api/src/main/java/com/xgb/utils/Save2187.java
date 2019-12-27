package com.xgb.utils;

import com.xgb.model.JcContentAttr1;
import com.xgb.model.StNjReport14Sub;
import com.xgb.util.MyTools;

import java.util.ArrayList;
import java.util.List;

public class Save2187 {

    public static List<JcContentAttr1> getEntity(Integer contentId, StNjReport14Sub stNjReport14Sub) {
        List<JcContentAttr1> lists = new ArrayList<>();

        //类型
        if(MyTools.isNotEmpty(stNjReport14Sub.getLeixing())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("leixing");
            jc.setAttrValue(stNjReport14Sub.getLeixing());lists.add(jc);jc=null;}

        //时间
        if(MyTools.isNotEmpty(stNjReport14Sub.getShijian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("sjhzq");
            jc.setAttrValue(stNjReport14Sub.getShijian());lists.add(jc);jc=null;}

        //对象
        if(MyTools.isNotEmpty(stNjReport14Sub.getDidian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("duixiang");
            jc.setAttrValue(stNjReport14Sub.getDidian());lists.add(jc);jc=null;}

        //地点
        if(MyTools.isNotEmpty(stNjReport14Sub.getDidian1())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("didian");
            jc.setAttrValue(stNjReport14Sub.getDidian1());lists.add(jc);jc=null;}

        //批准单位
        if(MyTools.isNotEmpty(stNjReport14Sub.getPizhundanwei())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("pzdw");
            jc.setAttrValue(stNjReport14Sub.getPizhundanwei());lists.add(jc);jc=null;}

        //经费来源
        if(MyTools.isNotEmpty(stNjReport14Sub.getShoufeiqingkuang())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("jfly");
            jc.setAttrValue(stNjReport14Sub.getShoufeiqingkuang());lists.add(jc);jc=null;}


        return lists;
    }
}
