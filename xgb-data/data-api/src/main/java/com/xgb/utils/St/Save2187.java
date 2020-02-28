package com.xgb.utils.St;

import com.xgb.model.JcContentAttr1;
import com.xgb.model.StNjReport14Sub;
import com.xgb.util.MyTools;

import java.util.ArrayList;
import java.util.List;

public class Save2187 {

    public static List<JcContentAttr1> getEntity(Integer contentId, StNjReport14Sub stNjReport14Sub) {
        List<JcContentAttr1> lists = new ArrayList<>();
        JcContentAttr1 jc = null;

        //类型
        if(MyTools.isNotEmpty(stNjReport14Sub.getLeixing())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("leixing");
            jc.setAttrValue(stNjReport14Sub.getLeixing());lists.add(jc);}

        //时间
        if(MyTools.isNotEmpty(stNjReport14Sub.getShijian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("sjhzq");
            jc.setAttrValue(stNjReport14Sub.getShijian());lists.add(jc);}

        //对象
        if(MyTools.isNotEmpty(stNjReport14Sub.getDidian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("duixiang");
            jc.setAttrValue(stNjReport14Sub.getDidian());lists.add(jc);}

        //地点
        if(MyTools.isNotEmpty(stNjReport14Sub.getDidian1())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("didian");
            jc.setAttrValue(stNjReport14Sub.getDidian1());lists.add(jc);}

        //批准单位
        if(MyTools.isNotEmpty(stNjReport14Sub.getPizhundanwei())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("pzdw");
            jc.setAttrValue(stNjReport14Sub.getPizhundanwei());lists.add(jc);}

        //经费来源
        if(MyTools.isNotEmpty(stNjReport14Sub.getShoufeiqingkuang())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("jfly");
            jc.setAttrValue(stNjReport14Sub.getShoufeiqingkuang());lists.add(jc);}

        jc = null;

        return lists;
    }
}
