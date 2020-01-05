package com.xgb.utils;

import com.xgb.model.JcContentAttr1;
import com.xgb.model.StNjHfgxTb;
import com.xgb.model.StNjInner4;
import com.xgb.util.DateUtils;
import com.xgb.util.MyTools;

import java.util.ArrayList;
import java.util.List;

public class Save220 {

    public static List<JcContentAttr1> getEntity(Integer contentId, StNjHfgxTb stNjHfgxTb) {
        List<JcContentAttr1> lists = new ArrayList<>();

        //制定会费标准的会员（代表）大会届次
        if(MyTools.isNotEmpty(stNjHfgxTb.getJieci())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("nVUJjVxB");
            jc.setAttrValue(stNjHfgxTb.getJieci());lists.add(jc);jc=null;}

        //制定会费标准的时间
        if(MyTools.isNotEmpty(stNjHfgxTb.getZhidingshijian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("DiGkvZUL");
            jc.setAttrValue(DateUtils.dateToyyyyMMdd(stNjHfgxTb.getZhidingshijian()));lists.add(jc);jc=null;}

        //按照会费标准每年度应收会费（万元）
        if(MyTools.isNotEmpty(stNjHfgxTb.getYingjiaohuifei())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("ACjAkKCH");
            jc.setAttrValue(stNjHfgxTb.getYingjiaohuifei().toString());lists.add(jc);jc=null;}

        //本年度实收会费总额（万元）
        if(MyTools.isNotEmpty(stNjHfgxTb.getLibiaodanwei())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("bUCojIcM");
            jc.setAttrValue(stNjHfgxTb.getLibiaodanwei().toString());lists.add(jc);jc=null;}

        //会费标准
        if(MyTools.isNotEmpty(stNjHfgxTb.getFuwuqingkuang())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("GkkZmzvk");
            jc.setAttrValue(stNjHfgxTb.getFuwuqingkuang());lists.add(jc);jc=null;}

        //会费结余（截至2017年12月31日）（万元）
        if(MyTools.isNotEmpty(stNjHfgxTb.getLishudanwei())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("UhMabbAx");
            jc.setAttrValue(stNjHfgxTb.getLishudanwei().toString());lists.add(jc);jc=null;}

        //年度自行减免会费（万元）
        if(MyTools.isNotEmpty(stNjHfgxTb.getLijiaodanwei())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("klhcykDG");
            jc.setAttrValue(stNjHfgxTb.getLijiaodanwei().toString());lists.add(jc);jc=null;}

        //社会团体资产总额（万元）
        if(MyTools.isNotEmpty(stNjHfgxTb.getZichanzonge())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("SccQBspF");
            jc.setAttrValue(stNjHfgxTb.getZichanzonge().toString());lists.add(jc);jc=null;}

        //会员单位产值总额（万元）
        if(MyTools.isNotEmpty(stNjHfgxTb.getChanzhizonge())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("CQJBDTHo");
            jc.setAttrValue(stNjHfgxTb.getChanzhizonge().toString());lists.add(jc);jc=null;}

        //规模以上会员单位产值（万元）
        if(MyTools.isNotEmpty(stNjHfgxTb.getDanweichanzhi())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("eRlrGLLZ");
            jc.setAttrValue(stNjHfgxTb.getDanweichanzhi().toString());lists.add(jc);jc=null;}

        //民营经济占单位会员比例（%）
        if(MyTools.isNotEmpty(stNjHfgxTb.getHuiyuanbili())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("PQhtsuEj");
            jc.setAttrValue(stNjHfgxTb.getHuiyuanbili());lists.add(jc);jc=null;}

        //社团兴办经济实体数量（家）
        if(MyTools.isNotEmpty(stNjHfgxTb.getShitishuliang())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("nOqrSNzF");
            jc.setAttrValue(stNjHfgxTb.getShitishuliang().toString());lists.add(jc);jc=null;}

        //社团兴办经济实体产值（万元）
        if(MyTools.isNotEmpty(stNjHfgxTb.getShitichanzhi())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("WfZqgmrU");
            jc.setAttrValue(stNjHfgxTb.getShitichanzhi().toString());lists.add(jc);jc=null;}

        //社团岗位吸纳就业人数（人次）
        if(MyTools.isNotEmpty(stNjHfgxTb.getXinarenshu())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("OSCvtOae");
            jc.setAttrValue(stNjHfgxTb.getXinarenshu().toString());lists.add(jc);jc=null;}

        //社团为党政机关提供政策建议（项）
        if(MyTools.isNotEmpty(stNjHfgxTb.getJianyishuliang())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("GmKJePds");
            jc.setAttrValue(stNjHfgxTb.getJianyishuliang());lists.add(jc);jc=null;}

        //开展活动募集资金数额（万元）
        if(MyTools.isNotEmpty(stNjHfgxTb.getMujizijin())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("nQPHAJGW");
            jc.setAttrValue(stNjHfgxTb.getMujizijin().toString());lists.add(jc);jc=null;}

        //所募资金惠及人群（人次）
        if(MyTools.isNotEmpty(stNjHfgxTb.getHuijirenqun())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("aVHDddGB");
            jc.setAttrValue(stNjHfgxTb.getHuijirenqun().toString());lists.add(jc);jc=null;}

        //本年度新增就业岗位数（人次）
        if(MyTools.isNotEmpty(stNjHfgxTb.getJiuyegangwei())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("TkAhKxfe");
            jc.setAttrValue(stNjHfgxTb.getJiuyegangwei().toString());lists.add(jc);jc=null;}

        //本年度社团工作人员新增可支配收入（万元）
        if(MyTools.isNotEmpty(stNjHfgxTb.getXinzengshouru())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("uFfpeGzv");
            jc.setAttrValue(stNjHfgxTb.getXinzengshouru().toString());lists.add(jc);jc=null;}

        //品牌性服务经济社会发展项目（项）
        if(MyTools.isNotEmpty(stNjHfgxTb.getPinpaifuwu())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("vljMkAer");
            jc.setAttrValue(stNjHfgxTb.getPinpaifuwu());lists.add(jc);jc=null;}

        //参与京津冀协同发展项目（项）
        if(MyTools.isNotEmpty(stNjHfgxTb.getXietongfazhan())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("oOTzATaZ");
            jc.setAttrValue(stNjHfgxTb.getXietongfazhan());lists.add(jc);jc=null;}

        //规模以上企业会员数量<
        if(MyTools.isNotEmpty(stNjHfgxTb.getLishugeren())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("llieCnsU");
            jc.setAttrValue(stNjHfgxTb.getLishugeren().toString());lists.add(jc);jc=null;}

        //理事长由企业家担任
        if(MyTools.isNotEmpty(stNjHfgxTb.getQiyejiadanren())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("KJJzRUrw");
            jc.setAttrValue(stNjHfgxTb.getQiyejiadanren());lists.add(jc);jc=null;}

        //制定行规行约
        if(MyTools.isNotEmpty(stNjHfgxTb.getHanggueihangyue())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("wbEXAedN");
            jc.setAttrValue(stNjHfgxTb.getHanggueihangyue());lists.add(jc);jc=null;}

        //制定行/职业道德准则
        if(MyTools.isNotEmpty(stNjHfgxTb.getDaodezhunze())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("GWboBDuj");
            jc.setAttrValue(stNjHfgxTb.getDaodezhunze());lists.add(jc);jc=null;}

        //制定行业自律制度
        if(MyTools.isNotEmpty(stNjHfgxTb.getZilvzhidu())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("LqLWVlDp");
            jc.setAttrValue(stNjHfgxTb.getZilvzhidu());lists.add(jc);jc=null;}

        //发布过行业自律宣言
        if(MyTools.isNotEmpty(stNjHfgxTb.getZilvxuanyan())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("KlbHJHlN");
            jc.setAttrValue(stNjHfgxTb.getZilvxuanyan());lists.add(jc);jc=null;}

        //定期开展行业调查和统计
        if(MyTools.isNotEmpty(stNjHfgxTb.getDiaochahetongji())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("rRBEUKWy");
            jc.setAttrValue(stNjHfgxTb.getDiaochahetongji());lists.add(jc);jc=null;}

        //定期发布行业信息
        if(MyTools.isNotEmpty(stNjHfgxTb.getHangyexinxi())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("XaKDYHvc");
            jc.setAttrValue(stNjHfgxTb.getHangyexinxi());lists.add(jc);jc=null;}

        //展览会、博览会X项
        if(MyTools.isNotEmpty(stNjHfgxTb.getFubiaodanwei())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("XsxUwUOk");
            jc.setAttrValue(stNjHfgxTb.getFubiaodanwei().toString());lists.add(jc);jc=null;}

        //交易会X项
        if(MyTools.isNotEmpty(stNjHfgxTb.getFushudanwei())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("DeoJatKV");
            jc.setAttrValue(stNjHfgxTb.getFushudanwei().toString());lists.add(jc);jc=null;}

        //研讨X期
        if(MyTools.isNotEmpty(stNjHfgxTb.getFujiaodanwei())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("vXZWOtaS");
            jc.setAttrValue(stNjHfgxTb.getFujiaodanwei().toString());lists.add(jc);jc=null;}

        //培训
        if(MyTools.isNotEmpty(stNjHfgxTb.getFubiaogeren())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("UbqaupQv");
            jc.setAttrValue(stNjHfgxTb.getFubiaogeren().toString());lists.add(jc);jc=null;}

        //认证、鉴定服务Xqw
        if(MyTools.isNotEmpty(stNjHfgxTb.getFushugeren())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("noHGuoLv");
            jc.setAttrValue(stNjHfgxTb.getFushugeren().toString());lists.add(jc);jc=null;}

        //讲座X次
        if(MyTools.isNotEmpty(stNjHfgxTb.getFujiaogeren())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("ITdVUegu");
            jc.setAttrValue(stNjHfgxTb.getFujiaogeren().toString());lists.add(jc);jc=null;}

        //商务考察次
        if(MyTools.isNotEmpty(stNjHfgxTb.getChangbiaodanwei())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("KPqtYiiq");
            jc.setAttrValue(stNjHfgxTb.getChangbiaodanwei().toString());lists.add(jc);jc=null;}

        //新技术推广X项
        if(MyTools.isNotEmpty(stNjHfgxTb.getChangshudanwei())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("GCpZWXdC");
            jc.setAttrValue(stNjHfgxTb.getChangshudanwei().toString());lists.add(jc);jc=null;}

        //行业公共服务平台
        if(MyTools.isNotEmpty(stNjHfgxTb.getChangjiaodanwei())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("LWVtvcir");
            jc.setAttrValue(stNjHfgxTb.getChangjiaodanwei().toString());lists.add(jc);jc=null;}

        //协调行业内外纠纷X次
        if(MyTools.isNotEmpty(stNjHfgxTb.getChangbiaogeren())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("pmaIKLhi");
            jc.setAttrValue(stNjHfgxTb.getChangbiaogeren().toString());lists.add(jc);jc=null;}

        //评比达标表彰活动
        if(MyTools.isNotEmpty(stNjHfgxTb.getChangshugeren())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("xNDUxcTg");
            jc.setAttrValue(stNjHfgxTb.getChangshugeren().toString());lists.add(jc);jc=null;}

        //举办考试
        if(MyTools.isNotEmpty(stNjHfgxTb.getChangjiaogeren())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("ejXOcXPg");
            jc.setAttrValue(stNjHfgxTb.getChangjiaogeren().toString());lists.add(jc);jc=null;}

        //举办考试2
        if(MyTools.isNotEmpty(stNjHfgxTb.getLishibiaodanwei())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("eeeecXPg");
            jc.setAttrValue(stNjHfgxTb.getLishibiaodanwei().toString());lists.add(jc);jc=null;}

        //参与举办经济实体
        if(MyTools.isNotEmpty(stNjHfgxTb.getLishishudanwei())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("lKiPiHPG");
            jc.setAttrValue(stNjHfgxTb.getLishishudanwei().toString());lists.add(jc);jc=null;}

        //提供技术、经济、管 理、法律、政策等咨询服务
        if(MyTools.isNotEmpty(stNjHfgxTb.getLishijiaodanwei())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("WClMukYy");
            jc.setAttrValue(stNjHfgxTb.getLishijiaodanwei().toString());lists.add(jc);jc=null;}

        //接受政府部门委托项目
        if(MyTools.isNotEmpty(stNjHfgxTb.getLishibiaogeren())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("fuuIDxhk");
            jc.setAttrValue(stNjHfgxTb.getLishibiaogeren().toString());lists.add(jc);jc=null;}

        //历年参与标准制定X次
        if(MyTools.isNotEmpty(stNjHfgxTb.getLishishugeren())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("ximRLUQP");
            jc.setAttrValue(stNjHfgxTb.getLishishugeren().toString());lists.add(jc);jc=null;}

        //项
        if(MyTools.isNotEmpty(stNjHfgxTb.getLishijiaogeren())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("xXXXXRLUQP");
            jc.setAttrValue(stNjHfgxTb.getLishijiaogeren().toString());lists.add(jc);jc=null;}

        //参与法律法规文件修改制定
        if(MyTools.isNotEmpty(stNjHfgxTb.getHuibiaodanwei())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("ZMSzHucz");
            jc.setAttrValue(stNjHfgxTb.getHuibiaodanwei().toString());lists.add(jc);jc=null;}

        //反倾销、反补贴和保障措施应诉、申诉
        if(MyTools.isNotEmpty(stNjHfgxTb.getHuishudanwei())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("NBNclraV");
            jc.setAttrValue(stNjHfgxTb.getHuishudanwei().toString());lists.add(jc);jc=null;}

        //向政府部门提出政策建议
        if(MyTools.isNotEmpty(stNjHfgxTb.getHuijiaodanwei())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("cfHEYYlp");
            jc.setAttrValue(stNjHfgxTb.getHuijiaodanwei().toString());lists.add(jc);jc=null;}

        //项
        if(MyTools.isNotEmpty(stNjHfgxTb.getHuibiaogeren())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("cfHhhhHYYlp");
            jc.setAttrValue(stNjHfgxTb.getHuibiaogeren().toString());lists.add(jc);jc=null;}




        return lists;
    }
}
