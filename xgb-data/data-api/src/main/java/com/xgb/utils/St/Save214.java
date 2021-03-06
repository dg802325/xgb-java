package com.xgb.utils.St;

import com.xgb.model.JcContentAttr1;
import com.xgb.model.StNjGyhdtj;
import com.xgb.model.StNjReport15;
import com.xgb.util.MyTools;

import java.util.ArrayList;
import java.util.List;

public class Save214 {

    public static List<JcContentAttr1> getEntity(Integer contentId, StNjReport15 stNjReport15, StNjGyhdtj stNjGyhdtj) {
        List<JcContentAttr1> lists = new ArrayList<>();
        JcContentAttr1 jc = null;
        if(MyTools.isNotEmpty(stNjReport15)){
            //本年度捐赠收入现金
            if(MyTools.isNotEmpty(stNjReport15.getXianjin1())){
                jc = new JcContentAttr1();jc.setContentId(contentId);
                jc.setAttrName("BXTnBwDP");
                jc.setAttrValue(stNjReport15.getXianjin1().toString());lists.add(jc);}

            //非现金折合1
            if(MyTools.isNotEmpty(stNjReport15.getFeixianjinzhehe1())){
                jc = new JcContentAttr1();jc.setContentId(contentId);
                jc.setAttrName("QElcoUeK");
                jc.setAttrValue(stNjReport15.getFeixianjinzhehe1().toString());lists.add(jc);}

            //本年度捐赠收入合计
            if(MyTools.isNotEmpty(stNjReport15.getHeji1())){
                jc = new JcContentAttr1();jc.setContentId(contentId);
                jc.setAttrName("arHZHxgS");
                jc.setAttrValue(stNjReport15.getHeji1().toString());lists.add(jc);}

            //来自境内的捐赠现金
            if(MyTools.isNotEmpty(stNjReport15.getXianjin2())){
                jc = new JcContentAttr1();jc.setContentId(contentId);
                jc.setAttrName("woqXCRId");
                jc.setAttrValue(stNjReport15.getXianjin2().toString());lists.add(jc);}

            //来自境内的捐赠非现金折合
            if(MyTools.isNotEmpty(stNjReport15.getFeixianjinzhehe2())){
                jc = new JcContentAttr1();jc.setContentId(contentId);
                jc.setAttrName("UtcnrIPa");
                jc.setAttrValue(stNjReport15.getFeixianjinzhehe2().toString());lists.add(jc);}

            //来自境内的捐赠合计
            if(MyTools.isNotEmpty(stNjReport15.getHeji2())){
                jc = new JcContentAttr1();jc.setContentId(contentId);
                jc.setAttrName("iosPgvAy");
                jc.setAttrValue(stNjReport15.getHeji2().toString());lists.add(jc);}

            //来自境内自然人现金
            if(MyTools.isNotEmpty(stNjReport15.getXianjin3())){
                jc = new JcContentAttr1();jc.setContentId(contentId);
                jc.setAttrName("LyXkFZZx");
                jc.setAttrValue(stNjReport15.getXianjin3().toString());lists.add(jc);}

            //来自境内自然人非现金折合
            if(MyTools.isNotEmpty(stNjReport15.getFeixianjinzhehe3())){
                jc = new JcContentAttr1();jc.setContentId(contentId);
                jc.setAttrName("znoORIdR");
                jc.setAttrValue(stNjReport15.getFeixianjinzhehe3().toString());lists.add(jc);}

            //来自境内自然人合计
            if(MyTools.isNotEmpty(stNjReport15.getHeji3())){
                jc = new JcContentAttr1();jc.setContentId(contentId);
                jc.setAttrName("qfBpWakX");
                jc.setAttrValue(stNjReport15.getHeji3().toString());lists.add(jc);}


            //来自境内组织现金
            if(MyTools.isNotEmpty(stNjReport15.getXianjin4())){
                jc = new JcContentAttr1();jc.setContentId(contentId);
                jc.setAttrName("XMTcGZnX");
                jc.setAttrValue(stNjReport15.getXianjin4().toString());lists.add(jc);}

            //来自境内组织非现金合计
            if(MyTools.isNotEmpty(stNjReport15.getFeixianjinzhehe4())){
                jc = new JcContentAttr1();jc.setContentId(contentId);
                jc.setAttrName("fWAmLWmd");
                jc.setAttrValue(stNjReport15.getFeixianjinzhehe4().toString());lists.add(jc);}

            //来自境内组织合计
            if(MyTools.isNotEmpty(stNjReport15.getHeji4())){
                jc = new JcContentAttr1();jc.setContentId(contentId);
                jc.setAttrName("NpsoKtZg");
                jc.setAttrValue(stNjReport15.getHeji4().toString());lists.add(jc);}

            //来自境外的捐赠现金
            if(MyTools.isNotEmpty(stNjReport15.getXianjin5())){
                jc = new JcContentAttr1();jc.setContentId(contentId);
                jc.setAttrName("jLqFCFOp");
                jc.setAttrValue(stNjReport15.getXianjin5().toString());lists.add(jc);}

            //来自境外的捐赠非现金折合
            if(MyTools.isNotEmpty(stNjReport15.getFeixianjinzhehe5())){
                jc = new JcContentAttr1();jc.setContentId(contentId);
                jc.setAttrName("LiUwXeXq");
                jc.setAttrValue(stNjReport15.getFeixianjinzhehe5().toString());lists.add(jc);}

            //来自境外的捐赠合计
            if(MyTools.isNotEmpty(stNjReport15.getHeji5())){
                jc = new JcContentAttr1();jc.setContentId(contentId);
                jc.setAttrName("rkyDQXBH");
                jc.setAttrValue(stNjReport15.getHeji5().toString());lists.add(jc);}

            //来自境内自然人现金
            if(MyTools.isNotEmpty(stNjReport15.getXianjin6())){
                jc = new JcContentAttr1();jc.setContentId(contentId);
                jc.setAttrName("CNeUMkOh");
                jc.setAttrValue(stNjReport15.getXianjin6().toString());lists.add(jc);}

            //来自境内自然人非现金折合
            if(MyTools.isNotEmpty(stNjReport15.getFeixianjinzhehe6())){
                jc = new JcContentAttr1();jc.setContentId(contentId);
                jc.setAttrName("HapRvfFy");
                jc.setAttrValue(stNjReport15.getFeixianjinzhehe6().toString());lists.add(jc);}

            //来自境内自然人合计
            if(MyTools.isNotEmpty(stNjReport15.getHeji6())){
                jc = new JcContentAttr1();jc.setContentId(contentId);
                jc.setAttrName("lgLsPmDg");
                jc.setAttrValue(stNjReport15.getHeji6().toString());lists.add(jc);}

            //来自境内组织现金
            if(MyTools.isNotEmpty(stNjReport15.getXianjin7())){
                jc = new JcContentAttr1();jc.setContentId(contentId);
                jc.setAttrName("KHvIyfeL");
                jc.setAttrValue(stNjReport15.getXianjin7().toString());lists.add(jc);}

            //来自境内组织非现金折合
            if(MyTools.isNotEmpty(stNjReport15.getFeixianjinzhehe7())){
                jc = new JcContentAttr1();jc.setContentId(contentId);
                jc.setAttrName("UKhNWSEd");
                jc.setAttrValue(stNjReport15.getFeixianjinzhehe7().toString());lists.add(jc);}

            //来自境内组织合计
            if(MyTools.isNotEmpty(stNjReport15.getHeji7())){
                jc = new JcContentAttr1();jc.setContentId(contentId);
                jc.setAttrName("eeMrDifG");
                jc.setAttrValue(stNjReport15.getHeji7().toString());lists.add(jc);}

            //主要用途和使用情况
            if(MyTools.isNotEmpty(stNjReport15.getZhuyaoyongtuheshiyongqingkuang())){
                jc = new JcContentAttr1();jc.setContentId(contentId);
                jc.setAttrName("c");
                jc.setAttrValue(stNjReport15.getZhuyaoyongtuheshiyongqingkuang());lists.add(jc);}
        }

        if(MyTools.isNotEmpty(stNjGyhdtj)){
            //上年度总收入1
            if(MyTools.isNotEmpty(stNjGyhdtj.getZongshouru2())){
                jc = new JcContentAttr1();jc.setContentId(contentId);
                jc.setAttrName("JxYOxSAW");
                jc.setAttrValue(stNjGyhdtj.getZongshouru2());lists.add(jc);}

            //上年度总收入2
            if(MyTools.isNotEmpty(stNjGyhdtj.getZongshouru3())){
                jc = new JcContentAttr1();jc.setContentId(contentId);
                jc.setAttrName("XhurCGkr");
                jc.setAttrValue(stNjGyhdtj.getZongshouru3());lists.add(jc);}

            //上年度总收入3
            if(MyTools.isNotEmpty(stNjGyhdtj.getZongshouru4())){
                jc = new JcContentAttr1();jc.setContentId(contentId);
                jc.setAttrName("vjfPqnFr");
                jc.setAttrValue(stNjGyhdtj.getZongshouru4());lists.add(jc);}

            //本年度总支出1
            if(MyTools.isNotEmpty(stNjGyhdtj.getZongzhichu2())){
                jc = new JcContentAttr1();jc.setContentId(contentId);
                jc.setAttrName("FLUPuJkN");
                jc.setAttrValue(stNjGyhdtj.getZongzhichu2());lists.add(jc);}

            //本年度总支出2
            if(MyTools.isNotEmpty(stNjGyhdtj.getZongzhichu3())){
                jc = new JcContentAttr1();jc.setContentId(contentId);
                jc.setAttrName("kqYRecLo");
                jc.setAttrValue(stNjGyhdtj.getZongzhichu3());lists.add(jc);}

            //本年度总支出3
            if(MyTools.isNotEmpty(stNjGyhdtj.getZongzhichu4())){
                jc = new JcContentAttr1();jc.setContentId(contentId);
                jc.setAttrName("nykphTaf");
                jc.setAttrValue(stNjGyhdtj.getZongzhichu4());lists.add(jc);}

            //本年度公益活动支出1
            if(MyTools.isNotEmpty(stNjGyhdtj.getZhichu2())){
                jc = new JcContentAttr1();jc.setContentId(contentId);
                jc.setAttrName("KWkQLeOw");
                jc.setAttrValue(stNjGyhdtj.getZhichu2());lists.add(jc);}

            //本年度公益活动支出2
            if(MyTools.isNotEmpty(stNjGyhdtj.getZhichu3())){
                jc = new JcContentAttr1();jc.setContentId(contentId);
                jc.setAttrName("bHNBwujD");
                jc.setAttrValue(stNjGyhdtj.getZhichu3());lists.add(jc);}

            //本年度公益活动支出3
            if(MyTools.isNotEmpty(stNjGyhdtj.getZhichu4())){
                jc = new JcContentAttr1();jc.setContentId(contentId);
                jc.setAttrName("JpCdqyuC");
                jc.setAttrValue(stNjGyhdtj.getZhichu4());lists.add(jc);}

            //本年度公益活动支出占上年度总收入的比例1
            if(MyTools.isNotEmpty(stNjGyhdtj.getShangnianduzhanbi2())){
                jc = new JcContentAttr1();jc.setContentId(contentId);
                jc.setAttrName("WepPsyZm");
                jc.setAttrValue(stNjGyhdtj.getShangnianduzhanbi2());lists.add(jc);}

            //本年度公益活动支出占上年度总收入的比例2
            if(MyTools.isNotEmpty(stNjGyhdtj.getShangnianduzhanbi3())){
                jc = new JcContentAttr1();jc.setContentId(contentId);
                jc.setAttrName("FkbyImfP");
                jc.setAttrValue(stNjGyhdtj.getShangnianduzhanbi3());lists.add(jc);}

            //本年度公益活动支出占上年度总收入的比例3
            if(MyTools.isNotEmpty(stNjGyhdtj.getShangnianduzhanbi4())){
                jc = new JcContentAttr1();jc.setContentId(contentId);
                jc.setAttrName("tfAgIIRR");
                jc.setAttrValue(stNjGyhdtj.getShangnianduzhanbi4());lists.add(jc);}

            //本年度公益活动支出占本年度总支出的比例1
            if(MyTools.isNotEmpty(stNjGyhdtj.getBennianduzhanbi2())){
                jc = new JcContentAttr1();jc.setContentId(contentId);
                jc.setAttrName("jPMnwOca");
                jc.setAttrValue(stNjGyhdtj.getBennianduzhanbi2());lists.add(jc);}

            //本年度公益活动支出占本年度总支出的比例2
            if(MyTools.isNotEmpty(stNjGyhdtj.getBennianduzhanbi3())){
                jc = new JcContentAttr1();jc.setContentId(contentId);
                jc.setAttrName("RoPYcNcS");
                jc.setAttrValue(stNjGyhdtj.getBennianduzhanbi3());lists.add(jc);}

            //本年度公益活动支出占本年度总支出的比例3
            if(MyTools.isNotEmpty(stNjGyhdtj.getBennianduzhanbi4())){
                jc = new JcContentAttr1();jc.setContentId(contentId);
                jc.setAttrName("alBnqxlH");
                jc.setAttrValue(stNjGyhdtj.getBennianduzhanbi4());lists.add(jc);}
        }
        jc = null;
        return lists;
    }
}
