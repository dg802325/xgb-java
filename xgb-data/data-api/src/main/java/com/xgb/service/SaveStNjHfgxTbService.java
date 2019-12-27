package com.xgb.service;

import com.xgb.common.Utils;
import com.xgb.model.StNjHfgxTb;

import java.io.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class SaveStNjHfgxTbService {

    public static StringBuffer saveEntity(StringBuffer buffer , List<StNjHfgxTb> contents){
        for(StNjHfgxTb content:contents){

        Long id = content.getId ();//ID
        String instanceid = content.getInstanceid ();//INSTANCEID
        String organizationid = content.getOrganizationid ();//ORGANIZATIONID
        Short status = content.getStatus ();//STATUS
        String jieci = content.getJieci ();//届次
        Date zhidingshijian = content.getZhidingshijian ();//制定时间
        BigDecimal yingjiaohuifei = content.getYingjiaohuifei ();//应缴会费
        BigDecimal libiaodanwei = content.getLibiaodanwei ();//理标单位
        BigDecimal lishudanwei = content.getLishudanwei ();//理数单位
        BigDecimal lijiaodanwei = content.getLijiaodanwei ();//理缴单位
        BigDecimal libiaogeren = content.getLibiaogeren ();//理标个人
        Integer lishugeren = content.getLishugeren ();//理数个人
        BigDecimal lijiaogeren = content.getLijiaogeren ();//理缴个人
        BigDecimal fubiaodanwei = content.getFubiaodanwei ();//副标单位
        Integer fushudanwei = content.getFushudanwei ();//副数单位
        BigDecimal fujiaodanwei = content.getFujiaodanwei ();//副缴单位
        BigDecimal fubiaogeren = content.getFubiaogeren ();//副标个人
        Integer fushugeren = content.getFushugeren ();//副数个人
        BigDecimal fujiaogeren = content.getFujiaogeren ();//副缴个人
        BigDecimal changbiaodanwei = content.getChangbiaodanwei ();//常标单位
        Integer changshudanwei = content.getChangshudanwei ();//常数单位
        BigDecimal changjiaodanwei = content.getChangjiaodanwei ();//常缴单位
        BigDecimal changbiaogeren = content.getChangbiaogeren ();//常标个人
        Integer changshugeren = content.getChangshugeren ();//常数个人
        BigDecimal changjiaogeren = content.getChangjiaogeren ();//常缴个人
        BigDecimal lishibiaodanwei = content.getLishibiaodanwei ();//理事标单位
        Integer lishishudanwei = content.getLishishudanwei ();//理事数单位
        BigDecimal lishijiaodanwei = content.getLishijiaodanwei ();//理事缴单位
        BigDecimal lishibiaogeren = content.getLishibiaogeren ();//理事标个人
        Integer lishishugeren = content.getLishishugeren ();//理事数个人
        BigDecimal lishijiaogeren = content.getLishijiaogeren ();//理事缴个人
        BigDecimal huibiaodanwei = content.getHuibiaodanwei ();//会标单位
        Integer huishudanwei = content.getHuishudanwei ();//会数单位
        BigDecimal huijiaodanwei = content.getHuijiaodanwei ();//会缴单位
        BigDecimal huibiaogeren = content.getHuibiaogeren ();//会标个人
        Integer huishugeren = content.getHuishugeren ();//会数个人
        BigDecimal huijiaogeren = content.getHuijiaogeren ();//会缴个人
        BigDecimal zichanzonge = content.getZichanzonge ();//资产总额
        BigDecimal chanzhizonge = content.getChanzhizonge ();//产值总额
        BigDecimal danweichanzhi = content.getDanweichanzhi ();//单位产值
        String huiyuanbili = content.getHuiyuanbili ();//会员比例
        Integer shitishuliang = content.getShitishuliang ();//实体数量
        BigDecimal shitichanzhi = content.getShitichanzhi ();//实体产值
        Integer xinarenshu = content.getXinarenshu ();//吸纳人数
        String jianyishuliang = content.getJianyishuliang ();//建议数量
        BigDecimal mujizijin = content.getMujizijin ();//募集资金
        Integer huijirenqun = content.getHuijirenqun ();//惠及人群
        Integer jiuyegangwei = content.getJiuyegangwei ();//就业岗位
        BigDecimal xinzengshouru = content.getXinzengshouru ();//新增收入
        Integer tanpancishu = content.getTanpancishu ();//谈判次数
        String tanpanqingkuang = content.getTanpanqingkuang ();//谈判情况
        Integer xingdongcishu = content.getXingdongcishu ();//行动次数
        String xingdongqingkuang = content.getXingdongqingkuang ();//行动情况
        String huodongqingkuang = content.getHuodongqingkuang ();//活动情况
        String fuwuqingkuang = content.getFuwuqingkuang ();//服务情况
        Date shenpiriqi = content.getShenpiriqi ();//审批日期
        String qiyejiadanren = content.getQiyejiadanren ();//null
        String hanggueihangyue = content.getHanggueihangyue ();//null
        String daodezhunze = content.getDaodezhunze ();//null
        String zilvzhidu = content.getZilvzhidu ();//null
        String zilvxuanyan = content.getZilvxuanyan ();//null
        String diaochahetongji = content.getDiaochahetongji ();//null
        String hangyexinxi = content.getHangyexinxi ();//null
        String pinpaifuwu = content.getPinpaifuwu ();//null
        String xietongfazhan = content.getXietongfazhan ();//null

        buffer.append(id+"|");
        buffer.append(instanceid+"|");
        buffer.append(organizationid+"|");
        buffer.append(status+"|");
        buffer.append(jieci+"|");
        buffer.append(zhidingshijian+"|");
        buffer.append(yingjiaohuifei+"|");
        buffer.append(libiaodanwei+"|");
        buffer.append(lishudanwei+"|");
        buffer.append(lijiaodanwei+"|");
        buffer.append(libiaogeren+"|");
        buffer.append(lishugeren+"|");
        buffer.append(lijiaogeren+"|");
        buffer.append(fubiaodanwei+"|");
        buffer.append(fushudanwei+"|");
        buffer.append(fujiaodanwei+"|");
        buffer.append(fubiaogeren+"|");
        buffer.append(fushugeren+"|");
        buffer.append(fujiaogeren+"|");
        buffer.append(changbiaodanwei+"|");
        buffer.append(changshudanwei+"|");
        buffer.append(changjiaodanwei+"|");
        buffer.append(changbiaogeren+"|");
        buffer.append(changshugeren+"|");
        buffer.append(changjiaogeren+"|");
        buffer.append(lishibiaodanwei+"|");
        buffer.append(lishishudanwei+"|");
        buffer.append(lishijiaodanwei+"|");
        buffer.append(lishibiaogeren+"|");
        buffer.append(lishishugeren+"|");
        buffer.append(lishijiaogeren+"|");
        buffer.append(huibiaodanwei+"|");
        buffer.append(huishudanwei+"|");
        buffer.append(huijiaodanwei+"|");
        buffer.append(huibiaogeren+"|");
        buffer.append(huishugeren+"|");
        buffer.append(huijiaogeren+"|");
        buffer.append(zichanzonge+"|");
        buffer.append(chanzhizonge+"|");
        buffer.append(danweichanzhi+"|");
        buffer.append(huiyuanbili+"|");
        buffer.append(shitishuliang+"|");
        buffer.append(shitichanzhi+"|");
        buffer.append(xinarenshu+"|");
        buffer.append(jianyishuliang+"|");
        buffer.append(mujizijin+"|");
        buffer.append(huijirenqun+"|");
        buffer.append(jiuyegangwei+"|");
        buffer.append(xinzengshouru+"|");
        buffer.append(tanpancishu+"|");
        buffer.append(tanpanqingkuang+"|");
        buffer.append(xingdongcishu+"|");
        buffer.append(xingdongqingkuang+"|");
        buffer.append(huodongqingkuang+"|");
        buffer.append(fuwuqingkuang+"|");
        buffer.append(shenpiriqi+"|");
        buffer.append(qiyejiadanren+"|");
        buffer.append(hanggueihangyue+"|");
        buffer.append(daodezhunze+"|");
        buffer.append(zilvzhidu+"|");
        buffer.append(zilvxuanyan+"|");
        buffer.append(diaochahetongji+"|");
        buffer.append(hangyexinxi+"|");
        buffer.append(pinpaifuwu+"|");
        buffer.append(xietongfazhan+"|");

        buffer.append("\n");
        }
        return buffer;
    }

    public static void writeToRestource(StringBuffer buffer){
        String path= Utils.getResourceBasePath()+"/xgb-data/data-api/config";
        System.out.println("输出文件目录：-----------"+path);
        String studentResourcePath = new File(path, "/StNjHfgxTb.txt").getAbsolutePath();
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
