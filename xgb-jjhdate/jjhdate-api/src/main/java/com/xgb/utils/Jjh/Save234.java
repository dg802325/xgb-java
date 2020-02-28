package com.xgb.utils.Jjh;

;

import com.xgb.model.JcContentAttr1;
import com.xgb.model.JjhnjCsbaIndex;
import com.xgb.util.MyTools;

import java.util.ArrayList;
import java.util.List;
/**
* @Auther: 
* @Date: 
* @Description:
*/
public class Save234 {

    public static List<JcContentAttr1> getEntity(Integer contentId, JjhnjCsbaIndex oldTable) {
        List<JcContentAttr1> lists = new ArrayList<>();
        JcContentAttr1 jc = null;

        if(MyTools.isNotEmpty(oldTable.getMujuanzongji1())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("tUjVLgFG");
            jc.setAttrValue(oldTable.getMujuanzongji1().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getHulianwangmujuan1())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("pSPhzyoO");
            jc.setAttrValue(oldTable.getHulianwangmujuan1().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getYidimujuan1())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("dNkfxpcR");
            jc.setAttrValue(oldTable.getYidimujuan1().toString());lists.add(jc);}



        jc = null;

        return lists;
    }
}

