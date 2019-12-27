package com.xgb.service;

import com.xgb.common.Utils;
import com.xgb.model.StNjJieshoujiandu;

import java.io.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class SaveStNjJieshoujianduService {

    public static StringBuffer saveEntity(StringBuffer buffer , List<StNjJieshoujiandu> contents){
        for (StNjJieshoujiandu content : contents) {
            Long id = content.getId ();//null
            String instanceid = content.getInstanceid ();//null
            String organizationid = content.getOrganizationid ();//null
            Short status = content.getStatus ();//null
            String nianjianjielun1 = content.getNianjianjielun1 ();//null
            String zhenggai1 = content.getZhenggai1 ();//null
            String nianjianjielun2 = content.getNianjianjielun2 ();//null
            String zhenggai2 = content.getZhenggai2 ();//null
            String nianjianjielun3 = content.getNianjianjielun3 ();//null
            String zhenggai3 = content.getZhenggai3 ();//null
            String radiobutton = content.getRadiobutton ();//null
            String pinggunian = content.getPinggunian ();//null
            String pingguyue = content.getPingguyue ();//null
            String pingguri = content.getPingguri ();//null
            String pinggujieguo = content.getPinggujieguo ();//null
            String nian2 = content.getNian2 ();//null
            String yue2 = content.getYue2 ();//null
            String ri2 = content.getRi2 ();//null
            String radiobutton2 = content.getRadiobutton2 ();//null
            String shenjijigou1 = content.getShenjijigou1 ();//null
            String baogaoyongtu1 = content.getBaogaoyongtu1 ();//null
            String radiobutton3 = content.getRadiobutton3 ();//null
            String shenjijigou2 = content.getShenjijigou2 ();//null
            String baogaoyongtu2 = content.getBaogaoyongtu2 ();//null
            String radiobutton4 = content.getRadiobutton4 ();//null
            String shenjijigou3 = content.getShenjijigou3 ();//null
            String baogaoyongtu3 = content.getBaogaoyongtu3 ();//null
            String radiobutton5 = content.getRadiobutton5 ();//null
            String nian3 = content.getNian3 ();//null
            String yue3 = content.getYue3 ();//null
            String ri3 = content.getRi3 ();//null
            String chufazhonglei = content.getChufazhonglei ();//null
            String shishijiguan = content.getShishijiguan ();//null
            String weifaxingwei = content.getWeifaxingwei ();//null
            String tjnjjieguo1 = content.getTjnjjieguo1 ();//天津年检结果1
            String tjnjjieguo2 = content.getTjnjjieguo2 ();//天津年检结果2
            String tjnjyijian1 = content.getTjnjyijian1 ();//天津审核意见1
            String tjnjyijian2 = content.getTjnjyijian2 ();//天津审核意见2
            String tjnjxingming1 = content.getTjnjxingming1 ();//天津审核姓名1
            String tjnjxingming2 = content.getTjnjxingming2 ();//天津审核姓名2
            Date tjnjshijian1 = content.getTjnjshijian1 ();//天津审批时间1
            Date tjnjshijian2 = content.getTjnjshijian2 ();//天津审批时间2
            String shuiqiankouchu = content.getShuiqiankouchu ();//null
            String mianshuizige = content.getMianshuizige ();//null
            String kouchunian = content.getKouchunian ();//null
            String mianshuinian = content.getMianshuinian ();//null

            buffer.append(id+"|");
            buffer.append(instanceid+"|");
            buffer.append(organizationid+"|");
            buffer.append(status+"|");
            buffer.append(nianjianjielun1+"|");
            buffer.append(zhenggai1+"|");
            buffer.append(nianjianjielun2+"|");
            buffer.append(zhenggai2+"|");
            buffer.append(nianjianjielun3+"|");
            buffer.append(zhenggai3+"|");
            buffer.append(radiobutton+"|");
            buffer.append(pinggunian+"|");
            buffer.append(pingguyue+"|");
            buffer.append(pingguri+"|");
            buffer.append(pinggujieguo+"|");
            buffer.append(nian2+"|");
            buffer.append(yue2+"|");
            buffer.append(ri2+"|");
            buffer.append(radiobutton2+"|");
            buffer.append(shenjijigou1+"|");
            buffer.append(baogaoyongtu1+"|");
            buffer.append(radiobutton3+"|");
            buffer.append(shenjijigou2+"|");
            buffer.append(baogaoyongtu2+"|");
            buffer.append(radiobutton4+"|");
            buffer.append(shenjijigou3+"|");
            buffer.append(baogaoyongtu3+"|");
            buffer.append(radiobutton5+"|");
            buffer.append(nian3+"|");
            buffer.append(yue3+"|");
            buffer.append(ri3+"|");
            buffer.append(chufazhonglei+"|");
            buffer.append(shishijiguan+"|");
            buffer.append(weifaxingwei+"|");
            buffer.append(tjnjjieguo1+"|");
            buffer.append(tjnjjieguo2+"|");
            buffer.append(tjnjyijian1+"|");
            buffer.append(tjnjyijian2+"|");
            buffer.append(tjnjxingming1+"|");
            buffer.append(tjnjxingming2+"|");
            buffer.append(tjnjshijian1+"|");
            buffer.append(tjnjshijian2+"|");
            buffer.append(shuiqiankouchu+"|");
            buffer.append(mianshuizige+"|");
            buffer.append(kouchunian+"|");
            buffer.append(mianshuinian+"|");
            buffer.append("\n");
        }


        return buffer;
    }

    public static void writeToRestource(StringBuffer buffer){
        String path= Utils.getResourceBasePath()+"/xgb-data/data-api/config";
        System.out.println("输出文件目录：-----------"+path);
        String studentResourcePath = new File(path, "/StNjJieshoujiandu.txt").getAbsolutePath();
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
