package com.xgb.service;

import com.xgb.common.Utils;
import com.xgb.model.StDjqk4;
import com.xgb.util.DateUtils;
import com.xgb.util.MyTools;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
* @Auther: 
* @Date: 2019年12月24日 15:57:56
* @Description:
*/
public class ReadStDjqk4Service {

    public static List<StDjqk4> getContent(){
        List<StDjqk4> lists = new ArrayList<StDjqk4>();
        String path = Utils.getResourceBasePath() + "/xgb-data/data-api/config/StDjqk4.txt";
        File file = new File(path);
        StDjqk4  entity = null;
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
        return lists;
    }
    public static StDjqk4 getEntity(String result){
        String[] split = result.split("\\|");
        StDjqk4 fcc = new StDjqk4();
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
            fcc.setDanweimingcheng(split[4]);
        }
        if(MyTools.isNotEmpty(split[5])){
            fcc.setDengjihao(split[5]);
        }
        if(MyTools.isNotEmpty(split[6])){
            fcc.setDengjijiguan(split[6]);
        }
        if(MyTools.isNotEmpty(split[7])){
            fcc.setDangyuanzongshu(Integer.parseInt(split[7]));
        }
        if(MyTools.isNotEmpty(split[8])){
            fcc.setZhuandangshu(Integer.parseInt(split[8]));
        }
        if(MyTools.isNotEmpty(split[9])){
            fcc.setFuzerenshu(Integer.parseInt(split[9]));
        }
        if(MyTools.isNotEmpty(split[10])){
            fcc.setJiandangshu(Integer.parseInt(split[10]));
        }
        if(MyTools.isNotEmpty(split[11])){
            fcc.setDangnianshu(Integer.parseInt(split[11]));
        }
        if(MyTools.isNotEmpty(split[12])){
            fcc.setRenyuanshu1(Integer.parseInt(split[12]));
        }
        if(MyTools.isNotEmpty(split[13])){
            fcc.setRenyuanshu2(Integer.parseInt(split[13]));
        }
        if(MyTools.isNotEmpty(split[14])){
            fcc.setSanshiwushu(Integer.parseInt(split[14]));
        }
        if(MyTools.isNotEmpty(split[15])){
            fcc.setWushisishu(Integer.parseInt(split[15]));
        }
        if(MyTools.isNotEmpty(split[16])){
            fcc.setWushiwushu(Integer.parseInt(split[16]));
        }
        if(MyTools.isNotEmpty(split[17])){
            fcc.setBoshishu(Integer.parseInt(split[17]));
        }
        if(MyTools.isNotEmpty(split[18])){
            fcc.setShuoshishu(Integer.parseInt(split[18]));
        }
        if(MyTools.isNotEmpty(split[19])){
            fcc.setBenkeshu(Integer.parseInt(split[19]));
        }
        if(MyTools.isNotEmpty(split[20])){
            fcc.setDazhuanshu(Integer.parseInt(split[20]));
        }
        if(MyTools.isNotEmpty(split[21])){
            fcc.setZhongzhuanshu(Integer.parseInt(split[21]));
        }
        if(MyTools.isNotEmpty(split[22])){
            fcc.setGaozhongshu(Integer.parseInt(split[22]));
        }
        if(MyTools.isNotEmpty(split[23])){
            fcc.setJingjidangshu(Integer.parseInt(split[23]));
        }
        if(MyTools.isNotEmpty(split[24])){
            fcc.setWaishengdangshu(Integer.parseInt(split[24]));
        }
        if(MyTools.isNotEmpty(split[25])){
            fcc.setShehuizushu(Integer.parseInt(split[25]));
        }
        if(MyTools.isNotEmpty(split[26])){
            fcc.setYezushu(Integer.parseInt(split[26]));
        }
        if(MyTools.isNotEmpty(split[27])){
            fcc.setGuakaozushu(Integer.parseInt(split[27]));
        }
        if(MyTools.isNotEmpty(split[28])){
            fcc.setShudizushu(Integer.parseInt(split[28]));
        }
        if(MyTools.isNotEmpty(split[29])){
            fcc.setYuanzuzhishu(Integer.parseInt(split[29]));
        }
        if(MyTools.isNotEmpty(split[30])){
            fcc.setQitashu(Integer.parseInt(split[30]));
        }
        if(MyTools.isNotEmpty(split[31])){
            fcc.setJianlidang1(split[31]);
        }
        if(MyTools.isNotEmpty(split[32])){
            fcc.setJianlidang2(split[32]);
        }
        if(MyTools.isNotEmpty(split[33])){
            fcc.setZuzhimingcheng(split[33]);
        }
        if(MyTools.isNotEmpty(split[34])){
            fcc.setDangleixing(split[34]);
        }
        if(MyTools.isNotEmpty(split[35])){
            fcc.setLishuguanxi(split[35]);
        }
        if(MyTools.isNotEmpty(split[36])){
            fcc.setDanrenzhiwu(split[36]);
        }
        if(MyTools.isNotEmpty(split[37])){
            fcc.setNianling(split[37]);
        }
        if(MyTools.isNotEmpty(split[38])){
            fcc.setXueli(split[38]);
        }
        if(MyTools.isNotEmpty(split[39])){
            fcc.setLiudongshu(Integer.parseInt(split[39]));
        }
        if(MyTools.isNotEmpty(split[40])){
            fcc.setYuanjishu(Integer.parseInt(split[40]));
        }
        if(MyTools.isNotEmpty(split[41])){
            fcc.setZhijieshu(Integer.parseInt(split[41]));
        }
        if(MyTools.isNotEmpty(split[42])){
            fcc.setZidaishu(Integer.parseInt(split[42]));
        }
        if(MyTools.isNotEmpty(split[43])){
            fcc.setCanjia(split[43]);
        }
        if(MyTools.isNotEmpty(split[44])){
            fcc.setBucanjia(split[44]);
        }
        if(MyTools.isNotEmpty(split[45])){
            fcc.setWeijianyuanyin(split[45]);
        }
        if(MyTools.isNotEmpty(split[46])){
            fcc.setHuodongchangsuo(split[46]);
        }
        if(MyTools.isNotEmpty(split[47])){
            fcc.setHuodongjingfei(split[47]);
        }
        if(MyTools.isNotEmpty(split[48])){
            fcc.setJingfeilaiyuan(split[48]);
        }
        if(MyTools.isNotEmpty(split[49])){
            fcc.setFazhandangyuan(split[49]);
        }
        if(MyTools.isNotEmpty(split[50])){
            fcc.setDanghuishu(Integer.parseInt(split[50]));
        }
        if(MyTools.isNotEmpty(split[51])){
            fcc.setZhihuishu(Integer.parseInt(split[51]));
        }
        if(MyTools.isNotEmpty(split[52])){
            fcc.setMinhuishu(Integer.parseInt(split[52]));
        }
        if(MyTools.isNotEmpty(split[53])){
            fcc.setDangkeshu(Integer.parseInt(split[53]));
        }
        if(MyTools.isNotEmpty(split[54])){
            fcc.setDongyuanhui1(split[54]);
        }
        if(MyTools.isNotEmpty(split[55])){
            fcc.setDongyuanhui2(split[55]);
        }
        if(MyTools.isNotEmpty(split[56])){
            fcc.setKaizhanshu(Integer.parseInt(split[56]));
        }
        if(MyTools.isNotEmpty(split[57])){
            fcc.setHuodongzaiti(split[57]);
        }
        if(MyTools.isNotEmpty(split[58])){
            fcc.setWanchengzhuangtai(split[58]);
        }
        if(MyTools.isNotEmpty(split[59])){
            fcc.setJianfushu(Integer.parseInt(split[59]));
        }
        if(MyTools.isNotEmpty(split[60])){
            fcc.setJiedangshu(Integer.parseInt(split[60]));
        }
        if(MyTools.isNotEmpty(split[61])){
            fcc.setFuzerenshu5(Integer.parseInt(split[61]));
        }
        if(MyTools.isNotEmpty(split[62])){
            fcc.setRenyuanshu5(Integer.parseInt(split[62]));
        }
        if(MyTools.isNotEmpty(split[63])){
            fcc.setLidangshu(Integer.parseInt(split[63]));
        }
        if(MyTools.isNotEmpty(split[64])){
            fcc.setFuzerenshu6(Integer.parseInt(split[64]));
        }
        if(MyTools.isNotEmpty(split[65])){
            fcc.setRenyuanshu6(Integer.parseInt(split[65]));
        }
        if(MyTools.isNotEmpty(split[66])){
            fcc.setJijinhui(Integer.parseInt(split[66]));
        }
        if(MyTools.isNotEmpty(split[67])){
            fcc.setChenglishijian(split[67]);
        }
        if(MyTools.isNotEmpty(split[68])){
            fcc.setAnqihuanjie(split[68]);
        }
        if(MyTools.isNotEmpty(split[69])){
            fcc.setShangjidangzuzhi(split[69]);
        }
        if(MyTools.isNotEmpty(split[70])){
            fcc.setShixiangjuece(split[70]);
        }
        if(MyTools.isNotEmpty(split[71])){
            fcc.setDangjiangongzuopeixun(split[71]);
        }
        if(MyTools.isNotEmpty(split[72])){
            fcc.setDangjianpeixun1(split[72]);
        }
        if(MyTools.isNotEmpty(split[73])){
            fcc.setPinpaihuodong(split[73]);
        }
        if(MyTools.isNotEmpty(split[74])){
            fcc.setS1(split[74]);
        }
        if(MyTools.isNotEmpty(split[75])){
            fcc.setS2(split[75]);
        }
        if(MyTools.isNotEmpty(split[76])){
            fcc.setS3(split[76]);
        }
        if(MyTools.isNotEmpty(split[77])){
            fcc.setS4(split[77]);
        }
        if(MyTools.isNotEmpty(split[78])){
            fcc.setS5(split[78]);
        }
        if(MyTools.isNotEmpty(split[79])){
            fcc.setS6(split[79]);
        }
        if(MyTools.isNotEmpty(split[80])){
            fcc.setS7(split[80]);
        }
        if(MyTools.isNotEmpty(split[81])){
            fcc.setS8(split[81]);
        }
        if(MyTools.isNotEmpty(split[82])){
            fcc.setS9(split[82]);
        }
        if(MyTools.isNotEmpty(split[83])){
            fcc.setS10(split[83]);
        }
        if(MyTools.isNotEmpty(split[84])){
            fcc.setS11(split[84]);
        }
        if(MyTools.isNotEmpty(split[85])){
            fcc.setS12(split[85]);
        }
        if(MyTools.isNotEmpty(split[86])){
            fcc.setS13(split[86]);
        }
        if(MyTools.isNotEmpty(split[87])){
            fcc.setS14(split[87]);
        }
        if(MyTools.isNotEmpty(split[88])){
            fcc.setS15(split[88]);
        }
        if(MyTools.isNotEmpty(split[89])){
            fcc.setS16(split[89]);
        }
        if(MyTools.isNotEmpty(split[90])){
            fcc.setS17(split[90]);
        }
        if(MyTools.isNotEmpty(split[91])){
            fcc.setS18(split[91]);
        }
        if(MyTools.isNotEmpty(split[92])){
            fcc.setS19(split[92]);
        }
        if(MyTools.isNotEmpty(split[93])){
            fcc.setS20(split[93]);
        }
        if(MyTools.isNotEmpty(split[94])){
            fcc.setS21(split[94]);
        }
        if(MyTools.isNotEmpty(split[95])){
            fcc.setS22(split[95]);
        }
        if(MyTools.isNotEmpty(split[96])){
            fcc.setGuanfangwangzhan1(split[96]);
        }
        if(MyTools.isNotEmpty(split[97])){
            fcc.setWeixinpingtai1(split[97]);
        }
        if(MyTools.isNotEmpty(split[98])){
            fcc.setWeibo1(split[98]);
        }
        if(MyTools.isNotEmpty(split[99])){
            fcc.setZazhiqikan1(split[99]);
        }
        if(MyTools.isNotEmpty(split[100])){
            fcc.setQitafangshi1(split[100]);
        }
        if(MyTools.isNotEmpty(split[101])){
            fcc.setGuanfangwangzhan2(split[101]);
        }
        if(MyTools.isNotEmpty(split[102])){
            fcc.setWeixinpingtai2(split[102]);
        }
        if(MyTools.isNotEmpty(split[103])){
            fcc.setWeibo2(split[103]);
        }
        if(MyTools.isNotEmpty(split[104])){
            fcc.setZazhiqikan2(split[104]);
        }
        if(MyTools.isNotEmpty(split[105])){
            fcc.setQitafangshi2(split[105]);
        }
        if(MyTools.isNotEmpty(split[106])){
            fcc.setQitafangshi22(split[106]);
        }
        if(MyTools.isNotEmpty(split[107])){
            fcc.setQitafangshi11(split[107]);
        }
        if(MyTools.isNotEmpty(split[108])){
            fcc.setHuiyuandahui(split[108]);
        }
        if(MyTools.isNotEmpty(split[109])){
            fcc.setGongzuoqqqun(split[109]);
        }
        if(MyTools.isNotEmpty(split[110])){
            fcc.setDuanxinpingtai(split[110]);
        }

        return fcc;
    }
}

