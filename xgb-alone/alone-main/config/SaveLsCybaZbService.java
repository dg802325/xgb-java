package com.xgb.service;

import com.xgb.common.Utils;
import com.xgb.model.LsCybaZb;

import java.io.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class SaveLsCybaZbService {

    public static StringBuffer saveEntity(StringBuffer buffer , List<LsCybaZb> contents){
        for(LsCybaZb content:contents){

        Integer id = content.getId ();//ID
        String instanceid = content.getInstanceid ();//INSTANCEID
        String organizationid = content.getOrganizationid ();//ORGANIZATIONID
        Integer status = content.getStatus ();//STATUS
        Integer masterid = content.getMasterid ();//MASTERID
        String xuhao = content.getXuhao ();//序号
        String xingming = content.getXingming ();//姓名
        Date chushengnianyue = content.getChushengnianyue ();//出生年月
        String neizhiwu = content.getNeizhiwu ();//内职务
        String lishi = content.getLishi ();//理事
        String jizhiwu = content.getJizhiwu ();//及职务
        String qianzi = content.getQianzi ();//签字

        buffer.append(id+"|");
        buffer.append(instanceid+"|");
        buffer.append(organizationid+"|");
        buffer.append(status+"|");
        buffer.append(masterid+"|");
        buffer.append(xuhao+"|");
        buffer.append(xingming+"|");
        buffer.append(chushengnianyue+"|");
        buffer.append(neizhiwu+"|");
        buffer.append(lishi+"|");
        buffer.append(jizhiwu+"|");
        buffer.append(qianzi+"|");

        buffer.append("\n");
        }
        return buffer;
    }

    public static void writeToRestource(StringBuffer buffer){
        String path= Utils.getResourceBasePath()+"/xgb-data/data-api/config";
        System.out.println("输出文件目录：-----------"+path);
        String studentResourcePath = new File(path, "/LsCybaZb.txt").getAbsolutePath();
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
