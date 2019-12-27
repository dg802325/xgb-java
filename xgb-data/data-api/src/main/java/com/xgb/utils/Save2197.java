package com.xgb.utils;

import com.xgb.model.JcContentAttr1;
import com.xgb.model.NjGwyjzSub;
import com.xgb.model.StNjInner4;
import com.xgb.util.MyTools;

import java.util.ArrayList;
import java.util.List;

public class Save2197 {

    public static List<JcContentAttr1> getEntity(Integer contentId, NjGwyjzSub njGwyjzSub) {
        List<JcContentAttr1> lists = new ArrayList<>();

        //姓名
        if(MyTools.isNotEmpty(njGwyjzSub.getXingming())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("");
            jc.setAttrValue(njGwyjzSub.getXingming());lists.add(jc);jc=null;}

        //工作单位
        if(MyTools.isNotEmpty(njGwyjzSub.getGongzuodanwei())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("gzdw");
            jc.setAttrValue(njGwyjzSub.getGongzuodanwei());lists.add(jc);jc=null;}

        //单位职务
        if(MyTools.isNotEmpty(njGwyjzSub.getDanweizhiwu())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("dwzw");
            jc.setAttrValue(njGwyjzSub.getDanweizhiwu());lists.add(jc);jc=null;}

        //在职状态
        if(MyTools.isNotEmpty(njGwyjzSub.getZaizhizhuangtai())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("zzzt");
            jc.setAttrValue(njGwyjzSub.getZaizhizhuangtai());lists.add(jc);jc=null;}

        //是否批复
        if(MyTools.isNotEmpty(njGwyjzSub.getLingchouqingkuang())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("sfpf");
            jc.setAttrValue(njGwyjzSub.getLingchouqingkuang());lists.add(jc);jc=null;}

        //社团职务
        if(MyTools.isNotEmpty(njGwyjzSub.getZhiwu())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("stzw");
            jc.setAttrValue(njGwyjzSub.getZhiwu());lists.add(jc);jc=null;}

        //在其他社团兼职数
        if(MyTools.isNotEmpty(njGwyjzSub.getPizhundanwei())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("zqtstjzs");
            jc.setAttrValue(njGwyjzSub.getPizhundanwei());lists.add(jc);jc=null;}


        return lists;
    }
}
