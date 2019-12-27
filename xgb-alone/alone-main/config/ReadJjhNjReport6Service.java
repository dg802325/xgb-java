package com.xgb.service;

import com.xgb.common.Utils;
import com.xgb.model.JjhNjReport6;
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
* @Date: 2019年12月24日 16:00:15
* @Description:
*/
public class ReadJjhNjReport6Service {

    public static JjhNjReport6 getContent(){
        List<JjhNjReport6> lists = new ArrayList<JjhNjReport6>();
        String path = Utils.getResourceBasePath() + "/xgb-data/data-api/config/JjhNjReport6.txt";
        File file = new File(path);
        JjhNjReport6  entity = null;
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
    public static JjhNjReport6 getEntity(String result){
        String[] split = result.split("\\|");
        JjhNjReport6 fcc = new JjhNjReport6();
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
            fcc.setBianzhidanwei(split[4]);
        }
        if(MyTools.isNotEmpty(split[5])){
            fcc.setNiandu(split[5]);
        }
        if(MyTools.isNotEmpty(split[6])){
            fcc.setJieshoujuanzeng(Integer.parseInt(split[6]));
        }
        if(MyTools.isNotEmpty(split[7])){
            fcc.setShouquhuifei(Integer.parseInt(split[7]));
        }
        if(MyTools.isNotEmpty(split[8])){
            fcc.setTigongfuwu(Integer.parseInt(split[8]));
        }
        if(MyTools.isNotEmpty(split[9])){
            fcc.setXiaoshoushangpin(Integer.parseInt(split[9]));
        }
        if(MyTools.isNotEmpty(split[10])){
            fcc.setZhengfubuzhu(Integer.parseInt(split[10]));
        }
        if(MyTools.isNotEmpty(split[11])){
            fcc.setShoudaoqitayewu(Integer.parseInt(split[11]));
        }
        if(MyTools.isNotEmpty(split[12])){
            fcc.setYewuliuruxiaoji(Integer.parseInt(split[12]));
        }
        if(MyTools.isNotEmpty(split[13])){
            fcc.setJuanzengzhifu(Integer.parseInt(split[13]));
        }
        if(MyTools.isNotEmpty(split[14])){
            fcc.setZhifuyuangong(Integer.parseInt(split[14]));
        }
        if(MyTools.isNotEmpty(split[15])){
            fcc.setShangpinfuwuzhifu(Integer.parseInt(split[15]));
        }
        if(MyTools.isNotEmpty(split[16])){
            fcc.setZhifuqitayewu(Integer.parseInt(split[16]));
        }
        if(MyTools.isNotEmpty(split[17])){
            fcc.setYewuliuchuxiaoji(Integer.parseInt(split[17]));
        }
        if(MyTools.isNotEmpty(split[18])){
            fcc.setYewujinge(Integer.parseInt(split[18]));
        }
        if(MyTools.isNotEmpty(split[19])){
            fcc.setShouhuitouzi(Integer.parseInt(split[19]));
        }
        if(MyTools.isNotEmpty(split[20])){
            fcc.setTouzishouyi(Integer.parseInt(split[20]));
        }
        if(MyTools.isNotEmpty(split[21])){
            fcc.setChuzhizichanshouhui(Integer.parseInt(split[21]));
        }
        if(MyTools.isNotEmpty(split[22])){
            fcc.setShoudaoqitatouzi(Integer.parseInt(split[22]));
        }
        if(MyTools.isNotEmpty(split[23])){
            fcc.setTouziliuruxiaoji(Integer.parseInt(split[23]));
        }
        if(MyTools.isNotEmpty(split[24])){
            fcc.setGoujianzichanzhifu(Integer.parseInt(split[24]));
        }
        if(MyTools.isNotEmpty(split[25])){
            fcc.setTouzizhifu(Integer.parseInt(split[25]));
        }
        if(MyTools.isNotEmpty(split[26])){
            fcc.setZhifuqitatouzi(Integer.parseInt(split[26]));
        }
        if(MyTools.isNotEmpty(split[27])){
            fcc.setTouziliuchuxiaoji(Integer.parseInt(split[27]));
        }
        if(MyTools.isNotEmpty(split[28])){
            fcc.setTouzijinge(Integer.parseInt(split[28]));
        }
        if(MyTools.isNotEmpty(split[29])){
            fcc.setJiekuanshoudao(Integer.parseInt(split[29]));
        }
        if(MyTools.isNotEmpty(split[30])){
            fcc.setShoudaoqitachouzi(Integer.parseInt(split[30]));
        }
        if(MyTools.isNotEmpty(split[31])){
            fcc.setChouziliuruxiaoji(Integer.parseInt(split[31]));
        }
        if(MyTools.isNotEmpty(split[32])){
            fcc.setJiekuanzhifu(Integer.parseInt(split[32]));
        }
        if(MyTools.isNotEmpty(split[33])){
            fcc.setLixizhifu(Integer.parseInt(split[33]));
        }
        if(MyTools.isNotEmpty(split[34])){
            fcc.setZhifuqitachouzi(Integer.parseInt(split[34]));
        }
        if(MyTools.isNotEmpty(split[35])){
            fcc.setChouziliuchuxiaoji(Integer.parseInt(split[35]));
        }
        if(MyTools.isNotEmpty(split[36])){
            fcc.setChouzijinge(Integer.parseInt(split[36]));
        }
        if(MyTools.isNotEmpty(split[37])){
            fcc.setHuilvyingxiange(Integer.parseInt(split[37]));
        }
        if(MyTools.isNotEmpty(split[38])){
            fcc.setXianjinzengjiae(Integer.parseInt(split[38]));
        }
        if(MyTools.isNotEmpty(split[39])){
            fcc.setTjnjjieguo1(split[39]);
        }
        if(MyTools.isNotEmpty(split[40])){
            fcc.setTjnjjieguo2(split[40]);
        }
        if(MyTools.isNotEmpty(split[41])){
            fcc.setTjnjyijian1(split[41]);
        }
        if(MyTools.isNotEmpty(split[42])){
            fcc.setTjnjyijian2(split[42]);
        }
        if(MyTools.isNotEmpty(split[43])){
            fcc.setTjnjxingming1(split[43]);
        }
        if(MyTools.isNotEmpty(split[44])){
            fcc.setTjnjxingming2(split[44]);
        }
        if(MyTools.isNotEmpty(split[45])){
            fcc.setTjnjshijian1(DateUtils.strToDateLong(split[45]));
        }
        if(MyTools.isNotEmpty(split[46])){
            fcc.setTjnjshijian2(DateUtils.strToDateLong(split[46]));
        }

        return fcc;
    }
}

