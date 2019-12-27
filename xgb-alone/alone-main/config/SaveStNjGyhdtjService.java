package com.xgb.service;

import com.xgb.common.Utils;
import com.xgb.model.StNjGyhdtj;

import java.io.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class SaveStNjGyhdtjService {

    public static StringBuffer saveEntity(StringBuffer buffer , List<StNjGyhdtj> contents){
        for(StNjGyhdtj content:contents){

        Integer id = content.getId ();//ID
        String instanceid = content.getInstanceid ();//INSTANCEID
        String organizationid = content.getOrganizationid ();//ORGANIZATIONID
        Integer status = content.getStatus ();//STATUS
        String zongshouru1 = content.getZongshouru1 ();//2012总收入
        String zongzhichu1 = content.getZongzhichu1 ();//2012总支出
        String zhichu1 = content.getZhichu1 ();//2012公益活动支出
        String shangnianduzhanbi1 = content.getShangnianduzhanbi1 ();//2012公益活动支出占上年度总收入的比例
        String bennianduzhanbi1 = content.getBennianduzhanbi1 ();//2012公益活动支出占本年度总收入的比例
        String zongshouru2 = content.getZongshouru2 ();//2013总收入
        String zongzhichu2 = content.getZongzhichu2 ();//2013总支出
        String zhichu2 = content.getZhichu2 ();//2013公益活动支出
        String shangnianduzhanbi2 = content.getShangnianduzhanbi2 ();//2013公益活动支出占上年度总收入的比例
        String bennianduzhanbi2 = content.getBennianduzhanbi2 ();//2013公益活动支出占本年度总收入的比例
        String zongshouru3 = content.getZongshouru3 ();//2014总收入
        String zongzhichu3 = content.getZongzhichu3 ();//2014总支出
        String zhichu3 = content.getZhichu3 ();//2014公益活动支出
        String shangnianduzhanbi3 = content.getShangnianduzhanbi3 ();//2014公益活动支出占上年度总收入的比例
        String bennianduzhanbi3 = content.getBennianduzhanbi3 ();//2014公益活动支出占本年度总收入的比例
        String zongshouru4 = content.getZongshouru4 ();//2015总收入
        String zongzhichu4 = content.getZongzhichu4 ();//2015总支出
        String zhichu4 = content.getZhichu4 ();//2015公益活动支出
        String shangnianduzhanbi4 = content.getShangnianduzhanbi4 ();//2015公益活动支出占上年度总收入的比例
        String bennianduzhanbi4 = content.getBennianduzhanbi4 ();//2015公益活动支出占本年度总收入的比例

        buffer.append(id+"|");
        buffer.append(instanceid+"|");
        buffer.append(organizationid+"|");
        buffer.append(status+"|");
        buffer.append(zongshouru1+"|");
        buffer.append(zongzhichu1+"|");
        buffer.append(zhichu1+"|");
        buffer.append(shangnianduzhanbi1+"|");
        buffer.append(bennianduzhanbi1+"|");
        buffer.append(zongshouru2+"|");
        buffer.append(zongzhichu2+"|");
        buffer.append(zhichu2+"|");
        buffer.append(shangnianduzhanbi2+"|");
        buffer.append(bennianduzhanbi2+"|");
        buffer.append(zongshouru3+"|");
        buffer.append(zongzhichu3+"|");
        buffer.append(zhichu3+"|");
        buffer.append(shangnianduzhanbi3+"|");
        buffer.append(bennianduzhanbi3+"|");
        buffer.append(zongshouru4+"|");
        buffer.append(zongzhichu4+"|");
        buffer.append(zhichu4+"|");
        buffer.append(shangnianduzhanbi4+"|");
        buffer.append(bennianduzhanbi4+"|");

        buffer.append("\n");
        }
        return buffer;
    }

    public static void writeToRestource(StringBuffer buffer){
        String path= Utils.getResourceBasePath()+"/xgb-data/data-api/config";
        System.out.println("输出文件目录：-----------"+path);
        String studentResourcePath = new File(path, "/StNjGyhdtj.txt").getAbsolutePath();
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
