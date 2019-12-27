package com.xgb.service;

import com.xgb.common.Utils;
import com.xgb.model.MfGwyJzTb;

import java.io.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class SaveMfGwyJzTbService {

    public static StringBuffer saveEntity(StringBuffer buffer , List<MfGwyJzTb> contents){
        for (MfGwyJzTb content : contents) {
            Long id = content.getId ();//ID
            String instanceid = content.getInstanceid ();//INSTANCEID
            String organizationid = content.getOrganizationid ();//ORGANIZATIONID
            Short status = content.getStatus ();//STATUS
            String danweimingcheng = content.getDanweimingcheng ();//单位名称
            String qianzi = content.getQianzi ();//签字
            Date tianbiaoshijian = content.getTianbiaoshijian ();//填表时间

            buffer.append(id+"|");
            buffer.append(instanceid+"|");
            buffer.append(organizationid+"|");
            buffer.append(status+"|");
            buffer.append(danweimingcheng+"|");
            buffer.append(qianzi+"|");
            buffer.append(tianbiaoshijian+"|");
            buffer.append("\n");
        }


        return buffer;
    }

    public static void writeToRestource(StringBuffer buffer){
        String path= Utils.getResourceBasePath()+"/xgb-data/data-api/config";
        System.out.println("输出文件目录：-----------"+path);
        String studentResourcePath = new File(path, "/MfGwyJzTb.txt").getAbsolutePath();
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
