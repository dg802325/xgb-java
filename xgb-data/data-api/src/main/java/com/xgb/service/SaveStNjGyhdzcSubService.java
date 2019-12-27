package com.xgb.service;

import com.xgb.common.Utils;
import com.xgb.model.StNjGyhdzcSub;

import java.io.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class SaveStNjGyhdzcSubService {

    public static StringBuffer saveEntity(StringBuffer buffer , List<StNjGyhdzcSub> contents){
        for (StNjGyhdzcSub content : contents) {
            Long id = content.getId ();//id
            String instanceid = content.getInstanceid ();//instanceid
            String organizationid = content.getOrganizationid ();//organizationid
            Short status = content.getStatus ();//STATUS
            String mingcheng = content.getMingcheng ();//公益活动名称
            BigDecimal kuanwu = content.getKuanwu ();//直接用于受助人的款物
            BigDecimal renyuanfeiyong = content.getRenyuanfeiyong ();//人员费用
            BigDecimal bangongfeiyong = content.getBangongfeiyong ();//办公费用
            BigDecimal shiyongfeiyong = content.getShiyongfeiyong ();//资产使用费用
            BigDecimal chouzifeiyong = content.getChouzifeiyong ();//直接筹资费用
            BigDecimal qitafeiyong = content.getQitafeiyong ();//其他费用
            BigDecimal zongji = content.getZongji ();//总计
            Long masterid = content.getMasterid ();//MASTERID

            buffer.append(id+"|");
            buffer.append(instanceid+"|");
            buffer.append(organizationid+"|");
            buffer.append(status+"|");
            buffer.append(mingcheng+"|");
            buffer.append(kuanwu+"|");
            buffer.append(renyuanfeiyong+"|");
            buffer.append(bangongfeiyong+"|");
            buffer.append(shiyongfeiyong+"|");
            buffer.append(chouzifeiyong+"|");
            buffer.append(qitafeiyong+"|");
            buffer.append(zongji+"|");
            buffer.append(masterid+"|");
            buffer.append("\n");
        }
        return buffer;
    }

    public static void writeToRestource(StringBuffer buffer){
        String path= Utils.getResourceBasePath()+"/xgb-data/data-api/config";
        System.out.println("输出文件目录：-----------"+path);
        String studentResourcePath = new File(path, "/StNjGyhdzcSub.txt").getAbsolutePath();
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
