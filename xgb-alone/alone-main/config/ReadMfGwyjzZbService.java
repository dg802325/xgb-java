package com.xgb.service;

import com.xgb.common.Utils;
import com.xgb.model.MfGwyjzZb;
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
* @Date: 2019年12月24日 16:07:46
* @Description:
*/
public class ReadMfGwyjzZbService {

    public static MfGwyjzZb getContent(){
        List<MfGwyjzZb> lists = new ArrayList<MfGwyjzZb>();
        String path = Utils.getResourceBasePath() + "/xgb-data/data-api/config/MfGwyjzZb.txt";
        File file = new File(path);
        MfGwyjzZb  entity = null;
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
    public static MfGwyjzZb getEntity(String result){
        String[] split = result.split("\\|");
        MfGwyjzZb fcc = new MfGwyjzZb();
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
            fcc.setXingming(split[6]);
        }
        if(MyTools.isNotEmpty(split[7])){
            fcc.setChushengnianyue(DateUtils.strToDateLong(split[7]));
        }
        if(MyTools.isNotEmpty(split[8])){
            fcc.setDanweizhiwu(split[8]);
        }
        if(MyTools.isNotEmpty(split[9])){
            fcc.setGongzuodanwei(split[9]);
        }
        if(MyTools.isNotEmpty(split[10])){
            fcc.setZaizhizhuangtai(split[10]);
        }
        if(MyTools.isNotEmpty(split[11])){
            fcc.setLingchouqingkuang(split[11]);
        }
        if(MyTools.isNotEmpty(split[12])){
            fcc.setPizhundanwei(split[12]);
        }
        if(MyTools.isNotEmpty(split[13])){
            fcc.setPizhunshijian(DateUtils.strToDateLong(split[13]));
        }
        if(MyTools.isNotEmpty(split[14])){
            fcc.setZhiwu(split[14]);
        }
        if(MyTools.isNotEmpty(split[15])){
            fcc.setXingbie(split[15]);
        }
        if(MyTools.isNotEmpty(split[16])){
            fcc.setShetuanzhiwu(split[16]);
        }

        return fcc;
    }
}

