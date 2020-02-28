package com.xgb.utils.Jjh;

;

import com.xgb.model.JcContentAttr1;
import com.xgb.model.JjhNjZbCsxt;
import com.xgb.util.MyTools;

import java.util.ArrayList;
import java.util.List;
/**
* @Auther: 
* @Date: 
* @Description:
*/
public class Save239 {

    public static List<JcContentAttr1> getEntity(Integer contentId, JjhNjZbCsxt oldTable) {
        List<JcContentAttr1> lists = new ArrayList<>();
        JcContentAttr1 jc = null;

        if(MyTools.isNotEmpty(oldTable.getHuodongshu())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("PdryOuEO");
            jc.setAttrValue(oldTable.getHuodongshu().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getLingyu())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("PdryOuEOlingyu");
            jc.setAttrValue(oldTable.getLingyu());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getJine())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("PdryOuEOjiner");
            jc.setAttrValue(oldTable.getJine().toString());lists.add(jc);}



        jc = null;

        return lists;
    }
}

