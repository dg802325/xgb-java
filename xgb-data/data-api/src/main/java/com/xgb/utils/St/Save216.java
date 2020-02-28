package com.xgb.utils.St;

import com.xgb.model.JcContentAttr1;
import com.xgb.model.StNjAppraiseCost;
import com.xgb.model.StNjInner4;
import com.xgb.util.MyTools;

import java.util.ArrayList;
import java.util.List;

public class Save216 {

    public static List<JcContentAttr1> getEntity(Integer contentId, StNjAppraiseCost stNjAppraiseCost) {
        List<JcContentAttr1> lists = new ArrayList<>();
        JcContentAttr1 jc = null;
        
        //2017年度评比达标表彰收费总额
        if(MyTools.isNotEmpty(stNjAppraiseCost.getBiaozhangshoufeizonge())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("hPXnjNBW");
            jc.setAttrValue(stNjAppraiseCost.getBiaozhangshoufeizonge().toString());lists.add(jc);}

        //2017年度是否存在强制会员参加评比达标表彰活动
        if(MyTools.isNotEmpty(stNjAppraiseCost.getShifouqiangzhidabiao())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("yBmWtlQK");
            jc.setAttrValue(stNjAppraiseCost.getShifouqiangzhidabiao());lists.add(jc);}

        //强制涉及金额（万元）
        if(MyTools.isNotEmpty(stNjAppraiseCost.getQiangzhishejijine())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("yllllllQK");
            jc.setAttrValue(stNjAppraiseCost.getQiangzhishejijine().toString());lists.add(jc);}
        else {
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("HxDZFJdO");
            jc.setAttrValue("1");lists.add(jc);}

        //年度自行减免会费（万元）
        if(MyTools.isNotEmpty(stNjAppraiseCost.getZixingjianmianhuifei())){
        jc = new JcContentAttr1();jc.setContentId(contentId);
        jc.setAttrName("ZbslcsCj");
        jc.setAttrValue(stNjAppraiseCost.getZixingjianmianhuifei().toString());lists.add(jc);}


        //年度自行减免会费（万元）具体情况
        if(MyTools.isNotEmpty(stNjAppraiseCost.getJianmianhuifeijutiqingkuang())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("BfqXYbIt");
            jc.setAttrValue(stNjAppraiseCost.getJianmianhuifeijutiqingkuang());lists.add(jc);}

        //年度违规行为整改，涉及金额（万元）
        if(MyTools.isNotEmpty(stNjAppraiseCost.getZhenggaijine())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("FkmntEwW");
            jc.setAttrValue(stNjAppraiseCost.getZhenggaijine().toString());lists.add(jc);}

        //2016年度违规行为整改，涉及金额（万元）具体情况
        if(MyTools.isNotEmpty(stNjAppraiseCost.getZhenggaijinejutiqingkuang())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("VlrfbWsk");
            jc.setAttrValue(stNjAppraiseCost.getZhenggaijinejutiqingkuang());lists.add(jc);}

        jc = null;
        return lists;
    }
}
