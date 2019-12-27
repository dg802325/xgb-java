package com.xgb.service;

import com.xgb.common.Utils;
import com.xgb.model.MjzzDictionary;
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
* @Date: 2019年12月27日 10:38:06
* @Description:
*/
public class ReadMjzzDictionaryService {

    public static List<MjzzDictionary> getContent(){
        List<MjzzDictionary> lists = new ArrayList<MjzzDictionary>();
        String path = Utils.getResourceBasePath() + "/xgb-data/data-api/config/MjzzDictionary.txt";
        File file = new File(path);
        MjzzDictionary  entity = null;
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
    public static MjzzDictionary getEntity(String result){
        String[] split = result.split("\\|");
        MjzzDictionary fcc = new MjzzDictionary();
        if(MyTools.isNotEmpty(split[0])){
            fcc.setId(Long.parseLong(split[0]));
        }
        if(MyTools.isNotEmpty(split[1])){
            fcc.setParentid(Long.parseLong(split[1]));
        }
        if(MyTools.isNotEmpty(split[2])){
            fcc.setDeptid(Long.parseLong(split[2]));
        }
        if(MyTools.isNotEmpty(split[3])){
            fcc.setUserid(split[3]);
        }
        if(MyTools.isNotEmpty(split[4])){
            fcc.setName(split[4]);
        }
        if(MyTools.isNotEmpty(split[5])){
            fcc.setLev(Integer.parseInt(split[5]));
        }
        if(MyTools.isNotEmpty(split[6])){
            fcc.setVal(split[6]);
        }
        if(MyTools.isNotEmpty(split[7])){
            fcc.setInd(Integer.parseInt(split[7]));
        }
        if(MyTools.isNotEmpty(split[8])){
            fcc.setStatus(Short.parseShort(split[8]));
        }
        if(MyTools.isNotEmpty(split[9])){
            fcc.setTypename(split[9]);
        }
        if(MyTools.isNotEmpty(split[10])){
            fcc.setType(Short.parseShort(split[10]));
        }

        return fcc;
    }
}

