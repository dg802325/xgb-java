package com.xgb.service;

import com.xgb.common.Utils;
import com.xgb.model.JjhnjGyhdmxSub;

import java.io.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class SaveJjhnjGyhdmxSubService {

    public static StringBuffer saveEntity(StringBuffer buffer , List<JjhnjGyhdmxSub> contents){
        for (JjhnjGyhdmxSub content : contents) {
            Long id = content.getId ();//ID
            String instanceid = content.getInstanceid ();//INSTANCEID
            String organizationid = content.getOrganizationid ();//ORGANIZATIONID
            Short status = content.getStatus ();//STATUS
            Long masterid = content.getMasterid ();//MASTERID
            String xuhao = content.getXuhao ();//序号
            String xiangmumingcheng = content.getXiangmumingcheng ();//项目名称
            BigDecimal shouru = content.getShouru ();//收入
            BigDecimal zhichu = content.getZhichu ();//支出
            String zi = content.getZi ();//自
            String zhi = content.getZhi ();//至
            String jianshu = content.getJianshu ();//简述
            String wuciqingkuang = content.getWuciqingkuang ();//null

            buffer.append(id+"|");
            buffer.append(instanceid+"|");
            buffer.append(organizationid+"|");
            buffer.append(status+"|");
            buffer.append(masterid+"|");
            buffer.append(xuhao+"|");
            buffer.append(xiangmumingcheng+"|");
            buffer.append(shouru+"|");
            buffer.append(zhichu+"|");
            buffer.append(zi+"|");
            buffer.append(zhi+"|");
            buffer.append(jianshu+"|");
            buffer.append(wuciqingkuang+"|");
            buffer.append("\n");
        }


        return buffer;
    }

    public static void writeToRestource(StringBuffer buffer){
        String path= Utils.getResourceBasePath()+"/xgb-data/data-api/config";
        System.out.println("输出文件目录：-----------"+path);
        String studentResourcePath = new File(path, "/JjhnjGyhdmxSub.txt").getAbsolutePath();
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
