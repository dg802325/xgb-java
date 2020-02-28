package com.xgb.utils.St;

import com.xgb.model.JcContentAttr1;
import com.xgb.model.StNjGzjhSub;
import com.xgb.model.StNjInner4;
import com.xgb.util.MyTools;

import java.util.ArrayList;
import java.util.List;

public class Save2131 {

    public static List<JcContentAttr1> getEntity(Integer contentId, StNjGzjhSub stNjGzjhSub) {
        List<JcContentAttr1> lists = new ArrayList<>();
        JcContentAttr1 jc = null;
        //计划开展活动内容
        if(MyTools.isNotEmpty(stNjGzjhSub.getJihuaneirong())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("hdnr");
            jc.setAttrValue(stNjGzjhSub.getJihuaneirong());lists.add(jc);}

        //服务领域
        if(MyTools.isNotEmpty(stNjGzjhSub.getLingyu())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("hdly");
            jc.setAttrValue(stNjGzjhSub.getLingyu());lists.add(jc);}

        //活动类型
        if(MyTools.isNotEmpty(stNjGzjhSub.getLeixing())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("hdlx");
            jc.setAttrValue(stNjGzjhSub.getLeixing());lists.add(jc);}

        jc = null;
        return lists;
    }
}
