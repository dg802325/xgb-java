package com.xgb.service;

import com.xgb.common.Utils;
import com.xgb.model.${modelName!};

import java.io.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class Save${modelName!}Service {

    public static StringBuffer saveEntity(StringBuffer buffer , List<${modelName!}> contents){
        for(${modelName!} content:contents){

${codeEntity!}
${codeEntity1!}
        buffer.append("\n");
        }
        return buffer;
    }

    public static void writeToRestource(StringBuffer buffer){
        String path= Utils.getResourceBasePath()+"/xgb-data/data-api/config";
        System.out.println("输出文件目录：-----------"+path);
        String studentResourcePath = new File(path, "/${modelName!}.txt").getAbsolutePath();
        // 保证目录一定存在
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(studentResourcePath)));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Utils.writeTxt(writer,buffer.toString());
        Utils.close(writer);
    }

}
