package com.xgb.utils.Mf;

import com.xgb.model.JcContentAttr1;
import com.xgb.model.StNijianReport13;
import com.xgb.model.StNjInner4;
import com.xgb.util.MyTools;

import java.util.ArrayList;
import java.util.List;

public class Save268 {

    public static List<JcContentAttr1> getEntity(Integer contentId, StNijianReport13 stNijianReport13) {
        List<JcContentAttr1> lists = new ArrayList<>();
        JcContentAttr1 jc = null;
        //活动摘要
        if(MyTools.isNotEmpty(stNijianReport13.getHuodongzhaiyao())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("ZhcxRWSS");
            jc.setAttrValue(stNijianReport13.getHuodongzhaiyao());lists.add(jc);}
        jc = null;
        return lists;
    }
}
