package com.xgb.utils.St;

import com.xgb.model.JcContentAttr1;
import com.xgb.model.StNjInner4;
import com.xgb.model.StnjYwhdSub;
import com.xgb.util.MyTools;

import java.util.ArrayList;
import java.util.List;

public class Save2130 {

    public static List<JcContentAttr1> getEntity(Integer contentId, StnjYwhdSub stnjYwhdSub) {
        List<JcContentAttr1> lists = new ArrayList<>();
        JcContentAttr1 jc = null;
        //业务活动
        if(MyTools.isNotEmpty(stnjYwhdSub.getYewuhuodong())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("gzgs");
            jc.setAttrValue(stnjYwhdSub.getYewuhuodong());lists.add(jc);}

        jc = null;
        return lists;
    }
}
