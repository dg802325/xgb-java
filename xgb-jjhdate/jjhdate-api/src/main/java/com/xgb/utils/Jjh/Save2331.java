package com.xgb.utils.Jjh;

import com.xgb.model.JcContentAttr1;
import com.xgb.model.JjhnjGyhdmxSub;
import com.xgb.util.DateUtils;
import com.xgb.util.MyTools;

import java.util.ArrayList;
import java.util.List;
/**
* @Auther: 
* @Date: 
* @Description:
*/
public class Save2331 {

    public static List<JcContentAttr1> getEntity(Integer contentId, JjhnjGyhdmxSub oldTable) {
        List<JcContentAttr1> lists = new ArrayList<>();
        JcContentAttr1 jc = null;

        if(MyTools.isNotEmpty(oldTable.getXiangmumingcheng())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("xmmc");
            jc.setAttrValue(oldTable.getXiangmumingcheng());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getIskaizhanjuanmu())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("sfwgxmkzlgkmj");
            jc.setAttrValue(oldTable.getIskaizhanjuanmu());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getMjdate())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("kggkmjdqssj");
            jc.setAttrValue(DateUtils.dateToyyyyMMdd(oldTable.getMjdate()));lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getIszhuanxiangshenji())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("bndsfdgxmjxzxsj");
            jc.setAttrValue(oldTable.getIszhuanxiangshenji());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getShouru())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("xmbndsr");
            jc.setAttrValue(oldTable.getShouru().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getZhichu())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("xmbndzc");
            jc.setAttrValue(oldTable.getZhichu().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getMs())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("yzms");
            jc.setAttrValue(oldTable.getMs());lists.add(jc);}
        StringBuffer fwdx = new StringBuffer();
        if(MyTools.isNotEmpty(oldTable.getR1())){fwdx.append("所有人,");}
        if(MyTools.isNotEmpty(oldTable.getR2())){fwdx.append("儿童,");}
        if(MyTools.isNotEmpty(oldTable.getR3())){fwdx.append("老人,");}
        if(MyTools.isNotEmpty(oldTable.getR4())){fwdx.append("妇女,");}
        if(MyTools.isNotEmpty(oldTable.getR5())){fwdx.append("残疾人,");}
        if(MyTools.isNotEmpty(oldTable.getR6())){fwdx.append("少数族裔,");}
        if(MyTools.isNotEmpty(oldTable.getR8())){fwdx.append("某类特殊人群,");}
        if(MyTools.isNotEmpty(oldTable.getR9())){fwdx.append("某类病种人群,");}
        if(MyTools.isNotEmpty(oldTable.getR7())){fwdx.append("其他,");}
        if(MyTools.isNotEmpty(fwdx)){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("sDwwbEgP");
            jc.setAttrValue(fwdx.toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getFwly())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("vbocKtOt");
            jc.setAttrValue(oldTable.getFwly().toString());lists.add(jc);}

        StringBuffer fwdq = new StringBuffer();
        if(MyTools.isNotEmpty(oldTable.getS37())){fwdq.append("境外,");}
        if(MyTools.isNotEmpty(oldTable.getS38())){fwdq.append("全国,");}
        if(MyTools.isNotEmpty(oldTable.getS1())){fwdq.append("北京市,");}
        if(MyTools.isNotEmpty(oldTable.getS2())){fwdq.append("天津市,");}
        if(MyTools.isNotEmpty(oldTable.getS3())){fwdq.append("河北省,");}
        if(MyTools.isNotEmpty(oldTable.getS4())){fwdq.append("山西省,");}
        if(MyTools.isNotEmpty(oldTable.getS5())){fwdq.append("内蒙古自治区,");}
        if(MyTools.isNotEmpty(oldTable.getS6())){fwdq.append("辽宁省,");}
        if(MyTools.isNotEmpty(oldTable.getS7())){fwdq.append("吉林省,");}
        if(MyTools.isNotEmpty(oldTable.getS8())){fwdq.append("黑龙江省,");}
        if(MyTools.isNotEmpty(oldTable.getS9())){fwdq.append("上海市,");}
        if(MyTools.isNotEmpty(oldTable.getS10())){fwdq.append("江苏省,");}
        if(MyTools.isNotEmpty(oldTable.getS11())){fwdq.append("浙江省,");}
        if(MyTools.isNotEmpty(oldTable.getS12())){fwdq.append("安徽省,");}
        if(MyTools.isNotEmpty(oldTable.getS13())){fwdq.append("福建省,");}
        if(MyTools.isNotEmpty(oldTable.getS14())){fwdq.append("江西省,");}
        if(MyTools.isNotEmpty(oldTable.getS15())){fwdq.append("山东省,");}
        if(MyTools.isNotEmpty(oldTable.getS16())){fwdq.append("河南省,");}
        if(MyTools.isNotEmpty(oldTable.getS17())){fwdq.append("湖北省,");}
        if(MyTools.isNotEmpty(oldTable.getS18())){fwdq.append("湖南省,");}
        if(MyTools.isNotEmpty(oldTable.getS19())){fwdq.append("广东省,");}
        if(MyTools.isNotEmpty(oldTable.getS20())){fwdq.append("广西壮族自治区,");}
        if(MyTools.isNotEmpty(oldTable.getS21())){fwdq.append("海南省,");}
        if(MyTools.isNotEmpty(oldTable.getS22())){fwdq.append("重庆市,");}
        if(MyTools.isNotEmpty(oldTable.getS23())){fwdq.append("四川省,");}
        if(MyTools.isNotEmpty(oldTable.getS24())){fwdq.append("贵州省,");}
        if(MyTools.isNotEmpty(oldTable.getS25())){fwdq.append("云南省,");}
        if(MyTools.isNotEmpty(oldTable.getS26())){fwdq.append("西藏自治区,");}
        if(MyTools.isNotEmpty(oldTable.getS27())){fwdq.append("陕西省,");}
        if(MyTools.isNotEmpty(oldTable.getS28())){fwdq.append("甘肃省,");}
        if(MyTools.isNotEmpty(oldTable.getS29())){fwdq.append("青海省,");}
        if(MyTools.isNotEmpty(oldTable.getS30())){fwdq.append("宁夏回族自治区,");}
        if(MyTools.isNotEmpty(oldTable.getS31())){fwdq.append("新疆,");}
        if(MyTools.isNotEmpty(oldTable.getS32())){fwdq.append("深圳市,");}
        if(MyTools.isNotEmpty(oldTable.getS33())){fwdq.append("大连市,");}
        if(MyTools.isNotEmpty(oldTable.getS34())){fwdq.append("青岛市,");}
        if(MyTools.isNotEmpty(oldTable.getS35())){fwdq.append("厦门市");}
        if(MyTools.isNotEmpty(oldTable.getS36())){fwdq.append("宁波市,");}
        if(MyTools.isNotEmpty(fwdq)){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("SFwMHOQx");
            jc.setAttrValue(fwdq.toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getJianshu())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("bPGYbBQM");
            jc.setAttrValue(oldTable.getJianshu().toString());lists.add(jc);}
        jc = null;

        return lists;
    }
}

