package com.xgb.utils.St;

import com.xgb.model.JcContentAttr1;
import com.xgb.model.StNjAdministratCost;
import com.xgb.model.StNjInner4;
import com.xgb.util.MyTools;

import java.util.ArrayList;
import java.util.List;

public class Save2181 {

    public static List<JcContentAttr1> getEntity(Integer contentId, StNjAdministratCost stNjAdministratCost) {
        List<JcContentAttr1> lists = new ArrayList<>();
        JcContentAttr1 jc = null;
        //收费项目
        if(MyTools.isNotEmpty(stNjAdministratCost.getShoufeixiangmu())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("title");
            jc.setAttrValue(stNjAdministratCost.getShoufeixiangmu());lists.add(jc);}

        //收费标准（元）
        if(MyTools.isNotEmpty(stNjAdministratCost.getShoufeibiaozhu())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("shoufeibz");
            jc.setAttrValue(stNjAdministratCost.getShoufeibiaozhu().toString());lists.add(jc);}

        //设立依据
        if(MyTools.isNotEmpty(stNjAdministratCost.getSheliyiju())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("shelij");
            jc.setAttrValue(stNjAdministratCost.getSheliyiju());lists.add(jc);}

        //合计（万元）
        if(MyTools.isNotEmpty(stNjAdministratCost.getHeji())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("heji");
            jc.setAttrValue(stNjAdministratCost.getHeji().toString());lists.add(jc);}

        //自查清理意见
        if(MyTools.isNotEmpty(stNjAdministratCost.getZichaqingliyijian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("zcqlyj");
            jc.setAttrValue(stNjAdministratCost.getZichaqingliyijian());lists.add(jc);}

        jc = null;

        return lists;
    }
}
