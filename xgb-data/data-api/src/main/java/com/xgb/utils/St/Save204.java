package com.xgb.utils.St;

import com.xgb.model.JcContentAttr1;
import com.xgb.model.StDjqk4;
import com.xgb.model.StNjInner4;
import com.xgb.util.DateUtils;
import com.xgb.util.MyTools;

import java.util.ArrayList;
import java.util.List;

public class Save204 {

    public static List<JcContentAttr1> getEntity(Integer contentId, StNjInner4 stNjInner4) {
        List<JcContentAttr1> lists = new ArrayList<>();
        JcContentAttr1 jc = null;
        //会员大会年届
        if(MyTools.isNotEmpty(stNjInner4.getHuiyuandahuinianjie())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("zcgdwydhj");
            jc.setAttrValue(stNjInner4.getHuiyuandahuinianjie().toString());lists.add(jc);}

        //最近一次换届大会时间为
        if(MyTools.isNotEmpty(stNjInner4.getHuanjiedahuishijian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("hjhyzjsj");
            jc.setAttrValue(DateUtils.dateToyyyyMMdd(stNjInner4.getHuanjiedahuishijian()));lists.add(jc);}

        //会员大会年次
        if(MyTools.isNotEmpty(stNjInner4.getHuiyuandahuinianci())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("zcgdwydhc");
            jc.setAttrValue(stNjInner4.getHuiyuandahuinianci().toString());lists.add(jc);}

        //会员大会时间
        if(MyTools.isNotEmpty(stNjInner4.getHuiyuandahuishijian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("zjycdhsj");
            jc.setAttrValue(DateUtils.dateToyyyyMMdd(stNjInner4.getHuiyuandahuishijian()));lists.add(jc);}

        //理事会次
        if(MyTools.isNotEmpty(stNjInner4.getLishihuici())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("lshc");
            jc.setAttrValue(stNjInner4.getLishihuici().toString());lists.add(jc);}

        //理事会本年次
        if(MyTools.isNotEmpty(stNjInner4.getLishihuibennianci())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("bndzklshc");
            jc.setAttrValue(stNjInner4.getLishihuibennianci().toString());lists.add(jc);}

        //常理事会次
        if(MyTools.isNotEmpty(stNjInner4.getChanglishihuici())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("cwlsc");
            jc.setAttrValue(stNjInner4.getChanglishihuici().toString());lists.add(jc);}

        //常理事会本年次
        if(MyTools.isNotEmpty(stNjInner4.getChanglishihuibennianci())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("bnzkcwhc");
            jc.setAttrValue(stNjInner4.getChanglishihuibennianci().toString());lists.add(jc);}


        jc=null;
        return lists;
    }
}
