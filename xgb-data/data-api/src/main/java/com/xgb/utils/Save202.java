package com.xgb.utils;

import com.xgb.model.JcContentAttr1;
import com.xgb.model.StNjReport3;
import com.xgb.util.DateUtils;
import com.xgb.util.MyTools;

import java.util.ArrayList;
import java.util.List;

public class Save202 {

    public static List<JcContentAttr1> getEntity(Integer contentId, StNjReport3 stNjReport3) {
        List<JcContentAttr1> lists = new ArrayList<>();

        //业务范围
        if(MyTools.isNotEmpty(stNjReport3.getDengjizhenghao())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("guanliType");
            jc.setAttrValue(stNjReport3.getDengjizhenghao());lists.add(jc);jc=null;}

        //业务范围
        if(MyTools.isNotEmpty(stNjReport3.getYewufanwei())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("ywfw");
            jc.setAttrValue(stNjReport3.getYewufanwei());lists.add(jc);jc=null;}

        //成立时间
        if(MyTools.isNotEmpty(stNjReport3.getChenglishijian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("clsj");
            jc.setAttrValue(DateUtils.dateToyyyyMMdd(stNjReport3.getChenglishijian()));lists.add(jc);jc=null;}

        //办公地址
        if(MyTools.isNotEmpty(stNjReport3.getZhusuo())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("bangdz");
            jc.setAttrValue(stNjReport3.getZhusuo());lists.add(jc);jc=null;}


        //注册资金
        if(MyTools.isNotEmpty(stNjReport3.getZhucezijin())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("zczj");
            jc.setAttrValue(stNjReport3.getZhucezijin().toString());lists.add(jc);jc=null;}

        //合署办公
        if(MyTools.isNotEmpty(stNjReport3.getHeshubangong())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("qsbang");
            jc.setAttrValue(stNjReport3.getHeshubangong());lists.add(jc);jc=null;}

        //邮政编码
        if(MyTools.isNotEmpty(stNjReport3.getYoubian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("yzbian");
            jc.setAttrValue(stNjReport3.getYoubian());lists.add(jc);jc=null;}

        //电子邮箱
        if(MyTools.isNotEmpty(stNjReport3.getDianziyouxiang())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("email");
            jc.setAttrValue(stNjReport3.getDianziyouxiang());lists.add(jc);jc=null;}

        //单位会员数
        if(MyTools.isNotEmpty(stNjReport3.getDanweihuiyuanshu())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("vipnumber");
            jc.setAttrValue(stNjReport3.getDanweihuiyuanshu().toString());lists.add(jc);jc=null;}

        //个人会员数
        if(MyTools.isNotEmpty(stNjReport3.getGerenhuiyuanshu())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("gvipnumber");
            jc.setAttrValue(stNjReport3.getGerenhuiyuanshu().toString());lists.add(jc);jc=null;}

        //法定代表人姓名
        if(MyTools.isNotEmpty(stNjReport3.getFarenxingming())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("farname");
            jc.setAttrValue(stNjReport3.getFarenxingming());lists.add(jc);jc=null;}

        //法人性别
        if(MyTools.isNotEmpty(stNjReport3.getXingbie())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("fasex");
            jc.setAttrValue(stNjReport3.getXingbie());lists.add(jc);jc=null;}

        //法人出生日期
        if(MyTools.isNotEmpty(stNjReport3.getChushengnianyue())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("faborndata");
            jc.setAttrValue(DateUtils.dateToyyyyMMdd(stNjReport3.getChushengnianyue()));lists.add(jc);jc=null;}

        //法人电话
        if(MyTools.isNotEmpty(stNjReport3.getFarendianhua())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("farphone");
            jc.setAttrValue(stNjReport3.getFarendianhua());lists.add(jc);jc=null;}

        //法人职务
        if(MyTools.isNotEmpty(stNjReport3.getFarenzhiwu())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("faworkandpart");
            jc.setAttrValue(stNjReport3.getFarenzhiwu());lists.add(jc);jc=null;}

        //理事人数
        if(MyTools.isNotEmpty(stNjReport3.getLishirenshu())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("lisrs");
            jc.setAttrValue(stNjReport3.getLishirenshu().toString());lists.add(jc);jc=null;}

        //常务理事人数
        if(MyTools.isNotEmpty(stNjReport3.getChangwulishirenshu())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("cwrshu");
            jc.setAttrValue(stNjReport3.getChangwulishirenshu().toString());lists.add(jc);jc=null;}

        //负责人数
        if(MyTools.isNotEmpty(stNjReport3.getFuzerenshu())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("fuzerens");
            jc.setAttrValue(stNjReport3.getFuzerenshu().toString());lists.add(jc);jc=null;}

        //理事长姓名
        if(MyTools.isNotEmpty(stNjReport3.getLishichangxingming())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("lisxingm");
            jc.setAttrValue(stNjReport3.getLishichangxingming());lists.add(jc);jc=null;}

        //理事长性别
        if(MyTools.isNotEmpty(stNjReport3.getXingbie2())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("lisxingbie");
            jc.setAttrValue(stNjReport3.getXingbie2());lists.add(jc);jc=null;}

        //理事长出生日期
        if(MyTools.isNotEmpty(stNjReport3.getChushengnianyue2())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("lischuserq");
            jc.setAttrValue(DateUtils.dateToyyyyMMdd(stNjReport3.getChushengnianyue2()));lists.add(jc);jc=null;}

        //秘书长移动电话
        if(MyTools.isNotEmpty(stNjReport3.getShouji())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("mszydphone");
            jc.setAttrValue(stNjReport3.getShouji());lists.add(jc);jc=null;}

        //理事单位职务
        if(MyTools.isNotEmpty(stNjReport3.getLishidanweizhiwu())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("lisygzdw");
            jc.setAttrValue(stNjReport3.getLishidanweizhiwu());lists.add(jc);jc=null;}

        //理事任职日期
        if(MyTools.isNotEmpty(stNjReport3.getRenzhiriqi1())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("lisrenzrq");
            jc.setAttrValue(DateUtils.dateToyyyyMMdd(stNjReport3.getRenzhiriqi1()));lists.add(jc);jc=null;}

        //秘书长姓名
        if(MyTools.isNotEmpty(stNjReport3.getMishuchangxingming())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("mszname");
            jc.setAttrValue(stNjReport3.getMishuchangxingming());lists.add(jc);jc=null;}

        //秘书长性别
        if(MyTools.isNotEmpty(stNjReport3.getXingbie3())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("mszxingb");
            jc.setAttrValue(stNjReport3.getXingbie3());lists.add(jc);jc=null;}

        //秘书长出生年月
        if(MyTools.isNotEmpty(stNjReport3.getChushengnianyue3())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("mszchsrq");
            jc.setAttrValue(DateUtils.dateToyyyyMMdd(stNjReport3.getChushengnianyue3()));lists.add(jc);jc=null;}

        //秘书长长电话
        if(MyTools.isNotEmpty(stNjReport3.getLianxidianhua())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("mszphone");
            jc.setAttrValue(stNjReport3.getLianxidianhua());lists.add(jc);jc=null;}

        //秘书长任职日期
        if(MyTools.isNotEmpty(stNjReport3.getRenzhiriqi2())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("mszchsrq");
            jc.setAttrValue(DateUtils.dateToyyyyMMdd(stNjReport3.getRenzhiriqi2()));lists.add(jc);jc=null;}

        //秘书长职务
        if(MyTools.isNotEmpty(stNjReport3.getMishudanweizhiwu())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("mszygzdw");
            jc.setAttrValue(stNjReport3.getMishudanweizhiwu());lists.add(jc);jc=null;}

        //工作人员总数
        if(MyTools.isNotEmpty(stNjReport3.getGongzuorenyuanzongshu())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("gzqtryrs");
            jc.setAttrValue(stNjReport3.getGongzuorenyuanzongshu().toString());lists.add(jc);jc=null;}

        //平均年龄
        if(MyTools.isNotEmpty(stNjReport3.getQuantinianling())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("gzqtrynl");
            jc.setAttrValue(stNjReport3.getQuantinianling());lists.add(jc);jc=null;}

        //女性人数
        if(MyTools.isNotEmpty(stNjReport3.getQuantinvxing())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("gzqtryns");
            jc.setAttrValue(stNjReport3.getQuantinvxing());lists.add(jc);jc=null;}

        //本科人数
        if(MyTools.isNotEmpty(stNjReport3.getQuantibenke())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("gzqtrybkrs");
            jc.setAttrValue(stNjReport3.getQuantibenke());lists.add(jc);jc=null;}

        //党员人数
        if(MyTools.isNotEmpty(stNjReport3.getQuantidangyuan())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("gzqtrydyrs");
            jc.setAttrValue(stNjReport3.getQuantidangyuan());lists.add(jc);jc=null;}

        //专职工作人数
        if(MyTools.isNotEmpty(stNjReport3.getZhuanzhigongzuorenshu())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("gzzhrs");
            jc.setAttrValue(stNjReport3.getZhuanzhigongzuorenshu().toString());lists.add(jc);jc=null;}

        //专职年龄
        if(MyTools.isNotEmpty(stNjReport3.getZhuanzhinianling())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("gzzhpjnl");
            jc.setAttrValue(stNjReport3.getZhuanzhinianling());lists.add(jc);jc=null;}

        //专职女性
        if(MyTools.isNotEmpty(stNjReport3.getZhuanzhinvxing())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("gzzhnxrs");
            jc.setAttrValue(stNjReport3.getZhuanzhinvxing());lists.add(jc);jc=null;}

        //专职本科
        if(MyTools.isNotEmpty(stNjReport3.getZhuanzhibenke())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("gzzybkrs");
            jc.setAttrValue(stNjReport3.getZhuanzhibenke());lists.add(jc);jc=null;}

        //专职党员
        if(MyTools.isNotEmpty(stNjReport3.getZhuanzhidangyuan())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("gzzhdangrs");
            jc.setAttrValue(stNjReport3.getZhuanzhidangyuan());lists.add(jc);jc=null;}

        //发言人姓名
        if(MyTools.isNotEmpty(stNjReport3.getFayanrenxingming())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("shzzname");
            jc.setAttrValue(stNjReport3.getFayanrenxingming());lists.add(jc);jc=null;}

        //发言人电话
        if(MyTools.isNotEmpty(stNjReport3.getFayanrendianhua())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("shzzgphone");
            jc.setAttrValue(stNjReport3.getFayanrendianhua());lists.add(jc);jc=null;}

        //发言人手机
        if(MyTools.isNotEmpty(stNjReport3.getFayanrenshouji())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("shzzphone");
            jc.setAttrValue(stNjReport3.getFayanrenshouji());lists.add(jc);jc=null;}

        //发言人电子邮箱
        if(MyTools.isNotEmpty(stNjReport3.getFayanrenyouxiang())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("shzzemail");
            jc.setAttrValue(stNjReport3.getFayanrenyouxiang());lists.add(jc);jc=null;}

        //志愿者人数
        if(MyTools.isNotEmpty(stNjReport3.getZhiyuanzherenshu())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("zyzrs");
            jc.setAttrValue(stNjReport3.getZhiyuanzherenshu().toString());lists.add(jc);jc=null;}

        //志愿劳动时间
        if(MyTools.isNotEmpty(stNjReport3.getZhiyuanlaodongshijian())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("zyzljsj");
            jc.setAttrValue(stNjReport3.getZhiyuanlaodongshijian().toString());lists.add(jc);jc=null;}

        //分支机构数
        if(MyTools.isNotEmpty(stNjReport3.getFenzhijigoushu())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("jgszfzs");
            jc.setAttrValue(stNjReport3.getFenzhijigoushu().toString());lists.add(jc);jc=null;}

        //专项基金管理机构数
        if(MyTools.isNotEmpty(stNjReport3.getZhuanxiangjigoushu())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("jgszjjgls");
            jc.setAttrValue(stNjReport3.getZhuanxiangjigoushu().toString());lists.add(jc);jc=null;}

        //代表机构数
        if(MyTools.isNotEmpty(stNjReport3.getDaibiaojigoushu())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("jgszdbjgs");
            jc.setAttrValue(stNjReport3.getDaibiaojigoushu().toString());lists.add(jc);jc=null;}

        //办事机构数
        if(MyTools.isNotEmpty(stNjReport3.getNeishejigoushu())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("jgszbsjgs");
            jc.setAttrValue(stNjReport3.getNeishejigoushu().toString());lists.add(jc);jc=null;}

        //经营性实体数
        if(MyTools.isNotEmpty(stNjReport3.getJingyingxingshitishu())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("jgszstjgs");
            jc.setAttrValue(stNjReport3.getJingyingxingshitishu().toString());lists.add(jc);jc=null;}

        //国际合作项目
        if(MyTools.isNotEmpty(stNjReport3.getGuojihezuo())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("gjjlhzxm");
            jc.setAttrValue(stNjReport3.getGuojihezuo());lists.add(jc);jc=null;}

        //参加国际会议
        if(MyTools.isNotEmpty(stNjReport3.getGuojihuiyi())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("gjjlgjhy");
            jc.setAttrValue(stNjReport3.getGuojihuiyi());lists.add(jc);jc=null;}

        //参加国际组织
        if(MyTools.isNotEmpty(stNjReport3.getGuojizuzhi())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("gjjlcjzz");
            jc.setAttrValue(stNjReport3.getGuojizuzhi());lists.add(jc);jc=null;}

        //组团出国
        if(MyTools.isNotEmpty(stNjReport3.getChuguofangwen())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("gjjlztcgfw");
            jc.setAttrValue(stNjReport3.getChuguofangwen());lists.add(jc);jc=null;}

        //服务性收费
        if(MyTools.isNotEmpty(stNjReport3.getFuwushoufei())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("srqkfwsf");
            jc.setAttrValue(stNjReport3.getFuwushoufei());lists.add(jc);jc=null;}

        //举办表彰大会
        if(MyTools.isNotEmpty(stNjReport3.getDabiaohuodong())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("qtbizhd");
            jc.setAttrValue(stNjReport3.getDabiaohuodong());lists.add(jc);jc=null;}

        //举办研讨会、论坛活动
        if(MyTools.isNotEmpty(stNjReport3.getLuntanhuodong())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("qtytlthd");
            jc.setAttrValue(stNjReport3.getLuntanhuodong().toString());lists.add(jc);jc=null;}

        //举办公益活动
        if(MyTools.isNotEmpty(stNjReport3.getGongyihuodong())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("qtqbgyhd");
            jc.setAttrValue(stNjReport3.getGongyihuodong().toString());lists.add(jc);jc=null;}

        //委托授权
        if(MyTools.isNotEmpty(stNjReport3.getWeituoshouquan())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("qtxzjgwts");
            jc.setAttrValue(stNjReport3.getWeituoshouquan().toString());lists.add(jc);jc=null;}

        //法人政治面貌
        if(MyTools.isNotEmpty(stNjReport3.getZhengzhimianmao())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("frzzmm");
            jc.setAttrValue(stNjReport3.getZhengzhimianmao());lists.add(jc);jc=null;}

        //法人学历
        if(MyTools.isNotEmpty(stNjReport3.getXueli())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("frxueli");
            jc.setAttrValue(stNjReport3.getXueli());lists.add(jc);jc=null;}

        //秘书长政治面貌
        if(MyTools.isNotEmpty(stNjReport3.getZhengzhimianmao3())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("mszzzmm");
            jc.setAttrValue(stNjReport3.getZhengzhimianmao3());lists.add(jc);jc=null;}

        //秘书长学历
        if(MyTools.isNotEmpty(stNjReport3.getXueli3())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("mszxueli");
            jc.setAttrValue(stNjReport3.getXueli3());lists.add(jc);jc=null;}

        //秘书长产生方式
        if(MyTools.isNotEmpty(stNjReport3.getChanshengfangshi())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("mszscfs");
            jc.setAttrValue(stNjReport3.getChanshengfangshi());lists.add(jc);jc=null;}

        //公开发行刊物数
        if(MyTools.isNotEmpty(stNjReport3.getGongkaikanwushu())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("gkfxkws");
            jc.setAttrValue(stNjReport3.getGongkaikanwushu().toString());lists.add(jc);jc=null;}

        //内部资料性刊物数
        if(MyTools.isNotEmpty(stNjReport3.getNeibukanwushu())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("nbzlkws");
            jc.setAttrValue(stNjReport3.getNeibukanwushu().toString());lists.add(jc);jc=null;}

        //捐赠收入
        if(MyTools.isNotEmpty(stNjReport3.getJuanzengshouru())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("jzsr");
            jc.setAttrValue(stNjReport3.getJuanzengshouru());lists.add(jc);jc=null;}

        //公益活动支出
        if(MyTools.isNotEmpty(stNjReport3.getHuodongzhichu())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("gyhdzc");
            jc.setAttrValue(stNjReport3.getHuodongzhichu());lists.add(jc);jc=null;}

        //行业分类
        if(MyTools.isNotEmpty(stNjReport3.getXingyefenlei())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("hyfengl");
            jc.setAttrValue(stNjReport3.getXingyefenlei());lists.add(jc);jc=null;}

        //会费收入
        if(MyTools.isNotEmpty(stNjReport3.getShouhuifei())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("hfsrx");
            jc.setAttrValue(stNjReport3.getShouhuifei());lists.add(jc);jc=null;}

        //主管单位初审意见
        if(MyTools.isNotEmpty(stNjReport3.getTjnjyijian1())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("zgshyj");
            jc.setAttrValue(stNjReport3.getTjnjyijian1());lists.add(jc);jc=null;}

        //主管单位交互审意见
        if(MyTools.isNotEmpty(stNjReport3.getTjnjyijian2())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("jhcsyj");
            jc.setAttrValue(stNjReport3.getTjnjyijian2());lists.add(jc);jc=null;}

        //结论复审是否合格
        if(MyTools.isNotEmpty(stNjReport3.getTjnjjieguo1())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("jlsfhg");
            jc.setAttrValue(stNjReport3.getTjnjjieguo1());lists.add(jc);jc=null;}

        //结论复审意见
        if(MyTools.isNotEmpty(stNjReport3.getTjnjjieguo2())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("jlfsyj");
            jc.setAttrValue(stNjReport3.getTjnjjieguo2());lists.add(jc);jc=null;}

        //会议活动
        if(MyTools.isNotEmpty(stNjReport3.getHuiyihuodong())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("qtqbjpx");
            jc.setAttrValue(stNjReport3.getHuiyihuodong().toString());lists.add(jc);jc=null;}

        //认证、鉴定等活动
        if(MyTools.isNotEmpty(stNjReport3.getZizhipingshen())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("qtrejddhd");
            jc.setAttrValue(stNjReport3.getZizhipingshen().toString());lists.add(jc);jc=null;}

        //理事长政治面貌
        if(MyTools.isNotEmpty(stNjReport3.getZhengzhimianmao2())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("zzmm");
            jc.setAttrValue(stNjReport3.getZhengzhimianmao2());lists.add(jc);jc=null;}

        return lists;
    }
}
