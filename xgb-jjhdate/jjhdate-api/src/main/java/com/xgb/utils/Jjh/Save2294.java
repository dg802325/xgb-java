package com.xgb.utils.Jjh;

;

import com.xgb.model.JcContentAttr1;
import com.xgb.model.JjhNjReportQtnsjgItem;
import com.xgb.util.MyTools;

import java.util.ArrayList;
import java.util.List;
/**
* @Auther: 
* @Date: 
* @Description:
*/
public class Save2294 {

    public static List<JcContentAttr1> getEntity(Integer contentId, JjhNjReportQtnsjgItem oldTable) {
        List<JcContentAttr1> lists = new ArrayList<>();
        JcContentAttr1 jc = null;

        if(MyTools.isNotEmpty(oldTable.getMingcheng())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("mc");
            jc.setAttrValue(oldTable.getMingcheng().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getFuzeren())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("fzr");
            jc.setAttrValue(oldTable.getFuzeren().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getZhusuo())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("zs");
            jc.setAttrValue(oldTable.getZhusuo().toString());lists.add(jc);}



        jc = null;

        return lists;
    }
}

