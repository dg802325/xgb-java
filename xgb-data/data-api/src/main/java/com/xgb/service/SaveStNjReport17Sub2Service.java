package com.xgb.service;

import com.xgb.common.Utils;
import com.xgb.model.StNjReport17Sub2;

import java.io.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class SaveStNjReport17Sub2Service {

    public static StringBuffer saveEntity(StringBuffer buffer , List<StNjReport17Sub2> contents){
        for (StNjReport17Sub2 content : contents) {
            Long id = content.getId ();//ID
            String instanceid = content.getInstanceid ();//INSTANCEID
            String organizationid = content.getOrganizationid ();//ORGANIZATIONID
            Short status = content.getStatus ();//STATUS
            Long masterid = content.getMasterid ();//MASTERID
            String xuhao = content.getXuhao ();//序号
            Integer chufangrenshu = content.getChufangrenshu ();//出访人数
            String chufangmude = content.getChufangmude ();//出访目的
            String chufangguojiahuodiqu = content.getChufangguojiahuodiqu ();//出访国家或地区
            Date chufangkaishishijian = content.getChufangkaishishijian ();//出访开始时间
            String jingfeilaiyuan = content.getJingfeilaiyuan ();//经费来源
            String jingwaiyaoqingdanweimingcheng = content.getJingwaiyaoqingdanweimingcheng ();//境外邀请单位名称
            String pizhunjiguan = content.getPizhunjiguan ();//批准机关
            Date chufangjieshushijian = content.getChufangjieshushijian ();//出访结束时间
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
            buffer.append(xuhao+"|");
            buffer.append(chufangrenshu+"|");
            buffer.append(chufangmude+"|");
            buffer.append(chufangguojiahuodiqu+"|");
            buffer.append(chufangkaishishijian+"|");
            buffer.append(jingfeilaiyuan+"|");
            buffer.append(jingwaiyaoqingdanweimingcheng+"|");
            buffer.append(pizhunjiguan+"|");
            buffer.append(chufangjieshushijian+"|");
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
        String studentResourcePath = new File(path, "/StNjReport17Sub2.txt").getAbsolutePath();
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
