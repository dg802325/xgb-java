package com.xgb.utils.Jjh;

;

import com.xgb.model.JcContentAttr1;
import com.xgb.model.JjhNjReportZxqkItem;
import com.xgb.util.MyTools;

import java.util.ArrayList;
import java.util.List;
/**
* @Auther: 
* @Date: 
* @Description:
*/
public class Save2292 {

    public static List<JcContentAttr1> getEntity(Integer contentId, JjhNjReportZxqkItem oldTable) {
        List<JcContentAttr1> lists = new ArrayList<>();
        JcContentAttr1 jc = null;

        if(MyTools.isNotEmpty(oldTable.getGuanlijigou())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("sjclzxjjgljg");
            jc.setAttrValue(oldTable.getGuanlijigou().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getJigourenshu())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("zxjjgljgrs");
            jc.setAttrValue(oldTable.getJigourenshu().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getHuiyicishu())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("bnzkhycs");
            jc.setAttrValue(oldTable.getHuiyicishu().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getZijinlaiyuan())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("mjzjly");
            jc.setAttrValue(oldTable.getZijinlaiyuan().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getShifoufuhe())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("zjdsysffhjjhglzdhzc");
            jc.setAttrValue(oldTable.getShifoufuhe().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getKzgymingcheng())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("kzdgyxmmc");
            jc.setAttrValue(oldTable.getKzgymingcheng().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getGkmeiti())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("xxgkdmt");
            jc.setAttrValue(oldTable.getGkmeiti().toString());lists.add(jc);}



        jc = null;

        return lists;
    }
}

