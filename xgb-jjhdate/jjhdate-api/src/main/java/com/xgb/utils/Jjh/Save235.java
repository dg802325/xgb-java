package com.xgb.utils.Jjh;

;

import com.xgb.model.JcContentAttr1;
import com.xgb.model.JjhnjYzhdqk;
import com.xgb.util.MyTools;

import java.util.ArrayList;
import java.util.List;
/**
* @Auther: 
* @Date: 
* @Description:
*/
public class Save235 {

    public static List<JcContentAttr1> getEntity(Integer contentId, JjhnjYzhdqk oldTable) {
        List<JcContentAttr1> lists = new ArrayList<>();
        JcContentAttr1 jc = null;

        if(MyTools.isNotEmpty(oldTable.getShifouyuanzang())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("KTTdEJen");
            jc.setAttrValue(oldTable.getShifouyuanzang().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getAlltimes())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("qjmZYFue");
            jc.setAttrValue(oldTable.getAlltimes().toString());lists.add(jc);}



        jc = null;

        return lists;
    }
}

