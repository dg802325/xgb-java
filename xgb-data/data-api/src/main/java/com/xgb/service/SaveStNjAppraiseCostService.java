package com.xgb.service;

import com.xgb.common.Utils;
import com.xgb.model.StNjAppraiseCost;

import java.io.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class SaveStNjAppraiseCostService {

    public static StringBuffer saveEntity(StringBuffer buffer , List<StNjAppraiseCost> contents){
        for (StNjAppraiseCost content : contents) {
            Long id = content.getId ();//ID
            String instanceid = content.getInstanceid ();//INSTANCEID
            String organizationid = content.getOrganizationid ();//ORGANIZATIONID
            Short status = content.getStatus ();//STATUS
            Long masterid = content.getMasterid ();//MASTERID
            Long xuhao = content.getXuhao ();//序号
            String biaozhangxiangmu = content.getBiaozhangxiangmu ();//评比达标表彰项目
            BigDecimal shoufeibiaozhu = content.getShoufeibiaozhu ();//收费标准（元）
            String sheliyiju = content.getSheliyiju ();//设立依据
            String zichaqingliyijian = content.getZichaqingliyijian ();//自查清理意见
            BigDecimal biaozhangshoufeizonge = content.getBiaozhangshoufeizonge ();//2016年度评比达标表彰收费总额（万元）
            String shifouqiangzhidabiao = content.getShifouqiangzhidabiao ();//2016年度是否存在强制会员参加评比达标表彰活动
            BigDecimal qiangzhishejijine = content.getQiangzhishejijine ();//强制涉及金额（万元）
            BigDecimal zixingjianmianhuifei = content.getZixingjianmianhuifei ();//2016年度自行减免会费（万元）
            String jianmianhuifeijutiqingkuang = content.getJianmianhuifeijutiqingkuang ();//2016年度自行减免会费（万元）具体情况
            BigDecimal zhenggaijine = content.getZhenggaijine ();//2016年度违规行为整改，涉及金额（万元）
            String zhenggaijinejutiqingkuang = content.getZhenggaijinejutiqingkuang ();//2016年度违规行为整改，涉及金额（万元）具体情况
            BigDecimal heji = content.getHeji ();//合计（万元）

            buffer.append(id+"|");
            buffer.append(instanceid+"|");
            buffer.append(organizationid+"|");
            buffer.append(status+"|");
            buffer.append(masterid+"|");
            buffer.append(xuhao+"|");
            buffer.append(biaozhangxiangmu+"|");
            buffer.append(shoufeibiaozhu+"|");
            buffer.append(sheliyiju+"|");
            buffer.append(zichaqingliyijian+"|");
            buffer.append(biaozhangshoufeizonge+"|");
            buffer.append(shifouqiangzhidabiao+"|");
            buffer.append(qiangzhishejijine+"|");
            buffer.append(zixingjianmianhuifei+"|");
            buffer.append(jianmianhuifeijutiqingkuang+"|");
            buffer.append(zhenggaijine+"|");
            buffer.append(zhenggaijinejutiqingkuang+"|");
            buffer.append(heji+"|");
            buffer.append("\n");
        }


        return buffer;
    }

    public static void writeToRestource(StringBuffer buffer){
        String path= Utils.getResourceBasePath()+"/xgb-data/data-api/config";
        System.out.println("输出文件目录：-----------"+path);
        String studentResourcePath = new File(path, "/StNjAppraiseCost.txt").getAbsolutePath();
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
