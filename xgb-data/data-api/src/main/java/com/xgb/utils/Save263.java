package com.xgb.utils;

import com.xgb.model.JcContentAttr1;
import com.xgb.model.StNjInner4;
import com.xgb.util.MyTools;

import java.util.ArrayList;
import java.util.List;

public class Save263 {

    public static List<JcContentAttr1> getEntity(Integer contentId, StNjInner4 stNjInner4) {
        List<JcContentAttr1> lists = new ArrayList<>();

        //证书制度
        if(MyTools.isNotEmpty(stNjInner4.getZhengshuzhidu())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("rutFsUjd");
            jc.setAttrValue(stNjInner4.getZhengshuzhidu());lists.add(jc);jc=null;}

        //证书保管地
        if(MyTools.isNotEmpty(stNjInner4.getZhengshubaoguandi())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("baoguanzai1");
            jc.setAttrValue(stNjInner4.getZhengshubaoguandi());lists.add(jc);jc=null;}

        //印章制度
        if(MyTools.isNotEmpty(stNjInner4.getYinzhangzhidu())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("tauSTcoz");
            jc.setAttrValue(stNjInner4.getYinzhangzhidu());lists.add(jc);jc=null;}

        //印章保管地
        if(MyTools.isNotEmpty(stNjInner4.getYinzhangbaoguandi())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("baoguanzai2");
            jc.setAttrValue(stNjInner4.getYinzhangbaoguandi());lists.add(jc);jc=null;}

        //档案管理制度
        if(MyTools.isNotEmpty(stNjInner4.getDanganzhidu())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("ORFqsbuh");
            jc.setAttrValue(stNjInner4.getDanganzhidu());lists.add(jc);jc=null;}

        //保管在
        if(MyTools.isNotEmpty(stNjInner4.getDanganbaoguandi())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("baoguanzai3");
            jc.setAttrValue(stNjInner4.getDanganbaoguandi());lists.add(jc);jc=null;}

        //专职工作人员签订聘用（劳动）合同人数
        if(MyTools.isNotEmpty(stNjInner4.getHetongrenshu())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("AkgUPEex");
            jc.setAttrValue(stNjInner4.getHetongrenshu().toString());lists.add(jc);jc=null;}

        //专职工作人员平均工资
        if(MyTools.isNotEmpty(stNjInner4.getZhuanzhigongzi())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("PBiqYeUs");
            jc.setAttrValue(stNjInner4.getZhuanzhigongzi().toString());lists.add(jc);jc=null;}

        //失业保险
        if(MyTools.isNotEmpty(stNjInner4.getShiyebaoxian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("AApPdvEP");
            jc.setAttrValue(stNjInner4.getShiyebaoxian().toString());lists.add(jc);jc=null;}

        //养老保险
        if(MyTools.isNotEmpty(stNjInner4.getYanglaobaoxian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("nsLMjIaA");
            jc.setAttrValue(stNjInner4.getYanglaobaoxian().toString());lists.add(jc);jc=null;}

        //医疗保险
        if(MyTools.isNotEmpty(stNjInner4.getYiliaobaoxian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("MVxYLVoU");
            jc.setAttrValue(stNjInner4.getYiliaobaoxian().toString());lists.add(jc);jc=null;}

        //工伤保险
        if(MyTools.isNotEmpty(stNjInner4.getGongshangbaoxian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("KxJLWBrg");
            jc.setAttrValue(stNjInner4.getGongshangbaoxian().toString());lists.add(jc);jc=null;}

        //生育保险
        if(MyTools.isNotEmpty(stNjInner4.getShengyubaoxian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("XGxWuYIg");
            jc.setAttrValue(stNjInner4.getShengyubaoxian().toString());lists.add(jc);jc=null;}

        //公积金
        if(MyTools.isNotEmpty(stNjInner4.getGongjijin())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("FxvrSOYz");
            jc.setAttrValue(stNjInner4.getGongjijin().toString());lists.add(jc);jc=null;}

        //人民币开户银行
        if(MyTools.isNotEmpty(stNjInner4.getKaihuyinxing())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("YKCOXVOO");
            jc.setAttrValue(stNjInner4.getKaihuyinxing());lists.add(jc);jc=null;}

        //人民币银行账号
        if(MyTools.isNotEmpty(stNjInner4.getYinxingzhanghao())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("mLauogbW");
            jc.setAttrValue(stNjInner4.getYinxingzhanghao());lists.add(jc);jc=null;}

        //外币开户银行
        if(MyTools.isNotEmpty(stNjInner4.getWaibikaihuyinxing())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("eGCUPrMI");
            jc.setAttrValue(stNjInner4.getWaibikaihuyinxing());lists.add(jc);jc=null;}

        //外币银行账号
        if(MyTools.isNotEmpty(stNjInner4.getWaibiyinxingzhanghao())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("pNCwKgFG");
            jc.setAttrValue(stNjInner4.getWaibiyinxingzhanghao());lists.add(jc);jc=null;}

        //财政登记
        if(MyTools.isNotEmpty(stNjInner4.getCaizhengdengji())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("DmxaTnei");
            jc.setAttrValue(stNjInner4.getCaizhengdengji());lists.add(jc);jc=null;}

        //财务管理制度
        if(MyTools.isNotEmpty(stNjInner4.getCaiwuguanlizhidu())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("TmHHLALa");
            jc.setAttrValue(stNjInner4.getCaiwuguanlizhidu());lists.add(jc);jc=null;}

        //固定资产管理制度
        if(MyTools.isNotEmpty(stNjInner4.getGuziguanlizhidu())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("pMkmVrlo");
            jc.setAttrValue(stNjInner4.getGuziguanlizhidu());lists.add(jc);jc=null;}

        //执行会计制度
        if(MyTools.isNotEmpty(stNjInner4.getZhixingkuaijizhidu())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("UMZiZCSt");
            jc.setAttrValue(stNjInner4.getZhixingkuaijizhidu());lists.add(jc);jc=null;}

        //财会人员数
        if(MyTools.isNotEmpty(stNjInner4.getCaihuirenyuanshu())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("YrfQCYhG");
            jc.setAttrValue(stNjInner4.getCaihuirenyuanshu().toString());lists.add(jc);jc=null;}

        //执业资格人数
        if(MyTools.isNotEmpty(stNjInner4.getZhiyezigerenshu())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("LHCcEEGX");
            jc.setAttrValue(stNjInner4.getZhiyezigerenshu().toString());lists.add(jc);jc=null;}




        return lists;
    }
}
