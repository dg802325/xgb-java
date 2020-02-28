package com.xgb.utils.St;

import com.xgb.model.JcContentAttr1;
import com.xgb.model.StNjInner4;
import com.xgb.model.StNjReport17Sub1;
import com.xgb.util.MyTools;

import java.util.ArrayList;
import java.util.List;

public class Save2192 {

    public static List<JcContentAttr1> getEntity(Integer contentId, StNjReport17Sub1 stNjReport17Sub1) {
        List<JcContentAttr1> lists = new ArrayList<>();
        JcContentAttr1 jc = null;
        //国际组织类型
        if(MyTools.isNotEmpty(stNjReport17Sub1.getGuojizuzhileixing())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("gjzzlx");
            jc.setAttrValue(stNjReport17Sub1.getGuojizuzhileixing());lists.add(jc);}

        //参加时间
        if(MyTools.isNotEmpty(stNjReport17Sub1.getCanjiashijian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("cjsj");
            jc.setAttrValue(stNjReport17Sub1.getCanjiashijian().toString());lists.add(jc);}

        //缴纳会费数额
        if(MyTools.isNotEmpty(stNjReport17Sub1.getJiaonahuifeishue())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("jnhfse");
            jc.setAttrValue(stNjReport17Sub1.getJiaonahuifeishue().toString());lists.add(jc);}

        //职务类型
        if(MyTools.isNotEmpty(stNjReport17Sub1.getZhiwuleixing())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("fwlx");
            jc.setAttrValue(stNjReport17Sub1.getZhiwuleixing());lists.add(jc);}

        //任职起始时间
        if(MyTools.isNotEmpty(stNjReport17Sub1.getRenzhiqishishijian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("drqzsj");
            jc.setAttrValue(stNjReport17Sub1.getRenzhiqishishijian().toString());lists.add(jc);}

        jc = null;

        return lists;
    }
}
