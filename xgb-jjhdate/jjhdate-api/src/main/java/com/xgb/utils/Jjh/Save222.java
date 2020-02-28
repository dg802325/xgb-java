package com.xgb.utils.Jjh;



import com.xgb.model.JcContentAttr1;
import com.xgb.model.JjhnjJgjsljlqk;
import com.xgb.model.JjhnjJgjslsjqkSub;
import com.xgb.util.MyTools;

import java.util.ArrayList;
import java.util.List;

/**
* @Auther: 
* @Date: 
* @Description:
*/
public class Save222 {

    public static List<JcContentAttr1> getEntity(Integer contentId, JjhnjJgjslsjqkSub oldTable, JjhnjJgjsljlqk jjhnjJgjsljlqk) {
        List<JcContentAttr1> lists = new ArrayList<>();
        JcContentAttr1 jc = null;

        if(MyTools.isNotEmpty(jjhnjJgjsljlqk.getAlltimes())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("LSEkixPt");
            jc.setAttrValue(jjhnjJgjsljlqk.getAlltimes().toString());lists.add(jc);}

        jc = null;

        return lists;
    }
}

