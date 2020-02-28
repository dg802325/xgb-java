package com.xgb.utils.St;

import com.xgb.model.JcContentAttr1;
import com.xgb.model.JjhnjReport3;
import com.xgb.util.MyTools;

import java.util.ArrayList;
import java.util.List;

public class Save210 {

    public static List<JcContentAttr1> getEntity(Integer contentId, JjhnjReport3 jjhnjReport3) {
        List<JcContentAttr1> lists = new ArrayList<>();
        JcContentAttr1 jc = null;
        //货币资金年初数
        if(MyTools.isNotEmpty(jjhnjReport3.getNianchushu1())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("FFaoMkrr");
            jc.setAttrValue(jjhnjReport3.getNianchushu1().toString());lists.add(jc);}

        //货币资金期末数
        if(MyTools.isNotEmpty(jjhnjReport3.getQimoshu1())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("msVh6PFn");
            jc.setAttrValue(jjhnjReport3.getQimoshu1().toString());lists.add(jc);}

        //短期借款年初数
        if(MyTools.isNotEmpty(jjhnjReport3.getNianchushu23())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("qHgUvt3R");
            jc.setAttrValue(jjhnjReport3.getNianchushu23().toString());lists.add(jc);}

        //短期借款期末数
        if(MyTools.isNotEmpty(jjhnjReport3.getQimoshu23())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("qB4PTBYt");
            jc.setAttrValue(jjhnjReport3.getQimoshu23().toString());lists.add(jc);}

        //短期投资年初数
        if(MyTools.isNotEmpty(jjhnjReport3.getNianchushu2())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("TjBUGfZe");
            jc.setAttrValue(jjhnjReport3.getNianchushu2().toString());lists.add(jc);}

        //短期投资期末数
        if(MyTools.isNotEmpty(jjhnjReport3.getQimoshu2())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("J6XWrfpZ");
            jc.setAttrValue(jjhnjReport3.getQimoshu2().toString());lists.add(jc);}

        //应付款项年初数
        if(MyTools.isNotEmpty(jjhnjReport3.getNianchushu24())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("jAjFE445");
            jc.setAttrValue(jjhnjReport3.getNianchushu24().toString());lists.add(jc);}

        //应付款项期末数
        if(MyTools.isNotEmpty(jjhnjReport3.getQimoshu24())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("SwkEIzbj");
            jc.setAttrValue(jjhnjReport3.getQimoshu24().toString());lists.add(jc);}

        //应收款项年初数
        if(MyTools.isNotEmpty(jjhnjReport3.getNianchushu3())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("pEyuj9be");
            jc.setAttrValue(jjhnjReport3.getNianchushu3().toString());lists.add(jc);}

        //应收款项期末数
        if(MyTools.isNotEmpty(jjhnjReport3.getQimoshu3())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("QKQxRBpj");
            jc.setAttrValue(jjhnjReport3.getQimoshu3().toString());lists.add(jc);}

        //应付工资年初数
        if(MyTools.isNotEmpty(jjhnjReport3.getNianchushu25())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("s0OoEfbA");
            jc.setAttrValue(jjhnjReport3.getNianchushu25().toString());lists.add(jc);}

        //应付工资期末数
        if(MyTools.isNotEmpty(jjhnjReport3.getQimoshu25())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("IiCOSMB4");
            jc.setAttrValue(jjhnjReport3.getQimoshu25().toString());lists.add(jc);}

        //预付账款年初数
        if(MyTools.isNotEmpty(jjhnjReport3.getNianchushu4())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("QfV0rdLr");
            jc.setAttrValue(jjhnjReport3.getNianchushu4().toString());lists.add(jc);}

        //预付账款期末数
        if(MyTools.isNotEmpty(jjhnjReport3.getQimoshu4())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("YtIVGouY");
            jc.setAttrValue(jjhnjReport3.getQimoshu4().toString());lists.add(jc);}

        //应交税金年初数
        if(MyTools.isNotEmpty(jjhnjReport3.getNianchushu26())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("NsVjPOeZ");
            jc.setAttrValue(jjhnjReport3.getNianchushu26().toString());lists.add(jc);}

        //应交税金期末数
        if(MyTools.isNotEmpty(jjhnjReport3.getQimoshu26())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("wobVgml8");
            jc.setAttrValue(jjhnjReport3.getQimoshu26().toString());lists.add(jc);}

        //存货年初数
        if(MyTools.isNotEmpty(jjhnjReport3.getNianchushu5())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("TowoZPdJ");
            jc.setAttrValue(jjhnjReport3.getNianchushu5().toString());lists.add(jc);}

        //存货期末数
        if(MyTools.isNotEmpty(jjhnjReport3.getQimoshu5())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("ITqlnwra");
            jc.setAttrValue(jjhnjReport3.getQimoshu5().toString());lists.add(jc);}

        //预收账款年初数
        if(MyTools.isNotEmpty(jjhnjReport3.getNianchushu27())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("avaUmGr2");
            jc.setAttrValue(jjhnjReport3.getNianchushu27().toString());lists.add(jc);}

        //预收账款期末数
        if(MyTools.isNotEmpty(jjhnjReport3.getQimoshu27())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("UO6jXK7o");
            jc.setAttrValue(jjhnjReport3.getQimoshu27().toString());lists.add(jc);}

        //待摊费用年初数
        if(MyTools.isNotEmpty(jjhnjReport3.getNianchushu6())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("hH8bae5v");
            jc.setAttrValue(jjhnjReport3.getNianchushu6().toString());lists.add(jc);}

        //待摊费用期末数
        if(MyTools.isNotEmpty(jjhnjReport3.getQimoshu6())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("zztysqQc");
            jc.setAttrValue(jjhnjReport3.getQimoshu6().toString());lists.add(jc);}

        //预提费用年初数
        if(MyTools.isNotEmpty(jjhnjReport3.getNianchushu28())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("RRBGWn4q");
            jc.setAttrValue(jjhnjReport3.getNianchushu28().toString());lists.add(jc);}

        //预提费用期末数
        if(MyTools.isNotEmpty(jjhnjReport3.getQimoshu28())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("esmSGtlg");
            jc.setAttrValue(jjhnjReport3.getQimoshu28().toString());lists.add(jc);}

        //一年内到期的长期债权投资年初数
        if(MyTools.isNotEmpty(jjhnjReport3.getNianchushu7())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("Q0915qy0");
            jc.setAttrValue(jjhnjReport3.getNianchushu7().toString());lists.add(jc);}

        //一年内到期的长期债权投资期末数
        if(MyTools.isNotEmpty(jjhnjReport3.getQimoshu7())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("UukyHeTX");
            jc.setAttrValue(jjhnjReport3.getQimoshu7().toString());lists.add(jc);}

        //预计负债年初数
        if(MyTools.isNotEmpty(jjhnjReport3.getNianchushu29())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("qQTZgCrU");
            jc.setAttrValue(jjhnjReport3.getNianchushu29().toString());lists.add(jc);}

        //预计负债期末数
        if(MyTools.isNotEmpty(jjhnjReport3.getQimoshu29())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("eeFYBHmj");
            jc.setAttrValue(jjhnjReport3.getQimoshu29().toString());lists.add(jc);}

        //其他流动资产年初数
        if(MyTools.isNotEmpty(jjhnjReport3.getNianchushu8())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("p0tCvtlk");
            jc.setAttrValue(jjhnjReport3.getNianchushu8().toString());lists.add(jc);}

        //其他流动资产期末数
        if(MyTools.isNotEmpty(jjhnjReport3.getQimoshu8())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("mPm5z7QH");
            jc.setAttrValue(jjhnjReport3.getQimoshu8().toString());lists.add(jc);}

        //一年内到期的长期负债年初数
        if(MyTools.isNotEmpty(jjhnjReport3.getNianchushu30())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("VEYEWxJU");
            jc.setAttrValue(jjhnjReport3.getNianchushu30().toString());lists.add(jc);}

        //一年内到期的长期负债期末数
        if(MyTools.isNotEmpty(jjhnjReport3.getQimoshu30())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("ab3zBlSg");
            jc.setAttrValue(jjhnjReport3.getQimoshu30().toString());lists.add(jc);}

        //流动资产合计年初数
        if(MyTools.isNotEmpty(jjhnjReport3.getNianchushu9())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("Kg9Bms9M");
            jc.setAttrValue(jjhnjReport3.getNianchushu9().toString());lists.add(jc);}

        //流动资产合计期末数
        if(MyTools.isNotEmpty(jjhnjReport3.getQimoshu9())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("bhrdapI4");
            jc.setAttrValue(jjhnjReport3.getQimoshu9().toString());lists.add(jc);}

        //其他流动负债年初数
        if(MyTools.isNotEmpty(jjhnjReport3.getNianchushu31())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("Wb1w4GPE");
            jc.setAttrValue(jjhnjReport3.getNianchushu31().toString());lists.add(jc);}

        //其他流动负债期末数
        if(MyTools.isNotEmpty(jjhnjReport3.getQimoshu31())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("ukkukkQa");
            jc.setAttrValue(jjhnjReport3.getQimoshu31().toString());lists.add(jc);}

        //流动负债合计年初数
        if(MyTools.isNotEmpty(jjhnjReport3.getNianchushu32())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("rpkWIqOB");
            jc.setAttrValue(jjhnjReport3.getNianchushu32().toString());lists.add(jc);}

        //流动负债合计期末数
        if(MyTools.isNotEmpty(jjhnjReport3.getQimoshu32())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("tm5k3TH5");
            jc.setAttrValue(jjhnjReport3.getQimoshu32().toString());lists.add(jc);}

        //长期股权投资年初数
        if(MyTools.isNotEmpty(jjhnjReport3.getNianchushu10())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("upNDfnkI");
            jc.setAttrValue(jjhnjReport3.getNianchushu10().toString());lists.add(jc);}

        //长期股权投资期末数
        if(MyTools.isNotEmpty(jjhnjReport3.getQimoshu10())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("ccQITgiz");
            jc.setAttrValue(jjhnjReport3.getQimoshu10().toString());lists.add(jc);}

        //长期债权投资年初数
        if(MyTools.isNotEmpty(jjhnjReport3.getNianchushu11())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("vQYWgdbr");
            jc.setAttrValue(jjhnjReport3.getNianchushu11().toString());lists.add(jc);}

        //长期债权投资期末数
        if(MyTools.isNotEmpty(jjhnjReport3.getQimoshu11())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("xxXIS9NP");
            jc.setAttrValue(jjhnjReport3.getQimoshu11().toString());lists.add(jc);}

        //长期借款年初数
        if(MyTools.isNotEmpty(jjhnjReport3.getNianchushu33())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("Toq4AqgR");
            jc.setAttrValue(jjhnjReport3.getNianchushu33().toString());lists.add(jc);}

        //长期借款期末数
        if(MyTools.isNotEmpty(jjhnjReport3.getQimoshu33())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("UoZDRkwt");
            jc.setAttrValue(jjhnjReport3.getQimoshu33().toString());lists.add(jc);}

        //长期投资合计年初数
        if(MyTools.isNotEmpty(jjhnjReport3.getNianchushu12())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("vCnpqmkJ");
            jc.setAttrValue(jjhnjReport3.getNianchushu12().toString());lists.add(jc);}

        //长期投资合计期末数
        if(MyTools.isNotEmpty(jjhnjReport3.getQimoshu12())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("caCc2llR");
            jc.setAttrValue(jjhnjReport3.getQimoshu12().toString());lists.add(jc);}

        //长期应付款年初数
        if(MyTools.isNotEmpty(jjhnjReport3.getNianchushu34())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("UPKcrJIO");
            jc.setAttrValue(jjhnjReport3.getNianchushu34().toString());lists.add(jc);}

        //长期应付款期末数
        if(MyTools.isNotEmpty(jjhnjReport3.getQimoshu34())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("DxotZxxy");
            jc.setAttrValue(jjhnjReport3.getQimoshu34().toString());lists.add(jc);}

        //其他长期负债年初数
        if(MyTools.isNotEmpty(jjhnjReport3.getNianchushu35())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("ttglyTWd");
            jc.setAttrValue(jjhnjReport3.getNianchushu35().toString());lists.add(jc);}

        //其他长期负债期末数
        if(MyTools.isNotEmpty(jjhnjReport3.getQimoshu35())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("wl6r4WCk");
            jc.setAttrValue(jjhnjReport3.getQimoshu35().toString());lists.add(jc);}

        //固定资产原价年初数
        if(MyTools.isNotEmpty(jjhnjReport3.getNianchushu13())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("rRqsBLnj");
            jc.setAttrValue(jjhnjReport3.getNianchushu13().toString());lists.add(jc);}

        //固定资产原价期末数
        if(MyTools.isNotEmpty(jjhnjReport3.getQimoshu13())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("cWhKxeXB");
            jc.setAttrValue(jjhnjReport3.getQimoshu13().toString());lists.add(jc);}

        //累计折旧年初数
        if(MyTools.isNotEmpty(jjhnjReport3.getNianchushu14())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("YtIsqXki");
            jc.setAttrValue(jjhnjReport3.getNianchushu14().toString());lists.add(jc);}

        //累计折旧期末数
        if(MyTools.isNotEmpty(jjhnjReport3.getQimoshu14())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("WKldAf20");
            jc.setAttrValue(jjhnjReport3.getQimoshu14().toString());lists.add(jc);}

        //固定资产净值年初数
        if(MyTools.isNotEmpty(jjhnjReport3.getNianchushu15())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("ZbbequiF");
            jc.setAttrValue(jjhnjReport3.getNianchushu15().toString());lists.add(jc);}

        //固定资产净值期末数
        if(MyTools.isNotEmpty(jjhnjReport3.getQimoshu15())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("nKk4hqkK");
            jc.setAttrValue(jjhnjReport3.getQimoshu15().toString());lists.add(jc);}

        //受托代理负债年初数
        if(MyTools.isNotEmpty(jjhnjReport3.getNianchushu37())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("FVazjuMz");
            jc.setAttrValue(jjhnjReport3.getNianchushu37().toString());lists.add(jc);}

        //受托代理负债期末数
        if(MyTools.isNotEmpty(jjhnjReport3.getQimoshu37())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("qR2IeUzO");
            jc.setAttrValue(jjhnjReport3.getQimoshu37().toString());lists.add(jc);}

        //在建工程年初数
        if(MyTools.isNotEmpty(jjhnjReport3.getNianchushu16())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("sqUC4trv");
            jc.setAttrValue(jjhnjReport3.getNianchushu16().toString());lists.add(jc);}

        //在建工程期末数
        if(MyTools.isNotEmpty(jjhnjReport3.getQimoshu16())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("aapS2nT3");
            jc.setAttrValue(jjhnjReport3.getQimoshu16().toString());lists.add(jc);}

        //文物文化资产年初数
        if(MyTools.isNotEmpty(jjhnjReport3.getNianchushu17())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("eEhcbhUT");
            jc.setAttrValue(jjhnjReport3.getNianchushu17().toString());lists.add(jc);}

        //文物文化资产期末数
        if(MyTools.isNotEmpty(jjhnjReport3.getQimoshu17())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("mm2F8UnQ");
            jc.setAttrValue(jjhnjReport3.getQimoshu17().toString());lists.add(jc);}

        //负债合计年初数
        if(MyTools.isNotEmpty(jjhnjReport3.getNianchushu38())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("VejfOQdR");
            jc.setAttrValue(jjhnjReport3.getNianchushu38().toString());lists.add(jc);}

        //负债合计期末数
        if(MyTools.isNotEmpty(jjhnjReport3.getQimoshu38())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("T4Ad2uUJ");
            jc.setAttrValue(jjhnjReport3.getQimoshu38().toString());lists.add(jc);}

        //固定资产清理年初数
        if(MyTools.isNotEmpty(jjhnjReport3.getNianchushu18())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("jT0WS34t");
            jc.setAttrValue(jjhnjReport3.getNianchushu18().toString());lists.add(jc);}

        //固定资产清理期末数
        if(MyTools.isNotEmpty(jjhnjReport3.getQimoshu18())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("jkkKisWZ");
            jc.setAttrValue(jjhnjReport3.getQimoshu18().toString());lists.add(jc);}

        //固定资产合计年初数
        if(MyTools.isNotEmpty(jjhnjReport3.getNianchushu19())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("bzvE6FtY");
            jc.setAttrValue(jjhnjReport3.getNianchushu19().toString());lists.add(jc);}

        //固定资产合计期末数
        if(MyTools.isNotEmpty(jjhnjReport3.getQimoshu19())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("Ww0rUFYO");
            jc.setAttrValue(jjhnjReport3.getQimoshu19().toString());lists.add(jc);}

        //无形资产年初数
        if(MyTools.isNotEmpty(jjhnjReport3.getNianchushu20())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("cQUWSvaz");
            jc.setAttrValue(jjhnjReport3.getNianchushu20().toString());lists.add(jc);}

        //无形资产期末数
        if(MyTools.isNotEmpty(jjhnjReport3.getQimoshu20())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("x0shBKYW	");
            jc.setAttrValue(jjhnjReport3.getQimoshu20().toString());lists.add(jc);}

        //非限定性净资产年初数
        if(MyTools.isNotEmpty(jjhnjReport3.getNianchushu39())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("tI1l5JXV");
            jc.setAttrValue(jjhnjReport3.getNianchushu39().toString());lists.add(jc);}

        //非限定性净资产期末数
        if(MyTools.isNotEmpty(jjhnjReport3.getQimoshu39())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("YePCsZRk");
            jc.setAttrValue(jjhnjReport3.getQimoshu39().toString());lists.add(jc);}

        //限定性净资产年初数
        if(MyTools.isNotEmpty(jjhnjReport3.getNianchushu40())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("XwWlj1cs");
            jc.setAttrValue(jjhnjReport3.getNianchushu40().toString());lists.add(jc);}

        //限定性净资产期末数
        if(MyTools.isNotEmpty(jjhnjReport3.getQimoshu40())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("zr14tn58");
            jc.setAttrValue(jjhnjReport3.getQimoshu40().toString());lists.add(jc);}

        //受托代理资产年初数
        if(MyTools.isNotEmpty(jjhnjReport3.getNianchushu21())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("NA8OLHfw");
            jc.setAttrValue(jjhnjReport3.getNianchushu21().toString());lists.add(jc);}

        //受托代理资产期末数
        if(MyTools.isNotEmpty(jjhnjReport3.getQimoshu21())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("NJYRR05Z");
            jc.setAttrValue(jjhnjReport3.getQimoshu21().toString());lists.add(jc);}

        //净资产合计年初数
        if(MyTools.isNotEmpty(jjhnjReport3.getNianchushu41())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("p7uxPLUF");
            jc.setAttrValue(jjhnjReport3.getNianchushu41().toString());lists.add(jc);}

        //净资产合计期末数
        if(MyTools.isNotEmpty(jjhnjReport3.getQimoshu41())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("n7u7lq3a");
            jc.setAttrValue(jjhnjReport3.getQimoshu41().toString());lists.add(jc);}

        //资产总计年初数
        if(MyTools.isNotEmpty(jjhnjReport3.getNianchushu22())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("gdXo1awA");
            jc.setAttrValue(jjhnjReport3.getNianchushu22().toString());lists.add(jc);}

        //资产总计期末数
        if(MyTools.isNotEmpty(jjhnjReport3.getQimoshu22())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("hhgQOYLV");
            jc.setAttrValue(jjhnjReport3.getQimoshu22().toString());lists.add(jc);}

        //负债和净资产总计年初数
        if(MyTools.isNotEmpty(jjhnjReport3.getNianchushu42())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("fa0fgQA1");
            jc.setAttrValue(jjhnjReport3.getNianchushu42().toString());lists.add(jc);}

        //负债和净资产总计期末数
        if(MyTools.isNotEmpty(jjhnjReport3.getQimoshu42())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("HV12tCNo");
            jc.setAttrValue(jjhnjReport3.getQimoshu42().toString());lists.add(jc);}
        jc = null;
        return lists;
    }
}
