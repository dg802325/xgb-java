package com.xgb.utils;

import com.xgb.model.JcContentAttr1;
import com.xgb.model.StNjAdministratCost;
import com.xgb.model.StNjInner4;
import com.xgb.util.MyTools;

import java.util.ArrayList;
import java.util.List;

public class Save2183 {

    public static List<JcContentAttr1> getEntity(Integer contentId, StNjAdministratCost stNjAdministratCost) {
        List<JcContentAttr1> lists = new ArrayList<>();

        //收费标准（元）
        if(MyTools.isNotEmpty(stNjAdministratCost.getShoufeibiaozhu())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("shoufeibz");
            jc.setAttrValue(stNjAdministratCost.getShoufeibiaozhu().toString());lists.add(jc);jc=null;}

        //设立依据
        if(MyTools.isNotEmpty(stNjAdministratCost.getSheliyiju())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("shelij");
            jc.setAttrValue(stNjAdministratCost.getSheliyiju());lists.add(jc);jc=null;}

        //合计（万元）
        if(MyTools.isNotEmpty(stNjAdministratCost.getHeji())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("heji");
            jc.setAttrValue(stNjAdministratCost.getHeji().toString());lists.add(jc);jc=null;}

        //自查清理意见
        if(MyTools.isNotEmpty(stNjAdministratCost.getZichaqingliyijian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("zcqlyj");
            jc.setAttrValue(stNjAdministratCost.getZichaqingliyijian());lists.add(jc);jc=null;}

        return lists;
    }
}
