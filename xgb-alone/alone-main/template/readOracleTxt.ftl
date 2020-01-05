package com.xgb.service;

import com.xgb.common.Utils;
import com.xgb.model.${modelName!};
import com.xgb.util.DateUtils;
import com.xgb.util.MyTools;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
* @Auther: ${author!}
* @Date: ${date!}
* @Description:
*/
public class Read${modelName!}Service {

    public static ${modelName!} getContent(){
        List<${modelName!}> lists = new ArrayList<${modelName!}>();
        String path = Utils.getResourceBasePath() + "/xgb-data/data-api/config/${modelName!}.txt";
        File file = new File(path);
        ${modelName!}  entity = null;
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
					//输出读出的所有数据（StringBuilder类型）
					entity = getEntity(result.append(linetxt).toString());
					lists.add(entity);
                }
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
    public static ${modelName!} getEntity(String result){
        String[] split = result.split("\\|");
        ${modelName!} fcc = new ${modelName!}();
${codeEntity2!}
        return fcc;
    }
}

