package com.xgb.service;

import com.xgb.common.Utils;
import com.xgb.model.StNjReport17Sub1;
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
* @Date: 2019年12月24日 16:02:02
* @Description:
*/
public class ReadStNjReport17Sub1Service {

    public static StNjReport17Sub1 getContent(){
        List<StNjReport17Sub1> lists = new ArrayList<StNjReport17Sub1>();
        String path = Utils.getResourceBasePath() + "/xgb-data/data-api/config/StNjReport17Sub1.txt";
        File file = new File(path);
        StNjReport17Sub1  entity = null;
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
    public static StNjReport17Sub1 getEntity(String result){
        String[] split = result.split("\\|");
        StNjReport17Sub1 fcc = new StNjReport17Sub1();
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
            fcc.setGuojizuzhileixing(split[6]);
        }
        if(MyTools.isNotEmpty(split[7])){
            fcc.setZhiwuleixing(split[7]);
        }
        if(MyTools.isNotEmpty(split[8])){
            fcc.setGuojizuzhimingcheng(split[8]);
        }
        if(MyTools.isNotEmpty(split[9])){
            fcc.setCanjiashijian(DateUtils.strToDateLong(split[9]));
        }
        if(MyTools.isNotEmpty(split[10])){
            fcc.setJiaonahuifeishue(Integer.parseInt(split[10]));
        }
        if(MyTools.isNotEmpty(split[11])){
            fcc.setRenzhiqishishijian(DateUtils.strToDateLong(split[11]));
        }
        if(MyTools.isNotEmpty(split[12])){
            fcc.setRenzhizhongzhishijian(DateUtils.strToDateLong(split[12]));
        }
        if(MyTools.isNotEmpty(split[13])){
            fcc.setTjnjjieguo1(split[13]);
        }
        if(MyTools.isNotEmpty(split[14])){
            fcc.setTjnjjieguo2(split[14]);
        }
        if(MyTools.isNotEmpty(split[15])){
            fcc.setTjnjyijian1(split[15]);
        }
        if(MyTools.isNotEmpty(split[16])){
            fcc.setTjnjyijian2(split[16]);
        }
        if(MyTools.isNotEmpty(split[17])){
            fcc.setTjnjxingming1(split[17]);
        }
        if(MyTools.isNotEmpty(split[18])){
            fcc.setTjnjxingming2(split[18]);
        }
        if(MyTools.isNotEmpty(split[19])){
            fcc.setTjnjshijian1(DateUtils.strToDateLong(split[19]));
        }
        if(MyTools.isNotEmpty(split[20])){
            fcc.setTjnjshijian2(DateUtils.strToDateLong(split[20]));
        }
        if(MyTools.isNotEmpty(split[21])){
            fcc.setZiduan3(split[21]);
        }
        if(MyTools.isNotEmpty(split[22])){
            fcc.setZiduan4(split[22]);
        }
        if(MyTools.isNotEmpty(split[23])){
            fcc.setZiduan5(split[23]);
        }
        if(MyTools.isNotEmpty(split[24])){
            fcc.setZiduan6(split[24]);
        }

        return fcc;
    }
}

