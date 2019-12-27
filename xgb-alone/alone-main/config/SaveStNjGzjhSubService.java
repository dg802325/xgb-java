package com.xgb.service;

import com.xgb.common.Utils;
import com.xgb.model.StNjGzjhSub;

import java.io.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class SaveStNjGzjhSubService {

    public static StringBuffer saveEntity(StringBuffer buffer , List<StNjGzjhSub> contents){
        for(StNjGzjhSub content:contents){

        Integer id = content.getId ();//ID
        String instanceid = content.getInstanceid ();//INSTANCEID
        String organizationid = content.getOrganizationid ();//ORGANIZATIONID
        Integer status = content.getStatus ();//STATUS
        Integer masterid = content.getMasterid ();//MASTERID
        String seq = content.getSeq ();//序号
        String jihuaneirong = content.getJihuaneirong ();//计划开展活动内容
        String lingyu = content.getLingyu ();//服务领域
        String leixing = content.getLeixing ();//活动类型
        String fangshi = content.getFangshi ();//开展方式
        String tjnjjieguo1 = content.getTjnjjieguo1 ();//天津年检结果1
        String tjnjjieguo2 = content.getTjnjjieguo2 ();//天津年检结果2
        String tjnjyijian1 = content.getTjnjyijian1 ();//天津审核意见1
        String tjnjyijian2 = content.getTjnjyijian2 ();//天津审核意见2
        String tjnjxingming1 = content.getTjnjxingming1 ();//天津审核姓名1
        String tjnjxingming2 = content.getTjnjxingming2 ();//天津审核姓名2
        Date tjnjshijian1 = content.getTjnjshijian1 ();//天津审批时间1
        Date tjnjshijian2 = content.getTjnjshijian2 ();//天津审批时间2

        buffer.append(id+"|");
        buffer.append(instanceid+"|");
        buffer.append(organizationid+"|");
        buffer.append(status+"|");
        buffer.append(masterid+"|");
        buffer.append(seq+"|");
        buffer.append(jihuaneirong+"|");
        buffer.append(lingyu+"|");
        buffer.append(leixing+"|");
        buffer.append(fangshi+"|");
        buffer.append(tjnjjieguo1+"|");
        buffer.append(tjnjjieguo2+"|");
        buffer.append(tjnjyijian1+"|");
        buffer.append(tjnjyijian2+"|");
        buffer.append(tjnjxingming1+"|");
        buffer.append(tjnjxingming2+"|");
        buffer.append(tjnjshijian1+"|");
        buffer.append(tjnjshijian2+"|");

        buffer.append("\n");
        }
        return buffer;
    }

    public static void writeToRestource(StringBuffer buffer){
        String path= Utils.getResourceBasePath()+"/xgb-data/data-api/config";
        System.out.println("输出文件目录：-----------"+path);
        String studentResourcePath = new File(path, "/StNjGzjhSub.txt").getAbsolutePath();
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
