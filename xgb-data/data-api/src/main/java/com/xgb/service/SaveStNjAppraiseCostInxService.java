package com.xgb.service;

import com.xgb.common.Utils;
import com.xgb.model.StNjAppraiseCostInx;

import java.io.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class SaveStNjAppraiseCostInxService {

    public static StringBuffer saveEntity(StringBuffer buffer , List<StNjAppraiseCostInx> contents){
        for (StNjAppraiseCostInx content : contents) {
            Long id = content.getId ();//ID
            String instanceid = content.getInstanceid ();//INSTANCEID
            String organizationid = content.getOrganizationid ();//ORGANIZATIONID
            Short status = content.getStatus ();//STATUS
            Long masterid = content.getMasterid ();//MASTERID
            Long xuhao = content.getXuhao ();//序号
            BigDecimal biaozhangshoufeizonge = content.getBiaozhangshoufeizonge ();//2016年度评比达标表彰收费总额（万元）
            String shifouqiangzhidabiao = content.getShifouqiangzhidabiao ();//2016年度是否存在强制会员参加评比达标表彰活动
            BigDecimal qiangzhishejijine = content.getQiangzhishejijine ();//强制涉及金额（万元）
            BigDecimal zixingjianmianhuifei = content.getZixingjianmianhuifei ();//2016年度自行减免会费（万元）
            String jianmianhuifeijutiqingkuang = content.getJianmianhuifeijutiqingkuang ();//2016年度自行减免会费（万元）具体情况
            BigDecimal zhenggaijine = content.getZhenggaijine ();//2016年度违规行为整改，涉及金额（万元）
            String zhenggaijinejutiqingkuang = content.getZhenggaijinejutiqingkuang ();//2016年度违规行为整改，涉及金额（万元）具体情况

            buffer.append(id+"|");
            buffer.append(instanceid+"|");
            buffer.append(organizationid+"|");
            buffer.append(status+"|");
            buffer.append(masterid+"|");
            buffer.append(xuhao+"|");
            buffer.append(biaozhangshoufeizonge+"|");
            buffer.append(shifouqiangzhidabiao+"|");
            buffer.append(qiangzhishejijine+"|");
            buffer.append(zixingjianmianhuifei+"|");
            buffer.append(jianmianhuifeijutiqingkuang+"|");
            buffer.append(zhenggaijine+"|");
            buffer.append(zhenggaijinejutiqingkuang+"|");
            buffer.append("\n");
        }


        return buffer;
    }

    public static void writeToRestource(StringBuffer buffer){
        String path= Utils.getResourceBasePath()+"/xgb-data/data-api/config";
        System.out.println("输出文件目录：-----------"+path);
        String studentResourcePath = new File(path, "/StNjAppraiseCostInx.txt").getAbsolutePath();
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
