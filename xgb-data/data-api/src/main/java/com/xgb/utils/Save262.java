package com.xgb.utils;

import com.xgb.model.JcContentAttr1;
import com.xgb.model.StNjInner4;
import com.xgb.util.DateUtils;
import com.xgb.util.MyTools;

import java.util.ArrayList;
import java.util.List;

public class Save262 {

    public static List<JcContentAttr1> getEntity(Integer contentId, StNjInner4 stNjInner4) {
        List<JcContentAttr1> lists = new ArrayList<>();

        //变更名称
        if(MyTools.isNotEmpty(stNjInner4.getBiangengmingcheng())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("WWQOMRoS");
            jc.setAttrValue(stNjInner4.getBiangengmingcheng());lists.add(jc);jc=null;}

        //变更名称办理情况
        if(MyTools.isNotEmpty(stNjInner4.getBiangengmingchengbanli())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("PAsBZEds");
            jc.setAttrValue(stNjInner4.getBiangengmingchengbanli());lists.add(jc);jc=null;}

        //变更名称批准时间
        if(MyTools.isNotEmpty(stNjInner4.getBiangengmingchengshijian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("XwhXUGZO");
            jc.setAttrValue(DateUtils.dateToyyyyMMdd(stNjInner4.getBiangengmingchengshijian()));lists.add(jc);jc=null;}

        //变更业务范围
        if(MyTools.isNotEmpty(stNjInner4.getBiangengyewu())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("QtQXwAmY");
            jc.setAttrValue(stNjInner4.getBiangengyewu());lists.add(jc);jc=null;}

        //变更业务范围办理情况
        if(MyTools.isNotEmpty(stNjInner4.getBiangengyewubanli())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("sdmyGAco");
            jc.setAttrValue(stNjInner4.getBiangengyewubanli());lists.add(jc);jc=null;}

        //变更业务范围批准时间
        if(MyTools.isNotEmpty(stNjInner4.getBiangengyewushijian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("BzGuvkPr");
            jc.setAttrValue(DateUtils.dateToyyyyMMdd(stNjInner4.getBiangengyewushijian()));lists.add(jc);jc=null;}

        //变更住所
        if(MyTools.isNotEmpty(stNjInner4.getBiangengzhusuo())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("WedJQyGv");
            jc.setAttrValue(stNjInner4.getBiangengzhusuo());lists.add(jc);jc=null;}

        //变更住所办理
        if(MyTools.isNotEmpty(stNjInner4.getBiangengzhusuobanli())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("euOveyYu");
            jc.setAttrValue(stNjInner4.getBiangengzhusuobanli());lists.add(jc);jc=null;}

        //变更住所时间
        if(MyTools.isNotEmpty(stNjInner4.getBiangengzhusuoshijian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("abtjDAnA");
            jc.setAttrValue(DateUtils.dateToyyyyMMdd(stNjInner4.getBiangengzhusuoshijian()));lists.add(jc);jc=null;}

        //变更资金
        if(MyTools.isNotEmpty(stNjInner4.getBiangengzijin())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("PjZYGjfE");
            jc.setAttrValue(stNjInner4.getBiangengzijin());lists.add(jc);jc=null;}

        //变更资金办理
        if(MyTools.isNotEmpty(stNjInner4.getBiangengzijinbanli())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("aexBCyPK");
            jc.setAttrValue(stNjInner4.getBiangengzijinbanli());lists.add(jc);jc=null;}

        //变更资金时间
        if(MyTools.isNotEmpty(stNjInner4.getBiangengzijinshijian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("PdYvLieh");
            jc.setAttrValue(DateUtils.dateToyyyyMMdd(stNjInner4.getBiangengzijinshijian()));lists.add(jc);jc=null;}

        //变更法人
        if(MyTools.isNotEmpty(stNjInner4.getBiangengfaren())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("uoPYjgRp");
            jc.setAttrValue(stNjInner4.getBiangengfaren());lists.add(jc);jc=null;}

        //变更法人办理
        if(MyTools.isNotEmpty(stNjInner4.getBiangengfarenbanli())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("kDmIkxya");
            jc.setAttrValue(stNjInner4.getBiangengfarenbanli());lists.add(jc);jc=null;}

        //变更法人时间
        if(MyTools.isNotEmpty(stNjInner4.getBiangengfarenshijian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("CCSTFFQZ");
            jc.setAttrValue(DateUtils.dateToyyyyMMdd(stNjInner4.getBiangengfarenshijian()));lists.add(jc);jc=null;}

        //变更主管单位
        if(MyTools.isNotEmpty(stNjInner4.getBiangengzhuguandanwei())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("MInHBxYz");
            jc.setAttrValue(stNjInner4.getBiangengzhuguandanwei());lists.add(jc);jc=null;}

        //变主管单位办理
        if(MyTools.isNotEmpty(stNjInner4.getBianzhuguandanweibanli())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("gJSuhCPK");
            jc.setAttrValue(stNjInner4.getBianzhuguandanweibanli());lists.add(jc);jc=null;}

        //变主管单位时间
        if(MyTools.isNotEmpty(stNjInner4.getBianzhuguandanweishijian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("CmYYfCAC");
            jc.setAttrValue(DateUtils.dateToyyyyMMdd(stNjInner4.getBianzhuguandanweishijian()));lists.add(jc);jc=null;}

        //修改章程
        if(MyTools.isNotEmpty(stNjInner4.getXiugaizhangcheng())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("sPpuOGmO");
            jc.setAttrValue(stNjInner4.getXiugaizhangcheng());lists.add(jc);jc=null;}

        //修改章程办理
        if(MyTools.isNotEmpty(stNjInner4.getXiugaizhangchengbanli())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("iMcUSvAk");
            jc.setAttrValue(stNjInner4.getXiugaizhangchengbanli());lists.add(jc);jc=null;}

        //修改章程时间
        if(MyTools.isNotEmpty(stNjInner4.getXiugaizhangchengshijian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("NTlAoLrx");
            jc.setAttrValue(DateUtils.dateToyyyyMMdd(stNjInner4.getXiugaizhangchengshijian()));lists.add(jc);jc=null;}

        //变更理事
        if(MyTools.isNotEmpty(stNjInner4.getCaiwuruanjian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("ruGLPbzl");
            jc.setAttrValue(stNjInner4.getCaiwuruanjian());lists.add(jc);jc=null;}

        //变更理事情况
        if(MyTools.isNotEmpty(stNjInner4.getLishihuinian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("ppknQWZJ");
            jc.setAttrValue(stNjInner4.getLishihuinian());lists.add(jc);jc=null;}

        //批准时间
        if(MyTools.isNotEmpty(stNjInner4.getHuanjiedahuishijian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("mTeWGANR");
            jc.setAttrValue(DateUtils.dateToyyyyMMdd(stNjInner4.getHuanjiedahuishijian()));lists.add(jc);jc=null;}

        return lists;
    }
}
