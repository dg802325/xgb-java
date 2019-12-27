package com.xgb.service;

import com.xgb.common.Utils;
import com.xgb.model.StNjReport15;
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
* @Date: 2019年12月25日 17:41:28
* @Description:
*/
public class ReadStNjReport15Service {

    public static List<StNjReport15> getContent(){
        List<StNjReport15> lists = new ArrayList<StNjReport15>();
        String path = Utils.getResourceBasePath() + "/xgb-data/data-api/config/StNjReport15.txt";
        File file = new File(path);
        StNjReport15  entity = null;
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
    public static StNjReport15 getEntity(String result){
        String[] split = result.split("\\|");
        StNjReport15 fcc = new StNjReport15();
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
            fcc.setXianjin1(new BigDecimal(split[4]));
        }
        if(MyTools.isNotEmpty(split[5])){
            fcc.setFeixianjinzhehe1(new BigDecimal(split[5]));
        }
        if(MyTools.isNotEmpty(split[6])){
            fcc.setHeji1(new BigDecimal(split[6]));
        }
        if(MyTools.isNotEmpty(split[7])){
            fcc.setXianjin2(new BigDecimal(split[7]));
        }
        if(MyTools.isNotEmpty(split[8])){
            fcc.setFeixianjinzhehe2(new BigDecimal(split[8]));
        }
        if(MyTools.isNotEmpty(split[9])){
            fcc.setHeji2(new BigDecimal(split[9]));
        }
        if(MyTools.isNotEmpty(split[10])){
            fcc.setXianjin3(new BigDecimal(split[10]));
        }
        if(MyTools.isNotEmpty(split[11])){
            fcc.setFeixianjinzhehe3(new BigDecimal(split[11]));
        }
        if(MyTools.isNotEmpty(split[12])){
            fcc.setHeji3(new BigDecimal(split[12]));
        }
        if(MyTools.isNotEmpty(split[13])){
            fcc.setXianjin4(new BigDecimal(split[13]));
        }
        if(MyTools.isNotEmpty(split[14])){
            fcc.setFeixianjinzhehe4(new BigDecimal(split[14]));
        }
        if(MyTools.isNotEmpty(split[15])){
            fcc.setHeji4(new BigDecimal(split[15]));
        }
        if(MyTools.isNotEmpty(split[16])){
            fcc.setXianjin5(new BigDecimal(split[16]));
        }
        if(MyTools.isNotEmpty(split[17])){
            fcc.setFeixianjinzhehe5(new BigDecimal(split[17]));
        }
        if(MyTools.isNotEmpty(split[18])){
            fcc.setHeji5(new BigDecimal(split[18]));
        }
        if(MyTools.isNotEmpty(split[19])){
            fcc.setXianjin6(new BigDecimal(split[19]));
        }
        if(MyTools.isNotEmpty(split[20])){
            fcc.setFeixianjinzhehe6(new BigDecimal(split[20]));
        }
        if(MyTools.isNotEmpty(split[21])){
            fcc.setHeji6(new BigDecimal(split[21]));
        }
        if(MyTools.isNotEmpty(split[22])){
            fcc.setXianjin7(new BigDecimal(split[22]));
        }
        if(MyTools.isNotEmpty(split[23])){
            fcc.setFeixianjinzhehe7(new BigDecimal(split[23]));
        }
        if(MyTools.isNotEmpty(split[24])){
            fcc.setHeji7(new BigDecimal(split[24]));
        }
        if(MyTools.isNotEmpty(split[25])){
            fcc.setZhuyaoyongtuheshiyongqingkuang(split[25]);
        }
        if(MyTools.isNotEmpty(split[26])){
            fcc.setShouru06(new BigDecimal(split[26]));
        }
        if(MyTools.isNotEmpty(split[27])){
            fcc.setShouru07(new BigDecimal(split[27]));
        }
        if(MyTools.isNotEmpty(split[28])){
            fcc.setShouru08(new BigDecimal(split[28]));
        }
        if(MyTools.isNotEmpty(split[29])){
            fcc.setZhichu06(new BigDecimal(split[29]));
        }
        if(MyTools.isNotEmpty(split[30])){
            fcc.setZhichu07(new BigDecimal(split[30]));
        }
        if(MyTools.isNotEmpty(split[31])){
            fcc.setZhichu08(new BigDecimal(split[31]));
        }
        if(MyTools.isNotEmpty(split[32])){
            fcc.setGongyizhichu06(new BigDecimal(split[32]));
        }
        if(MyTools.isNotEmpty(split[33])){
            fcc.setGongyizhichu07(new BigDecimal(split[33]));
        }
        if(MyTools.isNotEmpty(split[34])){
            fcc.setGongyizhichu08(new BigDecimal(split[34]));
        }
        if(MyTools.isNotEmpty(split[35])){
            fcc.setShangnianbili06(split[35]);
        }
        if(MyTools.isNotEmpty(split[36])){
            fcc.setShangnianbili07(split[36]);
        }
        if(MyTools.isNotEmpty(split[37])){
            fcc.setShangnianbili08(split[37]);
        }
        if(MyTools.isNotEmpty(split[38])){
            fcc.setBennianbili06(split[38]);
        }
        if(MyTools.isNotEmpty(split[39])){
            fcc.setBennianbili07(split[39]);
        }
        if(MyTools.isNotEmpty(split[40])){
            fcc.setBennianbili08(split[40]);
        }
        if(MyTools.isNotEmpty(split[41])){
            fcc.setTjnjjieguo1(split[41]);
        }
        if(MyTools.isNotEmpty(split[42])){
            fcc.setTjnjjieguo2(split[42]);
        }
        if(MyTools.isNotEmpty(split[43])){
            fcc.setTjnjyijian1(split[43]);
        }
        if(MyTools.isNotEmpty(split[44])){
            fcc.setTjnjyijian2(split[44]);
        }
        if(MyTools.isNotEmpty(split[45])){
            fcc.setTjnjxingming1(split[45]);
        }
        if(MyTools.isNotEmpty(split[46])){
            fcc.setTjnjxingming2(split[46]);
        }
        if(MyTools.isNotEmpty(split[47])){
            fcc.setTjnjshijian1(DateUtils.strToDateLong(split[47]));
        }
        if(MyTools.isNotEmpty(split[48])){
            fcc.setTjnjshijian2(DateUtils.strToDateLong(split[48]));
        }
        if(MyTools.isNotEmpty(split[49])){
            fcc.setJuanzenghetong(split[49]);
        }
        if(MyTools.isNotEmpty(split[50])){
            fcc.setJuanzengshu(Long.parseLong(split[50]));
        }
        if(MyTools.isNotEmpty(split[51])){
            fcc.setWuciqingkuang(split[51]);
        }

        return fcc;
    }
}

