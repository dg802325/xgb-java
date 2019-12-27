package com.xgb.service;

import com.xgb.common.Utils;
import com.xgb.model.StNjAdministratCostInx;
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
* @Date: 2019年12月24日 16:06:14
* @Description:
*/
public class ReadStNjAdministratCostInxService {

    public static StNjAdministratCostInx getContent(){
        List<StNjAdministratCostInx> lists = new ArrayList<StNjAdministratCostInx>();
        String path = Utils.getResourceBasePath() + "/xgb-data/data-api/config/StNjAdministratCostInx.txt";
        File file = new File(path);
        StNjAdministratCostInx  entity = null;
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
    public static StNjAdministratCostInx getEntity(String result){
        String[] split = result.split("\\|");
        StNjAdministratCostInx fcc = new StNjAdministratCostInx();
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
            fcc.setXingzhengshoufeizonge(new BigDecimal(split[5]));
        }
        if(MyTools.isNotEmpty(split[6])){
            fcc.setShifoushanzigenggai(split[6]);
        }
        if(MyTools.isNotEmpty(split[7])){
            fcc.setShanzishejijine(new BigDecimal(split[7]));
        }
        if(MyTools.isNotEmpty(split[8])){
            fcc.setZixingjianmianshoufei(new BigDecimal(split[8]));
        }
        if(MyTools.isNotEmpty(split[9])){
            fcc.setJianmianshoufeijutiqingkuang(split[9]);
        }
        if(MyTools.isNotEmpty(split[10])){
            fcc.setZhenggaijine(new BigDecimal(split[10]));
        }
        if(MyTools.isNotEmpty(split[11])){
            fcc.setZhenggaijinejutiqingkuang(split[11]);
        }
        if(MyTools.isNotEmpty(split[12])){
            fcc.setWuciqingkuang(split[12]);
        }

        return fcc;
    }
}

