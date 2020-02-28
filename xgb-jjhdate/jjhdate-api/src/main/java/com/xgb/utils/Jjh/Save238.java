package com.xgb.utils.Jjh;

;

import com.xgb.model.JcContentAttr1;
import com.xgb.model.JjhnjZhdgyxmdezhfdxSub;
import com.xgb.util.MyTools;

import java.util.ArrayList;
import java.util.List;
/**
* @Auther: 
* @Date: 
* @Description:
*/
public class Save238 {

    public static List<JcContentAttr1> getEntity(Integer contentId, JjhnjZhdgyxmdezhfdxSub oldTable) {
        List<JcContentAttr1> lists = new ArrayList<>();
        JcContentAttr1 jc = null;

        if(MyTools.isNotEmpty(oldTable.getXiangmumingcheng    ())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("title");
            jc.setAttrValue(oldTable.getXiangmumingcheng    ());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getDaezhifuduixiang())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("dezfdx");
            jc.setAttrValue(oldTable.getDaezhifuduixiang());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getZhifujine ())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("zfje");
            jc.setAttrValue(oldTable.getZhifujine ().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getBili   ())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("zjqhbl");
            jc.setAttrValue(oldTable.getBili   ());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getYongtu ())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("yongtu");
            jc.setAttrValue(oldTable.getYongtu ());lists.add(jc);}



        jc = null;

        return lists;
    }
}

