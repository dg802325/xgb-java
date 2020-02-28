package com.xgb.utils.Jjh;

;

import com.xgb.model.JcContentAttr1;
import com.xgb.model.JjhnjGlfgxjjySub;
import com.xgb.util.MyTools;

import java.util.ArrayList;
import java.util.List;
/**
* @Auther: 
* @Date: 
* @Description:
*/
public class Save2401 {

    public static List<JcContentAttr1> getEntity(Integer contentId, JjhnjGlfgxjjySub oldTable) {
        List<JcContentAttr1> lists = new ArrayList<>();
        JcContentAttr1 jc = null;

        if(MyTools.isNotEmpty(oldTable.getGuanlianfang())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("glf");
            jc.setAttrValue(oldTable.getGuanlianfang());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getGuanxi())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("yjjhdgx");
            jc.setAttrValue(oldTable.getGuanxi());lists.add(jc);}



        jc = null;

        return lists;
    }
}

