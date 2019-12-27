package com.xgb.service;

import com.xgb.common.Utils;
import com.xgb.model.JjhnjReport3;

import java.io.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class SaveJjhnjReport3Service {

    public static StringBuffer saveEntity(StringBuffer buffer , List<JjhnjReport3> contents){
        for (JjhnjReport3 content : contents) {
            Long id = content.getId ();//ID
            String instanceid = content.getInstanceid ();//INSTANCEID
            String organizationid = content.getOrganizationid ();//ORGANIZATIONID
            Short status = content.getStatus ();//STATUS
            String bianzhidanwei = content.getBianzhidanwei ();//编制单位
            String niandu = content.getNiandu ();//年度
            BigDecimal nianchushu1 = content.getNianchushu1 ();//货币资金年初数
            BigDecimal qimoshu1 = content.getQimoshu1 ();//货币资金期末数
            BigDecimal nianchushu23 = content.getNianchushu23 ();//短期借款年初数
            BigDecimal qimoshu22 = content.getQimoshu22 ();//资产总计期末数
            BigDecimal nianchushu2 = content.getNianchushu2 ();//短期投资年初数
            BigDecimal qimoshu2 = content.getQimoshu2 ();//短期投资期末数
            BigDecimal nianchushu24 = content.getNianchushu24 ();//应付款项年初数
            BigDecimal qimoshu23 = content.getQimoshu23 ();//短期借款期末数
            BigDecimal nianchushu3 = content.getNianchushu3 ();//应收款项年初数
            BigDecimal qimoshu3 = content.getQimoshu3 ();//应收款项期末数
            BigDecimal nianchushu25 = content.getNianchushu25 ();//应付工资年初数
            BigDecimal qimoshu24 = content.getQimoshu24 ();//应付款项期末数
            BigDecimal nianchushu4 = content.getNianchushu4 ();//预付账款年初数
            BigDecimal qimoshu4 = content.getQimoshu4 ();//预付账款期末数
            BigDecimal nianchushu26 = content.getNianchushu26 ();//应交税金年初数
            BigDecimal qimoshu25 = content.getQimoshu25 ();//应付工资期末数
            BigDecimal nianchushu5 = content.getNianchushu5 ();//存货年初数
            BigDecimal qimoshu5 = content.getQimoshu5 ();//存货期末数
            BigDecimal nianchushu27 = content.getNianchushu27 ();//预收账款年初数
            BigDecimal qimoshu26 = content.getQimoshu26 ();//应交税金期末数
            BigDecimal nianchushu6 = content.getNianchushu6 ();//待摊费用年初数
            BigDecimal qimoshu6 = content.getQimoshu6 ();//待摊费用期末数
            BigDecimal nianchushu28 = content.getNianchushu28 ();//预提费用年初数
            BigDecimal qimoshu27 = content.getQimoshu27 ();//预收账款期末数
            BigDecimal nianchushu7 = content.getNianchushu7 ();//一年内到期的长期债权投资年初数
            BigDecimal qimoshu7 = content.getQimoshu7 ();//一年内到期的长期债权投资期末数
            BigDecimal nianchushu29 = content.getNianchushu29 ();//预计负债年初数
            BigDecimal qimoshu28 = content.getQimoshu28 ();//预提费用期末数
            BigDecimal nianchushu8 = content.getNianchushu8 ();//其他流动资产年初数
            BigDecimal qimoshu8 = content.getQimoshu8 ();//其他流动资产期末数
            BigDecimal nianchushu30 = content.getNianchushu30 ();//一年内到期的长期负债年初数
            BigDecimal nianchushu9 = content.getNianchushu9 ();//流动资产合计年初数
            BigDecimal qimoshu9 = content.getQimoshu9 ();//流动资产合计期末数
            BigDecimal nianchushu31 = content.getNianchushu31 ();//其他流动负债年初数
            BigDecimal qimoshu29 = content.getQimoshu29 ();//预计负债期末数
            BigDecimal nianchushu32 = content.getNianchushu32 ();//流动负债合计年初数
            BigDecimal qimoshu30 = content.getQimoshu30 ();//一年内到期的长期负债期末数
            BigDecimal nianchushu10 = content.getNianchushu10 ();//长期股权投资年初数
            BigDecimal qimoshu10 = content.getQimoshu10 ();//长期股权投资期末数
            BigDecimal nianchushu11 = content.getNianchushu11 ();//长期债权投资年初数
            BigDecimal qimoshu11 = content.getQimoshu11 ();//长期债权投资期末数
            BigDecimal nianchushu33 = content.getNianchushu33 ();//长期借款年初数
            BigDecimal qimoshu31 = content.getQimoshu31 ();//其他流动负债期末数
            BigDecimal nianchushu12 = content.getNianchushu12 ();//长期投资合计年初数
            BigDecimal nianchushu34 = content.getNianchushu34 ();//长期应付款年初数
            BigDecimal qimoshu32 = content.getQimoshu32 ();//流动负债合计期末数
            BigDecimal nianchushu35 = content.getNianchushu35 ();//其他长期负债年初数
            BigDecimal qimoshu33 = content.getQimoshu33 ();//长期借款期末数
            BigDecimal nianchushu36 = content.getNianchushu36 ();//长期负债合计年初数
            BigDecimal qimoshu34 = content.getQimoshu34 ();//长期应付款期末数
            BigDecimal nianchushu13 = content.getNianchushu13 ();//固定资产原价年初数
            BigDecimal qimoshu12 = content.getQimoshu12 ();//长期投资合计期末数
            BigDecimal nianchushu14 = content.getNianchushu14 ();//累计折旧年初数
            BigDecimal qimoshu13 = content.getQimoshu13 ();//固定资产原价期末数
            BigDecimal nianchushu15 = content.getNianchushu15 ();//固定资产净值年初数
            BigDecimal qimoshu14 = content.getQimoshu14 ();//累计折旧期末数
            BigDecimal nianchushu37 = content.getNianchushu37 ();//受托代理负债年初数
            BigDecimal qimoshu35 = content.getQimoshu35 ();//其他长期负债期末数
            BigDecimal nianchushu16 = content.getNianchushu16 ();//在建工程年初数
            BigDecimal qimoshu15 = content.getQimoshu15 ();//固定资产净值期末数
            BigDecimal nianchushu17 = content.getNianchushu17 ();//文物文化资产年初数
            BigDecimal qimoshu16 = content.getQimoshu16 ();//在建工程期末数
            BigDecimal nianchushu38 = content.getNianchushu38 ();//负债合计年初数
            BigDecimal qimoshu36 = content.getQimoshu36 ();//长期负债合计期末数
            BigDecimal nianchushu18 = content.getNianchushu18 ();//固定资产清理年初数
            BigDecimal qimoshu17 = content.getQimoshu17 ();//文物文化资产期末数
            BigDecimal nianchushu19 = content.getNianchushu19 ();//固定资产合计年初数
            BigDecimal qimoshu18 = content.getQimoshu18 ();//固定资产清理期末数
            BigDecimal nianchushu20 = content.getNianchushu20 ();//无形资产年初数
            BigDecimal qimoshu19 = content.getQimoshu19 ();//固定资产合计期末数
            BigDecimal nianchushu39 = content.getNianchushu39 ();//非限定性净资产年初数
            BigDecimal qimoshu37 = content.getQimoshu37 ();//受托代理负债期末数
            BigDecimal nianchushu40 = content.getNianchushu40 ();//限定性净资产年初数
            BigDecimal qimoshu38 = content.getQimoshu38 ();//负债合计期末数
            BigDecimal nianchushu21 = content.getNianchushu21 ();//受托代理资产年初数
            BigDecimal qimoshu20 = content.getQimoshu20 ();//无形资产期末数
            BigDecimal nianchushu41 = content.getNianchushu41 ();//净资产合计年初数
            BigDecimal qimoshu39 = content.getQimoshu39 ();//非限定性净资产期末数
            BigDecimal nianchushu22 = content.getNianchushu22 ();//资产总计年初数
            BigDecimal qimoshu21 = content.getQimoshu21 ();//受托代理资产期末数
            BigDecimal nianchushu42 = content.getNianchushu42 ();//负债和净资产总计年初数
            BigDecimal qimoshu40 = content.getQimoshu40 ();//限定性净资产期末数
            BigDecimal qimoshu42 = content.getQimoshu42 ();//负债和净资产总计期末数
            BigDecimal qimoshu41 = content.getQimoshu41 ();//净资产合计期末数
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
            buffer.append(bianzhidanwei+"|");
            buffer.append(niandu+"|");
            buffer.append(nianchushu1+"|");
            buffer.append(qimoshu1+"|");
            buffer.append(nianchushu23+"|");
            buffer.append(qimoshu22+"|");
            buffer.append(nianchushu2+"|");
            buffer.append(qimoshu2+"|");
            buffer.append(nianchushu24+"|");
            buffer.append(qimoshu23+"|");
            buffer.append(nianchushu3+"|");
            buffer.append(qimoshu3+"|");
            buffer.append(nianchushu25+"|");
            buffer.append(qimoshu24+"|");
            buffer.append(nianchushu4+"|");
            buffer.append(qimoshu4+"|");
            buffer.append(nianchushu26+"|");
            buffer.append(qimoshu25+"|");
            buffer.append(nianchushu5+"|");
            buffer.append(qimoshu5+"|");
            buffer.append(nianchushu27+"|");
            buffer.append(qimoshu26+"|");
            buffer.append(nianchushu6+"|");
            buffer.append(qimoshu6+"|");
            buffer.append(nianchushu28+"|");
            buffer.append(qimoshu27+"|");
            buffer.append(nianchushu7+"|");
            buffer.append(qimoshu7+"|");
            buffer.append(nianchushu29+"|");
            buffer.append(qimoshu28+"|");
            buffer.append(nianchushu8+"|");
            buffer.append(qimoshu8+"|");
            buffer.append(nianchushu30+"|");
            buffer.append(nianchushu9+"|");
            buffer.append(qimoshu9+"|");
            buffer.append(nianchushu31+"|");
            buffer.append(qimoshu29+"|");
            buffer.append(nianchushu32+"|");
            buffer.append(qimoshu30+"|");
            buffer.append(nianchushu10+"|");
            buffer.append(qimoshu10+"|");
            buffer.append(nianchushu11+"|");
            buffer.append(qimoshu11+"|");
            buffer.append(nianchushu33+"|");
            buffer.append(qimoshu31+"|");
            buffer.append(nianchushu12+"|");
            buffer.append(nianchushu34+"|");
            buffer.append(qimoshu32+"|");
            buffer.append(nianchushu35+"|");
            buffer.append(qimoshu33+"|");
            buffer.append(nianchushu36+"|");
            buffer.append(qimoshu34+"|");
            buffer.append(nianchushu13+"|");
            buffer.append(qimoshu12+"|");
            buffer.append(nianchushu14+"|");
            buffer.append(qimoshu13+"|");
            buffer.append(nianchushu15+"|");
            buffer.append(qimoshu14+"|");
            buffer.append(nianchushu37+"|");
            buffer.append(qimoshu35+"|");
            buffer.append(nianchushu16+"|");
            buffer.append(qimoshu15+"|");
            buffer.append(nianchushu17+"|");
            buffer.append(qimoshu16+"|");
            buffer.append(nianchushu38+"|");
            buffer.append(qimoshu36+"|");
            buffer.append(nianchushu18+"|");
            buffer.append(qimoshu17+"|");
            buffer.append(nianchushu19+"|");
            buffer.append(qimoshu18+"|");
            buffer.append(nianchushu20+"|");
            buffer.append(qimoshu19+"|");
            buffer.append(nianchushu39+"|");
            buffer.append(qimoshu37+"|");
            buffer.append(nianchushu40+"|");
            buffer.append(qimoshu38+"|");
            buffer.append(nianchushu21+"|");
            buffer.append(qimoshu20+"|");
            buffer.append(nianchushu41+"|");
            buffer.append(qimoshu39+"|");
            buffer.append(nianchushu22+"|");
            buffer.append(qimoshu21+"|");
            buffer.append(nianchushu42+"|");
            buffer.append(qimoshu40+"|");
            buffer.append(qimoshu42+"|");
            buffer.append(qimoshu41+"|");
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
        String studentResourcePath = new File(path, "/JjhnjReport3.txt").getAbsolutePath();
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
