package com.xgb.utils;

import com.xgb.model.JcContentAttr1;
import com.xgb.model.StNjInner4;
import com.xgb.model.StNjQgothercase19Sub;
import com.xgb.util.MyTools;

import java.util.ArrayList;
import java.util.List;

public class Save271 {

    public static List<JcContentAttr1> getEntity(Integer contentId, StNjQgothercase19Sub stNjQgothercase19Sub) {
        List<JcContentAttr1> lists = new ArrayList<>();

        //其他情况
        if(MyTools.isNotEmpty(stNjQgothercase19Sub.getQitaqingkuang())){
            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("JxkJLgjj");
            jc.setAttrValue(stNjQgothercase19Sub.getQitaqingkuang());lists.add(jc);jc=null;}

        return lists;
    }
}
