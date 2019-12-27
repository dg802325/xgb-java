package com.xgb.utils;

import com.xgb.model.JcContentAttr1;
import com.xgb.model.MfGwyjzZb;
import com.xgb.model.StNjInner4;
import com.xgb.util.MyTools;

import java.util.ArrayList;
import java.util.List;

public class Save2198 {

    public static List<JcContentAttr1> getEntity(Integer contentId, MfGwyjzZb mfGwyjzZb) {
        List<JcContentAttr1> lists = new ArrayList<>();

        //姓名
        if(MyTools.isNotEmpty(mfGwyjzZb.getXingming())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("title");
            jc.setAttrValue(mfGwyjzZb.getXingming());lists.add(jc);jc=null;}

        //工作单位
        if(MyTools.isNotEmpty(mfGwyjzZb.getGongzuodanwei())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("gzdw");
            jc.setAttrValue(mfGwyjzZb.getGongzuodanwei());lists.add(jc);jc=null;}

        //单位职务
        if(MyTools.isNotEmpty(mfGwyjzZb.getDanweizhiwu())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("dwzw");
            jc.setAttrValue(mfGwyjzZb.getDanweizhiwu());lists.add(jc);jc=null;}

        //在职状态
        if(MyTools.isNotEmpty(mfGwyjzZb.getZaizhizhuangtai())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("zzzt");
            jc.setAttrValue(mfGwyjzZb.getZaizhizhuangtai());lists.add(jc);jc=null;}

        //联系方式
        if(MyTools.isNotEmpty(mfGwyjzZb.getPizhundanwei())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("lxfs");
            jc.setAttrValue(mfGwyjzZb.getPizhundanwei());lists.add(jc);jc=null;}


        return lists;
    }
}
