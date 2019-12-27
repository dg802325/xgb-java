package com.xgb.service;

import com.xgb.common.Utils;
import com.xgb.model.MfNianjianJbxx;
import com.xgb.util.DateUtils;
import com.xgb.util.MyTools;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
* @Auther: 
* @Date: 2019年12月26日 14:28:07
* @Description:
*/
public class ReadMfNianjianJbxxService {

    public static MfNianjianJbxx getContent(){
        List<MfNianjianJbxx> lists = new ArrayList<MfNianjianJbxx>();
        String path = Utils.getResourceBasePath() + "/xgb-data/data-api/config/MfNianjianJbxx.txt";
        File file = new File(path);
        MfNianjianJbxx  entity = null;
        Boolean boo = file.exists() && file.isFile();
        if(boo){
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
                entity = getEntity(result.toString());
                lists.add(entity);
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
        return entity;
    }
    public static MfNianjianJbxx getEntity(String result){
        String[] split = result.split("\\|");
        MfNianjianJbxx fcc = new MfNianjianJbxx();
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
            fcc.setZuzhijigoudaima(split[6]);
        }
        if(MyTools.isNotEmpty(split[7])){
            fcc.setZhiyexukezhenghao(split[7]);
        }
        if(MyTools.isNotEmpty(split[8])){
            fcc.setChenglishijian(DateUtils.strToDateLong(split[8]));
        }
        if(MyTools.isNotEmpty(split[9])){
            fcc.setKaibanzijin(new BigDecimal(split[9]));
        }
        if(MyTools.isNotEmpty(split[10])){
            fcc.setZhusuo(split[10]);
        }
        if(MyTools.isNotEmpty(split[11])){
            fcc.setZhusuoxiangxi(split[11]);
        }
        if(MyTools.isNotEmpty(split[12])){
            fcc.setYouzhengbianma(split[12]);
        }
        if(MyTools.isNotEmpty(split[13])){
            fcc.setZhusuolaiyuan(split[13]);
        }
        if(MyTools.isNotEmpty(split[14])){
            fcc.setZulindaoqiri(DateUtils.strToDateLong(split[14]));
        }
        if(MyTools.isNotEmpty(split[15])){
            fcc.setLianxidianhua(split[15]);
        }
        if(MyTools.isNotEmpty(split[16])){
            fcc.setShoujidianhua(split[16]);
        }
        if(MyTools.isNotEmpty(split[17])){
            fcc.setChuanzhen(split[17]);
        }
        if(MyTools.isNotEmpty(split[18])){
            fcc.setWangzhandizhi(split[18]);
        }
        if(MyTools.isNotEmpty(split[19])){
            fcc.setDianziyouxiang(split[19]);
        }
        if(MyTools.isNotEmpty(split[20])){
            fcc.setFadingdaibiaoren(split[20]);
        }
        if(MyTools.isNotEmpty(split[21])){
            fcc.setFarenzhiwu(split[21]);
        }
        if(MyTools.isNotEmpty(split[22])){
            fcc.setChuzizheyi(split[22]);
        }
        if(MyTools.isNotEmpty(split[23])){
            fcc.setJineyi(new BigDecimal(split[23]));
        }
        if(MyTools.isNotEmpty(split[24])){
            fcc.setChuzizheer(split[24]);
        }
        if(MyTools.isNotEmpty(split[25])){
            fcc.setJineer(new BigDecimal(split[25]));
        }
        if(MyTools.isNotEmpty(split[26])){
            fcc.setChuzizhesan(split[26]);
        }
        if(MyTools.isNotEmpty(split[27])){
            fcc.setJinesan(new BigDecimal(split[27]));
        }
        if(MyTools.isNotEmpty(split[28])){
            fcc.setChuzizhesi(split[28]);
        }
        if(MyTools.isNotEmpty(split[29])){
            fcc.setJinesi(new BigDecimal(split[29]));
        }
        if(MyTools.isNotEmpty(split[30])){
            fcc.setChuzizhewu(split[30]);
        }
        if(MyTools.isNotEmpty(split[31])){
            fcc.setJinewu(new BigDecimal(split[31]));
        }
        if(MyTools.isNotEmpty(split[32])){
            fcc.setDongshichangxingming(split[32]);
        }
        if(MyTools.isNotEmpty(split[33])){
            fcc.setDongshirenshu(Integer.parseInt(split[33]));
        }
        if(MyTools.isNotEmpty(split[34])){
            fcc.setJianshirenshu(Integer.parseInt(split[34]));
        }
        if(MyTools.isNotEmpty(split[35])){
            fcc.setGongzuorenyuanzongshu(Integer.parseInt(split[35]));
        }
        if(MyTools.isNotEmpty(split[36])){
            fcc.setZhuanzhirenyuanshu(Integer.parseInt(split[36]));
        }
        if(MyTools.isNotEmpty(split[37])){
            fcc.setJianzhirenyuanshu(Integer.parseInt(split[37]));
        }
        if(MyTools.isNotEmpty(split[38])){
            fcc.setLifanpinrenshu(Integer.parseInt(split[38]));
        }
        if(MyTools.isNotEmpty(split[39])){
            fcc.setZhiyuanzheshu(Integer.parseInt(split[39]));
        }
        if(MyTools.isNotEmpty(split[40])){
            fcc.setZhiyuanlaodongshijian(Integer.parseInt(split[40]));
        }
        if(MyTools.isNotEmpty(split[41])){
            fcc.setDangyuanrenshu(Integer.parseInt(split[41]));
        }
        if(MyTools.isNotEmpty(split[42])){
            fcc.setDangjianqingkuang(split[42]);
        }
        if(MyTools.isNotEmpty(split[43])){
            fcc.setNeishejigoushu(Integer.parseInt(split[43]));
        }
        if(MyTools.isNotEmpty(split[44])){
            fcc.setGongkaikanwushu(Integer.parseInt(split[44]));
        }
        if(MyTools.isNotEmpty(split[45])){
            fcc.setNeibuziliaoshu(Integer.parseInt(split[45]));
        }
        if(MyTools.isNotEmpty(split[46])){
            fcc.setYewuzhuguandanwei(split[46]);
        }
        if(MyTools.isNotEmpty(split[47])){
            fcc.setDianhua(split[47]);
        }
        if(MyTools.isNotEmpty(split[48])){
            fcc.setDanweixingzhi(split[48]);
        }
        if(MyTools.isNotEmpty(split[49])){
            fcc.setYewufanwei(split[49]);
        }
        if(MyTools.isNotEmpty(split[50])){
            fcc.setXingyefenlei(split[50]);
        }
        if(MyTools.isNotEmpty(split[51])){
            fcc.setFarenxingbie(split[51]);
        }
        if(MyTools.isNotEmpty(split[52])){
            fcc.setFarenshengri(DateUtils.strToDateLong(split[52]));
        }
        if(MyTools.isNotEmpty(split[53])){
            fcc.setFarenmianmao(split[53]);
        }
        if(MyTools.isNotEmpty(split[54])){
            fcc.setFarenxueli(split[54]);
        }
        if(MyTools.isNotEmpty(split[55])){
            fcc.setDongshichangxingbie(split[55]);
        }
        if(MyTools.isNotEmpty(split[56])){
            fcc.setDongshichangshengri(DateUtils.strToDateLong(split[56]));
        }
        if(MyTools.isNotEmpty(split[57])){
            fcc.setDongshichangmianmao(split[57]);
        }
        if(MyTools.isNotEmpty(split[58])){
            fcc.setDongshichangxueli(split[58]);
        }
        if(MyTools.isNotEmpty(split[59])){
            fcc.setDongshichangzhuanzhi(split[59]);
        }
        if(MyTools.isNotEmpty(split[60])){
            fcc.setDongshichangdanwei(split[60]);
        }
        if(MyTools.isNotEmpty(split[61])){
            fcc.setDongshichangdianhua(split[61]);
        }
        if(MyTools.isNotEmpty(split[62])){
            fcc.setDongshichangshouji(split[62]);
        }
        if(MyTools.isNotEmpty(split[63])){
            fcc.setFuzerenxingming(split[63]);
        }
        if(MyTools.isNotEmpty(split[64])){
            fcc.setFuzerenxingbie(split[64]);
        }
        if(MyTools.isNotEmpty(split[65])){
            fcc.setFuzerenshengri(DateUtils.strToDateLong(split[65]));
        }
        if(MyTools.isNotEmpty(split[66])){
            fcc.setFuzerenmianmao(split[66]);
        }
        if(MyTools.isNotEmpty(split[67])){
            fcc.setFuzerenxueli(split[67]);
        }
        if(MyTools.isNotEmpty(split[68])){
            fcc.setFuzerenzhuanzhi(split[68]);
        }
        if(MyTools.isNotEmpty(split[69])){
            fcc.setFuzerendianhua(split[69]);
        }
        if(MyTools.isNotEmpty(split[70])){
            fcc.setFuzerenchuanzhen(split[70]);
        }
        if(MyTools.isNotEmpty(split[71])){
            fcc.setFuzerenshouji(split[71]);
        }
        if(MyTools.isNotEmpty(split[72])){
            fcc.setLituixiuzongshu(Integer.parseInt(split[72]));
        }
        if(MyTools.isNotEmpty(split[73])){
            fcc.setLishengbuji(Integer.parseInt(split[73]));
        }
        if(MyTools.isNotEmpty(split[74])){
            fcc.setLilaoling(Integer.parseInt(split[74]));
        }
        if(MyTools.isNotEmpty(split[75])){
            fcc.setQuantinianling(Integer.parseInt(split[75]));
        }
        if(MyTools.isNotEmpty(split[76])){
            fcc.setQuantinvxing(Integer.parseInt(split[76]));
        }
        if(MyTools.isNotEmpty(split[77])){
            fcc.setQuantibenke(Integer.parseInt(split[77]));
        }
        if(MyTools.isNotEmpty(split[78])){
            fcc.setQuantidangyuan(Integer.parseInt(split[78]));
        }
        if(MyTools.isNotEmpty(split[79])){
            fcc.setZhuanzhinianling(Integer.parseInt(split[79]));
        }
        if(MyTools.isNotEmpty(split[80])){
            fcc.setZhuanzhinvxing(Integer.parseInt(split[80]));
        }
        if(MyTools.isNotEmpty(split[81])){
            fcc.setZhuanzhibenke(Integer.parseInt(split[81]));
        }
        if(MyTools.isNotEmpty(split[82])){
            fcc.setZhuanzhidangyuan(Integer.parseInt(split[82]));
        }
        if(MyTools.isNotEmpty(split[83])){
            fcc.setLaodongshijian(Integer.parseInt(split[83]));
        }
        if(MyTools.isNotEmpty(split[84])){
            fcc.setHuodongcishu(Integer.parseInt(split[84]));
        }
        if(MyTools.isNotEmpty(split[85])){
            fcc.setJubancishu(Integer.parseInt(split[85]));
        }
        if(MyTools.isNotEmpty(split[86])){
            fcc.setGongyizhichu(new BigDecimal(split[86]));
        }
        if(MyTools.isNotEmpty(split[87])){
            fcc.setXiangmu(Integer.parseInt(split[87]));
        }
        if(MyTools.isNotEmpty(split[88])){
            fcc.setHuiyi(Integer.parseInt(split[88]));
        }
        if(MyTools.isNotEmpty(split[89])){
            fcc.setZuzhi(Integer.parseInt(split[89]));
        }
        if(MyTools.isNotEmpty(split[90])){
            fcc.setFangwen(Integer.parseInt(split[90]));
        }
        if(MyTools.isNotEmpty(split[91])){
            fcc.setBiaozhanghuodong(Integer.parseInt(split[91]));
        }
        if(MyTools.isNotEmpty(split[92])){
            fcc.setShouhuifei(split[92]);
        }
        if(MyTools.isNotEmpty(split[93])){
            fcc.setHeshubangong(split[93]);
        }
        if(MyTools.isNotEmpty(split[94])){
            fcc.setLishidanweizhiwu(split[94]);
        }
        if(MyTools.isNotEmpty(split[95])){
            fcc.setTjnjjieguo1(split[95]);
        }
        if(MyTools.isNotEmpty(split[96])){
            fcc.setTjnjjieguo2(split[96]);
        }
        if(MyTools.isNotEmpty(split[97])){
            fcc.setTjnjyijian1(split[97]);
        }
        if(MyTools.isNotEmpty(split[98])){
            fcc.setTjnjyijian2(split[98]);
        }
        if(MyTools.isNotEmpty(split[99])){
            fcc.setTjnjxingming1(split[99]);
        }
        if(MyTools.isNotEmpty(split[100])){
            fcc.setTjnjxingming2(split[100]);
        }
        if(MyTools.isNotEmpty(split[101])){
            fcc.setTjnjshijian1(DateUtils.strToDateLong(split[101]));
        }
        if(MyTools.isNotEmpty(split[102])){
            fcc.setTjnjshijian2(DateUtils.strToDateLong(split[102]));
        }
        if(MyTools.isNotEmpty(split[103])){
            fcc.setLingqubaochou(Integer.parseInt(split[103]));
        }
        if(MyTools.isNotEmpty(split[104])){
            fcc.setGongwuyuanzaizhi(Integer.parseInt(split[104]));
        }
        if(MyTools.isNotEmpty(split[105])){
            fcc.setZaizhijuji(Integer.parseInt(split[105]));
        }
        if(MyTools.isNotEmpty(split[106])){
            fcc.setZaizhichuji(Integer.parseInt(split[106]));
        }
        if(MyTools.isNotEmpty(split[107])){
            fcc.setGongwuyuanlituixiu(Integer.parseInt(split[107]));
        }
        if(MyTools.isNotEmpty(split[108])){
            fcc.setLituixiujuji(Integer.parseInt(split[108]));
        }
        if(MyTools.isNotEmpty(split[109])){
            fcc.setLituixiuchuji(Integer.parseInt(split[109]));
        }
        if(MyTools.isNotEmpty(split[110])){
            fcc.setMujizijinshu(new BigDecimal(split[110]));
        }
        if(MyTools.isNotEmpty(split[111])){
            fcc.setXinarenshu(Integer.parseInt(split[111]));
        }
        if(MyTools.isNotEmpty(split[112])){
            fcc.setZhengxiedaibiaoshu(Integer.parseInt(split[112]));
        }
        if(MyTools.isNotEmpty(split[113])){
            fcc.setTigongjianyishu(Integer.parseInt(split[113]));
        }
        if(MyTools.isNotEmpty(split[114])){
            fcc.setZengjiajiuyeshu(Integer.parseInt(split[114]));
        }
        if(MyTools.isNotEmpty(split[115])){
            fcc.setFuwurenci(Integer.parseInt(split[115]));
        }
        if(MyTools.isNotEmpty(split[116])){
            fcc.setZipingfenshu(Integer.parseInt(split[116]));
        }
        if(MyTools.isNotEmpty(split[117])){
            fcc.setZipingdengji(split[117]);
        }
        if(MyTools.isNotEmpty(split[118])){
            fcc.setPaiqianzhidao(split[118]);
        }
        if(MyTools.isNotEmpty(split[119])){
            fcc.setGongzuoqingkuang(split[119]);
        }
        if(MyTools.isNotEmpty(split[120])){
            fcc.setQitazuzhi(split[120]);
        }

        return fcc;
    }
}

