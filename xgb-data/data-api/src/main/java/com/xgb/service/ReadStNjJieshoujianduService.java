package com.xgb.service;

import com.xgb.common.Utils;
import com.xgb.model.StNjJieshoujiandu;
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
* @Date: 2019年12月24日 15:59:33
* @Description:
*/
public class ReadStNjJieshoujianduService {

    public static List<StNjJieshoujiandu> getContent(){
        List<StNjJieshoujiandu> lists = new ArrayList<StNjJieshoujiandu>();
        String path = Utils.getResourceBasePath() + "/xgb-data/data-api/config/StNjJieshoujiandu.txt";
        File file = new File(path);
        StNjJieshoujiandu  entity = null;
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
    public static StNjJieshoujiandu getEntity(String result){
        String[] split = result.split("\\|");
        StNjJieshoujiandu fcc = new StNjJieshoujiandu();
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
            fcc.setNianjianjielun1(split[4]);
        }
        if(MyTools.isNotEmpty(split[5])){
            fcc.setZhenggai1(split[5]);
        }
        if(MyTools.isNotEmpty(split[6])){
            fcc.setNianjianjielun2(split[6]);
        }
        if(MyTools.isNotEmpty(split[7])){
            fcc.setZhenggai2(split[7]);
        }
        if(MyTools.isNotEmpty(split[8])){
            fcc.setNianjianjielun3(split[8]);
        }
        if(MyTools.isNotEmpty(split[9])){
            fcc.setZhenggai3(split[9]);
        }
        if(MyTools.isNotEmpty(split[10])){
            fcc.setRadiobutton(split[10]);
        }
        if(MyTools.isNotEmpty(split[11])){
            fcc.setPinggunian(split[11]);
        }
        if(MyTools.isNotEmpty(split[12])){
            fcc.setPingguyue(split[12]);
        }
        if(MyTools.isNotEmpty(split[13])){
            fcc.setPingguri(split[13]);
        }
        if(MyTools.isNotEmpty(split[14])){
            fcc.setPinggujieguo(split[14]);
        }
        if(MyTools.isNotEmpty(split[15])){
            fcc.setNian2(split[15]);
        }
        if(MyTools.isNotEmpty(split[16])){
            fcc.setYue2(split[16]);
        }
        if(MyTools.isNotEmpty(split[17])){
            fcc.setRi2(split[17]);
        }
        if(MyTools.isNotEmpty(split[18])){
            fcc.setRadiobutton2(split[18]);
        }
        if(MyTools.isNotEmpty(split[19])){
            fcc.setShenjijigou1(split[19]);
        }
        if(MyTools.isNotEmpty(split[20])){
            fcc.setBaogaoyongtu1(split[20]);
        }
        if(MyTools.isNotEmpty(split[21])){
            fcc.setRadiobutton3(split[21]);
        }
        if(MyTools.isNotEmpty(split[22])){
            fcc.setShenjijigou2(split[22]);
        }
        if(MyTools.isNotEmpty(split[23])){
            fcc.setBaogaoyongtu2(split[23]);
        }
        if(MyTools.isNotEmpty(split[24])){
            fcc.setRadiobutton4(split[24]);
        }
        if(MyTools.isNotEmpty(split[25])){
            fcc.setShenjijigou3(split[25]);
        }
        if(MyTools.isNotEmpty(split[26])){
            fcc.setBaogaoyongtu3(split[26]);
        }
        if(MyTools.isNotEmpty(split[27])){
            fcc.setRadiobutton5(split[27]);
        }
        if(MyTools.isNotEmpty(split[28])){
            fcc.setNian3(split[28]);
        }
        if(MyTools.isNotEmpty(split[29])){
            fcc.setYue3(split[29]);
        }
        if(MyTools.isNotEmpty(split[30])){
            fcc.setRi3(split[30]);
        }
        if(MyTools.isNotEmpty(split[31])){
            fcc.setChufazhonglei(split[31]);
        }
        if(MyTools.isNotEmpty(split[32])){
            fcc.setShishijiguan(split[32]);
        }
        if(MyTools.isNotEmpty(split[33])){
            fcc.setWeifaxingwei(split[33]);
        }
        if(MyTools.isNotEmpty(split[34])){
            fcc.setTjnjjieguo1(split[34]);
        }
        if(MyTools.isNotEmpty(split[35])){
            fcc.setTjnjjieguo2(split[35]);
        }
        if(MyTools.isNotEmpty(split[36])){
            fcc.setTjnjyijian1(split[36]);
        }
        if(MyTools.isNotEmpty(split[37])){
            fcc.setTjnjyijian2(split[37]);
        }
        if(MyTools.isNotEmpty(split[38])){
            fcc.setTjnjxingming1(split[38]);
        }
        if(MyTools.isNotEmpty(split[39])){
            fcc.setTjnjxingming2(split[39]);
        }
        if(MyTools.isNotEmpty(split[40])){
            fcc.setTjnjshijian1(DateUtils.strToDateLong(split[40]));
        }
        if(MyTools.isNotEmpty(split[41])){
            fcc.setTjnjshijian2(DateUtils.strToDateLong(split[41]));
        }
        if(MyTools.isNotEmpty(split[42])){
            fcc.setShuiqiankouchu(split[42]);
        }
        if(MyTools.isNotEmpty(split[43])){
            fcc.setMianshuizige(split[43]);
        }
        if(MyTools.isNotEmpty(split[44])){
            fcc.setKouchunian(split[44]);
        }
        if(MyTools.isNotEmpty(split[45])){
            fcc.setMianshuinian(split[45]);
        }

        return fcc;
    }
}

