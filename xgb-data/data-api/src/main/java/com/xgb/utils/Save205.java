package com.xgb.utils;

import com.xgb.model.JcContentAttr1;
import com.xgb.model.StDjqk4;
import com.xgb.model.StNjInner4;
import com.xgb.util.MyTools;

import java.util.ArrayList;
import java.util.List;

public class Save205 {

    public static List<JcContentAttr1> getEntity(Integer contentId, StNjInner4 stNjInner4) {
        List<JcContentAttr1> lists = new ArrayList<>();

        //机构制度
        if(MyTools.isNotEmpty(stNjInner4.getJigouzhidu())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("smglfzjggl");
            jc.setAttrValue(stNjInner4.getJigouzhidu());lists.add(jc);jc=null;}

        //证书制度
        if(MyTools.isNotEmpty(stNjInner4.getZhengshuzhidu())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("zsyzfrzsbgsyzd");
            jc.setAttrValue(stNjInner4.getZhengshuzhidu());lists.add(jc);jc=null;}

        //证书保管地
        if(MyTools.isNotEmpty(stNjInner4.getZhengshubaoguandi())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("baoguanzai1");
            jc.setAttrValue(stNjInner4.getZhengshubaoguandi());lists.add(jc);jc=null;}



        //印章制度
        if(MyTools.isNotEmpty(stNjInner4.getYinzhangzhidu())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("zsyzyzbgsyzd");
            jc.setAttrValue(stNjInner4.getYinzhangzhidu());lists.add(jc);jc=null;}


        //印章保管地
        if(MyTools.isNotEmpty(stNjInner4.getYinzhangbaoguandi())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("baoguanzai2");
            jc.setAttrValue(stNjInner4.getYinzhangbaoguandi());lists.add(jc);jc=null;}



        //档案管理制度
        if(MyTools.isNotEmpty(stNjInner4.getDanganzhidu())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("daglzd");
            jc.setAttrValue(stNjInner4.getDanganzhidu());lists.add(jc);jc=null;}

        //档案管理制度保管在
        if(MyTools.isNotEmpty(stNjInner4.getDanganbaoguandi())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("baoguanzai3");
            jc.setAttrValue(stNjInner4.getDanganbaoguandi());lists.add(jc);jc=null;}



        //人事制度
        if(MyTools.isNotEmpty(stNjInner4.getRenshizhidu())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("rlzypyzd");
            jc.setAttrValue(stNjInner4.getRenshizhidu());lists.add(jc);jc=null;}

        //合同人数
        if(MyTools.isNotEmpty(stNjInner4.getHetongrenshu())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("qdhtrs");
            jc.setAttrValue(stNjInner4.getHetongrenshu().toString());lists.add(jc);jc=null;}

        //薪酬管理制度
        if(MyTools.isNotEmpty(stNjInner4.getXinchouguanlizhidu())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("scglzd");
            jc.setAttrValue(stNjInner4.getXinchouguanlizhidu());lists.add(jc);jc=null;}

        //考核制度
        if(MyTools.isNotEmpty(stNjInner4.getXinchouguanlizhidu2())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("khzd");
            jc.setAttrValue(stNjInner4.getXinchouguanlizhidu2());lists.add(jc);jc=null;}

        //奖惩制度
        if(MyTools.isNotEmpty(stNjInner4.getJiangchengzhidu())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("jczd");
            jc.setAttrValue(stNjInner4.getJiangchengzhidu());lists.add(jc);jc=null;}

        //业务培训制度
        if(MyTools.isNotEmpty(stNjInner4.getYewupeixunzhidu())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("ywpxzd");
            jc.setAttrValue(stNjInner4.getYewupeixunzhidu());lists.add(jc);jc=null;}

        //失业保险
        if(MyTools.isNotEmpty(stNjInner4.getShiyebaoxian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("sybx");
            jc.setAttrValue(stNjInner4.getShiyebaoxian().toString());lists.add(jc);jc=null;}

        //养老保险
        if(MyTools.isNotEmpty(stNjInner4.getYanglaobaoxian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("ylbx");
            jc.setAttrValue(stNjInner4.getYanglaobaoxian().toString());lists.add(jc);jc=null;}

        //医疗保险
        if(MyTools.isNotEmpty(stNjInner4.getYiliaobaoxian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("yiliaobaoxian");
            jc.setAttrValue(stNjInner4.getYiliaobaoxian().toString());lists.add(jc);jc=null;}

        //工伤保险
        if(MyTools.isNotEmpty(stNjInner4.getGongshangbaoxian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("gsbx");
            jc.setAttrValue(stNjInner4.getGongshangbaoxian().toString());lists.add(jc);jc=null;}

        //生育保险
        if(MyTools.isNotEmpty(stNjInner4.getShengyubaoxian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("syubaoxiang");
            jc.setAttrValue(stNjInner4.getShengyubaoxian().toString());lists.add(jc);jc=null;}

        //人民币开户银行
        if(MyTools.isNotEmpty(stNjInner4.getKaihuyinxing())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("rmbkhyh");
            jc.setAttrValue(stNjInner4.getKaihuyinxing());lists.add(jc);jc=null;}

        //开户名称
        if(MyTools.isNotEmpty(stNjInner4.getRenminbikaihumingcheng())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("rmbkhmc");
            jc.setAttrValue(stNjInner4.getRenminbikaihumingcheng());lists.add(jc);jc=null;}

        //人民币银行账号
        if(MyTools.isNotEmpty(stNjInner4.getYinxingzhanghao())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("rmbkhzh");
            jc.setAttrValue(stNjInner4.getYinxingzhanghao());lists.add(jc);jc=null;}

        //外币开户银行
        if(MyTools.isNotEmpty(stNjInner4.getWaibikaihuyinxing())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("wbkhyh");
            jc.setAttrValue(stNjInner4.getWaibikaihuyinxing());lists.add(jc);jc=null;}

        //外币银行名称
        if(MyTools.isNotEmpty(stNjInner4.getWaibikaihumingcheng())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("wbkhmc");
            jc.setAttrValue(stNjInner4.getWaibikaihumingcheng());lists.add(jc);jc=null;}

        //外币银行账号
        if(MyTools.isNotEmpty(stNjInner4.getWaibiyinxingzhanghao())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("wbkhzh");
            jc.setAttrValue(stNjInner4.getWaibiyinxingzhanghao());lists.add(jc);jc=null;}

        //财务核算是否独立
        if(MyTools.isNotEmpty(stNjInner4.getCaiwuhesuanshifouduli())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("cwhsdl");
            jc.setAttrValue(stNjInner4.getCaiwuhesuanshifouduli());lists.add(jc);jc=null;}

        StringBuffer stringBuffer = new StringBuffer();
        if(MyTools.isNotEmpty(stNjInner4.getGuoshui())){
            stringBuffer.append("国税,");
        }
        if(MyTools.isNotEmpty(stNjInner4.getDishui())){
            stringBuffer.append("地税,");
        }
        //未登记
        if(MyTools.isNotEmpty(stNjInner4.getWeidengji())){
            stringBuffer.append("未登记,");
        }
        //财政登记
        if(MyTools.isNotEmpty(stringBuffer)){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("shudengj");
            jc.setAttrValue(stringBuffer.toString());lists.add(jc);jc=null;}

        //财会人员数
        if(MyTools.isNotEmpty(stNjInner4.getCaihuirenyuanshu())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("zzcwrs");
            jc.setAttrValue(stNjInner4.getCaihuirenyuanshu().toString());lists.add(jc);jc=null;}

        //执业资格人数
        if(MyTools.isNotEmpty(stNjInner4.getZhiyezigerenshu())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("qzjyzgrs");
            jc.setAttrValue(stNjInner4.getZhiyezigerenshu().toString());lists.add(jc);jc=null;}

        //财务管理制度
        if(MyTools.isNotEmpty(stNjInner4.getCaiwuguanlizhidu())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("cwglzd");
            jc.setAttrValue(stNjInner4.getCaiwuguanlizhidu());lists.add(jc);jc=null;}

        //固定资产管理制度
        if(MyTools.isNotEmpty(stNjInner4.getGuziguanlizhidu())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("gdzcglzd");
            jc.setAttrValue(stNjInner4.getGuziguanlizhidu());lists.add(jc);jc=null;}

        //执行会计制度
        if(MyTools.isNotEmpty(stNjInner4.getZhixingkuaijizhidu())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("zxkjzd");
            jc.setAttrValue(stNjInner4.getZhixingkuaijizhidu());lists.add(jc);jc=null;}

        //财务软件
        if(MyTools.isNotEmpty(stNjInner4.getCaiwuruanjian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("cwrjb");
            jc.setAttrValue(stNjInner4.getCaiwuruanjian());lists.add(jc);jc=null;}


        //会费收据
        if(MyTools.isNotEmpty(stNjInner4.getHuifeishouju())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("pjlx");
            jc.setAttrValue("会费票据");lists.add(jc);jc=null;}

        //1
        if(MyTools.isNotEmpty(stNjInner4.getFafangjiguan1())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("ffjghfpj");
            jc.setAttrValue(stNjInner4.getFafangjiguan1());lists.add(jc);jc=null;}

        //捐赠收据
        if(MyTools.isNotEmpty(stNjInner4.getJuanzengshouju())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("pjlx2");
            jc.setAttrValue("捐赠票据");lists.add(jc);jc=null;}

        //2
        if(MyTools.isNotEmpty(stNjInner4.getFafangjiguan2())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("ffjgjzpj");
            jc.setAttrValue(stNjInner4.getFafangjiguan2());lists.add(jc);jc=null;}

        //税务发票
        if(MyTools.isNotEmpty(stNjInner4.getShuiwufapiao())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("pjlx3");
            jc.setAttrValue("税务发票");lists.add(jc);jc=null;}


        //3
        if(MyTools.isNotEmpty(stNjInner4.getFafangjiguan3())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("ffjgswfp");
            jc.setAttrValue(stNjInner4.getFafangjiguan3());lists.add(jc);jc=null;}

        //银钱收据
        if(MyTools.isNotEmpty(stNjInner4.getYinqianshouju())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("pjlx4");
            jc.setAttrValue("行政事业性收费票据");lists.add(jc);jc=null;}

        //4
        if(MyTools.isNotEmpty(stNjInner4.getFafangjiguan4())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("ffjgxzsysfpj");
            jc.setAttrValue(stNjInner4.getFafangjiguan4());lists.add(jc);jc=null;}

        //中央单位内部往来结算票据
        if(MyTools.isNotEmpty(stNjInner4.getZhongyangdanwei())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("pjlx5");
            jc.setAttrValue("中央单位内部往来结算票据");lists.add(jc);jc=null;}

        //5
        if(MyTools.isNotEmpty(stNjInner4.getFafangjiguan5())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("ffjgzydwnbwlpj");
            jc.setAttrValue(stNjInner4.getFafangjiguan5());lists.add(jc);jc=null;}


        //票据种类其他(其他1)
        if(MyTools.isNotEmpty(stNjInner4.getPiaojuzhongleiqita())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("pjlx6");
            jc.setAttrValue(stNjInner4.getPiaojuzhongleiqita());lists.add(jc);jc=null;}

        //6
        if(MyTools.isNotEmpty(stNjInner4.getFafangjiguan6())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("ffjgqt1");
            jc.setAttrValue(stNjInner4.getFafangjiguan6());lists.add(jc);jc=null;}

        //票据种类其他(其他2)
        if(MyTools.isNotEmpty(stNjInner4.getPiaojuzhongleiqita2())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("pjlx7");
            jc.setAttrValue(stNjInner4.getPiaojuzhongleiqita2());lists.add(jc);jc=null;}

        //7
        if(MyTools.isNotEmpty(stNjInner4.getFafangjiguan7())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("ffjgqt2");
            jc.setAttrValue(stNjInner4.getFafangjiguan7());lists.add(jc);jc=null;}

        //null
        if(MyTools.isNotEmpty(stNjInner4.getZhuanzhigongzuorenshu())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("qdhtrs");
            jc.setAttrValue(stNjInner4.getZhuanzhigongzuorenshu().toString());lists.add(jc);jc=null;}

        return lists;
    }
}
