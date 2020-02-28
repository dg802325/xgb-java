package com.xgb.controller;

import com.xgb.model.FormConsultationCase;
import com.xgb.model.FormConsultationCaseExample;
import com.xgb.model.MjzzUser;
import com.xgb.model.MjzzUserExample;
import com.xgb.service.OldService;
import com.xgb.util.MyTools;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class saveMfController {

    protected static final Logger logger = LoggerFactory.getLogger(oldToNewResourceController.class);

    @Autowired
    private OldService oldService;

    @GetMapping("/saveMf")
    public String saveSt(String zzmc,String year) {
        System.out.println("导入系统启动");
        //查询旧年检系统数据
        //按年查询数据
        FormConsultationCaseExample formConsultationCaseExample = new FormConsultationCaseExample();
        FormConsultationCaseExample.Criteria criteria = formConsultationCaseExample.createCriteria();
        criteria.andPropertyEEqualTo("2018");//筛选条件
        List<FormConsultationCase> formConsultationCases = oldService.selectByExample(formConsultationCaseExample);
        //筛选是社团的年检数据
        List<FormConsultationCase> stNianjianList = new ArrayList<>();
        List<FormConsultationCase> mfNianjianList = new ArrayList<>();
        List<FormConsultationCase> wuNianjianList = new ArrayList<>();
        for (FormConsultationCase consultationCase : formConsultationCases) {
            if(MyTools.isNotEmpty(consultationCase)){
                MjzzUserExample mjzzUserExample = new MjzzUserExample();
                mjzzUserExample.createCriteria().andIdEqualTo(consultationCase.getProposeid());
                List<MjzzUser> mjzzDictionaries = oldService.selectByExample(mjzzUserExample);
                if(MyTools.isNotEmpty(mjzzDictionaries)){
                    Short type = mjzzDictionaries.get(0).getType();
                    if(type==1){
                        stNianjianList.add(consultationCase);
                    }else if(type==2){
                        mfNianjianList.add(consultationCase);
                    }else {
                        wuNianjianList.add(consultationCase);
                    }
                }
            }
        }
        System.out.println(stNianjianList.size());
        System.out.println(mfNianjianList.size());
        System.out.println(wuNianjianList.size());
        return "";
    }


}
