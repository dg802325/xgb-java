package com.xgb.utils.Jjh;

import com.xgb.model.JcContentAttr1;
import com.xgb.model.LsCircs;
import com.xgb.model.LshGzry;
import com.xgb.util.DateUtils;
import com.xgb.util.MyTools;

import java.util.ArrayList;
import java.util.List;

public class Save225 {

    public static List<JcContentAttr1> getEntity(Integer contentId, LshGzry oldTable) {
        List<JcContentAttr1> lists = new ArrayList<>();
        JcContentAttr1 jc = null;

        if(MyTools.isNotEmpty(oldTable.getXingming())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("title");
            jc.setAttrValue(oldTable.getXingming());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getXingbie())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("xingbie");
            jc.setAttrValue(oldTable.getXingbie().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getShengri())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("csrq");
            jc.setAttrValue(DateUtils.dateToyyyyMMdd(oldTable.getShengri()));lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getZhengzhimianmao())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("zzmm");
            jc.setAttrValue(oldTable.getZhengzhimianmao().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getXueli())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("xueli");
            jc.setAttrValue(oldTable.getXueli().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getBumenzhiwu())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("szbmzw");
            jc.setAttrValue(oldTable.getBumenzhiwu().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getDangzhibu())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("dzzgx");
            jc.setAttrValue(oldTable.getDangzhibu().toString());lists.add(jc);}

        jc = null;

        return lists;
    }

}
