package com.xgb.utils.St;

import com.xgb.model.JcContentAttr1;
import com.xgb.model.StNjAppraiseCost;
import com.xgb.model.StNjInner4;
import com.xgb.util.MyTools;

import java.util.ArrayList;
import java.util.List;

public class Save2185 {

    public static List<JcContentAttr1> getEntity(Integer contentId, StNjAppraiseCost stNjAppraiseCost) {
        List<JcContentAttr1> lists = new ArrayList<>();
        JcContentAttr1 jc = null;
        
        //评比达标表彰项目
        if(MyTools.isNotEmpty(stNjAppraiseCost.getBiaozhangxiangmu())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("pbdbbz");
            jc.setAttrValue(stNjAppraiseCost.getBiaozhangxiangmu());lists.add(jc);}

        //设立依据
        if(MyTools.isNotEmpty(stNjAppraiseCost.getSheliyiju())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("slyj");
            jc.setAttrValue(stNjAppraiseCost.getSheliyiju());lists.add(jc);}

        //收费标准（元）
        if(MyTools.isNotEmpty(stNjAppraiseCost.getShoufeibiaozhu())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("sfbz");
            jc.setAttrValue(stNjAppraiseCost.getShoufeibiaozhu().toString());lists.add(jc);}

        //合计（万元）
        if(MyTools.isNotEmpty(stNjAppraiseCost.getHeji())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("heji");
            jc.setAttrValue(stNjAppraiseCost.getHeji().toString());lists.add(jc);}

        //自查清理意见
        if(MyTools.isNotEmpty(stNjAppraiseCost.getZichaqingliyijian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("zcqlyj");
            jc.setAttrValue(stNjAppraiseCost.getZichaqingliyijian());lists.add(jc);}

        jc = null;

        return lists;
    }
}
