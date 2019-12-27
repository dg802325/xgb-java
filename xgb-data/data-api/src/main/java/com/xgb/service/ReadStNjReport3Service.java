package com.xgb.service;

import com.xgb.common.Utils;
import com.xgb.model.StNjReport3;
import com.xgb.util.DateUtils;
import com.xgb.util.MyTools;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ReadStNjReport3Service {

    public static void main(String[] args) {
        String path = Utils.getResourceBasePath() + "/xgb-data/data-api/config/content.txt";
        File file = new File(path);
        //判断文件存在并且是文件
        Boolean boo = file.exists() && file.isFile();
        if (boo) {
            BufferedReader bufferedReader = null;
            try {
                //构造一个BufferedReader类来读取文件
                bufferedReader = new BufferedReader(new FileReader(file));
                String linetxt = null;
                //result用来存储文件内容
                StringBuilder result = new StringBuilder();
                //按使用readLine方法，一次读一行
                while ((linetxt = bufferedReader.readLine()) != null) {
                    result.append(linetxt);
                }
                //输出读出的所有数据（StringBuilder类型）
                System.out.println(result);
                analysis(result.toString());
            } catch (Exception e) {
                System.out.println("读取文件内容出错");
                e.printStackTrace();
            } finally {
                try {
                    bufferedReader.close();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        }
    }

    public static List<StNjReport3> getContent(){
        List<StNjReport3> lists = new ArrayList<StNjReport3>();
        String path = Utils.getResourceBasePath() + "/xgb-data/data-api/config/StNjReport3.txt";
        File file = new File(path);
        //判断文件存在并且是文件
        Boolean boo = file.exists() && file.isFile();
        if (boo) {
            BufferedReader bufferedReader = null;
            try {
                //构造一个BufferedReader类来读取文件
                bufferedReader = new BufferedReader(new FileReader(file));
                String linetxt = null;
                //result用来存储文件内容
                StringBuilder result = new StringBuilder();
                //按使用readLine方法，一次读一行
                while ((linetxt = bufferedReader.readLine()) != null) {
                    result.append(linetxt);
                }
                //输出读出的所有数据（StringBuilder类型）
                StNjReport3 analysis = analysis(result.toString());
                //数据解析成对象添加到列表
                lists.add(analysis);
            } catch (Exception e) {
                System.out.println("读取文件内容出错");
                e.printStackTrace();
            } finally {
                try {
                    bufferedReader.close();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        }
        return lists;
    }

    public static StNjReport3 analysis(String result){
        String[] split = result.split("\\|");
        StNjReport3 fcc = new StNjReport3();
        if(MyTools.isNotEmpty(split[0])){
            fcc.setId(Long.parseLong(split[0]));
        }
        if(MyTools.isNotEmpty(split[1])){
            fcc.setInstanceid(split[1]);
        }
        if(MyTools.isNotEmpty(split[2])){
            fcc.setOrganizationid(split[2]);
        }
        if(MyTools.isNotEmpty(split[3])){
            fcc.setStatus(Short.parseShort(split[3]));
        }
        if(MyTools.isNotEmpty(split[4])){
            fcc.setMingcheng(split[4]);
        }
        if(MyTools.isNotEmpty(split[5])){
            fcc.setDengjizhenghao(split[5]);
        }
        if(MyTools.isNotEmpty(split[6])){
            fcc.setJigoudaima(split[6]);
        }
        if(MyTools.isNotEmpty(split[7])){
            fcc.setChenglishijian(DateUtils.strToDateLong(split[7]));
        }
        if(MyTools.isNotEmpty(split[8])){
            fcc.setZhucezijin(new BigDecimal(split[8]));
        }
        if(MyTools.isNotEmpty(split[9])){
            fcc.setYoubian(split[9]);
        }
        if(MyTools.isNotEmpty(split[10])){
            fcc.setLianxidianhua(split[10]);
        }
        if(MyTools.isNotEmpty(split[11])){
            fcc.setChuanzhen(split[11]);
        }
        if(MyTools.isNotEmpty(split[12])){
            fcc.setWangzhi(split[12]);
        }
        if(MyTools.isNotEmpty(split[13])){
            fcc.setDianziyouxiang(split[13]);
        }
        if(MyTools.isNotEmpty(split[14])){
            fcc.setDanweihuiyuanshu(Integer.parseInt(split[14]));
        }
        if(MyTools.isNotEmpty(split[15])){
            fcc.setGerenhuiyuanshu(Integer.parseInt(split[15]));
        }
        if(MyTools.isNotEmpty(split[16])){
            fcc.setFarenxingming(split[16]);
        }
        if(MyTools.isNotEmpty(split[17])){
            fcc.setLishichangxingming(split[17]);
        }
        if(MyTools.isNotEmpty(split[18])){
            fcc.setLishirenshu(Integer.parseInt(split[18]));
        }
        if(MyTools.isNotEmpty(split[19])){
            fcc.setFuzerenshu(Integer.parseInt(split[19]));
        }
        if(MyTools.isNotEmpty(split[20])){
            fcc.setMishuchangxingming(split[20]);
        }
        if(MyTools.isNotEmpty(split[21])){
            fcc.setChangwulishirenshu(Integer.parseInt(split[21]));
        }
        if(MyTools.isNotEmpty(split[22])){
            fcc.setGongshengrenshu(Integer.parseInt(split[22]));
        }
        if(MyTools.isNotEmpty(split[23])){
            fcc.setGongdirenshu(Integer.parseInt(split[23]));
        }
        if(MyTools.isNotEmpty(split[24])){
            fcc.setGongxianrenshu(Integer.parseInt(split[24]));
        }
        if(MyTools.isNotEmpty(split[25])){
            fcc.setLizongshu(Integer.parseInt(split[25]));
        }
        if(MyTools.isNotEmpty(split[26])){
            fcc.setLishengshu(Integer.parseInt(split[26]));
        }
        if(MyTools.isNotEmpty(split[27])){
            fcc.setLilaoling(Integer.parseInt(split[27]));
        }
        if(MyTools.isNotEmpty(split[28])){
            fcc.setGongzuorenyuanzongshu(Integer.parseInt(split[28]));
        }
        if(MyTools.isNotEmpty(split[29])){
            fcc.setZhuanzhigongzuorenshu(Integer.parseInt(split[29]));
        }
        if(MyTools.isNotEmpty(split[30])){
            fcc.setJianzhirenyuanshu(Integer.parseInt(split[30]));
        }
        if(MyTools.isNotEmpty(split[31])){
            fcc.setLifanpinrenshu(Integer.parseInt(split[31]));
        }
        if(MyTools.isNotEmpty(split[32])){
            fcc.setZhiyuanzherenshu(new BigDecimal(split[32]));
        }
        if(MyTools.isNotEmpty(split[33])){
            fcc.setZhiyuanlaodongshijian(new BigDecimal(split[33]));
        }
        if(MyTools.isNotEmpty(split[34])){
            fcc.setDangyuanrenshu(Integer.parseInt(split[34]));
        }
        if(MyTools.isNotEmpty(split[35])){
            fcc.setFenzhijigoushu(Integer.parseInt(split[35]));
        }
        if(MyTools.isNotEmpty(split[36])){
            fcc.setDaibiaojigoushu(Integer.parseInt(split[36]));
        }
        if(MyTools.isNotEmpty(split[37])){
            fcc.setNeishejigoushu(Integer.parseInt(split[37]));
        }
        if(MyTools.isNotEmpty(split[38])){
            fcc.setZhuanxiangjigoushu(Integer.parseInt(split[38]));
        }
        if(MyTools.isNotEmpty(split[39])){
            fcc.setJingyingxingshitishu(Integer.parseInt(split[39]));
        }
        if(MyTools.isNotEmpty(split[40])){
            fcc.setGongkaikanwushu(Integer.parseInt(split[40]));
        }
        if(MyTools.isNotEmpty(split[41])){
            fcc.setNeibukanwushu(Integer.parseInt(split[41]));
        }
        if(MyTools.isNotEmpty(split[42])){
            fcc.setZhihuibiaozhunshijian(DateUtils.strToDateLong(split[42]));
        }
        if(MyTools.isNotEmpty(split[43])){
            fcc.setTonghuibiaozhunhuiyimingcheng(split[43]);
        }
        if(MyTools.isNotEmpty(split[44])){
            fcc.setZhuguandanwei(split[44]);
        }
        if(MyTools.isNotEmpty(split[45])){
            fcc.setXingyefenlei(split[45]);
        }
        if(MyTools.isNotEmpty(split[46])){
            fcc.setZhusuo(split[46]);
        }
        if(MyTools.isNotEmpty(split[47])){
            fcc.setFarenzhiwu(split[47]);
        }
        if(MyTools.isNotEmpty(split[48])){
            fcc.setMishuchangwei(split[48]);
        }
        if(MyTools.isNotEmpty(split[49])){
            fcc.setDangjianqingkuang(split[49]);
        }
        if(MyTools.isNotEmpty(split[50])){
            fcc.setYewufanwei(split[50]);
        }
        if(MyTools.isNotEmpty(split[51])){
            fcc.setHuifeibiaozhun(split[51]);
        }
        if(MyTools.isNotEmpty(split[52])){
            fcc.setMinzhengbumen(split[52]);
        }
        if(MyTools.isNotEmpty(split[53])){
            fcc.setCaizhengbumen(split[53]);
        }
        if(MyTools.isNotEmpty(split[54])){
            fcc.setZhusuoxiangxi(split[54]);
        }
        if(MyTools.isNotEmpty(split[55])){
            fcc.setShouji(split[55]);
        }
        if(MyTools.isNotEmpty(split[56])){
            fcc.setXingbie(split[56]);
        }
        if(MyTools.isNotEmpty(split[57])){
            fcc.setChushengnianyue(DateUtils.strToDateLong(split[57]));
        }
        if(MyTools.isNotEmpty(split[58])){
            fcc.setZhengzhimianmao(split[58]);
        }
        if(MyTools.isNotEmpty(split[59])){
            fcc.setXueli(split[59]);
        }
        if(MyTools.isNotEmpty(split[60])){
            fcc.setXingbie2(split[60]);
        }
        if(MyTools.isNotEmpty(split[61])){
            fcc.setChushengnianyue2(DateUtils.strToDateLong(split[61]));
        }
        if(MyTools.isNotEmpty(split[62])){
            fcc.setZhengzhimianmao2(split[62]);
        }
        if(MyTools.isNotEmpty(split[63])){
            fcc.setXueli2(split[63]);
        }
        if(MyTools.isNotEmpty(split[64])){
            fcc.setLianxidianhua2(split[64]);
        }
        if(MyTools.isNotEmpty(split[65])){
            fcc.setXingbie3(split[65]);
        }
        if(MyTools.isNotEmpty(split[66])){
            fcc.setChushengnianyue3(DateUtils.strToDateLong(split[66]));
        }
        if(MyTools.isNotEmpty(split[67])){
            fcc.setZhengzhimianmao3(split[67]);
        }
        if(MyTools.isNotEmpty(split[68])){
            fcc.setXueli3(split[68]);
        }
        if(MyTools.isNotEmpty(split[69])){
            fcc.setChanshengfangshi(split[69]);
        }
        if(MyTools.isNotEmpty(split[70])){
            fcc.setQuantinianling(split[70]);
        }
        if(MyTools.isNotEmpty(split[71])){
            fcc.setQuantinvxing(split[71]);
        }
        if(MyTools.isNotEmpty(split[72])){
            fcc.setQuantibenke(split[72]);
        }
        if(MyTools.isNotEmpty(split[73])){
            fcc.setQuantidangyuan(split[73]);
        }
        if(MyTools.isNotEmpty(split[74])){
            fcc.setZhuanzhinianling(split[74]);
        }
        if(MyTools.isNotEmpty(split[75])){
            fcc.setZhuanzhinvxing(split[75]);
        }
        if(MyTools.isNotEmpty(split[76])){
            fcc.setZhuanzhibenke(split[76]);
        }
        if(MyTools.isNotEmpty(split[77])){
            fcc.setZhuanzhidangyuan(split[77]);
        }
        if(MyTools.isNotEmpty(split[78])){
            fcc.setHuodongcishu(split[78]);
        }
        if(MyTools.isNotEmpty(split[79])){
            fcc.setJuanzengshouru(split[79]);
        }
        if(MyTools.isNotEmpty(split[80])){
            fcc.setHuodongzhichu(split[80]);
        }
        if(MyTools.isNotEmpty(split[81])){
            fcc.setFuwuxinnongcun(split[81]);
        }
        if(MyTools.isNotEmpty(split[82])){
            fcc.setQitagongyixiangmu(split[82]);
        }
        if(MyTools.isNotEmpty(split[83])){
            fcc.setGuojihezuo(split[83]);
        }
        if(MyTools.isNotEmpty(split[84])){
            fcc.setGuojihuiyi(split[84]);
        }
        if(MyTools.isNotEmpty(split[85])){
            fcc.setGuojizuzhi(split[85]);
        }
        if(MyTools.isNotEmpty(split[86])){
            fcc.setChuguofangwen(split[86]);
        }
        if(MyTools.isNotEmpty(split[87])){
            fcc.setJieshoukuanwu(split[87]);
        }
        if(MyTools.isNotEmpty(split[88])){
            fcc.setZuzhijuanzeng(split[88]);
        }
        if(MyTools.isNotEmpty(split[89])){
            fcc.setKaizhanfuwu(split[89]);
        }
        if(MyTools.isNotEmpty(split[90])){
            fcc.setZuzhifuwu(split[90]);
        }
        if(MyTools.isNotEmpty(split[91])){
            fcc.setShouhuifei(split[91]);
        }
        if(MyTools.isNotEmpty(split[92])){
            fcc.setFuwushoufei(split[92]);
        }
        if(MyTools.isNotEmpty(split[93])){
            fcc.setDabiaohuodong(split[93]);
        }
        if(MyTools.isNotEmpty(split[94])){
            fcc.setHeshubangong(split[94]);
        }
        if(MyTools.isNotEmpty(split[95])){
            fcc.setLishidanweizhiwu(split[95]);
        }
        if(MyTools.isNotEmpty(split[96])){
            fcc.setZhiwujibie(split[96]);
        }
        if(MyTools.isNotEmpty(split[97])){
            fcc.setLuntanhuodong(Integer.parseInt(split[97]));
        }
        if(MyTools.isNotEmpty(split[98])){
            fcc.setGongyihuodong(Integer.parseInt(split[98]));
        }
        if(MyTools.isNotEmpty(split[99])){
            fcc.setTjnjjieguo1(split[99]);
        }
        if(MyTools.isNotEmpty(split[100])){
            fcc.setTjnjjieguo2(split[100]);
        }
        if(MyTools.isNotEmpty(split[101])){
            fcc.setTjnjyijian1(split[101]);
        }
        if(MyTools.isNotEmpty(split[102])){
            fcc.setTjnjyijian2(split[102]);
        }
        if(MyTools.isNotEmpty(split[103])){
            fcc.setTjnjxingming1(split[103]);
        }
        if(MyTools.isNotEmpty(split[104])){
            fcc.setTjnjxingming2(split[104]);
        }
        if(MyTools.isNotEmpty(split[105])){
            fcc.setTjnjshijian1(DateUtils.strToDateLong(split[105]));
        }
        if(MyTools.isNotEmpty(split[106])){
            fcc.setTjnjshijian2(DateUtils.strToDateLong(split[106]));
        }
        if(MyTools.isNotEmpty(split[107])){
            fcc.setHuiyihuodong(Integer.parseInt(split[107]));
        }
        if(MyTools.isNotEmpty(split[108])){
            fcc.setZipingfenshu(Integer.parseInt(split[108]));
        }
        if(MyTools.isNotEmpty(split[109])){
            fcc.setZipingdengji(split[109]);
        }
        if(MyTools.isNotEmpty(split[110])){
            fcc.setPaiqianzhidao(split[110]);
        }
        if(MyTools.isNotEmpty(split[111])){
            fcc.setGongzuoqingkuang(split[111]);
        }
        if(MyTools.isNotEmpty(split[112])){
            fcc.setQishiyishang(Integer.parseInt(split[112]));
        }
        if(MyTools.isNotEmpty(split[113])){
            fcc.setXianchuyixia(Integer.parseInt(split[113]));
        }
        if(MyTools.isNotEmpty(split[114])){
            fcc.setLishengzeren(Integer.parseInt(split[114]));
        }
        if(MyTools.isNotEmpty(split[115])){
            fcc.setLiditingzeren(Integer.parseInt(split[115]));
        }
        if(MyTools.isNotEmpty(split[116])){
            fcc.setLixianchuzeren(Integer.parseInt(split[116]));
        }
        if(MyTools.isNotEmpty(split[117])){
            fcc.setLishenglishi(Integer.parseInt(split[117]));
        }
        if(MyTools.isNotEmpty(split[118])){
            fcc.setLiditinglishi(Integer.parseInt(split[118]));
        }
        if(MyTools.isNotEmpty(split[119])){
            fcc.setLixianchulishi(Integer.parseInt(split[119]));
        }
        if(MyTools.isNotEmpty(split[120])){
            fcc.setLibeian(split[120]);
        }
        if(MyTools.isNotEmpty(split[121])){
            fcc.setQitazuzhi(split[121]);
        }
        if(MyTools.isNotEmpty(split[122])){
            fcc.setHangyebumen(split[122]);
        }
        if(MyTools.isNotEmpty(split[123])){
            fcc.setDangjianbumen(split[123]);
        }
        if(MyTools.isNotEmpty(split[124])){
            fcc.setFarendianhua(split[124]);
        }
        if(MyTools.isNotEmpty(split[125])){
            fcc.setRenzhiriqi1(DateUtils.strToDateLong(split[125]));
        }
        if(MyTools.isNotEmpty(split[126])){
            fcc.setRenzhiriqi2(DateUtils.strToDateLong(split[126]));
        }
        if(MyTools.isNotEmpty(split[127])){
            fcc.setFayanrenxingming(split[127]);
        }
        if(MyTools.isNotEmpty(split[128])){
            fcc.setFayanrendianhua(split[128]);
        }
        if(MyTools.isNotEmpty(split[129])){
            fcc.setFayanrenshouji(split[129]);
        }
        if(MyTools.isNotEmpty(split[130])){
            fcc.setFayanrenyouxiang(split[130]);
        }
        if(MyTools.isNotEmpty(split[131])){
            fcc.setQuntuanxinxi(split[131]);
        }
        if(MyTools.isNotEmpty(split[132])){
            fcc.setWeituoshouquan(Integer.parseInt(split[132]));
        }
        if(MyTools.isNotEmpty(split[133])){
            fcc.setZizhipingshen(Integer.parseInt(split[133]));
        }
        if(MyTools.isNotEmpty(split[134])){
            fcc.setMishudanweizhiwu(split[134]);
        }
        return fcc;
    }

}
