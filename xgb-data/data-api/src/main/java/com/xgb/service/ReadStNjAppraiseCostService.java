package com.xgb.service;

import com.xgb.common.Utils;
import com.xgb.model.StNjAppraiseCost;
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
* @Date: 2019年12月24日 16:03:48
* @Description:
*/
public class ReadStNjAppraiseCostService {

    public static List<StNjAppraiseCost> getContent(){
        List<StNjAppraiseCost> lists = new ArrayList<StNjAppraiseCost>();
        String path = Utils.getResourceBasePath() + "/xgb-data/data-api/config/StNjAppraiseCost.txt";
        File file = new File(path);
        StNjAppraiseCost  entity = null;
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
    public static StNjAppraiseCost getEntity(String result){
        String[] split = result.split("\\|");
        StNjAppraiseCost fcc = new StNjAppraiseCost();
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
            fcc.setXuhao(Long.parseLong(split[5]));
        }
        if(MyTools.isNotEmpty(split[6])){
            fcc.setBiaozhangxiangmu(split[6]);
        }
        if(MyTools.isNotEmpty(split[7])){
            fcc.setShoufeibiaozhu(new BigDecimal(split[7]));
        }
        if(MyTools.isNotEmpty(split[8])){
            fcc.setSheliyiju(split[8]);
        }
        if(MyTools.isNotEmpty(split[9])){
            fcc.setZichaqingliyijian(split[9]);
        }
        if(MyTools.isNotEmpty(split[10])){
            fcc.setBiaozhangshoufeizonge(new BigDecimal(split[10]));
        }
        if(MyTools.isNotEmpty(split[11])){
            fcc.setShifouqiangzhidabiao(split[11]);
        }
        if(MyTools.isNotEmpty(split[12])){
            fcc.setQiangzhishejijine(new BigDecimal(split[12]));
        }
        if(MyTools.isNotEmpty(split[13])){
            fcc.setZixingjianmianhuifei(new BigDecimal(split[13]));
        }
        if(MyTools.isNotEmpty(split[14])){
            fcc.setJianmianhuifeijutiqingkuang(split[14]);
        }
        if(MyTools.isNotEmpty(split[15])){
            fcc.setZhenggaijine(new BigDecimal(split[15]));
        }
        if(MyTools.isNotEmpty(split[16])){
            fcc.setZhenggaijinejutiqingkuang(split[16]);
        }
        if(MyTools.isNotEmpty(split[17])){
            fcc.setHeji(new BigDecimal(split[17]));
        }

        return fcc;
    }
}

