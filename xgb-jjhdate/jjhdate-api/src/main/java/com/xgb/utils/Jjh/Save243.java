package com.xgb.utils.Jjh;
import com.xgb.model.JcContentAttr1;
import com.xgb.model.JjhnjReport4;
import com.xgb.util.MyTools;

import java.util.ArrayList;
import java.util.List;
/**
 * @Auther:
 * @Date:
 * @Description:
 */
public class Save243 {

    public static List<JcContentAttr1> getEntity(Integer contentId, JjhnjReport4 oldTable) {
        List<JcContentAttr1> lists = new ArrayList<>();
        JcContentAttr1 jc = null;

        if(MyTools.isNotEmpty(oldTable.getMojuanfeixian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("vbljUgyh");
            jc.setAttrValue(oldTable.getMojuanfeixian().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getMojuanxian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("pSMgLDHX");
            jc.setAttrValue(oldTable.getMojuanxian().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getMojuanheji())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("XtjqEZwc");
            jc.setAttrValue(oldTable.getMojuanheji().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getLeijijuanfeixian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("qlgXLldj");
            jc.setAttrValue(oldTable.getLeijijuanfeixian().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getLeijijuanxian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("egBLbWSa");
            jc.setAttrValue(oldTable.getLeijijuanxian().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getLeijijuanheji())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("cmoztBFS");
            jc.setAttrValue(oldTable.getLeijijuanheji().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getMohuifeixian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("bYFUqlab");
            jc.setAttrValue(oldTable.getMohuifeixian().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getMohuixian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("eltbxdqC");
            jc.setAttrValue(oldTable.getMohuixian().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getMohuiheji())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("YefQahTB");
            jc.setAttrValue(oldTable.getMohuiheji().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getLeijihuifeixian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("rKLaCuoX");
            jc.setAttrValue(oldTable.getLeijihuifeixian().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getLeijihuixian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("ECmQqufJ");
            jc.setAttrValue(oldTable.getLeijihuixian().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getLeijihuiheji())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("eakIMvLu");
            jc.setAttrValue(oldTable.getLeijihuiheji().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getMofuwufeixian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("FXGVNVFj");
            jc.setAttrValue(oldTable.getMofuwufeixian().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getMofuwuxian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("geEKPktx");
            jc.setAttrValue(oldTable.getMofuwuxian().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getMofuwuheji())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("VLKtfueu");
            jc.setAttrValue(oldTable.getMofuwuheji().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getLeijifuwufeixian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("sAYkMRCD");
            jc.setAttrValue(oldTable.getLeijifuwufeixian().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getLeijifuwuxian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("QUlcXUYE");
            jc.setAttrValue(oldTable.getLeijifuwuxian().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getLeijifuwuheji())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("Pawihsos");
            jc.setAttrValue(oldTable.getLeijifuwuheji().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getMoxiaoshoufeixian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("WXWaoCeA");
            jc.setAttrValue(oldTable.getMoxiaoshoufeixian().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getMoxiaoshouxian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("dTRfrYlj");
            jc.setAttrValue(oldTable.getMoxiaoshouxian().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getMoxiaoshouheji())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("OTJlnjyO");
            jc.setAttrValue(oldTable.getMoxiaoshouheji().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getLeijixiaoshoufeixian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("dqZvhuvQ");
            jc.setAttrValue(oldTable.getLeijixiaoshoufeixian().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getLeijixiaoshouxian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("nLpfMZBz");
            jc.setAttrValue(oldTable.getLeijixiaoshouxian().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getLeijixiaoshouheji())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("GUCqPWTb");
            jc.setAttrValue(oldTable.getLeijixiaoshouheji().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getMobuzhufeixian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("gMMSPceL");
            jc.setAttrValue(oldTable.getMobuzhufeixian().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getMobuzhuxian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("qdvxsaji");
            jc.setAttrValue(oldTable.getMobuzhuxian().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getMobuzhuheji())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("ZvFczPjf");
            jc.setAttrValue(oldTable.getMobuzhuheji().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getLeijibuzhufeixian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("aQiGnebs");
            jc.setAttrValue(oldTable.getLeijibuzhufeixian().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getLeijibuzhuxian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("vFeQUnrp");
            jc.setAttrValue(oldTable.getLeijibuzhuxian().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getLeijibuzhuheji())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("cXXirxkv");
            jc.setAttrValue(oldTable.getLeijibuzhuheji().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getMotouzifeixian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("TiHHpzbq");
            jc.setAttrValue(oldTable.getMotouzifeixian().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getMotouzixian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("tHnZAtml");
            jc.setAttrValue(oldTable.getMotouzixian().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getMotouziheji())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("BwXSkZor");
            jc.setAttrValue(oldTable.getMotouziheji().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getLeijitouzifeixian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("fAghkaOB");
            jc.setAttrValue(oldTable.getLeijitouzifeixian().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getLeijitouzixian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("pnFjmlFc");
            jc.setAttrValue(oldTable.getLeijitouzixian().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getLeijitouziheji())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("DVKADnkC");
            jc.setAttrValue(oldTable.getLeijitouziheji().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getMoqitafeixian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("NrgMdlOd");
            jc.setAttrValue(oldTable.getMoqitafeixian().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getMoqitaxian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("QgUpWzrM");
            jc.setAttrValue(oldTable.getMoqitaxian().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getMoqitaheji())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("szwERRHI");
            jc.setAttrValue(oldTable.getMoqitaheji().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getLeijiqitafeixian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("ymibbSZI");
            jc.setAttrValue(oldTable.getLeijiqitafeixian().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getLeijiqitaxian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("cESOdIlZ");
            jc.setAttrValue(oldTable.getLeijiqitaxian().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getLeijiqitaheji())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("CXPGrCGm");
            jc.setAttrValue(oldTable.getLeijiqitaheji().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getMohejifeixian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("LMUMsLjS");
            jc.setAttrValue(oldTable.getMohejifeixian().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getMohejixian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("qREEHfvI");
            jc.setAttrValue(oldTable.getMohejixian().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getMohejiheji())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("ZOyGVTNL");
            jc.setAttrValue(oldTable.getMohejiheji().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getLeijihejifeixian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("SJjftvnA");
            jc.setAttrValue(oldTable.getLeijihejifeixian().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getLeijihejixian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("QyGjMmzI");
            jc.setAttrValue(oldTable.getLeijihejixian().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getLeijihejiheji())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("yyoUnFtZ");
            jc.setAttrValue(oldTable.getLeijihejiheji().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getMochengbenfeixian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("yaPgtljy");
            jc.setAttrValue(oldTable.getMochengbenfeixian().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getMochengbenxian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("PhJjOUWK");
            jc.setAttrValue(oldTable.getMochengbenxian().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getMochengbenheji())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("TTAlEFnd");
            jc.setAttrValue(oldTable.getMochengbenheji().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getLeijichengbenfeixian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("qopvHAYd");
            jc.setAttrValue(oldTable.getLeijichengbenfeixian().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getLeijichengbenxian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("LwHGhPtX");
            jc.setAttrValue(oldTable.getLeijichengbenxian().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getLeijichengbenheji())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("wpfcFEtl");
            jc.setAttrValue(oldTable.getLeijichengbenheji().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getMoguanlifeixian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("MwRBupfx");
            jc.setAttrValue(oldTable.getMoguanlifeixian().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getMoguanlixian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("fMXLTRoZ");
            jc.setAttrValue(oldTable.getMoguanlixian().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getMoguanliheji())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("KEIWhqjr");
            jc.setAttrValue(oldTable.getMoguanliheji().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getLeijiguanlifeixian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("rJLruxVf");
            jc.setAttrValue(oldTable.getLeijiguanlifeixian().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getLeijiguanlixian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("gIsYelHJ");
            jc.setAttrValue(oldTable.getLeijiguanlixian().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getLeijiguanliheji())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("VUGOofaF");
            jc.setAttrValue(oldTable.getLeijiguanliheji().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getMochouzifeixian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("BXfCpbcr");
            jc.setAttrValue(oldTable.getMochouzifeixian().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getMochouzixian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("zCfFwqxK");
            jc.setAttrValue(oldTable.getMochouzixian().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getMochouziheji())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("VvUsauDD");
            jc.setAttrValue(oldTable.getMochouziheji().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getLeijichouzifeixian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("UzSsoNTT");
            jc.setAttrValue(oldTable.getLeijichouzifeixian().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getLeijichouzixian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("SLWtrMLi");
            jc.setAttrValue(oldTable.getLeijichouzixian().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getLeijichouziheji())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("xoUGLSXa");
            jc.setAttrValue(oldTable.getLeijichouziheji().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getMoqitafeiyongfei())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("jWBFHXge");
            jc.setAttrValue(oldTable.getMoqitafeiyongfei().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getMoqitafeiyongxian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("hxlIYwJP");
            jc.setAttrValue(oldTable.getMoqitafeiyongxian().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getMoqitafeiyongheji())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("RfNdEJuO");
            jc.setAttrValue(oldTable.getMoqitafeiyongheji().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getLeijiqitafeiyongfeixian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("HRGButME");
            jc.setAttrValue(oldTable.getLeijiqitafeiyongfeixian().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getLeijiqitafeiyongxian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("rdpEWYTy");
            jc.setAttrValue(oldTable.getLeijiqitafeiyongxian().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getLeijiqitafeiyongheji())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("DhiMyymc");
            jc.setAttrValue(oldTable.getLeijiqitafeiyongheji().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getMofeiyonghejifei())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("bRnvuDNQ");
            jc.setAttrValue(oldTable.getMofeiyonghejifei().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getMofeiyonghejixian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("IQRWYfWP");
            jc.setAttrValue(oldTable.getMofeiyonghejixian().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getMofeiyonghejiheji())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("PLOODldK");
            jc.setAttrValue(oldTable.getMofeiyonghejiheji().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getLeijifeiyonghejifei())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("vhhHmKvK");
            jc.setAttrValue(oldTable.getLeijifeiyonghejifei().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getLeijifeiyonghejixian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("ZpJutUcV");
            jc.setAttrValue(oldTable.getLeijifeiyonghejixian().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getLeijifeiyonghejiheji())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("ZgKPZcKY");
            jc.setAttrValue(oldTable.getLeijifeiyonghejiheji().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getMozhuanfeixian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("fVLRSPqM");
            jc.setAttrValue(oldTable.getMozhuanfeixian().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getMozhuanxian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("NMajqVCH");
            jc.setAttrValue(oldTable.getMozhuanxian().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getMozhuanheji())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("MWVlvHWa");
            jc.setAttrValue(oldTable.getMozhuanheji().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getLeijizhuanfeixian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("iFqLkqDc");
            jc.setAttrValue(oldTable.getLeijizhuanfeixian().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getLeijizhuanxian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("mnaeCBTW");
            jc.setAttrValue(oldTable.getLeijizhuanxian().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getLeijizhuanheji())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("ehZWzIft");
            jc.setAttrValue(oldTable.getLeijizhuanheji().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getMobiandongfeixian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("ijEwGDDh");
            jc.setAttrValue(oldTable.getMobiandongfeixian().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getMobiandongxian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("FvQQrgwB");
            jc.setAttrValue(oldTable.getMobiandongxian().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getMobiandongheji())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("EXxIyHGX");
            jc.setAttrValue(oldTable.getMobiandongheji().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getLeijibiandongfeixian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("qfQwigir");
            jc.setAttrValue(oldTable.getLeijibiandongfeixian().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getLeijibiandongxian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("jGIKyMVR");
            jc.setAttrValue(oldTable.getLeijibiandongxian().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getLeijibiandongheji())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("KKaBlEgw");
            jc.setAttrValue(oldTable.getLeijibiandongheji().toString());lists.add(jc);}

        jc = null;

        return lists;
    }
}

