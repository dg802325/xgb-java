package com.xgb.utils.Mf;

import com.xgb.model.JcContentAttr1;
import com.xgb.model.StNjInner4;
import com.xgb.util.MyTools;

import java.util.ArrayList;
import java.util.List;

public class Save263 {

    public static List<JcContentAttr1> getEntity(Integer contentId, StNjInner4 stNjInner4) {
        List<JcContentAttr1> lists = new ArrayList<>();
        JcContentAttr1 jc = null;
        
        //证书制度
        if(MyTools.isNotEmpty(stNjInner4.getZhengshuzhidu())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("rutFsUjd");
            jc.setAttrValue(stNjInner4.getZhengshuzhidu());lists.add(jc);}

        //证书保管地
        if(MyTools.isNotEmpty(stNjInner4.getZhengshubaoguandi())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("baoguanzai1");
            jc.setAttrValue(stNjInner4.getZhengshubaoguandi());lists.add(jc);}

        //印章制度
        if(MyTools.isNotEmpty(stNjInner4.getYinzhangzhidu())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("tauSTcoz");
            jc.setAttrValue(stNjInner4.getYinzhangzhidu());lists.add(jc);}

        //印章保管地
        if(MyTools.isNotEmpty(stNjInner4.getYinzhangbaoguandi())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("baoguanzai2");
            jc.setAttrValue(stNjInner4.getYinzhangbaoguandi());lists.add(jc);}

        //档案管理制度
        if(MyTools.isNotEmpty(stNjInner4.getDanganzhidu())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("ORFqsbuh");
            jc.setAttrValue(stNjInner4.getDanganzhidu());lists.add(jc);}

        //保管在
        if(MyTools.isNotEmpty(stNjInner4.getDanganbaoguandi())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("baoguanzai3");
            jc.setAttrValue(stNjInner4.getDanganbaoguandi());lists.add(jc);}

        //专职工作人员签订聘用（劳动）合同人数
        if(MyTools.isNotEmpty(stNjInner4.getHetongrenshu())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("AkgUPEex");
            jc.setAttrValue(stNjInner4.getHetongrenshu().toString());lists.add(jc);}

        //专职工作人员平均工资
        if(MyTools.isNotEmpty(stNjInner4.getZhuanzhigongzi())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("PBiqYeUs");
            jc.setAttrValue(stNjInner4.getZhuanzhigongzi().toString());lists.add(jc);}

        //失业保险
        if(MyTools.isNotEmpty(stNjInner4.getShiyebaoxian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("AApPdvEP");
            jc.setAttrValue(stNjInner4.getShiyebaoxian().toString());lists.add(jc);}

        //养老保险
        if(MyTools.isNotEmpty(stNjInner4.getYanglaobaoxian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("nsLMjIaA");
            jc.setAttrValue(stNjInner4.getYanglaobaoxian().toString());lists.add(jc);}

        //医疗保险
        if(MyTools.isNotEmpty(stNjInner4.getYiliaobaoxian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("MVxYLVoU");
            jc.setAttrValue(stNjInner4.getYiliaobaoxian().toString());lists.add(jc);}

        //工伤保险
        if(MyTools.isNotEmpty(stNjInner4.getGongshangbaoxian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("KxJLWBrg");
            jc.setAttrValue(stNjInner4.getGongshangbaoxian().toString());lists.add(jc);}

        //生育保险
        if(MyTools.isNotEmpty(stNjInner4.getShengyubaoxian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("XGxWuYIg");
            jc.setAttrValue(stNjInner4.getShengyubaoxian().toString());lists.add(jc);}

        //公积金
        if(MyTools.isNotEmpty(stNjInner4.getGongjijin())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("FxvrSOYz");
            jc.setAttrValue(stNjInner4.getGongjijin().toString());lists.add(jc);}

        //人民币开户银行
        if(MyTools.isNotEmpty(stNjInner4.getKaihuyinxing())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("YKCOXVOO");
            jc.setAttrValue(stNjInner4.getKaihuyinxing());lists.add(jc);}

        //人民币银行账号
        if(MyTools.isNotEmpty(stNjInner4.getYinxingzhanghao())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("mLauogbW");
            jc.setAttrValue(stNjInner4.getYinxingzhanghao());lists.add(jc);}

        //外币开户银行
        if(MyTools.isNotEmpty(stNjInner4.getWaibikaihuyinxing())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("eGCUPrMI");
            jc.setAttrValue(stNjInner4.getWaibikaihuyinxing());lists.add(jc);}

        //外币银行账号
        if(MyTools.isNotEmpty(stNjInner4.getWaibiyinxingzhanghao())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("pNCwKgFG");
            jc.setAttrValue(stNjInner4.getWaibiyinxingzhanghao());lists.add(jc);}

        //财政登记
        if(MyTools.isNotEmpty(stNjInner4.getCaizhengdengji())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("DmxaTnei");
            jc.setAttrValue(stNjInner4.getCaizhengdengji());lists.add(jc);}

        //财务管理制度
        if(MyTools.isNotEmpty(stNjInner4.getCaiwuguanlizhidu())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("TmHHLALa");
            jc.setAttrValue(stNjInner4.getCaiwuguanlizhidu());lists.add(jc);}

        //固定资产管理制度
        if(MyTools.isNotEmpty(stNjInner4.getGuziguanlizhidu())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("pMkmVrlo");
            jc.setAttrValue(stNjInner4.getGuziguanlizhidu());lists.add(jc);}

        //执行会计制度
        if(MyTools.isNotEmpty(stNjInner4.getZhixingkuaijizhidu())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("UMZiZCSt");
            jc.setAttrValue(stNjInner4.getZhixingkuaijizhidu());lists.add(jc);}

        //财会人员数
        if(MyTools.isNotEmpty(stNjInner4.getCaihuirenyuanshu())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("YrfQCYhG");
            jc.setAttrValue(stNjInner4.getCaihuirenyuanshu().toString());lists.add(jc);}

        //执业资格人数
        if(MyTools.isNotEmpty(stNjInner4.getZhiyezigerenshu())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("LHCcEEGX");
            jc.setAttrValue(stNjInner4.getZhiyezigerenshu().toString());lists.add(jc);}

        StringBuffer stringBuffer = new StringBuffer();
        if(MyTools.isNotEmpty(stNjInner4.getJuanzengshouju())){
            stringBuffer.append("捐赠收据,");
        }
        if(MyTools.isNotEmpty(stNjInner4.getShuiwufapiao())){
            stringBuffer.append("税务发票,");
        }
        if(MyTools.isNotEmpty(stNjInner4.getPiaojuzhongleiqita())){
            stringBuffer.append("其他,");
        }
        if(MyTools.isNotEmpty(stringBuffer)){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("BgSaNMbc");
            jc.setAttrValue(stringBuffer.toString());lists.add(jc);}

        StringBuffer stringBuffer1 = new StringBuffer();
        if(MyTools.isNotEmpty(stNjInner4.getGuoshui())){
            stringBuffer1.append("国税,");
        }
        if(MyTools.isNotEmpty(stNjInner4.getDishui())){
            stringBuffer1.append("地税,");
        }
        if(MyTools.isNotEmpty(stNjInner4.getWeidengji())){
            stringBuffer1.append("未登记,");
        }
        if(MyTools.isNotEmpty(stringBuffer1)){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("KAmGXyyW");
            jc.setAttrValue(stringBuffer1.toString());lists.add(jc);}

        jc = null;

        return lists;
    }
}
