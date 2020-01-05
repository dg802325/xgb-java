package com.xgb.utils;

import com.xgb.model.JcContentAttr1;
import com.xgb.model.StDjqk4;
import com.xgb.model.StNjInner4;
import com.xgb.util.MyTools;

import java.util.ArrayList;
import java.util.List;

public class Save207 {

    public static List<JcContentAttr1> getEntity(Integer contentId, StDjqk4 stDjqk4) {
        List<JcContentAttr1> lists = new ArrayList<>();

        StringBuffer stringBuffer = new StringBuffer();
        if(MyTools.isNotEmpty(stDjqk4.getGuanfangwangzhan1())){
            stringBuffer.append("官方网站,");
        }
        if(MyTools.isNotEmpty(stDjqk4.getWeixinpingtai1())){
            stringBuffer.append("微信平台,");
        }
        if(MyTools.isNotEmpty(stDjqk4.getWeibo1())){
            stringBuffer.append("微博,");
        }
        if(MyTools.isNotEmpty(stDjqk4.getZazhiqikan1())){
            stringBuffer.append("杂志期刊,");
        }
        if(MyTools.isNotEmpty(stDjqk4.getQitafangshi1())){
            stringBuffer.append("其他方式,");
        }
        //票据种类其他(其他2)
        if(MyTools.isNotEmpty(stringBuffer)){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("dshjxgkfs");
            jc.setAttrValue(stringBuffer.toString());lists.add(jc);jc=null;}

        StringBuffer stringBuffer1 = new StringBuffer();
        if(MyTools.isNotEmpty(stDjqk4.getS1())){
            stringBuffer1.append("经登记管理机关核准的章程,");
        }
        if(MyTools.isNotEmpty(stDjqk4.getS2())){
            stringBuffer1.append("登记事项,");
        }
        if(MyTools.isNotEmpty(stDjqk4.getS3())){
            stringBuffer1.append("组织机构,");
        }
        if(MyTools.isNotEmpty(stDjqk4.getS4())){
            stringBuffer1.append("负责人、理事、监事及名誉职务名单,");
        }
        if(MyTools.isNotEmpty(stDjqk4.getS5())){
            stringBuffer1.append("年度工作总结,");
        }
        if(MyTools.isNotEmpty(stDjqk4.getS6())){
            stringBuffer1.append("承接政府转移职能、授权、委托和购买服务事项,");
        }
        if(MyTools.isNotEmpty(stDjqk4.getS7())){
            stringBuffer1.append("收费许可证,收费服务项目、方式、依据和标准,");
        }
        if(MyTools.isNotEmpty(stDjqk4.getS8())){
            stringBuffer1.append("依法举办的经济实体的基本信息,");
        }
        if(MyTools.isNotEmpty(stDjqk4.getS9())){
            stringBuffer1.append("按照国家有关规定开展的评比达标表彰活动");
        }
        if(MyTools.isNotEmpty(stDjqk4.getS10())){
            stringBuffer1.append("接受公益性捐赠、资助及其使用情况");
        }
        if(MyTools.isNotEmpty(stDjqk4.getS11())) {
            stringBuffer1.append("法律、行政法规规定应予公开的其他事项");
        }

        //票据种类其他(其他2)
        if(MyTools.isNotEmpty(stringBuffer1)){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("mxshgknr");
            jc.setAttrValue(stringBuffer1.toString());lists.add(jc);jc=null;}

        StringBuffer stringBuffer2 = new StringBuffer();
        if(MyTools.isNotEmpty(stDjqk4.getGuanfangwangzhan2())){
            stringBuffer2.append("官方网站,");
        }
        if(MyTools.isNotEmpty(stDjqk4.getWeixinpingtai2())){
            stringBuffer2.append("微信平台,");
        }
        if(MyTools.isNotEmpty(stDjqk4.getWeibo2())){
            stringBuffer2.append("微博,");
        }
        if(MyTools.isNotEmpty(stDjqk4.getZazhiqikan2())){
            stringBuffer2.append("杂志期刊,");
        }
        if(MyTools.isNotEmpty(stDjqk4.getHuiyuandahui())){
            stringBuffer2.append("会员大会、理事会等会议,");
        }
        if(MyTools.isNotEmpty(stDjqk4.getGongzuoqqqun())){
            stringBuffer2.append("工作qq群,");
        }
        if(MyTools.isNotEmpty(stDjqk4.getDuanxinpingtai())){
            stringBuffer2.append("短信平台,");
        }
        if(MyTools.isNotEmpty(stDjqk4.getQitafangshi22())){
            stringBuffer2.append("其他方式,");
        }
        //其他方式2
        if(MyTools.isNotEmpty(stringBuffer2)){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("hyjxxxgkfs");
            jc.setAttrValue(stringBuffer2.toString());lists.add(jc);jc=null;}

        //其他方式2
        if(MyTools.isNotEmpty(stDjqk4.getQitafangshi2())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("hyqtfsnr");
            jc.setAttrValue(stDjqk4.getQitafangshi2().toString());lists.add(jc);jc=null;}



        return lists;
    }
}
