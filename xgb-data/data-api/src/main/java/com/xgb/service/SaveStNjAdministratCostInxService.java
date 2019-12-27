package com.xgb.service;

import com.xgb.common.Utils;
import com.xgb.model.StNjAdministratCostInx;

import java.io.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class SaveStNjAdministratCostInxService {

    public static StringBuffer saveEntity(StringBuffer buffer , List<StNjAdministratCostInx> contents){
        for (StNjAdministratCostInx content : contents) {
            Long id = content.getId ();//ID
            String instanceid = content.getInstanceid ();//INSTANCEID
            String organizationid = content.getOrganizationid ();//ORGANIZATIONID
            Short status = content.getStatus ();//STATUS
            Long masterid = content.getMasterid ();//MASTERID
            BigDecimal xingzhengshoufeizonge = content.getXingzhengshoufeizonge ();//2016年度行政事业性收费总额（万元）
            String shifoushanzigenggai = content.getShifoushanzigenggai ();//2016年度是否存在利用政府名义或政府委托事项为由擅自设立收费项目、提高收费标准
            BigDecimal shanzishejijine = content.getShanzishejijine ();//擅自涉及金额（万元）
            BigDecimal zixingjianmianshoufei = content.getZixingjianmianshoufei ();//2016年度自行调减收费，减轻企业负担，涉及金额（万元）
            String jianmianshoufeijutiqingkuang = content.getJianmianshoufeijutiqingkuang ();//2016年度自行调减收费，减轻企业负担，涉及金额（万元）具体情况
            BigDecimal zhenggaijine = content.getZhenggaijine ();//2016年度违规行为整改，涉及金额（万元）
            String zhenggaijinejutiqingkuang = content.getZhenggaijinejutiqingkuang ();//2016年度违规行为整改，涉及金额（万元）具体情况
            String wuciqingkuang = content.getWuciqingkuang ();//null

            buffer.append(id+"|");
            buffer.append(instanceid+"|");
            buffer.append(organizationid+"|");
            buffer.append(status+"|");
            buffer.append(masterid+"|");
            buffer.append(xingzhengshoufeizonge+"|");
            buffer.append(shifoushanzigenggai+"|");
            buffer.append(shanzishejijine+"|");
            buffer.append(zixingjianmianshoufei+"|");
            buffer.append(jianmianshoufeijutiqingkuang+"|");
            buffer.append(zhenggaijine+"|");
            buffer.append(zhenggaijinejutiqingkuang+"|");
            buffer.append(wuciqingkuang+"|");
            buffer.append("\n");
        }


        return buffer;
    }

    public static void writeToRestource(StringBuffer buffer){
        String path= Utils.getResourceBasePath()+"/xgb-data/data-api/config";
        System.out.println("输出文件目录：-----------"+path);
        String studentResourcePath = new File(path, "/StNjAdministratCostInx.txt").getAbsolutePath();
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
