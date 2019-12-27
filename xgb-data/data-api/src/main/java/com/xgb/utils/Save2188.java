package com.xgb.utils;

import com.xgb.model.JcContentAttr1;
import com.xgb.model.StNjInner4;
import com.xgb.model.StnjSfqkJyfwSub;
import com.xgb.util.MyTools;

import java.util.ArrayList;
import java.util.List;

public class Save2188 {

    public static List<JcContentAttr1> getEntity(Integer contentId, StnjSfqkJyfwSub stnjSfqkJyfwSub) {
        List<JcContentAttr1> lists = new ArrayList<>();

        //收费时间或者周期
        if(MyTools.isNotEmpty(stnjSfqkJyfwSub.getShoufeibiaozhun())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("sjzq");
            jc.setAttrValue(stnjSfqkJyfwSub.getShoufeibiaozhun());lists.add(jc);jc=null;}

        //类型
        if(MyTools.isNotEmpty(stnjSfqkJyfwSub.getLeixing())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("leixing");
            jc.setAttrValue(stnjSfqkJyfwSub.getLeixing());lists.add(jc);jc=null;}

        //对象
        if(MyTools.isNotEmpty(stnjSfqkJyfwSub.getShoufeiyiju())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("duixiang");
            jc.setAttrValue(stnjSfqkJyfwSub.getShoufeiyiju());lists.add(jc);jc=null;}

        //地点
        if(MyTools.isNotEmpty(stnjSfqkJyfwSub.getDidian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("didian");
            jc.setAttrValue(stnjSfqkJyfwSub.getDidian());lists.add(jc);jc=null;}

        //批准单位
        if(MyTools.isNotEmpty(stnjSfqkJyfwSub.getBili())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("pzdw");
            jc.setAttrValue(stnjSfqkJyfwSub.getBili());lists.add(jc);jc=null;}

        //经费来源
        if(MyTools.isNotEmpty(stnjSfqkJyfwSub.getShiyongpiaoju())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("jfly");
            jc.setAttrValue(stnjSfqkJyfwSub.getShiyongpiaoju());lists.add(jc);jc=null;}

        return lists;
    }
}
