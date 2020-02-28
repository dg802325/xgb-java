package com.xgb.utils.Jjh;

;

import com.xgb.model.JcContentAttr1;
import com.xgb.model.JjhnjChengjishuomingSub;
import com.xgb.util.MyTools;

import java.util.ArrayList;
import java.util.List;
/**
* @Auther: 
* @Date: 
* @Description:
*/
public class Save241 {

    public static List<JcContentAttr1> getEntity(Integer contentId, JjhnjChengjishuomingSub oldTable) {
        List<JcContentAttr1> lists = new ArrayList<>();
        JcContentAttr1 jc = null;

        if(MyTools.isNotEmpty(oldTable.getChengji())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("cxLNcIVv");
            jc.setAttrValue(oldTable.getChengji());lists.add(jc);}



        jc = null;

        return lists;
    }
}

