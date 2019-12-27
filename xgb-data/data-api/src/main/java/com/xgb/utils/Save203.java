package com.xgb.utils;

import com.xgb.model.JcContentAttr1;
import com.xgb.model.StNjInner4;
import com.xgb.model.StNjReport3;
import com.xgb.util.MyTools;

import java.util.ArrayList;
import java.util.List;

public class Save203 {

    public static List<JcContentAttr1> getEntity(Integer contentId, StNjInner4 stNjInner4) {
        List<JcContentAttr1> lists = new ArrayList<>();

        //变更名称
        if(MyTools.isNotEmpty(stNjInner4.getBiangengmingcheng())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("bgmc");
            jc.setAttrValue(stNjInner4.getBiangengmingcheng());lists.add(jc);jc=null;}

        //变更名称办理情况
        if(MyTools.isNotEmpty(stNjInner4.getBiangengmingchengbanli())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("bgmcblqk");
            jc.setAttrValue(stNjInner4.getBiangengmingchengbanli());lists.add(jc);jc=null;}

        //变更名称批准时间
        if(MyTools.isNotEmpty(stNjInner4.getBiangengmingchengshijian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("bgmcpzsj");
            jc.setAttrValue(stNjInner4.getBiangengmingchengshijian().toString());lists.add(jc);jc=null;}

        //变更活动地域
        if(MyTools.isNotEmpty(stNjInner4.getBiangengdiyu())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("bghddy");
            jc.setAttrValue(stNjInner4.getBiangengdiyu());lists.add(jc);jc=null;}

        //变更活动地域办理情况
        if(MyTools.isNotEmpty(stNjInner4.getBiangengdiyubanli())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("bghddyblqk");
            jc.setAttrValue(stNjInner4.getBiangengdiyubanli());lists.add(jc);jc=null;}

        //变更活动地域批准时间
        if(MyTools.isNotEmpty(stNjInner4.getBiangengdiyushijian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("bghddypzsj");
            jc.setAttrValue(stNjInner4.getBiangengdiyushijian().toString());lists.add(jc);jc=null;}

        //变更业务范围
        if(MyTools.isNotEmpty(stNjInner4.getBiangengyewu())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("bgywfw");
            jc.setAttrValue(stNjInner4.getBiangengyewu());lists.add(jc);jc=null;}

        //变更业务范围办理情况
        if(MyTools.isNotEmpty(stNjInner4.getBiangengyewubanli())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("bgywfwblqk");
            jc.setAttrValue(stNjInner4.getBiangengyewubanli());lists.add(jc);jc=null;}

        //变更业务范围批准时间
        if(MyTools.isNotEmpty(stNjInner4.getBiangengyewushijian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("bgywfwpzsj");
            jc.setAttrValue(stNjInner4.getBiangengyewushijian().toString());lists.add(jc);jc=null;}

        //变更住所
        if(MyTools.isNotEmpty(stNjInner4.getBiangengzhusuo())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("bgzs");
            jc.setAttrValue(stNjInner4.getBiangengzhusuo());lists.add(jc);jc=null;}

        //变更住所办理
        if(MyTools.isNotEmpty(stNjInner4.getBiangengzhusuobanli())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("bgzsblqk");
            jc.setAttrValue(stNjInner4.getBiangengzhusuobanli());lists.add(jc);jc=null;}

        //变更住所时间
        if(MyTools.isNotEmpty(stNjInner4.getBiangengzhusuoshijian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("bgzspzsj");
            jc.setAttrValue(stNjInner4.getBiangengzhusuoshijian().toString());lists.add(jc);jc=null;}

        //变更资金
        if(MyTools.isNotEmpty(stNjInner4.getBiangengzijin())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("bgzczj");
            jc.setAttrValue(stNjInner4.getBiangengzijin());lists.add(jc);jc=null;}

        //变更资金办理
        if(MyTools.isNotEmpty(stNjInner4.getBiangengzijinbanli())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("bgzczjblqk");
            jc.setAttrValue(stNjInner4.getBiangengzijinbanli());lists.add(jc);jc=null;}

        //变更资金时间
        if(MyTools.isNotEmpty(stNjInner4.getBiangengzijinshijian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("bgzczjpzsj");
            jc.setAttrValue(stNjInner4.getBiangengzijinshijian().toString());lists.add(jc);jc=null;}

        //变更法人
        if(MyTools.isNotEmpty(stNjInner4.getBiangengfaren())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("bgfddb");
            jc.setAttrValue(stNjInner4.getBiangengfaren());lists.add(jc);jc=null;}

        //变更法人办理
        if(MyTools.isNotEmpty(stNjInner4.getBiangengfarenbanli())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("bgfddbblqk");
            jc.setAttrValue(stNjInner4.getBiangengfarenbanli());lists.add(jc);jc=null;}

        //变更法人时间
        if(MyTools.isNotEmpty(stNjInner4.getBiangengfarenshijian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("bgfddbpzsj");
            jc.setAttrValue(stNjInner4.getBiangengfarenshijian().toString());lists.add(jc);jc=null;}

        //变更主管单位
        if(MyTools.isNotEmpty(stNjInner4.getBiangengzhuguandanwei())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("bgywzgdw");
            jc.setAttrValue(stNjInner4.getBiangengzhuguandanwei());lists.add(jc);jc=null;}

        //变主管单位办理
        if(MyTools.isNotEmpty(stNjInner4.getBianzhuguandanweibanli())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("bgywzgdwblqk");
            jc.setAttrValue(stNjInner4.getBianzhuguandanweibanli());lists.add(jc);jc=null;}

        //变主管单位时间
        if(MyTools.isNotEmpty(stNjInner4.getBianzhuguandanweishijian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("bgywzgdwpzsj");
            jc.setAttrValue(stNjInner4.getBianzhuguandanweishijian().toString());lists.add(jc);jc=null;}

        //修改章程
        if(MyTools.isNotEmpty(stNjInner4.getXiugaizhangcheng())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("xgzc");
            jc.setAttrValue(stNjInner4.getXiugaizhangcheng());lists.add(jc);jc=null;}

        //修改章程办理
        if(MyTools.isNotEmpty(stNjInner4.getXiugaizhangchengbanli())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("xgzcblqk");
            jc.setAttrValue(stNjInner4.getXiugaizhangchengbanli());lists.add(jc);jc=null;}

        //修改章程时间
        if(MyTools.isNotEmpty(stNjInner4.getXiugaizhangchengshijian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("xgzcpzsj");
            jc.setAttrValue(stNjInner4.getXiugaizhangchengshijian().toString());lists.add(jc);jc=null;}

        //负责人变更
        if(MyTools.isNotEmpty(stNjInner4.getFuzerenbiangeng())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("fzrbgba");
            jc.setAttrValue(stNjInner4.getFuzerenbiangeng());lists.add(jc);jc=null;}

        //负责人变更办理
        if(MyTools.isNotEmpty(stNjInner4.getFuzerenbiangengbanli())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("fzrbgbablqk");
            jc.setAttrValue(stNjInner4.getFuzerenbiangengbanli());lists.add(jc);jc=null;}

        //负责人变时间
        if(MyTools.isNotEmpty(stNjInner4.getFuzerenbianshijian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("fzrbgbapzsj");
            jc.setAttrValue(stNjInner4.getFuzerenbianshijian().toString());lists.add(jc);jc=null;}
        return lists;
    }
}
