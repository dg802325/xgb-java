package com.xgb.utils.Mf;

import com.xgb.model.JcContentAttr1;
import com.xgb.model.JjhnjReport3;
import com.xgb.util.MyTools;

import java.util.ArrayList;
import java.util.List;

public class Save265 {

    public static List<JcContentAttr1> getEntity(Integer contentId, JjhnjReport3 jjhnjReport3) {
        List<JcContentAttr1> lists = new ArrayList<>();
        JcContentAttr1 jc = null;

        //货币资金年初数
        if(MyTools.isNotEmpty(jjhnjReport3.getNianchushu1())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("rMCcBqAf");
            jc.setAttrValue(jjhnjReport3.getNianchushu1().toString());lists.add(jc);}

        //货币资金期末数
        if(MyTools.isNotEmpty(jjhnjReport3.getQimoshu1())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("WPfwwYgG");
            jc.setAttrValue(jjhnjReport3.getQimoshu1().toString());lists.add(jc);}

        //短期投资年初数
        if(MyTools.isNotEmpty(jjhnjReport3.getNianchushu2())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("kQYPpWJv");
            jc.setAttrValue(jjhnjReport3.getNianchushu2().toString());lists.add(jc);}

        //短期投资期末数
        if(MyTools.isNotEmpty(jjhnjReport3.getQimoshu2())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("UAcgkiET");
            jc.setAttrValue(jjhnjReport3.getQimoshu2().toString());lists.add(jc);}

        //应收款项年初数
        if(MyTools.isNotEmpty(jjhnjReport3.getNianchushu3())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("XmtsiHEB");
            jc.setAttrValue(jjhnjReport3.getNianchushu3().toString());lists.add(jc);}

        //应收款项期末数
        if(MyTools.isNotEmpty(jjhnjReport3.getQimoshu3())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("lrMsScRP");
            jc.setAttrValue(jjhnjReport3.getQimoshu3().toString());lists.add(jc);}

        //预付账款年初数
        if(MyTools.isNotEmpty(jjhnjReport3.getNianchushu4())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("auvGSjTU");
            jc.setAttrValue(jjhnjReport3.getNianchushu4().toString());lists.add(jc);}

        //预付账款期末数
        if(MyTools.isNotEmpty(jjhnjReport3.getQimoshu4())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("aqXfeWdd");
            jc.setAttrValue(jjhnjReport3.getQimoshu4().toString());lists.add(jc);}

        //存货年初数
        if(MyTools.isNotEmpty(jjhnjReport3.getNianchushu5())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("CjNdvSQA");
            jc.setAttrValue(jjhnjReport3.getNianchushu5().toString());lists.add(jc);}

        //存货期末数
        if(MyTools.isNotEmpty(jjhnjReport3.getQimoshu5())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("aoqLZIBw");
            jc.setAttrValue(jjhnjReport3.getQimoshu5().toString());lists.add(jc);}

        //待摊费用年初数
        if(MyTools.isNotEmpty(jjhnjReport3.getNianchushu6())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("HxVGwnbi");
            jc.setAttrValue(jjhnjReport3.getNianchushu6().toString());lists.add(jc);}

        //待摊费用期末数
        if(MyTools.isNotEmpty(jjhnjReport3.getQimoshu6())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("CNNNrEZM");
            jc.setAttrValue(jjhnjReport3.getQimoshu6().toString());lists.add(jc);}

        //一年内到期的长期债权投资年初数
        if(MyTools.isNotEmpty(jjhnjReport3.getNianchushu7())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("xmhHoTIa");
            jc.setAttrValue(jjhnjReport3.getNianchushu7().toString());lists.add(jc);}

        //一年内到期的长期债权投资期末数
        if(MyTools.isNotEmpty(jjhnjReport3.getQimoshu7())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("XLuZkhtK");
            jc.setAttrValue(jjhnjReport3.getQimoshu7().toString());lists.add(jc);}

        //其他流动资产年初数
        if(MyTools.isNotEmpty(jjhnjReport3.getNianchushu8())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("ueFcehRR");
            jc.setAttrValue(jjhnjReport3.getNianchushu8().toString());lists.add(jc);}

        //其他流动资产期末数
        if(MyTools.isNotEmpty(jjhnjReport3.getQimoshu8())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("YMBmXvPE");
            jc.setAttrValue(jjhnjReport3.getQimoshu8().toString());lists.add(jc);}

        //流动资产合计年初数
        if(MyTools.isNotEmpty(jjhnjReport3.getNianchushu9())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("CNlkaoJl");
            jc.setAttrValue(jjhnjReport3.getNianchushu9().toString());lists.add(jc);}

        //流动资产合计期末数
        if(MyTools.isNotEmpty(jjhnjReport3.getQimoshu9())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("FuvPLLyX");
            jc.setAttrValue(jjhnjReport3.getQimoshu9().toString());lists.add(jc);}

        //长期股权投资年初数
        if(MyTools.isNotEmpty(jjhnjReport3.getNianchushu10())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("GWvApDCB");
            jc.setAttrValue(jjhnjReport3.getNianchushu10().toString());lists.add(jc);}

        //长期股权投资期末数
        if(MyTools.isNotEmpty(jjhnjReport3.getQimoshu10())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("NXZzzSgg");
            jc.setAttrValue(jjhnjReport3.getQimoshu10().toString());lists.add(jc);}

        //长期债权投资年初数
        if(MyTools.isNotEmpty(jjhnjReport3.getNianchushu11())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("zbCdQWwo");
            jc.setAttrValue(jjhnjReport3.getNianchushu11().toString());lists.add(jc);}

        //长期债权投资期末数
        if(MyTools.isNotEmpty(jjhnjReport3.getQimoshu11())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("OThpjAQK");
            jc.setAttrValue(jjhnjReport3.getQimoshu11().toString());lists.add(jc);}

        //长期投资合计年初数
        if(MyTools.isNotEmpty(jjhnjReport3.getNianchushu12())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("IvdLBErp");
            jc.setAttrValue(jjhnjReport3.getNianchushu12().toString());lists.add(jc);}

        //长期投资合计期末数
        if(MyTools.isNotEmpty(jjhnjReport3.getQimoshu12())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("lqbbvRtN");
            jc.setAttrValue(jjhnjReport3.getQimoshu12().toString());lists.add(jc);}

        //固定资产原价年初数
        if(MyTools.isNotEmpty(jjhnjReport3.getNianchushu13())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("BfaqaMiH");
            jc.setAttrValue(jjhnjReport3.getNianchushu13().toString());lists.add(jc);}

        //固定资产原价期末数
        if(MyTools.isNotEmpty(jjhnjReport3.getQimoshu13())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("NwXFniiq");
            jc.setAttrValue(jjhnjReport3.getQimoshu13().toString());lists.add(jc);}

        //累计折旧年初数
        if(MyTools.isNotEmpty(jjhnjReport3.getNianchushu14())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("RuuhjwPq");
            jc.setAttrValue(jjhnjReport3.getNianchushu14().toString());lists.add(jc);}

        //累计折旧期末数
        if(MyTools.isNotEmpty(jjhnjReport3.getQimoshu14())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("oaitQlnX");
            jc.setAttrValue(jjhnjReport3.getQimoshu14().toString());lists.add(jc);}

        //固定资产净值年初数
        if(MyTools.isNotEmpty(jjhnjReport3.getNianchushu15())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("bIaZCDsh");
            jc.setAttrValue(jjhnjReport3.getNianchushu15().toString());lists.add(jc);}

        //固定资产净值期末数
        if(MyTools.isNotEmpty(jjhnjReport3.getQimoshu15())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("kZXhtzuy");
            jc.setAttrValue(jjhnjReport3.getQimoshu15().toString());lists.add(jc);}

        //在建工程年初数
        if(MyTools.isNotEmpty(jjhnjReport3.getNianchushu16())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("KKwqbGIz");
            jc.setAttrValue(jjhnjReport3.getNianchushu16().toString());lists.add(jc);}

        //在建工程期末数
        if(MyTools.isNotEmpty(jjhnjReport3.getQimoshu16())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("LQJmWqQv");
            jc.setAttrValue(jjhnjReport3.getQimoshu16().toString());lists.add(jc);}

        //文物文化资产年初数
        if(MyTools.isNotEmpty(jjhnjReport3.getNianchushu17())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("yldabGFb");
            jc.setAttrValue(jjhnjReport3.getNianchushu17().toString());lists.add(jc);}

        //文物文化资产期末数
        if(MyTools.isNotEmpty(jjhnjReport3.getQimoshu17())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("MtPxLsdJ");
            jc.setAttrValue(jjhnjReport3.getQimoshu17().toString());lists.add(jc);}

        //固定资产清理年初数
        if(MyTools.isNotEmpty(jjhnjReport3.getNianchushu18())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("QuYbvtnW");
            jc.setAttrValue(jjhnjReport3.getNianchushu18().toString());lists.add(jc);}

        //固定资产清理期末数
        if(MyTools.isNotEmpty(jjhnjReport3.getQimoshu18())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("xxjomAGg");
            jc.setAttrValue(jjhnjReport3.getQimoshu18().toString());lists.add(jc);}

        //固定资产合计年初数
        if(MyTools.isNotEmpty(jjhnjReport3.getNianchushu19())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("fwSFPFCs");
            jc.setAttrValue(jjhnjReport3.getNianchushu19().toString());lists.add(jc);}

        //固定资产合计期末数
        if(MyTools.isNotEmpty(jjhnjReport3.getQimoshu19())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("yidwRiYi");
            jc.setAttrValue(jjhnjReport3.getQimoshu19().toString());lists.add(jc);}

        //无形资产年初数
        if(MyTools.isNotEmpty(jjhnjReport3.getNianchushu20())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("NIANCHUSHU20");
            jc.setAttrValue(jjhnjReport3.getNianchushu20().toString());lists.add(jc);}

        //无形资产期末数
        if(MyTools.isNotEmpty(jjhnjReport3.getQimoshu20())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("kFyHnjPa");
            jc.setAttrValue(jjhnjReport3.getQimoshu20().toString());lists.add(jc);}

        //受托代理资产年初数
        if(MyTools.isNotEmpty(jjhnjReport3.getNianchushu21())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("NIANCHUSHU21");
            jc.setAttrValue(jjhnjReport3.getNianchushu21().toString());lists.add(jc);}

        //受托代理资产期末数
        if(MyTools.isNotEmpty(jjhnjReport3.getQimoshu21())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("kIxdUrVR");
            jc.setAttrValue(jjhnjReport3.getQimoshu21().toString());lists.add(jc);}

        //资产总计年初数
        if(MyTools.isNotEmpty(jjhnjReport3.getNianchushu22())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("LUjeSyxu");
            jc.setAttrValue(jjhnjReport3.getNianchushu22().toString());lists.add(jc);}

        //资产总计期末数
        if(MyTools.isNotEmpty(jjhnjReport3.getQimoshu22())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("XnvKeYBp");
            jc.setAttrValue(jjhnjReport3.getQimoshu22().toString());lists.add(jc);}

        //短期借款年初数
        if(MyTools.isNotEmpty(jjhnjReport3.getNianchushu23())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("CwebpTiH");
            jc.setAttrValue(jjhnjReport3.getNianchushu23().toString());lists.add(jc);}

        //短期借款期末数
        if(MyTools.isNotEmpty(jjhnjReport3.getQimoshu23())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("uZtVBLHN");
            jc.setAttrValue(jjhnjReport3.getQimoshu23().toString());lists.add(jc);}

        //应付款项年初数
        if(MyTools.isNotEmpty(jjhnjReport3.getNianchushu24())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("wStYbkgw");
            jc.setAttrValue(jjhnjReport3.getNianchushu24().toString());lists.add(jc);}

        //应付款项期末数
        if(MyTools.isNotEmpty(jjhnjReport3.getQimoshu24())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("ZPUecoPI");
            jc.setAttrValue(jjhnjReport3.getQimoshu24().toString());lists.add(jc);}

        //应付工资年初数
        if(MyTools.isNotEmpty(jjhnjReport3.getNianchushu25())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("cqzBDBEC");
            jc.setAttrValue(jjhnjReport3.getNianchushu25().toString());lists.add(jc);}

        //应付工资期末数
        if(MyTools.isNotEmpty(jjhnjReport3.getQimoshu25())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("RqeBAdSi");
            jc.setAttrValue(jjhnjReport3.getQimoshu25().toString());lists.add(jc);}

        //应交税金年初数
        if(MyTools.isNotEmpty(jjhnjReport3.getNianchushu26())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("drhtwXxm");
            jc.setAttrValue(jjhnjReport3.getNianchushu26().toString());lists.add(jc);}

        //应交税金期末数
        if(MyTools.isNotEmpty(jjhnjReport3.getQimoshu26())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("MezVirgl");
            jc.setAttrValue(jjhnjReport3.getQimoshu26().toString());lists.add(jc);}

        //预收账款年初数
        if(MyTools.isNotEmpty(jjhnjReport3.getNianchushu27())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("YCoIuEPt");
            jc.setAttrValue(jjhnjReport3.getNianchushu27().toString());lists.add(jc);}

        //预收账款期末数
        if(MyTools.isNotEmpty(jjhnjReport3.getQimoshu27())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("eXHiWhEC");
            jc.setAttrValue(jjhnjReport3.getQimoshu27().toString());lists.add(jc);}

        //预提费用年初数
        if(MyTools.isNotEmpty(jjhnjReport3.getNianchushu28())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("uFsFYJZZ");
            jc.setAttrValue(jjhnjReport3.getNianchushu28().toString());lists.add(jc);}

        //预提费用期末数
        if(MyTools.isNotEmpty(jjhnjReport3.getQimoshu28())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("TxTAMqwQ");
            jc.setAttrValue(jjhnjReport3.getQimoshu28().toString());lists.add(jc);}

        //预计负债年初数
        if(MyTools.isNotEmpty(jjhnjReport3.getNianchushu29())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("VVhfPnhM");
            jc.setAttrValue(jjhnjReport3.getNianchushu29().toString());lists.add(jc);}

        //预计负债期末数
        if(MyTools.isNotEmpty(jjhnjReport3.getQimoshu29())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("udVBXOcB");
            jc.setAttrValue(jjhnjReport3.getQimoshu29().toString());lists.add(jc);}

        //一年内到期的长期负债年初数
        if(MyTools.isNotEmpty(jjhnjReport3.getNianchushu30())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("hMGhXPvc");
            jc.setAttrValue(jjhnjReport3.getNianchushu30().toString());lists.add(jc);}

        //一年内到期的长期负债期末数
        if(MyTools.isNotEmpty(jjhnjReport3.getQimoshu30())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("KYwqHppO");
            jc.setAttrValue(jjhnjReport3.getQimoshu30().toString());lists.add(jc);}

        //其他流动负债年初数
        if(MyTools.isNotEmpty(jjhnjReport3.getNianchushu31())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("XezjghMr");
            jc.setAttrValue(jjhnjReport3.getNianchushu31().toString());lists.add(jc);}

        //其他流动负债期末数
        if(MyTools.isNotEmpty(jjhnjReport3.getQimoshu31())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("WuPhyDWp");
            jc.setAttrValue(jjhnjReport3.getQimoshu31().toString());lists.add(jc);}

        //流动负债合计年初数
        if(MyTools.isNotEmpty(jjhnjReport3.getNianchushu32())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("zNnOkByw");
            jc.setAttrValue(jjhnjReport3.getNianchushu32().toString());lists.add(jc);}

        //流动负债合计期末数
        if(MyTools.isNotEmpty(jjhnjReport3.getQimoshu32())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("plaHXOwb");
            jc.setAttrValue(jjhnjReport3.getQimoshu32().toString());lists.add(jc);}

        //长期借款年初数
        if(MyTools.isNotEmpty(jjhnjReport3.getNianchushu33())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("eQGxtUvo");
            jc.setAttrValue(jjhnjReport3.getNianchushu33().toString());lists.add(jc);}

        //长期借款期末数
        if(MyTools.isNotEmpty(jjhnjReport3.getQimoshu33())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("eQZvrBms");
            jc.setAttrValue(jjhnjReport3.getQimoshu33().toString());lists.add(jc);}

        //长期应付款年初数
        if(MyTools.isNotEmpty(jjhnjReport3.getNianchushu34())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("eGupyzlp");
            jc.setAttrValue(jjhnjReport3.getNianchushu34().toString());lists.add(jc);}

        //长期应付款期末数
        if(MyTools.isNotEmpty(jjhnjReport3.getQimoshu34())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("HRSWNiJP");
            jc.setAttrValue(jjhnjReport3.getQimoshu34().toString());lists.add(jc);}

        //其他长期负债年初数
        if(MyTools.isNotEmpty(jjhnjReport3.getNianchushu35())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("vaZqEUWO");
            jc.setAttrValue(jjhnjReport3.getNianchushu35().toString());lists.add(jc);}

        //其他长期负债期末数
        if(MyTools.isNotEmpty(jjhnjReport3.getQimoshu35())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("igaGojUf");
            jc.setAttrValue(jjhnjReport3.getQimoshu35().toString());lists.add(jc);}

        //长期负债合计年初数
        if(MyTools.isNotEmpty(jjhnjReport3.getNianchushu36())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("mAINEMUM");
            jc.setAttrValue(jjhnjReport3.getNianchushu36().toString());lists.add(jc);}

        //长期负债合计期末数
        if(MyTools.isNotEmpty(jjhnjReport3.getQimoshu36())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("blqBZSsa");
            jc.setAttrValue(jjhnjReport3.getQimoshu36().toString());lists.add(jc);}

        //受托代理负债年初数
        if(MyTools.isNotEmpty(jjhnjReport3.getNianchushu37())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("kZbqqbxm");
            jc.setAttrValue(jjhnjReport3.getNianchushu37().toString());lists.add(jc);}

        //受托代理负债期末数
        if(MyTools.isNotEmpty(jjhnjReport3.getQimoshu37())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("zsYJHXOM");
            jc.setAttrValue(jjhnjReport3.getQimoshu37().toString());lists.add(jc);}

        //负债合计年初数
        if(MyTools.isNotEmpty(jjhnjReport3.getNianchushu38())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("KnLLZqrM");
            jc.setAttrValue(jjhnjReport3.getNianchushu38().toString());lists.add(jc);}

        //负债合计期末数
        if(MyTools.isNotEmpty(jjhnjReport3.getQimoshu38())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("TwzOqVWm");
            jc.setAttrValue(jjhnjReport3.getQimoshu38().toString());lists.add(jc);}

        //非限定性净资产年初数
        if(MyTools.isNotEmpty(jjhnjReport3.getNianchushu39())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("VtOymoze");
            jc.setAttrValue(jjhnjReport3.getNianchushu39().toString());lists.add(jc);}

        //非限定性净资产期末数
        if(MyTools.isNotEmpty(jjhnjReport3.getQimoshu39())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("kguHnrYZ");
            jc.setAttrValue(jjhnjReport3.getQimoshu39().toString());lists.add(jc);}

        //限定性净资产年初数
        if(MyTools.isNotEmpty(jjhnjReport3.getNianchushu40())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("ddQauleL");
            jc.setAttrValue(jjhnjReport3.getNianchushu40().toString());lists.add(jc);}

        //限定性净资产期末数
        if(MyTools.isNotEmpty(jjhnjReport3.getQimoshu40())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("QXHMNAdk");
            jc.setAttrValue(jjhnjReport3.getQimoshu40().toString());lists.add(jc);}

        //净资产合计年初数
        if(MyTools.isNotEmpty(jjhnjReport3.getNianchushu41())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("fZminzhC");
            jc.setAttrValue(jjhnjReport3.getNianchushu41().toString());lists.add(jc);}

        //净资产合计期末数
        if(MyTools.isNotEmpty(jjhnjReport3.getQimoshu41())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("CxKsBFQQ");
            jc.setAttrValue(jjhnjReport3.getQimoshu41().toString());lists.add(jc);}

        //负债和净资产总计年初数
        if(MyTools.isNotEmpty(jjhnjReport3.getNianchushu42())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("PFWFAQbQ");
            jc.setAttrValue(jjhnjReport3.getNianchushu42().toString());lists.add(jc);}

        //负债和净资产总计期末数
        if(MyTools.isNotEmpty(jjhnjReport3.getQimoshu42())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("QIMOSHU42");
            jc.setAttrValue(jjhnjReport3.getQimoshu42().toString());lists.add(jc);}

        //负债和净资产总计期末数
        if(MyTools.isNotEmpty(jjhnjReport3.getQimoshu42())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("DzywwMfv");
            jc.setAttrValue(jjhnjReport3.getQimoshu42().toString());lists.add(jc);}

        //受托代理资产年初数
        if(MyTools.isNotEmpty(jjhnjReport3.getNianchushu21())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("tXkmzqmy");
            jc.setAttrValue(jjhnjReport3.getNianchushu21().toString());lists.add(jc);}

        jc = null;

        return lists;
    }
}
