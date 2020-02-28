package com.xgb.utils.Mf;

import com.xgb.model.JcContentAttr1;
import com.xgb.model.JjhNjReport6;
import com.xgb.util.MyTools;

import java.util.ArrayList;
import java.util.List;

public class Save267 {

    public static List<JcContentAttr1> getEntity(Integer contentId, JjhNjReport6 jjhNjReport6) {
        List<JcContentAttr1> lists = new ArrayList<>();
        JcContentAttr1 jc = null;
        //接受捐赠
        if(MyTools.isNotEmpty(jjhNjReport6.getJieshoujuanzeng())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("LMLtBkUZ");
            jc.setAttrValue(jjhNjReport6.getJieshoujuanzeng().toString());lists.add(jc);}

        //收取会费
        if(MyTools.isNotEmpty(jjhNjReport6.getShouquhuifei())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("MFmCrQFQ");
            jc.setAttrValue(jjhNjReport6.getShouquhuifei().toString());lists.add(jc);}

        //提供服务
        if(MyTools.isNotEmpty(jjhNjReport6.getTigongfuwu())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("isXjjddK");
            jc.setAttrValue(jjhNjReport6.getTigongfuwu().toString());lists.add(jc);}

        //销售商品
        if(MyTools.isNotEmpty(jjhNjReport6.getXiaoshoushangpin())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("iSXmyMiG");
            jc.setAttrValue(jjhNjReport6.getXiaoshoushangpin().toString());lists.add(jc);}

        //政府补助
        if(MyTools.isNotEmpty(jjhNjReport6.getZhengfubuzhu())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("cbfLsvVO");
            jc.setAttrValue(jjhNjReport6.getZhengfubuzhu().toString());lists.add(jc);}

        //收到其他业务
        if(MyTools.isNotEmpty(jjhNjReport6.getShoudaoqitayewu())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("iflPzMvI");
            jc.setAttrValue(jjhNjReport6.getShoudaoqitayewu().toString());lists.add(jc);}

        //业务流入小计
        if(MyTools.isNotEmpty(jjhNjReport6.getYewuliuruxiaoji())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("xGXGeLwD");
            jc.setAttrValue(jjhNjReport6.getYewuliuruxiaoji().toString());lists.add(jc);}

        //捐赠支付
        if(MyTools.isNotEmpty(jjhNjReport6.getJuanzengzhifu())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("pnwcnpVo");
            jc.setAttrValue(jjhNjReport6.getJuanzengzhifu().toString());lists.add(jc);}

        //支付员工
        if(MyTools.isNotEmpty(jjhNjReport6.getZhifuyuangong())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("TVdfgqqT");
            jc.setAttrValue(jjhNjReport6.getZhifuyuangong().toString());lists.add(jc);}

        //商品服务支付
        if(MyTools.isNotEmpty(jjhNjReport6.getShangpinfuwuzhifu())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("IxMNlGBE");
            jc.setAttrValue(jjhNjReport6.getShangpinfuwuzhifu().toString());lists.add(jc);}

        //支付其他业务
        if(MyTools.isNotEmpty(jjhNjReport6.getZhifuqitayewu())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("nOSjPQhe");
            jc.setAttrValue(jjhNjReport6.getZhifuqitayewu().toString());lists.add(jc);}

        //业务流出小计
        if(MyTools.isNotEmpty(jjhNjReport6.getYewuliuchuxiaoji())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("XfWqGvKl");
            jc.setAttrValue(jjhNjReport6.getYewuliuchuxiaoji().toString());lists.add(jc);}

        //业务净额
        if(MyTools.isNotEmpty(jjhNjReport6.getYewujinge())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("RtFgCfoW");
            jc.setAttrValue(jjhNjReport6.getYewujinge().toString());lists.add(jc);}

        //收回投资
        if(MyTools.isNotEmpty(jjhNjReport6.getShouhuitouzi())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("sAItbJvp");
            jc.setAttrValue(jjhNjReport6.getShouhuitouzi().toString());lists.add(jc);}

        //投资收益
        if(MyTools.isNotEmpty(jjhNjReport6.getTouzishouyi())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("nKjJlzBr");
            jc.setAttrValue(jjhNjReport6.getTouzishouyi().toString());lists.add(jc);}

        //处置资产收回
        if(MyTools.isNotEmpty(jjhNjReport6.getChuzhizichanshouhui())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("LEGWefOJ");
            jc.setAttrValue(jjhNjReport6.getChuzhizichanshouhui().toString());lists.add(jc);}

        //收到其他投资
        if(MyTools.isNotEmpty(jjhNjReport6.getShoudaoqitatouzi())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("sBkIeXdp");
            jc.setAttrValue(jjhNjReport6.getShoudaoqitatouzi().toString());lists.add(jc);}

        //投资流入小计
        if(MyTools.isNotEmpty(jjhNjReport6.getTouziliuruxiaoji())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("lFqdJeGq");
            jc.setAttrValue(jjhNjReport6.getTouziliuruxiaoji().toString());lists.add(jc);}

        //购建资产支付
        if(MyTools.isNotEmpty(jjhNjReport6.getGoujianzichanzhifu())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("wSHWqVHS");
            jc.setAttrValue(jjhNjReport6.getGoujianzichanzhifu().toString());lists.add(jc);}

        //投资支付
        if(MyTools.isNotEmpty(jjhNjReport6.getTouzizhifu())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("OBjgrrgp");
            jc.setAttrValue(jjhNjReport6.getTouzizhifu().toString());lists.add(jc);}

        //支付其他投资
        if(MyTools.isNotEmpty(jjhNjReport6.getZhifuqitatouzi())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("VjYyFGID");
            jc.setAttrValue(jjhNjReport6.getZhifuqitatouzi().toString());lists.add(jc);}

        //投资流出小计
        if(MyTools.isNotEmpty(jjhNjReport6.getTouziliuchuxiaoji())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("qbEWPNrI");
            jc.setAttrValue(jjhNjReport6.getTouziliuchuxiaoji().toString());lists.add(jc);}

        //投资净额
        if(MyTools.isNotEmpty(jjhNjReport6.getTouzijinge())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("IevBSSuB");
            jc.setAttrValue(jjhNjReport6.getTouzijinge().toString());lists.add(jc);}

        //借款收到
        if(MyTools.isNotEmpty(jjhNjReport6.getJiekuanshoudao())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("ILhmFzUt");
            jc.setAttrValue(jjhNjReport6.getJiekuanshoudao().toString());lists.add(jc);}

        //收到其他筹资
        if(MyTools.isNotEmpty(jjhNjReport6.getShoudaoqitachouzi())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("CapAZfyG");
            jc.setAttrValue(jjhNjReport6.getShoudaoqitachouzi().toString());lists.add(jc);}

        //筹资流入小计
        if(MyTools.isNotEmpty(jjhNjReport6.getChouziliuruxiaoji())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("sQEecuCd");
            jc.setAttrValue(jjhNjReport6.getChouziliuruxiaoji().toString());lists.add(jc);}

        //借款支付
        if(MyTools.isNotEmpty(jjhNjReport6.getJiekuanzhifu())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("mHFOLnhS");
            jc.setAttrValue(jjhNjReport6.getJiekuanzhifu().toString());lists.add(jc);}

        //利息支付
        if(MyTools.isNotEmpty(jjhNjReport6.getLixizhifu())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("NZZkWfbe");
            jc.setAttrValue(jjhNjReport6.getLixizhifu().toString());lists.add(jc);}

        //支付其他筹资
        if(MyTools.isNotEmpty(jjhNjReport6.getZhifuqitachouzi())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("MVYBifxv");
            jc.setAttrValue(jjhNjReport6.getZhifuqitachouzi().toString());lists.add(jc);}

        //筹资流出小计
        if(MyTools.isNotEmpty(jjhNjReport6.getChouziliuchuxiaoji())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("TjHCWkGX");
            jc.setAttrValue(jjhNjReport6.getChouziliuchuxiaoji().toString());lists.add(jc);}

        //筹资净额
        if(MyTools.isNotEmpty(jjhNjReport6.getChouzijinge())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("UuljXRWS");
            jc.setAttrValue(jjhNjReport6.getChouzijinge().toString());lists.add(jc);}

        //汇率影响额
        if(MyTools.isNotEmpty(jjhNjReport6.getHuilvyingxiange())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("MQqhMLbd");
            jc.setAttrValue(jjhNjReport6.getHuilvyingxiange().toString());lists.add(jc);}

        //现金增加额
        if(MyTools.isNotEmpty(jjhNjReport6.getXianjinzengjiae())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("JxkJLgjj");
            jc.setAttrValue(jjhNjReport6.getXianjinzengjiae().toString());lists.add(jc);}

        jc = null;

        return lists;
    }
}
