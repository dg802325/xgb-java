package com.xgb.utils.St;

import com.xgb.model.JcContentAttr1;
import com.xgb.model.MfGwyjzZb;
import com.xgb.model.StNjInner4;
import com.xgb.util.MyTools;

import java.util.ArrayList;
import java.util.List;

public class Save2198 {

    public static List<JcContentAttr1> getEntity(Integer contentId, MfGwyjzZb mfGwyjzZb) {
        List<JcContentAttr1> lists = new ArrayList<>();
        JcContentAttr1 jc = null;
        //姓名
        if(MyTools.isNotEmpty(mfGwyjzZb.getXingming())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("title");
            jc.setAttrValue(mfGwyjzZb.getXingming());lists.add(jc);}

        //工作单位
        if(MyTools.isNotEmpty(mfGwyjzZb.getGongzuodanwei())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("gzdw");
            jc.setAttrValue(mfGwyjzZb.getGongzuodanwei());lists.add(jc);}

        //单位职务
        if(MyTools.isNotEmpty(mfGwyjzZb.getDanweizhiwu())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("dwzw");
            jc.setAttrValue(mfGwyjzZb.getDanweizhiwu());lists.add(jc);}

        //在职状态
        if(MyTools.isNotEmpty(mfGwyjzZb.getZaizhizhuangtai())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("zzzt");
            jc.setAttrValue(mfGwyjzZb.getZaizhizhuangtai());lists.add(jc);}

        //联系方式
        if(MyTools.isNotEmpty(mfGwyjzZb.getPizhundanwei())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("lxfs");
            jc.setAttrValue(mfGwyjzZb.getPizhundanwei());lists.add(jc);}

        jc = null;
        return lists;
    }
}
