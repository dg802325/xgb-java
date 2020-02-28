package com.xgb.utils.Jjh;

;

import com.xgb.model.JcContentAttr1;
import com.xgb.model.JjhNjReportZxqkItem;
import com.xgb.util.DateUtils;
import com.xgb.util.MyTools;

import java.util.ArrayList;
import java.util.List;
/**
* @Auther: 
* @Date: 
* @Description:
*/
public class Save2291 {

    public static List<JcContentAttr1> getEntity(Integer contentId, JjhNjReportZxqkItem oldTable) {
        List<JcContentAttr1> lists = new ArrayList<>();
        JcContentAttr1 jc = null;

        if(MyTools.isNotEmpty(oldTable.getZxjjmingcheng())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("zxjjmc");
            jc.setAttrValue(oldTable.getZxjjmingcheng().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getChenglishijian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("clsj");
            jc.setAttrValue(DateUtils.dateToyyyyMMdd(oldTable.getChenglishijian()));lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getFaqiren())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("fqr");
            jc.setAttrValue(oldTable.getFaqiren().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getChuziren())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("czr");
            jc.setAttrValue(oldTable.getChuziren().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getFuzeren())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("fzr");
            jc.setAttrValue(oldTable.getFuzeren().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getZhanghuxingzhi())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("syzhxz");
            jc.setAttrValue(oldTable.getZhanghuxingzhi().toString());lists.add(jc);}



        jc = null;

        return lists;
    }
}

