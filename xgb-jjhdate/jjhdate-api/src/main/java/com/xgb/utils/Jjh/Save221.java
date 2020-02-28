package com.xgb.utils.Jjh;



import com.xgb.model.JcContentAttr1;
import com.xgb.model.JjhNjReport1;
import com.xgb.util.DateUtils;
import com.xgb.util.MyTools;

import java.util.ArrayList;
import java.util.List;

/**
* @Auther: 
* @Date: 
* @Description:
*/
public class Save221 {

    public static List<JcContentAttr1> getEntity(Integer contentId, JjhNjReport1 oldTable) {
        List<JcContentAttr1> lists = new ArrayList<>();
        JcContentAttr1 jc = null;

        if(MyTools.isNotEmpty(oldTable.getJijinhuimingcheng ())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("title");
            jc.setAttrValue(oldTable.getJijinhuimingcheng ());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getJigoudaima())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("stxcode");
            jc.setAttrValue(oldTable.getJigoudaima());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getZongzhi())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("gnVIOxZY");
            jc.setAttrValue(oldTable.getZongzhi());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getYewufanwei ())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("THySvqfQ");
            jc.setAttrValue(oldTable.getYewufanwei ());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getJijinhuileixing ())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("KrKXLWaN");
            jc.setAttrValue(oldTable.getJijinhuileixing().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getShifoucishan())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("hRLeBniy");
            jc.setAttrValue(oldTable.getShifoucishan()=='1'?"是":"否");lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getCishandate ())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("AUGkNEoW");
            jc.setAttrValue(DateUtils.dateToyyyyMMdd(oldTable.getCishandate()));lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getShifoumujuan())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("GxLwDVLP");
            jc.setAttrValue(oldTable.getShifoumujuan()=='1'?"是":"否");lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getMujuandate())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("vfbdklbq");
            jc.setAttrValue(DateUtils.dateToyyyyMMdd(oldTable.getMujuandate()));lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getChenglishijian ())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("BtweVGFX");
            jc.setAttrValue(DateUtils.dateToyyyyMMdd(oldTable.getChenglishijian()));lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getYuanshijijinshue ())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("OpFxUwTM");
            jc.setAttrValue(oldTable.getYuanshijijinshue().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getYewuzhuguandanwei ())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("krhaxRSN");
            jc.setAttrValue(oldTable.getYewuzhuguandanwei ());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getJijinhuizhusuo())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("qJXNngVr");
            jc.setAttrValue(oldTable.getJijinhuizhusuo());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getDianziyouxiangdizhi ())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("ZeTQxjjG");
            jc.setAttrValue(oldTable.getDianziyouxiangdizhi ());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getChuanzhen   ())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("chuanzhen1");
            jc.setAttrValue(oldTable.getChuanzhen   ());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getYouzhengbianma ())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("KMIOLNXZ");
            jc.setAttrValue(oldTable.getYouzhengbianma ());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getHulianwangwangzhi ())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("IdWOFuPq");
            jc.setAttrValue(oldTable.getHulianwangwangzhi ());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getShenjiyijianleixing())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("mLTABEGW");
            jc.setAttrValue(oldTable.getShenjiyijianleixing());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getMishuchangxingming ())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("WDNdiCHR");
            jc.setAttrValue(oldTable.getMishuchangxingming ());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getMishuzhangdianhua ())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("dSqVZulN");
            jc.setAttrValue(oldTable.getMishuzhangdianhua ());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getMishuzhangyidongdianhua ())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("PrGimXQB");
            jc.setAttrValue(oldTable.getMishuzhangyidongdianhua ());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getMishuzhangmail())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("PVWiidMa");
            jc.setAttrValue(oldTable.getMishuzhangmail());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getLianxirenxingming())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("KeLMRLdd");
            jc.setAttrValue(oldTable.getLianxirenxingming());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getLianxirentel())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("CqyqBCGK");
            jc.setAttrValue(oldTable.getLianxirentel());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getLianxirenphone   ())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("sAzDwsCK");
            jc.setAttrValue(oldTable.getLianxirenphone   ());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getLianxirenmail())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("AIhdxnzL");
            jc.setAttrValue(oldTable.getLianxirenmail());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getSpokename())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("ELSzgHGY");
            jc.setAttrValue(oldTable.getSpokename());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getSpoketel ())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("NohmJMJP");
            jc.setAttrValue(oldTable.getSpoketel ());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getSpokephone ())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("CxbrrfAr");
            jc.setAttrValue(oldTable.getSpokephone ());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getSpokemail ())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("cJjPifnl");
            jc.setAttrValue(oldTable.getSpokemail ());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getLishichangxingming ())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("yHYDAGlg");
            jc.setAttrValue(oldTable.getLishichangxingming ());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getLishirenshu())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("dEvnNFRa");
            jc.setAttrValue(oldTable.getLishirenshu().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getJianshirenshu())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("bXThvUad");
            jc.setAttrValue(oldTable.getJianshirenshu().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getFuzerenshu())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("cQUGeeRb");
            jc.setAttrValue(oldTable.getFuzerenshu().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getZhuanzhirenshu())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("tRoCwGXd");
            jc.setAttrValue(oldTable.getZhuanzhirenshu().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getKanwuqingkuang())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("GfSqDDRi");
            jc.setAttrValue(oldTable.getKanwuqingkuang().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getShiwusuomingcheng())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("SMcnQbwB");
            jc.setAttrValue(oldTable.getShiwusuomingcheng());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getShenjiyijianleixing ())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("mLTABEGW");
            jc.setAttrValue(oldTable.getShenjiyijianleixing ());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getBaogaoriqi())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("naRneQRs");
            jc.setAttrValue(DateUtils.dateToyyyyMMdd(oldTable.getBaogaoriqi()));lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getBaogaobianhao())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("IbVQMPLQ");
            jc.setAttrValue(oldTable.getBaogaobianhao());lists.add(jc);}



        jc = null;

        return lists;
    }
}

