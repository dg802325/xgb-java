package com.xgb.utils;

import com.xgb.model.JcContentAttr1;
import com.xgb.model.JjhNjReport6;
import com.xgb.model.StDjqk4;
import com.xgb.util.MyTools;

import java.util.ArrayList;
import java.util.List;

public class Save212 {

    public static List<JcContentAttr1> getEntity(Integer contentId, JjhNjReport6 jjhNjReport6) {
        List<JcContentAttr1> lists = new ArrayList<>();

        //接受捐赠
        if(MyTools.isNotEmpty(jjhNjReport6.getJieshoujuanzeng())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("VwNQezEF");
            jc.setAttrValue(jjhNjReport6.getJieshoujuanzeng().toString());lists.add(jc);jc=null;}

        //收取会费
        if(MyTools.isNotEmpty(jjhNjReport6.getShouquhuifei())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("EYeDOLVC");
            jc.setAttrValue(jjhNjReport6.getShouquhuifei().toString());lists.add(jc);jc=null;}

        //提供服务
        if(MyTools.isNotEmpty(jjhNjReport6.getTigongfuwu())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("tTEGkcmZ");
            jc.setAttrValue(jjhNjReport6.getTigongfuwu().toString());lists.add(jc);jc=null;}

        //销售商品
        if(MyTools.isNotEmpty(jjhNjReport6.getXiaoshoushangpin())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("kXnHMiaP");
            jc.setAttrValue(jjhNjReport6.getXiaoshoushangpin().toString());lists.add(jc);jc=null;}

        //政府补助
        if(MyTools.isNotEmpty(jjhNjReport6.getZhengfubuzhu())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("wHFvLRWw");
            jc.setAttrValue(jjhNjReport6.getZhengfubuzhu().toString());lists.add(jc);jc=null;}

        //收到其他业务
        if(MyTools.isNotEmpty(jjhNjReport6.getShoudaoqitayewu())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("lnYpfqIc");
            jc.setAttrValue(jjhNjReport6.getShoudaoqitayewu().toString());lists.add(jc);jc=null;}

        //业务流入小计
        if(MyTools.isNotEmpty(jjhNjReport6.getYewuliuruxiaoji())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("SjJJFXEt");
            jc.setAttrValue(jjhNjReport6.getYewuliuruxiaoji().toString());lists.add(jc);jc=null;}

        //捐赠支付
        if(MyTools.isNotEmpty(jjhNjReport6.getJuanzengzhifu())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("RmKXKBAs");
            jc.setAttrValue(jjhNjReport6.getJuanzengzhifu().toString());lists.add(jc);jc=null;}

        //支付员工
        if(MyTools.isNotEmpty(jjhNjReport6.getZhifuyuangong())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("BPwOzOfM");
            jc.setAttrValue(jjhNjReport6.getZhifuyuangong().toString());lists.add(jc);jc=null;}

        //商品服务支付
        if(MyTools.isNotEmpty(jjhNjReport6.getShangpinfuwuzhifu())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("SJCidVsQ");
            jc.setAttrValue(jjhNjReport6.getShangpinfuwuzhifu().toString());lists.add(jc);jc=null;}

        //支付其他业务
        if(MyTools.isNotEmpty(jjhNjReport6.getZhifuqitayewu())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("IRzaoXnr");
            jc.setAttrValue(jjhNjReport6.getZhifuqitayewu().toString());lists.add(jc);jc=null;}

        //业务流出小计
        if(MyTools.isNotEmpty(jjhNjReport6.getYewuliuchuxiaoji())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("WNJhkLcM");
            jc.setAttrValue(jjhNjReport6.getYewuliuchuxiaoji().toString());lists.add(jc);jc=null;}

        //业务净额
        if(MyTools.isNotEmpty(jjhNjReport6.getYewujinge())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("hwAWxMrF");
            jc.setAttrValue(jjhNjReport6.getYewujinge().toString());lists.add(jc);jc=null;}

        //收回投资
        if(MyTools.isNotEmpty(jjhNjReport6.getShouhuitouzi())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("oCUJuHdL");
            jc.setAttrValue(jjhNjReport6.getShouhuitouzi().toString());lists.add(jc);jc=null;}

        //投资收益
        if(MyTools.isNotEmpty(jjhNjReport6.getTouzishouyi())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("xKHkFtwX");
            jc.setAttrValue(jjhNjReport6.getTouzishouyi().toString());lists.add(jc);jc=null;}

        //处置资产收回
        if(MyTools.isNotEmpty(jjhNjReport6.getChuzhizichanshouhui())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("VqIMRaVL");
            jc.setAttrValue(jjhNjReport6.getChuzhizichanshouhui().toString());lists.add(jc);jc=null;}

        //收到其他投资
        if(MyTools.isNotEmpty(jjhNjReport6.getShoudaoqitatouzi())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("MMHHivMr");
            jc.setAttrValue(jjhNjReport6.getShoudaoqitatouzi().toString());lists.add(jc);jc=null;}

        //投资流入小计
        if(MyTools.isNotEmpty(jjhNjReport6.getTouziliuruxiaoji())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("AxxFVolu");
            jc.setAttrValue(jjhNjReport6.getTouziliuruxiaoji().toString());lists.add(jc);jc=null;}

        //购建资产支付
        if(MyTools.isNotEmpty(jjhNjReport6.getGoujianzichanzhifu())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("KVliEpza");
            jc.setAttrValue(jjhNjReport6.getGoujianzichanzhifu().toString());lists.add(jc);jc=null;}

        //投资支付
        if(MyTools.isNotEmpty(jjhNjReport6.getTouzizhifu())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("YErCQumu");
            jc.setAttrValue(jjhNjReport6.getTouzizhifu().toString());lists.add(jc);jc=null;}

        //支付其他投资
        if(MyTools.isNotEmpty(jjhNjReport6.getZhifuqitatouzi())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("fBgEjkWD");
            jc.setAttrValue(jjhNjReport6.getZhifuqitatouzi().toString());lists.add(jc);jc=null;}

        //投资流出小计
        if(MyTools.isNotEmpty(jjhNjReport6.getTouziliuchuxiaoji())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("NPgEGdqj");
            jc.setAttrValue(jjhNjReport6.getTouziliuchuxiaoji().toString());lists.add(jc);jc=null;}

        //投资净额
        if(MyTools.isNotEmpty(jjhNjReport6.getTouzijinge())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("Iszycmdr");
            jc.setAttrValue(jjhNjReport6.getTouzijinge().toString());lists.add(jc);jc=null;}


        //借款收到
        if(MyTools.isNotEmpty(jjhNjReport6.getJiekuanshoudao())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("zoELiEaD");
            jc.setAttrValue(jjhNjReport6.getJiekuanshoudao().toString());lists.add(jc);jc=null;}

        //收到其他筹资
        if(MyTools.isNotEmpty(jjhNjReport6.getShoudaoqitachouzi())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("JZckzoVp");
            jc.setAttrValue(jjhNjReport6.getShoudaoqitachouzi().toString());lists.add(jc);jc=null;}

        //筹资流入小计
        if(MyTools.isNotEmpty(jjhNjReport6.getChouziliuruxiaoji())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("TGIXqKli");
            jc.setAttrValue(jjhNjReport6.getChouziliuruxiaoji().toString());lists.add(jc);jc=null;}

        //借款支付
        if(MyTools.isNotEmpty(jjhNjReport6.getJiekuanzhifu())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("HjSHUAvK");
            jc.setAttrValue(jjhNjReport6.getJiekuanzhifu().toString());lists.add(jc);jc=null;}

        //利息支付
        if(MyTools.isNotEmpty(jjhNjReport6.getLixizhifu())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("GzNPOFeV");
            jc.setAttrValue(jjhNjReport6.getLixizhifu().toString());lists.add(jc);jc=null;}

        //支付其他筹资
        if(MyTools.isNotEmpty(jjhNjReport6.getZhifuqitachouzi())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("jObtPWKr");
            jc.setAttrValue(jjhNjReport6.getZhifuqitachouzi().toString());lists.add(jc);jc=null;}

        //筹资流出小计
        if(MyTools.isNotEmpty(jjhNjReport6.getChouziliuchuxiaoji())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("HWDmdduo");
            jc.setAttrValue(jjhNjReport6.getChouziliuchuxiaoji().toString());lists.add(jc);jc=null;}

        //筹资净额
        if(MyTools.isNotEmpty(jjhNjReport6.getChouzijinge())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("cBABcRls");
            jc.setAttrValue(jjhNjReport6.getChouzijinge().toString());lists.add(jc);jc=null;}

        //汇率影响额
        if(MyTools.isNotEmpty(jjhNjReport6.getHuilvyingxiange())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("zrBYwQLK");
            jc.setAttrValue(jjhNjReport6.getHuilvyingxiange().toString());lists.add(jc);jc=null;}

        //现金增加额
        if(MyTools.isNotEmpty(jjhNjReport6.getXianjinzengjiae())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("iixkiJJT");
            jc.setAttrValue(jjhNjReport6.getXianjinzengjiae().toString());lists.add(jc);jc=null;}
        return lists;
    }
}
