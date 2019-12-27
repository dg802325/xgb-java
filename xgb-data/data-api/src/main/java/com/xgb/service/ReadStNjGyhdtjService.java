package com.xgb.service;

import com.xgb.common.Utils;
import com.xgb.model.StNjGyhdtj;
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
* @Date: 2019年12月25日 19:46:14
* @Description:
*/
public class ReadStNjGyhdtjService {

    public static List<StNjGyhdtj> getContent(){
        List<StNjGyhdtj> lists = new ArrayList<StNjGyhdtj>();
        String path = Utils.getResourceBasePath() + "/xgb-data/data-api/config/StNjGyhdtj.txt";
        File file = new File(path);
        StNjGyhdtj  entity = null;
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
    public static StNjGyhdtj getEntity(String result){
        String[] split = result.split("\\|");
        StNjGyhdtj fcc = new StNjGyhdtj();
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
            fcc.setZongshouru1(split[4]);
        }
        if(MyTools.isNotEmpty(split[5])){
            fcc.setZongzhichu1(split[5]);
        }
        if(MyTools.isNotEmpty(split[6])){
            fcc.setZhichu1(split[6]);
        }
        if(MyTools.isNotEmpty(split[7])){
            fcc.setShangnianduzhanbi1(split[7]);
        }
        if(MyTools.isNotEmpty(split[8])){
            fcc.setBennianduzhanbi1(split[8]);
        }
        if(MyTools.isNotEmpty(split[9])){
            fcc.setZongshouru2(split[9]);
        }
        if(MyTools.isNotEmpty(split[10])){
            fcc.setZongzhichu2(split[10]);
        }
        if(MyTools.isNotEmpty(split[11])){
            fcc.setZhichu2(split[11]);
        }
        if(MyTools.isNotEmpty(split[12])){
            fcc.setShangnianduzhanbi2(split[12]);
        }
        if(MyTools.isNotEmpty(split[13])){
            fcc.setBennianduzhanbi2(split[13]);
        }
        if(MyTools.isNotEmpty(split[14])){
            fcc.setZongshouru3(split[14]);
        }
        if(MyTools.isNotEmpty(split[15])){
            fcc.setZongzhichu3(split[15]);
        }
        if(MyTools.isNotEmpty(split[16])){
            fcc.setZhichu3(split[16]);
        }
        if(MyTools.isNotEmpty(split[17])){
            fcc.setShangnianduzhanbi3(split[17]);
        }
        if(MyTools.isNotEmpty(split[18])){
            fcc.setBennianduzhanbi3(split[18]);
        }
        if(MyTools.isNotEmpty(split[19])){
            fcc.setZongshouru4(split[19]);
        }
        if(MyTools.isNotEmpty(split[20])){
            fcc.setZongzhichu4(split[20]);
        }
        if(MyTools.isNotEmpty(split[21])){
            fcc.setZhichu4(split[21]);
        }
        if(MyTools.isNotEmpty(split[22])){
            fcc.setShangnianduzhanbi4(split[22]);
        }
        if(MyTools.isNotEmpty(split[23])){
            fcc.setBennianduzhanbi4(split[23]);
        }

        return fcc;
    }
}

