package com.xgb.service;

import com.xgb.common.Utils;
import com.xgb.model.StNjInner4;

import java.io.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class SaveStNjInner4Service {

    public static StringBuffer saveEntity(StringBuffer buffer , List<StNjInner4> contents){
        for(StNjInner4 content:contents){

        Integer id = content.getId ();//ID
        String instanceid = content.getInstanceid ();//INSTANCEID
        String organizationid = content.getOrganizationid ();//ORGANIZATIONID
        Integer status = content.getStatus ();//STATUS
        String biangengmingcheng = content.getBiangengmingcheng ();//变更名称
        String biangengmingchengbanli = content.getBiangengmingchengbanli ();//变更名称办理情况
        Date biangengmingchengshijian = content.getBiangengmingchengshijian ();//变更名称批准时间
        String biangengdiyu = content.getBiangengdiyu ();//变更活动地域
        String biangengdiyubanli = content.getBiangengdiyubanli ();//变更活动地域办理情况
        Date biangengdiyushijian = content.getBiangengdiyushijian ();//变更活动地域批准时间
        String biangengyewu = content.getBiangengyewu ();//变更业务范围
        String biangengyewubanli = content.getBiangengyewubanli ();//变更业务范围办理情况
        Date biangengyewushijian = content.getBiangengyewushijian ();//变更业务范围批准时间
        String biangengzhusuo = content.getBiangengzhusuo ();//变更住所
        String biangengzhusuobanli = content.getBiangengzhusuobanli ();//变更住所办理
        Date biangengzhusuoshijian = content.getBiangengzhusuoshijian ();//变更住所时间
        String biangengzijin = content.getBiangengzijin ();//变更资金
        String biangengzijinbanli = content.getBiangengzijinbanli ();//变更资金办理
        Date biangengzijinshijian = content.getBiangengzijinshijian ();//变更资金时间
        String biangengfaren = content.getBiangengfaren ();//变更法人
        String biangengfarenbanli = content.getBiangengfarenbanli ();//变更法人办理
        Date biangengfarenshijian = content.getBiangengfarenshijian ();//变更法人时间
        String biangengzhuguandanwei = content.getBiangengzhuguandanwei ();//变更主管单位
        String bianzhuguandanweibanli = content.getBianzhuguandanweibanli ();//变主管单位办理
        Date bianzhuguandanweishijian = content.getBianzhuguandanweishijian ();//变主管单位时间
        String xiugaizhangcheng = content.getXiugaizhangcheng ();//修改章程
        String xiugaizhangchengbanli = content.getXiugaizhangchengbanli ();//修改章程办理
        Date xiugaizhangchengshijian = content.getXiugaizhangchengshijian ();//修改章程时间
        String fuzerenbiangeng = content.getFuzerenbiangeng ();//负责人变更
        String fuzerenbiangengbanli = content.getFuzerenbiangengbanli ();//负责人变更办理
        Date fuzerenbianshijian = content.getFuzerenbianshijian ();//负责人变时间
        Integer huiyuandahuinianjie = content.getHuiyuandahuinianjie ();//会员大会年届
        Date huanjiedahuishijian = content.getHuanjiedahuishijian ();//换届大会时间
        Integer huiyuandahuinianci = content.getHuiyuandahuinianci ();//会员大会年次
        Date huiyuandahuishijian = content.getHuiyuandahuishijian ();//会员大会时间
        String lishihuinian = content.getLishihuinian ();//理事会年
        Integer lishihuici = content.getLishihuici ();//理事会次
        Integer lishihuibennianci = content.getLishihuibennianci ();//理事会本年次
        String changlishihuinian = content.getChanglishihuinian ();//常理事会年
        Integer changlishihuici = content.getChanglishihuici ();//常理事会次
        Integer changlishihuibennianci = content.getChanglishihuibennianci ();//常理事会本年次
        String jigouzhidu = content.getJigouzhidu ();//机构制度
        String zhengshuzhidu = content.getZhengshuzhidu ();//证书制度
        String yinzhangzhidu = content.getYinzhangzhidu ();//印章制度
        String renshizhidu = content.getRenshizhidu ();//人事制度
        Integer hetongrenshu = content.getHetongrenshu ();//合同人数
        Integer shiyebaoxian = content.getShiyebaoxian ();//失业保险
        Integer yanglaobaoxian = content.getYanglaobaoxian ();//养老保险
        Integer yiliaobaoxian = content.getYiliaobaoxian ();//医疗保险
        Integer gongshangbaoxian = content.getGongshangbaoxian ();//工伤保险
        Integer shengyubaoxian = content.getShengyubaoxian ();//生育保险
        String kaihuyinxing = content.getKaihuyinxing ();//人民币开户银行
        String yinxingzhanghao = content.getYinxingzhanghao ();//人民币银行账号
        String waibikaihuyinxing = content.getWaibikaihuyinxing ();//外币开户银行
        String waibiyinxingzhanghao = content.getWaibiyinxingzhanghao ();//外币银行账号
        String caizhengdengji = content.getCaizhengdengji ();//财政登记
        Integer caihuirenyuanshu = content.getCaihuirenyuanshu ();//财会人员数
        Integer zhiyezigerenshu = content.getZhiyezigerenshu ();//执业资格人数
        String piaojuzhongleiqita = content.getPiaojuzhongleiqita ();//票据种类其他
        String caiwuruanjian = content.getCaiwuruanjian ();//财务软件
        String zhengshubaoguandi = content.getZhengshubaoguandi ();//证书保管地
        String yinzhangbaoguandi = content.getYinzhangbaoguandi ();//印章保管地
        String guoshui = content.getGuoshui ();//国税
        String dishui = content.getDishui ();//地税
        String weidengji = content.getWeidengji ();//未登记
        String yinqianshouju = content.getYinqianshouju ();//银钱收据
        String huifeishouju = content.getHuifeishouju ();//会费收据
        String juanzengshouju = content.getJuanzengshouju ();//捐赠收据
        String shuiwufapiao = content.getShuiwufapiao ();//税务发票
        String qitapiaoju = content.getQitapiaoju ();//其他票据
        String niandu = content.getNiandu ();//年度
        String bgzongzhi = content.getBgzongzhi ();//变更宗旨
        String bgzongzhibanli = content.getBgzongzhibanli ();//变更宗旨办理情况
        Date bgzongzhishijian = content.getBgzongzhishijian ();//变更宗旨批准时间
        String bgfenzhimingcheng = content.getBgfenzhimingcheng ();//变更分支名称
        String bgfenzhimingchengbanli = content.getBgfenzhimingchengbanli ();//变更分支名称办理情况
        Date bgfenzhimingchengshijian = content.getBgfenzhimingchengshijian ();//变更分支名称批准时间
        String bgfenzhiyewufanwei = content.getBgfenzhiyewufanwei ();//变更分支业务范围
        String bgfenzhiyewubanli = content.getBgfenzhiyewubanli ();//变更分支业务范围办理情况
        Date bgfenzhiyewushijian = content.getBgfenzhiyewushijian ();//变更分支业务范围批准时间
        String bgfenzhifuzeren = content.getBgfenzhifuzeren ();//变更分支负责人
        String bgfenzhifuzerenbanli = content.getBgfenzhifuzerenbanli ();//变更分支负责人办理
        Date bgfenzhifuzerenshijian = content.getBgfenzhifuzerenshijian ();//变更分支负责人时间
        String bgfenzhizhusuo = content.getBgfenzhizhusuo ();//变更分支住所
        String bgfenzhizhusuobanli = content.getBgfenzhizhusuobanli ();//变更分支住所办理
        Date bgfenzhizhusuoshijian = content.getBgfenzhizhusuoshijian ();//变更分支住所时间
        String xingmingyi = content.getXingmingyi ();//姓名一
        String gangweiyi = content.getGangweiyi ();//岗位一
        String kuaijizhengyi = content.getKuaijizhengyi ();//会计证一
        String jishuzigeyi = content.getJishuzigeyi ();//专业技术资格一
        String xingminger = content.getXingminger ();//姓名二
        String gangweier = content.getGangweier ();//岗位二
        String kuaijizhenger = content.getKuaijizhenger ();//会计证二
        String jishuzigeer = content.getJishuzigeer ();//专业技术资格二
        String xingmingsan = content.getXingmingsan ();//姓名三
        String gangweisan = content.getGangweisan ();//岗位三
        String kuaijizhengsan = content.getKuaijizhengsan ();//会计证三
        String jishuzigesan = content.getJishuzigesan ();//专业技术资格三
        String xingmingsi = content.getXingmingsi ();//姓名四
        String gangweisi = content.getGangweisi ();//岗位四
        String kuaijizhengsi = content.getKuaijizhengsi ();//会计证四
        String jishuzigesi = content.getJishuzigesi ();//专业技术资格四
        Integer gongjijin = content.getGongjijin ();//公积金
        Integer zhuanzhigongzi = content.getZhuanzhigongzi ();//专职工作人员平均工资
        String zhaokaishijian = content.getZhaokaishijian ();//null
        String biangengmingcheng2 = content.getBiangengmingcheng2 ();//2
        String biangengdiyu2 = content.getBiangengdiyu2 ();//2
        String biangengyewu2 = content.getBiangengyewu2 ();//2
        String biangengzhusuo2 = content.getBiangengzhusuo2 ();//2
        String biangengzijin2 = content.getBiangengzijin2 ();//2
        String biangengfaren2 = content.getBiangengfaren2 ();//2
        String bianzhuguandanwei2 = content.getBianzhuguandanwei2 ();//2
        String fuzerenbiangeng2 = content.getFuzerenbiangeng2 ();//2
        String xiugaizhangcheng2 = content.getXiugaizhangcheng2 ();//2
        String danganzhidu = content.getDanganzhidu ();//null
        String danganbaoguandi = content.getDanganbaoguandi ();//null
        String xinchouguanlizhidu = content.getXinchouguanlizhidu ();//null
        String xinchouguanlizhidu2 = content.getXinchouguanlizhidu2 ();//2
        String jiangchengzhidu = content.getJiangchengzhidu ();//null
        String yewupeixunzhidu = content.getYewupeixunzhidu ();//null
        String caiwuguanlizhidu = content.getCaiwuguanlizhidu ();//null
        String guziguanlizhidu = content.getGuziguanlizhidu ();//null
        String zhixingkuaijizhidu = content.getZhixingkuaijizhidu ();//null
        String qitapiaoju2 = content.getQitapiaoju2 ();//2
        String piaojuzhongleiqita2 = content.getPiaojuzhongleiqita2 ();//2
        String zhongyangdanwei = content.getZhongyangdanwei ();//null
        String fafangjiguan1 = content.getFafangjiguan1 ();//1
        String fafangjiguan2 = content.getFafangjiguan2 ();//2
        String fafangjiguan3 = content.getFafangjiguan3 ();//3
        String fafangjiguan4 = content.getFafangjiguan4 ();//4
        String fafangjiguan5 = content.getFafangjiguan5 ();//5
        String fafangjiguan6 = content.getFafangjiguan6 ();//6
        String fafangjiguan7 = content.getFafangjiguan7 ();//7
        String renminbikaihumingcheng = content.getRenminbikaihumingcheng ();//null
        String waibikaihumingcheng = content.getWaibikaihumingcheng ();//null
        String caiwuhesuanshifouduli = content.getCaiwuhesuanshifouduli ();//null
        String tjnjjieguo1 = content.getTjnjjieguo1 ();//天津年检结果1
        String tjnjjieguo2 = content.getTjnjjieguo2 ();//天津年检结果2
        String tjnjyijian1 = content.getTjnjyijian1 ();//天津审核意见1
        String tjnjyijian2 = content.getTjnjyijian2 ();//天津审核意见2
        String tjnjxingming1 = content.getTjnjxingming1 ();//天津审核姓名1
        String tjnjxingming2 = content.getTjnjxingming2 ();//天津审核姓名2
        Date tjnjshijian1 = content.getTjnjshijian1 ();//天津审批时间1
        Date tjnjshijian2 = content.getTjnjshijian2 ();//天津审批时间2
        String qitazhidu = content.getQitazhidu ();//null
        String biangenglishijianshi = content.getBiangenglishijianshi ();//null
        String biangenglishibanli = content.getBiangenglishibanli ();//null
        Date biangenglishishijian = content.getBiangenglishishijian ();//null
        Integer zhuanzhigongzuorenshu = content.getZhuanzhigongzuorenshu ();//null
        String shifougongkai = content.getShifougongkai ();//是否公开
        String guanfangwangzhan1 = content.getGuanfangwangzhan1 ();//官方网站1
        String weixinpingtai1 = content.getWeixinpingtai1 ();//微信平台1
        String weibo1 = content.getWeibo1 ();//微博1
        String zazhiqikan1 = content.getZazhiqikan1 ();//杂志期刊1
        String qitafangshi1 = content.getQitafangshi1 ();//其他方式1
        String guanfangwangzhan2 = content.getGuanfangwangzhan2 ();//官方网站2
        String weixinpingtai2 = content.getWeixinpingtai2 ();//微信平台2
        String weibo2 = content.getWeibo2 ();//微博2
        String zazhiqikan2 = content.getZazhiqikan2 ();//杂志期刊2
        String huiyuandahui = content.getHuiyuandahui ();//会员大会
        String gongzuoqqqun = content.getGongzuoqqqun ();//工作QQ群
        String duanxinpingtai = content.getDuanxinpingtai ();//短信平台
        String qitafangshi2 = content.getQitafangshi2 ();//其他方式2
        String qitafangshi22 = content.getQitafangshi22 ();//其他方式22
        String qitafangshi11 = content.getQitafangshi11 ();//其他方式11

        buffer.append(id+"|");
        buffer.append(instanceid+"|");
        buffer.append(organizationid+"|");
        buffer.append(status+"|");
        buffer.append(biangengmingcheng+"|");
        buffer.append(biangengmingchengbanli+"|");
        buffer.append(biangengmingchengshijian+"|");
        buffer.append(biangengdiyu+"|");
        buffer.append(biangengdiyubanli+"|");
        buffer.append(biangengdiyushijian+"|");
        buffer.append(biangengyewu+"|");
        buffer.append(biangengyewubanli+"|");
        buffer.append(biangengyewushijian+"|");
        buffer.append(biangengzhusuo+"|");
        buffer.append(biangengzhusuobanli+"|");
        buffer.append(biangengzhusuoshijian+"|");
        buffer.append(biangengzijin+"|");
        buffer.append(biangengzijinbanli+"|");
        buffer.append(biangengzijinshijian+"|");
        buffer.append(biangengfaren+"|");
        buffer.append(biangengfarenbanli+"|");
        buffer.append(biangengfarenshijian+"|");
        buffer.append(biangengzhuguandanwei+"|");
        buffer.append(bianzhuguandanweibanli+"|");
        buffer.append(bianzhuguandanweishijian+"|");
        buffer.append(xiugaizhangcheng+"|");
        buffer.append(xiugaizhangchengbanli+"|");
        buffer.append(xiugaizhangchengshijian+"|");
        buffer.append(fuzerenbiangeng+"|");
        buffer.append(fuzerenbiangengbanli+"|");
        buffer.append(fuzerenbianshijian+"|");
        buffer.append(huiyuandahuinianjie+"|");
        buffer.append(huanjiedahuishijian+"|");
        buffer.append(huiyuandahuinianci+"|");
        buffer.append(huiyuandahuishijian+"|");
        buffer.append(lishihuinian+"|");
        buffer.append(lishihuici+"|");
        buffer.append(lishihuibennianci+"|");
        buffer.append(changlishihuinian+"|");
        buffer.append(changlishihuici+"|");
        buffer.append(changlishihuibennianci+"|");
        buffer.append(jigouzhidu+"|");
        buffer.append(zhengshuzhidu+"|");
        buffer.append(yinzhangzhidu+"|");
        buffer.append(renshizhidu+"|");
        buffer.append(hetongrenshu+"|");
        buffer.append(shiyebaoxian+"|");
        buffer.append(yanglaobaoxian+"|");
        buffer.append(yiliaobaoxian+"|");
        buffer.append(gongshangbaoxian+"|");
        buffer.append(shengyubaoxian+"|");
        buffer.append(kaihuyinxing+"|");
        buffer.append(yinxingzhanghao+"|");
        buffer.append(waibikaihuyinxing+"|");
        buffer.append(waibiyinxingzhanghao+"|");
        buffer.append(caizhengdengji+"|");
        buffer.append(caihuirenyuanshu+"|");
        buffer.append(zhiyezigerenshu+"|");
        buffer.append(piaojuzhongleiqita+"|");
        buffer.append(caiwuruanjian+"|");
        buffer.append(zhengshubaoguandi+"|");
        buffer.append(yinzhangbaoguandi+"|");
        buffer.append(guoshui+"|");
        buffer.append(dishui+"|");
        buffer.append(weidengji+"|");
        buffer.append(yinqianshouju+"|");
        buffer.append(huifeishouju+"|");
        buffer.append(juanzengshouju+"|");
        buffer.append(shuiwufapiao+"|");
        buffer.append(qitapiaoju+"|");
        buffer.append(niandu+"|");
        buffer.append(bgzongzhi+"|");
        buffer.append(bgzongzhibanli+"|");
        buffer.append(bgzongzhishijian+"|");
        buffer.append(bgfenzhimingcheng+"|");
        buffer.append(bgfenzhimingchengbanli+"|");
        buffer.append(bgfenzhimingchengshijian+"|");
        buffer.append(bgfenzhiyewufanwei+"|");
        buffer.append(bgfenzhiyewubanli+"|");
        buffer.append(bgfenzhiyewushijian+"|");
        buffer.append(bgfenzhifuzeren+"|");
        buffer.append(bgfenzhifuzerenbanli+"|");
        buffer.append(bgfenzhifuzerenshijian+"|");
        buffer.append(bgfenzhizhusuo+"|");
        buffer.append(bgfenzhizhusuobanli+"|");
        buffer.append(bgfenzhizhusuoshijian+"|");
        buffer.append(xingmingyi+"|");
        buffer.append(gangweiyi+"|");
        buffer.append(kuaijizhengyi+"|");
        buffer.append(jishuzigeyi+"|");
        buffer.append(xingminger+"|");
        buffer.append(gangweier+"|");
        buffer.append(kuaijizhenger+"|");
        buffer.append(jishuzigeer+"|");
        buffer.append(xingmingsan+"|");
        buffer.append(gangweisan+"|");
        buffer.append(kuaijizhengsan+"|");
        buffer.append(jishuzigesan+"|");
        buffer.append(xingmingsi+"|");
        buffer.append(gangweisi+"|");
        buffer.append(kuaijizhengsi+"|");
        buffer.append(jishuzigesi+"|");
        buffer.append(gongjijin+"|");
        buffer.append(zhuanzhigongzi+"|");
        buffer.append(zhaokaishijian+"|");
        buffer.append(biangengmingcheng2+"|");
        buffer.append(biangengdiyu2+"|");
        buffer.append(biangengyewu2+"|");
        buffer.append(biangengzhusuo2+"|");
        buffer.append(biangengzijin2+"|");
        buffer.append(biangengfaren2+"|");
        buffer.append(bianzhuguandanwei2+"|");
        buffer.append(fuzerenbiangeng2+"|");
        buffer.append(xiugaizhangcheng2+"|");
        buffer.append(danganzhidu+"|");
        buffer.append(danganbaoguandi+"|");
        buffer.append(xinchouguanlizhidu+"|");
        buffer.append(xinchouguanlizhidu2+"|");
        buffer.append(jiangchengzhidu+"|");
        buffer.append(yewupeixunzhidu+"|");
        buffer.append(caiwuguanlizhidu+"|");
        buffer.append(guziguanlizhidu+"|");
        buffer.append(zhixingkuaijizhidu+"|");
        buffer.append(qitapiaoju2+"|");
        buffer.append(piaojuzhongleiqita2+"|");
        buffer.append(zhongyangdanwei+"|");
        buffer.append(fafangjiguan1+"|");
        buffer.append(fafangjiguan2+"|");
        buffer.append(fafangjiguan3+"|");
        buffer.append(fafangjiguan4+"|");
        buffer.append(fafangjiguan5+"|");
        buffer.append(fafangjiguan6+"|");
        buffer.append(fafangjiguan7+"|");
        buffer.append(renminbikaihumingcheng+"|");
        buffer.append(waibikaihumingcheng+"|");
        buffer.append(caiwuhesuanshifouduli+"|");
        buffer.append(tjnjjieguo1+"|");
        buffer.append(tjnjjieguo2+"|");
        buffer.append(tjnjyijian1+"|");
        buffer.append(tjnjyijian2+"|");
        buffer.append(tjnjxingming1+"|");
        buffer.append(tjnjxingming2+"|");
        buffer.append(tjnjshijian1+"|");
        buffer.append(tjnjshijian2+"|");
        buffer.append(qitazhidu+"|");
        buffer.append(biangenglishijianshi+"|");
        buffer.append(biangenglishibanli+"|");
        buffer.append(biangenglishishijian+"|");
        buffer.append(zhuanzhigongzuorenshu+"|");
        buffer.append(shifougongkai+"|");
        buffer.append(guanfangwangzhan1+"|");
        buffer.append(weixinpingtai1+"|");
        buffer.append(weibo1+"|");
        buffer.append(zazhiqikan1+"|");
        buffer.append(qitafangshi1+"|");
        buffer.append(guanfangwangzhan2+"|");
        buffer.append(weixinpingtai2+"|");
        buffer.append(weibo2+"|");
        buffer.append(zazhiqikan2+"|");
        buffer.append(huiyuandahui+"|");
        buffer.append(gongzuoqqqun+"|");
        buffer.append(duanxinpingtai+"|");
        buffer.append(qitafangshi2+"|");
        buffer.append(qitafangshi22+"|");
        buffer.append(qitafangshi11+"|");

        buffer.append("\n");
        }
        return buffer;
    }

    public static void writeToRestource(StringBuffer buffer){
        String path= Utils.getResourceBasePath()+"/xgb-data/data-api/config";
        System.out.println("输出文件目录：-----------"+path);
        String studentResourcePath = new File(path, "/StNjInner4.txt").getAbsolutePath();
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
