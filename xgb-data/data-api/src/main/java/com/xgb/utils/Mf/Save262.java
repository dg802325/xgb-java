package com.xgb.utils.Mf;

import com.xgb.model.JcContentAttr1;
import com.xgb.model.StNjInner4;
import com.xgb.util.DateUtils;
import com.xgb.util.MyTools;

import java.util.ArrayList;
import java.util.List;

public class Save262 {

    public static List<JcContentAttr1> getEntity(Integer contentId, StNjInner4 stNjInner4) {
        List<JcContentAttr1> lists = new ArrayList<>();
        JcContentAttr1 jc = null;

        //变更名称
        if(MyTools.isNotEmpty(stNjInner4.getBiangengmingcheng())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("WWQOMRoS");
            jc.setAttrValue(stNjInner4.getBiangengmingcheng());lists.add(jc);}

        //变更名称办理情况
        if(MyTools.isNotEmpty(stNjInner4.getBiangengmingchengbanli())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("PAsBZEds");
            jc.setAttrValue(stNjInner4.getBiangengmingchengbanli());lists.add(jc);}

        //变更名称批准时间
        if(MyTools.isNotEmpty(stNjInner4.getBiangengmingchengshijian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("XwhXUGZO");
            jc.setAttrValue(DateUtils.dateToyyyyMMdd(stNjInner4.getBiangengmingchengshijian()));lists.add(jc);}

        //变更业务范围
        if(MyTools.isNotEmpty(stNjInner4.getBiangengyewu())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("QtQXwAmY");
            jc.setAttrValue(stNjInner4.getBiangengyewu());lists.add(jc);}

        //变更业务范围办理情况
        if(MyTools.isNotEmpty(stNjInner4.getBiangengyewubanli())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("sdmyGAco");
            jc.setAttrValue(stNjInner4.getBiangengyewubanli());lists.add(jc);}

        //变更业务范围批准时间
        if(MyTools.isNotEmpty(stNjInner4.getBiangengyewushijian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("BzGuvkPr");
            jc.setAttrValue(DateUtils.dateToyyyyMMdd(stNjInner4.getBiangengyewushijian()));lists.add(jc);}

        //变更住所
        if(MyTools.isNotEmpty(stNjInner4.getBiangengzhusuo())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("WedJQyGv");
            jc.setAttrValue(stNjInner4.getBiangengzhusuo());lists.add(jc);}

        //变更住所办理
        if(MyTools.isNotEmpty(stNjInner4.getBiangengzhusuobanli())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("euOveyYu");
            jc.setAttrValue(stNjInner4.getBiangengzhusuobanli());lists.add(jc);}

        //变更住所时间
        if(MyTools.isNotEmpty(stNjInner4.getBiangengzhusuoshijian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("abtjDAnA");
            jc.setAttrValue(DateUtils.dateToyyyyMMdd(stNjInner4.getBiangengzhusuoshijian()));lists.add(jc);}

        //变更资金
        if(MyTools.isNotEmpty(stNjInner4.getBiangengzijin())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("PjZYGjfE");
            jc.setAttrValue(stNjInner4.getBiangengzijin());lists.add(jc);}

        //变更资金办理
        if(MyTools.isNotEmpty(stNjInner4.getBiangengzijinbanli())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("aexBCyPK");
            jc.setAttrValue(stNjInner4.getBiangengzijinbanli());lists.add(jc);}

        //变更资金时间
        if(MyTools.isNotEmpty(stNjInner4.getBiangengzijinshijian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("PdYvLieh");
            jc.setAttrValue(DateUtils.dateToyyyyMMdd(stNjInner4.getBiangengzijinshijian()));lists.add(jc);}

        //变更法人
        if(MyTools.isNotEmpty(stNjInner4.getBiangengfaren())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("uoPYjgRp");
            jc.setAttrValue(stNjInner4.getBiangengfaren());lists.add(jc);}

        //变更法人办理
        if(MyTools.isNotEmpty(stNjInner4.getBiangengfarenbanli())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("kDmIkxya");
            jc.setAttrValue(stNjInner4.getBiangengfarenbanli());lists.add(jc);}

        //变更法人时间
        if(MyTools.isNotEmpty(stNjInner4.getBiangengfarenshijian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("CCSTFFQZ");
            jc.setAttrValue(DateUtils.dateToyyyyMMdd(stNjInner4.getBiangengfarenshijian()));lists.add(jc);}

        //变更主管单位
        if(MyTools.isNotEmpty(stNjInner4.getBiangengzhuguandanwei())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("MInHBxYz");
            jc.setAttrValue(stNjInner4.getBiangengzhuguandanwei());lists.add(jc);}

        //变主管单位办理
        if(MyTools.isNotEmpty(stNjInner4.getBianzhuguandanweibanli())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("gJSuhCPK");
            jc.setAttrValue(stNjInner4.getBianzhuguandanweibanli());lists.add(jc);}

        //变主管单位时间
        if(MyTools.isNotEmpty(stNjInner4.getBianzhuguandanweishijian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("CmYYfCAC");
            jc.setAttrValue(DateUtils.dateToyyyyMMdd(stNjInner4.getBianzhuguandanweishijian()));lists.add(jc);}

        //修改章程
        if(MyTools.isNotEmpty(stNjInner4.getXiugaizhangcheng())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("sPpuOGmO");
            jc.setAttrValue(stNjInner4.getXiugaizhangcheng());lists.add(jc);}

        //修改章程办理
        if(MyTools.isNotEmpty(stNjInner4.getXiugaizhangchengbanli())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("iMcUSvAk");
            jc.setAttrValue(stNjInner4.getXiugaizhangchengbanli());lists.add(jc);}

        //修改章程时间
        if(MyTools.isNotEmpty(stNjInner4.getXiugaizhangchengshijian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("NTlAoLrx");
            jc.setAttrValue(DateUtils.dateToyyyyMMdd(stNjInner4.getXiugaizhangchengshijian()));lists.add(jc);}

        //变更理事
        if(MyTools.isNotEmpty(stNjInner4.getCaiwuruanjian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("ruGLPbzl");
            jc.setAttrValue(stNjInner4.getCaiwuruanjian());lists.add(jc);}

        //变更理事情况
        if(MyTools.isNotEmpty(stNjInner4.getLishihuinian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("ppknQWZJ");
            jc.setAttrValue(stNjInner4.getLishihuinian());lists.add(jc);}

        //批准时间
        if(MyTools.isNotEmpty(stNjInner4.getHuanjiedahuishijian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("mTeWGANR");
            jc.setAttrValue(DateUtils.dateToyyyyMMdd(stNjInner4.getHuanjiedahuishijian()));lists.add(jc);}

        jc = null;

        return lists;
    }
}
