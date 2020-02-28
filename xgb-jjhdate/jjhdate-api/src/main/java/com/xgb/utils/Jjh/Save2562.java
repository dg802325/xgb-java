package com.xgb.utils.Jjh;

import com.xgb.model.JcContentAttr1;
import com.xgb.model.JjhNjReportGqstqkItem;
import com.xgb.util.MyTools;

import java.util.ArrayList;
import java.util.List;

public class Save2562 {

    public static List<JcContentAttr1> getEntity(Integer contentId, JjhNjReportGqstqkItem oldTable) {
        List<JcContentAttr1> lists = new ArrayList<>();
        JcContentAttr1 jc = null;

        if(MyTools.isNotEmpty(oldTable.getQichuyue())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("qcye");
            jc.setAttrValue(oldTable.getQichuyue().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getBenqizengjia())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("bqzj");
            jc.setAttrValue(oldTable.getBenqizengjia().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getBenqijianshao())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("bqjs");
            jc.setAttrValue(oldTable.getBenqijianshao().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getQimoyue())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("qmye");
            jc.setAttrValue(oldTable.getQimoyue().toString());lists.add(jc);}

        jc = null;

        return lists;
    }
}
