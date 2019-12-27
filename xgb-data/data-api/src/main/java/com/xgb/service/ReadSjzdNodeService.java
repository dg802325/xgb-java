package com.xgb.service;

import com.xgb.common.Utils;
import com.xgb.model.SjzdNode;
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
* @Date: 2019年12月27日 10:16:59
* @Description:
*/
public class ReadSjzdNodeService {

    public static SjzdNode getContent(){
        List<SjzdNode> lists = new ArrayList<SjzdNode>();
        String path = Utils.getResourceBasePath() + "/xgb-data/data-api/config/SjzdNode.txt";
        File file = new File(path);
        SjzdNode  entity = null;
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
    public static SjzdNode getEntity(String result){
        String[] split = result.split("\\|");
        SjzdNode fcc = new SjzdNode();
        if(MyTools.isNotEmpty(split[0])){
            fcc.setId(Integer.parseInt(split[0]));
        }
        if(MyTools.isNotEmpty(split[1])){
            fcc.setParentid(Integer.parseInt(split[1]));
        }
        if(MyTools.isNotEmpty(split[2])){
            fcc.setNodeName(split[2]);
        }
        if(MyTools.isNotEmpty(split[3])){
            fcc.setNodeTypename(split[3]);
        }
        if(MyTools.isNotEmpty(split[4])){
            fcc.setNodeLevel(Integer.parseInt(split[4]));
        }
        if(MyTools.isNotEmpty(split[5])){
            fcc.setNodeValue(split[5]);
        }
        if(MyTools.isNotEmpty(split[6])){
            fcc.setNodeIndex(Integer.parseInt(split[6]));
        }
        if(MyTools.isNotEmpty(split[7])){
            fcc.setInstitutionid(Long.parseLong(split[7]));
        }
        if(MyTools.isNotEmpty(split[8])){
            fcc.setState(Short.parseShort(split[8]));
        }

        return fcc;
    }
}

