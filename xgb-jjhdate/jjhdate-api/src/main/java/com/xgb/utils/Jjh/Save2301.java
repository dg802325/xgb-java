package com.xgb.utils.Jjh;

import com.xgb.model.JcContentAttr1;
import com.xgb.model.JjhnjYewhddaejzpageSub;
import com.xgb.util.MyTools;

import java.util.ArrayList;
import java.util.List;

;

/**
* @Auther: 
* @Date: 
* @Description:
*/
public class Save2301 {

    public static List<JcContentAttr1> getEntity(Integer contentId, JjhnjYewhddaejzpageSub oldTable) {
        List<JcContentAttr1> lists = new ArrayList<>();
        JcContentAttr1 jc = null;

        if(MyTools.isNotEmpty(oldTable.getJuanzengren())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("JUANZENGREN");
            jc.setAttrValue(oldTable.getJuanzengren());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getBennianjuanzenge())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("BENNIANJUANZENGE");
            jc.setAttrValue(oldTable.getBennianjuanzenge());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getYongtu())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("YONGTU");
            jc.setAttrValue(oldTable.getYongtu());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getJuankuan())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("JUANKUAN");
            jc.setAttrValue(oldTable.getJuankuan().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getJuankuanyongtu())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("JUANKUANYONGTU");
            jc.setAttrValue(oldTable.getJuankuanyongtu());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getJuanwu())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("JUANWU");
            jc.setAttrValue(oldTable.getJuanwu().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getJuanwuyongtu())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("JUANWUYONGTU");
            jc.setAttrValue(oldTable.getJuanwuyongtu());lists.add(jc);}



        jc = null;

        return lists;
    }
}

