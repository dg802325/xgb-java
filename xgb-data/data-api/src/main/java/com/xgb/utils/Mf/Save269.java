package com.xgb.utils.Mf;

import com.xgb.model.JcContentAttr1;
import com.xgb.model.LsCybaZb;
import com.xgb.model.StNjInner4;
import com.xgb.util.DateUtils;
import com.xgb.util.MyTools;

import java.util.ArrayList;
import java.util.List;

public class Save269 {

    public static List<JcContentAttr1> getEntity(Integer contentId, LsCybaZb lsCybaZb) {
        List<JcContentAttr1> lists = new ArrayList<>();
        JcContentAttr1 jc = null;
        //出生年月
        if(MyTools.isNotEmpty(lsCybaZb.getChushengnianyue())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("csny");
            jc.setAttrValue(DateUtils.dateToyyyyMMdd(lsCybaZb.getChushengnianyue()));lists.add(jc);}

        //内职务
        if(MyTools.isNotEmpty(lsCybaZb.getNeizhiwu())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("mfzwnzw");
            jc.setAttrValue(lsCybaZb.getNeizhiwu());lists.add(jc);}

        //理事
        if(MyTools.isNotEmpty(lsCybaZb.getLishi())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("lsjs");
            jc.setAttrValue(lsCybaZb.getLishi());lists.add(jc);}

        //及职务
        if(MyTools.isNotEmpty(lsCybaZb.getJizhiwu())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("zw1");
            jc.setAttrValue(lsCybaZb.getJizhiwu());lists.add(jc);}

        //签字
        if(MyTools.isNotEmpty(lsCybaZb.getQianzi())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("brqm");
            jc.setAttrValue(lsCybaZb.getQianzi());lists.add(jc);}

        jc = null;
        return lists;
    }
}
