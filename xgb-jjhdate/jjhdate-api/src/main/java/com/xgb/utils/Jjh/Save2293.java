package com.xgb.utils.Jjh;

import com.xgb.model.JcContentAttr1;
import com.xgb.model.JjhNjReportQtnsjgItem;
import com.xgb.model.Stnianjianreport9Sub;
import com.xgb.util.DateUtils;
import com.xgb.util.MyTools;

import java.util.ArrayList;
import java.util.List;

;

/**
* @Auther: 
* @Date: 
* @Description:
*/
public class Save2293 {

    public static List<JcContentAttr1> getEntity(Integer contentId, Stnianjianreport9Sub oldTable) {
        List<JcContentAttr1> lists = new ArrayList<>();
        JcContentAttr1 jc = null;

        if(MyTools.isNotEmpty(oldTable.getMingcheng())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("mc");
            jc.setAttrValue(oldTable.getMingcheng().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getDengjishijian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("clsj");
            jc.setAttrValue(DateUtils.dateToyyyyMMdd(oldTable.getDengjishijian()));lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getFuzeren())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("fzr");
            jc.setAttrValue(oldTable.getFuzeren().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getZhusuo())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("zs");
            jc.setAttrValue(oldTable.getZhusuo().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getZhanghu())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("zhxz");
            jc.setAttrValue(oldTable.getZhanghu().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getYinhangjizhanghao())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("khyh");
            jc.setAttrValue(oldTable.getYinhangjizhanghao().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getDengjizhenghao())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("zh");
            jc.setAttrValue(oldTable.getDengjizhenghao().toString());lists.add(jc);}

        jc = null;

        return lists;
    }
}

