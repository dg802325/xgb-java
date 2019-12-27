package com.xgb.service;

import com.xgb.common.Utils;
import com.xgb.model.MjzzDictionary;

import java.io.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class SaveMjzzDictionaryService {

    public static StringBuffer saveEntity(StringBuffer buffer , List<MjzzDictionary> contents){
        for(MjzzDictionary content:contents){

        Integer id = content.getId ();//ID
        Integer parentid = content.getParentid ();//父节点ID
        Integer deptid = content.getDeptid ();//结构ID
        String userid = content.getUserid ();//负责人ID
        String name = content.getName ();//名称
        Integer lev = content.getLev ();//层次
        String val = content.getVal ();//值
        Integer ind = content.getInd ();//登记管理机关
        Integer status = content.getStatus ();//状态
        String typename = content.getTypename ();//类别
        Integer type = content.getType ();//1,社团,2,民非,3,基金会,7涉外基金会

        buffer.append(id+"|");
        buffer.append(parentid+"|");
        buffer.append(deptid+"|");
        buffer.append(userid+"|");
        buffer.append(name+"|");
        buffer.append(lev+"|");
        buffer.append(val+"|");
        buffer.append(ind+"|");
        buffer.append(status+"|");
        buffer.append(typename+"|");
        buffer.append(type+"|");

        buffer.append("\n");
        }
        return buffer;
    }

    public static void writeToRestource(StringBuffer buffer){
        String path= Utils.getResourceBasePath()+"/xgb-data/data-api/config";
        System.out.println("输出文件目录：-----------"+path);
        String studentResourcePath = new File(path, "/MjzzDictionary.txt").getAbsolutePath();
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
