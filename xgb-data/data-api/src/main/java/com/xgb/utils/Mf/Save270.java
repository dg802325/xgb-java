package com.xgb.utils.Mf;

import com.xgb.model.JcContentAttr1;
import com.xgb.model.NjGwyjzSub;
import com.xgb.model.StNjInner4;
import com.xgb.util.DateUtils;
import com.xgb.util.MyTools;

import java.util.ArrayList;
import java.util.List;

public class Save270 {

    public static List<JcContentAttr1> getEntity(Integer contentId, NjGwyjzSub njGwyjzSub) {
        List<JcContentAttr1> lists = new ArrayList<>();
        JcContentAttr1 jc = null;
        //性别
        if(MyTools.isNotEmpty(njGwyjzSub.getXingbie())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("xb");
            jc.setAttrValue(njGwyjzSub.getXingbie());lists.add(jc);}

        //出生年月
        if(MyTools.isNotEmpty(njGwyjzSub.getChushengnianyue())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("csny");
            jc.setAttrValue(DateUtils.dateToyyyyMMdd(njGwyjzSub.getChushengnianyue()));lists.add(jc);}

        //单位职务
        if(MyTools.isNotEmpty(njGwyjzSub.getDanweizhiwu())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("mfzwnzw");
            jc.setAttrValue(njGwyjzSub.getDanweizhiwu());lists.add(jc);}

        //工作单位
        if(MyTools.isNotEmpty(njGwyjzSub.getGongzuodanwei())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("gzdw");
            jc.setAttrValue(njGwyjzSub.getGongzuodanwei());lists.add(jc);}

        //在职状态
        if(MyTools.isNotEmpty(njGwyjzSub.getZaizhizhuangtai())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("zzzt");
            jc.setAttrValue(njGwyjzSub.getZaizhizhuangtai());lists.add(jc);}

        //职务
        if(MyTools.isNotEmpty(njGwyjzSub.getZhiwu())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("zw1");
            jc.setAttrValue(njGwyjzSub.getZhiwu());lists.add(jc);}

        //领酬情况
        if(MyTools.isNotEmpty(njGwyjzSub.getLingchouqingkuang())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("lcqk");
            jc.setAttrValue(njGwyjzSub.getLingchouqingkuang());lists.add(jc);}

        //批准单位
        if(MyTools.isNotEmpty(njGwyjzSub.getPizhundanwei())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("pzdw");
            jc.setAttrValue(njGwyjzSub.getPizhundanwei());lists.add(jc);}

        //批准时间
        if(MyTools.isNotEmpty(njGwyjzSub.getPizhunshijian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("pzsj");
            jc.setAttrValue(DateUtils.dateToyyyyMMdd(njGwyjzSub.getPizhunshijian()));lists.add(jc);}

        jc = null;
        return lists;
    }
}
