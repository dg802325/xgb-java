package com.xgb.utils.St;

import com.xgb.model.JcContentAttr1;
import com.xgb.model.StNjGyhdzcSub;
import com.xgb.model.StNjInner4;
import com.xgb.util.MyTools;

import java.util.ArrayList;
import java.util.List;

public class Save2143 {

    public static List<JcContentAttr1> getEntity(Integer contentId, StNjGyhdzcSub stNjGyhdzcSub) {
        List<JcContentAttr1> lists = new ArrayList<>();
        JcContentAttr1 jc = null;
        //公益活动名称
        if(MyTools.isNotEmpty(stNjGyhdzcSub.getMingcheng())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("title");
            jc.setAttrValue(stNjGyhdzcSub.getMingcheng());lists.add(jc);}

        //直接用于受助人的款物
        if(MyTools.isNotEmpty(stNjGyhdzcSub.getKuanwu())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("szrdkw");
            jc.setAttrValue(stNjGyhdzcSub.getKuanwu().toString());lists.add(jc);}

        //人员费用
        if(MyTools.isNotEmpty(stNjGyhdzcSub.getRenyuanfeiyong())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("ryfy");
            jc.setAttrValue(stNjGyhdzcSub.getRenyuanfeiyong().toString());lists.add(jc);}

        //办公费用
        if(MyTools.isNotEmpty(stNjGyhdzcSub.getBangongfeiyong())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("bgfy");
            jc.setAttrValue(stNjGyhdzcSub.getBangongfeiyong().toString());lists.add(jc);}

        //资产使用费用
        if(MyTools.isNotEmpty(stNjGyhdzcSub.getShiyongfeiyong())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("zcsyfy");
            jc.setAttrValue(stNjGyhdzcSub.getShiyongfeiyong().toString());lists.add(jc);}

        //直接筹资费用
        if(MyTools.isNotEmpty(stNjGyhdzcSub.getChouzifeiyong())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("zjczfy");
            jc.setAttrValue(stNjGyhdzcSub.getChouzifeiyong().toString());lists.add(jc);}

        //其他费用
        if(MyTools.isNotEmpty(stNjGyhdzcSub.getQitafeiyong())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("qtfy");
            jc.setAttrValue(stNjGyhdzcSub.getQitafeiyong().toString());lists.add(jc);}

        //总计
        if(MyTools.isNotEmpty(stNjGyhdzcSub.getZongji())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("zj");
            jc.setAttrValue(stNjGyhdzcSub.getZongji().toString());lists.add(jc);}

        jc = null;

        return lists;
    }
}
