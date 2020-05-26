package com.xgb.controller;

import com.xgb.model.*;
import com.xgb.service.*;
import com.xgb.util.MyTools;
import com.xgb.utils.Mf.*;
import com.xgb.utils.Save200Entity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
public class SelectMfQueryController {

    protected static final Logger logger = LoggerFactory.getLogger(oldToNewResourceController.class);

    @Autowired
    private OldService oldService;


    @GetMapping("/selectMf2")
    public String selectSt2(String zzmc,String year) {
        System.out.println("导入系统启动");
        //查询旧年检系统数据
        //按年查询数据
        FormConsultationCaseExample formConsultationCaseExample = new FormConsultationCaseExample();
        FormConsultationCaseExample.Criteria criteria = formConsultationCaseExample.createCriteria();
        criteria.andPropertyEEqualTo("2018").andCasetypeEqualTo((short)2);//筛选条件
        List<FormConsultationCase> stNianjianList = oldService.selectByExample(formConsultationCaseExample);
        //筛选是社团的年检数据
        System.out.println(stNianjianList.size());
        int myzzjgdm = 0;
        int mylcid = 0;
        int xnjsjbuz = 0;
        int xnjsjw = 0;
        int xnjsjy = 0;
        List<JcContentAttr1> inserts = new ArrayList<>();
        List<JcContentAttr1> updates = new ArrayList<>();
        for (FormConsultationCase formConsultationCase : stNianjianList) {
            String s = selectMfW(formConsultationCase);
           if("1".equals(s)){
               myzzjgdm++;
           }else if("2".equals(s)){
               mylcid++;
           }else if("3".equals(s)){
               xnjsjbuz++;
           }else if("4".equals(s)){
               xnjsjw++;
           }else if("5".equals(s)){
               xnjsjy++;
           }
            if(s.contains("名称")){
                System.out.println("结果：" + s);
            }
        }
        System.out.println("没有机构代码========"+myzzjgdm);
        System.out.println("没有流程id========"+mylcid);
        System.out.println("新年检没有基础信息========"+xnjsjbuz);
        System.out.println("新年检没有========" + xnjsjw);
        System.out.println("新年检有========" + xnjsjy);
        return "查询完成";
    }

    public String selectMfW(FormConsultationCase formConsultationCase) {
        //获得旧系统流程唯一id
        String instanceid = formConsultationCase.getInstanceid();
        //机构代码
        String code = "";
        //查询社会组织的机构代码
        MfNianjianJbxxExample mfNianjianJbxxExample = new MfNianjianJbxxExample();
        mfNianjianJbxxExample.createCriteria().andInstanceidEqualTo(instanceid);
        List<MfNianjianJbxx> mfNianjianJbxxes = oldService.selectByExample(mfNianjianJbxxExample);
        if (mfNianjianJbxxes.size() > 0) {
            code = mfNianjianJbxxes.get(0).getZuzhijigoudaima();
        } else {
            return "1";
        }
        if (MyTools.isEmpty(instanceid)) {
            return "2";
        }
        if(code.equals("42120104328695926B")){
            System.out.println("1");
        }
        //查询新系统的基础信息
        Content202Entity content202Entity = NewJcShzzDetailService.selectByXinYongDaima(code);
        if (MyTools.isEmpty(content202Entity)) {
            Content202Entity content202Entity1 = NewJcShzzDetailService.selectByXintitle(formConsultationCase.getOrgname());
            if(MyTools.isNotEmpty(content202Entity1)){
                return "名称："+formConsultationCase.getOrgname()+"：旧："+code+"：新："+content202Entity1.getStxcode();
            }else{
                return "3";
            }
        }
        //查询新系统中是否存在2018年的年检数据
        NewContent newContent = SelectJcContentService.selectMfJcContent(content202Entity);
        if(MyTools.isEmpty(newContent)){
            return "4";
        }
        return "5";
    }
}
