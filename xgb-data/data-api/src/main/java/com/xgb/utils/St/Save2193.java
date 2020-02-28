package com.xgb.utils.St;

import com.xgb.model.JcContentAttr1;
import com.xgb.model.StNjInner4;
import com.xgb.model.StNjReport17Sub1;
import com.xgb.model.StNjReport17Sub2;
import com.xgb.util.MyTools;

import java.util.ArrayList;
import java.util.List;

public class Save2193 {

    public static List<JcContentAttr1> getEntity(Integer contentId, StNjReport17Sub2 stNjReport17Sub2) {
        List<JcContentAttr1> lists = new ArrayList<>();
        JcContentAttr1 jc = null;
        //出访开始时间
        if(MyTools.isNotEmpty(stNjReport17Sub2.getChufangkaishishijian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("cfsj");
            jc.setAttrValue(stNjReport17Sub2.getChufangkaishishijian().toString());lists.add(jc);}

        //出访人数
        if(MyTools.isNotEmpty(stNjReport17Sub2.getChufangrenshu())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("cfrs");
            jc.setAttrValue(stNjReport17Sub2.getChufangrenshu().toString());lists.add(jc);}

        //出访目的
        if(MyTools.isNotEmpty(stNjReport17Sub2.getChufangmude())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("cfmd");
            jc.setAttrValue(stNjReport17Sub2.getChufangmude());lists.add(jc);}

        //经费来源
        if(MyTools.isNotEmpty(stNjReport17Sub2.getJingfeilaiyuan())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("jfly");
            jc.setAttrValue(stNjReport17Sub2.getJingfeilaiyuan());lists.add(jc);}

        //境外邀请单位名称
        if(MyTools.isNotEmpty(stNjReport17Sub2.getJingwaiyaoqingdanweimingcheng())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("jwyqdw");
            jc.setAttrValue(stNjReport17Sub2.getJingwaiyaoqingdanweimingcheng());lists.add(jc);}

        //批准机关
        if(MyTools.isNotEmpty(stNjReport17Sub2.getPizhunjiguan())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("pzjg");
            jc.setAttrValue(stNjReport17Sub2.getPizhunjiguan());lists.add(jc);}

        jc = null;

        return lists;
    }
}
