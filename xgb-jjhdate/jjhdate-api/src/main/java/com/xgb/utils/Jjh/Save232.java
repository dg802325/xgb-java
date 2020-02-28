package com.xgb.utils.Jjh;

import com.xgb.model.JcContentAttr1;
import com.xgb.model.JjhnjGlfwjsyushxmyeSub;
import com.xgb.model.JjhnjReportThr;
import com.xgb.util.MyTools;

import java.util.ArrayList;
import java.util.List;

public class Save232 {

    public static List<JcContentAttr1> getEntity(Integer contentId, JjhnjReportThr oldTable) {
        List<JcContentAttr1> lists = new ArrayList<>();
        JcContentAttr1 jc = null;

        if(MyTools.isNotEmpty(oldTable.getNianduzongshou())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("JhjNcQzu");
            jc.setAttrValue(oldTable.getNianduzongshou().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getZongzhichu())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("atNZYihp");
            jc.setAttrValue(oldTable.getZongzhichu().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getGongyizhichu())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("ZJljIfSq");
            jc.setAttrValue(oldTable.getGongyizhichu().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getGongzizhichu())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("PdyceqGx");
            jc.setAttrValue(oldTable.getGongzizhichu().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getQitazhichu())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("sFCDUKwR");
            jc.setAttrValue(oldTable.getQitazhichu().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getGongyibili())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("rucfdSVG");
            jc.setAttrValue(oldTable.getGongyibili().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getFulizhichubili())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("NuZqdIgx");
            jc.setAttrValue(oldTable.getFulizhichubili().toString());lists.add(jc);}
        jc = null;

        return lists;
    }

}
