package com.xgb.utils.Jjh;

import com.xgb.model.JcContentAttr1;
import com.xgb.model.JjhNjReportGqstqkItem;
import com.xgb.util.MyTools;

import java.util.ArrayList;
import java.util.List;

public class Save2561 {

    public static List<JcContentAttr1> getEntity(Integer contentId, JjhNjReportGqstqkItem oldTable) {
        List<JcContentAttr1> lists = new ArrayList<>();
        JcContentAttr1 jc = null;

        if(MyTools.isNotEmpty(oldTable.getMingcheng())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("title");
            jc.setAttrValue(oldTable.getMingcheng().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getShelishijian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("slsj");
            jc.setAttrValue(oldTable.getShelishijian().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getDaibiaoren())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("fddbr");
            jc.setAttrValue(oldTable.getDaibiaoren().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getDengjileixing())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("gsdjlx");
            jc.setAttrValue(oldTable.getDengjileixing().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getStzhucezijin())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("stzczj");
            jc.setAttrValue(oldTable.getStzhucezijin().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getRjzhucezijin())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("rjzczj");
            jc.setAttrValue(oldTable.getRjzhucezijin().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getJjhchuzie())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("bjjhcze");
            jc.setAttrValue(oldTable.getJjhchuzie().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getChigubili())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("cgbl");
            jc.setAttrValue(oldTable.getChigubili().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getTzjjhbili())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("jjhzzcbl");
            jc.setAttrValue(oldTable.getTzjjhbili().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getJjhguanxi())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("yjjhdgx");
            jc.setAttrValue(oldTable.getJjhguanxi().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getHesuanfangfa())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("hsff");
            jc.setAttrValue(oldTable.getHesuanfangfa().toString());lists.add(jc);}

        jc = null;

        return lists;
    }
}
