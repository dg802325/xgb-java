package com.xgb.service;

import com.xgb.common.Utils;
import com.xgb.model.MfNianjianJbxx;

import java.io.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class SaveMfNianjianJbxxService {

    public static StringBuffer saveEntity(StringBuffer buffer , List<MfNianjianJbxx> contents){
        for(MfNianjianJbxx content:contents){

        Long id = content.getId ();//ID
        String instanceid = content.getInstanceid ();//INSTANCEID
        String organizationid = content.getOrganizationid ();//ORGANIZATIONID
        Short status = content.getStatus ();//STATUS
        String mingcheng = content.getMingcheng ();//名称
        String dengjizhenghao = content.getDengjizhenghao ();//登记证号
        String zuzhijigoudaima = content.getZuzhijigoudaima ();//组织机构代码
        String zhiyexukezhenghao = content.getZhiyexukezhenghao ();//执业许可证号
        Date chenglishijian = content.getChenglishijian ();//成立时间
        BigDecimal kaibanzijin = content.getKaibanzijin ();//开办资金
        String zhusuo = content.getZhusuo ();//住所
        String zhusuoxiangxi = content.getZhusuoxiangxi ();//住所详细
        String youzhengbianma = content.getYouzhengbianma ();//邮政编码
        String zhusuolaiyuan = content.getZhusuolaiyuan ();//住所来源
        Date zulindaoqiri = content.getZulindaoqiri ();//租赁到期日
        String lianxidianhua = content.getLianxidianhua ();//联系电话
        String shoujidianhua = content.getShoujidianhua ();//手机电话
        String chuanzhen = content.getChuanzhen ();//传真
        String wangzhandizhi = content.getWangzhandizhi ();//网站地址
        String dianziyouxiang = content.getDianziyouxiang ();//电子邮箱
        String fadingdaibiaoren = content.getFadingdaibiaoren ();//法定代表人
        String farenzhiwu = content.getFarenzhiwu ();//法人职务
        String chuzizheyi = content.getChuzizheyi ();//出资者一
        BigDecimal jineyi = content.getJineyi ();//金额一
        String chuzizheer = content.getChuzizheer ();//出资者二
        BigDecimal jineer = content.getJineer ();//金额二
        String chuzizhesan = content.getChuzizhesan ();//出资者三
        BigDecimal jinesan = content.getJinesan ();//金额三
        String chuzizhesi = content.getChuzizhesi ();//出资者四
        BigDecimal jinesi = content.getJinesi ();//金额四
        String chuzizhewu = content.getChuzizhewu ();//出资者五
        BigDecimal jinewu = content.getJinewu ();//金额五
        String dongshichangxingming = content.getDongshichangxingming ();//董事长姓名
        Integer dongshirenshu = content.getDongshirenshu ();//董事人数
        Integer jianshirenshu = content.getJianshirenshu ();//监事人数
        Integer gongzuorenyuanzongshu = content.getGongzuorenyuanzongshu ();//工作人员总数
        Integer zhuanzhirenyuanshu = content.getZhuanzhirenyuanshu ();//专职人员数
        Integer jianzhirenyuanshu = content.getJianzhirenyuanshu ();//兼职人员数
        Integer lifanpinrenshu = content.getLifanpinrenshu ();//离返聘人数
        Integer zhiyuanzheshu = content.getZhiyuanzheshu ();//志愿者数
        Integer zhiyuanlaodongshijian = content.getZhiyuanlaodongshijian ();//志愿劳动时间
        Integer dangyuanrenshu = content.getDangyuanrenshu ();//党员人数
        String dangjianqingkuang = content.getDangjianqingkuang ();//党建情况
        Integer neishejigoushu = content.getNeishejigoushu ();//内设机构数
        Integer gongkaikanwushu = content.getGongkaikanwushu ();//公开刊物数
        Integer neibuziliaoshu = content.getNeibuziliaoshu ();//内部资料数
        String yewuzhuguandanwei = content.getYewuzhuguandanwei ();//业务主管单位
        String dianhua = content.getDianhua ();//电话
        String danweixingzhi = content.getDanweixingzhi ();//单位性质
        String yewufanwei = content.getYewufanwei ();//业务范围
        String xingyefenlei = content.getXingyefenlei ();//行业分类
        String farenxingbie = content.getFarenxingbie ();//null
        Date farenshengri = content.getFarenshengri ();//null
        String farenmianmao = content.getFarenmianmao ();//null
        String farenxueli = content.getFarenxueli ();//null
        String dongshichangxingbie = content.getDongshichangxingbie ();//null
        Date dongshichangshengri = content.getDongshichangshengri ();//null
        String dongshichangmianmao = content.getDongshichangmianmao ();//null
        String dongshichangxueli = content.getDongshichangxueli ();//null
        String dongshichangzhuanzhi = content.getDongshichangzhuanzhi ();//null
        String dongshichangdanwei = content.getDongshichangdanwei ();//null
        String dongshichangdianhua = content.getDongshichangdianhua ();//null
        String dongshichangshouji = content.getDongshichangshouji ();//null
        String fuzerenxingming = content.getFuzerenxingming ();//null
        String fuzerenxingbie = content.getFuzerenxingbie ();//null
        Date fuzerenshengri = content.getFuzerenshengri ();//null
        String fuzerenmianmao = content.getFuzerenmianmao ();//null
        String fuzerenxueli = content.getFuzerenxueli ();//null
        String fuzerenzhuanzhi = content.getFuzerenzhuanzhi ();//null
        String fuzerendianhua = content.getFuzerendianhua ();//null
        String fuzerenchuanzhen = content.getFuzerenchuanzhen ();//null
        String fuzerenshouji = content.getFuzerenshouji ();//null
        Integer lituixiuzongshu = content.getLituixiuzongshu ();//null
        Integer lishengbuji = content.getLishengbuji ();//null
        Integer lilaoling = content.getLilaoling ();//null
        Integer quantinianling = content.getQuantinianling ();//null
        Integer quantinvxing = content.getQuantinvxing ();//null
        Integer quantibenke = content.getQuantibenke ();//null
        Integer quantidangyuan = content.getQuantidangyuan ();//null
        Integer zhuanzhinianling = content.getZhuanzhinianling ();//null
        Integer zhuanzhinvxing = content.getZhuanzhinvxing ();//null
        Integer zhuanzhibenke = content.getZhuanzhibenke ();//null
        Integer zhuanzhidangyuan = content.getZhuanzhidangyuan ();//null
        Integer laodongshijian = content.getLaodongshijian ();//null
        Integer huodongcishu = content.getHuodongcishu ();//null
        Integer jubancishu = content.getJubancishu ();//null
        BigDecimal gongyizhichu = content.getGongyizhichu ();//null
        Integer xiangmu = content.getXiangmu ();//null
        Integer huiyi = content.getHuiyi ();//null
        Integer zuzhi = content.getZuzhi ();//null
        Integer fangwen = content.getFangwen ();//null
        Integer biaozhanghuodong = content.getBiaozhanghuodong ();//null
        String shouhuifei = content.getShouhuifei ();//null
        String heshubangong = content.getHeshubangong ();//null
        String lishidanweizhiwu = content.getLishidanweizhiwu ();//null
        String tjnjjieguo1 = content.getTjnjjieguo1 ();//天津年检结果1
        String tjnjjieguo2 = content.getTjnjjieguo2 ();//天津年检结果2
        String tjnjyijian1 = content.getTjnjyijian1 ();//天津审核意见1
        String tjnjyijian2 = content.getTjnjyijian2 ();//天津审核意见2
        String tjnjxingming1 = content.getTjnjxingming1 ();//天津审核姓名1
        String tjnjxingming2 = content.getTjnjxingming2 ();//天津审核姓名2
        Date tjnjshijian1 = content.getTjnjshijian1 ();//天津审批时间1
        Date tjnjshijian2 = content.getTjnjshijian2 ();//天津审批时间2
        Integer lingqubaochou = content.getLingqubaochou ();//null
        Integer gongwuyuanzaizhi = content.getGongwuyuanzaizhi ();//null
        Integer zaizhijuji = content.getZaizhijuji ();//null
        Integer zaizhichuji = content.getZaizhichuji ();//null
        Integer gongwuyuanlituixiu = content.getGongwuyuanlituixiu ();//null
        Integer lituixiujuji = content.getLituixiujuji ();//null
        Integer lituixiuchuji = content.getLituixiuchuji ();//null
        BigDecimal mujizijinshu = content.getMujizijinshu ();//null
        Integer xinarenshu = content.getXinarenshu ();//null
        Integer zhengxiedaibiaoshu = content.getZhengxiedaibiaoshu ();//null
        Integer tigongjianyishu = content.getTigongjianyishu ();//提供建议数
        Integer zengjiajiuyeshu = content.getZengjiajiuyeshu ();//增加就业数
        Integer fuwurenci = content.getFuwurenci ();//服务人次
        Integer zipingfenshu = content.getZipingfenshu ();//自评分数
        String zipingdengji = content.getZipingdengji ();//自评等级
        String paiqianzhidao = content.getPaiqianzhidao ();//是否派遣
        String gongzuoqingkuang = content.getGongzuoqingkuang ();//工作情况
        String qitazuzhi = content.getQitazuzhi ();//其他组织

        buffer.append(id+"|");
        buffer.append(instanceid+"|");
        buffer.append(organizationid+"|");
        buffer.append(status+"|");
        buffer.append(mingcheng+"|");
        buffer.append(dengjizhenghao+"|");
        buffer.append(zuzhijigoudaima+"|");
        buffer.append(zhiyexukezhenghao+"|");
        buffer.append(chenglishijian+"|");
        buffer.append(kaibanzijin+"|");
        buffer.append(zhusuo+"|");
        buffer.append(zhusuoxiangxi+"|");
        buffer.append(youzhengbianma+"|");
        buffer.append(zhusuolaiyuan+"|");
        buffer.append(zulindaoqiri+"|");
        buffer.append(lianxidianhua+"|");
        buffer.append(shoujidianhua+"|");
        buffer.append(chuanzhen+"|");
        buffer.append(wangzhandizhi+"|");
        buffer.append(dianziyouxiang+"|");
        buffer.append(fadingdaibiaoren+"|");
        buffer.append(farenzhiwu+"|");
        buffer.append(chuzizheyi+"|");
        buffer.append(jineyi+"|");
        buffer.append(chuzizheer+"|");
        buffer.append(jineer+"|");
        buffer.append(chuzizhesan+"|");
        buffer.append(jinesan+"|");
        buffer.append(chuzizhesi+"|");
        buffer.append(jinesi+"|");
        buffer.append(chuzizhewu+"|");
        buffer.append(jinewu+"|");
        buffer.append(dongshichangxingming+"|");
        buffer.append(dongshirenshu+"|");
        buffer.append(jianshirenshu+"|");
        buffer.append(gongzuorenyuanzongshu+"|");
        buffer.append(zhuanzhirenyuanshu+"|");
        buffer.append(jianzhirenyuanshu+"|");
        buffer.append(lifanpinrenshu+"|");
        buffer.append(zhiyuanzheshu+"|");
        buffer.append(zhiyuanlaodongshijian+"|");
        buffer.append(dangyuanrenshu+"|");
        buffer.append(dangjianqingkuang+"|");
        buffer.append(neishejigoushu+"|");
        buffer.append(gongkaikanwushu+"|");
        buffer.append(neibuziliaoshu+"|");
        buffer.append(yewuzhuguandanwei+"|");
        buffer.append(dianhua+"|");
        buffer.append(danweixingzhi+"|");
        buffer.append(yewufanwei+"|");
        buffer.append(xingyefenlei+"|");
        buffer.append(farenxingbie+"|");
        buffer.append(farenshengri+"|");
        buffer.append(farenmianmao+"|");
        buffer.append(farenxueli+"|");
        buffer.append(dongshichangxingbie+"|");
        buffer.append(dongshichangshengri+"|");
        buffer.append(dongshichangmianmao+"|");
        buffer.append(dongshichangxueli+"|");
        buffer.append(dongshichangzhuanzhi+"|");
        buffer.append(dongshichangdanwei+"|");
        buffer.append(dongshichangdianhua+"|");
        buffer.append(dongshichangshouji+"|");
        buffer.append(fuzerenxingming+"|");
        buffer.append(fuzerenxingbie+"|");
        buffer.append(fuzerenshengri+"|");
        buffer.append(fuzerenmianmao+"|");
        buffer.append(fuzerenxueli+"|");
        buffer.append(fuzerenzhuanzhi+"|");
        buffer.append(fuzerendianhua+"|");
        buffer.append(fuzerenchuanzhen+"|");
        buffer.append(fuzerenshouji+"|");
        buffer.append(lituixiuzongshu+"|");
        buffer.append(lishengbuji+"|");
        buffer.append(lilaoling+"|");
        buffer.append(quantinianling+"|");
        buffer.append(quantinvxing+"|");
        buffer.append(quantibenke+"|");
        buffer.append(quantidangyuan+"|");
        buffer.append(zhuanzhinianling+"|");
        buffer.append(zhuanzhinvxing+"|");
        buffer.append(zhuanzhibenke+"|");
        buffer.append(zhuanzhidangyuan+"|");
        buffer.append(laodongshijian+"|");
        buffer.append(huodongcishu+"|");
        buffer.append(jubancishu+"|");
        buffer.append(gongyizhichu+"|");
        buffer.append(xiangmu+"|");
        buffer.append(huiyi+"|");
        buffer.append(zuzhi+"|");
        buffer.append(fangwen+"|");
        buffer.append(biaozhanghuodong+"|");
        buffer.append(shouhuifei+"|");
        buffer.append(heshubangong+"|");
        buffer.append(lishidanweizhiwu+"|");
        buffer.append(tjnjjieguo1+"|");
        buffer.append(tjnjjieguo2+"|");
        buffer.append(tjnjyijian1+"|");
        buffer.append(tjnjyijian2+"|");
        buffer.append(tjnjxingming1+"|");
        buffer.append(tjnjxingming2+"|");
        buffer.append(tjnjshijian1+"|");
        buffer.append(tjnjshijian2+"|");
        buffer.append(lingqubaochou+"|");
        buffer.append(gongwuyuanzaizhi+"|");
        buffer.append(zaizhijuji+"|");
        buffer.append(zaizhichuji+"|");
        buffer.append(gongwuyuanlituixiu+"|");
        buffer.append(lituixiujuji+"|");
        buffer.append(lituixiuchuji+"|");
        buffer.append(mujizijinshu+"|");
        buffer.append(xinarenshu+"|");
        buffer.append(zhengxiedaibiaoshu+"|");
        buffer.append(tigongjianyishu+"|");
        buffer.append(zengjiajiuyeshu+"|");
        buffer.append(fuwurenci+"|");
        buffer.append(zipingfenshu+"|");
        buffer.append(zipingdengji+"|");
        buffer.append(paiqianzhidao+"|");
        buffer.append(gongzuoqingkuang+"|");
        buffer.append(qitazuzhi+"|");

        buffer.append("\n");
        }
        return buffer;
    }

    public static void writeToRestource(StringBuffer buffer){
        String path= Utils.getResourceBasePath()+"/xgb-data/data-api/config";
        System.out.println("输出文件目录：-----------"+path);
        String studentResourcePath = new File(path, "/MfNianjianJbxx.txt").getAbsolutePath();
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
