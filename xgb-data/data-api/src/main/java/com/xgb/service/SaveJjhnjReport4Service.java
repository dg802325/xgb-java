package com.xgb.service;

import com.xgb.common.Utils;
import com.xgb.model.JjhnjReport4;

import java.io.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class SaveJjhnjReport4Service {

    public static StringBuffer saveEntity(StringBuffer buffer , List<JjhnjReport4> contents){
        for (JjhnjReport4 content : contents) {


        Long id = content.getId ();//ID
        String instanceid = content.getInstanceid ();//INSTANCEID
        String organizationid = content.getOrganizationid ();//ORGANIZATIONID
        Short status = content.getStatus ();//STATUS
        String bianzhidanwei = content.getBianzhidanwei ();//编制单位
        String niandu = content.getNiandu ();//年度
        BigDecimal mojuanfeixian = content.getMojuanfeixian ();//末捐非限
        BigDecimal mojuanxian = content.getMojuanxian ();//末捐限
        BigDecimal mojuanheji = content.getMojuanheji ();//末捐合计
        BigDecimal leijijuanfeixian = content.getLeijijuanfeixian ();//累计捐非限
        BigDecimal leijijuanxian = content.getLeijijuanxian ();//累计捐限
        BigDecimal leijijuanheji = content.getLeijijuanheji ();//累计捐合计
        BigDecimal mohuifeixian = content.getMohuifeixian ();//末会非限
        BigDecimal mohuixian = content.getMohuixian ();//末会限
        BigDecimal mohuiheji = content.getMohuiheji ();//末会合计
        BigDecimal leijihuifeixian = content.getLeijihuifeixian ();//累计会非限
        BigDecimal leijihuixian = content.getLeijihuixian ();//累计会限
        BigDecimal leijihuiheji = content.getLeijihuiheji ();//累计会合计
        BigDecimal mofuwufeixian = content.getMofuwufeixian ();//末服务非限
        BigDecimal mofuwuxian = content.getMofuwuxian ();//末服务限
        BigDecimal mofuwuheji = content.getMofuwuheji ();//末服务合计
        BigDecimal leijifuwufeixian = content.getLeijifuwufeixian ();//累计服务非限
        BigDecimal leijifuwuxian = content.getLeijifuwuxian ();//累计服务限
        BigDecimal leijifuwuheji = content.getLeijifuwuheji ();//累计服务合计
        BigDecimal moxiaoshoufeixian = content.getMoxiaoshoufeixian ();//末销售非限
        BigDecimal moxiaoshouxian = content.getMoxiaoshouxian ();//末销售限
        BigDecimal moxiaoshouheji = content.getMoxiaoshouheji ();//末销售合计
        BigDecimal leijixiaoshoufeixian = content.getLeijixiaoshoufeixian ();//累计销售非限
        BigDecimal leijixiaoshouxian = content.getLeijixiaoshouxian ();//累计销售限
        BigDecimal leijixiaoshouheji = content.getLeijixiaoshouheji ();//累计销售合计
        BigDecimal mobuzhufeixian = content.getMobuzhufeixian ();//末补助非限
        BigDecimal mobuzhuxian = content.getMobuzhuxian ();//末补助限
        BigDecimal mobuzhuheji = content.getMobuzhuheji ();//末补助合计
        BigDecimal leijibuzhufeixian = content.getLeijibuzhufeixian ();//累计补助非限
        BigDecimal motouzifeixian = content.getMotouzifeixian ();//末投资非限
        BigDecimal motouzixian = content.getMotouzixian ();//末投资限
        BigDecimal motouziheji = content.getMotouziheji ();//末投资合计
        BigDecimal leijitouzifeixian = content.getLeijitouzifeixian ();//累计投资非限
        BigDecimal leijitouzixian = content.getLeijitouzixian ();//累计投资限
        BigDecimal leijitouziheji = content.getLeijitouziheji ();//累计投资合计
        BigDecimal moqitafeixian = content.getMoqitafeixian ();//末其他非限
        BigDecimal moqitaxian = content.getMoqitaxian ();//末其他限
        BigDecimal moqitaheji = content.getMoqitaheji ();//末其他合计
        BigDecimal leijiqitafeixian = content.getLeijiqitafeixian ();//累计其他非限
        BigDecimal leijiqitaxian = content.getLeijiqitaxian ();//累计其他限
        BigDecimal leijiqitaheji = content.getLeijiqitaheji ();//累计其他合计
        BigDecimal mohejifeixian = content.getMohejifeixian ();//末合计非限
        BigDecimal mohejixian = content.getMohejixian ();//末合计限
        BigDecimal mohejiheji = content.getMohejiheji ();//末合计合计
        BigDecimal leijihejifeixian = content.getLeijihejifeixian ();//累计合计非限
        BigDecimal leijihejixian = content.getLeijihejixian ();//累计合计限
        BigDecimal leijihejiheji = content.getLeijihejiheji ();//累计合计合计
        BigDecimal mochengbenfeixian = content.getMochengbenfeixian ();//末成本非限
        BigDecimal mochengbenxian = content.getMochengbenxian ();//末成本限
        BigDecimal mochengbenheji = content.getMochengbenheji ();//末成本合计
        BigDecimal leijichengbenfeixian = content.getLeijichengbenfeixian ();//累计成本非限
        BigDecimal leijichengbenxian = content.getLeijichengbenxian ();//累计成本限
        BigDecimal leijichengbenheji = content.getLeijichengbenheji ();//累计成本合计
        BigDecimal moqizhongfeixian1 = content.getMoqizhongfeixian1 ();//末其中非限1
        BigDecimal moqizhongxian1 = content.getMoqizhongxian1 ();//末其中限1
        BigDecimal moqizhongheji1 = content.getMoqizhongheji1 ();//末其中合计1
        BigDecimal leijiqizhongfeixian1 = content.getLeijiqizhongfeixian1 ();//累计其中非限1
        BigDecimal leijiqizhongxian1 = content.getLeijiqizhongxian1 ();//累计其中限1
        BigDecimal leijiqizhongheji1 = content.getLeijiqizhongheji1 ();//累计其中合计1
        BigDecimal moqizhongfeixian2 = content.getMoqizhongfeixian2 ();//末其中非限2
        BigDecimal moqizhongxian2 = content.getMoqizhongxian2 ();//末其中限2
        BigDecimal moqizhongheji2 = content.getMoqizhongheji2 ();//末其中合计2
        BigDecimal leijiqizhongfeixian2 = content.getLeijiqizhongfeixian2 ();//累计其中非限2
        BigDecimal leijiqizhongxian2 = content.getLeijiqizhongxian2 ();//累计其中限2
        BigDecimal leijiqizhongheji2 = content.getLeijiqizhongheji2 ();//累计其中合计2
        BigDecimal moqizhongfeixian3 = content.getMoqizhongfeixian3 ();//末其中非限3
        BigDecimal moqizhongxian3 = content.getMoqizhongxian3 ();//末其中限3
        BigDecimal moqizhongheji3 = content.getMoqizhongheji3 ();//末其中合计3
        BigDecimal leijiqizhongfeixian3 = content.getLeijiqizhongfeixian3 ();//累计其中非限3
        BigDecimal leijiqizhongxian3 = content.getLeijiqizhongxian3 ();//累计其中限3
        BigDecimal leijiqizhongheji3 = content.getLeijiqizhongheji3 ();//累计其中合计3
        BigDecimal moqizhongfeixian4 = content.getMoqizhongfeixian4 ();//末其中非限4
        BigDecimal moqizhongxian4 = content.getMoqizhongxian4 ();//末其中限4
        BigDecimal moqizhongheji4 = content.getMoqizhongheji4 ();//末其中合计4
        BigDecimal leijiqizhongfeixian4 = content.getLeijiqizhongfeixian4 ();//累计其中非限4
        BigDecimal leijiqizhongxian4 = content.getLeijiqizhongxian4 ();//累计其中限4
        BigDecimal leijiqizhongheji4 = content.getLeijiqizhongheji4 ();//累计其中合计4
        BigDecimal moguanlifeixian = content.getMoguanlifeixian ();//末管理非限
        BigDecimal moguanlixian = content.getMoguanlixian ();//末管理限
        BigDecimal moguanliheji = content.getMoguanliheji ();//末管理合计
        BigDecimal leijiguanlifeixian = content.getLeijiguanlifeixian ();//累计管理非限
        BigDecimal leijiguanlixian = content.getLeijiguanlixian ();//累计管理限
        BigDecimal leijiguanliheji = content.getLeijiguanliheji ();//累计管理合计
        BigDecimal mochouzifeixian = content.getMochouzifeixian ();//末筹资非限
        BigDecimal mochouzixian = content.getMochouzixian ();//末筹资限
        BigDecimal mochouziheji = content.getMochouziheji ();//末筹资合计
        BigDecimal leijichouzifeixian = content.getLeijichouzifeixian ();//累计筹资非限
        BigDecimal leijichouzixian = content.getLeijichouzixian ();//累计筹资限
        BigDecimal leijichouziheji = content.getLeijichouziheji ();//累计筹资合计
        BigDecimal moqitafeiyongfei = content.getMoqitafeiyongfei ();//末其他费用非
        BigDecimal moqitafeiyongxian = content.getMoqitafeiyongxian ();//末其他费用限
        BigDecimal moqitafeiyongheji = content.getMoqitafeiyongheji ();//末其他费用合计
        BigDecimal leijiqitafeiyongfeixian = content.getLeijiqitafeiyongfeixian ();//累计其他费用非限
        BigDecimal leijiqitafeiyongxian = content.getLeijiqitafeiyongxian ();//累计其他费用限
        BigDecimal leijiqitafeiyongheji = content.getLeijiqitafeiyongheji ();//累计其他费用合计
        BigDecimal mofeiyonghejifei = content.getMofeiyonghejifei ();//末费用合计非
        BigDecimal mofeiyonghejixian = content.getMofeiyonghejixian ();//末费用合计限
        BigDecimal mofeiyonghejiheji = content.getMofeiyonghejiheji ();//末费用合计合计
        BigDecimal leijifeiyonghejifei = content.getLeijifeiyonghejifei ();//累计费用合计非
        BigDecimal leijifeiyonghejixian = content.getLeijifeiyonghejixian ();//累计费用合计限
        BigDecimal leijifeiyonghejiheji = content.getLeijifeiyonghejiheji ();//累计费用合计合计
        BigDecimal mozhuanfeixian = content.getMozhuanfeixian ();//末转非限
        BigDecimal mozhuanxian = content.getMozhuanxian ();//末转限
        BigDecimal mozhuanheji = content.getMozhuanheji ();//末转合计
        BigDecimal leijizhuanfeixian = content.getLeijizhuanfeixian ();//累计转非限
        BigDecimal leijizhuanxian = content.getLeijizhuanxian ();//累计转限
        BigDecimal leijizhuanheji = content.getLeijizhuanheji ();//累计转合计
        BigDecimal mobiandongfeixian = content.getMobiandongfeixian ();//末变动非限
        BigDecimal mobiandongxian = content.getMobiandongxian ();//末变动限
        BigDecimal mobiandongheji = content.getMobiandongheji ();//末变动合计
        BigDecimal leijibiandongfeixian = content.getLeijibiandongfeixian ();//累计变动非限
        BigDecimal leijibiandongxian = content.getLeijibiandongxian ();//累计变动限
        BigDecimal leijibiandongheji = content.getLeijibiandongheji ();//累计变动合计
        BigDecimal leijibuzhuxian = content.getLeijibuzhuxian ();//累计补助限
        BigDecimal leijibuzhuheji = content.getLeijibuzhuheji ();//累计补助合计
        String qizhong1 = content.getQizhong1 ();//业务活动成本其中1
        String qizhong2 = content.getQizhong2 ();//业务活动成本其中2
        String qizhong3 = content.getQizhong3 ();//业务活动成本其中3
        String qizhong4 = content.getQizhong4 ();//业务活动成本其中4
        BigDecimal moqizhongfeixian5 = content.getMoqizhongfeixian5 ();//末其中非限5
        BigDecimal moqizhongfeixian6 = content.getMoqizhongfeixian6 ();//末其中非限6
        BigDecimal moqizhongfeixian7 = content.getMoqizhongfeixian7 ();//末其中非限7
        BigDecimal moqizhongfeixian8 = content.getMoqizhongfeixian8 ();//末其中非限8
        BigDecimal moqizhongxian5 = content.getMoqizhongxian5 ();//末其中限5
        BigDecimal moqizhongxian6 = content.getMoqizhongxian6 ();//末其中限6
        BigDecimal moqizhongxian7 = content.getMoqizhongxian7 ();//末其中限7
        BigDecimal moqizhongxian8 = content.getMoqizhongxian8 ();//末其中限8
        BigDecimal moqizhongheji5 = content.getMoqizhongheji5 ();//末其中合计5
        BigDecimal moqizhongheji6 = content.getMoqizhongheji6 ();//末其中合计6
        BigDecimal moqizhongheji7 = content.getMoqizhongheji7 ();//末其中合计7
        BigDecimal moqizhongheji8 = content.getMoqizhongheji8 ();//末其中合计8
        BigDecimal leijiqizhongfeixian5 = content.getLeijiqizhongfeixian5 ();//累计其中非限5
        BigDecimal leijiqizhongfeixian6 = content.getLeijiqizhongfeixian6 ();//累计其中非限6
        BigDecimal leijiqizhongfeixian7 = content.getLeijiqizhongfeixian7 ();//累计其中非限7
        BigDecimal leijiqizhongfeixian8 = content.getLeijiqizhongfeixian8 ();//累计其中非限8
        BigDecimal leijiqizhongxian5 = content.getLeijiqizhongxian5 ();//累计其中限5
        BigDecimal leijiqizhongxian6 = content.getLeijiqizhongxian6 ();//累计其中限6
        BigDecimal leijiqizhongxian7 = content.getLeijiqizhongxian7 ();//累计其中限7
        BigDecimal leijiqizhongxian8 = content.getLeijiqizhongxian8 ();//累计其中限8
        BigDecimal leijiqizhongheji5 = content.getLeijiqizhongheji5 ();//累计其中合计5
        BigDecimal leijiqizhongheji6 = content.getLeijiqizhongheji6 ();//累计其中合计6
        BigDecimal leijiqizhongheji7 = content.getLeijiqizhongheji7 ();//累计其中合计7
        BigDecimal leijiqizhongheji8 = content.getLeijiqizhongheji8 ();//累计其中合计8
        BigDecimal renyuan1 = content.getRenyuan1 ();//人员1
        BigDecimal renyuan2 = content.getRenyuan2 ();//人员2
        BigDecimal renyuan3 = content.getRenyuan3 ();//人员3
        BigDecimal renyuan4 = content.getRenyuan4 ();//人员4
        BigDecimal renyuan5 = content.getRenyuan5 ();//人员5
        BigDecimal renyuan6 = content.getRenyuan6 ();//人员6
        BigDecimal renyuan7 = content.getRenyuan7 ();//人员7
        BigDecimal richang1 = content.getRichang1 ();//日常1
        BigDecimal richang2 = content.getRichang2 ();//日常2
        BigDecimal richang3 = content.getRichang3 ();//日常3
        BigDecimal richang4 = content.getRichang4 ();//日常4
        BigDecimal richang5 = content.getRichang5 ();//日常5
        BigDecimal richang6 = content.getRichang6 ();//日常6
        BigDecimal richang7 = content.getRichang7 ();//日常7
        BigDecimal guding1 = content.getGuding1 ();//固定资产1
        BigDecimal guding2 = content.getGuding2 ();//固定资产2
        BigDecimal guding3 = content.getGuding3 ();//固定资产3
        BigDecimal guding4 = content.getGuding4 ();//固定资产4
        BigDecimal guding5 = content.getGuding5 ();//固定资产5
        BigDecimal guding6 = content.getGuding6 ();//固定资产6
        BigDecimal guding7 = content.getGuding7 ();//固定资产7
        BigDecimal shuifei1 = content.getShuifei1 ();//税费1
        BigDecimal shuifei2 = content.getShuifei2 ();//税费1
        BigDecimal shuifei3 = content.getShuifei3 ();//税费1
        BigDecimal shuifei4 = content.getShuifei4 ();//税费1
        BigDecimal shuifei5 = content.getShuifei5 ();//税费1
        BigDecimal shuifei6 = content.getShuifei6 ();//税费1
        BigDecimal shuifei7 = content.getShuifei7 ();//税费1
        String tjnjjieguo1 = content.getTjnjjieguo1 ();//天津年检结果1
        String tjnjjieguo2 = content.getTjnjjieguo2 ();//天津年检结果2
        String tjnjyijian1 = content.getTjnjyijian1 ();//天津审核意见1
        String tjnjyijian2 = content.getTjnjyijian2 ();//天津审核意见2
        String tjnjxingming1 = content.getTjnjxingming1 ();//天津审核姓名1
        String tjnjxingming2 = content.getTjnjxingming2 ();//天津审核姓名2
        Date tjnjshijian1 = content.getTjnjshijian1 ();//天津审批时间1
        Date tjnjshijian2 = content.getTjnjshijian2 ();//天津审批时间2
        BigDecimal xianjinjuanzeng = content.getXianjinjuanzeng ();//本年度现金捐赠收入
        BigDecimal xianjingongyi = content.getXianjingongyi ();//本年度现金公益项目支出
        BigDecimal xiandingxing = content.getXiandingxing ();//上年收入中不得使用的限定性收入
        BigDecimal xiandingzichan = content.getXiandingzichan ();//上年解除时间限定的净资产
        BigDecimal qita1 = content.getQita1 ();//其他1（管理费用）
        BigDecimal qita2 = content.getQita2 ();//其他2（管理费用）
        BigDecimal qita3 = content.getQita3 ();//其他3（管理费用）
        BigDecimal qita4 = content.getQita4 ();//其他4（管理费用）
        BigDecimal qita5 = content.getQita5 ();//其他5（管理费用）
        BigDecimal qita6 = content.getQita6 ();//其他6（管理费用）
        BigDecimal fujiafeixian = content.getFujiafeixian ();//null
        BigDecimal fujiaxian = content.getFujiaxian ();//null
        BigDecimal fujiaheji = content.getFujiaheji ();//null
        BigDecimal leijifujiafeixian = content.getLeijifujiafeixian ();//null
        BigDecimal leijifujiaxian = content.getLeijifujiaxian ();//null
        BigDecimal leijifujiaheji = content.getLeijifujiaheji ();//null

        buffer.append(id+"|");
        buffer.append(instanceid+"|");
        buffer.append(organizationid+"|");
        buffer.append(status+"|");
        buffer.append(bianzhidanwei+"|");
        buffer.append(niandu+"|");
        buffer.append(mojuanfeixian+"|");
        buffer.append(mojuanxian+"|");
        buffer.append(mojuanheji+"|");
        buffer.append(leijijuanfeixian+"|");
        buffer.append(leijijuanxian+"|");
        buffer.append(leijijuanheji+"|");
        buffer.append(mohuifeixian+"|");
        buffer.append(mohuixian+"|");
        buffer.append(mohuiheji+"|");
        buffer.append(leijihuifeixian+"|");
        buffer.append(leijihuixian+"|");
        buffer.append(leijihuiheji+"|");
        buffer.append(mofuwufeixian+"|");
        buffer.append(mofuwuxian+"|");
        buffer.append(mofuwuheji+"|");
        buffer.append(leijifuwufeixian+"|");
        buffer.append(leijifuwuxian+"|");
        buffer.append(leijifuwuheji+"|");
        buffer.append(moxiaoshoufeixian+"|");
        buffer.append(moxiaoshouxian+"|");
        buffer.append(moxiaoshouheji+"|");
        buffer.append(leijixiaoshoufeixian+"|");
        buffer.append(leijixiaoshouxian+"|");
        buffer.append(leijixiaoshouheji+"|");
        buffer.append(mobuzhufeixian+"|");
        buffer.append(mobuzhuxian+"|");
        buffer.append(mobuzhuheji+"|");
        buffer.append(leijibuzhufeixian+"|");
        buffer.append(motouzifeixian+"|");
        buffer.append(motouzixian+"|");
        buffer.append(motouziheji+"|");
        buffer.append(leijitouzifeixian+"|");
        buffer.append(leijitouzixian+"|");
        buffer.append(leijitouziheji+"|");
        buffer.append(moqitafeixian+"|");
        buffer.append(moqitaxian+"|");
        buffer.append(moqitaheji+"|");
        buffer.append(leijiqitafeixian+"|");
        buffer.append(leijiqitaxian+"|");
        buffer.append(leijiqitaheji+"|");
        buffer.append(mohejifeixian+"|");
        buffer.append(mohejixian+"|");
        buffer.append(mohejiheji+"|");
        buffer.append(leijihejifeixian+"|");
        buffer.append(leijihejixian+"|");
        buffer.append(leijihejiheji+"|");
        buffer.append(mochengbenfeixian+"|");
        buffer.append(mochengbenxian+"|");
        buffer.append(mochengbenheji+"|");
        buffer.append(leijichengbenfeixian+"|");
        buffer.append(leijichengbenxian+"|");
        buffer.append(leijichengbenheji+"|");
        buffer.append(moqizhongfeixian1+"|");
        buffer.append(moqizhongxian1+"|");
        buffer.append(moqizhongheji1+"|");
        buffer.append(leijiqizhongfeixian1+"|");
        buffer.append(leijiqizhongxian1+"|");
        buffer.append(leijiqizhongheji1+"|");
        buffer.append(moqizhongfeixian2+"|");
        buffer.append(moqizhongxian2+"|");
        buffer.append(moqizhongheji2+"|");
        buffer.append(leijiqizhongfeixian2+"|");
        buffer.append(leijiqizhongxian2+"|");
        buffer.append(leijiqizhongheji2+"|");
        buffer.append(moqizhongfeixian3+"|");
        buffer.append(moqizhongxian3+"|");
        buffer.append(moqizhongheji3+"|");
        buffer.append(leijiqizhongfeixian3+"|");
        buffer.append(leijiqizhongxian3+"|");
        buffer.append(leijiqizhongheji3+"|");
        buffer.append(moqizhongfeixian4+"|");
        buffer.append(moqizhongxian4+"|");
        buffer.append(moqizhongheji4+"|");
        buffer.append(leijiqizhongfeixian4+"|");
        buffer.append(leijiqizhongxian4+"|");
        buffer.append(leijiqizhongheji4+"|");
        buffer.append(moguanlifeixian+"|");
        buffer.append(moguanlixian+"|");
        buffer.append(moguanliheji+"|");
        buffer.append(leijiguanlifeixian+"|");
        buffer.append(leijiguanlixian+"|");
        buffer.append(leijiguanliheji+"|");
        buffer.append(mochouzifeixian+"|");
        buffer.append(mochouzixian+"|");
        buffer.append(mochouziheji+"|");
        buffer.append(leijichouzifeixian+"|");
        buffer.append(leijichouzixian+"|");
        buffer.append(leijichouziheji+"|");
        buffer.append(moqitafeiyongfei+"|");
        buffer.append(moqitafeiyongxian+"|");
        buffer.append(moqitafeiyongheji+"|");
        buffer.append(leijiqitafeiyongfeixian+"|");
        buffer.append(leijiqitafeiyongxian+"|");
        buffer.append(leijiqitafeiyongheji+"|");
        buffer.append(mofeiyonghejifei+"|");
        buffer.append(mofeiyonghejixian+"|");
        buffer.append(mofeiyonghejiheji+"|");
        buffer.append(leijifeiyonghejifei+"|");
        buffer.append(leijifeiyonghejixian+"|");
        buffer.append(leijifeiyonghejiheji+"|");
        buffer.append(mozhuanfeixian+"|");
        buffer.append(mozhuanxian+"|");
        buffer.append(mozhuanheji+"|");
        buffer.append(leijizhuanfeixian+"|");
        buffer.append(leijizhuanxian+"|");
        buffer.append(leijizhuanheji+"|");
        buffer.append(mobiandongfeixian+"|");
        buffer.append(mobiandongxian+"|");
        buffer.append(mobiandongheji+"|");
        buffer.append(leijibiandongfeixian+"|");
        buffer.append(leijibiandongxian+"|");
        buffer.append(leijibiandongheji+"|");
        buffer.append(leijibuzhuxian+"|");
        buffer.append(leijibuzhuheji+"|");
        buffer.append(qizhong1+"|");
        buffer.append(qizhong2+"|");
        buffer.append(qizhong3+"|");
        buffer.append(qizhong4+"|");
        buffer.append(moqizhongfeixian5+"|");
        buffer.append(moqizhongfeixian6+"|");
        buffer.append(moqizhongfeixian7+"|");
        buffer.append(moqizhongfeixian8+"|");
        buffer.append(moqizhongxian5+"|");
        buffer.append(moqizhongxian6+"|");
        buffer.append(moqizhongxian7+"|");
        buffer.append(moqizhongxian8+"|");
        buffer.append(moqizhongheji5+"|");
        buffer.append(moqizhongheji6+"|");
        buffer.append(moqizhongheji7+"|");
        buffer.append(moqizhongheji8+"|");
        buffer.append(leijiqizhongfeixian5+"|");
        buffer.append(leijiqizhongfeixian6+"|");
        buffer.append(leijiqizhongfeixian7+"|");
        buffer.append(leijiqizhongfeixian8+"|");
        buffer.append(leijiqizhongxian5+"|");
        buffer.append(leijiqizhongxian6+"|");
        buffer.append(leijiqizhongxian7+"|");
        buffer.append(leijiqizhongxian8+"|");
        buffer.append(leijiqizhongheji5+"|");
        buffer.append(leijiqizhongheji6+"|");
        buffer.append(leijiqizhongheji7+"|");
        buffer.append(leijiqizhongheji8+"|");
        buffer.append(renyuan1+"|");
        buffer.append(renyuan2+"|");
        buffer.append(renyuan3+"|");
        buffer.append(renyuan4+"|");
        buffer.append(renyuan5+"|");
        buffer.append(renyuan6+"|");
        buffer.append(renyuan7+"|");
        buffer.append(richang1+"|");
        buffer.append(richang2+"|");
        buffer.append(richang3+"|");
        buffer.append(richang4+"|");
        buffer.append(richang5+"|");
        buffer.append(richang6+"|");
        buffer.append(richang7+"|");
        buffer.append(guding1+"|");
        buffer.append(guding2+"|");
        buffer.append(guding3+"|");
        buffer.append(guding4+"|");
        buffer.append(guding5+"|");
        buffer.append(guding6+"|");
        buffer.append(guding7+"|");
        buffer.append(shuifei1+"|");
        buffer.append(shuifei2+"|");
        buffer.append(shuifei3+"|");
        buffer.append(shuifei4+"|");
        buffer.append(shuifei5+"|");
        buffer.append(shuifei6+"|");
        buffer.append(shuifei7+"|");
        buffer.append(tjnjjieguo1+"|");
        buffer.append(tjnjjieguo2+"|");
        buffer.append(tjnjyijian1+"|");
        buffer.append(tjnjyijian2+"|");
        buffer.append(tjnjxingming1+"|");
        buffer.append(tjnjxingming2+"|");
        buffer.append(tjnjshijian1+"|");
        buffer.append(tjnjshijian2+"|");
        buffer.append(xianjinjuanzeng+"|");
        buffer.append(xianjingongyi+"|");
        buffer.append(xiandingxing+"|");
        buffer.append(xiandingzichan+"|");
        buffer.append(qita1+"|");
        buffer.append(qita2+"|");
        buffer.append(qita3+"|");
        buffer.append(qita4+"|");
        buffer.append(qita5+"|");
        buffer.append(qita6+"|");
        buffer.append(fujiafeixian+"|");
        buffer.append(fujiaxian+"|");
        buffer.append(fujiaheji+"|");
        buffer.append(leijifujiafeixian+"|");
        buffer.append(leijifujiaxian+"|");
        buffer.append(leijifujiaheji+"|");
        buffer.append("\n");
        }
        return buffer;
    }

    public static void writeToRestource(StringBuffer buffer){
        String path= Utils.getResourceBasePath()+"/xgb-data/data-api/config";
        System.out.println("输出文件目录：-----------"+path);
        String studentResourcePath = new File(path, "/JjhnjReport4.txt").getAbsolutePath();
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
