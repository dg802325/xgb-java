package com.xgb.service;

import com.xgb.common.Utils;
import com.xgb.model.StNjReport16Sub2;

import java.io.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class SaveStNjReport16Sub2Service {

    public static StringBuffer saveEntity(StringBuffer buffer , List<StNjReport16Sub2> contents){
        for (StNjReport16Sub2 content : contents) {
            Long id = content.getId ();//ID
            String instanceid = content.getInstanceid ();//INSTANCEID
            String organizationid = content.getOrganizationid ();//ORGANIZATIONID
            Short status = content.getStatus ();//STATUS
            Long masterid = content.getMasterid ();//MASTERID
            String xuhao = content.getXuhao ();//序号
            String huiyididian = content.getHuiyididian ();//会议地点
            String huiyileixing = content.getHuiyileixing ();//会议类型
            String huiyimingcheng = content.getHuiyimingcheng ();//会议名称
            Date huiyikaishishijian = content.getHuiyikaishishijian ();//会议开始时间
            String zhubandanweimingcheng = content.getZhubandanweimingcheng ();//主办单位名称
            String wofangjingfeilaiyuan = content.getWofangjingfeilaiyuan ();//我方经费来源
            String wofangfayanzhuti = content.getWofangfayanzhuti ();//我方发言主题
            Date huiyijieshushijian = content.getHuiyijieshushijian ();//会议结束时间
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
            buffer.append(huiyididian+"|");
            buffer.append(huiyileixing+"|");
            buffer.append(huiyimingcheng+"|");
            buffer.append(huiyikaishishijian+"|");
            buffer.append(zhubandanweimingcheng+"|");
            buffer.append(wofangjingfeilaiyuan+"|");
            buffer.append(wofangfayanzhuti+"|");
            buffer.append(huiyijieshushijian+"|");
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
        String studentResourcePath = new File(path, "/StNjReport16Sub2.txt").getAbsolutePath();
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
