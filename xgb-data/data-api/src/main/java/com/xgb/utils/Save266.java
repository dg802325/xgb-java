package com.xgb.utils;

import com.xgb.model.JcContentAttr1;
import com.xgb.model.JjhnjReport4;
import com.xgb.model.StNjInner4;
import com.xgb.util.MyTools;

import java.util.ArrayList;
import java.util.List;

public class Save266 {

    public static List<JcContentAttr1> getEntity(Integer contentId, JjhnjReport4 jjhnjReport4) {
        List<JcContentAttr1> lists = new ArrayList<>();

        //末捐非限
        if(MyTools.isNotEmpty(jjhnjReport4.getMojuanfeixian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("vbljUgyh");
            jc.setAttrValue(jjhnjReport4.getMojuanfeixian().toString());lists.add(jc);jc=null;}

        //末捐限
        if(MyTools.isNotEmpty(jjhnjReport4.getMojuanxian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("pSMgLDHX");
            jc.setAttrValue(jjhnjReport4.getMojuanxian().toString());lists.add(jc);jc=null;}

        //末捐合计
        if(MyTools.isNotEmpty(jjhnjReport4.getMojuanheji())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("XtjqEZwc");
            jc.setAttrValue(jjhnjReport4.getMojuanheji().toString());lists.add(jc);jc=null;}

        //累计捐非限
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijijuanfeixian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("qlgXLldj");
            jc.setAttrValue(jjhnjReport4.getLeijijuanfeixian().toString());lists.add(jc);jc=null;}

        //累计捐限
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijijuanxian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("egBLbWSa");
            jc.setAttrValue(jjhnjReport4.getLeijijuanxian().toString());lists.add(jc);jc=null;}

        //累计捐合计
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijijuanheji())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("cmoztBFS");
            jc.setAttrValue(jjhnjReport4.getLeijijuanheji().toString());lists.add(jc);jc=null;}

        //末会非限
        if(MyTools.isNotEmpty(jjhnjReport4.getMohuifeixian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("bYFUqlab");
            jc.setAttrValue(jjhnjReport4.getMohuifeixian().toString());lists.add(jc);jc=null;}

        //末会限
        if(MyTools.isNotEmpty(jjhnjReport4.getMohuixian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("eltbxdqC");
            jc.setAttrValue(jjhnjReport4.getMohuixian().toString());lists.add(jc);jc=null;}

        //末会合计
        if(MyTools.isNotEmpty(jjhnjReport4.getMohuiheji())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("YefQahTB");
            jc.setAttrValue(jjhnjReport4.getMohuiheji().toString());lists.add(jc);jc=null;}

        //累计会非限
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijihuifeixian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("rKLaCuoX");
            jc.setAttrValue(jjhnjReport4.getLeijihuifeixian().toString());lists.add(jc);jc=null;}

        //累计会限
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijihuixian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("ECmQqufJ");
            jc.setAttrValue(jjhnjReport4.getLeijihuixian().toString());lists.add(jc);jc=null;}

        //累计会合计
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijihuiheji())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("eakIMvLu");
            jc.setAttrValue(jjhnjReport4.getLeijihuiheji().toString());lists.add(jc);jc=null;}

        //末服务非限
        if(MyTools.isNotEmpty(jjhnjReport4.getMofuwufeixian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("FXGVNVFj");
            jc.setAttrValue(jjhnjReport4.getMofuwufeixian().toString());lists.add(jc);jc=null;}

        //末服务限
        if(MyTools.isNotEmpty(jjhnjReport4.getMofuwuxian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("geEKPktx");
            jc.setAttrValue(jjhnjReport4.getMofuwuxian().toString());lists.add(jc);jc=null;}

        //末服务合计
        if(MyTools.isNotEmpty(jjhnjReport4.getMofuwuheji())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("VLKtfueu");
            jc.setAttrValue(jjhnjReport4.getMofuwuheji().toString());lists.add(jc);jc=null;}

        //累计服务非限
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijifuwufeixian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("sAYkMRCD");
            jc.setAttrValue(jjhnjReport4.getLeijifuwufeixian().toString());lists.add(jc);jc=null;}

        //累计服务限
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijifuwuxian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("QUlcXUYE");
            jc.setAttrValue(jjhnjReport4.getLeijifuwuxian().toString());lists.add(jc);jc=null;}

        //累计服务合计
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijifuwuheji())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("Pawihsos");
            jc.setAttrValue(jjhnjReport4.getLeijifuwuheji().toString());lists.add(jc);jc=null;}

        //末销售非限
        if(MyTools.isNotEmpty(jjhnjReport4.getMoxiaoshoufeixian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("WXWaoCeA");
            jc.setAttrValue(jjhnjReport4.getMoxiaoshoufeixian().toString());lists.add(jc);jc=null;}

        //末销售限
        if(MyTools.isNotEmpty(jjhnjReport4.getMoxiaoshouxian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("dTRfrYlj");
            jc.setAttrValue(jjhnjReport4.getMoxiaoshouxian().toString());lists.add(jc);jc=null;}

        //末销售合计
        if(MyTools.isNotEmpty(jjhnjReport4.getMoxiaoshouheji())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("OTJlnjyO");
            jc.setAttrValue(jjhnjReport4.getMoxiaoshouheji().toString());lists.add(jc);jc=null;}

        //累计销售非限
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijixiaoshoufeixian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("dqZvhuvQ");
            jc.setAttrValue(jjhnjReport4.getLeijixiaoshoufeixian().toString());lists.add(jc);jc=null;}

        //累计销售限
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijixiaoshouxian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("nLpfMZBz");
            jc.setAttrValue(jjhnjReport4.getLeijixiaoshouxian().toString());lists.add(jc);jc=null;}

        //累计销售合计
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijixiaoshouheji())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("GUCqPWTb");
            jc.setAttrValue(jjhnjReport4.getLeijixiaoshouheji().toString());lists.add(jc);jc=null;}

        //末补助非限
        if(MyTools.isNotEmpty(jjhnjReport4.getMobuzhufeixian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("gMMSPceL");
            jc.setAttrValue(jjhnjReport4.getMobuzhufeixian().toString());lists.add(jc);jc=null;}

        //末补助限
        if(MyTools.isNotEmpty(jjhnjReport4.getMobuzhuxian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("qdvxsaji");
            jc.setAttrValue(jjhnjReport4.getMobuzhuxian().toString());lists.add(jc);jc=null;}

        //末补助合计
        if(MyTools.isNotEmpty(jjhnjReport4.getMobuzhuheji())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("ZvFczPjf");
            jc.setAttrValue(jjhnjReport4.getMobuzhuheji().toString());lists.add(jc);jc=null;}

        //本年非限定性政府补助收入
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijibuzhufeixian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("aQiGnebs");
            jc.setAttrValue(jjhnjReport4.getLeijibuzhufeixian().toString());lists.add(jc);jc=null;}

        //累计补助限
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijibuzhuxian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("vFeQUnrp");
            jc.setAttrValue(jjhnjReport4.getLeijibuzhuxian().toString());lists.add(jc);jc=null;}

        //本年政府补助收入合计
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijibuzhuheji())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("cXXirxkv");
            jc.setAttrValue(jjhnjReport4.getLeijibuzhuheji().toString());lists.add(jc);jc=null;}

        //上年非限定性投资收益
        if(MyTools.isNotEmpty(jjhnjReport4.getMotouzifeixian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("TiHHpzbq");
            jc.setAttrValue(jjhnjReport4.getMotouzifeixian().toString());lists.add(jc);jc=null;}

        //末投资限
        if(MyTools.isNotEmpty(jjhnjReport4.getMotouzixian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("tHnZAtml");
            jc.setAttrValue(jjhnjReport4.getMotouzixian().toString());lists.add(jc);jc=null;}

        //末投资合计
        if(MyTools.isNotEmpty(jjhnjReport4.getMotouziheji())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("BwXSkZor");
            jc.setAttrValue(jjhnjReport4.getMotouziheji().toString());lists.add(jc);jc=null;}

        //累计投资非限
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijitouzifeixian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("fAghkaOB");
            jc.setAttrValue(jjhnjReport4.getLeijitouzifeixian().toString());lists.add(jc);jc=null;}

        //累计投资限
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijitouzixian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("pnFjmlFc");
            jc.setAttrValue(jjhnjReport4.getLeijitouzixian().toString());lists.add(jc);jc=null;}

        //累计投资合计
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijitouziheji())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("DVKADnkC");
            jc.setAttrValue(jjhnjReport4.getLeijitouziheji().toString());lists.add(jc);jc=null;}

        //末其他非限
        if(MyTools.isNotEmpty(jjhnjReport4.getMoqitafeixian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("NrgMdlOd");
            jc.setAttrValue(jjhnjReport4.getMoqitafeixian().toString());lists.add(jc);jc=null;}

        //末其他限
        if(MyTools.isNotEmpty(jjhnjReport4.getMoqitaxian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("QgUpWzrM");
            jc.setAttrValue(jjhnjReport4.getMoqitaxian().toString());lists.add(jc);jc=null;}

        //末其他合计
        if(MyTools.isNotEmpty(jjhnjReport4.getMoqitaheji())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("szwERRHI");
            jc.setAttrValue(jjhnjReport4.getMoqitaheji().toString());lists.add(jc);jc=null;}

        //累计其他非限
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijiqitafeixian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("ymibbSZI");
            jc.setAttrValue(jjhnjReport4.getLeijiqitafeixian().toString());lists.add(jc);jc=null;}

        //累计其他限
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijiqitaxian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("cESOdIlZ");
            jc.setAttrValue(jjhnjReport4.getLeijiqitaxian().toString());lists.add(jc);jc=null;}

        //累计其他合计
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijiqitaheji())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("CXPGrCGm");
            jc.setAttrValue(jjhnjReport4.getLeijiqitaheji().toString());lists.add(jc);jc=null;}

        //末合计非限
        if(MyTools.isNotEmpty(jjhnjReport4.getMohejifeixian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("LMUMsLjS");
            jc.setAttrValue(jjhnjReport4.getMohejifeixian().toString());lists.add(jc);jc=null;}

        //末合计限
        if(MyTools.isNotEmpty(jjhnjReport4.getMohejixian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("qREEHfvI");
            jc.setAttrValue(jjhnjReport4.getMohejixian().toString());lists.add(jc);jc=null;}

        //末合计合计
        if(MyTools.isNotEmpty(jjhnjReport4.getMohejiheji())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("ZOyGVTNL");
            jc.setAttrValue(jjhnjReport4.getMohejiheji().toString());lists.add(jc);jc=null;}

        //累计合计非限
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijihejifeixian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("SJjftvnA");
            jc.setAttrValue(jjhnjReport4.getLeijihejifeixian().toString());lists.add(jc);jc=null;}

        //累计合计限
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijihejixian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("QyGjMmzI");
            jc.setAttrValue(jjhnjReport4.getLeijihejixian().toString());lists.add(jc);jc=null;}

        //累计合计合计
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijihejiheji())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("yyoUnFtZ");
            jc.setAttrValue(jjhnjReport4.getLeijihejiheji().toString());lists.add(jc);jc=null;}

        //末成本非限
        if(MyTools.isNotEmpty(jjhnjReport4.getMochengbenfeixian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("yaPgtljy");
            jc.setAttrValue(jjhnjReport4.getMochengbenfeixian().toString());lists.add(jc);jc=null;}

        //末成本限
        if(MyTools.isNotEmpty(jjhnjReport4.getMochengbenxian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("PhJjOUWK");
            jc.setAttrValue(jjhnjReport4.getMochengbenxian().toString());lists.add(jc);jc=null;}

        //末成本合计
        if(MyTools.isNotEmpty(jjhnjReport4.getMochengbenheji())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("TTAlEFnd");
            jc.setAttrValue(jjhnjReport4.getMochengbenheji().toString());lists.add(jc);jc=null;}

        //累计成本非限
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijichengbenfeixian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("qopvHAYd");
            jc.setAttrValue(jjhnjReport4.getLeijichengbenfeixian().toString());lists.add(jc);jc=null;}

        //累计成本限
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijichengbenxian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("LwHGhPtX");
            jc.setAttrValue(jjhnjReport4.getLeijichengbenxian().toString());lists.add(jc);jc=null;}

        //累计成本合计
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijichengbenheji())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("wpfcFEtl");
            jc.setAttrValue(jjhnjReport4.getLeijichengbenheji().toString());lists.add(jc);jc=null;}

        //末其中非限1
        if(MyTools.isNotEmpty(jjhnjReport4.getMoqizhongfeixian1())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("airEixOQ");
            jc.setAttrValue(jjhnjReport4.getMoqizhongfeixian1().toString());lists.add(jc);jc=null;}

        //末其中限1
        if(MyTools.isNotEmpty(jjhnjReport4.getMoqizhongxian1())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("IHrKwuZw");
            jc.setAttrValue(jjhnjReport4.getMoqizhongxian1().toString());lists.add(jc);jc=null;}

        //末其中合计1
        if(MyTools.isNotEmpty(jjhnjReport4.getMoqizhongheji1())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("gKPiKubX");
            jc.setAttrValue(jjhnjReport4.getMoqizhongheji1().toString());lists.add(jc);jc=null;}

        //累计其中非限1
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijiqizhongfeixian1())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("AjUZzdRf");
            jc.setAttrValue(jjhnjReport4.getLeijiqizhongfeixian1().toString());lists.add(jc);jc=null;}

        //累计其中限1
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijiqizhongxian1())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("jMJMBLss");
            jc.setAttrValue(jjhnjReport4.getLeijiqizhongxian1().toString());lists.add(jc);jc=null;}

        //累计其中合计1
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijiqizhongheji1())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("EtJewmsJ");
            jc.setAttrValue(jjhnjReport4.getLeijiqizhongheji1().toString());lists.add(jc);jc=null;}

        //末其中非限2
        if(MyTools.isNotEmpty(jjhnjReport4.getMoqizhongfeixian2())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("tUQlHaYR");
            jc.setAttrValue(jjhnjReport4.getMoqizhongfeixian2().toString());lists.add(jc);jc=null;}

        //末其中限2
        if(MyTools.isNotEmpty(jjhnjReport4.getMoqizhongxian2())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("yKzYadcz");
            jc.setAttrValue(jjhnjReport4.getMoqizhongxian2().toString());lists.add(jc);jc=null;}

        //末其中合计2
        if(MyTools.isNotEmpty(jjhnjReport4.getMoqizhongheji2())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("iaGtSaDb");
            jc.setAttrValue(jjhnjReport4.getMoqizhongheji2().toString());lists.add(jc);jc=null;}

        //累计其中非限2
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijiqizhongfeixian2())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("oFPIkMwo");
            jc.setAttrValue(jjhnjReport4.getLeijiqizhongfeixian2().toString());lists.add(jc);jc=null;}

        //累计其中限2
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijiqizhongxian2())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("lyKTcXRt");
            jc.setAttrValue(jjhnjReport4.getLeijiqizhongxian2().toString());lists.add(jc);jc=null;}

        //累计其中合计2
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijiqizhongheji2())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("YjwVOsgF");
            jc.setAttrValue(jjhnjReport4.getLeijiqizhongheji2().toString());lists.add(jc);jc=null;}

        //末其中非限3
        if(MyTools.isNotEmpty(jjhnjReport4.getMoqizhongfeixian3())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("GddzKZSE");
            jc.setAttrValue(jjhnjReport4.getMoqizhongfeixian3().toString());lists.add(jc);jc=null;}

        //末其中限3
        if(MyTools.isNotEmpty(jjhnjReport4.getMoqizhongxian3())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("tmtfYRiO");
            jc.setAttrValue(jjhnjReport4.getMoqizhongxian3().toString());lists.add(jc);jc=null;}

        //末其中合计3
        if(MyTools.isNotEmpty(jjhnjReport4.getMoqizhongheji3())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("praqPvPi");
            jc.setAttrValue(jjhnjReport4.getMoqizhongheji3().toString());lists.add(jc);jc=null;}

        //累计其中非限3
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijiqizhongfeixian3())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("OFMAGObN");
            jc.setAttrValue(jjhnjReport4.getLeijiqizhongfeixian3().toString());lists.add(jc);jc=null;}

        //累计其中限3
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijiqizhongxian3())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("zsYsGQqR");
            jc.setAttrValue(jjhnjReport4.getLeijiqizhongxian3().toString());lists.add(jc);jc=null;}

        //累计其中合计3
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijiqizhongheji3())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("pCNCecOZ");
            jc.setAttrValue(jjhnjReport4.getLeijiqizhongheji3().toString());lists.add(jc);jc=null;}

        //末其中非限4
        if(MyTools.isNotEmpty(jjhnjReport4.getMoqizhongfeixian4())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("CGZMnIvT");
            jc.setAttrValue(jjhnjReport4.getMoqizhongfeixian4().toString());lists.add(jc);jc=null;}

        //末其中限4
        if(MyTools.isNotEmpty(jjhnjReport4.getMoqizhongxian4())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("YPmemXsj");
            jc.setAttrValue(jjhnjReport4.getMoqizhongxian4().toString());lists.add(jc);jc=null;}

        //末其中合计4
        if(MyTools.isNotEmpty(jjhnjReport4.getMoqizhongheji4())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("cbajeyiz");
            jc.setAttrValue(jjhnjReport4.getMoqizhongheji4().toString());lists.add(jc);jc=null;}

        //累计其中非限4
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijiqizhongfeixian4())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("ymQtyeyc");
            jc.setAttrValue(jjhnjReport4.getLeijiqizhongfeixian4().toString());lists.add(jc);jc=null;}

        //累计其中限4
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijiqizhongxian4())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("rfpghIry");
            jc.setAttrValue(jjhnjReport4.getLeijiqizhongxian4().toString());lists.add(jc);jc=null;}

        //累计其中合计4
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijiqizhongheji4())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("PqfZwbdb");
            jc.setAttrValue(jjhnjReport4.getLeijiqizhongheji4().toString());lists.add(jc);jc=null;}

        //末管理非限
        if(MyTools.isNotEmpty(jjhnjReport4.getMoguanlifeixian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("MwRBupfx");
            jc.setAttrValue(jjhnjReport4.getMoguanlifeixian().toString());lists.add(jc);jc=null;}

        //末管理限
        if(MyTools.isNotEmpty(jjhnjReport4.getMoguanlixian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("fMXLTRoZ");
            jc.setAttrValue(jjhnjReport4.getMoguanlixian().toString());lists.add(jc);jc=null;}

        //末管理合计
        if(MyTools.isNotEmpty(jjhnjReport4.getMoguanliheji())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("KEIWhqjr");
            jc.setAttrValue(jjhnjReport4.getMoguanliheji().toString());lists.add(jc);jc=null;}

        //累计管理非限
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijiguanlifeixian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("rJLruxVf");
            jc.setAttrValue(jjhnjReport4.getLeijiguanlifeixian().toString());lists.add(jc);jc=null;}

        //累计管理限
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijiguanlixian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("gIsYelHJ");
            jc.setAttrValue(jjhnjReport4.getLeijiguanlixian().toString());lists.add(jc);jc=null;}

        //累计管理合计
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijiguanliheji())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("VUGOofaF");
            jc.setAttrValue(jjhnjReport4.getLeijiguanliheji().toString());lists.add(jc);jc=null;}

        //末筹资非限
        if(MyTools.isNotEmpty(jjhnjReport4.getMochouzifeixian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("BXfCpbcr");
            jc.setAttrValue(jjhnjReport4.getMochouzifeixian().toString());lists.add(jc);jc=null;}

        //末筹资限
        if(MyTools.isNotEmpty(jjhnjReport4.getMochouzixian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("zCfFwqxK");
            jc.setAttrValue(jjhnjReport4.getMochouzixian().toString());lists.add(jc);jc=null;}

        //末筹资合计
        if(MyTools.isNotEmpty(jjhnjReport4.getMochouziheji())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("VvUsauDD");
            jc.setAttrValue(jjhnjReport4.getMochouziheji().toString());lists.add(jc);jc=null;}

        //累计筹资非限
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijichouzifeixian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("UzSsoNTT");
            jc.setAttrValue(jjhnjReport4.getLeijichouzifeixian().toString());lists.add(jc);jc=null;}

        //累计筹资限
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijichouzixian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("SLWtrMLi");
            jc.setAttrValue(jjhnjReport4.getLeijichouzixian().toString());lists.add(jc);jc=null;}

        //累计筹资合计
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijichouziheji())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("xoUGLSXa");
            jc.setAttrValue(jjhnjReport4.getLeijichouziheji().toString());lists.add(jc);jc=null;}

        //末其他费用非
        if(MyTools.isNotEmpty(jjhnjReport4.getMoqitafeiyongfei())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("jWBFHXge");
            jc.setAttrValue(jjhnjReport4.getMoqitafeiyongfei().toString());lists.add(jc);jc=null;}

        //末其他费用限
        if(MyTools.isNotEmpty(jjhnjReport4.getMoqitafeiyongxian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("hxlIYwJP");
            jc.setAttrValue(jjhnjReport4.getMoqitafeiyongxian().toString());lists.add(jc);jc=null;}

        //末其他费用合计
        if(MyTools.isNotEmpty(jjhnjReport4.getMoqitafeiyongheji())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("RfNdEJuO");
            jc.setAttrValue(jjhnjReport4.getMoqitafeiyongheji().toString());lists.add(jc);jc=null;}

        //累计其他费用非限
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijiqitafeiyongfeixian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("HRGButME");
            jc.setAttrValue(jjhnjReport4.getLeijiqitafeiyongfeixian().toString());lists.add(jc);jc=null;}

        //累计其他费用限
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijiqitafeiyongxian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("rdpEWYTy");
            jc.setAttrValue(jjhnjReport4.getLeijiqitafeiyongxian().toString());lists.add(jc);jc=null;}

        //累计其他费用合计
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijiqitafeiyongheji())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("DhiMyymc");
            jc.setAttrValue(jjhnjReport4.getLeijiqitafeiyongheji().toString());lists.add(jc);jc=null;}

        //末费用合计非
        if(MyTools.isNotEmpty(jjhnjReport4.getMofeiyonghejifei())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("bRnvuDNQ");
            jc.setAttrValue(jjhnjReport4.getMofeiyonghejifei().toString());lists.add(jc);jc=null;}

        //末费用合计限
        if(MyTools.isNotEmpty(jjhnjReport4.getMofeiyonghejixian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("IQRWYfWP");
            jc.setAttrValue(jjhnjReport4.getMofeiyonghejixian().toString());lists.add(jc);jc=null;}

        //末费用合计合计
        if(MyTools.isNotEmpty(jjhnjReport4.getMofeiyonghejiheji())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("PLOODldK");
            jc.setAttrValue(jjhnjReport4.getMofeiyonghejiheji().toString());lists.add(jc);jc=null;}

        //累计费用合计非
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijifeiyonghejifei())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("vhhHmKvK");
            jc.setAttrValue(jjhnjReport4.getLeijifeiyonghejifei().toString());lists.add(jc);jc=null;}

        //累计费用合计限
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijifeiyonghejixian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("ZpJutUcV");
            jc.setAttrValue(jjhnjReport4.getLeijifeiyonghejixian().toString());lists.add(jc);jc=null;}

        //累计费用合计合计
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijifeiyonghejiheji())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("ZgKPZcKY");
            jc.setAttrValue(jjhnjReport4.getLeijifeiyonghejiheji().toString());lists.add(jc);jc=null;}

        //末转非限
        if(MyTools.isNotEmpty(jjhnjReport4.getMozhuanfeixian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("fVLRSPqM");
            jc.setAttrValue(jjhnjReport4.getMozhuanfeixian().toString());lists.add(jc);jc=null;}

        //末转限
        if(MyTools.isNotEmpty(jjhnjReport4.getMozhuanxian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("NMajqVCH");
            jc.setAttrValue(jjhnjReport4.getMozhuanxian().toString());lists.add(jc);jc=null;}

        //末转合计
        if(MyTools.isNotEmpty(jjhnjReport4.getMozhuanheji())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("MWVlvHWa");
            jc.setAttrValue(jjhnjReport4.getMozhuanheji().toString());lists.add(jc);jc=null;}

        //累计转非限
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijizhuanfeixian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("iFqLkqDc");
            jc.setAttrValue(jjhnjReport4.getLeijizhuanfeixian().toString());lists.add(jc);jc=null;}

        //累计转限
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijizhuanxian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("mnaeCBTW");
            jc.setAttrValue(jjhnjReport4.getLeijizhuanxian().toString());lists.add(jc);jc=null;}

        //累计转合计
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijizhuanheji())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("ehZWzIft");
            jc.setAttrValue(jjhnjReport4.getLeijizhuanheji().toString());lists.add(jc);jc=null;}

        //末变动非限
        if(MyTools.isNotEmpty(jjhnjReport4.getMobiandongfeixian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("ijEwGDDh");
            jc.setAttrValue(jjhnjReport4.getMobiandongfeixian().toString());lists.add(jc);jc=null;}

        //末变动限
        if(MyTools.isNotEmpty(jjhnjReport4.getMobiandongxian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("FvQQrgwB");
            jc.setAttrValue(jjhnjReport4.getMobiandongxian().toString());lists.add(jc);jc=null;}

        //末变动合计
        if(MyTools.isNotEmpty(jjhnjReport4.getMobiandongheji())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("EXxIyHGX");
            jc.setAttrValue(jjhnjReport4.getMobiandongheji().toString());lists.add(jc);jc=null;}

        //累计变动非限
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijibiandongfeixian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("qfQwigir");
            jc.setAttrValue(jjhnjReport4.getLeijibiandongfeixian().toString());lists.add(jc);jc=null;}

        //累计变动限
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijibiandongxian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("jGIKyMVR");
            jc.setAttrValue(jjhnjReport4.getLeijibiandongxian().toString());lists.add(jc);jc=null;}

        //累计变动合计
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijibiandongheji())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("KKaBlEgw");
            jc.setAttrValue(jjhnjReport4.getLeijibiandongheji().toString());lists.add(jc);jc=null;}




        return lists;
    }
}
