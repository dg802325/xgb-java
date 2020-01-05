package com.xgb.utils;

import com.xgb.model.JcContentAttr1;
import com.xgb.model.StNjAppraiseCost;
import com.xgb.model.StNjInner4;
import com.xgb.util.MyTools;

import java.util.ArrayList;
import java.util.List;

public class Save2185 {

    public static List<JcContentAttr1> getEntity(Integer contentId, StNjAppraiseCost stNjAppraiseCost) {
        List<JcContentAttr1> lists = new ArrayList<>();

        //评比达标表彰项目
        if(MyTools.isNotEmpty(stNjAppraiseCost.getBiaozhangxiangmu())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("pbdbbz");
            jc.setAttrValue(stNjAppraiseCost.getBiaozhangxiangmu());lists.add(jc);jc=null;}

        //设立依据
        if(MyTools.isNotEmpty(stNjAppraiseCost.getSheliyiju())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("slyj");
            jc.setAttrValue(stNjAppraiseCost.getSheliyiju());lists.add(jc);jc=null;}

        //收费标准（元）
        if(MyTools.isNotEmpty(stNjAppraiseCost.getShoufeibiaozhu())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("sfbz");
            jc.setAttrValue(stNjAppraiseCost.getShoufeibiaozhu().toString());lists.add(jc);jc=null;}

        //合计（万元）
        if(MyTools.isNotEmpty(stNjAppraiseCost.getHeji())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("heji");
            jc.setAttrValue(stNjAppraiseCost.getHeji().toString());lists.add(jc);jc=null;}

        //自查清理意见
        if(MyTools.isNotEmpty(stNjAppraiseCost.getZichaqingliyijian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("zcqlyj");
            jc.setAttrValue(stNjAppraiseCost.getZichaqingliyijian());lists.add(jc);jc=null;}


        return lists;
    }
}
