package com.xgb.utils.St;

import com.xgb.model.JcContentAttr1;
import com.xgb.model.StNjInner4;
import com.xgb.model.StNjJbgyhdSub;
import com.xgb.util.MyTools;

import java.util.ArrayList;
import java.util.List;

public class Save2142 {

    public static List<JcContentAttr1> getEntity(Integer contentId, StNjJbgyhdSub stNjJbgyhdSub) {
        List<JcContentAttr1> lists = new ArrayList<>();
        JcContentAttr1 jc = null;
        //活动名称
        if(MyTools.isNotEmpty(stNjJbgyhdSub.getHuodongmingcheng())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("title");
            jc.setAttrValue(stNjJbgyhdSub.getHuodongmingcheng());lists.add(jc);}

        //实施地域
        if(MyTools.isNotEmpty(stNjJbgyhdSub.getShisidiyu())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("ssdy");
            jc.setAttrValue(stNjJbgyhdSub.getShisidiyu());lists.add(jc);}

        //起止时间
        if(MyTools.isNotEmpty(stNjJbgyhdSub.getShijian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("qzsj");
            jc.setAttrValue(stNjJbgyhdSub.getShijian());lists.add(jc);}

        //活动支出
        if(MyTools.isNotEmpty(stNjJbgyhdSub.getZhichu())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("hdzc");
            jc.setAttrValue(stNjJbgyhdSub.getZhichu());lists.add(jc);}

        //服务方式
        if(MyTools.isNotEmpty(stNjJbgyhdSub.getFangshi())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("zyfwfs");
            jc.setAttrValue(stNjJbgyhdSub.getFangshi());lists.add(jc);}

        //服务领域
        if(MyTools.isNotEmpty(stNjJbgyhdSub.getLingyu())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("zyfwly");
            jc.setAttrValue(stNjJbgyhdSub.getLingyu());lists.add(jc);}

        //服务对象
        if(MyTools.isNotEmpty(stNjJbgyhdSub.getDueixiang())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("syrq");
            jc.setAttrValue(stNjJbgyhdSub.getDueixiang());lists.add(jc);}

        jc = null;

        return lists;
    }
}
