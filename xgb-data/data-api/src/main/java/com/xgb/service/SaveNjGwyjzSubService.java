package com.xgb.service;

import com.xgb.common.Utils;
import com.xgb.model.NjGwyjzSub;

import java.io.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class SaveNjGwyjzSubService {

    public static StringBuffer saveEntity(StringBuffer buffer , List<NjGwyjzSub> contents){
        for (NjGwyjzSub content : contents) {
            Long id = content.getId ();//ID
            String instanceid = content.getInstanceid ();//INSTANCEID
            String organizationid = content.getOrganizationid ();//ORGANIZATIONID
            Short status = content.getStatus ();//STATUS
            Long masterid = content.getMasterid ();//MASTERID
            String xuhao = content.getXuhao ();//序号
            String xingming = content.getXingming ();//姓名
            String xingbie = content.getXingbie ();//性别
            Date chushengnianyue = content.getChushengnianyue ();//出生年月
            String danweizhiwu = content.getDanweizhiwu ();//单位职务
            String gongzuodanwei = content.getGongzuodanwei ();//工作单位
            String zaizhizhuangtai = content.getZaizhizhuangtai ();//在职状态
            String zhiwu = content.getZhiwu ();//职务
            String lingchouqingkuang = content.getLingchouqingkuang ();//领酬情况
            String pizhundanwei = content.getPizhundanwei ();//批准单位
            Date pizhunshijian = content.getPizhunshijian ();//批准时间

            buffer.append(id+"|");
            buffer.append(instanceid+"|");
            buffer.append(organizationid+"|");
            buffer.append(status+"|");
            buffer.append(masterid+"|");
            buffer.append(xuhao+"|");
            buffer.append(xingming+"|");
            buffer.append(xingbie+"|");
            buffer.append(chushengnianyue+"|");
            buffer.append(danweizhiwu+"|");
            buffer.append(gongzuodanwei+"|");
            buffer.append(zaizhizhuangtai+"|");
            buffer.append(zhiwu+"|");
            buffer.append(lingchouqingkuang+"|");
            buffer.append(pizhundanwei+"|");
            buffer.append(pizhunshijian+"|");
            buffer.append("\n");
        }


        return buffer;
    }

    public static void writeToRestource(StringBuffer buffer){
        String path= Utils.getResourceBasePath()+"/xgb-data/data-api/config";
        System.out.println("输出文件目录：-----------"+path);
        String studentResourcePath = new File(path, "/NjGwyjzSub.txt").getAbsolutePath();
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
