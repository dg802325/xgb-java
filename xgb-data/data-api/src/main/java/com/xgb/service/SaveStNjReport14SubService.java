package com.xgb.service;

import com.xgb.common.Utils;
import com.xgb.model.StNjReport14Sub;

import java.io.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class SaveStNjReport14SubService {

    public static StringBuffer saveEntity(StringBuffer buffer , List<StNjReport14Sub> contents){
        for (StNjReport14Sub content : contents) {
            Long id = content.getId ();//ID
            String instanceid = content.getInstanceid ();//INSTANCEID
            String organizationid = content.getOrganizationid ();//ORGANIZATIONID
            Short status = content.getStatus ();//STATUS
            Long masterid = content.getMasterid ();//MASTERID
            String xuhao = content.getXuhao ();//序号
            String leixing = content.getLeixing ();//类型
            String huodongmingcheng = content.getHuodongmingcheng ();//活动名称
            String shijian = content.getShijian ();//时间
            String didian = content.getDidian ();//地点
            String pizhundanwei = content.getPizhundanwei ();//批准单位
            String shoufeiqingkuang = content.getShoufeiqingkuang ();//收费情况
            Date shijian3 = content.getShijian3 ();//时间3
            String zijinzizou = content.getZijinzizou ();//资金资助
            String jishu = content.getJishu ();//技术资助
            String xinxi = content.getXinxi ();//信息资助
            String zhuanjiarencai = content.getZhuanjiarencai ();//专家人才
            String train = content.getTrain ();//培训
            String production = content.getProduction ();//生产销售
            String consult = content.getConsult ();//咨询
            String other = content.getOther ();//其他
            String educative = content.getEducative ();//服务领域  教育
            String ability = content.getAbility ();//技能
            String technology = content.getTechnology ();//科技
            String fruit = content.getFruit ();//果疏
            String agricultural = content.getAgricultural ();//农机农资
            String factory = content.getFactory ();//生产生产加工
            String aquaculture = content.getAquaculture ();//畜牧养殖
            String manresource = content.getManresource ();//人力资源
            String economic = content.getEconomic ();//经济作物
            String culturology = content.getCulturology ();//文化体育
            String charitable = content.getCharitable ();//慈善求助
            String medicare = content.getMedicare ();//医疗卫生
            String market = content.getMarket ();//市场培育
            String environmental = content.getEnvironmental ();//环境水利
            String basicorganization = content.getBasicorganization ();//基层组织
            String complex = content.getComplex ();//综合开发
            String serviceother = content.getServiceother ();//服务领域其他
            String tjnjjieguo1 = content.getTjnjjieguo1 ();//天津年检结果1
            String tjnjjieguo2 = content.getTjnjjieguo2 ();//天津年检结果2
            String tjnjyijian1 = content.getTjnjyijian1 ();//天津审核意见1
            String tjnjyijian2 = content.getTjnjyijian2 ();//天津审核意见2
            String tjnjxingming1 = content.getTjnjxingming1 ();//天津审核姓名1
            String tjnjxingming2 = content.getTjnjxingming2 ();//天津审核姓名2
            Date tjnjshijian1 = content.getTjnjshijian1 ();//天津审批时间1
            Date tjnjshijian2 = content.getTjnjshijian2 ();//天津审批时间2
            String didian1 = content.getDidian1 ();//地点1
            String wuciqingkuang = content.getWuciqingkuang ();//null

            buffer.append(id+"|");
            buffer.append(instanceid+"|");
            buffer.append(organizationid+"|");
            buffer.append(status+"|");
            buffer.append(masterid+"|");
            buffer.append(xuhao+"|");
            buffer.append(leixing+"|");
            buffer.append(huodongmingcheng+"|");
            buffer.append(shijian+"|");
            buffer.append(didian+"|");
            buffer.append(pizhundanwei+"|");
            buffer.append(shoufeiqingkuang+"|");
            buffer.append(shijian3+"|");
            buffer.append(zijinzizou+"|");
            buffer.append(jishu+"|");
            buffer.append(xinxi+"|");
            buffer.append(zhuanjiarencai+"|");
            buffer.append(train+"|");
            buffer.append(production+"|");
            buffer.append(consult+"|");
            buffer.append(other+"|");
            buffer.append(educative+"|");
            buffer.append(ability+"|");
            buffer.append(technology+"|");
            buffer.append(fruit+"|");
            buffer.append(agricultural+"|");
            buffer.append(factory+"|");
            buffer.append(aquaculture+"|");
            buffer.append(manresource+"|");
            buffer.append(economic+"|");
            buffer.append(culturology+"|");
            buffer.append(charitable+"|");
            buffer.append(medicare+"|");
            buffer.append(market+"|");
            buffer.append(environmental+"|");
            buffer.append(basicorganization+"|");
            buffer.append(complex+"|");
            buffer.append(serviceother+"|");
            buffer.append(tjnjjieguo1+"|");
            buffer.append(tjnjjieguo2+"|");
            buffer.append(tjnjyijian1+"|");
            buffer.append(tjnjyijian2+"|");
            buffer.append(tjnjxingming1+"|");
            buffer.append(tjnjxingming2+"|");
            buffer.append(tjnjshijian1+"|");
            buffer.append(tjnjshijian2+"|");
            buffer.append(didian1+"|");
            buffer.append(wuciqingkuang+"|");
            buffer.append("\n");
        }


        return buffer;
    }

    public static void writeToRestource(StringBuffer buffer){
        String path= Utils.getResourceBasePath()+"/xgb-data/data-api/config";
        System.out.println("输出文件目录：-----------"+path);
        String studentResourcePath = new File(path, "/StNjReport14Sub.txt").getAbsolutePath();
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
