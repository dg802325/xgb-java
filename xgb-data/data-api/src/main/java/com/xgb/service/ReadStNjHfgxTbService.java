package com.xgb.service;

import com.xgb.common.Utils;
import com.xgb.model.StNjHfgxTb;
import com.xgb.util.DateUtils;
import com.xgb.util.MyTools;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
* @Auther: 
* @Date: 2019年12月26日 11:38:57
* @Description:
*/
public class ReadStNjHfgxTbService {

    public static StNjHfgxTb getContent(){
        List<StNjHfgxTb> lists = new ArrayList<StNjHfgxTb>();
        String path = Utils.getResourceBasePath() + "/xgb-data/data-api/config/StNjHfgxTb.txt";
        File file = new File(path);
        StNjHfgxTb  entity = null;
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
    public static StNjHfgxTb getEntity(String result){
        String[] split = result.split("\\|");
        StNjHfgxTb fcc = new StNjHfgxTb();
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
            fcc.setJieci(split[4]);
        }
        if(MyTools.isNotEmpty(split[5])){
            fcc.setZhidingshijian(DateUtils.strToDateLong(split[5]));
        }
        if(MyTools.isNotEmpty(split[6])){
            fcc.setYingjiaohuifei(new BigDecimal(split[6]));
        }
        if(MyTools.isNotEmpty(split[7])){
            fcc.setLibiaodanwei(new BigDecimal(split[7]));
        }
        if(MyTools.isNotEmpty(split[8])){
            fcc.setLishudanwei(new BigDecimal(split[8]));
        }
        if(MyTools.isNotEmpty(split[9])){
            fcc.setLijiaodanwei(new BigDecimal(split[9]));
        }
        if(MyTools.isNotEmpty(split[10])){
            fcc.setLibiaogeren(new BigDecimal(split[10]));
        }
        if(MyTools.isNotEmpty(split[11])){
            fcc.setLishugeren(Integer.parseInt(split[11]));
        }
        if(MyTools.isNotEmpty(split[12])){
            fcc.setLijiaogeren(new BigDecimal(split[12]));
        }
        if(MyTools.isNotEmpty(split[13])){
            fcc.setFubiaodanwei(new BigDecimal(split[13]));
        }
        if(MyTools.isNotEmpty(split[14])){
            fcc.setFushudanwei(Integer.parseInt(split[14]));
        }
        if(MyTools.isNotEmpty(split[15])){
            fcc.setFujiaodanwei(new BigDecimal(split[15]));
        }
        if(MyTools.isNotEmpty(split[16])){
            fcc.setFubiaogeren(new BigDecimal(split[16]));
        }
        if(MyTools.isNotEmpty(split[17])){
            fcc.setFushugeren(Integer.parseInt(split[17]));
        }
        if(MyTools.isNotEmpty(split[18])){
            fcc.setFujiaogeren(new BigDecimal(split[18]));
        }
        if(MyTools.isNotEmpty(split[19])){
            fcc.setChangbiaodanwei(new BigDecimal(split[19]));
        }
        if(MyTools.isNotEmpty(split[20])){
            fcc.setChangshudanwei(Integer.parseInt(split[20]));
        }
        if(MyTools.isNotEmpty(split[21])){
            fcc.setChangjiaodanwei(new BigDecimal(split[21]));
        }
        if(MyTools.isNotEmpty(split[22])){
            fcc.setChangbiaogeren(new BigDecimal(split[22]));
        }
        if(MyTools.isNotEmpty(split[23])){
            fcc.setChangshugeren(Integer.parseInt(split[23]));
        }
        if(MyTools.isNotEmpty(split[24])){
            fcc.setChangjiaogeren(new BigDecimal(split[24]));
        }
        if(MyTools.isNotEmpty(split[25])){
            fcc.setLishibiaodanwei(new BigDecimal(split[25]));
        }
        if(MyTools.isNotEmpty(split[26])){
            fcc.setLishishudanwei(Integer.parseInt(split[26]));
        }
        if(MyTools.isNotEmpty(split[27])){
            fcc.setLishijiaodanwei(new BigDecimal(split[27]));
        }
        if(MyTools.isNotEmpty(split[28])){
            fcc.setLishibiaogeren(new BigDecimal(split[28]));
        }
        if(MyTools.isNotEmpty(split[29])){
            fcc.setLishishugeren(Integer.parseInt(split[29]));
        }
        if(MyTools.isNotEmpty(split[30])){
            fcc.setLishijiaogeren(new BigDecimal(split[30]));
        }
        if(MyTools.isNotEmpty(split[31])){
            fcc.setHuibiaodanwei(new BigDecimal(split[31]));
        }
        if(MyTools.isNotEmpty(split[32])){
            fcc.setHuishudanwei(Integer.parseInt(split[32]));
        }
        if(MyTools.isNotEmpty(split[33])){
            fcc.setHuijiaodanwei(new BigDecimal(split[33]));
        }
        if(MyTools.isNotEmpty(split[34])){
            fcc.setHuibiaogeren(new BigDecimal(split[34]));
        }
        if(MyTools.isNotEmpty(split[35])){
            fcc.setHuishugeren(Integer.parseInt(split[35]));
        }
        if(MyTools.isNotEmpty(split[36])){
            fcc.setHuijiaogeren(new BigDecimal(split[36]));
        }
        if(MyTools.isNotEmpty(split[37])){
            fcc.setZichanzonge(new BigDecimal(split[37]));
        }
        if(MyTools.isNotEmpty(split[38])){
            fcc.setChanzhizonge(new BigDecimal(split[38]));
        }
        if(MyTools.isNotEmpty(split[39])){
            fcc.setDanweichanzhi(new BigDecimal(split[39]));
        }
        if(MyTools.isNotEmpty(split[40])){
            fcc.setHuiyuanbili(split[40]);
        }
        if(MyTools.isNotEmpty(split[41])){
            fcc.setShitishuliang(Integer.parseInt(split[41]));
        }
        if(MyTools.isNotEmpty(split[42])){
            fcc.setShitichanzhi(new BigDecimal(split[42]));
        }
        if(MyTools.isNotEmpty(split[43])){
            fcc.setXinarenshu(Integer.parseInt(split[43]));
        }
        if(MyTools.isNotEmpty(split[44])){
            fcc.setJianyishuliang(split[44]);
        }
        if(MyTools.isNotEmpty(split[45])){
            fcc.setMujizijin(new BigDecimal(split[45]));
        }
        if(MyTools.isNotEmpty(split[46])){
            fcc.setHuijirenqun(Integer.parseInt(split[46]));
        }
        if(MyTools.isNotEmpty(split[47])){
            fcc.setJiuyegangwei(Integer.parseInt(split[47]));
        }
        if(MyTools.isNotEmpty(split[48])){
            fcc.setXinzengshouru(new BigDecimal(split[48]));
        }
        if(MyTools.isNotEmpty(split[49])){
            fcc.setTanpancishu(Integer.parseInt(split[49]));
        }
        if(MyTools.isNotEmpty(split[50])){
            fcc.setTanpanqingkuang(split[50]);
        }
        if(MyTools.isNotEmpty(split[51])){
            fcc.setXingdongcishu(Integer.parseInt(split[51]));
        }
        if(MyTools.isNotEmpty(split[52])){
            fcc.setXingdongqingkuang(split[52]);
        }
        if(MyTools.isNotEmpty(split[53])){
            fcc.setHuodongqingkuang(split[53]);
        }
        if(MyTools.isNotEmpty(split[54])){
            fcc.setFuwuqingkuang(split[54]);
        }
        if(MyTools.isNotEmpty(split[55])){
            fcc.setShenpiriqi(DateUtils.strToDateLong(split[55]));
        }
        if(MyTools.isNotEmpty(split[56])){
            fcc.setQiyejiadanren(split[56]);
        }
        if(MyTools.isNotEmpty(split[57])){
            fcc.setHanggueihangyue(split[57]);
        }
        if(MyTools.isNotEmpty(split[58])){
            fcc.setDaodezhunze(split[58]);
        }
        if(MyTools.isNotEmpty(split[59])){
            fcc.setZilvzhidu(split[59]);
        }
        if(MyTools.isNotEmpty(split[60])){
            fcc.setZilvxuanyan(split[60]);
        }
        if(MyTools.isNotEmpty(split[61])){
            fcc.setDiaochahetongji(split[61]);
        }
        if(MyTools.isNotEmpty(split[62])){
            fcc.setHangyexinxi(split[62]);
        }
        if(MyTools.isNotEmpty(split[63])){
            fcc.setPinpaifuwu(split[63]);
        }
        if(MyTools.isNotEmpty(split[64])){
            fcc.setXietongfazhan(split[64]);
        }

        return fcc;
    }
}

