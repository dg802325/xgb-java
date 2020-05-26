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
public class SelectMfInsert {

    protected static final Logger logger = LoggerFactory.getLogger(oldToNewResourceController.class);

    @Autowired
    private OldService oldService;


    @GetMapping("/selectMf")
    public String selectSt(String zzmc,String year) {
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
               //如果新年检系统有，修改年检字段值
               JcContentAttr1 jcContentAttr11 = updateMfzhusuo(formConsultationCase);

               JcContentAttr1 jcContentAttr1 = updateMfZzmm(formConsultationCase);

               NewContent newContent = SelectJcContentService.selectAttrIsNull(jcContentAttr11);
               if(MyTools.isEmpty(newContent)){
                   inserts.add(jcContentAttr11);
               }else {
                   updates.add(jcContentAttr11);
               }
               NewContent newContent1 = SelectJcContentService.selectAttrIsNull(jcContentAttr1);
               if(MyTools.isEmpty(newContent1)){
                   inserts.add(jcContentAttr1);
               }else {
                   updates.add(jcContentAttr1);
               }

           }else{

           }
        }
        System.out.println("没有机构代码========"+myzzjgdm);
        System.out.println("没有流程id========"+mylcid);
        System.out.println("新年检没有基础信息========"+xnjsjbuz);
        System.out.println("新年检没有========" + xnjsjw);
        System.out.println("新年检有========" + xnjsjy);
        Integer save = NewSaveJcContentAttr1Service.save(inserts);
        Integer update = NewSaveJcContentAttr1Service.update(updates);
        System.out.println("新增---" + save);
        System.out.println("更新----" + update);

        return "导入完成";
    }

    public JcContentAttr1 updateMfzhusuo(FormConsultationCase formConsultationCase){
        //获得旧系统流程唯一id
        String instanceid = formConsultationCase.getInstanceid();
        //查询就年检字段值
        //查询社会组织的机构代码
        MfNianjianJbxxExample mfNianjianJbxxExample = new MfNianjianJbxxExample();
        mfNianjianJbxxExample.createCriteria().andInstanceidEqualTo(instanceid);
        List<MfNianjianJbxx> mfNianjianJbxxes = oldService.selectByExample(mfNianjianJbxxExample);
        Integer quantidangyuan = mfNianjianJbxxes.get(0).getQuantidangyuan();
        String code = mfNianjianJbxxes.get(0).getZuzhijigoudaima();
        Content202Entity content202Entity = NewJcShzzDetailService.selectByXinYongDaima(code);
        if(MyTools.isEmpty(content202Entity)){
            content202Entity = NewJcShzzDetailService.selectByXintitle(formConsultationCase.getOrgname());
        }
        NewContent newContent = SelectJcContentService.selectMfJcContent(content202Entity);
        JcContentAttr1 jcContentAttr1 = new JcContentAttr1();
        jcContentAttr1.setContentId(Integer.parseInt(newContent.getId()));
        jcContentAttr1.setAttrName("OSdcZLMa");
        jcContentAttr1.setAttrValue(quantidangyuan+"");
        return jcContentAttr1;
    }

    public JcContentAttr1 updateMfZzmm(FormConsultationCase formConsultationCase){
        //获得旧系统流程唯一id
        String instanceid = formConsultationCase.getInstanceid();
        //查询就年检字段值
        //查询社会组织的机构代码
        MfNianjianJbxxExample mfNianjianJbxxExample = new MfNianjianJbxxExample();
        mfNianjianJbxxExample.createCriteria().andInstanceidEqualTo(instanceid);
        List<MfNianjianJbxx> mfNianjianJbxxes = oldService.selectByExample(mfNianjianJbxxExample);
        String zzmm = mfNianjianJbxxes.get(0).getFarenmianmao();
        String code = mfNianjianJbxxes.get(0).getZuzhijigoudaima();
        Content202Entity content202Entity = NewJcShzzDetailService.selectByXinYongDaima(code);
        if(MyTools.isEmpty(content202Entity)){
            content202Entity = NewJcShzzDetailService.selectByXintitle(formConsultationCase.getOrgname());
        }
        NewContent newContent = SelectJcContentService.selectMfJcContent(content202Entity);
        JcContentAttr1 jcContentAttr1 = new JcContentAttr1();
        jcContentAttr1.setContentId(Integer.parseInt(newContent.getId()));
        jcContentAttr1.setAttrName("zzmm");
        jcContentAttr1.setAttrValue(zzmm+"");
        return jcContentAttr1;
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
        //查询新系统的基础信息
        Content202Entity content202Entity = NewJcShzzDetailService.selectByXinYongDaima(code);
        if (MyTools.isEmpty(content202Entity)) {
            content202Entity = NewJcShzzDetailService.selectByXintitle(formConsultationCase.getOrgname());
            if (MyTools.isEmpty(content202Entity)) {
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

    //存jcContent
    public JcContent saveJcContent(Integer jcUserId, Integer modelId, Date createDate, Integer parentId){
        JcContent jcContent = new JcContent();
        jcContent.setChannelId(103);
        jcContent.setUserId(jcUserId);
        jcContent.setTypeId(1);
        jcContent.setModelId(modelId);
        jcContent.setSiteId(1);
        jcContent.setSortDate(createDate);
        jcContent.setTopLevel(0);
        jcContent.setHasTitleImg(new BigDecimal(0));
        jcContent.setIsRecommend(new BigDecimal(0));
        jcContent.setStatus(2);
        jcContent.setViewsDay(0);
        jcContent.setCommentsDay(0);
        jcContent.setDownloadsDay(0);
        jcContent.setUpsDay(0);
        jcContent.setScore(0);
        jcContent.setRecommendLevel(0);
        jcContent.setParentId(parentId);
        Integer jcContentId = NewJcContentService.save(jcContent);
        if(MyTools.isNotEmpty(jcContentId)) {
            jcContent.setContentId(jcContentId);
            return jcContent;
        }
        return null;
    }

    //存jcContentExt
    public JcContentExt saveJcContentExt(JcContent jcContent,String name){
        JcContentExt jcContentExt = new JcContentExt();
        jcContentExt.setContentId(jcContent.getContentId());
        jcContentExt.setTitle(name);
        jcContentExt.setIsBold(new BigDecimal(0));
        jcContentExt.setNeedRegenerate(new BigDecimal(1));
        jcContentExt.setReleaseDate(jcContent.getSortDate());
        jcContentExt = NewJcContentExtService.save(jcContentExt);
        return jcContentExt;
    }


    //存workflow表
    public JcWorkflowStep saveWorkflow(JcContent jcContent,String name,Date finishDate){
        JcWorkflowStep jcWorkflowStep = new JcWorkflowStep();
        jcWorkflowStep.setWorkflowId(6);
        jcWorkflowStep.setContentId(jcContent.getContentId());
        jcWorkflowStep.setNodeId(-1);
        jcWorkflowStep.setOwnerId(1);
        jcWorkflowStep.setValue("结论复审");
        jcWorkflowStep.setUserId(jcContent.getUserId());
        jcWorkflowStep.setHistory(-1);
        jcWorkflowStep.setStartDate(finishDate);
        jcWorkflowStep.setFinishDate(finishDate);
        jcWorkflowStep.setPrevNodeId(99);
        jcWorkflowStep.setStatus("结束");
        jcWorkflowStep = NewJcWorkflowStepService.save(jcWorkflowStep);
        return jcWorkflowStep;
    }
}
