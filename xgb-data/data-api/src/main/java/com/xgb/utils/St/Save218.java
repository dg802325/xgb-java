package com.xgb.utils.St;

import com.xgb.model.JcContentAttr1;
import com.xgb.model.StNjInner4;
import com.xgb.model.StNjServiceCostInx;
import com.xgb.util.MyTools;

import java.util.ArrayList;
import java.util.List;

public class Save218 {

    public static List<JcContentAttr1> getEntity(Integer contentId, StNjServiceCostInx stNjServiceCostInx) {
        List<JcContentAttr1> lists = new ArrayList<>();
        JcContentAttr1 jc = null;
        //年度服务性收费总额（万元）
        if(MyTools.isNotEmpty(stNjServiceCostInx.getFuwushoufeizonge())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("PuGKwOcf");
            jc.setAttrValue(stNjServiceCostInx.getFuwushoufeizonge().toString());lists.add(jc);}

        //年度是否存在强制会员接受服务并收取费用
        if(MyTools.isNotEmpty(stNjServiceCostInx.getShifouqiangzhi())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("BaLcEZiN");
            jc.setAttrValue(stNjServiceCostInx.getShifouqiangzhi());lists.add(jc);}

        //强制涉及金额（万元）
        if(MyTools.isNotEmpty(stNjServiceCostInx.getQiangzhishejijine())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("BllllliN");
            jc.setAttrValue(stNjServiceCostInx.getQiangzhishejijine().toString());lists.add(jc);}

        //年度是否存在利用政府名义或政府委托事项为由擅自设立收费项目
        if(MyTools.isNotEmpty(stNjServiceCostInx.getShifouliyong())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("SRBubusg");
            jc.setAttrValue(stNjServiceCostInx.getShifouliyong());lists.add(jc);}

        //强制涉及金额（万元）
        if(MyTools.isNotEmpty(stNjServiceCostInx.getLiyongshejijine())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("SRBbbbusg");
            jc.setAttrValue(stNjServiceCostInx.getLiyongshejijine().toString());lists.add(jc);}

        //年度自行减免会费（万元）
        if(MyTools.isNotEmpty(stNjServiceCostInx.getZixingjianmianhuifei())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("vUEwFYtU");
            jc.setAttrValue(stNjServiceCostInx.getZixingjianmianhuifei().toString());lists.add(jc);}

        //年度自行减免会费（万元）具体情况
        if(MyTools.isNotEmpty(stNjServiceCostInx.getJianmianhuifeijutiqingkuang())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("YbKhPwiy");
            jc.setAttrValue(stNjServiceCostInx.getJianmianhuifeijutiqingkuang());lists.add(jc);}

        //年度违规行为整改，涉及金额（万元）
        if(MyTools.isNotEmpty(stNjServiceCostInx.getZhenggaijine())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("DFrLwzJp");
            jc.setAttrValue(stNjServiceCostInx.getZhenggaijine().toString());lists.add(jc);}

        //年度违规行为整改，涉及金额（万元）具体情况
        if(MyTools.isNotEmpty(stNjServiceCostInx.getZhenggaijinejutiqingkuang())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("CDUICDPI");
            jc.setAttrValue(stNjServiceCostInx.getZhenggaijinejutiqingkuang());lists.add(jc);}

        jc = null;

        return lists;
    }
}
