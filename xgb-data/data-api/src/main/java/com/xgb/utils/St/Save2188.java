package com.xgb.utils.St;

import com.xgb.model.JcContentAttr1;
import com.xgb.model.StNjInner4;
import com.xgb.model.StnjSfqkJyfwSub;
import com.xgb.util.MyTools;

import java.util.ArrayList;
import java.util.List;

public class Save2188 {

    public static List<JcContentAttr1> getEntity(Integer contentId, StnjSfqkJyfwSub stnjSfqkJyfwSub) {
        List<JcContentAttr1> lists = new ArrayList<>();
        JcContentAttr1 jc = null;

        //收费时间或者周期
        if(MyTools.isNotEmpty(stnjSfqkJyfwSub.getShoufeibiaozhun())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("sjzq");
            jc.setAttrValue(stnjSfqkJyfwSub.getShoufeibiaozhun());lists.add(jc);}

        //类型
        if(MyTools.isNotEmpty(stnjSfqkJyfwSub.getLeixing())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("leixing");
            jc.setAttrValue(stnjSfqkJyfwSub.getLeixing());lists.add(jc);}

        //对象
        if(MyTools.isNotEmpty(stnjSfqkJyfwSub.getShoufeiyiju())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("duixiang");
            jc.setAttrValue(stnjSfqkJyfwSub.getShoufeiyiju());lists.add(jc);}

        //地点
        if(MyTools.isNotEmpty(stnjSfqkJyfwSub.getDidian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("didian");
            jc.setAttrValue(stnjSfqkJyfwSub.getDidian());lists.add(jc);}

        //批准单位
        if(MyTools.isNotEmpty(stnjSfqkJyfwSub.getBili())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("pzdw");
            jc.setAttrValue(stnjSfqkJyfwSub.getBili());lists.add(jc);}

        //经费来源
        if(MyTools.isNotEmpty(stnjSfqkJyfwSub.getShiyongpiaoju())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("jfly");
            jc.setAttrValue(stnjSfqkJyfwSub.getShiyongpiaoju());lists.add(jc);}

        jc = null;

        return lists;
    }
}
