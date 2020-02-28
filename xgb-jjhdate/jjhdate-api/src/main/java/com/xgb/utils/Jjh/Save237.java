package com.xgb.utils.Jjh;

;

import com.xgb.model.JcContentAttr1;
import com.xgb.model.JjhnjZhdgyhdshzSub;
import com.xgb.util.MyTools;

import java.util.ArrayList;
import java.util.List;
/**
* @Auther: 
* @Date: 
* @Description:
*/
public class Save237 {

    public static List<JcContentAttr1> getEntity(Integer contentId, JjhnjZhdgyhdshzSub oldTable) {
        List<JcContentAttr1> lists = new ArrayList<>();
        JcContentAttr1 jc = null;

        if(MyTools.isNotEmpty(oldTable.getXiangmumingcheng())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("title");
            jc.setAttrValue(oldTable.getXiangmumingcheng());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getShouru())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("shouru");
            jc.setAttrValue(oldTable.getShouru().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getZhijiekuanwu())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("zjwtqtzz");
            jc.setAttrValue(oldTable.getZhijiekuanwu().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getXiangmurenyuangongzi())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("tgcsfw");
            jc.setAttrValue(oldTable.getXiangmurenyuangongzi().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getZichanshiyongfeiyong())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("fwsbwz");
            jc.setAttrValue(oldTable.getZichanshiyongfeiyong().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getXuanchuanfeiyong())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("glcsxm");
            jc.setAttrValue(oldTable.getXuanchuanfeiyong().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getQitafeiyong())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("qtfy");
            jc.setAttrValue(oldTable.getQitafeiyong().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getZongji())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("zongj");
            jc.setAttrValue(oldTable.getZongji().toString());lists.add(jc);}



        jc = null;

        return lists;
    }
}

