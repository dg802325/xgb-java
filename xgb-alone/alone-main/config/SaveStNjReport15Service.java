package com.xgb.service;

import com.xgb.common.Utils;
import com.xgb.model.StNjReport15;

import java.io.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class SaveStNjReport15Service {

    public static StringBuffer saveEntity(StringBuffer buffer , List<StNjReport15> contents){
        for(StNjReport15 content:contents){

        Integer id = content.getId ();//ID
        String instanceid = content.getInstanceid ();//INSTANCEID
        String organizationid = content.getOrganizationid ();//ORGANIZATIONID
        Integer status = content.getStatus ();//STATUS
        Integer xianjin1 = content.getXianjin1 ();//现金1
        Integer feixianjinzhehe1 = content.getFeixianjinzhehe1 ();//非现金折合1
        Integer heji1 = content.getHeji1 ();//合计1
        Integer xianjin2 = content.getXianjin2 ();//现金2
        Integer feixianjinzhehe2 = content.getFeixianjinzhehe2 ();//非现金折合2
        Integer heji2 = content.getHeji2 ();//合计2
        Integer xianjin3 = content.getXianjin3 ();//现金3
        Integer feixianjinzhehe3 = content.getFeixianjinzhehe3 ();//非现金折合3
        Integer heji3 = content.getHeji3 ();//合计3
        Integer xianjin4 = content.getXianjin4 ();//现金4
        Integer feixianjinzhehe4 = content.getFeixianjinzhehe4 ();//非现金折合4
        Integer heji4 = content.getHeji4 ();//合计4
        Integer xianjin5 = content.getXianjin5 ();//现金5
        Integer feixianjinzhehe5 = content.getFeixianjinzhehe5 ();//非现金折合5
        Integer heji5 = content.getHeji5 ();//合计5
        Integer xianjin6 = content.getXianjin6 ();//现金6
        Integer feixianjinzhehe6 = content.getFeixianjinzhehe6 ();//非现金折合6
        Integer heji6 = content.getHeji6 ();//合计6
        Integer xianjin7 = content.getXianjin7 ();//现金7
        Integer feixianjinzhehe7 = content.getFeixianjinzhehe7 ();//非现金折合7
        Integer heji7 = content.getHeji7 ();//合计7
        String zhuyaoyongtuheshiyongqingkuang = content.getZhuyaoyongtuheshiyongqingkuang ();//主要用途和使用情况
        Integer shouru06 = content.getShouru06 ();//06
        Integer shouru07 = content.getShouru07 ();//07
        Integer shouru08 = content.getShouru08 ();//08
        Integer zhichu06 = content.getZhichu06 ();//06
        Integer zhichu07 = content.getZhichu07 ();//07
        Integer zhichu08 = content.getZhichu08 ();//08
        Integer gongyizhichu06 = content.getGongyizhichu06 ();//06
        Integer gongyizhichu07 = content.getGongyizhichu07 ();//07
        Integer gongyizhichu08 = content.getGongyizhichu08 ();//08
        String shangnianbili06 = content.getShangnianbili06 ();//06
        String shangnianbili07 = content.getShangnianbili07 ();//07
        String shangnianbili08 = content.getShangnianbili08 ();//08
        String bennianbili06 = content.getBennianbili06 ();//06
        String bennianbili07 = content.getBennianbili07 ();//07
        String bennianbili08 = content.getBennianbili08 ();//08
        String tjnjjieguo1 = content.getTjnjjieguo1 ();//天津年检结果1
        String tjnjjieguo2 = content.getTjnjjieguo2 ();//天津年检结果2
        String tjnjyijian1 = content.getTjnjyijian1 ();//天津审核意见1
        String tjnjyijian2 = content.getTjnjyijian2 ();//天津审核意见2
        String tjnjxingming1 = content.getTjnjxingming1 ();//天津审核姓名1
        String tjnjxingming2 = content.getTjnjxingming2 ();//天津审核姓名2
        Date tjnjshijian1 = content.getTjnjshijian1 ();//天津审批时间1
        Date tjnjshijian2 = content.getTjnjshijian2 ();//天津审批时间2
        String juanzenghetong = content.getJuanzenghetong ();//null
        Integer juanzengshu = content.getJuanzengshu ();//null
        String wuciqingkuang = content.getWuciqingkuang ();//null

        buffer.append(id+"|");
        buffer.append(instanceid+"|");
        buffer.append(organizationid+"|");
        buffer.append(status+"|");
        buffer.append(xianjin1+"|");
        buffer.append(feixianjinzhehe1+"|");
        buffer.append(heji1+"|");
        buffer.append(xianjin2+"|");
        buffer.append(feixianjinzhehe2+"|");
        buffer.append(heji2+"|");
        buffer.append(xianjin3+"|");
        buffer.append(feixianjinzhehe3+"|");
        buffer.append(heji3+"|");
        buffer.append(xianjin4+"|");
        buffer.append(feixianjinzhehe4+"|");
        buffer.append(heji4+"|");
        buffer.append(xianjin5+"|");
        buffer.append(feixianjinzhehe5+"|");
        buffer.append(heji5+"|");
        buffer.append(xianjin6+"|");
        buffer.append(feixianjinzhehe6+"|");
        buffer.append(heji6+"|");
        buffer.append(xianjin7+"|");
        buffer.append(feixianjinzhehe7+"|");
        buffer.append(heji7+"|");
        buffer.append(zhuyaoyongtuheshiyongqingkuang+"|");
        buffer.append(shouru06+"|");
        buffer.append(shouru07+"|");
        buffer.append(shouru08+"|");
        buffer.append(zhichu06+"|");
        buffer.append(zhichu07+"|");
        buffer.append(zhichu08+"|");
        buffer.append(gongyizhichu06+"|");
        buffer.append(gongyizhichu07+"|");
        buffer.append(gongyizhichu08+"|");
        buffer.append(shangnianbili06+"|");
        buffer.append(shangnianbili07+"|");
        buffer.append(shangnianbili08+"|");
        buffer.append(bennianbili06+"|");
        buffer.append(bennianbili07+"|");
        buffer.append(bennianbili08+"|");
        buffer.append(tjnjjieguo1+"|");
        buffer.append(tjnjjieguo2+"|");
        buffer.append(tjnjyijian1+"|");
        buffer.append(tjnjyijian2+"|");
        buffer.append(tjnjxingming1+"|");
        buffer.append(tjnjxingming2+"|");
        buffer.append(tjnjshijian1+"|");
        buffer.append(tjnjshijian2+"|");
        buffer.append(juanzenghetong+"|");
        buffer.append(juanzengshu+"|");
        buffer.append(wuciqingkuang+"|");

        buffer.append("\n");
        }
        return buffer;
    }

    public static void writeToRestource(StringBuffer buffer){
        String path= Utils.getResourceBasePath()+"/xgb-data/data-api/config";
        System.out.println("输出文件目录：-----------"+path);
        String studentResourcePath = new File(path, "/StNjReport15.txt").getAbsolutePath();
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
