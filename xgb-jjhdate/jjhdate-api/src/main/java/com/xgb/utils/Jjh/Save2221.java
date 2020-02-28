package com.xgb.utils.Jjh;

;

import com.xgb.model.JcContentAttr1;
import com.xgb.model.JjhnjJgjslsjqkSub;
import com.xgb.util.DateUtils;
import com.xgb.util.MyTools;

import java.util.ArrayList;
import java.util.List;
/**
* @Auther: 
* @Date: 
* @Description:
*/
public class Save2221 {

    public static List<JcContentAttr1> getEntity(Integer contentId, JjhnjJgjslsjqkSub
 oldTable) {
        List<JcContentAttr1> lists = new ArrayList<>();
        JcContentAttr1 jc = null;

        if(MyTools.isNotEmpty(oldTable.getNian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("zkYear");
            jc.setAttrValue(oldTable.getNian());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getYue())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("zkMonth");
            jc.setAttrValue(oldTable.getYue());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getRi())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("zkDay");
            jc.setAttrValue(oldTable.getRi());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getJie())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("zkj");
            jc.setAttrValue(oldTable.getJie());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getCi())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("zkc");
            jc.setAttrValue(oldTable.getCi());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getHuiyishijian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("hysj");
            jc.setAttrValue(DateUtils.dateToyyyyMMdd(oldTable.getHuiyishijian()));lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getHuiyididian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("hydd");
            jc.setAttrValue(oldTable.getHuiyididian());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getHuiyizhuti())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("hyyt");
            jc.setAttrValue(oldTable.getHuiyizhuti());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getChuxilishi1())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("cxlsmd");
            jc.setAttrValue(oldTable.getChuxilishi1());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getWeichuxilishi1())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("wcxlsmd");
            jc.setAttrValue(oldTable.getWeichuxilishi1());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getChuxijianshi1())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("cxjsmd");
            jc.setAttrValue(oldTable.getChuxijianshi1());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getWeichuxijianshi1())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("wcxjsmd");
            jc.setAttrValue(oldTable.getWeichuxijianshi1());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getHuiyijueyi())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("hyjy");
            jc.setAttrValue(oldTable.getHuiyijueyi());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getBeizhu())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("bz");
            jc.setAttrValue(oldTable.getBeizhu());lists.add(jc);}

        jc = null;

        return lists;
    }
}

