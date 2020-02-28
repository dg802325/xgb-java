package com.xgb.utils.St;

import com.xgb.model.JcContentAttr1;
import com.xgb.model.StNjInner4;
import com.xgb.util.MyTools;

import java.util.ArrayList;
import java.util.List;

public class Save213 {

    public static List<JcContentAttr1> getEntity(Integer contentId) {
        List<JcContentAttr1> lists = new ArrayList<>();

            JcContentAttr1 jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("type");
            jc.setAttrValue("10");lists.add(jc);

            jc = null;
        return lists;
    }
}
