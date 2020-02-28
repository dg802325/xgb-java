package com.xgb.utils.Jjh;

;

import com.xgb.model.JcContentAttr1;
import com.xgb.model.JjhnjYzhdqkSub;
import com.xgb.util.MyTools;

import java.util.ArrayList;
import java.util.List;
/**
* @Auther: 
* @Date: 
* @Description:
*/
public class Save2351 {

    public static List<JcContentAttr1> getEntity(Integer contentId, JjhnjYzhdqkSub oldTable) {
        List<JcContentAttr1> lists = new ArrayList<>();
        JcContentAttr1 jc = null;

        if(MyTools.isNotEmpty(oldTable.getXiangmumingcheng())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("pvpBzLAy");
            jc.setAttrValue(oldTable.getXiangmumingcheng());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getXiangmuzhichu())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("StLGwmUH");
            jc.setAttrValue(oldTable.getXiangmuzhichu().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getPinkunhu())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("gvpMACcMhu");
            jc.setAttrValue(oldTable.getPinkunhu());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getPinkunren())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("gvpMACcMren");
            jc.setAttrValue(oldTable.getPinkunren().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getSheng())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("ussTHwwusheng");
            jc.setAttrValue(oldTable.getSheng().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getShi())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("ussTHwwushi");
            jc.setAttrValue(oldTable.getShi().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getXian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("ussTHwwuqu");
            jc.setAttrValue(oldTable.getXian().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getXiangmuneirong())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("QpqNnsNY");
            jc.setAttrValue(oldTable.getXiangmuneirong());lists.add(jc);}

        StringBuffer sshKPfWB = new StringBuffer();
        if(MyTools.isNotEmpty(oldTable.getJiaoyufupin())){sshKPfWB.append("教育扶贫,");}
        if(MyTools.isNotEmpty(oldTable.getJiaoyufupin())){sshKPfWB.append("健康扶贫,");}
        if(MyTools.isNotEmpty(oldTable.getJiaoyufupin())){sshKPfWB.append("产业扶贫,");}
        if(MyTools.isNotEmpty(oldTable.getJiaoyufupin())){sshKPfWB.append("基础设施,");}
        if(MyTools.isNotEmpty(oldTable.getZhijiejiuzhu())){sshKPfWB.append("直接救助,");}
        if(MyTools.isNotEmpty(oldTable.getJiaoyufupin())){sshKPfWB.append("志愿扶贫,");}
        if(MyTools.isNotEmpty(oldTable.getJiaoyufupin())){sshKPfWB.append("易地搬迁,");}
        if(MyTools.isNotEmpty(oldTable.getJiaoyufupin())){sshKPfWB.append("其他,");}

        if(MyTools.isNotEmpty(sshKPfWB)){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("sshKPfWB");
            jc.setAttrValue(sshKPfWB.toString());lists.add(jc);}

        jc = null;

        return lists;
    }
}

