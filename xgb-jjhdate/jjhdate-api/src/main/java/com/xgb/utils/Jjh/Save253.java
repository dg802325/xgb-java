package com.xgb.utils.Jjh;

import com.xgb.model.JcContentAttr1;
import com.xgb.model.JjhnjJshjdgltab;
import com.xgb.model.StNjQgothercase19Sub;
import com.xgb.util.MyTools;

import java.util.ArrayList;
import java.util.List;

;

/**
* @Auther: 
* @Date: 
* @Description:
*/
public class Save253 {

    public static List<JcContentAttr1> getEntity(Integer contentId, StNjQgothercase19Sub oldTable) {
        List<JcContentAttr1> lists = new ArrayList<>();
        JcContentAttr1 jc = null;

        if(MyTools.isNotEmpty(oldTable.getQitaqingkuang ())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("hgAFCziB");
            jc.setAttrValue(oldTable.getQitaqingkuang ());lists.add(jc);}



        jc = null;

        return lists;
    }
}

