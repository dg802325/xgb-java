package com.xgb.service;

import com.xgb.common.Utils;
import com.xgb.model.StNjReport3;

import java.io.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class SaveStNjReport3Service {

    public static StringBuffer saveEntity(StringBuffer buffer , List<StNjReport3> contents){
        for (StNjReport3 content : contents) {
            Long id = content.getId ();//ID
            String instanceid = content.getInstanceid ();//INSTANCEID
            String organizationid = content.getOrganizationid ();//ORGANIZATIONID
            Short status = content.getStatus ();//STATUS
            String mingcheng = content.getMingcheng ();//名称
            String dengjizhenghao = content.getDengjizhenghao ();//登记证号
            String jigoudaima = content.getJigoudaima ();//组织机构代码
            Date chenglishijian = content.getChenglishijian ();//成立时间
            BigDecimal zhucezijin = content.getZhucezijin ();//注册资金
            String youbian = content.getYoubian ();//邮政编码
            String lianxidianhua = content.getLianxidianhua ();//联系电话
            String chuanzhen = content.getChuanzhen ();//传真
            String wangzhi = content.getWangzhi ();//网站地址
            String dianziyouxiang = content.getDianziyouxiang ();//电子邮箱
            Integer danweihuiyuanshu = content.getDanweihuiyuanshu ();//单位会员数
            Integer gerenhuiyuanshu = content.getGerenhuiyuanshu ();//个人会员数
            String farenxingming = content.getFarenxingming ();//法定代表人姓名
            String lishichangxingming = content.getLishichangxingming ();//理事长姓名
            Integer lishirenshu = content.getLishirenshu ();//理事人数
            Integer fuzerenshu = content.getFuzerenshu ();//负责人数
            String mishuchangxingming = content.getMishuchangxingming ();//秘书长姓名
            Integer changwulishirenshu = content.getChangwulishirenshu ();//常务理事人数
            Integer gongshengrenshu = content.getGongshengrenshu ();//省部级公务员兼任负责人人数
            Integer gongdirenshu = content.getGongdirenshu ();//地厅级公务员兼任负责人人数
            Integer gongxianrenshu = content.getGongxianrenshu ();//县处级公务员兼任负责人人数
            Integer lizongshu = content.getLizongshu ();//离退休人员担任负责人总数
            Integer lishengshu = content.getLishengshu ();//省部级离退休人员担任负责人数
            Integer lilaoling = content.getLilaoling ();//70岁以上离退休人员担任负责人数
            Integer gongzuorenyuanzongshu = content.getGongzuorenyuanzongshu ();//工作人员总数
            Integer zhuanzhigongzuorenshu = content.getZhuanzhigongzuorenshu ();//专职工作人数
            Integer jianzhirenyuanshu = content.getJianzhirenyuanshu ();//兼职人员数
            Integer lifanpinrenshu = content.getLifanpinrenshu ();//离退休返聘人数
            BigDecimal zhiyuanzherenshu = content.getZhiyuanzherenshu ();//志愿者人数
            BigDecimal zhiyuanlaodongshijian = content.getZhiyuanlaodongshijian ();//志愿劳动时间
            Integer dangyuanrenshu = content.getDangyuanrenshu ();//党员人数
            Integer fenzhijigoushu = content.getFenzhijigoushu ();//分支机构数
            Integer daibiaojigoushu = content.getDaibiaojigoushu ();//代表机构数
            Integer neishejigoushu = content.getNeishejigoushu ();//办事机构数
            Integer zhuanxiangjigoushu = content.getZhuanxiangjigoushu ();//专项基金管理机构数
            Integer jingyingxingshitishu = content.getJingyingxingshitishu ();//经营性实体数
            Integer gongkaikanwushu = content.getGongkaikanwushu ();//公开发行刊物数
            Integer neibukanwushu = content.getNeibukanwushu ();//内部资料性刊物数
            Date zhihuibiaozhunshijian = content.getZhihuibiaozhunshijian ();//制定会费标准时间
            String tonghuibiaozhunhuiyimingcheng = content.getTonghuibiaozhunhuiyimingcheng ();//通过会费标准会议名称
            String zhuguandanwei = content.getZhuguandanwei ();//主管单位
            String xingyefenlei = content.getXingyefenlei ();//行业分类
            String zhusuo = content.getZhusuo ();//住所
            String farenzhiwu = content.getFarenzhiwu ();//法人职务
            String mishuchangwei = content.getMishuchangwei ();//秘书长为
            String dangjianqingkuang = content.getDangjianqingkuang ();//党建情况
            String yewufanwei = content.getYewufanwei ();//业务范围
            String huifeibiaozhun = content.getHuifeibiaozhun ();//会费标准
            String minzhengbumen = content.getMinzhengbumen ();//民政部门
            String caizhengbumen = content.getCaizhengbumen ();//财政部门
            String zhusuoxiangxi = content.getZhusuoxiangxi ();//住所详细
            String shouji = content.getShouji ();//手机
            String xingbie = content.getXingbie ();//null
            Date chushengnianyue = content.getChushengnianyue ();//null
            String zhengzhimianmao = content.getZhengzhimianmao ();//null
            String xueli = content.getXueli ();//null
            String xingbie2 = content.getXingbie2 ();//2
            Date chushengnianyue2 = content.getChushengnianyue2 ();//2
            String zhengzhimianmao2 = content.getZhengzhimianmao2 ();//2
            String xueli2 = content.getXueli2 ();//2
            String lianxidianhua2 = content.getLianxidianhua2 ();//2
            String xingbie3 = content.getXingbie3 ();//3
            Date chushengnianyue3 = content.getChushengnianyue3 ();//3
            String zhengzhimianmao3 = content.getZhengzhimianmao3 ();//3
            String xueli3 = content.getXueli3 ();//3
            String chanshengfangshi = content.getChanshengfangshi ();//null
            String quantinianling = content.getQuantinianling ();//null
            String quantinvxing = content.getQuantinvxing ();//null
            String quantibenke = content.getQuantibenke ();//null
            String quantidangyuan = content.getQuantidangyuan ();//null
            String zhuanzhinianling = content.getZhuanzhinianling ();//null
            String zhuanzhinvxing = content.getZhuanzhinvxing ();//null
            String zhuanzhibenke = content.getZhuanzhibenke ();//null
            String zhuanzhidangyuan = content.getZhuanzhidangyuan ();//null
            String huodongcishu = content.getHuodongcishu ();//null
            String juanzengshouru = content.getJuanzengshouru ();//null
            String huodongzhichu = content.getHuodongzhichu ();//null
            String fuwuxinnongcun = content.getFuwuxinnongcun ();//null
            String qitagongyixiangmu = content.getQitagongyixiangmu ();//null
            String guojihezuo = content.getGuojihezuo ();//null
            String guojihuiyi = content.getGuojihuiyi ();//null
            String guojizuzhi = content.getGuojizuzhi ();//null
            String chuguofangwen = content.getChuguofangwen ();//null
            String jieshoukuanwu = content.getJieshoukuanwu ();//null
            String zuzhijuanzeng = content.getZuzhijuanzeng ();//null
            String kaizhanfuwu = content.getKaizhanfuwu ();//null
            String zuzhifuwu = content.getZuzhifuwu ();//null
            String shouhuifei = content.getShouhuifei ();//null
            String fuwushoufei = content.getFuwushoufei ();//null
            String dabiaohuodong = content.getDabiaohuodong ();//null
            String heshubangong = content.getHeshubangong ();//null
            String lishidanweizhiwu = content.getLishidanweizhiwu ();//null
            String zhiwujibie = content.getZhiwujibie ();//职务级别
            Integer luntanhuodong = content.getLuntanhuodong ();//举办研讨会、论坛活动
            Integer gongyihuodong = content.getGongyihuodong ();//举办公益活动
            String tjnjjieguo1 = content.getTjnjjieguo1 ();//天津年检结果1
            String tjnjjieguo2 = content.getTjnjjieguo2 ();//天津年检结果2
            String tjnjyijian1 = content.getTjnjyijian1 ();//天津审核意见1
            String tjnjyijian2 = content.getTjnjyijian2 ();//天津审核意见2
            String tjnjxingming1 = content.getTjnjxingming1 ();//天津审核姓名1
            String tjnjxingming2 = content.getTjnjxingming2 ();//天津审核姓名2
            Date tjnjshijian1 = content.getTjnjshijian1 ();//天津审批时间1
            Date tjnjshijian2 = content.getTjnjshijian2 ();//天津审批时间2
            Integer huiyihuodong = content.getHuiyihuodong ();//会议活动
            Integer zipingfenshu = content.getZipingfenshu ();//自评分数
            String zipingdengji = content.getZipingdengji ();//自评等级
            String paiqianzhidao = content.getPaiqianzhidao ();//是否派遣党建指导
            String gongzuoqingkuang = content.getGongzuoqingkuang ();//工作情况是否合格
            Integer qishiyishang = content.getQishiyishang ();//七十以上
            Integer xianchuyixia = content.getXianchuyixia ();//县处级以下人数
            Integer lishengzeren = content.getLishengzeren ();//离省责任
            Integer liditingzeren = content.getLiditingzeren ();//离地厅责任
            Integer lixianchuzeren = content.getLixianchuzeren ();//离县处责任
            Integer lishenglishi = content.getLishenglishi ();//离省理事
            Integer liditinglishi = content.getLiditinglishi ();//离地厅理事
            Integer lixianchulishi = content.getLixianchulishi ();//离县处理事
            String libeian = content.getLibeian ();//离备案
            String qitazuzhi = content.getQitazuzhi ();//其他组织
            String hangyebumen = content.getHangyebumen ();//null
            String dangjianbumen = content.getDangjianbumen ();//null
            String farendianhua = content.getFarendianhua ();//null
            Date renzhiriqi1 = content.getRenzhiriqi1 ();//null
            Date renzhiriqi2 = content.getRenzhiriqi2 ();//null
            String fayanrenxingming = content.getFayanrenxingming ();//null
            String fayanrendianhua = content.getFayanrendianhua ();//null
            String fayanrenshouji = content.getFayanrenshouji ();//null
            String fayanrenyouxiang = content.getFayanrenyouxiang ();//null
            String quntuanxinxi = content.getQuntuanxinxi ();//null
            Integer weituoshouquan = content.getWeituoshouquan ();//null
            Integer zizhipingshen = content.getZizhipingshen ();//null
            String mishudanweizhiwu = content.getMishudanweizhiwu ();//null
            buffer.append(id+"|");
            buffer.append(instanceid+"|");
            buffer.append(organizationid+"|");
            buffer.append(status+"|");
            buffer.append(mingcheng+"|");
            buffer.append(dengjizhenghao+"|");
            buffer.append(jigoudaima+"|");
            buffer.append(chenglishijian+"|");
            buffer.append(zhucezijin+"|");
            buffer.append(youbian+"|");
            buffer.append(lianxidianhua+"|");
            buffer.append(chuanzhen+"|");
            buffer.append(wangzhi+"|");
            buffer.append(dianziyouxiang+"|");
            buffer.append(danweihuiyuanshu+"|");
            buffer.append(gerenhuiyuanshu+"|");
            buffer.append(farenxingming+"|");
            buffer.append(lishichangxingming+"|");
            buffer.append(lishirenshu+"|");
            buffer.append(fuzerenshu+"|");
            buffer.append(mishuchangxingming+"|");
            buffer.append(changwulishirenshu+"|");
            buffer.append(gongshengrenshu+"|");
            buffer.append(gongdirenshu+"|");
            buffer.append(gongxianrenshu+"|");
            buffer.append(lizongshu+"|");
            buffer.append(lishengshu+"|");
            buffer.append(lilaoling+"|");
            buffer.append(gongzuorenyuanzongshu+"|");
            buffer.append(zhuanzhigongzuorenshu+"|");
            buffer.append(jianzhirenyuanshu+"|");
            buffer.append(lifanpinrenshu+"|");
            buffer.append(zhiyuanzherenshu+"|");
            buffer.append(zhiyuanlaodongshijian+"|");
            buffer.append(dangyuanrenshu+"|");
            buffer.append(fenzhijigoushu+"|");
            buffer.append(daibiaojigoushu+"|");
            buffer.append(neishejigoushu+"|");
            buffer.append(zhuanxiangjigoushu+"|");
            buffer.append(jingyingxingshitishu+"|");
            buffer.append(gongkaikanwushu+"|");
            buffer.append(neibukanwushu+"|");
            buffer.append(zhihuibiaozhunshijian+"|");
            buffer.append(tonghuibiaozhunhuiyimingcheng+"|");
            buffer.append(zhuguandanwei+"|");
            buffer.append(xingyefenlei+"|");
            buffer.append(zhusuo+"|");
            buffer.append(farenzhiwu+"|");
            buffer.append(mishuchangwei+"|");
            buffer.append(dangjianqingkuang+"|");
            buffer.append(yewufanwei+"|");
            buffer.append(huifeibiaozhun+"|");
            buffer.append(minzhengbumen+"|");
            buffer.append(caizhengbumen+"|");
            buffer.append(zhusuoxiangxi+"|");
            buffer.append(shouji+"|");
            buffer.append(xingbie+"|");
            buffer.append(chushengnianyue+"|");
            buffer.append(zhengzhimianmao+"|");
            buffer.append(xueli+"|");
            buffer.append(xingbie2+"|");
            buffer.append(chushengnianyue2+"|");
            buffer.append(zhengzhimianmao2+"|");
            buffer.append(xueli2+"|");
            buffer.append(lianxidianhua2+"|");
            buffer.append(xingbie3+"|");
            buffer.append(chushengnianyue3+"|");
            buffer.append(zhengzhimianmao3+"|");
            buffer.append(xueli3+"|");
            buffer.append(chanshengfangshi+"|");
            buffer.append(quantinianling+"|");
            buffer.append(quantinvxing+"|");
            buffer.append(quantibenke+"|");
            buffer.append(quantidangyuan+"|");
            buffer.append(zhuanzhinianling+"|");
            buffer.append(zhuanzhinvxing+"|");
            buffer.append(zhuanzhibenke+"|");
            buffer.append(zhuanzhidangyuan+"|");
            buffer.append(huodongcishu+"|");
            buffer.append(juanzengshouru+"|");
            buffer.append(huodongzhichu+"|");
            buffer.append(fuwuxinnongcun+"|");
            buffer.append(qitagongyixiangmu+"|");
            buffer.append(guojihezuo+"|");
            buffer.append(guojihuiyi+"|");
            buffer.append(guojizuzhi+"|");
            buffer.append(chuguofangwen+"|");
            buffer.append(jieshoukuanwu+"|");
            buffer.append(zuzhijuanzeng+"|");
            buffer.append(kaizhanfuwu+"|");
            buffer.append(zuzhifuwu+"|");
            buffer.append(shouhuifei+"|");
            buffer.append(fuwushoufei+"|");
            buffer.append(dabiaohuodong+"|");
            buffer.append(heshubangong+"|");
            buffer.append(lishidanweizhiwu+"|");
            buffer.append(zhiwujibie+"|");
            buffer.append(luntanhuodong+"|");
            buffer.append(gongyihuodong+"|");
            buffer.append(tjnjjieguo1+"|");
            buffer.append(tjnjjieguo2+"|");
            buffer.append(tjnjyijian1+"|");
            buffer.append(tjnjyijian2+"|");
            buffer.append(tjnjxingming1+"|");
            buffer.append(tjnjxingming2+"|");
            buffer.append(tjnjshijian1+"|");
            buffer.append(tjnjshijian2+"|");
            buffer.append(huiyihuodong+"|");
            buffer.append(zipingfenshu+"|");
            buffer.append(zipingdengji+"|");
            buffer.append(paiqianzhidao+"|");
            buffer.append(gongzuoqingkuang+"|");
            buffer.append(qishiyishang+"|");
            buffer.append(xianchuyixia+"|");
            buffer.append(lishengzeren+"|");
            buffer.append(liditingzeren+"|");
            buffer.append(lixianchuzeren+"|");
            buffer.append(lishenglishi+"|");
            buffer.append(liditinglishi+"|");
            buffer.append(lixianchulishi+"|");
            buffer.append(libeian+"|");
            buffer.append(qitazuzhi+"|");
            buffer.append(hangyebumen+"|");
            buffer.append(dangjianbumen+"|");
            buffer.append(farendianhua+"|");
            buffer.append(renzhiriqi1+"|");
            buffer.append(renzhiriqi2+"|");
            buffer.append(fayanrenxingming+"|");
            buffer.append(fayanrendianhua+"|");
            buffer.append(fayanrenshouji+"|");
            buffer.append(fayanrenyouxiang+"|");
            buffer.append(quntuanxinxi+"|");
            buffer.append(weituoshouquan+"|");
            buffer.append(zizhipingshen+"|");
            buffer.append(mishudanweizhiwu+"|");
            buffer.append("\n");
        }

        return buffer;
    }

    public static void writeToRestource(StringBuffer buffer){
        String path= Utils.getResourceBasePath()+"/xgb-data/data-api/config";
        System.out.println("输出文件目录：-----------"+path);
        String studentResourcePath = new File(path, "/StNjReport3.txt").getAbsolutePath();
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
