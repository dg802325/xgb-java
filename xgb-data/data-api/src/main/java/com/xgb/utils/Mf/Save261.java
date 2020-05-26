package com.xgb.utils.Mf;

import com.xgb.model.JcContentAttr1;
import com.xgb.model.MfNianjianJbxx;
import com.xgb.model.StNjInner4;
import com.xgb.util.DateUtils;
import com.xgb.util.MyTools;

import java.util.ArrayList;
import java.util.List;

public class Save261 {

    public static List<JcContentAttr1> getEntity(Integer contentId, MfNianjianJbxx mfNianjianJbxx) {
        List<JcContentAttr1> lists = new ArrayList<>();
        JcContentAttr1 jc = null;

        //办公地址
        if(MyTools.isNotEmpty(mfNianjianJbxx.getZhusuoxiangxi())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("bgdz");
            jc.setAttrValue("天津市"+mfNianjianJbxx.getZhusuoxiangxi());lists.add(jc);}

        //行业分类
        if(MyTools.isNotEmpty(mfNianjianJbxx.getXingyefenlei())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("hyfl");
            jc.setAttrValue(mfNianjianJbxx.getXingyefenlei());lists.add(jc);}

        //联系电话
        if(MyTools.isNotEmpty(mfNianjianJbxx.getDianhua())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("WfWQRWdI");
            jc.setAttrValue(mfNianjianJbxx.getDianhua());lists.add(jc);}

        //业务范围
        if(MyTools.isNotEmpty(mfNianjianJbxx.getYewufanwei())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("XqjWIVSz");
            jc.setAttrValue(mfNianjianJbxx.getYewufanwei());lists.add(jc);}

        //登记证号
        if(MyTools.isNotEmpty(mfNianjianJbxx.getDengjizhenghao())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("wEwJKgwg");
            jc.setAttrValue(mfNianjianJbxx.getDengjizhenghao());lists.add(jc);}

        //组织机构代码
        if(MyTools.isNotEmpty(mfNianjianJbxx.getZuzhijigoudaima())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("stxcode");
            jc.setAttrValue(mfNianjianJbxx.getZuzhijigoudaima());lists.add(jc);}

        //执业许可证号
        if(MyTools.isNotEmpty(mfNianjianJbxx.getZhiyexukezhenghao())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("TUeooZBw");
            jc.setAttrValue(mfNianjianJbxx.getZhiyexukezhenghao());lists.add(jc);}

        //成立时间
        if(MyTools.isNotEmpty(mfNianjianJbxx.getChenglishijian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("eXrLNnsI");
            jc.setAttrValue(DateUtils.dateToyyyyMMdd(mfNianjianJbxx.getChenglishijian()));lists.add(jc);}

        //开办资金
        if(MyTools.isNotEmpty(mfNianjianJbxx.getKaibanzijin())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("ClkiBHfU");
            jc.setAttrValue(mfNianjianJbxx.getKaibanzijin().toString());lists.add(jc);}

        //邮政编码
        if(MyTools.isNotEmpty(mfNianjianJbxx.getYouzhengbianma())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("fdGYQnPK");
            jc.setAttrValue(mfNianjianJbxx.getYouzhengbianma());lists.add(jc);}

        //住所来源
        if(MyTools.isNotEmpty(mfNianjianJbxx.getZhusuolaiyuan())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("MlSxwhbH");
            jc.setAttrValue(mfNianjianJbxx.getZhusuolaiyuan());lists.add(jc);}

        //租赁到期日
        if(MyTools.isNotEmpty(mfNianjianJbxx.getZulindaoqiri())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("MlSxwhaH");
            jc.setAttrValue(DateUtils.dateToyyyyMMdd(mfNianjianJbxx.getZulindaoqiri()));lists.add(jc);}

        //联系电话
        if(MyTools.isNotEmpty(mfNianjianJbxx.getLianxidianhua())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("uEScfYKM");
            jc.setAttrValue(mfNianjianJbxx.getLianxidianhua());lists.add(jc);}

        //手机电话
        if(MyTools.isNotEmpty(mfNianjianJbxx.getShoujidianhua())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("HsskYxOI");
            jc.setAttrValue(mfNianjianJbxx.getShoujidianhua());lists.add(jc);}

        //传真
        if(MyTools.isNotEmpty(mfNianjianJbxx.getChuanzhen())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("klmAydZX");
            jc.setAttrValue(mfNianjianJbxx.getChuanzhen());lists.add(jc);}

        //网站地址
        if(MyTools.isNotEmpty(mfNianjianJbxx.getWangzhandizhi())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("VPgCDcpm");
            jc.setAttrValue(mfNianjianJbxx.getWangzhandizhi());lists.add(jc);}

        //法定代表人
        if(MyTools.isNotEmpty(mfNianjianJbxx.getFadingdaibiaoren())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("kenHBMel");
            jc.setAttrValue(mfNianjianJbxx.getFadingdaibiaoren());lists.add(jc);}

        //法人出生年月日
        if(MyTools.isNotEmpty(mfNianjianJbxx.getFarenshengri())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("mQRUAXGC");
            jc.setAttrValue(DateUtils.dateToyyyyMMdd(mfNianjianJbxx.getFarenshengri()));lists.add(jc);}

        //法人性别
        if(MyTools.isNotEmpty(mfNianjianJbxx.getFarenxingbie())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("xingbei1");
            jc.setAttrValue(mfNianjianJbxx.getFarenxingbie());lists.add(jc);}

        //法人学历
        if(MyTools.isNotEmpty(mfNianjianJbxx.getFarenxueli())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("xueli1");
            jc.setAttrValue(mfNianjianJbxx.getFarenxueli());lists.add(jc);}

        //法人职务
        if(MyTools.isNotEmpty(mfNianjianJbxx.getFarenzhiwu())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("danrenzw");
            jc.setAttrValue(mfNianjianJbxx.getFarenzhiwu());lists.add(jc);}

        //董事长姓名
        if(MyTools.isNotEmpty(mfNianjianJbxx.getDongshichangxingming())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("pVzNFLBK");
            jc.setAttrValue(mfNianjianJbxx.getDongshichangxingming());lists.add(jc);}

        //董事长出生日期
        if(MyTools.isNotEmpty(mfNianjianJbxx.getDongshichangshengri())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("vhUnFNaS");
            jc.setAttrValue(DateUtils.dateToyyyyMMdd(mfNianjianJbxx.getDongshichangshengri()));lists.add(jc);}

        //董事长性别
        if(MyTools.isNotEmpty(mfNianjianJbxx.getDongshichangxingbie())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("xingbie2");
            jc.setAttrValue(mfNianjianJbxx.getDongshichangxingbie());lists.add(jc);}

        //董事长政治面貌
        if(MyTools.isNotEmpty(mfNianjianJbxx.getDongshichangmianmao())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("zzmm2");
            jc.setAttrValue(mfNianjianJbxx.getDongshichangmianmao());lists.add(jc);}

        //董事长学历
        if(MyTools.isNotEmpty(mfNianjianJbxx.getDongshichangxueli())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("xueli2");
            jc.setAttrValue(mfNianjianJbxx.getDongshichangxueli());lists.add(jc);}

        //董事长是否专职
        if(MyTools.isNotEmpty(mfNianjianJbxx.getDongshichangzhuanzhi())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("shifzz");
            jc.setAttrValue(mfNianjianJbxx.getDongshichangzhuanzhi());lists.add(jc);}

        //工作单位及职务
        if(MyTools.isNotEmpty(mfNianjianJbxx.getDongshichangdanwei())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("ndcWojrg");
            jc.setAttrValue(mfNianjianJbxx.getDongshichangdanwei());lists.add(jc);}

        //董事长电话
        if(MyTools.isNotEmpty(mfNianjianJbxx.getDongshichangdianhua())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("QhmfKcFN");
            jc.setAttrValue(mfNianjianJbxx.getDongshichangdianhua());lists.add(jc);}

        //董事长移动电话
        if(MyTools.isNotEmpty(mfNianjianJbxx.getDongshichangshouji())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("rmjbnAFc");
            jc.setAttrValue(mfNianjianJbxx.getDongshichangshouji());lists.add(jc);}

        //行政负责人姓名
        if(MyTools.isNotEmpty(mfNianjianJbxx.getFuzerenxingming())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("idLtjqkD");
            jc.setAttrValue(mfNianjianJbxx.getFuzerenxingming());lists.add(jc);}

        //行政负责人性别
        if(MyTools.isNotEmpty(mfNianjianJbxx.getFuzerenxingbie())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("xingbie4");
            jc.setAttrValue(mfNianjianJbxx.getFuzerenxingbie());lists.add(jc);}

        //行政负责人出生日期
        if(MyTools.isNotEmpty(mfNianjianJbxx.getFuzerenshengri())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("wGoAKllz");
            jc.setAttrValue(DateUtils.dateToyyyyMMdd(mfNianjianJbxx.getFuzerenshengri()));lists.add(jc);}

        //行政负责人政治面貌
        if(MyTools.isNotEmpty(mfNianjianJbxx.getFuzerenmianmao())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("zzmm3");
            jc.setAttrValue(mfNianjianJbxx.getFuzerenmianmao());lists.add(jc);}

        //行政负责人学历
        if(MyTools.isNotEmpty(mfNianjianJbxx.getFuzerenxueli())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("xueli3");
            jc.setAttrValue(mfNianjianJbxx.getFuzerenxueli());lists.add(jc);}

        //行政负责人是否专职
        if(MyTools.isNotEmpty(mfNianjianJbxx.getFuzerenzhuanzhi())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("shifzz2");
            jc.setAttrValue(mfNianjianJbxx.getFuzerenzhuanzhi());lists.add(jc);}

        //行政负责人电话
        if(MyTools.isNotEmpty(mfNianjianJbxx.getFuzerendianhua())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("aVrCdKOU");
            jc.setAttrValue(mfNianjianJbxx.getFuzerendianhua());lists.add(jc);}

        //行政负责人传真
        if(MyTools.isNotEmpty(mfNianjianJbxx.getFuzerenchuanzhen())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("ZwjfdHEe");
            jc.setAttrValue(mfNianjianJbxx.getFuzerenchuanzhen());lists.add(jc);}

        //行政负责人手机
        if(MyTools.isNotEmpty(mfNianjianJbxx.getFuzerenshouji())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("hOcWaVjf");
            jc.setAttrValue(mfNianjianJbxx.getFuzerenshouji());lists.add(jc);}

        //从业人员中公务员兼职情况总数
        if(MyTools.isNotEmpty(mfNianjianJbxx.getLituixiuzongshu())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("MAOOSfnL");
            jc.setAttrValue(mfNianjianJbxx.getLituixiuzongshu().toString());lists.add(jc);}

        //领取报酬
        if(MyTools.isNotEmpty(mfNianjianJbxx.getLingqubaochou())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("MAOOSfna");
            jc.setAttrValue(mfNianjianJbxx.getLingqubaochou().toString());lists.add(jc);}

        //在职
        if(MyTools.isNotEmpty(mfNianjianJbxx.getGongwuyuanzaizhi())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("icTzbtBH");
            jc.setAttrValue(mfNianjianJbxx.getGongwuyuanzaizhi().toString());lists.add(jc);}

        //其中局级及以上
        if(MyTools.isNotEmpty(mfNianjianJbxx.getZaizhijuji())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("icTzbtBa");
            jc.setAttrValue(mfNianjianJbxx.getZaizhijuji().toString());lists.add(jc);}

        //处级
        if(MyTools.isNotEmpty(mfNianjianJbxx.getZaizhichuji())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("icTzbtBb");
            jc.setAttrValue(mfNianjianJbxx.getZaizhichuji().toString());lists.add(jc);}

        //离退休
        if(MyTools.isNotEmpty(mfNianjianJbxx.getGongwuyuanlituixiu())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("FrIzqCuK");
            jc.setAttrValue(mfNianjianJbxx.getGongwuyuanlituixiu().toString());lists.add(jc);}

        //其中局级及以上
        if(MyTools.isNotEmpty(mfNianjianJbxx.getLituixiujuji())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("FrIzqCua");
            jc.setAttrValue(mfNianjianJbxx.getLituixiujuji().toString());lists.add(jc);}

        //处级
        if(MyTools.isNotEmpty(mfNianjianJbxx.getLituixiuchuji())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("FrIzqCub");
            jc.setAttrValue(mfNianjianJbxx.getLituixiuchuji().toString());lists.add(jc);}

        //工作人员总数
        if(MyTools.isNotEmpty(mfNianjianJbxx.getGongzuorenyuanzongshu())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("pfaZNBpa");
            jc.setAttrValue(mfNianjianJbxx.getGongzuorenyuanzongshu().toString());lists.add(jc);}

        //工作人员平均年龄
        if(MyTools.isNotEmpty(mfNianjianJbxx.getQuantinianling())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("aYITnvdT");
            jc.setAttrValue(mfNianjianJbxx.getQuantinianling().toString());lists.add(jc);}

        //全体工作人员女性人数
        if(MyTools.isNotEmpty(mfNianjianJbxx.getQuantinvxing())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("awniitxG");
            jc.setAttrValue(mfNianjianJbxx.getQuantinvxing().toString());lists.add(jc);}

        //全体工作人员本科以上人数
        if(MyTools.isNotEmpty(mfNianjianJbxx.getQuantibenke())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("wRISqpNy");
            jc.setAttrValue(mfNianjianJbxx.getQuantibenke().toString());lists.add(jc);}

        //全体工作人员党员人数
        if(MyTools.isNotEmpty(mfNianjianJbxx.getQuantidangyuan())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("OSdcZLMa");
            jc.setAttrValue(mfNianjianJbxx.getQuantidangyuan().toString());lists.add(jc);}

        //专职人员数
        if(MyTools.isNotEmpty(mfNianjianJbxx.getZhuanzhirenyuanshu())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("GpNCJPrD");
            jc.setAttrValue(mfNianjianJbxx.getZhuanzhirenyuanshu().toString());lists.add(jc);}

        //专职平均年龄
        if(MyTools.isNotEmpty(mfNianjianJbxx.getZhuanzhinianling())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("JBsUNRwt");
            jc.setAttrValue(mfNianjianJbxx.getZhuanzhinianling().toString());lists.add(jc);}

        //专职女性人数
        if(MyTools.isNotEmpty(mfNianjianJbxx.getZhuanzhinvxing())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("PItTdbUq");
            jc.setAttrValue(mfNianjianJbxx.getZhuanzhinvxing().toString());lists.add(jc);}

        //专职本科人数
        if(MyTools.isNotEmpty(mfNianjianJbxx.getZhuanzhibenke())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("yLJSMKcc");
            jc.setAttrValue(mfNianjianJbxx.getZhuanzhibenke().toString());lists.add(jc);}

        //专职党员人数
        if(MyTools.isNotEmpty(mfNianjianJbxx.getZhuanzhidangyuan())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("OnRhIcbb");
            jc.setAttrValue(mfNianjianJbxx.getZhuanzhidangyuan().toString());lists.add(jc);}

        //志愿者数
        if(MyTools.isNotEmpty(mfNianjianJbxx.getZhiyuanzheshu())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("leDGjlaB");
            jc.setAttrValue(mfNianjianJbxx.getZhiyuanzheshu().toString());lists.add(jc);}

        //志愿劳动时间
        if(MyTools.isNotEmpty(mfNianjianJbxx.getZhiyuanlaodongshijian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("OMWsbMCv");
            jc.setAttrValue(mfNianjianJbxx.getZhiyuanlaodongshijian().toString());lists.add(jc);}

        //党员人数
        if(MyTools.isNotEmpty(mfNianjianJbxx.getDangyuanrenshu())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("rNxNEsiC");
            jc.setAttrValue(mfNianjianJbxx.getDangyuanrenshu().toString());lists.add(jc);}

        //自评分数
        if(MyTools.isNotEmpty(mfNianjianJbxx.getZipingfenshu())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("yusfAIsg");
            jc.setAttrValue(mfNianjianJbxx.getZipingfenshu().toString());lists.add(jc);}

        //自评等级
        if(MyTools.isNotEmpty(mfNianjianJbxx.getZipingdengji())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("zpdjx");
            jc.setAttrValue(mfNianjianJbxx.getZipingdengji());lists.add(jc);}

        //是否派遣
        if(MyTools.isNotEmpty(mfNianjianJbxx.getPaiqianzhidao())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("sfpq");
            jc.setAttrValue(mfNianjianJbxx.getPaiqianzhidao());lists.add(jc);}

        //募集资金数
        if(MyTools.isNotEmpty(mfNianjianJbxx.getMujizijinshu())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("KrRhiORg");
            jc.setAttrValue(mfNianjianJbxx.getMujizijinshu().toString());lists.add(jc);}

        //工作情况
        if(MyTools.isNotEmpty(mfNianjianJbxx.getGongzuoqingkuang())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("gzqk");
            jc.setAttrValue(mfNianjianJbxx.getGongzuoqingkuang());lists.add(jc);}

        //为党政机关提供政策建议数
        if(MyTools.isNotEmpty(mfNianjianJbxx.getTigongjianyishu())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("LhnoWWIt");
            jc.setAttrValue(mfNianjianJbxx.getTigongjianyishu().toString());lists.add(jc);}

        //人大政协代表数
        if(MyTools.isNotEmpty(mfNianjianJbxx.getZhengxiedaibiaoshu())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("ZBrXnhUc");
            jc.setAttrValue(mfNianjianJbxx.getZhengxiedaibiaoshu().toString());lists.add(jc);}

        //本单位吸纳就业人数
        if(MyTools.isNotEmpty(mfNianjianJbxx.getXinarenshu())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("ClJepqLg");
            jc.setAttrValue(mfNianjianJbxx.getXinarenshu().toString());lists.add(jc);}

        //增加就业数
        if(MyTools.isNotEmpty(mfNianjianJbxx.getZengjiajiuyeshu())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("TJOmbjZH");
            jc.setAttrValue(mfNianjianJbxx.getZengjiajiuyeshu().toString());lists.add(jc);}

        //服务人次
        if(MyTools.isNotEmpty(mfNianjianJbxx.getFuwurenci())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("CBauyVdl");
            jc.setAttrValue(mfNianjianJbxx.getFuwurenci().toString());lists.add(jc);}

        //举办次数
        if(MyTools.isNotEmpty(mfNianjianJbxx.getJubancishu())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("gbiQrGoz");
            jc.setAttrValue(mfNianjianJbxx.getJubancishu().toString());lists.add(jc);}

        //公益活动支出
        if(MyTools.isNotEmpty(mfNianjianJbxx.getGongyizhichu())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("gyhdzc");
            jc.setAttrValue(mfNianjianJbxx.getGongyizhichu().toString());lists.add(jc);}

        //国际合作项目
        if(MyTools.isNotEmpty(mfNianjianJbxx.getXiangmu())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("wpQceuok");
            jc.setAttrValue(mfNianjianJbxx.getXiangmu().toString());lists.add(jc);}

        //参加国际会议
        if(MyTools.isNotEmpty(mfNianjianJbxx.getHuiyi())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("YsNheInP");
            jc.setAttrValue(mfNianjianJbxx.getHuiyi().toString());lists.add(jc);}

        //参加国际组织
        if(MyTools.isNotEmpty(mfNianjianJbxx.getZuzhi())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("dfzNlgJI");
            jc.setAttrValue(mfNianjianJbxx.getZuzhi().toString());lists.add(jc);}

        //组团出国访问
        if(MyTools.isNotEmpty(mfNianjianJbxx.getFangwen())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("RdZtEvlK");
            jc.setAttrValue(mfNianjianJbxx.getFangwen().toString());lists.add(jc);}

        //评比达标表彰活动
        if(MyTools.isNotEmpty(mfNianjianJbxx.getBiaozhanghuodong())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("ZhcxRWSS");
            jc.setAttrValue(mfNianjianJbxx.getBiaozhanghuodong().toString());lists.add(jc);}

        //年检结果
        if(MyTools.isNotEmpty(mfNianjianJbxx.getTjnjjieguo2())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("jlsfhg");
            jc.setAttrValue(mfNianjianJbxx.getTjnjjieguo2().toString());lists.add(jc);}

        //年检结果
        if(MyTools.isNotEmpty(mfNianjianJbxx.getTjnjyijian2())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("jlfsyj");
            jc.setAttrValue(mfNianjianJbxx.getTjnjyijian2().toString());lists.add(jc);}

        //董事人数
        if(MyTools.isNotEmpty(mfNianjianJbxx.getDongshirenshu())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("FHxWAXHH");
            jc.setAttrValue(mfNianjianJbxx.getDongshirenshu().toString());lists.add(jc);}

        //监事人数
        if(MyTools.isNotEmpty(mfNianjianJbxx.getJianshirenshu())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("RRqEbmjm");
            jc.setAttrValue(mfNianjianJbxx.getJianshirenshu().toString());lists.add(jc);}

        //党建情况
        if(MyTools.isNotEmpty(mfNianjianJbxx.getDangjianqingkuang())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("yjlx");
            jc.setAttrValue(mfNianjianJbxx.getDangjianqingkuang());lists.add(jc);}

        jc = null;

        return lists;
    }
}
