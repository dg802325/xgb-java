package com.xgb.utils;

import com.xgb.model.JcContentAttr1;
import com.xgb.model.StDjqk4;
import com.xgb.model.StNjJieshoujiandu;
import com.xgb.util.MyTools;

import java.util.ArrayList;
import java.util.List;

public class Save209 {

    public static List<JcContentAttr1> getEntity(Integer contentId, StNjJieshoujiandu stNjJieshoujiandu) {
        List<JcContentAttr1> lists = new ArrayList<>();

        //整改措施1
        if(MyTools.isNotEmpty(stNjJieshoujiandu.getZhenggai1())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("B4DC8AI8");
            jc.setAttrValue(stNjJieshoujiandu.getZhenggai1());lists.add(jc);jc=null;}

        //整改措施2
        if(MyTools.isNotEmpty(stNjJieshoujiandu.getZhenggai2())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("nQKNBTWu");
            jc.setAttrValue(stNjJieshoujiandu.getZhenggai2());lists.add(jc);jc=null;}

        //整改措施3
        if(MyTools.isNotEmpty(stNjJieshoujiandu.getZhenggai3())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("sntby7V2");
            jc.setAttrValue(stNjJieshoujiandu.getZhenggai3());lists.add(jc);jc=null;}

        //是否参评
        if(MyTools.isNotEmpty(stNjJieshoujiandu.getRadiobutton())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("zZXxcyAL");
            jc.setAttrValue(stNjJieshoujiandu.getRadiobutton());lists.add(jc);jc=null;}

        //评估时间
        if(MyTools.isNotEmpty(stNjJieshoujiandu.getPinggunian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("uhrW8FSW");
            jc.setAttrValue(stNjJieshoujiandu.getPinggunian()+"-"+stNjJieshoujiandu.getPingguyue()+"-"+stNjJieshoujiandu.getPingguri());lists.add(jc);jc=null;}

        //有效期致
        if(MyTools.isNotEmpty(stNjJieshoujiandu.getPinggunian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("uhrW8FSW");
            jc.setAttrValue(stNjJieshoujiandu.getNian2()+"-"+stNjJieshoujiandu.getYue2()+"-"+stNjJieshoujiandu.getRi2());lists.add(jc);jc=null;}

        //是否接受审计1
        if(MyTools.isNotEmpty(stNjJieshoujiandu.getRadiobutton2())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("bh23VB6v");
            jc.setAttrValue(stNjJieshoujiandu.getRadiobutton2());lists.add(jc);jc=null;}

        //审计机构1
        if(MyTools.isNotEmpty(stNjJieshoujiandu.getShenjijigou1())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("FbDlYoTl");
            jc.setAttrValue(stNjJieshoujiandu.getShenjijigou1());lists.add(jc);jc=null;}

        //审计报告用途1
        if(MyTools.isNotEmpty(stNjJieshoujiandu.getBaogaoyongtu1())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("XtoGe3tB");
            jc.setAttrValue(stNjJieshoujiandu.getBaogaoyongtu1());lists.add(jc);jc=null;}

        //是否接受审计2
        if(MyTools.isNotEmpty(stNjJieshoujiandu.getRadiobutton3())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("HDZKbXIr");
            jc.setAttrValue(stNjJieshoujiandu.getRadiobutton3());lists.add(jc);jc=null;}

        //审计机构2
        if(MyTools.isNotEmpty(stNjJieshoujiandu.getShenjijigou2())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("aiP6TqQ9");
            jc.setAttrValue(stNjJieshoujiandu.getShenjijigou2());lists.add(jc);jc=null;}

        //审计报告用途2
        if(MyTools.isNotEmpty(stNjJieshoujiandu.getBaogaoyongtu2())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("ZkeJql6X");
            jc.setAttrValue(stNjJieshoujiandu.getBaogaoyongtu2());lists.add(jc);jc=null;}

        //是否接受审计3
        if(MyTools.isNotEmpty(stNjJieshoujiandu.getRadiobutton4())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("K4zZL0gB");
            jc.setAttrValue(stNjJieshoujiandu.getRadiobutton4());lists.add(jc);jc=null;}

        //审计机构3
        if(MyTools.isNotEmpty(stNjJieshoujiandu.getShenjijigou3())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("A6sippJQ");
            jc.setAttrValue(stNjJieshoujiandu.getShenjijigou3());lists.add(jc);jc=null;}

        //审计报告用途3
        if(MyTools.isNotEmpty(stNjJieshoujiandu.getBaogaoyongtu3())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("KFMiAblf");
            jc.setAttrValue(stNjJieshoujiandu.getBaogaoyongtu3());lists.add(jc);jc=null;}

        //是否受到过行政处罚
        if(MyTools.isNotEmpty(stNjJieshoujiandu.getRadiobutton5())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("uuUq9cgt");
            jc.setAttrValue(stNjJieshoujiandu.getRadiobutton5());lists.add(jc);jc=null;}

        //处罚时间
        if(MyTools.isNotEmpty(stNjJieshoujiandu.getPinggunian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("EXWRMuNW");
            jc.setAttrValue(stNjJieshoujiandu.getNian3()+"-"+stNjJieshoujiandu.getYue3()+"-"+stNjJieshoujiandu.getRi3());lists.add(jc);jc=null;}

        //行政处罚实施机关
        if(MyTools.isNotEmpty(stNjJieshoujiandu.getShishijiguan())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("IK9LClYp");
            jc.setAttrValue(stNjJieshoujiandu.getShishijiguan());lists.add(jc);jc=null;}

        //违法行为
        if(MyTools.isNotEmpty(stNjJieshoujiandu.getWeifaxingwei())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("XDBblLv1");
            jc.setAttrValue(stNjJieshoujiandu.getWeifaxingwei());lists.add(jc);jc=null;}

        //年检结论1
        if(MyTools.isNotEmpty(stNjJieshoujiandu.getNianjianjielun1())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("nianjianjielun1");
            jc.setAttrValue(stNjJieshoujiandu.getNianjianjielun1());lists.add(jc);jc=null;}

        //年检结伦2
        if(MyTools.isNotEmpty(stNjJieshoujiandu.getNianjianjielun2())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("nianjianjielun2");
            jc.setAttrValue(stNjJieshoujiandu.getNianjianjielun2());lists.add(jc);jc=null;}

        //年检结伦3
        if(MyTools.isNotEmpty(stNjJieshoujiandu.getNianjianjielun3())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("nianjianjielun3");
            jc.setAttrValue(stNjJieshoujiandu.getNianjianjielun3());lists.add(jc);jc=null;}

        //评估结果
        if(MyTools.isNotEmpty(stNjJieshoujiandu.getPinggujieguo())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("pinggujieguo");
            jc.setAttrValue(stNjJieshoujiandu.getPinggujieguo());lists.add(jc);jc=null;}

        //行政处罚种类
        if(MyTools.isNotEmpty(stNjJieshoujiandu.getChufazhonglei())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("xingzhengchufaz");
            jc.setAttrValue(stNjJieshoujiandu.getChufazhonglei());lists.add(jc);jc=null;}

        return lists;
    }
}
