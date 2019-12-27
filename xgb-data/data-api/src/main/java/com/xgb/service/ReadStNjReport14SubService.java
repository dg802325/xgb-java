package com.xgb.service;

import com.xgb.common.Utils;
import com.xgb.model.StNjReport14Sub;
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
* @Date: 2019年12月24日 16:03:04
* @Description:
*/
public class ReadStNjReport14SubService {

    public static StNjReport14Sub getContent(){
        List<StNjReport14Sub> lists = new ArrayList<StNjReport14Sub>();
        String path = Utils.getResourceBasePath() + "/xgb-data/data-api/config/StNjReport14Sub.txt";
        File file = new File(path);
        StNjReport14Sub  entity = null;
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
    public static StNjReport14Sub getEntity(String result){
        String[] split = result.split("\\|");
        StNjReport14Sub fcc = new StNjReport14Sub();
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
            fcc.setMasterid(Long.parseLong(split[4]));
        }
        if(MyTools.isNotEmpty(split[5])){
            fcc.setXuhao(split[5]);
        }
        if(MyTools.isNotEmpty(split[6])){
            fcc.setLeixing(split[6]);
        }
        if(MyTools.isNotEmpty(split[7])){
            fcc.setHuodongmingcheng(split[7]);
        }
        if(MyTools.isNotEmpty(split[8])){
            fcc.setShijian(split[8]);
        }
        if(MyTools.isNotEmpty(split[9])){
            fcc.setDidian(split[9]);
        }
        if(MyTools.isNotEmpty(split[10])){
            fcc.setPizhundanwei(split[10]);
        }
        if(MyTools.isNotEmpty(split[11])){
            fcc.setShoufeiqingkuang(split[11]);
        }
        if(MyTools.isNotEmpty(split[12])){
            fcc.setShijian3(DateUtils.strToDateLong(split[12]));
        }
        if(MyTools.isNotEmpty(split[13])){
            fcc.setZijinzizou(split[13]);
        }
        if(MyTools.isNotEmpty(split[14])){
            fcc.setJishu(split[14]);
        }
        if(MyTools.isNotEmpty(split[15])){
            fcc.setXinxi(split[15]);
        }
        if(MyTools.isNotEmpty(split[16])){
            fcc.setZhuanjiarencai(split[16]);
        }
        if(MyTools.isNotEmpty(split[17])){
            fcc.setTrain(split[17]);
        }
        if(MyTools.isNotEmpty(split[18])){
            fcc.setProduction(split[18]);
        }
        if(MyTools.isNotEmpty(split[19])){
            fcc.setConsult(split[19]);
        }
        if(MyTools.isNotEmpty(split[20])){
            fcc.setOther(split[20]);
        }
        if(MyTools.isNotEmpty(split[21])){
            fcc.setEducative(split[21]);
        }
        if(MyTools.isNotEmpty(split[22])){
            fcc.setAbility(split[22]);
        }
        if(MyTools.isNotEmpty(split[23])){
            fcc.setTechnology(split[23]);
        }
        if(MyTools.isNotEmpty(split[24])){
            fcc.setFruit(split[24]);
        }
        if(MyTools.isNotEmpty(split[25])){
            fcc.setAgricultural(split[25]);
        }
        if(MyTools.isNotEmpty(split[26])){
            fcc.setFactory(split[26]);
        }
        if(MyTools.isNotEmpty(split[27])){
            fcc.setAquaculture(split[27]);
        }
        if(MyTools.isNotEmpty(split[28])){
            fcc.setManresource(split[28]);
        }
        if(MyTools.isNotEmpty(split[29])){
            fcc.setEconomic(split[29]);
        }
        if(MyTools.isNotEmpty(split[30])){
            fcc.setCulturology(split[30]);
        }
        if(MyTools.isNotEmpty(split[31])){
            fcc.setCharitable(split[31]);
        }
        if(MyTools.isNotEmpty(split[32])){
            fcc.setMedicare(split[32]);
        }
        if(MyTools.isNotEmpty(split[33])){
            fcc.setMarket(split[33]);
        }
        if(MyTools.isNotEmpty(split[34])){
            fcc.setEnvironmental(split[34]);
        }
        if(MyTools.isNotEmpty(split[35])){
            fcc.setBasicorganization(split[35]);
        }
        if(MyTools.isNotEmpty(split[36])){
            fcc.setComplex(split[36]);
        }
        if(MyTools.isNotEmpty(split[37])){
            fcc.setServiceother(split[37]);
        }
        if(MyTools.isNotEmpty(split[38])){
            fcc.setTjnjjieguo1(split[38]);
        }
        if(MyTools.isNotEmpty(split[39])){
            fcc.setTjnjjieguo2(split[39]);
        }
        if(MyTools.isNotEmpty(split[40])){
            fcc.setTjnjyijian1(split[40]);
        }
        if(MyTools.isNotEmpty(split[41])){
            fcc.setTjnjyijian2(split[41]);
        }
        if(MyTools.isNotEmpty(split[42])){
            fcc.setTjnjxingming1(split[42]);
        }
        if(MyTools.isNotEmpty(split[43])){
            fcc.setTjnjxingming2(split[43]);
        }
        if(MyTools.isNotEmpty(split[44])){
            fcc.setTjnjshijian1(DateUtils.strToDateLong(split[44]));
        }
        if(MyTools.isNotEmpty(split[45])){
            fcc.setTjnjshijian2(DateUtils.strToDateLong(split[45]));
        }
        if(MyTools.isNotEmpty(split[46])){
            fcc.setDidian1(split[46]);
        }
        if(MyTools.isNotEmpty(split[47])){
            fcc.setWuciqingkuang(split[47]);
        }

        return fcc;
    }
}

