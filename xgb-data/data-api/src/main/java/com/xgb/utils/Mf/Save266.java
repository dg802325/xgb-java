package com.xgb.utils.Mf;

import com.xgb.model.JcContentAttr1;
import com.xgb.model.JjhnjReport4;
import com.xgb.util.MyTools;

import java.util.ArrayList;
import java.util.List;

public class Save266 {

    public static List<JcContentAttr1> getEntity(Integer contentId, JjhnjReport4 jjhnjReport4) {
        List<JcContentAttr1> lists = new ArrayList<>();
        JcContentAttr1 jc = null;
        //末捐非限
        if(MyTools.isNotEmpty(jjhnjReport4.getMojuanfeixian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("vbljUgyh");
            jc.setAttrValue(jjhnjReport4.getMojuanfeixian().toString());lists.add(jc);}

        //末捐限
        if(MyTools.isNotEmpty(jjhnjReport4.getMojuanxian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("pSMgLDHX");
            jc.setAttrValue(jjhnjReport4.getMojuanxian().toString());lists.add(jc);}

        //末捐合计
        if(MyTools.isNotEmpty(jjhnjReport4.getMojuanheji())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("XtjqEZwc");
            jc.setAttrValue(jjhnjReport4.getMojuanheji().toString());lists.add(jc);}

        //累计捐非限
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijijuanfeixian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("qlgXLldj");
            jc.setAttrValue(jjhnjReport4.getLeijijuanfeixian().toString());lists.add(jc);}

        //累计捐限
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijijuanxian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("egBLbWSa");
            jc.setAttrValue(jjhnjReport4.getLeijijuanxian().toString());lists.add(jc);}

        //累计捐合计
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijijuanheji())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("cmoztBFS");
            jc.setAttrValue(jjhnjReport4.getLeijijuanheji().toString());lists.add(jc);}

        //末会非限
        if(MyTools.isNotEmpty(jjhnjReport4.getMohuifeixian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("bYFUqlab");
            jc.setAttrValue(jjhnjReport4.getMohuifeixian().toString());lists.add(jc);}

        //末会限
        if(MyTools.isNotEmpty(jjhnjReport4.getMohuixian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("eltbxdqC");
            jc.setAttrValue(jjhnjReport4.getMohuixian().toString());lists.add(jc);}

        //末会合计
        if(MyTools.isNotEmpty(jjhnjReport4.getMohuiheji())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("YefQahTB");
            jc.setAttrValue(jjhnjReport4.getMohuiheji().toString());lists.add(jc);}

        //累计会非限
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijihuifeixian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("rKLaCuoX");
            jc.setAttrValue(jjhnjReport4.getLeijihuifeixian().toString());lists.add(jc);}

        //累计会限
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijihuixian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("ECmQqufJ");
            jc.setAttrValue(jjhnjReport4.getLeijihuixian().toString());lists.add(jc);}

        //累计会合计
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijihuiheji())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("eakIMvLu");
            jc.setAttrValue(jjhnjReport4.getLeijihuiheji().toString());lists.add(jc);}

        //末服务非限
        if(MyTools.isNotEmpty(jjhnjReport4.getMofuwufeixian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("FXGVNVFj");
            jc.setAttrValue(jjhnjReport4.getMofuwufeixian().toString());lists.add(jc);}

        //末服务限
        if(MyTools.isNotEmpty(jjhnjReport4.getMofuwuxian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("geEKPktx");
            jc.setAttrValue(jjhnjReport4.getMofuwuxian().toString());lists.add(jc);}

        //末服务合计
        if(MyTools.isNotEmpty(jjhnjReport4.getMofuwuheji())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("VLKtfueu");
            jc.setAttrValue(jjhnjReport4.getMofuwuheji().toString());lists.add(jc);}

        //累计服务非限
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijifuwufeixian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("sAYkMRCD");
            jc.setAttrValue(jjhnjReport4.getLeijifuwufeixian().toString());lists.add(jc);}

        //累计服务限
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijifuwuxian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("QUlcXUYE");
            jc.setAttrValue(jjhnjReport4.getLeijifuwuxian().toString());lists.add(jc);}

        //累计服务合计
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijifuwuheji())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("Pawihsos");
            jc.setAttrValue(jjhnjReport4.getLeijifuwuheji().toString());lists.add(jc);}

        //末销售非限
        if(MyTools.isNotEmpty(jjhnjReport4.getMoxiaoshoufeixian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("WXWaoCeA");
            jc.setAttrValue(jjhnjReport4.getMoxiaoshoufeixian().toString());lists.add(jc);}

        //末销售限
        if(MyTools.isNotEmpty(jjhnjReport4.getMoxiaoshouxian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("dTRfrYlj");
            jc.setAttrValue(jjhnjReport4.getMoxiaoshouxian().toString());lists.add(jc);}

        //末销售合计
        if(MyTools.isNotEmpty(jjhnjReport4.getMoxiaoshouheji())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("OTJlnjyO");
            jc.setAttrValue(jjhnjReport4.getMoxiaoshouheji().toString());lists.add(jc);}

        //累计销售非限
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijixiaoshoufeixian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("dqZvhuvQ");
            jc.setAttrValue(jjhnjReport4.getLeijixiaoshoufeixian().toString());lists.add(jc);}

        //累计销售限
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijixiaoshouxian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("nLpfMZBz");
            jc.setAttrValue(jjhnjReport4.getLeijixiaoshouxian().toString());lists.add(jc);}

        //累计销售合计
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijixiaoshouheji())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("GUCqPWTb");
            jc.setAttrValue(jjhnjReport4.getLeijixiaoshouheji().toString());lists.add(jc);}

        //末补助非限
        if(MyTools.isNotEmpty(jjhnjReport4.getMobuzhufeixian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("gMMSPceL");
            jc.setAttrValue(jjhnjReport4.getMobuzhufeixian().toString());lists.add(jc);}

        //末补助限
        if(MyTools.isNotEmpty(jjhnjReport4.getMobuzhuxian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("qdvxsaji");
            jc.setAttrValue(jjhnjReport4.getMobuzhuxian().toString());lists.add(jc);}

        //末补助合计
        if(MyTools.isNotEmpty(jjhnjReport4.getMobuzhuheji())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("ZvFczPjf");
            jc.setAttrValue(jjhnjReport4.getMobuzhuheji().toString());lists.add(jc);}

        //本年非限定性政府补助收入
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijibuzhufeixian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("aQiGnebs");
            jc.setAttrValue(jjhnjReport4.getLeijibuzhufeixian().toString());lists.add(jc);}

        //累计补助限
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijibuzhuxian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("vFeQUnrp");
            jc.setAttrValue(jjhnjReport4.getLeijibuzhuxian().toString());lists.add(jc);}

        //本年政府补助收入合计
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijibuzhuheji())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("cXXirxkv");
            jc.setAttrValue(jjhnjReport4.getLeijibuzhuheji().toString());lists.add(jc);}

        //上年非限定性投资收益
        if(MyTools.isNotEmpty(jjhnjReport4.getMotouzifeixian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("TiHHpzbq");
            jc.setAttrValue(jjhnjReport4.getMotouzifeixian().toString());lists.add(jc);}

        //末投资限
        if(MyTools.isNotEmpty(jjhnjReport4.getMotouzixian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("tHnZAtml");
            jc.setAttrValue(jjhnjReport4.getMotouzixian().toString());lists.add(jc);}

        //末投资合计
        if(MyTools.isNotEmpty(jjhnjReport4.getMotouziheji())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("BwXSkZor");
            jc.setAttrValue(jjhnjReport4.getMotouziheji().toString());lists.add(jc);}

        //累计投资非限
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijitouzifeixian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("fAghkaOB");
            jc.setAttrValue(jjhnjReport4.getLeijitouzifeixian().toString());lists.add(jc);}

        //累计投资限
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijitouzixian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("pnFjmlFc");
            jc.setAttrValue(jjhnjReport4.getLeijitouzixian().toString());lists.add(jc);}

        //累计投资合计
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijitouziheji())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("DVKADnkC");
            jc.setAttrValue(jjhnjReport4.getLeijitouziheji().toString());lists.add(jc);}

        //末其他非限
        if(MyTools.isNotEmpty(jjhnjReport4.getMoqitafeixian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("NrgMdlOd");
            jc.setAttrValue(jjhnjReport4.getMoqitafeixian().toString());lists.add(jc);}

        //末其他限
        if(MyTools.isNotEmpty(jjhnjReport4.getMoqitaxian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("QgUpWzrM");
            jc.setAttrValue(jjhnjReport4.getMoqitaxian().toString());lists.add(jc);}

        //末其他合计
        if(MyTools.isNotEmpty(jjhnjReport4.getMoqitaheji())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("szwERRHI");
            jc.setAttrValue(jjhnjReport4.getMoqitaheji().toString());lists.add(jc);}

        //累计其他非限
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijiqitafeixian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("ymibbSZI");
            jc.setAttrValue(jjhnjReport4.getLeijiqitafeixian().toString());lists.add(jc);}

        //累计其他限
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijiqitaxian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("cESOdIlZ");
            jc.setAttrValue(jjhnjReport4.getLeijiqitaxian().toString());lists.add(jc);}

        //累计其他合计
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijiqitaheji())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("CXPGrCGm");
            jc.setAttrValue(jjhnjReport4.getLeijiqitaheji().toString());lists.add(jc);}

        //末合计非限
        if(MyTools.isNotEmpty(jjhnjReport4.getMohejifeixian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("LMUMsLjS");
            jc.setAttrValue(jjhnjReport4.getMohejifeixian().toString());lists.add(jc);}

        //末合计限
        if(MyTools.isNotEmpty(jjhnjReport4.getMohejixian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("qREEHfvI");
            jc.setAttrValue(jjhnjReport4.getMohejixian().toString());lists.add(jc);}

        //末合计合计
        if(MyTools.isNotEmpty(jjhnjReport4.getMohejiheji())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("ZOyGVTNL");
            jc.setAttrValue(jjhnjReport4.getMohejiheji().toString());lists.add(jc);}

        //累计合计非限
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijihejifeixian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("SJjftvnA");
            jc.setAttrValue(jjhnjReport4.getLeijihejifeixian().toString());lists.add(jc);}

        //累计合计限
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijihejixian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("QyGjMmzI");
            jc.setAttrValue(jjhnjReport4.getLeijihejixian().toString());lists.add(jc);}

        //累计合计合计
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijihejiheji())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("yyoUnFtZ");
            jc.setAttrValue(jjhnjReport4.getLeijihejiheji().toString());lists.add(jc);}

        //末成本非限
        if(MyTools.isNotEmpty(jjhnjReport4.getMochengbenfeixian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("yaPgtljy");
            jc.setAttrValue(jjhnjReport4.getMochengbenfeixian().toString());lists.add(jc);}

        //末成本限
        if(MyTools.isNotEmpty(jjhnjReport4.getMochengbenxian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("PhJjOUWK");
            jc.setAttrValue(jjhnjReport4.getMochengbenxian().toString());lists.add(jc);}

        //末成本合计
        if(MyTools.isNotEmpty(jjhnjReport4.getMochengbenheji())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("TTAlEFnd");
            jc.setAttrValue(jjhnjReport4.getMochengbenheji().toString());lists.add(jc);}

        //累计成本非限
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijichengbenfeixian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("qopvHAYd");
            jc.setAttrValue(jjhnjReport4.getLeijichengbenfeixian().toString());lists.add(jc);}

        //累计成本限
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijichengbenxian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("LwHGhPtX");
            jc.setAttrValue(jjhnjReport4.getLeijichengbenxian().toString());lists.add(jc);}

        //累计成本合计
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijichengbenheji())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("wpfcFEtl");
            jc.setAttrValue(jjhnjReport4.getLeijichengbenheji().toString());lists.add(jc);}

        //末其中非限1
        if(MyTools.isNotEmpty(jjhnjReport4.getMoqizhongfeixian1())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("airEixOQ");
            jc.setAttrValue(jjhnjReport4.getMoqizhongfeixian1().toString());lists.add(jc);}

        //末其中限1
        if(MyTools.isNotEmpty(jjhnjReport4.getMoqizhongxian1())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("IHrKwuZw");
            jc.setAttrValue(jjhnjReport4.getMoqizhongxian1().toString());lists.add(jc);}

        //末其中合计1
        if(MyTools.isNotEmpty(jjhnjReport4.getMoqizhongheji1())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("gKPiKubX");
            jc.setAttrValue(jjhnjReport4.getMoqizhongheji1().toString());lists.add(jc);}

        //累计其中非限1
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijiqizhongfeixian1())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("AjUZzdRf");
            jc.setAttrValue(jjhnjReport4.getLeijiqizhongfeixian1().toString());lists.add(jc);}

        //累计其中限1
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijiqizhongxian1())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("jMJMBLss");
            jc.setAttrValue(jjhnjReport4.getLeijiqizhongxian1().toString());lists.add(jc);}

        //累计其中合计1
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijiqizhongheji1())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("EtJewmsJ");
            jc.setAttrValue(jjhnjReport4.getLeijiqizhongheji1().toString());lists.add(jc);}

        //末其中非限2
        if(MyTools.isNotEmpty(jjhnjReport4.getMoqizhongfeixian2())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("tUQlHaYR");
            jc.setAttrValue(jjhnjReport4.getMoqizhongfeixian2().toString());lists.add(jc);}

        //末其中限2
        if(MyTools.isNotEmpty(jjhnjReport4.getMoqizhongxian2())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("yKzYadcz");
            jc.setAttrValue(jjhnjReport4.getMoqizhongxian2().toString());lists.add(jc);}

        //末其中合计2
        if(MyTools.isNotEmpty(jjhnjReport4.getMoqizhongheji2())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("iaGtSaDb");
            jc.setAttrValue(jjhnjReport4.getMoqizhongheji2().toString());lists.add(jc);}

        //累计其中非限2
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijiqizhongfeixian2())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("oFPIkMwo");
            jc.setAttrValue(jjhnjReport4.getLeijiqizhongfeixian2().toString());lists.add(jc);}

        //累计其中限2
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijiqizhongxian2())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("lyKTcXRt");
            jc.setAttrValue(jjhnjReport4.getLeijiqizhongxian2().toString());lists.add(jc);}

        //累计其中合计2
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijiqizhongheji2())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("YjwVOsgF");
            jc.setAttrValue(jjhnjReport4.getLeijiqizhongheji2().toString());lists.add(jc);}

        //末其中非限3
        if(MyTools.isNotEmpty(jjhnjReport4.getMoqizhongfeixian3())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("GddzKZSE");
            jc.setAttrValue(jjhnjReport4.getMoqizhongfeixian3().toString());lists.add(jc);}

        //末其中限3
        if(MyTools.isNotEmpty(jjhnjReport4.getMoqizhongxian3())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("tmtfYRiO");
            jc.setAttrValue(jjhnjReport4.getMoqizhongxian3().toString());lists.add(jc);}

        //末其中合计3
        if(MyTools.isNotEmpty(jjhnjReport4.getMoqizhongheji3())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("praqPvPi");
            jc.setAttrValue(jjhnjReport4.getMoqizhongheji3().toString());lists.add(jc);}

        //累计其中非限3
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijiqizhongfeixian3())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("OFMAGObN");
            jc.setAttrValue(jjhnjReport4.getLeijiqizhongfeixian3().toString());lists.add(jc);}

        //累计其中限3
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijiqizhongxian3())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("zsYsGQqR");
            jc.setAttrValue(jjhnjReport4.getLeijiqizhongxian3().toString());lists.add(jc);}

        //累计其中合计3
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijiqizhongheji3())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("pCNCecOZ");
            jc.setAttrValue(jjhnjReport4.getLeijiqizhongheji3().toString());lists.add(jc);}

        //末其中非限4
        if(MyTools.isNotEmpty(jjhnjReport4.getMoqizhongfeixian4())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("CGZMnIvT");
            jc.setAttrValue(jjhnjReport4.getMoqizhongfeixian4().toString());lists.add(jc);}

        //末其中限4
        if(MyTools.isNotEmpty(jjhnjReport4.getMoqizhongxian4())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("YPmemXsj");
            jc.setAttrValue(jjhnjReport4.getMoqizhongxian4().toString());lists.add(jc);}

        //末其中合计4
        if(MyTools.isNotEmpty(jjhnjReport4.getMoqizhongheji4())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("cbajeyiz");
            jc.setAttrValue(jjhnjReport4.getMoqizhongheji4().toString());lists.add(jc);}

        //累计其中非限4
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijiqizhongfeixian4())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("ymQtyeyc");
            jc.setAttrValue(jjhnjReport4.getLeijiqizhongfeixian4().toString());lists.add(jc);}

        //累计其中限4
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijiqizhongxian4())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("rfpghIry");
            jc.setAttrValue(jjhnjReport4.getLeijiqizhongxian4().toString());lists.add(jc);}

        //累计其中合计4
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijiqizhongheji4())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("PqfZwbdb");
            jc.setAttrValue(jjhnjReport4.getLeijiqizhongheji4().toString());lists.add(jc);}

        //末管理非限
        if(MyTools.isNotEmpty(jjhnjReport4.getMoguanlifeixian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("MwRBupfx");
            jc.setAttrValue(jjhnjReport4.getMoguanlifeixian().toString());lists.add(jc);}

        //末管理限
        if(MyTools.isNotEmpty(jjhnjReport4.getMoguanlixian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("fMXLTRoZ");
            jc.setAttrValue(jjhnjReport4.getMoguanlixian().toString());lists.add(jc);}

        //末管理合计
        if(MyTools.isNotEmpty(jjhnjReport4.getMoguanliheji())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("KEIWhqjr");
            jc.setAttrValue(jjhnjReport4.getMoguanliheji().toString());lists.add(jc);}

        //累计管理非限
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijiguanlifeixian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("rJLruxVf");
            jc.setAttrValue(jjhnjReport4.getLeijiguanlifeixian().toString());lists.add(jc);}

        //累计管理限
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijiguanlixian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("gIsYelHJ");
            jc.setAttrValue(jjhnjReport4.getLeijiguanlixian().toString());lists.add(jc);}

        //累计管理合计
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijiguanliheji())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("VUGOofaF");
            jc.setAttrValue(jjhnjReport4.getLeijiguanliheji().toString());lists.add(jc);}

        //末筹资非限
        if(MyTools.isNotEmpty(jjhnjReport4.getMochouzifeixian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("BXfCpbcr");
            jc.setAttrValue(jjhnjReport4.getMochouzifeixian().toString());lists.add(jc);}

        //末筹资限
        if(MyTools.isNotEmpty(jjhnjReport4.getMochouzixian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("zCfFwqxK");
            jc.setAttrValue(jjhnjReport4.getMochouzixian().toString());lists.add(jc);}

        //末筹资合计
        if(MyTools.isNotEmpty(jjhnjReport4.getMochouziheji())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("VvUsauDD");
            jc.setAttrValue(jjhnjReport4.getMochouziheji().toString());lists.add(jc);}

        //累计筹资非限
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijichouzifeixian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("UzSsoNTT");
            jc.setAttrValue(jjhnjReport4.getLeijichouzifeixian().toString());lists.add(jc);}

        //累计筹资限
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijichouzixian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("SLWtrMLi");
            jc.setAttrValue(jjhnjReport4.getLeijichouzixian().toString());lists.add(jc);}

        //累计筹资合计
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijichouziheji())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("xoUGLSXa");
            jc.setAttrValue(jjhnjReport4.getLeijichouziheji().toString());lists.add(jc);}

        //末其他费用非
        if(MyTools.isNotEmpty(jjhnjReport4.getMoqitafeiyongfei())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("jWBFHXge");
            jc.setAttrValue(jjhnjReport4.getMoqitafeiyongfei().toString());lists.add(jc);}

        //末其他费用限
        if(MyTools.isNotEmpty(jjhnjReport4.getMoqitafeiyongxian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("hxlIYwJP");
            jc.setAttrValue(jjhnjReport4.getMoqitafeiyongxian().toString());lists.add(jc);}

        //末其他费用合计
        if(MyTools.isNotEmpty(jjhnjReport4.getMoqitafeiyongheji())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("RfNdEJuO");
            jc.setAttrValue(jjhnjReport4.getMoqitafeiyongheji().toString());lists.add(jc);}

        //累计其他费用非限
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijiqitafeiyongfeixian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("HRGButME");
            jc.setAttrValue(jjhnjReport4.getLeijiqitafeiyongfeixian().toString());lists.add(jc);}

        //累计其他费用限
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijiqitafeiyongxian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("rdpEWYTy");
            jc.setAttrValue(jjhnjReport4.getLeijiqitafeiyongxian().toString());lists.add(jc);}

        //累计其他费用合计
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijiqitafeiyongheji())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("DhiMyymc");
            jc.setAttrValue(jjhnjReport4.getLeijiqitafeiyongheji().toString());lists.add(jc);}

        //末费用合计非
        if(MyTools.isNotEmpty(jjhnjReport4.getMofeiyonghejifei())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("bRnvuDNQ");
            jc.setAttrValue(jjhnjReport4.getMofeiyonghejifei().toString());lists.add(jc);}

        //末费用合计限
        if(MyTools.isNotEmpty(jjhnjReport4.getMofeiyonghejixian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("IQRWYfWP");
            jc.setAttrValue(jjhnjReport4.getMofeiyonghejixian().toString());lists.add(jc);}

        //末费用合计合计
        if(MyTools.isNotEmpty(jjhnjReport4.getMofeiyonghejiheji())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("PLOODldK");
            jc.setAttrValue(jjhnjReport4.getMofeiyonghejiheji().toString());lists.add(jc);}

        //累计费用合计非
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijifeiyonghejifei())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("vhhHmKvK");
            jc.setAttrValue(jjhnjReport4.getLeijifeiyonghejifei().toString());lists.add(jc);}

        //累计费用合计限
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijifeiyonghejixian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("ZpJutUcV");
            jc.setAttrValue(jjhnjReport4.getLeijifeiyonghejixian().toString());lists.add(jc);}

        //累计费用合计合计
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijifeiyonghejiheji())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("ZgKPZcKY");
            jc.setAttrValue(jjhnjReport4.getLeijifeiyonghejiheji().toString());lists.add(jc);}

        //末转非限
        if(MyTools.isNotEmpty(jjhnjReport4.getMozhuanfeixian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("fVLRSPqM");
            jc.setAttrValue(jjhnjReport4.getMozhuanfeixian().toString());lists.add(jc);}

        //末转限
        if(MyTools.isNotEmpty(jjhnjReport4.getMozhuanxian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("NMajqVCH");
            jc.setAttrValue(jjhnjReport4.getMozhuanxian().toString());lists.add(jc);}

        //末转合计
        if(MyTools.isNotEmpty(jjhnjReport4.getMozhuanheji())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("MWVlvHWa");
            jc.setAttrValue(jjhnjReport4.getMozhuanheji().toString());lists.add(jc);}

        //累计转非限
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijizhuanfeixian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("iFqLkqDc");
            jc.setAttrValue(jjhnjReport4.getLeijizhuanfeixian().toString());lists.add(jc);}

        //累计转限
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijizhuanxian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("mnaeCBTW");
            jc.setAttrValue(jjhnjReport4.getLeijizhuanxian().toString());lists.add(jc);}

        //累计转合计
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijizhuanheji())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("ehZWzIft");
            jc.setAttrValue(jjhnjReport4.getLeijizhuanheji().toString());lists.add(jc);}

        //末变动非限
        if(MyTools.isNotEmpty(jjhnjReport4.getMobiandongfeixian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("ijEwGDDh");
            jc.setAttrValue(jjhnjReport4.getMobiandongfeixian().toString());lists.add(jc);}

        //末变动限
        if(MyTools.isNotEmpty(jjhnjReport4.getMobiandongxian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("FvQQrgwB");
            jc.setAttrValue(jjhnjReport4.getMobiandongxian().toString());lists.add(jc);}

        //末变动合计
        if(MyTools.isNotEmpty(jjhnjReport4.getMobiandongheji())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("EXxIyHGX");
            jc.setAttrValue(jjhnjReport4.getMobiandongheji().toString());lists.add(jc);}

        //累计变动非限
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijibiandongfeixian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("qfQwigir");
            jc.setAttrValue(jjhnjReport4.getLeijibiandongfeixian().toString());lists.add(jc);}

        //累计变动限
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijibiandongxian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("jGIKyMVR");
            jc.setAttrValue(jjhnjReport4.getLeijibiandongxian().toString());lists.add(jc);}

        //累计变动合计
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijibiandongheji())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("KKaBlEgw");
            jc.setAttrValue(jjhnjReport4.getLeijibiandongheji().toString());lists.add(jc);}


        jc = null;

        return lists;
    }
}
