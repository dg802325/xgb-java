package com.xgb.utils.Jjh;

import com.xgb.model.JcContentAttr1;
import com.xgb.model.JjhnjYzhdqkSub;
import com.xgb.util.MyTools;

import java.util.ArrayList;
import java.util.List;
/**
* @Auther: 
* @Date: 
* @Description:
*/
public class Save236 {

    public static List<JcContentAttr1> getEntity(Integer contentId, JjhnjYzhdqkSub oldTable) {
        List<JcContentAttr1> lists = new ArrayList<>();
        JcContentAttr1 jc = null;

        if(MyTools.isNotEmpty(oldTable.getXiangmumingcheng())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("rmXPnWXo");
            jc.setAttrValue(oldTable.getXiangmumingcheng());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getXiangmuzhichu())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("yftizpwXhu");
            jc.setAttrValue(oldTable.getXiangmuzhichu().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getMinshengbaozhang())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("xNQOezygsheng");
            jc.setAttrValue(oldTable.getMinshengbaozhang().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getFupinjikun())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("xNQOezygshi");
            jc.setAttrValue(oldTable.getFupinjikun().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getQita())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("xNQOezygqu");
            jc.setAttrValue(oldTable.getQita().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getXiangmuneirong())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("hZpMIHvR");
            jc.setAttrValue(oldTable.getXiangmuneirong());lists.add(jc);}



        jc = null;

        return lists;
    }
}

