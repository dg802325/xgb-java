package com.xgb.utils.St;

import com.xgb.model.JcContentAttr1;
import com.xgb.model.StDjqk4;
import com.xgb.model.StNjReport3;
import com.xgb.util.MyTools;

import java.util.ArrayList;
import java.util.List;

public class Save206 {

    public static List<JcContentAttr1> getEntity(Integer contentId, StDjqk4 stDjqk4) {
        List<JcContentAttr1> lists = new ArrayList<>();
        JcContentAttr1 jc = null;
        
        //党员总数
        if(MyTools.isNotEmpty(stDjqk4.getDangyuanzongshu())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("dangyrs");
            jc.setAttrValue(stDjqk4.getDangyuanzongshu().toString());lists.add(jc);}

        //自评分数
        if(MyTools.isNotEmpty(stDjqk4.getYuanjishu())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("dangjkhpf");
            jc.setAttrValue(stDjqk4.getYuanjishu().toString());lists.add(jc);}

        //是否建立工会
        if(MyTools.isNotEmpty(stDjqk4.getDanrenzhiwu())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("jsjlgh");
            jc.setAttrValue(stDjqk4.getDanrenzhiwu());lists.add(jc);}

        //是否建立团组织
        if(MyTools.isNotEmpty(stDjqk4.getNianling())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("ssjltzz");
            jc.setAttrValue(stDjqk4.getNianling());lists.add(jc);}

        //是否建立妇联
        if(MyTools.isNotEmpty(stDjqk4.getXueli())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("sfjlfl");
            jc.setAttrValue(stDjqk4.getXueli());lists.add(jc);}

        //群团组织活动次数
        if(MyTools.isNotEmpty(stDjqk4.getLiudongshu())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("qtzzhdcs");
            jc.setAttrValue(stDjqk4.getLiudongshu().toString());lists.add(jc);}

        //是否派遣
        if(MyTools.isNotEmpty(stDjqk4.getDangleixing())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("sfpq");
            jc.setAttrValue(stDjqk4.getDangleixing());lists.add(jc);}

        //工作情况
        if(MyTools.isNotEmpty(stDjqk4.getLishuguanxi())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("gongzuoqingkuang");
            jc.setAttrValue(stDjqk4.getLishuguanxi());lists.add(jc);}

        //已建立
        if(MyTools.isNotEmpty(stDjqk4.getJianlidang1())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("yijianli");
            jc.setAttrValue(stDjqk4.getJianlidang1());lists.add(jc);}

        //其他注明
        if(MyTools.isNotEmpty(stDjqk4.getJianlidang2())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("jianlidang2");
            jc.setAttrValue(stDjqk4.getJianlidang2());lists.add(jc);}

        //党建考核自评等级
        if(MyTools.isNotEmpty(stDjqk4.getZuzhimingcheng())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("dangjiandengji");
            jc.setAttrValue(stDjqk4.getZuzhimingcheng());lists.add(jc);}

        jc= null;

        return lists;
    }
}
