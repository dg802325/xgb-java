package com.xgb.utils;

import com.xgb.model.JcContentAttr1;
import com.xgb.model.MfNianjianJbxx;
import com.xgb.model.StNjInner4;
import com.xgb.util.MyTools;

import java.util.ArrayList;
import java.util.List;

public class Save261 {

    public static List<JcContentAttr1> getEntity(Integer contentId, MfNianjianJbxx mfNianjianJbxx) {
        List<JcContentAttr1> lists = new ArrayList<>();

        //联系电话
        if(MyTools.isNotEmpty(mfNianjianJbxx.getDianhua())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("WfWQRWdI");
            jc.setAttrValue(mfNianjianJbxx.getDianhua());lists.add(jc);jc=null;}

        //业务范围
        if(MyTools.isNotEmpty(mfNianjianJbxx.getYewufanwei())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("XqjWIVSz");
            jc.setAttrValue(mfNianjianJbxx.getYewufanwei());lists.add(jc);jc=null;}

        //登记证号
        if(MyTools.isNotEmpty(mfNianjianJbxx.getDengjizhenghao())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("wEwJKgwg");
            jc.setAttrValue(mfNianjianJbxx.getDengjizhenghao());lists.add(jc);jc=null;}

        //组织机构代码
        if(MyTools.isNotEmpty(mfNianjianJbxx.getZuzhijigoudaima())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("stxcode");
            jc.setAttrValue(mfNianjianJbxx.getZuzhijigoudaima());lists.add(jc);jc=null;}

        //执业许可证号
        if(MyTools.isNotEmpty(mfNianjianJbxx.getZhiyexukezhenghao())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("TUeooZBw");
            jc.setAttrValue(mfNianjianJbxx.getZhiyexukezhenghao());lists.add(jc);jc=null;}

        //成立时间
        if(MyTools.isNotEmpty(mfNianjianJbxx.getChenglishijian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("eXrLNnsI");
            jc.setAttrValue(mfNianjianJbxx.getChenglishijian().toString());lists.add(jc);jc=null;}

        //开办资金
        if(MyTools.isNotEmpty(mfNianjianJbxx.getKaibanzijin())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("ClkiBHfU");
            jc.setAttrValue(mfNianjianJbxx.getKaibanzijin().toString());lists.add(jc);jc=null;}

        //邮政编码
        if(MyTools.isNotEmpty(mfNianjianJbxx.getYouzhengbianma())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("fdGYQnPK");
            jc.setAttrValue(mfNianjianJbxx.getYouzhengbianma());lists.add(jc);jc=null;}

        //住所来源
        if(MyTools.isNotEmpty(mfNianjianJbxx.getZhusuolaiyuan())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("MlSxwhbH");
            jc.setAttrValue(mfNianjianJbxx.getZhusuolaiyuan());lists.add(jc);jc=null;}

        //租赁到期日
        if(MyTools.isNotEmpty(mfNianjianJbxx.getZulindaoqiri())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("MlSxwhaH");
            jc.setAttrValue(mfNianjianJbxx.getZulindaoqiri().toString());lists.add(jc);jc=null;}

        //联系电话
        if(MyTools.isNotEmpty(mfNianjianJbxx.getLianxidianhua())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("uEScfYKM");
            jc.setAttrValue(mfNianjianJbxx.getLianxidianhua());lists.add(jc);jc=null;}

        //手机电话
        if(MyTools.isNotEmpty(mfNianjianJbxx.getShoujidianhua())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("HsskYxOI");
            jc.setAttrValue(mfNianjianJbxx.getShoujidianhua());lists.add(jc);jc=null;}

        //传真
        if(MyTools.isNotEmpty(mfNianjianJbxx.getChuanzhen())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("klmAydZX");
            jc.setAttrValue(mfNianjianJbxx.getChuanzhen());lists.add(jc);jc=null;}

        //网站地址
        if(MyTools.isNotEmpty(mfNianjianJbxx.getWangzhandizhi())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("VPgCDcpm");
            jc.setAttrValue(mfNianjianJbxx.getWangzhandizhi());lists.add(jc);jc=null;}

        //法定代表人
        if(MyTools.isNotEmpty(mfNianjianJbxx.getFadingdaibiaoren())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("kenHBMel");
            jc.setAttrValue(mfNianjianJbxx.getFadingdaibiaoren());lists.add(jc);jc=null;}

        //法人出生年月日
        if(MyTools.isNotEmpty(mfNianjianJbxx.getFarenshengri())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("mQRUAXGC");
            jc.setAttrValue(mfNianjianJbxx.getFarenshengri().toString());lists.add(jc);jc=null;}

        //法人性别
        if(MyTools.isNotEmpty(mfNianjianJbxx.getFarenxingbie())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("xingbei1");
            jc.setAttrValue(mfNianjianJbxx.getFarenxingbie());lists.add(jc);jc=null;}

        //法人学历
        if(MyTools.isNotEmpty(mfNianjianJbxx.getFarenxueli())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("xueli1");
            jc.setAttrValue(mfNianjianJbxx.getFarenxueli());lists.add(jc);jc=null;}

        //法人职务
        if(MyTools.isNotEmpty(mfNianjianJbxx.getFarenzhiwu())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("danrenzw");
            jc.setAttrValue(mfNianjianJbxx.getFarenzhiwu());lists.add(jc);jc=null;}


        //董事长姓名
        if(MyTools.isNotEmpty(mfNianjianJbxx.getDongshichangxingming())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("pVzNFLBK");
            jc.setAttrValue(mfNianjianJbxx.getDongshichangxingming());lists.add(jc);jc=null;}

        //董事长出生日期
        if(MyTools.isNotEmpty(mfNianjianJbxx.getDongshichangshengri())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("vhUnFNaS");
            jc.setAttrValue(mfNianjianJbxx.getDongshichangshengri().toString());lists.add(jc);jc=null;}

        //董事长性别
        if(MyTools.isNotEmpty(mfNianjianJbxx.getDongshichangxingbie())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("xingbie2");
            jc.setAttrValue(mfNianjianJbxx.getDongshichangxingbie());lists.add(jc);jc=null;}

        //董事长政治面貌
        if(MyTools.isNotEmpty(mfNianjianJbxx.getDongshichangmianmao())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("zzmm2");
            jc.setAttrValue(mfNianjianJbxx.getDongshichangmianmao());lists.add(jc);jc=null;}

        //董事长学历
        if(MyTools.isNotEmpty(mfNianjianJbxx.getDongshichangxueli())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("xueli2");
            jc.setAttrValue(mfNianjianJbxx.getDongshichangxueli());lists.add(jc);jc=null;}

        //董事长是否专职
        if(MyTools.isNotEmpty(mfNianjianJbxx.getDongshichangzhuanzhi())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("shifzz");
            jc.setAttrValue(mfNianjianJbxx.getDongshichangzhuanzhi());lists.add(jc);jc=null;}

        //工作单位及职务
        if(MyTools.isNotEmpty(mfNianjianJbxx.getDongshichangdanwei())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("ndcWojrg");
            jc.setAttrValue(mfNianjianJbxx.getDongshichangdanwei());lists.add(jc);jc=null;}

        //董事长电话
        if(MyTools.isNotEmpty(mfNianjianJbxx.getDongshichangdianhua())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("QhmfKcFN");
            jc.setAttrValue(mfNianjianJbxx.getDongshichangdianhua());lists.add(jc);jc=null;}

        //董事长移动电话
        if(MyTools.isNotEmpty(mfNianjianJbxx.getDongshichangshouji())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("rmjbnAFc");
            jc.setAttrValue(mfNianjianJbxx.getDongshichangshouji());lists.add(jc);jc=null;}

        //行政负责人姓名
        if(MyTools.isNotEmpty(mfNianjianJbxx.getFuzerenxingming())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("idLtjqkD");
            jc.setAttrValue(mfNianjianJbxx.getFuzerenxingming());lists.add(jc);jc=null;}

        //行政负责人性别
        if(MyTools.isNotEmpty(mfNianjianJbxx.getFuzerenxingbie())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("xingbie4");
            jc.setAttrValue(mfNianjianJbxx.getFuzerenxingbie());lists.add(jc);jc=null;}

        //行政负责人出生日期
        if(MyTools.isNotEmpty(mfNianjianJbxx.getFuzerenshengri())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("wGoAKllz");
            jc.setAttrValue(mfNianjianJbxx.getFuzerenshengri().toString());lists.add(jc);jc=null;}

        //行政负责人政治面貌
        if(MyTools.isNotEmpty(mfNianjianJbxx.getFuzerenmianmao())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("zzmm3");
            jc.setAttrValue(mfNianjianJbxx.getFuzerenmianmao());lists.add(jc);jc=null;}

        //行政负责人学历
        if(MyTools.isNotEmpty(mfNianjianJbxx.getFuzerenxueli())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("xueli3");
            jc.setAttrValue(mfNianjianJbxx.getFuzerenxueli());lists.add(jc);jc=null;}

        //行政负责人是否专职
        if(MyTools.isNotEmpty(mfNianjianJbxx.getFuzerenzhuanzhi())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("shifzz2");
            jc.setAttrValue(mfNianjianJbxx.getFuzerenzhuanzhi());lists.add(jc);jc=null;}

        //行政负责人电话
        if(MyTools.isNotEmpty(mfNianjianJbxx.getFuzerendianhua())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("aVrCdKOU");
            jc.setAttrValue(mfNianjianJbxx.getFuzerendianhua());lists.add(jc);jc=null;}

        //行政负责人传真
        if(MyTools.isNotEmpty(mfNianjianJbxx.getFuzerenchuanzhen())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("ZwjfdHEe");
            jc.setAttrValue(mfNianjianJbxx.getFuzerenchuanzhen());lists.add(jc);jc=null;}

        //行政负责人手机
        if(MyTools.isNotEmpty(mfNianjianJbxx.getFuzerenshouji())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("hOcWaVjf");
            jc.setAttrValue(mfNianjianJbxx.getFuzerenshouji());lists.add(jc);jc=null;}

        //从业人员中公务员兼职情况总数
        if(MyTools.isNotEmpty(mfNianjianJbxx.getLituixiuzongshu())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("MAOOSfnL");
            jc.setAttrValue(mfNianjianJbxx.getLituixiuzongshu().toString());lists.add(jc);jc=null;}

        //领取报酬
        if(MyTools.isNotEmpty(mfNianjianJbxx.getLingqubaochou())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("MAOOSfna");
            jc.setAttrValue(mfNianjianJbxx.getLingqubaochou().toString());lists.add(jc);jc=null;}

        //在职
        if(MyTools.isNotEmpty(mfNianjianJbxx.getGongwuyuanzaizhi())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("icTzbtBH");
            jc.setAttrValue(mfNianjianJbxx.getGongwuyuanzaizhi().toString());lists.add(jc);jc=null;}

        //其中局级及以上
        if(MyTools.isNotEmpty(mfNianjianJbxx.getZaizhijuji())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("icTzbtBa");
            jc.setAttrValue(mfNianjianJbxx.getZaizhijuji().toString());lists.add(jc);jc=null;}

        //处级
        if(MyTools.isNotEmpty(mfNianjianJbxx.getZaizhichuji())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("icTzbtBb");
            jc.setAttrValue(mfNianjianJbxx.getZaizhichuji().toString());lists.add(jc);jc=null;}

        //离退休
        if(MyTools.isNotEmpty(mfNianjianJbxx.getGongwuyuanlituixiu())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("FrIzqCuK");
            jc.setAttrValue(mfNianjianJbxx.getGongwuyuanlituixiu().toString());lists.add(jc);jc=null;}

        //其中局级及以上
        if(MyTools.isNotEmpty(mfNianjianJbxx.getLituixiujuji())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("FrIzqCua");
            jc.setAttrValue(mfNianjianJbxx.getLituixiujuji().toString());lists.add(jc);jc=null;}

        //处级
        if(MyTools.isNotEmpty(mfNianjianJbxx.getLituixiuchuji())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("FrIzqCub");
            jc.setAttrValue(mfNianjianJbxx.getLituixiuchuji().toString());lists.add(jc);jc=null;}

        //工作人员总数
        if(MyTools.isNotEmpty(mfNianjianJbxx.getGongzuorenyuanzongshu())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("pfaZNBpa");
            jc.setAttrValue(mfNianjianJbxx.getGongzuorenyuanzongshu().toString());lists.add(jc);jc=null;}

        //工作人员平均年龄
        if(MyTools.isNotEmpty(mfNianjianJbxx.getQuantinianling())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("aYITnvdT");
            jc.setAttrValue(mfNianjianJbxx.getQuantinianling().toString());lists.add(jc);jc=null;}

        //全体工作人员女性人数
        if(MyTools.isNotEmpty(mfNianjianJbxx.getQuantinvxing())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("awniitxG");
            jc.setAttrValue(mfNianjianJbxx.getQuantinvxing().toString());lists.add(jc);jc=null;}

        //全体工作人员本科以上人数
        if(MyTools.isNotEmpty(mfNianjianJbxx.getQuantibenke())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("wRISqpNy");
            jc.setAttrValue(mfNianjianJbxx.getQuantibenke().toString());lists.add(jc);jc=null;}

        //全体工作人员党员人数
        if(MyTools.isNotEmpty(mfNianjianJbxx.getQitazuzhi())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("OSdcZLMa");
            jc.setAttrValue(mfNianjianJbxx.getQitazuzhi());lists.add(jc);jc=null;}

        //专职人员数
        if(MyTools.isNotEmpty(mfNianjianJbxx.getZhuanzhirenyuanshu())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("GpNCJPrD");
            jc.setAttrValue(mfNianjianJbxx.getZhuanzhirenyuanshu().toString());lists.add(jc);jc=null;}

        //专职平均年龄
        if(MyTools.isNotEmpty(mfNianjianJbxx.getZhuanzhinianling())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("JBsUNRwt");
            jc.setAttrValue(mfNianjianJbxx.getZhuanzhinianling().toString());lists.add(jc);jc=null;}

        //专职女性人数
        if(MyTools.isNotEmpty(mfNianjianJbxx.getZhuanzhinvxing())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("PItTdbUq");
            jc.setAttrValue(mfNianjianJbxx.getZhuanzhinvxing().toString());lists.add(jc);jc=null;}

        //专职本科人数
        if(MyTools.isNotEmpty(mfNianjianJbxx.getZhuanzhibenke())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("yLJSMKcc");
            jc.setAttrValue(mfNianjianJbxx.getZhuanzhibenke().toString());lists.add(jc);jc=null;}

        //专职党员人数
        if(MyTools.isNotEmpty(mfNianjianJbxx.getZhuanzhidangyuan())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("OnRhIcbb");
            jc.setAttrValue(mfNianjianJbxx.getZhuanzhidangyuan().toString());lists.add(jc);jc=null;}

        //志愿者数
        if(MyTools.isNotEmpty(mfNianjianJbxx.getZhiyuanzheshu())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("leDGjlaB");
            jc.setAttrValue(mfNianjianJbxx.getZhiyuanzheshu().toString());lists.add(jc);jc=null;}

        //志愿劳动时间
        if(MyTools.isNotEmpty(mfNianjianJbxx.getZhiyuanlaodongshijian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("OMWsbMCv");
            jc.setAttrValue(mfNianjianJbxx.getZhiyuanlaodongshijian().toString());lists.add(jc);jc=null;}

        //党员人数
        if(MyTools.isNotEmpty(mfNianjianJbxx.getDangyuanrenshu())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("rNxNEsiC");
            jc.setAttrValue(mfNianjianJbxx.getDangyuanrenshu().toString());lists.add(jc);jc=null;}

        //自评分数
        if(MyTools.isNotEmpty(mfNianjianJbxx.getZipingfenshu())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("yusfAIsg");
            jc.setAttrValue(mfNianjianJbxx.getZipingfenshu().toString());lists.add(jc);jc=null;}

        //自评等级
        if(MyTools.isNotEmpty(mfNianjianJbxx.getZipingdengji())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("zpdjx");
            jc.setAttrValue(mfNianjianJbxx.getZipingdengji());lists.add(jc);jc=null;}

        //是否派遣
        if(MyTools.isNotEmpty(mfNianjianJbxx.getPaiqianzhidao())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("sfpq");
            jc.setAttrValue(mfNianjianJbxx.getPaiqianzhidao());lists.add(jc);jc=null;}

        //募集资金数
        if(MyTools.isNotEmpty(mfNianjianJbxx.getMujizijinshu())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("KrRhiORg");
            jc.setAttrValue(mfNianjianJbxx.getMujizijinshu().toString());lists.add(jc);jc=null;}

        //工作情况
        if(MyTools.isNotEmpty(mfNianjianJbxx.getGongzuoqingkuang())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("gzqk");
            jc.setAttrValue(mfNianjianJbxx.getGongzuoqingkuang());lists.add(jc);jc=null;}

        //为党政机关提供政策建议数
        if(MyTools.isNotEmpty(mfNianjianJbxx.getTigongjianyishu())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("LhnoWWIt");
            jc.setAttrValue(mfNianjianJbxx.getTigongjianyishu().toString());lists.add(jc);jc=null;}

        //人大政协代表数
        if(MyTools.isNotEmpty(mfNianjianJbxx.getZhengxiedaibiaoshu())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("ZBrXnhUc");
            jc.setAttrValue(mfNianjianJbxx.getZhengxiedaibiaoshu().toString());lists.add(jc);jc=null;}

        //本单位吸纳就业人数
        if(MyTools.isNotEmpty(mfNianjianJbxx.getXinarenshu())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("ClJepqLg");
            jc.setAttrValue(mfNianjianJbxx.getXinarenshu().toString());lists.add(jc);jc=null;}

        //增加就业数
        if(MyTools.isNotEmpty(mfNianjianJbxx.getZengjiajiuyeshu())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("TJOmbjZH");
            jc.setAttrValue(mfNianjianJbxx.getZengjiajiuyeshu().toString());lists.add(jc);jc=null;}

        //服务人次
        if(MyTools.isNotEmpty(mfNianjianJbxx.getFuwurenci())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("CBauyVdl");
            jc.setAttrValue(mfNianjianJbxx.getFuwurenci().toString());lists.add(jc);jc=null;}

        //举办次数
        if(MyTools.isNotEmpty(mfNianjianJbxx.getJubancishu())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("gbiQrGoz");
            jc.setAttrValue(mfNianjianJbxx.getJubancishu().toString());lists.add(jc);jc=null;}

        //公益活动支出
        if(MyTools.isNotEmpty(mfNianjianJbxx.getGongyizhichu())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("gyhdzc");
            jc.setAttrValue(mfNianjianJbxx.getGongyizhichu().toString());lists.add(jc);jc=null;}

        //国际合作项目
        if(MyTools.isNotEmpty(mfNianjianJbxx.getXiangmu())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("wpQceuok");
            jc.setAttrValue(mfNianjianJbxx.getXiangmu().toString());lists.add(jc);jc=null;}

        //参加国际会议
        if(MyTools.isNotEmpty(mfNianjianJbxx.getHuiyi())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("YsNheInP");
            jc.setAttrValue(mfNianjianJbxx.getHuiyi().toString());lists.add(jc);jc=null;}

        //参加国际组织
        if(MyTools.isNotEmpty(mfNianjianJbxx.getZuzhi())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("dfzNlgJI");
            jc.setAttrValue(mfNianjianJbxx.getZuzhi().toString());lists.add(jc);jc=null;}

        //组团出国访问
        if(MyTools.isNotEmpty(mfNianjianJbxx.getFangwen())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("RdZtEvlK");
            jc.setAttrValue(mfNianjianJbxx.getFangwen().toString());lists.add(jc);jc=null;}

        //评比达标表彰活动
        if(MyTools.isNotEmpty(mfNianjianJbxx.getBiaozhanghuodong())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("ZhcxRWSS");
            jc.setAttrValue(mfNianjianJbxx.getBiaozhanghuodong().toString());lists.add(jc);jc=null;}

        return lists;
    }
}
