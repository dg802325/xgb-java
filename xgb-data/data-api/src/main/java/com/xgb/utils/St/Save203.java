package com.xgb.utils.St;

import com.xgb.model.JcContentAttr1;
import com.xgb.model.StNjInner4;
import com.xgb.model.StNjReport3;
import com.xgb.util.MyTools;

import java.util.ArrayList;
import java.util.List;

public class Save203 {

    public static List<JcContentAttr1> getEntity(Integer contentId, StNjInner4 stNjInner4) {
        List<JcContentAttr1> lists = new ArrayList<>();
        JcContentAttr1 jc = null;
        //变更名称
        if(MyTools.isNotEmpty(stNjInner4.getBiangengmingcheng())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("bgmc");
            jc.setAttrValue(stNjInner4.getBiangengmingcheng());lists.add(jc);}

        //变更名称办理情况
        if(MyTools.isNotEmpty(stNjInner4.getBiangengmingchengbanli())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("bgmcblqk");
            jc.setAttrValue(stNjInner4.getBiangengmingchengbanli());lists.add(jc);}

        //变更名称批准时间
        if(MyTools.isNotEmpty(stNjInner4.getBiangengmingchengshijian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("bgmcpzsj");
            jc.setAttrValue(stNjInner4.getBiangengmingchengshijian().toString());lists.add(jc);}

        //变更活动地域
        if(MyTools.isNotEmpty(stNjInner4.getBiangengdiyu())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("bghddy");
            jc.setAttrValue(stNjInner4.getBiangengdiyu());lists.add(jc);}

        //变更活动地域办理情况
        if(MyTools.isNotEmpty(stNjInner4.getBiangengdiyubanli())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("bghddyblqk");
            jc.setAttrValue(stNjInner4.getBiangengdiyubanli());lists.add(jc);}

        //变更活动地域批准时间
        if(MyTools.isNotEmpty(stNjInner4.getBiangengdiyushijian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("bghddypzsj");
            jc.setAttrValue(stNjInner4.getBiangengdiyushijian().toString());lists.add(jc);}

        //变更业务范围
        if(MyTools.isNotEmpty(stNjInner4.getBiangengyewu())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("bgywfw");
            jc.setAttrValue(stNjInner4.getBiangengyewu());lists.add(jc);}

        //变更业务范围办理情况
        if(MyTools.isNotEmpty(stNjInner4.getBiangengyewubanli())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("bgywfwblqk");
            jc.setAttrValue(stNjInner4.getBiangengyewubanli());lists.add(jc);}

        //变更业务范围批准时间
        if(MyTools.isNotEmpty(stNjInner4.getBiangengyewushijian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("bgywfwpzsj");
            jc.setAttrValue(stNjInner4.getBiangengyewushijian().toString());lists.add(jc);}

        //变更住所
        if(MyTools.isNotEmpty(stNjInner4.getBiangengzhusuo())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("bgzs");
            jc.setAttrValue(stNjInner4.getBiangengzhusuo());lists.add(jc);}

        //变更住所办理
        if(MyTools.isNotEmpty(stNjInner4.getBiangengzhusuobanli())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("bgzsblqk");
            jc.setAttrValue(stNjInner4.getBiangengzhusuobanli());lists.add(jc);}

        //变更住所时间
        if(MyTools.isNotEmpty(stNjInner4.getBiangengzhusuoshijian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("bgzspzsj");
            jc.setAttrValue(stNjInner4.getBiangengzhusuoshijian().toString());lists.add(jc);}

        //变更资金
        if(MyTools.isNotEmpty(stNjInner4.getBiangengzijin())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("bgzczj");
            jc.setAttrValue(stNjInner4.getBiangengzijin());lists.add(jc);}

        //变更资金办理
        if(MyTools.isNotEmpty(stNjInner4.getBiangengzijinbanli())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("bgzczjblqk");
            jc.setAttrValue(stNjInner4.getBiangengzijinbanli());lists.add(jc);}

        //变更资金时间
        if(MyTools.isNotEmpty(stNjInner4.getBiangengzijinshijian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("bgzczjpzsj");
            jc.setAttrValue(stNjInner4.getBiangengzijinshijian().toString());lists.add(jc);}

        //变更法人
        if(MyTools.isNotEmpty(stNjInner4.getBiangengfaren())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("bgfddb");
            jc.setAttrValue(stNjInner4.getBiangengfaren());lists.add(jc);}

        //变更法人办理
        if(MyTools.isNotEmpty(stNjInner4.getBiangengfarenbanli())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("bgfddbblqk");
            jc.setAttrValue(stNjInner4.getBiangengfarenbanli());lists.add(jc);}

        //变更法人时间
        if(MyTools.isNotEmpty(stNjInner4.getBiangengfarenshijian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("bgfddbpzsj");
            jc.setAttrValue(stNjInner4.getBiangengfarenshijian().toString());lists.add(jc);}

        //变更主管单位
        if(MyTools.isNotEmpty(stNjInner4.getBiangengzhuguandanwei())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("bgywzgdw");
            jc.setAttrValue(stNjInner4.getBiangengzhuguandanwei());lists.add(jc);}

        //变主管单位办理
        if(MyTools.isNotEmpty(stNjInner4.getBianzhuguandanweibanli())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("bgywzgdwblqk");
            jc.setAttrValue(stNjInner4.getBianzhuguandanweibanli());lists.add(jc);}

        //变主管单位时间
        if(MyTools.isNotEmpty(stNjInner4.getBianzhuguandanweishijian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("bgywzgdwpzsj");
            jc.setAttrValue(stNjInner4.getBianzhuguandanweishijian().toString());lists.add(jc);}

        //修改章程
        if(MyTools.isNotEmpty(stNjInner4.getXiugaizhangcheng())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("xgzc");
            jc.setAttrValue(stNjInner4.getXiugaizhangcheng());lists.add(jc);}

        //修改章程办理
        if(MyTools.isNotEmpty(stNjInner4.getXiugaizhangchengbanli())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("xgzcblqk");
            jc.setAttrValue(stNjInner4.getXiugaizhangchengbanli());lists.add(jc);}

        //修改章程时间
        if(MyTools.isNotEmpty(stNjInner4.getXiugaizhangchengshijian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("xgzcpzsj");
            jc.setAttrValue(stNjInner4.getXiugaizhangchengshijian().toString());lists.add(jc);}

        //负责人变更
        if(MyTools.isNotEmpty(stNjInner4.getFuzerenbiangeng())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("fzrbgba");
            jc.setAttrValue(stNjInner4.getFuzerenbiangeng());lists.add(jc);}

        //负责人变更办理
        if(MyTools.isNotEmpty(stNjInner4.getFuzerenbiangengbanli())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("fzrbgbablqk");
            jc.setAttrValue(stNjInner4.getFuzerenbiangengbanli());lists.add(jc);}

        //负责人变时间
        if(MyTools.isNotEmpty(stNjInner4.getFuzerenbianshijian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("fzrbgbapzsj");
            jc.setAttrValue(stNjInner4.getFuzerenbianshijian().toString());lists.add(jc);}

        jc = null;
        return lists;
    }
}
