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
               JcContentAttr1 jcContentAttr1 = insertMfzhusuo(formConsultationCase);
               inserts.add(jcContentAttr1);
               JcContentAttr1 jcContentAttr11 = updateMfzhusuo(formConsultationCase);
               updates.add(jcContentAttr11);
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

    public JcContentAttr1 insertMfzhusuo(FormConsultationCase formConsultationCase){
        //获得旧系统流程唯一id
        String instanceid = formConsultationCase.getInstanceid();
        //查询就年检字段值
        //查询社会组织的机构代码
        MfNianjianJbxxExample mfNianjianJbxxExample = new MfNianjianJbxxExample();
        mfNianjianJbxxExample.createCriteria().andInstanceidEqualTo(instanceid);
        List<MfNianjianJbxx> mfNianjianJbxxes = oldService.selectByExample(mfNianjianJbxxExample);
        String zhusuo = mfNianjianJbxxes.get(0).getZhusuoxiangxi();
        String code = mfNianjianJbxxes.get(0).getZuzhijigoudaima();
        Content202Entity content202Entity = NewJcShzzDetailService.selectByXinYongDaima(code);
        NewContent newContent = SelectJcContentService.selectMfJcContent(content202Entity);
        JcContentAttr1 jcContentAttr1 = new JcContentAttr1();
        jcContentAttr1.setContentId(Integer.parseInt(newContent.getId()));
        jcContentAttr1.setAttrName("bgdz");
        jcContentAttr1.setAttrValue("天津市"+zhusuo);
        return jcContentAttr1;
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
        NewContent newContent = SelectJcContentService.selectMfJcContent(content202Entity);
        JcContentAttr1 jcContentAttr1 = new JcContentAttr1();
        jcContentAttr1.setContentId(Integer.parseInt(newContent.getId()));
        jcContentAttr1.setAttrName("OSdcZLMa");
        jcContentAttr1.setAttrValue(quantidangyuan+"");
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
            return "3";
        }
        //查询新系统中是否存在2018年的年检数据
        NewContent newContent = SelectJcContentService.selectMfJcContent(content202Entity);
        if(MyTools.isEmpty(newContent)){
            return "4";
        }
        return "5";
    }



    public List<JcContentAttr1> saveMf(FormConsultationCase formConsultationCase){
        //获得旧系统流程唯一id
        String instanceid = formConsultationCase.getInstanceid();
        MfNianjianJbxxExample mfNianjianJbxxExample = new MfNianjianJbxxExample();
        mfNianjianJbxxExample.createCriteria().andInstanceidEqualTo(instanceid);
        List<MfNianjianJbxx> mfNianjianJbxxes = oldService.selectByExample(mfNianjianJbxxExample);
        if(MyTools.isNotEmpty(mfNianjianJbxxes)){
            if(MyTools.isNotEmpty(mfNianjianJbxxes.get(0).getZuzhijigoudaima())){
                Content202Entity content202Entity = NewJcShzzDetailService.selectByXinYongDaima(mfNianjianJbxxes.get(0).getZuzhijigoudaima());
                    Integer userId = content202Entity.getUserId();
                    if(MyTools.isNotEmpty(userId)){
                        //存261表
                        JcContent jcContent261 = saveJcContent(userId, 261,formConsultationCase.getCreatetime(),null); //插入jcContent表
                        //判断261是否储存成功
                        if(MyTools.isNotEmpty(jcContent261)){
                            JcContentExt jcContentExt = saveJcContentExt(jcContent261, formConsultationCase.getOrgname());
                            if(MyTools.isNotEmpty(jcContentExt)){
                                save202Entity(jcContent261.getContentId(),content202Entity);
                                save261(instanceid,jcContent261.getContentId());
                                System.out.println("jcContent261表插入成功 id为：" + jcContent261.getContentId());
                            }
                        }else {
                            System.out.println("jcContent表存储失败");
                        }
                        if(MyTools.isNotEmpty(jcContent261)){
                            //存262表
                            JcContent jcContent262 = saveJcContent(userId, 262, formConsultationCase.getCreatetime(), jcContent261.getContentId());
                            //判断202是否储存成功
                            if(MyTools.isNotEmpty(jcContent262)){
                                JcContentExt jcContentExt = saveJcContentExt(jcContent262, formConsultationCase.getOrgname());
                                if(MyTools.isNotEmpty(jcContentExt)){
                                    save262(instanceid,jcContent262.getContentId());
                                    System.out.println("jcContent262表插入成功 id为：" + jcContent262.getContentId());
                                }
                            }else {
                                System.out.println("jcContent表存储失败");
                            }

                            //存263表
                            JcContent jcContent263 = saveJcContent(userId, 263, formConsultationCase.getCreatetime(), jcContent261.getContentId());
                            //判断263是否储存成功
                            if(MyTools.isNotEmpty(jcContent263)){
                                JcContentExt jcContentExt = saveJcContentExt(jcContent263, formConsultationCase.getOrgname());
                                if(MyTools.isNotEmpty(jcContentExt)){
                                    save263(instanceid,jcContent263.getContentId());
                                    System.out.println("jcContent263表插入成功 id为：" + jcContent263.getContentId());
                                }
                            }else {
                                System.out.println("jcContent表存储失败");
                            }

                            //存264表
                            JcContent jcContent264 = saveJcContent(userId, 264, formConsultationCase.getCreatetime(), jcContent261.getContentId());
                            //判断264是否储存成功
                            if(MyTools.isNotEmpty(jcContent264)){
                                JcContentExt jcContentExt = saveJcContentExt(jcContent264, formConsultationCase.getOrgname());
                                if(MyTools.isNotEmpty(jcContentExt)){
                                    save264(instanceid,jcContent264.getContentId());
                                    System.out.println("jcContent264表插入成功 id为：" + jcContent264.getContentId());
                                }
                            }else {
                                System.out.println("jcContent表存储失败");
                            }

                            //存265表
                            JcContent jcContent265 = saveJcContent(userId, 265, formConsultationCase.getCreatetime(), jcContent261.getContentId());
                            //判断264是否储存成功
                            if(MyTools.isNotEmpty(jcContent265)){
                                JcContentExt jcContentExt = saveJcContentExt(jcContent265, formConsultationCase.getOrgname());
                                if(MyTools.isNotEmpty(jcContentExt)){
                                    save265(instanceid,jcContent265.getContentId());
                                    System.out.println("jcContent265表插入成功 id为：" + jcContent265.getContentId());
                                }
                            }else {
                                System.out.println("jcContent表存储失败");
                            }

                            //存266表
                            JcContent jcContent266 = saveJcContent(userId, 266, formConsultationCase.getCreatetime(), jcContent261.getContentId());
                            //判断264是否储存成功
                            if(MyTools.isNotEmpty(jcContent266)){
                                JcContentExt jcContentExt = saveJcContentExt(jcContent266, formConsultationCase.getOrgname());
                                if(MyTools.isNotEmpty(jcContentExt)){
                                    save266(instanceid,jcContent266.getContentId());
                                    System.out.println("jcContent266表插入成功 id为：" + jcContent266.getContentId());
                                }
                            }else {
                                System.out.println("jcContent表存储失败");
                            }

                            //存267表
                            JcContent jcContent267 = saveJcContent(userId, 267, formConsultationCase.getCreatetime(), jcContent261.getContentId());
                            //判断264是否储存成功
                            if(MyTools.isNotEmpty(jcContent267)){
                                JcContentExt jcContentExt = saveJcContentExt(jcContent267, formConsultationCase.getOrgname());
                                if(MyTools.isNotEmpty(jcContentExt)){
                                    save267(instanceid,jcContent267.getContentId());
                                    System.out.println("jcContent267表插入成功 id为：" + jcContent267.getContentId());
                                }
                            }else {
                                System.out.println("jcContent表存储失败");
                            }

                            //存268表
                            JcContent jcContent268 = saveJcContent(userId, 268, formConsultationCase.getCreatetime(), jcContent261.getContentId());
                            //判断264是否储存成功
                            if(MyTools.isNotEmpty(jcContent268)){
                                JcContentExt jcContentExt = saveJcContentExt(jcContent268, formConsultationCase.getOrgname());
                                if(MyTools.isNotEmpty(jcContentExt)){
                                    save268(instanceid,jcContent268.getContentId());
                                    System.out.println("jcContent268表插入成功 id为：" + jcContent268.getContentId());
                                }
                            }else {
                                System.out.println("jcContent表存储失败");
                            }

                            //存269表
                            save269(userId,formConsultationCase,jcContent261.getContentId());

                            //存270表
                            save270(userId,formConsultationCase,jcContent261.getContentId());

                            //存271表
                            JcContent jcContent271 = saveJcContent(userId, 271, formConsultationCase.getCreatetime(), jcContent261.getContentId());
                            //判断264是否储存成功
                            if(MyTools.isNotEmpty(jcContent271)){
                                JcContentExt jcContentExt = saveJcContentExt(jcContent271, formConsultationCase.getOrgname());
                                if(MyTools.isNotEmpty(jcContentExt)){
                                    save271(instanceid,jcContent271.getContentId());
                                    System.out.println("jcContent271表插入成功 id为：" + jcContent271.getContentId());
                                }
                            }else {
                                System.out.println("jcContent表存储失败");
                            }
                            //存流程表
                            saveWorkflow(jcContent261,null,formConsultationCase.getLastmodifytime());
                        }
                }else {
                    logger.info("---没有信用统一代码---组织机构名称："+formConsultationCase.getOrgname());
                }
            }

        }
        return null;
    }

    public List<JcContentAttr1> save202Entity(Integer jcContentId,Content202Entity content202Entity){
        return Save200Entity.getEntity(jcContentId, content202Entity);//获得202模板所需要的数据
    }


    public List<JcContentAttr1> save261(String instanceid,Integer jcContentId){
        MfNianjianJbxxExample example = new MfNianjianJbxxExample();
        example.createCriteria().andInstanceidEqualTo(instanceid);
        List<MfNianjianJbxx> lists = oldService.selectByExample(example);
        if(MyTools.isNotEmpty(lists)){//判断匹配是否成功
            return Save261.getEntity(jcContentId, lists.get(0));//获得261模板所需要的数据
        }else {
            System.out.println("未找到261模板对应的信息");return new ArrayList<JcContentAttr1>();
        }
    }


    public List<JcContentAttr1> save262(String instanceid,Integer jcContentId){
        StNjInner4Example example = new StNjInner4Example();
        example.createCriteria().andInstanceidEqualTo(instanceid);
        List<StNjInner4> lists = oldService.selectByExample(example);
        if(MyTools.isNotEmpty(lists)){//判断匹配是否成功
            return Save262.getEntity(jcContentId, lists.get(0));//获得261模板所需要的数据
        }else {
            System.out.println("未找到262模板对应的信息");return new ArrayList<JcContentAttr1>();
        }
    }

    public List<JcContentAttr1> save263(String instanceid,Integer jcContentId){
        StNjInner4Example example = new StNjInner4Example();
        example.createCriteria().andInstanceidEqualTo(instanceid);
        List<StNjInner4> lists = oldService.selectByExample(example);
        if(MyTools.isNotEmpty(lists)){//判断匹配是否成功
            return Save263.getEntity(jcContentId, lists.get(0));//获得261模板所需要的数据
        }else {
            System.out.println("未找到263模板对应的信息");return new ArrayList<JcContentAttr1>();
        }
    }

    public List<JcContentAttr1> save264(String instanceid,Integer jcContentId){
        StNjJieshoujianduExample example = new StNjJieshoujianduExample();
        example.createCriteria().andInstanceidEqualTo(instanceid);
        List<StNjJieshoujiandu> lists = oldService.selectByExample(example);
        if(MyTools.isNotEmpty(lists)){//判断匹配是否成功
            return Save264.getEntity(jcContentId, lists.get(0));//获得261模板所需要的数据
        }else {
            System.out.println("未找到264模板对应的信息");return new ArrayList<JcContentAttr1>();
        }
    }

    public List<JcContentAttr1> save265(String instanceid,Integer jcContentId){
        JjhnjReport3Example example = new JjhnjReport3Example();
        example.createCriteria().andInstanceidEqualTo(instanceid);
        List<JjhnjReport3> lists = oldService.selectByExample(example);
        if(MyTools.isNotEmpty(lists)){//判断匹配是否成功
            return Save265.getEntity(jcContentId, lists.get(0));//获得261模板所需要的数据
        }else {
            System.out.println("未找到265模板对应的信息");return new ArrayList<JcContentAttr1>();
        }
    }

    public List<JcContentAttr1> save266(String instanceid,Integer jcContentId){
        JjhnjReport4Example example = new JjhnjReport4Example();
        example.createCriteria().andInstanceidEqualTo(instanceid);
        List<JjhnjReport4> lists = oldService.selectByExample(example);
        if(MyTools.isNotEmpty(lists)){//判断匹配是否成功
            return Save266.getEntity(jcContentId, lists.get(0));//获得261模板所需要的数据
        }else {
            System.out.println("未找到266模板对应的信息");return new ArrayList<JcContentAttr1>();
        }
    }

    public List<JcContentAttr1> save267(String instanceid,Integer jcContentId){
        JjhNjReport6Example example = new JjhNjReport6Example();
        example.createCriteria().andInstanceidEqualTo(instanceid);
        List<JjhNjReport6> lists = oldService.selectByExample(example);
        if(MyTools.isNotEmpty(lists)){//判断匹配是否成功
            return Save267.getEntity(jcContentId, lists.get(0));//获得261模板所需要的数据
        }else {
            System.out.println("未找到267模板对应的信息");return new ArrayList<JcContentAttr1>();
        }
    }

    public List<JcContentAttr1> save268(String instanceid,Integer jcContentId){
        StNijianReport13Example example = new StNijianReport13Example();
        example.createCriteria().andInstanceidEqualTo(instanceid);
        List<StNijianReport13> lists = oldService.selectByExample(example);
        if(MyTools.isNotEmpty(lists)){//判断匹配是否成功
            return Save268.getEntity(jcContentId, lists.get(0));//获得261模板所需要的数据
        }else {
            System.out.println("未找到268模板对应的信息");return new ArrayList<JcContentAttr1>();
        }
    }

    public List<JcContentAttr1> save269(Integer userId,FormConsultationCase formConsultationCase,Integer jcContentId){
        LsCybaZbExample example = new LsCybaZbExample();
        example.createCriteria().andInstanceidEqualTo(formConsultationCase.getInstanceid());
        List<LsCybaZb> lists = oldService.selectByExample(example);
        List<JcContentAttr1> jcContentAttr1s = new ArrayList<>();
        if(MyTools.isNotEmpty(lists)){//判断匹配是否成功
            for (LsCybaZb list : lists) {
                JcContent jcContent269 = saveJcContent(userId, 269, formConsultationCase.getCreatetime(), jcContentId);
                //判断264是否储存成功
                if(MyTools.isNotEmpty(jcContent269)){
                    JcContentExt jcContentExt = saveJcContentExt(jcContent269, list.getXingming());
                    if(MyTools.isNotEmpty(jcContentExt)){
                        jcContentAttr1s.addAll(Save269.getEntity(jcContent269.getContentId(), list));//获得261模板所需要的数据
                    }
                }else {
                    System.out.println("jcContent表存储失败");
                }
            }
        }else {
            System.out.println("未找到269模板对应的信息");
        }
        return jcContentAttr1s;
    }

    public List<JcContentAttr1> save270(Integer userId,FormConsultationCase formConsultationCase,Integer jcContentId){
        NjGwyjzSubExample example = new NjGwyjzSubExample();
        example.createCriteria().andInstanceidEqualTo(formConsultationCase.getInstanceid());
        List<NjGwyjzSub> lists = oldService.selectByExample(example);
        List<JcContentAttr1> jcContentAttr1s = new ArrayList<>();
        if(MyTools.isNotEmpty(lists)){//判断匹配是否成功
            for (NjGwyjzSub list : lists) {
                JcContent jcContent270 = saveJcContent(userId, 270, formConsultationCase.getCreatetime(), jcContentId);
                //判断264是否储存成功
                if(MyTools.isNotEmpty(jcContent270)){
                    JcContentExt jcContentExt = saveJcContentExt(jcContent270, list.getXingming());
                    if(MyTools.isNotEmpty(jcContentExt)){
                        jcContentAttr1s.addAll(Save270.getEntity(jcContent270.getContentId(), list));//获得261模板所需要的数据
                    }
                }else {
                    System.out.println("jcContent表存储失败");
                }
            }
        }else {
            System.out.println("未找到270模板对应的信息");
        }
        return jcContentAttr1s;
    }

    public List<JcContentAttr1> save271(String instanceid,Integer jcContentId){
        StNjQgothercase19SubExample example = new StNjQgothercase19SubExample();
        example.createCriteria().andInstanceidEqualTo(instanceid);
        List<StNjQgothercase19Sub> lists = oldService.selectByExample(example);
        if(MyTools.isNotEmpty(lists)){//判断匹配是否成功
            return Save271.getEntity(jcContentId, lists.get(0));//获得261模板所需要的数据
        }else {
            System.out.println("未找到271模板对应的信息");return new ArrayList<JcContentAttr1>();
        }
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
