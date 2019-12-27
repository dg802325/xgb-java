package com.xgb.service;

import com.xgb.common.Utils;
import com.xgb.model.StNjServiceCost;

import java.io.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class SaveStNjServiceCostService {

    public static StringBuffer saveEntity(StringBuffer buffer , List<StNjServiceCost> contents){
        for (StNjServiceCost content : contents) {
            Long id = content.getId ();//ID
            String instanceid = content.getInstanceid ();//INSTANCEID
            String organizationid = content.getOrganizationid ();//ORGANIZATIONID
            Short status = content.getStatus ();//STATUS
            Long masterid = content.getMasterid ();//MASTERID
            String shoufeixiangmu = content.getShoufeixiangmu ();//收费项目
            BigDecimal shoufeibiaozhu = content.getShoufeibiaozhu ();//收费标准（元）
            String sheliyiju = content.getSheliyiju ();//设立依据
            BigDecimal heji = content.getHeji ();//合计（万元）
            String shifoulishihuitongguo = content.getShifoulishihuitongguo ();//是否经理事会（常务理事会）通过
            String zichaqingliyijian = content.getZichaqingliyijian ();//自查清理意见
            BigDecimal fuwushoufeizonge = content.getFuwushoufeizonge ();//2016年度服务性收费总额（万元）
            String shifouqiangzhi = content.getShifouqiangzhi ();//2016年度是否存在强制会员接受服务并收取费用
            BigDecimal qiangzhishejijine = content.getQiangzhishejijine ();//强制涉及金额（万元）
            String shifouliyong = content.getShifouliyong ();//2016年度是否存在利用政府名义或政府委托事项为由擅自设立收费项目
            BigDecimal liyongshejijine = content.getLiyongshejijine ();//强制涉及金额（万元）
            BigDecimal zixingjianmianhuifei = content.getZixingjianmianhuifei ();//2016年度自行减免会费（万元）
            String jianmianhuifeijutiqingkuang = content.getJianmianhuifeijutiqingkuang ();//2016年度自行减免会费（万元）具体情况
            BigDecimal zhenggaijine = content.getZhenggaijine ();//2016年度违规行为整改，涉及金额（万元）
            String zhenggaijinejutiqingkuang = content.getZhenggaijinejutiqingkuang ();//2016年度违规行为整改，涉及金额（万元）具体情况
            Long xuhao = content.getXuhao ();//序号

            buffer.append(id+"|");
            buffer.append(instanceid+"|");
            buffer.append(organizationid+"|");
            buffer.append(status+"|");
            buffer.append(masterid+"|");
            buffer.append(shoufeixiangmu+"|");
            buffer.append(shoufeibiaozhu+"|");
            buffer.append(sheliyiju+"|");
            buffer.append(heji+"|");
            buffer.append(shifoulishihuitongguo+"|");
            buffer.append(zichaqingliyijian+"|");
            buffer.append(fuwushoufeizonge+"|");
            buffer.append(shifouqiangzhi+"|");
            buffer.append(qiangzhishejijine+"|");
            buffer.append(shifouliyong+"|");
            buffer.append(liyongshejijine+"|");
            buffer.append(zixingjianmianhuifei+"|");
            buffer.append(jianmianhuifeijutiqingkuang+"|");
            buffer.append(zhenggaijine+"|");
            buffer.append(zhenggaijinejutiqingkuang+"|");
            buffer.append(xuhao+"|");
            buffer.append("\n");
        }


        return buffer;
    }

    public static void writeToRestource(StringBuffer buffer){
        String path= Utils.getResourceBasePath()+"/xgb-data/data-api/config";
        System.out.println("输出文件目录：-----------"+path);
        String studentResourcePath = new File(path, "/StNjServiceCost.txt").getAbsolutePath();
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
