package com.xgb.service;

import com.xgb.common.Utils;
import com.xgb.model.StDjqk4;

import java.io.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class SaveStDjqk4Service {

    public static StringBuffer saveEntity(StringBuffer buffer , List<StDjqk4> contents){
        for (StDjqk4 content : contents) {
            Long id = content.getId ();//ID
            String instanceid = content.getInstanceid ();//INSTANCEID
            String organizationid = content.getOrganizationid ();//ORGANIZATIONID
            Short status = content.getStatus ();//STATUS
            String danweimingcheng = content.getDanweimingcheng ();//单位名称
            String dengjihao = content.getDengjihao ();//登记号
            String dengjijiguan = content.getDengjijiguan ();//登记机关
            Integer dangyuanzongshu = content.getDangyuanzongshu ();//党员总数
            Integer zhuandangshu = content.getZhuandangshu ();//专党数
            Integer fuzerenshu = content.getFuzerenshu ();//负责人数
            Integer jiandangshu = content.getJiandangshu ();//兼党数
            Integer dangnianshu = content.getDangnianshu ();//当年数
            Integer renyuanshu1 = content.getRenyuanshu1 ();//人员数1
            Integer renyuanshu2 = content.getRenyuanshu2 ();//人员数2
            Integer sanshiwushu = content.getSanshiwushu ();//三十五数
            Integer wushisishu = content.getWushisishu ();//五十四数
            Integer wushiwushu = content.getWushiwushu ();//五十五数
            Integer boshishu = content.getBoshishu ();//博士数
            Integer shuoshishu = content.getShuoshishu ();//硕士数
            Integer benkeshu = content.getBenkeshu ();//本科数
            Integer dazhuanshu = content.getDazhuanshu ();//大专数
            Integer zhongzhuanshu = content.getZhongzhuanshu ();//中专数
            Integer gaozhongshu = content.getGaozhongshu ();//高中数
            Integer jingjidangshu = content.getJingjidangshu ();//京籍党数
            Integer waishengdangshu = content.getWaishengdangshu ();//外省党数
            Integer shehuizushu = content.getShehuizushu ();//社会组数
            Integer yezushu = content.getYezushu ();//业组数
            Integer guakaozushu = content.getGuakaozushu ();//挂靠组数
            Integer shudizushu = content.getShudizushu ();//属地组数
            Integer yuanzuzhishu = content.getYuanzuzhishu ();//原组织数
            Integer qitashu = content.getQitashu ();//其他数
            String jianlidang1 = content.getJianlidang1 ();//建立党1
            String jianlidang2 = content.getJianlidang2 ();//建立党2
            String zuzhimingcheng = content.getZuzhimingcheng ();//组织名称
            String dangleixing = content.getDangleixing ();//党类型
            String lishuguanxi = content.getLishuguanxi ();//隶属关系
            String danrenzhiwu = content.getDanrenzhiwu ();//担任职务
            String nianling = content.getNianling ();//年龄
            String xueli = content.getXueli ();//学历
            Integer liudongshu = content.getLiudongshu ();//流动数
            Integer yuanjishu = content.getYuanjishu ();//原籍数
            Integer zhijieshu = content.getZhijieshu ();//职介数
            Integer zidaishu = content.getZidaishu ();//自带数
            String canjia = content.getCanjia ();//参加
            String bucanjia = content.getBucanjia ();//不参加
            String weijianyuanyin = content.getWeijianyuanyin ();//未建原因
            String huodongchangsuo = content.getHuodongchangsuo ();//活动场所
            String huodongjingfei = content.getHuodongjingfei ();//活动经费
            String jingfeilaiyuan = content.getJingfeilaiyuan ();//经费来源
            String fazhandangyuan = content.getFazhandangyuan ();//发展党员
            Integer danghuishu = content.getDanghuishu ();//党会数
            Integer zhihuishu = content.getZhihuishu ();//支会数
            Integer minhuishu = content.getMinhuishu ();//民会数
            Integer dangkeshu = content.getDangkeshu ();//党课数
            String dongyuanhui1 = content.getDongyuanhui1 ();//动员会1
            String dongyuanhui2 = content.getDongyuanhui2 ();//动员会2
            Integer kaizhanshu = content.getKaizhanshu ();//开展数
            String huodongzaiti = content.getHuodongzaiti ();//活动载体
            String wanchengzhuangtai = content.getWanchengzhuangtai ();//完成状态
            Integer jianfushu = content.getJianfushu ();//兼负数
            Integer jiedangshu = content.getJiedangshu ();//null
            Integer fuzerenshu5 = content.getFuzerenshu5 ();//null
            Integer renyuanshu5 = content.getRenyuanshu5 ();//null
            Integer lidangshu = content.getLidangshu ();//null
            Integer fuzerenshu6 = content.getFuzerenshu6 ();//null
            Integer renyuanshu6 = content.getRenyuanshu6 ();//null
            Integer jijinhui = content.getJijinhui ();//null
            String chenglishijian = content.getChenglishijian ();//null
            String anqihuanjie = content.getAnqihuanjie ();//null
            String shangjidangzuzhi = content.getShangjidangzuzhi ();//null
            String shixiangjuece = content.getShixiangjuece ();//null
            String dangjiangongzuopeixun = content.getDangjiangongzuopeixun ();//null
            String dangjianpeixun1 = content.getDangjianpeixun1 ();//null
            String pinpaihuodong = content.getPinpaihuodong ();//null
            String s1 = content.getS1 ();//null
            String s2 = content.getS2 ();//null
            String s3 = content.getS3 ();//null
            String s4 = content.getS4 ();//null
            String s5 = content.getS5 ();//null
            String s6 = content.getS6 ();//null
            String s7 = content.getS7 ();//null
            String s8 = content.getS8 ();//null
            String s9 = content.getS9 ();//null
            String s10 = content.getS10 ();//null
            String s11 = content.getS11 ();//null
            String s12 = content.getS12 ();//null
            String s13 = content.getS13 ();//null
            String s14 = content.getS14 ();//null
            String s15 = content.getS15 ();//null
            String s16 = content.getS16 ();//null
            String s17 = content.getS17 ();//null
            String s18 = content.getS18 ();//null
            String s19 = content.getS19 ();//null
            String s20 = content.getS20 ();//null
            String s21 = content.getS21 ();//null
            String s22 = content.getS22 ();//null
            Object guanfangwangzhan1 = content.getGuanfangwangzhan1 ();//官方网站1
            Object weixinpingtai1 = content.getWeixinpingtai1 ();//微信平台1
            Object weibo1 = content.getWeibo1 ();//微博1
            Object zazhiqikan1 = content.getZazhiqikan1 ();//杂志期刊1
            Object qitafangshi1 = content.getQitafangshi1 ();//其他方式1
            Object guanfangwangzhan2 = content.getGuanfangwangzhan2 ();//官方网站2
            Object weixinpingtai2 = content.getWeixinpingtai2 ();//微信平台2
            Object weibo2 = content.getWeibo2 ();//微博2
            Object zazhiqikan2 = content.getZazhiqikan2 ();//杂志期刊2
            Object qitafangshi2 = content.getQitafangshi2 ();//其他方式2
            Object qitafangshi22 = content.getQitafangshi22 ();//其他方式22
            Object qitafangshi11 = content.getQitafangshi11 ();//其他方式11
            Object huiyuandahui = content.getHuiyuandahui ();//会员大会
            Object gongzuoqqqun = content.getGongzuoqqqun ();//工作QQ群
            Object duanxinpingtai = content.getDuanxinpingtai ();//短信平台

            buffer.append(id+"|");
            buffer.append(instanceid+"|");
            buffer.append(organizationid+"|");
            buffer.append(status+"|");
            buffer.append(danweimingcheng+"|");
            buffer.append(dengjihao+"|");
            buffer.append(dengjijiguan+"|");
            buffer.append(dangyuanzongshu+"|");
            buffer.append(zhuandangshu+"|");
            buffer.append(fuzerenshu+"|");
            buffer.append(jiandangshu+"|");
            buffer.append(dangnianshu+"|");
            buffer.append(renyuanshu1+"|");
            buffer.append(renyuanshu2+"|");
            buffer.append(sanshiwushu+"|");
            buffer.append(wushisishu+"|");
            buffer.append(wushiwushu+"|");
            buffer.append(boshishu+"|");
            buffer.append(shuoshishu+"|");
            buffer.append(benkeshu+"|");
            buffer.append(dazhuanshu+"|");
            buffer.append(zhongzhuanshu+"|");
            buffer.append(gaozhongshu+"|");
            buffer.append(jingjidangshu+"|");
            buffer.append(waishengdangshu+"|");
            buffer.append(shehuizushu+"|");
            buffer.append(yezushu+"|");
            buffer.append(guakaozushu+"|");
            buffer.append(shudizushu+"|");
            buffer.append(yuanzuzhishu+"|");
            buffer.append(qitashu+"|");
            buffer.append(jianlidang1+"|");
            buffer.append(jianlidang2+"|");
            buffer.append(zuzhimingcheng+"|");
            buffer.append(dangleixing+"|");
            buffer.append(lishuguanxi+"|");
            buffer.append(danrenzhiwu+"|");
            buffer.append(nianling+"|");
            buffer.append(xueli+"|");
            buffer.append(liudongshu+"|");
            buffer.append(yuanjishu+"|");
            buffer.append(zhijieshu+"|");
            buffer.append(zidaishu+"|");
            buffer.append(canjia+"|");
            buffer.append(bucanjia+"|");
            buffer.append(weijianyuanyin+"|");
            buffer.append(huodongchangsuo+"|");
            buffer.append(huodongjingfei+"|");
            buffer.append(jingfeilaiyuan+"|");
            buffer.append(fazhandangyuan+"|");
            buffer.append(danghuishu+"|");
            buffer.append(zhihuishu+"|");
            buffer.append(minhuishu+"|");
            buffer.append(dangkeshu+"|");
            buffer.append(dongyuanhui1+"|");
            buffer.append(dongyuanhui2+"|");
            buffer.append(kaizhanshu+"|");
            buffer.append(huodongzaiti+"|");
            buffer.append(wanchengzhuangtai+"|");
            buffer.append(jianfushu+"|");
            buffer.append(jiedangshu+"|");
            buffer.append(fuzerenshu5+"|");
            buffer.append(renyuanshu5+"|");
            buffer.append(lidangshu+"|");
            buffer.append(fuzerenshu6+"|");
            buffer.append(renyuanshu6+"|");
            buffer.append(jijinhui+"|");
            buffer.append(chenglishijian+"|");
            buffer.append(anqihuanjie+"|");
            buffer.append(shangjidangzuzhi+"|");
            buffer.append(shixiangjuece+"|");
            buffer.append(dangjiangongzuopeixun+"|");
            buffer.append(dangjianpeixun1+"|");
            buffer.append(pinpaihuodong+"|");
            buffer.append(s1+"|");
            buffer.append(s2+"|");
            buffer.append(s3+"|");
            buffer.append(s4+"|");
            buffer.append(s5+"|");
            buffer.append(s6+"|");
            buffer.append(s7+"|");
            buffer.append(s8+"|");
            buffer.append(s9+"|");
            buffer.append(s10+"|");
            buffer.append(s11+"|");
            buffer.append(s12+"|");
            buffer.append(s13+"|");
            buffer.append(s14+"|");
            buffer.append(s15+"|");
            buffer.append(s16+"|");
            buffer.append(s17+"|");
            buffer.append(s18+"|");
            buffer.append(s19+"|");
            buffer.append(s20+"|");
            buffer.append(s21+"|");
            buffer.append(s22+"|");
            buffer.append(guanfangwangzhan1+"|");
            buffer.append(weixinpingtai1+"|");
            buffer.append(weibo1+"|");
            buffer.append(zazhiqikan1+"|");
            buffer.append(qitafangshi1+"|");
            buffer.append(guanfangwangzhan2+"|");
            buffer.append(weixinpingtai2+"|");
            buffer.append(weibo2+"|");
            buffer.append(zazhiqikan2+"|");
            buffer.append(qitafangshi2+"|");
            buffer.append(qitafangshi22+"|");
            buffer.append(qitafangshi11+"|");
            buffer.append(huiyuandahui+"|");
            buffer.append(gongzuoqqqun+"|");
            buffer.append(duanxinpingtai+"|");
            buffer.append("\n");
        }


        return buffer;
    }

    public static void writeToRestource(StringBuffer buffer){
        String path= Utils.getResourceBasePath()+"/xgb-data/data-api/config";
        System.out.println("输出文件目录：-----------"+path);
        String studentResourcePath = new File(path, "/StDjqk4.txt").getAbsolutePath();
        // 保证目录一定存在
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(studentResourcePath)));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Utils.writeTxt(writer,buffer.toString());
        Utils.close(writer);
    }

}
