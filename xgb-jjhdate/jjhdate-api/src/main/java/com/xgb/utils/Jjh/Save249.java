package com.xgb.utils.Jjh;

import com.xgb.model.JcContentAttr1;
import com.xgb.model.JjhnjGlfwjsyushxmyeSub;
import com.xgb.model.JjhnjJshjdgltab;
import com.xgb.util.MyTools;

import java.util.ArrayList;
import java.util.List;

public class Save249 {

    public static List<JcContentAttr1> getEntity(Integer contentId, JjhnjJshjdgltab oldTable) {
        List<JcContentAttr1> lists = new ArrayList<>();
        JcContentAttr1 jc = null;

        if(MyTools.isNotEmpty(oldTable.getTongzhishu())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("dnsjshqe");
            jc.setAttrValue(oldTable.getTongzhishu().toString());lists.add(jc);}

        jc = null;

        return lists;
    }

}
