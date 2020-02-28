package com.xgb.utils.St;

import com.xgb.model.JcContentAttr1;
import com.xgb.model.NjGwyjzSub;
import com.xgb.model.StNjInner4;
import com.xgb.util.MyTools;

import java.util.ArrayList;
import java.util.List;

public class Save2197 {

    public static List<JcContentAttr1> getEntity(Integer contentId, NjGwyjzSub njGwyjzSub) {
        List<JcContentAttr1> lists = new ArrayList<>();
        JcContentAttr1 jc = null;

        //姓名
        if(MyTools.isNotEmpty(njGwyjzSub.getXingming())){
           jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("title");
            jc.setAttrValue(njGwyjzSub.getXingming());lists.add(jc);}

        //工作单位
        if(MyTools.isNotEmpty(njGwyjzSub.getGongzuodanwei())){
           jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("gzdw");
            jc.setAttrValue(njGwyjzSub.getGongzuodanwei());lists.add(jc);}

        //单位职务
        if(MyTools.isNotEmpty(njGwyjzSub.getDanweizhiwu())){
           jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("dwzw");
            jc.setAttrValue(njGwyjzSub.getDanweizhiwu());lists.add(jc);}

        //在职状态
        if(MyTools.isNotEmpty(njGwyjzSub.getZaizhizhuangtai())){
           jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("zzzt");
            jc.setAttrValue(njGwyjzSub.getZaizhizhuangtai());lists.add(jc);}

        //是否批复
        if(MyTools.isNotEmpty(njGwyjzSub.getLingchouqingkuang())){
           jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("sfpf");
            jc.setAttrValue(njGwyjzSub.getLingchouqingkuang());lists.add(jc);}

        //社团职务
        if(MyTools.isNotEmpty(njGwyjzSub.getZhiwu())){
           jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("stzw");
            jc.setAttrValue(njGwyjzSub.getZhiwu());lists.add(jc);}

        //在其他社团兼职数
        if(MyTools.isNotEmpty(njGwyjzSub.getPizhundanwei())){
           jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("zqtstjzs");
            jc.setAttrValue(njGwyjzSub.getPizhundanwei());lists.add(jc);}

        jc = null;
        return lists;
    }
}
