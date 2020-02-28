package com.xgb.utils.St;

import com.xgb.model.JcContentAttr1;
import com.xgb.model.StNjInner4;
import com.xgb.model.StNjReport16Sub2;
import com.xgb.util.MyTools;

import java.util.ArrayList;
import java.util.List;

public class Save2191 {

    public static List<JcContentAttr1> getEntity(Integer contentId, StNjReport16Sub2 stNjReport16Sub2) {
        List<JcContentAttr1> lists = new ArrayList<>();
        JcContentAttr1 jc = null;

        //会议开始时间
        if(MyTools.isNotEmpty(stNjReport16Sub2.getHuiyikaishishijian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("hysj");
            jc.setAttrValue(stNjReport16Sub2.getHuiyikaishishijian().toString());lists.add(jc);}

        //会议地点
        if(MyTools.isNotEmpty(stNjReport16Sub2.getHuiyididian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("hydd");
            jc.setAttrValue(stNjReport16Sub2.getHuiyididian());lists.add(jc);}

        //会议类型
        if(MyTools.isNotEmpty(stNjReport16Sub2.getHuiyileixing())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("hylx");
            jc.setAttrValue(stNjReport16Sub2.getHuiyileixing());lists.add(jc);}

        //主办单位名称
        if(MyTools.isNotEmpty(stNjReport16Sub2.getZhubandanweimingcheng())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("hyzbdw");
            jc.setAttrValue(stNjReport16Sub2.getZhubandanweimingcheng());lists.add(jc);}

        //我方经费来源
        if(MyTools.isNotEmpty(stNjReport16Sub2.getWofangjingfeilaiyuan())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("jfly");
            jc.setAttrValue(stNjReport16Sub2.getWofangjingfeilaiyuan());lists.add(jc);}

        //我方发言主题
        if(MyTools.isNotEmpty(stNjReport16Sub2.getWofangfayanzhuti())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("wffyzt");
            jc.setAttrValue(stNjReport16Sub2.getWofangfayanzhuti());lists.add(jc);}

        jc = null;
        return lists;
    }
}
