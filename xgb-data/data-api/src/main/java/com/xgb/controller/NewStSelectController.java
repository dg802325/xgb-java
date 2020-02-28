package com.xgb.controller;


import com.xgb.model.*;
import com.xgb.service.*;
import com.xgb.util.MyTools;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class NewStSelectController {

    protected static final Logger logger = LoggerFactory.getLogger(NewStSelectController.class);

    @Autowired
    private OldService oldService;

    @GetMapping("/select")
    public String insert(String zzmc,String year) {
        int st = 0;
        int mf = 0;
        int w = 0;
        int c = 0;
        System.out.println("启动");
        FormConsultationCaseExample formConsultationCaseExample = new FormConsultationCaseExample();
        FormConsultationCaseExample.Criteria criteria = formConsultationCaseExample.createCriteria();

            criteria.andPropertyEEqualTo("2018");

        List<FormConsultationCase> formConsultationCases = oldService.selectByExample(formConsultationCaseExample);
        int cg = 0;
        List<String> sts = new ArrayList<>();
        List<String> mfs = new ArrayList<>();
        List<String> ws = new ArrayList<>();
        List<String> cs = new ArrayList<>();
        int len = 0;
        for (FormConsultationCase consultationCase : formConsultationCases) {
            if(MyTools.isNotEmpty(consultationCase)){
                MjzzUserExample mjzzUserExample = new MjzzUserExample();
                mjzzUserExample.createCriteria().andIdEqualTo(consultationCase.getProposeid());
                List<MjzzUser> mjzzDictionaries = oldService.selectByExample(mjzzUserExample);
                if(MyTools.isNotEmpty(mjzzDictionaries)){
                    Short type = mjzzDictionaries.get(0).getType();
                    if(type==1){
                        cg++;
                        st++;
                        sts.add(consultationCase.getOrgname());
                        saveSt(consultationCase,mjzzDictionaries.get(0));
                    }else if(type==2){
                        cg++;
                        mfs.add(consultationCase.getOrgname());
                        saveMf(consultationCase);
                        mf++;
                    }else {
                        ws.add(consultationCase.getOrgname());
                        logger.info("---没有机构类型---社会组织名称："+consultationCase.getOrgname());
                        System.out.println("---没有机构类型---社会组织名称：" + consultationCase.getOrgname());
                    }
                }else {
                    c++;
                    cs.add(consultationCase.getOrgname());
                }
            }
        }
        System.out.println("st=" + st);
        System.out.println("mf=" + mf);
        System.out.println("w=" + w);
        System.out.println("c=" + c);
        for (String string : sts) {
            System.out.println("社团="+string);
        }
        for (String string : mfs) {
            System.out.println("民非="+string);
        }
        for (String string : ws) {
            System.out.println("没有类型="+string);
        }
        for (String string : cs) {
            System.out.println("找不到="+string);
        }
        System.out.println("结束");
        return "";
    }

    public void saveSt(FormConsultationCase formConsultationCase,MjzzUser mjzzUser){
        //获得旧系统流程唯一id
        String instanceid = formConsultationCase.getInstanceid();
        if(MyTools.isNotEmpty(mjzzUser.getXinyongdaima())){
            Content202Entity content202Entity = NewJcShzzDetailService.selectByXinYongDaima(mjzzUser.getXinyongdaima());
            if(MyTools.isNotEmpty(content202Entity)){
                if(MyTools.isEmpty(content202Entity.getUserId())){
                    System.out.println("---没有找到新系统对应的账号信息---组织机构名称：" + formConsultationCase.getOrgname());
                }
            }else {
                System.out.println("---没有信用统一代码---组织机构名称：" + formConsultationCase.getOrgname());
            }



        }
    }

    public void saveMf(FormConsultationCase formConsultationCase){
        //获得旧系统流程唯一id
        String instanceid = formConsultationCase.getInstanceid();
        MfNianjianJbxxExample mfNianjianJbxxExample = new MfNianjianJbxxExample();
        mfNianjianJbxxExample.createCriteria().andInstanceidEqualTo(instanceid);
        List<MfNianjianJbxx> mfNianjianJbxxes = oldService.selectByExample(mfNianjianJbxxExample);
        if(MyTools.isNotEmpty(mfNianjianJbxxes)){
            if(MyTools.isNotEmpty(mfNianjianJbxxes.get(0).getZuzhijigoudaima())) {
                Content202Entity content202Entity = NewJcShzzDetailService.selectByXinYongDaima(mfNianjianJbxxes.get(0).getZuzhijigoudaima());
                if (MyTools.isEmpty(content202Entity)) {
                    System.out.println("---没有找到新系统对应的组织---组织机构名称：" + formConsultationCase.getOrgname());
                } else {
                    if (MyTools.isEmpty(content202Entity.getUserId())) {
                        System.out.println("---没有找到新系统对应的账号信息--组织机构名称：" + formConsultationCase.getOrgname());
                    }
                }
            }else {
                System.out.println("---没有信用统一代码---组织机构名称：" + formConsultationCase.getOrgname());
            }
        }
    }
}
