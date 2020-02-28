package com.xgb.utils;

import com.xgb.model.Content202Entity;
import com.xgb.model.JcContentAttr1;
import com.xgb.model.StNjInner4;
import com.xgb.util.MyTools;

import java.util.ArrayList;
import java.util.List;

public class Save200Entity {

    public static List<JcContentAttr1> getEntity(Integer contentId, Content202Entity content202Entity) {
        List<JcContentAttr1> lists = new ArrayList<>();
        JcContentAttr1 jc = null;
        //业务范围
        if(MyTools.isNotEmpty(content202Entity.getContentId())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("contentId");
            jc.setAttrValue(content202Entity.getContentId());lists.add(jc);}

        //业务范围
        if(MyTools.isNotEmpty(content202Entity.getShzzXzqh())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("shzzXzqh");
            jc.setAttrValue(content202Entity.getShzzXzqh());lists.add(jc);}

        //业务范围
        if(MyTools.isNotEmpty(content202Entity.getShzzZgmc())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("shzzZgmc");
            jc.setAttrValue(content202Entity.getShzzZgmc());lists.add(jc);}

        //业务范围
        if(MyTools.isNotEmpty(content202Entity.getStxcode())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("stxcode");
            jc.setAttrValue(content202Entity.getStxcode());lists.add(jc);}

        //业务范围
        if(MyTools.isNotEmpty(content202Entity.getType())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("type");
            jc.setAttrValue(content202Entity.getType());lists.add(jc);}
        jc = null;
        return lists;
    }
}
