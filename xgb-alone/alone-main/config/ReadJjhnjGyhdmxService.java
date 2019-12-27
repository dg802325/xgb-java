package com.xgb.service;

import com.xgb.common.Utils;
import com.xgb.model.JjhnjGyhdmx;
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
* @Date: 2019年12月24日 16:09:20
* @Description:
*/
public class ReadJjhnjGyhdmxService {

    public static JjhnjGyhdmx getContent(){
        List<JjhnjGyhdmx> lists = new ArrayList<JjhnjGyhdmx>();
        String path = Utils.getResourceBasePath() + "/xgb-data/data-api/config/JjhnjGyhdmx.txt";
        File file = new File(path);
        JjhnjGyhdmx  entity = null;
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
    public static JjhnjGyhdmx getEntity(String result){
        String[] split = result.split("\\|");
        JjhnjGyhdmx fcc = new JjhnjGyhdmx();
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
            fcc.setHuodongshu(Integer.parseInt(split[4]));
        }
        if(MyTools.isNotEmpty(split[5])){
            fcc.setTjnjshijian1(DateUtils.strToDateLong(split[5]));
        }
        if(MyTools.isNotEmpty(split[6])){
            fcc.setTjnjshijian2(DateUtils.strToDateLong(split[6]));
        }
        if(MyTools.isNotEmpty(split[7])){
            fcc.setWuciqingkuang(split[7]);
        }

        return fcc;
    }
}

