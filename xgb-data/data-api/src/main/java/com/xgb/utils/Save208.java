package com.xgb.utils;

import com.xgb.model.JcContentAttr1;
import com.xgb.model.StNjInner4;
import com.xgb.model.StNjReport11Sub1;
import com.xgb.util.MyTools;

import java.util.ArrayList;
import java.util.List;

public class Save208 {

    public static List<JcContentAttr1> getEntity(Integer contentId, StNjReport11Sub1 stNjReport11Sub1) {
        List<JcContentAttr1> lists = new ArrayList<>();

        //负责人
        if(MyTools.isNotEmpty(stNjReport11Sub1.getFuzeren())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("lxrfzr");
            jc.setAttrValue(stNjReport11Sub1.getFuzeren());lists.add(jc);jc=null;}

        //手机
        if(MyTools.isNotEmpty(stNjReport11Sub1.getTjnjyijian1())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("phone");
            jc.setAttrValue(stNjReport11Sub1.getTjnjyijian1());lists.add(jc);jc=null;}

        //住所
        if(MyTools.isNotEmpty(stNjReport11Sub1.getZhusuo())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("address");
            jc.setAttrValue(stNjReport11Sub1.getZhusuo());lists.add(jc);jc=null;}

        return lists;
    }
}
