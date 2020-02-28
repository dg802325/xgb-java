package com.xgb.utils.Jjh;

import com.xgb.model.JcContentAttr1;
import com.xgb.model.JjhnjGlfwjsyushxmyeSub;
import com.xgb.model.SNianjianBranch;
import com.xgb.util.MyTools;

import java.util.ArrayList;
import java.util.List;

public class Save229 {

    public static List<JcContentAttr1> getEntity(Integer contentId, SNianjianBranch oldTable) {
        List<JcContentAttr1> lists = new ArrayList<>();
        JcContentAttr1 jc = null;

        if(MyTools.isNotEmpty(oldTable.getJijinshu())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("WuRqFvJw");
            jc.setAttrValue(oldTable.getJijinshu().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getXinshejijinshu())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("dnyNurie");
            jc.setAttrValue(oldTable.getXinshejijinshu().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getZhuxiaojijinshu())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("ehaBqgmr");
            jc.setAttrValue(oldTable.getZhuxiaojijinshu().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getDaibiaoshu())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("NsYnmDXM");
            jc.setAttrValue(oldTable.getDaibiaoshu().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getXinshedaibiaoshu())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("KLflbCiA");
            jc.setAttrValue(oldTable.getXinshedaibiaoshu().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getZhuxiaodaibiaoshu())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("uzgjdqon");
            jc.setAttrValue(oldTable.getZhuxiaodaibiaoshu().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getNeisheshu())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("YanNChop");
            jc.setAttrValue(oldTable.getNeisheshu().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getXinsheneisheshu())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("nsjgxz");
            jc.setAttrValue(oldTable.getXinsheneisheshu().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getZhuxiaoneisheshu())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("nsjgzx");
            jc.setAttrValue(oldTable.getZhuxiaoneisheshu().toString());lists.add(jc);}

        jc = null;

        return lists;
    }

}
