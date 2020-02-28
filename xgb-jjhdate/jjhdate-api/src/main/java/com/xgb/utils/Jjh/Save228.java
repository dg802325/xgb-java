package com.xgb.utils.Jjh;

import com.xgb.model.JcContentAttr1;
import com.xgb.model.StNjInner4;
import com.xgb.util.MyTools;

import java.util.ArrayList;
import java.util.List;

public class Save228 {

    public static List<JcContentAttr1> getEntity(Integer contentId, StNjInner4 oldTable) {
        List<JcContentAttr1> lists = new ArrayList<>();
        JcContentAttr1 jc = null;

        if(MyTools.isNotEmpty(oldTable.getBiangengmingcheng())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("LSEkixPt");
            jc.setAttrValue(oldTable.getBiangengmingcheng().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getBiangengmingcheng())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("LSEkixPt");
            jc.setAttrValue(oldTable.getBiangengmingcheng().toString());lists.add(jc);}


        jc = null;

        return lists;
    }

}
