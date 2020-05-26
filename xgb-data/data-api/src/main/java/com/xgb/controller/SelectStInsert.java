package com.xgb.controller;

import com.xgb.model.*;
import com.xgb.service.NewJcShzzDetailService;
import com.xgb.service.NewSaveJcContentAttr1Service;
import com.xgb.service.OldService;
import com.xgb.service.SelectJcContentService;
import com.xgb.util.MyTools;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class SelectStInsert {

    protected static final Logger logger = LoggerFactory.getLogger(oldToNewResourceController.class);

    @Autowired
    private OldService oldService;


    @GetMapping("/selectSt")
    public String selectSt(String zzmc,String year) {
        System.out.println("导入系统启动");
        //查询旧年检系统数据
        //按年查询数据
        FormConsultationCaseExample formConsultationCaseExample = new FormConsultationCaseExample();
        FormConsultationCaseExample.Criteria criteria = formConsultationCaseExample.createCriteria();
        criteria.andPropertyEEqualTo("2018").andCasetypeEqualTo((short)1);//筛选条件
        List<FormConsultationCase> stNianjianList = oldService.selectByExample(formConsultationCaseExample);
        //筛选是社团的年检数据
        System.out.println(stNianjianList.size());
        List<JcContentAttr1> inserts = new ArrayList<>();
        List<JcContentAttr1> updates = new ArrayList<>();
        for (FormConsultationCase formConsultationCase : stNianjianList) {
            String s = selectStW(formConsultationCase);
            if(MyTools.isNotEmpty(s)){

                JcContentAttr1 jcContentAttr1 = updateXueli(Integer.parseInt(s), formConsultationCase);

                NewContent newContent = SelectJcContentService.selectAttrIsNull(jcContentAttr1);

                if(MyTools.isNotEmpty(newContent)){
                    updates.add(jcContentAttr1);
                }else {
                    inserts.add(jcContentAttr1);
                }
            }
        }
        Integer save = NewSaveJcContentAttr1Service.save(inserts);
        Integer update = NewSaveJcContentAttr1Service.update(updates);
        return "添加完成";
    }


    public String selectStW(FormConsultationCase formConsultationCase) {
        //获得旧系统流程唯一id
        String instanceid = formConsultationCase.getInstanceid();
        if (MyTools.isEmpty(instanceid)) {
            return null;
        }
        //机构代码
        String code = "";
        //查询社会组织的机构代码
        StNjReport3Example stNjReport3Example = new StNjReport3Example();
        stNjReport3Example.createCriteria().andInstanceidEqualTo(instanceid);
        List<StNjReport3> stNjReport3s = oldService.selectByExample(stNjReport3Example);
        if (stNjReport3s.size() > 0) {
            code = stNjReport3s.get(0).getJigoudaima();
        } else {
            return null;
        }
        //查询新系统的基础信息
        Content202Entity content202Entity = NewJcShzzDetailService.selectByXinYongDaima(code);
        if (MyTools.isEmpty(content202Entity)) {
            content202Entity = NewJcShzzDetailService.selectByXintitle(formConsultationCase.getOrgname());
            if(MyTools.isEmpty(content202Entity)){
                return null;
            }
        }
        //查询新系统中是否存在2018年的年检数据
        NewContent newContent = SelectJcContentService.selectJcContent(content202Entity);
        if(MyTools.isEmpty(newContent)){
            return null;
        }
        return newContent.getId();
    }

    public JcContentAttr1 updateXueli(Integer contentId,FormConsultationCase formConsultationCase){
        //获得旧系统流程唯一id
        String instanceid = formConsultationCase.getInstanceid();
        //查询就年检字段值
        StNjReport3Example stNjReport3Example = new StNjReport3Example();
        stNjReport3Example.createCriteria().andInstanceidEqualTo(instanceid);
        List<StNjReport3> stNjReport3s = oldService.selectByExample(stNjReport3Example);
        String lsxueli = stNjReport3s.get(0).getXueli2();
        JcContentAttr1 jcContentAttr1 = new JcContentAttr1();
        jcContentAttr1.setContentId(contentId);
        jcContentAttr1.setAttrName("xueli");
        jcContentAttr1.setAttrValue(lsxueli);
        return jcContentAttr1;
    }



}
