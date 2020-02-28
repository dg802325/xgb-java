package com.xgb.utils.St;

import com.xgb.model.JcContentAttr1;
import com.xgb.model.StNjReport3;
import com.xgb.util.DateUtils;
import com.xgb.util.MyTools;

import java.util.ArrayList;
import java.util.List;

public class Save202 {

    public static List<JcContentAttr1> getEntity(Integer contentId, StNjReport3 stNjReport3) {
        List<JcContentAttr1> lists = new ArrayList<>();
        JcContentAttr1 jc = null;
        //业务范围
        if(MyTools.isNotEmpty(stNjReport3.getDengjizhenghao())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("guanliType");
            jc.setAttrValue(stNjReport3.getDengjizhenghao());lists.add(jc);}

        //业务范围
        if(MyTools.isNotEmpty(stNjReport3.getYewufanwei())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("ywfw");
            jc.setAttrValue(stNjReport3.getYewufanwei());lists.add(jc);}

        //成立时间
        if(MyTools.isNotEmpty(stNjReport3.getChenglishijian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("clsj");
            jc.setAttrValue(DateUtils.dateToyyyyMMdd(stNjReport3.getChenglishijian()));lists.add(jc);}

        //办公地址
        if(MyTools.isNotEmpty(stNjReport3.getZhusuo())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("bangdz");
            jc.setAttrValue(stNjReport3.getZhusuo());lists.add(jc);}


        //注册资金
        if(MyTools.isNotEmpty(stNjReport3.getZhucezijin())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("zczj");
            jc.setAttrValue(stNjReport3.getZhucezijin().toString());lists.add(jc);}

        //合署办公
        if(MyTools.isNotEmpty(stNjReport3.getHeshubangong())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("qsbang");
            jc.setAttrValue(stNjReport3.getHeshubangong());lists.add(jc);}

        //邮政编码
        if(MyTools.isNotEmpty(stNjReport3.getYoubian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("yzbian");
            jc.setAttrValue(stNjReport3.getYoubian());lists.add(jc);}

        //电子邮箱
        if(MyTools.isNotEmpty(stNjReport3.getDianziyouxiang())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("email");
            jc.setAttrValue(stNjReport3.getDianziyouxiang());lists.add(jc);}

        //单位会员数
        if(MyTools.isNotEmpty(stNjReport3.getDanweihuiyuanshu())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("vipnumber");
            jc.setAttrValue(stNjReport3.getDanweihuiyuanshu().toString());lists.add(jc);}

        //个人会员数
        if(MyTools.isNotEmpty(stNjReport3.getGerenhuiyuanshu())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("gvipnumber");
            jc.setAttrValue(stNjReport3.getGerenhuiyuanshu().toString());lists.add(jc);}

        //法定代表人姓名
        if(MyTools.isNotEmpty(stNjReport3.getFarenxingming())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("farname");
            jc.setAttrValue(stNjReport3.getFarenxingming());lists.add(jc);}

        //法人性别
        if(MyTools.isNotEmpty(stNjReport3.getXingbie())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("fasex");
            jc.setAttrValue(stNjReport3.getXingbie());lists.add(jc);}

        //法人出生日期
        if(MyTools.isNotEmpty(stNjReport3.getChushengnianyue())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("faborndata");
            jc.setAttrValue(DateUtils.dateToyyyyMMdd(stNjReport3.getChushengnianyue()));lists.add(jc);}

        //法人电话
        if(MyTools.isNotEmpty(stNjReport3.getFarendianhua())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("farphone");
            jc.setAttrValue(stNjReport3.getFarendianhua());lists.add(jc);}

        //法人职务
        if(MyTools.isNotEmpty(stNjReport3.getFarenzhiwu())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("faworkandpart");
            jc.setAttrValue(stNjReport3.getFarenzhiwu());lists.add(jc);}

        //理事人数
        if(MyTools.isNotEmpty(stNjReport3.getLishirenshu())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("lisrs");
            jc.setAttrValue(stNjReport3.getLishirenshu().toString());lists.add(jc);}

        //常务理事人数
        if(MyTools.isNotEmpty(stNjReport3.getChangwulishirenshu())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("cwrshu");
            jc.setAttrValue(stNjReport3.getChangwulishirenshu().toString());lists.add(jc);}

        //负责人数
        if(MyTools.isNotEmpty(stNjReport3.getFuzerenshu())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("fuzerens");
            jc.setAttrValue(stNjReport3.getFuzerenshu().toString());lists.add(jc);}

        //理事长姓名
        if(MyTools.isNotEmpty(stNjReport3.getLishichangxingming())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("lisxingm");
            jc.setAttrValue(stNjReport3.getLishichangxingming());lists.add(jc);}

        //理事长性别
        if(MyTools.isNotEmpty(stNjReport3.getXingbie2())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("lisxingbie");
            jc.setAttrValue(stNjReport3.getXingbie2());lists.add(jc);}

        //理事长出生日期
        if(MyTools.isNotEmpty(stNjReport3.getChushengnianyue2())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("lischuserq");
            jc.setAttrValue(DateUtils.dateToyyyyMMdd(stNjReport3.getChushengnianyue2()));lists.add(jc);}

        //理事长学历
        if(MyTools.isNotEmpty(stNjReport3.getXueli2())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("xueli");
            jc.setAttrValue(stNjReport3.getXueli2());lists.add(jc);}

        //秘书长移动电话
        if(MyTools.isNotEmpty(stNjReport3.getShouji())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("mszydphone");
            jc.setAttrValue(stNjReport3.getShouji());lists.add(jc);}

        //理事单位职务
        if(MyTools.isNotEmpty(stNjReport3.getLishidanweizhiwu())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("lisygzdw");
            jc.setAttrValue(stNjReport3.getLishidanweizhiwu());lists.add(jc);}

        //理事任职日期
        if(MyTools.isNotEmpty(stNjReport3.getRenzhiriqi1())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("lisrenzrq");
            jc.setAttrValue(DateUtils.dateToyyyyMMdd(stNjReport3.getRenzhiriqi1()));lists.add(jc);}

        //秘书长姓名
        if(MyTools.isNotEmpty(stNjReport3.getMishuchangxingming())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("mszname");
            jc.setAttrValue(stNjReport3.getMishuchangxingming());lists.add(jc);}

        //秘书长性别
        if(MyTools.isNotEmpty(stNjReport3.getXingbie3())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("mszxingb");
            jc.setAttrValue(stNjReport3.getXingbie3());lists.add(jc);}

        //秘书长出生年月
        if(MyTools.isNotEmpty(stNjReport3.getChushengnianyue3())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("mszchsrq");
            jc.setAttrValue(DateUtils.dateToyyyyMMdd(stNjReport3.getChushengnianyue3()));lists.add(jc);}

        //秘书长长电话
        if(MyTools.isNotEmpty(stNjReport3.getLianxidianhua())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("mszphone");
            jc.setAttrValue(stNjReport3.getLianxidianhua());lists.add(jc);}

        //秘书长任职日期
        if(MyTools.isNotEmpty(stNjReport3.getRenzhiriqi2())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("mszchsrq");
            jc.setAttrValue(DateUtils.dateToyyyyMMdd(stNjReport3.getRenzhiriqi2()));lists.add(jc);}

        //秘书长职务
        if(MyTools.isNotEmpty(stNjReport3.getMishudanweizhiwu())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("mszygzdw");
            jc.setAttrValue(stNjReport3.getMishudanweizhiwu());lists.add(jc);}

        //工作人员总数
        if(MyTools.isNotEmpty(stNjReport3.getGongzuorenyuanzongshu())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("gzqtryrs");
            jc.setAttrValue(stNjReport3.getGongzuorenyuanzongshu().toString());lists.add(jc);}

        //平均年龄
        if(MyTools.isNotEmpty(stNjReport3.getQuantinianling())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("gzqtrynl");
            jc.setAttrValue(stNjReport3.getQuantinianling());lists.add(jc);}

        //女性人数
        if(MyTools.isNotEmpty(stNjReport3.getQuantinvxing())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("gzqtryns");
            jc.setAttrValue(stNjReport3.getQuantinvxing());lists.add(jc);}

        //本科人数
        if(MyTools.isNotEmpty(stNjReport3.getQuantibenke())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("gzqtrybkrs");
            jc.setAttrValue(stNjReport3.getQuantibenke());lists.add(jc);}

        //党员人数
        if(MyTools.isNotEmpty(stNjReport3.getQuantidangyuan())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("gzqtrydyrs");
            jc.setAttrValue(stNjReport3.getQuantidangyuan());lists.add(jc);}

        //专职工作人数
        if(MyTools.isNotEmpty(stNjReport3.getZhuanzhigongzuorenshu())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("gzzhrs");
            jc.setAttrValue(stNjReport3.getZhuanzhigongzuorenshu().toString());lists.add(jc);}

        //专职年龄
        if(MyTools.isNotEmpty(stNjReport3.getZhuanzhinianling())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("gzzhpjnl");
            jc.setAttrValue(stNjReport3.getZhuanzhinianling());lists.add(jc);}

        //专职女性
        if(MyTools.isNotEmpty(stNjReport3.getZhuanzhinvxing())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("gzzhnxrs");
            jc.setAttrValue(stNjReport3.getZhuanzhinvxing());lists.add(jc);}

        //专职本科
        if(MyTools.isNotEmpty(stNjReport3.getZhuanzhibenke())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("gzzybkrs");
            jc.setAttrValue(stNjReport3.getZhuanzhibenke());lists.add(jc);}

        //专职党员
        if(MyTools.isNotEmpty(stNjReport3.getZhuanzhidangyuan())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("gzzhdangrs");
            jc.setAttrValue(stNjReport3.getZhuanzhidangyuan());lists.add(jc);}

        //发言人姓名
        if(MyTools.isNotEmpty(stNjReport3.getFayanrenxingming())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("shzzname");
            jc.setAttrValue(stNjReport3.getFayanrenxingming());lists.add(jc);}

        //发言人电话
        if(MyTools.isNotEmpty(stNjReport3.getFayanrendianhua())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("shzzgphone");
            jc.setAttrValue(stNjReport3.getFayanrendianhua());lists.add(jc);}

        //发言人手机
        if(MyTools.isNotEmpty(stNjReport3.getFayanrenshouji())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("shzzphone");
            jc.setAttrValue(stNjReport3.getFayanrenshouji());lists.add(jc);}

        //发言人电子邮箱
        if(MyTools.isNotEmpty(stNjReport3.getFayanrenyouxiang())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("shzzemail");
            jc.setAttrValue(stNjReport3.getFayanrenyouxiang());lists.add(jc);}

        //志愿者人数
        if(MyTools.isNotEmpty(stNjReport3.getZhiyuanzherenshu())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("zyzrs");
            jc.setAttrValue(stNjReport3.getZhiyuanzherenshu().toString());lists.add(jc);}

        //志愿劳动时间
        if(MyTools.isNotEmpty(stNjReport3.getZhiyuanlaodongshijian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("zyzljsj");
            jc.setAttrValue(stNjReport3.getZhiyuanlaodongshijian().toString());lists.add(jc);}

        //分支机构数
        if(MyTools.isNotEmpty(stNjReport3.getFenzhijigoushu())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("jgszfzs");
            jc.setAttrValue(stNjReport3.getFenzhijigoushu().toString());lists.add(jc);}

        //专项基金管理机构数
        if(MyTools.isNotEmpty(stNjReport3.getZhuanxiangjigoushu())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("jgszjjgls");
            jc.setAttrValue(stNjReport3.getZhuanxiangjigoushu().toString());lists.add(jc);}

        //代表机构数
        if(MyTools.isNotEmpty(stNjReport3.getDaibiaojigoushu())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("jgszdbjgs");
            jc.setAttrValue(stNjReport3.getDaibiaojigoushu().toString());lists.add(jc);}

        //办事机构数
        if(MyTools.isNotEmpty(stNjReport3.getNeishejigoushu())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("jgszbsjgs");
            jc.setAttrValue(stNjReport3.getNeishejigoushu().toString());lists.add(jc);}

        //经营性实体数
        if(MyTools.isNotEmpty(stNjReport3.getJingyingxingshitishu())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("jgszstjgs");
            jc.setAttrValue(stNjReport3.getJingyingxingshitishu().toString());lists.add(jc);}

        //国际合作项目
        if(MyTools.isNotEmpty(stNjReport3.getGuojihezuo())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("gjjlhzxm");
            jc.setAttrValue(stNjReport3.getGuojihezuo());lists.add(jc);}

        //参加国际会议
        if(MyTools.isNotEmpty(stNjReport3.getGuojihuiyi())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("gjjlgjhy");
            jc.setAttrValue(stNjReport3.getGuojihuiyi());lists.add(jc);}

        //参加国际组织
        if(MyTools.isNotEmpty(stNjReport3.getGuojizuzhi())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("gjjlcjzz");
            jc.setAttrValue(stNjReport3.getGuojizuzhi());lists.add(jc);}

        //组团出国
        if(MyTools.isNotEmpty(stNjReport3.getChuguofangwen())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("gjjlztcgfw");
            jc.setAttrValue(stNjReport3.getChuguofangwen());lists.add(jc);}

        //服务性收费
        if(MyTools.isNotEmpty(stNjReport3.getFuwushoufei())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("srqkfwsf");
            jc.setAttrValue(stNjReport3.getFuwushoufei());lists.add(jc);}

        //举办表彰大会
        if(MyTools.isNotEmpty(stNjReport3.getDabiaohuodong())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("qtbizhd");
            jc.setAttrValue(stNjReport3.getDabiaohuodong());lists.add(jc);}

        //举办研讨会、论坛活动
        if(MyTools.isNotEmpty(stNjReport3.getLuntanhuodong())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("qtytlthd");
            jc.setAttrValue(stNjReport3.getLuntanhuodong().toString());lists.add(jc);}

        //举办公益活动
        if(MyTools.isNotEmpty(stNjReport3.getGongyihuodong())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("qtqbgyhd");
            jc.setAttrValue(stNjReport3.getGongyihuodong().toString());lists.add(jc);}

        //委托授权
        if(MyTools.isNotEmpty(stNjReport3.getWeituoshouquan())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("qtxzjgwts");
            jc.setAttrValue(stNjReport3.getWeituoshouquan().toString());lists.add(jc);}

        //法人政治面貌
        if(MyTools.isNotEmpty(stNjReport3.getZhengzhimianmao())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("frzzmm");
            jc.setAttrValue(stNjReport3.getZhengzhimianmao());lists.add(jc);}

        //法人学历
        if(MyTools.isNotEmpty(stNjReport3.getXueli())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("frxueli");
            jc.setAttrValue(stNjReport3.getXueli());lists.add(jc);}

        //秘书长政治面貌
        if(MyTools.isNotEmpty(stNjReport3.getZhengzhimianmao3())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("mszzzmm");
            jc.setAttrValue(stNjReport3.getZhengzhimianmao3());lists.add(jc);}

        //秘书长学历
        if(MyTools.isNotEmpty(stNjReport3.getXueli3())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("mszxueli");
            jc.setAttrValue(stNjReport3.getXueli3());lists.add(jc);}

        //秘书长产生方式
        if(MyTools.isNotEmpty(stNjReport3.getChanshengfangshi())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("mszscfs");
            jc.setAttrValue(stNjReport3.getChanshengfangshi());lists.add(jc);}

        //公开发行刊物数
        if(MyTools.isNotEmpty(stNjReport3.getGongkaikanwushu())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("gkfxkws");
            jc.setAttrValue(stNjReport3.getGongkaikanwushu().toString());lists.add(jc);}

        //内部资料性刊物数
        if(MyTools.isNotEmpty(stNjReport3.getNeibukanwushu())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("nbzlkws");
            jc.setAttrValue(stNjReport3.getNeibukanwushu().toString());lists.add(jc);}

        //捐赠收入
        if(MyTools.isNotEmpty(stNjReport3.getJuanzengshouru())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("jzsr");
            jc.setAttrValue(stNjReport3.getJuanzengshouru());lists.add(jc);}

        //公益活动支出
        if(MyTools.isNotEmpty(stNjReport3.getHuodongzhichu())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("gyhdzc");
            jc.setAttrValue(stNjReport3.getHuodongzhichu());lists.add(jc);}

        //行业分类
        if(MyTools.isNotEmpty(stNjReport3.getXingyefenlei())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("hyfengl");
            jc.setAttrValue(stNjReport3.getXingyefenlei());lists.add(jc);}

        //会费收入
        if(MyTools.isNotEmpty(stNjReport3.getShouhuifei())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("hfsrx");
            jc.setAttrValue(stNjReport3.getShouhuifei());lists.add(jc);}

        //主管单位初审意见
        if(MyTools.isNotEmpty(stNjReport3.getTjnjyijian1())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("zgshyj");
            jc.setAttrValue(stNjReport3.getTjnjyijian1());lists.add(jc);}

        //主管单位交互审意见
        if(MyTools.isNotEmpty(stNjReport3.getTjnjyijian2())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("jhcsyj");
            jc.setAttrValue(stNjReport3.getTjnjyijian2());lists.add(jc);}

        //结论复审是否合格
        if(MyTools.isNotEmpty(stNjReport3.getTjnjjieguo1())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("jlsfhg");
            jc.setAttrValue(stNjReport3.getTjnjjieguo1());lists.add(jc);}

        //结论复审意见
        if(MyTools.isNotEmpty(stNjReport3.getTjnjjieguo2())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("jlfsyj");
            jc.setAttrValue(stNjReport3.getTjnjjieguo2());lists.add(jc);}

        //会议活动
        if(MyTools.isNotEmpty(stNjReport3.getHuiyihuodong())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("qtqbjpx");
            jc.setAttrValue(stNjReport3.getHuiyihuodong().toString());lists.add(jc);}

        //认证、鉴定等活动
        if(MyTools.isNotEmpty(stNjReport3.getZizhipingshen())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("qtrejddhd");
            jc.setAttrValue(stNjReport3.getZizhipingshen().toString());lists.add(jc);}

        //理事长政治面貌
        if(MyTools.isNotEmpty(stNjReport3.getZhengzhimianmao2())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("zzmm");
            jc.setAttrValue(stNjReport3.getZhengzhimianmao2());lists.add(jc);}
        jc = null;
        return lists;
    }
}
