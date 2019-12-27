package com.xgb.utils;

import com.xgb.model.JcContentAttr1;
import com.xgb.model.JjhnjReport4;
import com.xgb.model.StNjInner4;
import com.xgb.util.MyTools;

import java.util.ArrayList;
import java.util.List;

public class Save211 {

    public static List<JcContentAttr1> getEntity(Integer contentId, JjhnjReport4 jjhnjReport4) {
        List<JcContentAttr1> lists = new ArrayList<>();

        //末捐非限
        if(MyTools.isNotEmpty(jjhnjReport4.getMojuanfeixian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("aaohVtUZ");
            jc.setAttrValue(jjhnjReport4.getMojuanfeixian().toString());lists.add(jc);jc=null;}

        //末捐限
        if(MyTools.isNotEmpty(jjhnjReport4.getMojuanxian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("OkYY1W7Z");
            jc.setAttrValue(jjhnjReport4.getMojuanxian().toString());lists.add(jc);jc=null;}

        //末捐合计
        if(MyTools.isNotEmpty(jjhnjReport4.getMojuanheji())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("CDHdny8y");
            jc.setAttrValue(jjhnjReport4.getMojuanheji().toString());lists.add(jc);jc=null;}

        //累计捐非限
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijijuanfeixian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("PYeeIJjj");
            jc.setAttrValue(jjhnjReport4.getLeijijuanfeixian().toString());lists.add(jc);jc=null;}

        //累计捐限
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijijuanxian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("hcu7NjCl");
            jc.setAttrValue(jjhnjReport4.getLeijijuanxian().toString());lists.add(jc);jc=null;}

        //累计捐合计
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijijuanheji())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("a6xVW5tX");
            jc.setAttrValue(jjhnjReport4.getLeijijuanheji().toString());lists.add(jc);jc=null;}

        //末会非限
        if(MyTools.isNotEmpty(jjhnjReport4.getMohuifeixian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("yv4XOzBZ");
            jc.setAttrValue(jjhnjReport4.getMohuifeixian().toString());lists.add(jc);jc=null;}

        //末会限
        if(MyTools.isNotEmpty(jjhnjReport4.getMohuixian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("EOmyAKL4");
            jc.setAttrValue(jjhnjReport4.getMohuixian().toString());lists.add(jc);jc=null;}

        //末会合计
        if(MyTools.isNotEmpty(jjhnjReport4.getMohuiheji())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("u0qS8t3R");
            jc.setAttrValue(jjhnjReport4.getMohuiheji().toString());lists.add(jc);jc=null;}

        //累计会非限
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijihuifeixian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("kwsieVGe");
            jc.setAttrValue(jjhnjReport4.getLeijihuifeixian().toString());lists.add(jc);jc=null;}

        //累计会限
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijihuixian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("DxJ6sGA6");
            jc.setAttrValue(jjhnjReport4.getLeijihuixian().toString());lists.add(jc);jc=null;}

        //累计会合计
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijihuiheji())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("rCrI3XHe");
            jc.setAttrValue(jjhnjReport4.getLeijihuiheji().toString());lists.add(jc);jc=null;}

        //末服务非限
        if(MyTools.isNotEmpty(jjhnjReport4.getMofuwufeixian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("HmLXpSPz");
            jc.setAttrValue(jjhnjReport4.getMofuwufeixian().toString());lists.add(jc);jc=null;}

        //末服务限
        if(MyTools.isNotEmpty(jjhnjReport4.getMofuwuxian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("QndYisS2");
            jc.setAttrValue(jjhnjReport4.getMofuwuxian().toString());lists.add(jc);jc=null;}

        //末服务合计
        if(MyTools.isNotEmpty(jjhnjReport4.getMofuwuheji())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("LYpEvs7b");
            jc.setAttrValue(jjhnjReport4.getMofuwuheji().toString());lists.add(jc);jc=null;}

        //累计服务非限
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijifuwufeixian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("WkZ86rqd");
            jc.setAttrValue(jjhnjReport4.getLeijifuwufeixian().toString());lists.add(jc);jc=null;}

        //累计服务限
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijifuwuxian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("ah7Qf1TC");
            jc.setAttrValue(jjhnjReport4.getLeijifuwuxian().toString());lists.add(jc);jc=null;}

        //累计服务合计
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijifuwuheji())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("iPEMyNvb");
            jc.setAttrValue(jjhnjReport4.getLeijifuwuheji().toString());lists.add(jc);jc=null;}

        //末销售非限
        if(MyTools.isNotEmpty(jjhnjReport4.getMoxiaoshoufeixian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("Ary3MNYd");
            jc.setAttrValue(jjhnjReport4.getMoxiaoshoufeixian().toString());lists.add(jc);jc=null;}

        //末销售限
        if(MyTools.isNotEmpty(jjhnjReport4.getMoxiaoshouxian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("oo5TMTgT");
            jc.setAttrValue(jjhnjReport4.getMoxiaoshouxian().toString());lists.add(jc);jc=null;}

        //末销售合计
        if(MyTools.isNotEmpty(jjhnjReport4.getMoxiaoshouheji())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("yNqAoxqE");
            jc.setAttrValue(jjhnjReport4.getMoxiaoshouheji().toString());lists.add(jc);jc=null;}

        //累计销售非限
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijixiaoshoufeixian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("NDSV5t38");
            jc.setAttrValue(jjhnjReport4.getLeijixiaoshoufeixian().toString());lists.add(jc);jc=null;}

        //累计销售限
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijixiaoshouxian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("AWpYmhWs");
            jc.setAttrValue(jjhnjReport4.getLeijixiaoshouxian().toString());lists.add(jc);jc=null;}

        //累计销售合计
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijixiaoshouheji())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("uW44iCNg");
            jc.setAttrValue(jjhnjReport4.getLeijixiaoshouheji().toString());lists.add(jc);jc=null;}

        //末补助非限
        if(MyTools.isNotEmpty(jjhnjReport4.getMobuzhufeixian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("tT1yjsUt");
            jc.setAttrValue(jjhnjReport4.getMobuzhufeixian().toString());lists.add(jc);jc=null;}

        //末补助限
        if(MyTools.isNotEmpty(jjhnjReport4.getMobuzhuxian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("Wfqu2DbH");
            jc.setAttrValue(jjhnjReport4.getMobuzhuxian().toString());lists.add(jc);jc=null;}

        //末补助合计
        if(MyTools.isNotEmpty(jjhnjReport4.getMobuzhuheji())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("Hy8xgMjL");
            jc.setAttrValue(jjhnjReport4.getMobuzhuheji().toString());lists.add(jc);jc=null;}

        //累计补助非限
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijibuzhufeixian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("cTkFvbGC");
            jc.setAttrValue(jjhnjReport4.getLeijibuzhufeixian().toString());lists.add(jc);jc=null;}

        //末投资非限
        if(MyTools.isNotEmpty(jjhnjReport4.getMotouzifeixian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("whu2QjAP");
            jc.setAttrValue(jjhnjReport4.getMotouzifeixian().toString());lists.add(jc);jc=null;}

        //末投资限
        if(MyTools.isNotEmpty(jjhnjReport4.getMotouzixian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("YbU6vi7E");
            jc.setAttrValue(jjhnjReport4.getMotouzixian().toString());lists.add(jc);jc=null;}

        //末投资非限
        if(MyTools.isNotEmpty(jjhnjReport4.getMotouzifeixian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("h94XVjZo");
            jc.setAttrValue(jjhnjReport4.getMotouzifeixian().toString());lists.add(jc);jc=null;}

        //末投资限
        if(MyTools.isNotEmpty(jjhnjReport4.getMotouzixian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("c2ADVQaz");
            jc.setAttrValue(jjhnjReport4.getMotouzixian().toString());lists.add(jc);jc=null;}

        //末投资合计
        if(MyTools.isNotEmpty(jjhnjReport4.getMotouziheji())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("qZniHBBV");
            jc.setAttrValue(jjhnjReport4.getMotouziheji().toString());lists.add(jc);jc=null;}

        //累计投资非限
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijitouzifeixian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("B4sCao2o");
            jc.setAttrValue(jjhnjReport4.getLeijitouzifeixian().toString());lists.add(jc);jc=null;}

        //累计投资限
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijitouzixian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("aLYLpT6H");
            jc.setAttrValue(jjhnjReport4.getLeijitouzixian().toString());lists.add(jc);jc=null;}

        //累计投资合计
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijitouziheji())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("I1xXqDwl");
            jc.setAttrValue(jjhnjReport4.getLeijitouziheji().toString());lists.add(jc);jc=null;}

        //末其他非限
        if(MyTools.isNotEmpty(jjhnjReport4.getMoqitafeixian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("e4v5alnN");
            jc.setAttrValue(jjhnjReport4.getMoqitafeixian().toString());lists.add(jc);jc=null;}

        //末其他限
        if(MyTools.isNotEmpty(jjhnjReport4.getMoqitaxian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("oWhehCsf");
            jc.setAttrValue(jjhnjReport4.getMoqitaxian().toString());lists.add(jc);jc=null;}

        //末其他合计
        if(MyTools.isNotEmpty(jjhnjReport4.getMoqitaheji())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("HgTrMFJK");
            jc.setAttrValue(jjhnjReport4.getMoqitaheji().toString());lists.add(jc);jc=null;}

        //累计其他非限
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijiqitafeixian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("HbQvuwzL");
            jc.setAttrValue(jjhnjReport4.getLeijiqitafeixian().toString());lists.add(jc);jc=null;}

        //累计其他限
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijiqitaxian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("fXTKNlAn");
            jc.setAttrValue(jjhnjReport4.getLeijiqitaxian().toString());lists.add(jc);jc=null;}

        //累计其他合计
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijiqitaheji())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("By6FPOec");
            jc.setAttrValue(jjhnjReport4.getLeijiqitaheji().toString());lists.add(jc);jc=null;}

        //末合计非限
        if(MyTools.isNotEmpty(jjhnjReport4.getMohejifeixian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("LLATMjUq");
            jc.setAttrValue(jjhnjReport4.getMohejifeixian().toString());lists.add(jc);jc=null;}

        //末合计限
        if(MyTools.isNotEmpty(jjhnjReport4.getMohejixian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("LLATMjUq");
            jc.setAttrValue(jjhnjReport4.getMohejixian().toString());lists.add(jc);jc=null;}

        //末合计合计
        if(MyTools.isNotEmpty(jjhnjReport4.getMohejiheji())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("dv61EzJW");
            jc.setAttrValue(jjhnjReport4.getMohejiheji().toString());lists.add(jc);jc=null;}


        //累计合计非限
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijihejifeixian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("ZjneLHY5");
            jc.setAttrValue(jjhnjReport4.getLeijihejifeixian().toString());lists.add(jc);jc=null;}

        //累计合计限
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijihejixian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("XIsXe520");
            jc.setAttrValue(jjhnjReport4.getLeijihejixian().toString());lists.add(jc);jc=null;}

        //累计合计合计
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijihejiheji())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("g8dudDJ3");
            jc.setAttrValue(jjhnjReport4.getLeijihejiheji().toString());lists.add(jc);jc=null;}

        //末成本非限
        if(MyTools.isNotEmpty(jjhnjReport4.getMochengbenfeixian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("MfkeIQ9Y");
            jc.setAttrValue(jjhnjReport4.getMochengbenfeixian().toString());lists.add(jc);jc=null;}

        //末成本限
        if(MyTools.isNotEmpty(jjhnjReport4.getMochengbenxian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("rK2D4OWx");
            jc.setAttrValue(jjhnjReport4.getMochengbenxian().toString());lists.add(jc);jc=null;}

        //末成本合计
        if(MyTools.isNotEmpty(jjhnjReport4.getMochengbenheji())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("hJ0IfvjB");
            jc.setAttrValue(jjhnjReport4.getMochengbenheji().toString());lists.add(jc);jc=null;}

        //累计成本非限
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijichengbenfeixian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("NtADim8K");
            jc.setAttrValue(jjhnjReport4.getLeijichengbenfeixian().toString());lists.add(jc);jc=null;}

        //累计成本限
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijichengbenxian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("SpM65TqO");
            jc.setAttrValue(jjhnjReport4.getLeijichengbenxian().toString());lists.add(jc);jc=null;}

        //累计成本合计
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijichengbenheji())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("WZEx3CoH");
            jc.setAttrValue(jjhnjReport4.getLeijichengbenheji().toString());lists.add(jc);jc=null;}

        //末其中非限1
        if(MyTools.isNotEmpty(jjhnjReport4.getMoqizhongfeixian1())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("nrEPRQAL");
            jc.setAttrValue(jjhnjReport4.getMoqizhongfeixian1().toString());lists.add(jc);jc=null;}

        //末其中限1
        if(MyTools.isNotEmpty(jjhnjReport4.getMoqizhongxian1())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("b4G8KgqT");
            jc.setAttrValue(jjhnjReport4.getMoqizhongxian1().toString());lists.add(jc);jc=null;}

        //末其中合计1
        if(MyTools.isNotEmpty(jjhnjReport4.getMoqizhongheji1())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("QRk5Ed4D");
            jc.setAttrValue(jjhnjReport4.getMoqizhongheji1().toString());lists.add(jc);jc=null;}

        //累计其中非限1
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijiqizhongfeixian1())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("x8HQxuYT");
            jc.setAttrValue(jjhnjReport4.getLeijiqizhongfeixian1().toString());lists.add(jc);jc=null;}

        //累计其中限1
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijiqizhongxian1())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("vYTTkQmX");
            jc.setAttrValue(jjhnjReport4.getLeijiqizhongxian1().toString());lists.add(jc);jc=null;}

        //累计其中合计1
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijiqizhongheji1())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("xMfYtwv4");
            jc.setAttrValue(jjhnjReport4.getLeijiqizhongheji1().toString());lists.add(jc);jc=null;}

        //末其中非限2
        if(MyTools.isNotEmpty(jjhnjReport4.getMoqizhongfeixian2())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("rlT0ZQ6D");
            jc.setAttrValue(jjhnjReport4.getMoqizhongfeixian2().toString());lists.add(jc);jc=null;}

        //末其中限2
        if(MyTools.isNotEmpty(jjhnjReport4.getMoqizhongxian2())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("JZzi80Fk");
            jc.setAttrValue(jjhnjReport4.getMoqizhongxian2().toString());lists.add(jc);jc=null;}

        //末其中合计2
        if(MyTools.isNotEmpty(jjhnjReport4.getMoqizhongheji2())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("pLev1qEe");
            jc.setAttrValue(jjhnjReport4.getMoqizhongheji2().toString());lists.add(jc);jc=null;}

        //累计其中非限2
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijiqizhongfeixian2())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("vK6hI782");
            jc.setAttrValue(jjhnjReport4.getLeijiqizhongfeixian2().toString());lists.add(jc);jc=null;}

        //累计其中限2
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijiqizhongxian2())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("pQg2uXUR");
            jc.setAttrValue(jjhnjReport4.getLeijiqizhongxian2().toString());lists.add(jc);jc=null;}

        //累计其中合计2
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijiqizhongheji2())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("H8YL3FN9");
            jc.setAttrValue(jjhnjReport4.getLeijiqizhongheji2().toString());lists.add(jc);jc=null;}

        //末其中非限3
        if(MyTools.isNotEmpty(jjhnjReport4.getMoqizhongfeixian3())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("xj87hLFk");
            jc.setAttrValue(jjhnjReport4.getMoqizhongfeixian3().toString());lists.add(jc);jc=null;}

        //末其中限3
        if(MyTools.isNotEmpty(jjhnjReport4.getMoqizhongxian3())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("pPigQ6Nz");
            jc.setAttrValue(jjhnjReport4.getMoqizhongxian3().toString());lists.add(jc);jc=null;}

        //末其中合计3
        if(MyTools.isNotEmpty(jjhnjReport4.getMoqizhongheji3())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("kSNLSrzp");
            jc.setAttrValue(jjhnjReport4.getMoqizhongheji3().toString());lists.add(jc);jc=null;}

        //累计其中非限3
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijiqizhongfeixian3())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("PkEDW0LE");
            jc.setAttrValue(jjhnjReport4.getLeijiqizhongfeixian3().toString());lists.add(jc);jc=null;}

        //累计其中限3
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijiqizhongxian3())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("z59dKtae");
            jc.setAttrValue(jjhnjReport4.getLeijiqizhongxian3().toString());lists.add(jc);jc=null;}

        //累计其中合计3
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijiqizhongheji3())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("bbt9bzSo");
            jc.setAttrValue(jjhnjReport4.getLeijiqizhongheji3().toString());lists.add(jc);jc=null;}

        //末其中非限4
        if(MyTools.isNotEmpty(jjhnjReport4.getMoqizhongfeixian4())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("zLwLZMif");
            jc.setAttrValue(jjhnjReport4.getMoqizhongfeixian4().toString());lists.add(jc);jc=null;}

        //末其中限4
        if(MyTools.isNotEmpty(jjhnjReport4.getMoqizhongxian4())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("E6VK97gd");
            jc.setAttrValue(jjhnjReport4.getMoqizhongxian4().toString());lists.add(jc);jc=null;}

        //末其中合计4
        if(MyTools.isNotEmpty(jjhnjReport4.getMoqizhongheji4())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("hgXo0BPq");
            jc.setAttrValue(jjhnjReport4.getMoqizhongheji4().toString());lists.add(jc);jc=null;}

        //累计其中非限4
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijiqizhongfeixian4())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("ws78z54h");
            jc.setAttrValue(jjhnjReport4.getLeijiqizhongfeixian4().toString());lists.add(jc);jc=null;}

        //累计其中限4
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijiqizhongxian4())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("OG8Yb3AY");
            jc.setAttrValue(jjhnjReport4.getLeijiqizhongxian4().toString());lists.add(jc);jc=null;}

        //累计其中合计4
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijiqizhongheji4())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("fvQEIKay");
            jc.setAttrValue(jjhnjReport4.getLeijiqizhongheji4().toString());lists.add(jc);jc=null;}

        //末管理非限
        if(MyTools.isNotEmpty(jjhnjReport4.getMoguanlifeixian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("yYyqZCHk");
            jc.setAttrValue(jjhnjReport4.getMoguanlifeixian().toString());lists.add(jc);jc=null;}

        //末管理限
        if(MyTools.isNotEmpty(jjhnjReport4.getMoguanlixian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("ymNVqfQd");
            jc.setAttrValue(jjhnjReport4.getMoguanlixian().toString());lists.add(jc);jc=null;}

        //末管理合计
        if(MyTools.isNotEmpty(jjhnjReport4.getMoguanliheji())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("rf95fWIs");
            jc.setAttrValue(jjhnjReport4.getMoguanliheji().toString());lists.add(jc);jc=null;}

        //累计管理非限
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijiguanlifeixian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("UmqRothl");
            jc.setAttrValue(jjhnjReport4.getLeijiguanlifeixian().toString());lists.add(jc);jc=null;}

        //累计管理限
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijiguanlixian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("B4uhuGR8");
            jc.setAttrValue(jjhnjReport4.getLeijiguanlixian().toString());lists.add(jc);jc=null;}

        //累计管理合计
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijiguanliheji())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("3");
            jc.setAttrValue(jjhnjReport4.getLeijiguanliheji().toString());lists.add(jc);jc=null;}

        //末筹资非限
        if(MyTools.isNotEmpty(jjhnjReport4.getMochouzifeixian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("IV21DKrQ");
            jc.setAttrValue(jjhnjReport4.getMochouzifeixian().toString());lists.add(jc);jc=null;}

        //末筹资限
        if(MyTools.isNotEmpty(jjhnjReport4.getMochouzixian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("yA2w18jF");
            jc.setAttrValue(jjhnjReport4.getMochouzixian().toString());lists.add(jc);jc=null;}

        //末筹资合计
        if(MyTools.isNotEmpty(jjhnjReport4.getMochouziheji())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("UKbzT7vk");
            jc.setAttrValue(jjhnjReport4.getMochouziheji().toString());lists.add(jc);jc=null;}

        //累计筹资非限
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijichouzifeixian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("tKSvwOnU");
            jc.setAttrValue(jjhnjReport4.getLeijichouzifeixian().toString());lists.add(jc);jc=null;}

        //累计筹资限
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijichouzixian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("nEWUrGM6");
            jc.setAttrValue(jjhnjReport4.getLeijichouzixian().toString());lists.add(jc);jc=null;}

        //累计筹资合计
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijichouziheji())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("w00fOfCP");
            jc.setAttrValue(jjhnjReport4.getLeijichouziheji().toString());lists.add(jc);jc=null;}

        //末其他费用非
        if(MyTools.isNotEmpty(jjhnjReport4.getMoqitafeiyongfei())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("hqpthY8f");
            jc.setAttrValue(jjhnjReport4.getMoqitafeiyongfei().toString());lists.add(jc);jc=null;}

        //末其他费用限
        if(MyTools.isNotEmpty(jjhnjReport4.getMoqitafeiyongxian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("E2cLcOSM");
            jc.setAttrValue(jjhnjReport4.getMoqitafeiyongxian().toString());lists.add(jc);jc=null;}

        //末其他费用合计
        if(MyTools.isNotEmpty(jjhnjReport4.getMoqitafeiyongheji())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("xpVUHJPn");
            jc.setAttrValue(jjhnjReport4.getMoqitafeiyongheji().toString());lists.add(jc);jc=null;}

        //累计其他费用非限
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijiqitafeiyongfeixian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("uUaCC1HH");
            jc.setAttrValue(jjhnjReport4.getLeijiqitafeiyongfeixian().toString());lists.add(jc);jc=null;}

        //累计其他费用限
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijiqitafeiyongxian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("ab74zOLn");
            jc.setAttrValue(jjhnjReport4.getLeijiqitafeiyongxian().toString());lists.add(jc);jc=null;}

        //累计其他费用合计
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijiqitafeiyongheji())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("sV8l1sDs");
            jc.setAttrValue(jjhnjReport4.getLeijiqitafeiyongheji().toString());lists.add(jc);jc=null;}

        //末费用合计非
        if(MyTools.isNotEmpty(jjhnjReport4.getMofeiyonghejifei())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("NsH129Y7");
            jc.setAttrValue(jjhnjReport4.getMofeiyonghejifei().toString());lists.add(jc);jc=null;}

        //末费用合计限
        if(MyTools.isNotEmpty(jjhnjReport4.getMofeiyonghejixian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("jJi4OrGt");
            jc.setAttrValue(jjhnjReport4.getMofeiyonghejixian().toString());lists.add(jc);jc=null;}

        //末费用合计合计
        if(MyTools.isNotEmpty(jjhnjReport4.getMofeiyonghejiheji())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("nm8rZVYS");
            jc.setAttrValue(jjhnjReport4.getMofeiyonghejiheji().toString());lists.add(jc);jc=null;}

        //累计费用合计非
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijifeiyonghejifei())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("X6oqxLTY");
            jc.setAttrValue(jjhnjReport4.getLeijifeiyonghejifei().toString());lists.add(jc);jc=null;}

        //累计费用合计限
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijifeiyonghejixian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("MdUvVFBy");
            jc.setAttrValue(jjhnjReport4.getLeijifeiyonghejixian().toString());lists.add(jc);jc=null;}

        //累计费用合计合计
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijifeiyonghejiheji())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("B57z3GKR");
            jc.setAttrValue(jjhnjReport4.getLeijifeiyonghejiheji().toString());lists.add(jc);jc=null;}

        //末转非限
        if(MyTools.isNotEmpty(jjhnjReport4.getMozhuanfeixian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("Az1baJPf");
            jc.setAttrValue(jjhnjReport4.getMozhuanfeixian().toString());lists.add(jc);jc=null;}

        //末转限
        if(MyTools.isNotEmpty(jjhnjReport4.getMozhuanxian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("L7KvisOk");
            jc.setAttrValue(jjhnjReport4.getMozhuanxian().toString());lists.add(jc);jc=null;}

        //末转合计
        if(MyTools.isNotEmpty(jjhnjReport4.getMozhuanheji())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("K4EBeJsK");
            jc.setAttrValue(jjhnjReport4.getMozhuanheji().toString());lists.add(jc);jc=null;}

        //累计转非限
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijizhuanfeixian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("mqY8fxKU");
            jc.setAttrValue(jjhnjReport4.getLeijizhuanfeixian().toString());lists.add(jc);jc=null;}

        //累计转限
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijizhuanxian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("Iynp9ndF");
            jc.setAttrValue(jjhnjReport4.getLeijizhuanxian().toString());lists.add(jc);jc=null;}

        //累计转合计
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijizhuanheji())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("MvkMzW2W");
            jc.setAttrValue(jjhnjReport4.getLeijizhuanheji().toString());lists.add(jc);jc=null;}

        //末变动非限
        if(MyTools.isNotEmpty(jjhnjReport4.getMobiandongfeixian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("qfeqDKEr");
            jc.setAttrValue(jjhnjReport4.getMobiandongfeixian().toString());lists.add(jc);jc=null;}

        //末变动限
        if(MyTools.isNotEmpty(jjhnjReport4.getMobiandongxian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("I0pfHP89");
            jc.setAttrValue(jjhnjReport4.getMobiandongxian().toString());lists.add(jc);jc=null;}

        //末变动合计
        if(MyTools.isNotEmpty(jjhnjReport4.getMobiandongheji())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("qWejX5kr");
            jc.setAttrValue(jjhnjReport4.getMobiandongheji().toString());lists.add(jc);jc=null;}

        //累计变动非限
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijibiandongfeixian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("A0Czlyyx");
            jc.setAttrValue(jjhnjReport4.getLeijibiandongfeixian().toString());lists.add(jc);jc=null;}

        //累计变动限
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijibiandongxian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("cEMTL1J7");
            jc.setAttrValue(jjhnjReport4.getLeijibiandongxian().toString());lists.add(jc);jc=null;}

        //累计变动合计
        if(MyTools.isNotEmpty(jjhnjReport4.getLeijibiandongheji())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("qF7McnYS");
            jc.setAttrValue(jjhnjReport4.getLeijibiandongheji().toString());lists.add(jc);jc=null;}



        return lists;
    }
}
