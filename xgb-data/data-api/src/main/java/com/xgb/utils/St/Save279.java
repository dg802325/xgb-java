package com.xgb.utils.St;

import com.xgb.model.JcContentAttr1;
import com.xgb.model.StNjAdministratCostInx;
import com.xgb.util.MyTools;

import java.util.ArrayList;
import java.util.List;

public class Save279 {

    public static List<JcContentAttr1> getEntity(Integer contentId, StNjAdministratCostInx stNjAdministratCostInx) {
        List<JcContentAttr1> lists = new ArrayList<>();
        JcContentAttr1 jc = null;
        //年度行政事业性收费总额
        if(MyTools.isNotEmpty(stNjAdministratCostInx.getXingzhengshoufeizonge())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("fjitKCmH");
            jc.setAttrValue(stNjAdministratCostInx.getXingzhengshoufeizonge().toString());lists.add(jc);}


        //年度是否存在利用政府名义或政府委托事项为由擅自设立收费项目、提高收费标准
        if(MyTools.isNotEmpty(stNjAdministratCostInx.getShifoushanzigenggai())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("YKWHVuym");
            jc.setAttrValue(stNjAdministratCostInx.getShifoushanzigenggai());lists.add(jc);}

        //擅自涉及金额（万元）
        if(MyTools.isNotEmpty(stNjAdministratCostInx.getShanzishejijine())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("YKmmVuym");
            jc.setAttrValue(stNjAdministratCostInx.getShanzishejijine().toString());lists.add(jc);}

        //年度自行调减收费，减轻企业负担，涉及金额（万元）
        if(MyTools.isNotEmpty(stNjAdministratCostInx.getZixingjianmianshoufei())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("OPxQUuuU");
            jc.setAttrValue(stNjAdministratCostInx.getZixingjianmianshoufei().toString());lists.add(jc);}

        //年度自行调减收费，减轻企业负担，涉及金额（万元）具体情况
        if(MyTools.isNotEmpty(stNjAdministratCostInx.getJianmianshoufeijutiqingkuang())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("aqLvimok");
            jc.setAttrValue(stNjAdministratCostInx.getJianmianshoufeijutiqingkuang());lists.add(jc);}

        //年度违规行为整改，涉及金额（万元）
        if(MyTools.isNotEmpty(stNjAdministratCostInx.getZhenggaijine())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("tHThfxnw");
            jc.setAttrValue(stNjAdministratCostInx.getZhenggaijine().toString());lists.add(jc);}

        //年度违规行为整改，涉及金额（万元）具体情况
        if(MyTools.isNotEmpty(stNjAdministratCostInx.getZhenggaijinejutiqingkuang())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("AhwcqIoe");
            jc.setAttrValue(stNjAdministratCostInx.getZhenggaijinejutiqingkuang());lists.add(jc);}

        jc = null;

        return lists;
    }
}
