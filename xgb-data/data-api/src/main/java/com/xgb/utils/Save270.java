package com.xgb.utils;

import com.xgb.model.JcContentAttr1;
import com.xgb.model.NjGwyjzSub;
import com.xgb.model.StNjInner4;
import com.xgb.util.MyTools;

import java.util.ArrayList;
import java.util.List;

public class Save270 {

    public static List<JcContentAttr1> getEntity(Integer contentId, NjGwyjzSub njGwyjzSub) {
        List<JcContentAttr1> lists = new ArrayList<>();

        //性别
        if(MyTools.isNotEmpty(njGwyjzSub.getXingbie())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("xb");
            jc.setAttrValue(njGwyjzSub.getXingbie());lists.add(jc);jc=null;}

        //出生年月
        if(MyTools.isNotEmpty(njGwyjzSub.getChushengnianyue())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("csny");
            jc.setAttrValue(njGwyjzSub.getChushengnianyue().toString());lists.add(jc);jc=null;}

        //单位职务
        if(MyTools.isNotEmpty(njGwyjzSub.getDanweizhiwu())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("mfzwnzw");
            jc.setAttrValue(njGwyjzSub.getDanweizhiwu());lists.add(jc);jc=null;}

        //工作单位
        if(MyTools.isNotEmpty(njGwyjzSub.getGongzuodanwei())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("gzdw");
            jc.setAttrValue(njGwyjzSub.getGongzuodanwei());lists.add(jc);jc=null;}

        //在职状态
        if(MyTools.isNotEmpty(njGwyjzSub.getZaizhizhuangtai())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("zzzt");
            jc.setAttrValue(njGwyjzSub.getZaizhizhuangtai());lists.add(jc);jc=null;}

        //职务
        if(MyTools.isNotEmpty(njGwyjzSub.getZhiwu())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("zw1");
            jc.setAttrValue(njGwyjzSub.getZhiwu());lists.add(jc);jc=null;}

        //领酬情况
        if(MyTools.isNotEmpty(njGwyjzSub.getLingchouqingkuang())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("lcqk");
            jc.setAttrValue(njGwyjzSub.getLingchouqingkuang());lists.add(jc);jc=null;}

        //批准单位
        if(MyTools.isNotEmpty(njGwyjzSub.getPizhundanwei())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("pzdw");
            jc.setAttrValue(njGwyjzSub.getPizhundanwei());lists.add(jc);jc=null;}

        //批准时间
        if(MyTools.isNotEmpty(njGwyjzSub.getPizhunshijian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("pzsj");
            jc.setAttrValue(njGwyjzSub.getPizhunshijian().toString());lists.add(jc);jc=null;}

        return lists;
    }
}
