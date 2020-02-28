package com.xgb.utils.Jjh;

import com.xgb.model.JcContentAttr1;
import com.xgb.model.LsCircs;
import com.xgb.model.LshCircs;
import com.xgb.util.DateUtils;
import com.xgb.util.MyTools;

import java.util.ArrayList;
import java.util.List;

public class Save224 {

    public static List<JcContentAttr1> getEntity(Integer contentId, LsCircs oldTable) {
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
            jc.setAttrName("csny");
            jc.setAttrValue(DateUtils.dateToyyyyMMdd(oldTable.getShengri()));lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getZhengzhimianmao())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("zzmm");
            jc.setAttrValue(oldTable.getZhengzhimianmao().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getBeianshijian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("basj");
            jc.setAttrValue(DateUtils.dateToyyyyMMdd(oldTable.getBeianshijian()));lists.add(jc);}

        StringBuffer qizhishijian = new StringBuffer();
        if(MyTools.isNotEmpty(oldTable.getZi())){
            qizhishijian.append("自").append(oldTable.getZi());
        }
        if(MyTools.isNotEmpty(oldTable.getZhi())){
            qizhishijian.append("至").append(oldTable.getZhi());
        }
        if(MyTools.isNotEmpty(qizhishijian)){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("rqqzsj");
            jc.setAttrValue(qizhishijian.toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getJintie())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("jjhlqbc");
            jc.setAttrValue(oldTable.getJintie().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getBaochoushiyou())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("lqbcbt");
            jc.setAttrValue(oldTable.getBaochoushiyou().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getIfdang())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("gyqydw");
            jc.setAttrValue(oldTable.getIfdang().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getIftuili())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("gbsfbl");
            jc.setAttrValue(oldTable.getIftuili().toString());lists.add(jc);}

        jc = null;

        return lists;
    }

}
