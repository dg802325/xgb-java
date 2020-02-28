package com.xgb.utils.Jjh;

;

import com.xgb.model.JcContentAttr1;
import com.xgb.model.JjhnjGyhdmx;
import com.xgb.util.MyTools;

import java.util.ArrayList;
import java.util.List;
/**
* @Auther: 
* @Date: 
* @Description:
*/
public class Save233 {

    public static List<JcContentAttr1> getEntity(Integer contentId, JjhnjGyhdmx oldTable) {
        List<JcContentAttr1> lists = new ArrayList<>();
        JcContentAttr1 jc = null;

        if(MyTools.isNotEmpty(oldTable.getHuodongshu())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("JYbomtlI");
            jc.setAttrValue(oldTable.getHuodongshu().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getZongzhichu())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("JYbomtlI1");
            jc.setAttrValue(oldTable.getZongzhichu().toString());lists.add(jc);}



        jc = null;

        return lists;
    }
}

