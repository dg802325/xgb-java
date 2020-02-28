package com.xgb.utils.St;

import com.xgb.model.JcContentAttr1;
import com.xgb.model.StDjqk4;
import com.xgb.model.StNjInner4;
import com.xgb.util.MyTools;

import java.util.ArrayList;
import java.util.List;

public class Save205 {

    public static List<JcContentAttr1> getEntity(Integer contentId, StNjInner4 stNjInner4) {
        List<JcContentAttr1> lists = new ArrayList<>();
        JcContentAttr1 jc = null;
        
        //机构制度
        if(MyTools.isNotEmpty(stNjInner4.getJigouzhidu())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("smglfzjggl");
            jc.setAttrValue(stNjInner4.getJigouzhidu());lists.add(jc);}

        //证书制度
        if(MyTools.isNotEmpty(stNjInner4.getZhengshuzhidu())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("zsyzfrzsbgsyzd");
            jc.setAttrValue(stNjInner4.getZhengshuzhidu());lists.add(jc);}

        //证书保管地
        if(MyTools.isNotEmpty(stNjInner4.getZhengshubaoguandi())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("baoguanzai1");
            jc.setAttrValue(stNjInner4.getZhengshubaoguandi());lists.add(jc);}



        //印章制度
        if(MyTools.isNotEmpty(stNjInner4.getYinzhangzhidu())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("zsyzyzbgsyzd");
            jc.setAttrValue(stNjInner4.getYinzhangzhidu());lists.add(jc);}


        //印章保管地
        if(MyTools.isNotEmpty(stNjInner4.getYinzhangbaoguandi())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("baoguanzai2");
            jc.setAttrValue(stNjInner4.getYinzhangbaoguandi());lists.add(jc);}



        //档案管理制度
        if(MyTools.isNotEmpty(stNjInner4.getDanganzhidu())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("daglzd");
            jc.setAttrValue(stNjInner4.getDanganzhidu());lists.add(jc);}

        //档案管理制度保管在
        if(MyTools.isNotEmpty(stNjInner4.getDanganbaoguandi())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("baoguanzai3");
            jc.setAttrValue(stNjInner4.getDanganbaoguandi());lists.add(jc);}



        //人事制度
        if(MyTools.isNotEmpty(stNjInner4.getRenshizhidu())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("rlzypyzd");
            jc.setAttrValue(stNjInner4.getRenshizhidu());lists.add(jc);}

        //合同人数
        if(MyTools.isNotEmpty(stNjInner4.getHetongrenshu())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("qdhtrs");
            jc.setAttrValue(stNjInner4.getHetongrenshu().toString());lists.add(jc);}

        //薪酬管理制度
        if(MyTools.isNotEmpty(stNjInner4.getXinchouguanlizhidu())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("scglzd");
            jc.setAttrValue(stNjInner4.getXinchouguanlizhidu());lists.add(jc);}

        //考核制度
        if(MyTools.isNotEmpty(stNjInner4.getXinchouguanlizhidu2())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("khzd");
            jc.setAttrValue(stNjInner4.getXinchouguanlizhidu2());lists.add(jc);}

        //奖惩制度
        if(MyTools.isNotEmpty(stNjInner4.getJiangchengzhidu())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("jczd");
            jc.setAttrValue(stNjInner4.getJiangchengzhidu());lists.add(jc);}

        //业务培训制度
        if(MyTools.isNotEmpty(stNjInner4.getYewupeixunzhidu())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("ywpxzd");
            jc.setAttrValue(stNjInner4.getYewupeixunzhidu());lists.add(jc);}

        //失业保险
        if(MyTools.isNotEmpty(stNjInner4.getShiyebaoxian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("sybx");
            jc.setAttrValue(stNjInner4.getShiyebaoxian().toString());lists.add(jc);}

        //养老保险
        if(MyTools.isNotEmpty(stNjInner4.getYanglaobaoxian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("ylbx");
            jc.setAttrValue(stNjInner4.getYanglaobaoxian().toString());lists.add(jc);}

        //医疗保险
        if(MyTools.isNotEmpty(stNjInner4.getYiliaobaoxian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("yiliaobaoxian");
            jc.setAttrValue(stNjInner4.getYiliaobaoxian().toString());lists.add(jc);}

        //工伤保险
        if(MyTools.isNotEmpty(stNjInner4.getGongshangbaoxian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("gsbx");
            jc.setAttrValue(stNjInner4.getGongshangbaoxian().toString());lists.add(jc);}

        //生育保险
        if(MyTools.isNotEmpty(stNjInner4.getShengyubaoxian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("syubaoxiang");
            jc.setAttrValue(stNjInner4.getShengyubaoxian().toString());lists.add(jc);}

        //人民币开户银行
        if(MyTools.isNotEmpty(stNjInner4.getKaihuyinxing())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("rmbkhyh");
            jc.setAttrValue(stNjInner4.getKaihuyinxing());lists.add(jc);}

        //开户名称
        if(MyTools.isNotEmpty(stNjInner4.getRenminbikaihumingcheng())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("rmbkhmc");
            jc.setAttrValue(stNjInner4.getRenminbikaihumingcheng());lists.add(jc);}

        //人民币银行账号
        if(MyTools.isNotEmpty(stNjInner4.getYinxingzhanghao())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("rmbkhzh");
            jc.setAttrValue(stNjInner4.getYinxingzhanghao());lists.add(jc);}

        //外币开户银行
        if(MyTools.isNotEmpty(stNjInner4.getWaibikaihuyinxing())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("wbkhyh");
            jc.setAttrValue(stNjInner4.getWaibikaihuyinxing());lists.add(jc);}

        //外币银行名称
        if(MyTools.isNotEmpty(stNjInner4.getWaibikaihumingcheng())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("wbkhmc");
            jc.setAttrValue(stNjInner4.getWaibikaihumingcheng());lists.add(jc);}

        //外币银行账号
        if(MyTools.isNotEmpty(stNjInner4.getWaibiyinxingzhanghao())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("wbkhzh");
            jc.setAttrValue(stNjInner4.getWaibiyinxingzhanghao());lists.add(jc);}

        //财务核算是否独立
        if(MyTools.isNotEmpty(stNjInner4.getCaiwuhesuanshifouduli())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("cwhsdl");
            jc.setAttrValue(stNjInner4.getCaiwuhesuanshifouduli());lists.add(jc);}

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
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("shudengj");
            jc.setAttrValue(stringBuffer.toString());lists.add(jc);}

        //财会人员数
        if(MyTools.isNotEmpty(stNjInner4.getCaihuirenyuanshu())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("zzcwrs");
            jc.setAttrValue(stNjInner4.getCaihuirenyuanshu().toString());lists.add(jc);}

        //执业资格人数
        if(MyTools.isNotEmpty(stNjInner4.getZhiyezigerenshu())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("qzjyzgrs");
            jc.setAttrValue(stNjInner4.getZhiyezigerenshu().toString());lists.add(jc);}

        //财务管理制度
        if(MyTools.isNotEmpty(stNjInner4.getCaiwuguanlizhidu())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("cwglzd");
            jc.setAttrValue(stNjInner4.getCaiwuguanlizhidu());lists.add(jc);}

        //固定资产管理制度
        if(MyTools.isNotEmpty(stNjInner4.getGuziguanlizhidu())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("gdzcglzd");
            jc.setAttrValue(stNjInner4.getGuziguanlizhidu());lists.add(jc);}

        //执行会计制度
        if(MyTools.isNotEmpty(stNjInner4.getZhixingkuaijizhidu())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("zxkjzd");
            jc.setAttrValue(stNjInner4.getZhixingkuaijizhidu());lists.add(jc);}

        //财务软件
        if(MyTools.isNotEmpty(stNjInner4.getCaiwuruanjian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("cwrjb");
            jc.setAttrValue(stNjInner4.getCaiwuruanjian());lists.add(jc);}


        //会费收据
        if(MyTools.isNotEmpty(stNjInner4.getHuifeishouju())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("pjlx");
            jc.setAttrValue("会费票据");lists.add(jc);}

        //1
        if(MyTools.isNotEmpty(stNjInner4.getFafangjiguan1())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("ffjghfpj");
            jc.setAttrValue(stNjInner4.getFafangjiguan1());lists.add(jc);}

        //捐赠收据
        if(MyTools.isNotEmpty(stNjInner4.getJuanzengshouju())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("pjlx2");
            jc.setAttrValue("捐赠票据");lists.add(jc);}

        //2
        if(MyTools.isNotEmpty(stNjInner4.getFafangjiguan2())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("ffjgjzpj");
            jc.setAttrValue(stNjInner4.getFafangjiguan2());lists.add(jc);}

        //税务发票
        if(MyTools.isNotEmpty(stNjInner4.getShuiwufapiao())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("pjlx3");
            jc.setAttrValue("税务发票");lists.add(jc);}


        //3
        if(MyTools.isNotEmpty(stNjInner4.getFafangjiguan3())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("ffjgswfp");
            jc.setAttrValue(stNjInner4.getFafangjiguan3());lists.add(jc);}

        //银钱收据
        if(MyTools.isNotEmpty(stNjInner4.getYinqianshouju())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("pjlx4");
            jc.setAttrValue("行政事业性收费票据");lists.add(jc);}

        //4
        if(MyTools.isNotEmpty(stNjInner4.getFafangjiguan4())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("ffjgxzsysfpj");
            jc.setAttrValue(stNjInner4.getFafangjiguan4());lists.add(jc);}

        //中央单位内部往来结算票据
        if(MyTools.isNotEmpty(stNjInner4.getZhongyangdanwei())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("pjlx5");
            jc.setAttrValue("中央单位内部往来结算票据");lists.add(jc);}

        //5
        if(MyTools.isNotEmpty(stNjInner4.getFafangjiguan5())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("ffjgzydwnbwlpj");
            jc.setAttrValue(stNjInner4.getFafangjiguan5());lists.add(jc);}


        //票据种类其他(其他1)
        if(MyTools.isNotEmpty(stNjInner4.getPiaojuzhongleiqita())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("pjlx6");
            jc.setAttrValue(stNjInner4.getPiaojuzhongleiqita());lists.add(jc);}

        //6
        if(MyTools.isNotEmpty(stNjInner4.getFafangjiguan6())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("ffjgqt1");
            jc.setAttrValue(stNjInner4.getFafangjiguan6());lists.add(jc);}

        //票据种类其他(其他2)
        if(MyTools.isNotEmpty(stNjInner4.getPiaojuzhongleiqita2())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("pjlx7");
            jc.setAttrValue(stNjInner4.getPiaojuzhongleiqita2());lists.add(jc);}

        //7
        if(MyTools.isNotEmpty(stNjInner4.getFafangjiguan7())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("ffjgqt2");
            jc.setAttrValue(stNjInner4.getFafangjiguan7());lists.add(jc);}

        //null
        if(MyTools.isNotEmpty(stNjInner4.getZhuanzhigongzuorenshu())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("qdhtrs");
            jc.setAttrValue(stNjInner4.getZhuanzhigongzuorenshu().toString());lists.add(jc);}

        jc=null;
        return lists;
    }
}
