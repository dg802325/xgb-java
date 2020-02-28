package com.xgb.utils.Mf;

import com.xgb.model.JcContentAttr1;
import com.xgb.model.StNjInner4;
import com.xgb.model.StNjJieshoujiandu;
import com.xgb.util.MyTools;

import java.util.ArrayList;
import java.util.List;

public class Save264 {

    public static List<JcContentAttr1> getEntity(Integer contentId, StNjJieshoujiandu stNjJieshoujiandu) {
        List<JcContentAttr1> lists = new ArrayList<>();
        JcContentAttr1 jc = null;
        //年检结论
        if(MyTools.isNotEmpty(stNjJieshoujiandu.getNianjianjielun1())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("njjl1");
            jc.setAttrValue(stNjJieshoujiandu.getNianjianjielun1());lists.add(jc);}

        //整改
        if(MyTools.isNotEmpty(stNjJieshoujiandu.getZhenggai1())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("zgcs1");
            jc.setAttrValue(stNjJieshoujiandu.getZhenggai1());lists.add(jc);}

        //年检结论
        if(MyTools.isNotEmpty(stNjJieshoujiandu.getNianjianjielun2())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("njjl2");
            jc.setAttrValue(stNjJieshoujiandu.getNianjianjielun2());lists.add(jc);}

        //整改
        if(MyTools.isNotEmpty(stNjJieshoujiandu.getZhenggai2())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("zgcs2");
            jc.setAttrValue(stNjJieshoujiandu.getZhenggai2());lists.add(jc);}

        //年检结论
        if(MyTools.isNotEmpty(stNjJieshoujiandu.getNianjianjielun3())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("njjl3");
            jc.setAttrValue(stNjJieshoujiandu.getNianjianjielun3());lists.add(jc);}

        //整改
        if(MyTools.isNotEmpty(stNjJieshoujiandu.getZhenggai3())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("zgcs3");
            jc.setAttrValue(stNjJieshoujiandu.getZhenggai3());lists.add(jc);}

        //是否参评
        if(MyTools.isNotEmpty(stNjJieshoujiandu.getRadiobutton())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("cRbFUIHU");
            jc.setAttrValue(stNjJieshoujiandu.getRadiobutton());lists.add(jc);}

        //评估时间
        if(MyTools.isNotEmpty(stNjJieshoujiandu.getPinggunian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("KeUqPxMp");
            jc.setAttrValue(stNjJieshoujiandu.getPinggunian()+"-"+stNjJieshoujiandu.getPingguyue()+"-"+stNjJieshoujiandu.getPingguri());lists.add(jc);}

        //评论结果
        if(MyTools.isNotEmpty(stNjJieshoujiandu.getPinggujieguo())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("pgjlxin");
            jc.setAttrValue(stNjJieshoujiandu.getPinggujieguo());lists.add(jc);}

        //有效期至
        if(MyTools.isNotEmpty(stNjJieshoujiandu.getNian2())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("dwcCaDVh");
            jc.setAttrValue(stNjJieshoujiandu.getNian2()+"-"+stNjJieshoujiandu.getYue2()+"-"+stNjJieshoujiandu.getRi2());lists.add(jc);}

        //是否接受审计
        if(MyTools.isNotEmpty(stNjJieshoujiandu.getRadiobutton2())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("OCVHLmDR");
            jc.setAttrValue(stNjJieshoujiandu.getRadiobutton2());lists.add(jc);}

        //审计机构
        if(MyTools.isNotEmpty(stNjJieshoujiandu.getShenjijigou1())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("vBhTEWGO");
            jc.setAttrValue(stNjJieshoujiandu.getShenjijigou1());lists.add(jc);}

        //是否接受审计
        if(MyTools.isNotEmpty(stNjJieshoujiandu.getRadiobutton3())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("hSZVpLVp");
            jc.setAttrValue(stNjJieshoujiandu.getRadiobutton3());lists.add(jc);}

        //审计机构
        if(MyTools.isNotEmpty(stNjJieshoujiandu.getShenjijigou2())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("ylZraoyu");
            jc.setAttrValue(stNjJieshoujiandu.getShenjijigou2());lists.add(jc);}

        //是否接受审计
        if(MyTools.isNotEmpty(stNjJieshoujiandu.getRadiobutton4())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("CYPfWlnT");
            jc.setAttrValue(stNjJieshoujiandu.getRadiobutton4());lists.add(jc);}

        //审计机构
        if(MyTools.isNotEmpty(stNjJieshoujiandu.getShenjijigou3())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("bALfEqeo");
            jc.setAttrValue(stNjJieshoujiandu.getShenjijigou3());lists.add(jc);}

        //是否受到过行政处罚
        if(MyTools.isNotEmpty(stNjJieshoujiandu.getRadiobutton5())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("oYsdCsLB");
            jc.setAttrValue(stNjJieshoujiandu.getRadiobutton5());lists.add(jc);}

        //行政处罚时间
        if(MyTools.isNotEmpty(stNjJieshoujiandu.getNian3())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("");
            jc.setAttrValue(stNjJieshoujiandu.getNian3()+"-"+stNjJieshoujiandu.getYue3()+"-"+stNjJieshoujiandu.getRi3());lists.add(jc);}

        //行政处罚实施机关
        if(MyTools.isNotEmpty(stNjJieshoujiandu.getShishijiguan())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("hkxlvNpx");
            jc.setAttrValue(stNjJieshoujiandu.getShishijiguan());lists.add(jc);}

        //违法行为
        if(MyTools.isNotEmpty(stNjJieshoujiandu.getWeifaxingwei())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("TQUDXbej");
            jc.setAttrValue(stNjJieshoujiandu.getWeifaxingwei());lists.add(jc);}

        //行政处罚种类
        if(MyTools.isNotEmpty(stNjJieshoujiandu.getChufazhonglei())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("xzcfzl");
            jc.setAttrValue(stNjJieshoujiandu.getChufazhonglei());lists.add(jc);}

        //审计报告用途
        if(MyTools.isNotEmpty(stNjJieshoujiandu.getBaogaoyongtu1())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("sjbgyt1");
            jc.setAttrValue(stNjJieshoujiandu.getBaogaoyongtu1());lists.add(jc);}

        //审计报告用途
        if(MyTools.isNotEmpty(stNjJieshoujiandu.getBaogaoyongtu2())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("sjbgyt2");
            jc.setAttrValue(stNjJieshoujiandu.getBaogaoyongtu2());lists.add(jc);}

        //审计报告用途
        if(MyTools.isNotEmpty(stNjJieshoujiandu.getBaogaoyongtu3())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("sjbgyt3");
            jc.setAttrValue(stNjJieshoujiandu.getBaogaoyongtu3());lists.add(jc);}

        jc = null;

        return lists;
    }
}
