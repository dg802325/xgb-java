package com.xgb.utils;

import com.xgb.model.JcContentAttr1;
import com.xgb.model.StNjInner4;
import com.xgb.model.StNjJbgyhdSub;
import com.xgb.util.MyTools;

import java.util.ArrayList;
import java.util.List;

public class Save2142 {

    public static List<JcContentAttr1> getEntity(Integer contentId, StNjJbgyhdSub stNjJbgyhdSub) {
        List<JcContentAttr1> lists = new ArrayList<>();

        //活动名称
        if(MyTools.isNotEmpty(stNjJbgyhdSub.getHuodongmingcheng())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("title");
            jc.setAttrValue(stNjJbgyhdSub.getHuodongmingcheng());lists.add(jc);jc=null;}

        //实施地域
        if(MyTools.isNotEmpty(stNjJbgyhdSub.getShisidiyu())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("ssdy");
            jc.setAttrValue(stNjJbgyhdSub.getShisidiyu());lists.add(jc);jc=null;}

        //起止时间
        if(MyTools.isNotEmpty(stNjJbgyhdSub.getShijian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("qzsj");
            jc.setAttrValue(stNjJbgyhdSub.getShijian());lists.add(jc);jc=null;}

        //活动支出
        if(MyTools.isNotEmpty(stNjJbgyhdSub.getZhichu())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("hdzc");
            jc.setAttrValue(stNjJbgyhdSub.getZhichu());lists.add(jc);jc=null;}

        //服务方式
        if(MyTools.isNotEmpty(stNjJbgyhdSub.getFangshi())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("zyfwfs");
            jc.setAttrValue(stNjJbgyhdSub.getFangshi());lists.add(jc);jc=null;}

        //服务领域
        if(MyTools.isNotEmpty(stNjJbgyhdSub.getLingyu())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("zyfwly");
            jc.setAttrValue(stNjJbgyhdSub.getLingyu());lists.add(jc);jc=null;}

        //服务对象
        if(MyTools.isNotEmpty(stNjJbgyhdSub.getDueixiang())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("syrq");
            jc.setAttrValue(stNjJbgyhdSub.getDueixiang());lists.add(jc);jc=null;}

        return lists;
    }
}
