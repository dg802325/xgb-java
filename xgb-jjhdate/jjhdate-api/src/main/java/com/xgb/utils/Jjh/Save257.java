package com.xgb.utils.Jjh;

;

import com.xgb.model.JcContentAttr1;
import com.xgb.model.JjhnjJshjdgltab;
import com.xgb.model.JjhnjXxgk;
import com.xgb.util.MyTools;

import java.util.ArrayList;
import java.util.List;
/**
* @Auther: 
* @Date: 
* @Description:
*/
public class Save257 {

    public static List<JcContentAttr1> getEntity(Integer contentId, JjhnjXxgk oldTable) {
        List<JcContentAttr1> lists = new ArrayList<>();
        JcContentAttr1 jc = null;

        if(MyTools.isNotEmpty(oldTable.getIsgongkai  ())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("dNmwZvMF");
            jc.setAttrValue(oldTable.getIsgongkai  ().toString());lists.add(jc);}



        jc = null;

        return lists;
    }
}

