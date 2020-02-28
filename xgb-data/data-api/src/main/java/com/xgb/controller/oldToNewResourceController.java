package com.xgb.controller;


import com.xgb.model.*;
import com.xgb.service.*;
import com.xgb.util.MyTools;
import com.xgb.utils.*;
import com.xgb.utils.Mf.*;
import com.xgb.utils.St.*;
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
public class oldToNewResourceController {

    protected static final Logger logger = LoggerFactory.getLogger(oldToNewResourceController.class);

    @Autowired
    private OldService oldService;

    @GetMapping("/oldToNew")
    public String insert(String zzmc,String year) {
        System.out.println("导入系统启动");
        //查询旧年检系统数据
        FormConsultationCaseExample formConsultationCaseExample = new FormConsultationCaseExample();
        FormConsultationCaseExample.Criteria criteria = formConsultationCaseExample.createCriteria();
        criteria.andPropertyEEqualTo("2018");//筛选条件
        List<FormConsultationCase> formConsultationCases = oldService.selectByExample(formConsultationCaseExample);
        for (FormConsultationCase consultationCase : formConsultationCases) {
            if(MyTools.isNotEmpty(consultationCase)){
                MjzzUserExample mjzzUserExample = new MjzzUserExample();
                mjzzUserExample.createCriteria().andIdEqualTo(consultationCase.getProposeid());
                List<MjzzUser> mjzzDictionaries = oldService.selectByExample(mjzzUserExample);
                if(MyTools.isNotEmpty(mjzzDictionaries)){
                    Short type = mjzzDictionaries.get(0).getType();
                    if(type==1){
                        saveSt(consultationCase,mjzzDictionaries.get(0));
                    }else if(type==2){
//                        saveMf(consultationCase);
                    }else {
                        logger.info("---没有机构类型---社会组织名称："+consultationCase.getOrgname());
                    }
                }
            }
        }
        System.out.println("导入系统结束");
        return "";
    }

    public String saveSt(FormConsultationCase formConsultationCase,MjzzUser mjzzUser) {
        //获得旧系统流程唯一id
        String instanceid = formConsultationCase.getInstanceid();
        if(MyTools.isEmpty(instanceid)){
            return "缺失流程id--------"+formConsultationCase.getOrgname();
        }
        if (MyTools.isEmpty(mjzzUser.getXinyongdaima())) {
            return "缺失信用代码----------" + formConsultationCase.getOrgname();
        }
        //查询新系统的基础信息
        Content202Entity content202Entity = NewJcShzzDetailService.selectByXinYongDaima(mjzzUser.getXinyongdaima());
        if (MyTools.isEmpty(content202Entity)) {
            return "与新系统匹配不上--------" + formConsultationCase.getOrgname();
        }
        //获得旧系统的主管单位名称
        MjzzDictionaryExample mjzzDictionaryExample = new MjzzDictionaryExample();
        mjzzDictionaryExample.createCriteria().andIdEqualTo(formConsultationCase.getManagerorgid());
        List<MjzzDictionary> mjzzDictionaries = oldService.selectByExample(mjzzDictionaryExample);
        if (MyTools.isNotEmpty(mjzzDictionaries)) {
            content202Entity.setShzzZgmc(mjzzDictionaries.get(0).getName());
        }
        Integer userId = content202Entity.getUserId();
        //插入202JcContent表
        JcContent jcContent202 = saveJcContent(userId, 202, formConsultationCase.getCreatetime(), null);
        Integer parentId = jcContent202.getContentId();
        saveJcContentExt(jcContent202,formConsultationCase.getOrgname());
        //插入203JcContent表
        JcContent jcContent203 = saveJcContent(userId,203,formConsultationCase.getCreatetime(),parentId);
        saveJcContentExt(jcContent203,formConsultationCase.getOrgname());
        //插入204JcContent表
        JcContent jcContent204 = saveJcContent(userId,204,formConsultationCase.getCreatetime(),parentId);
        saveJcContentExt(jcContent204,formConsultationCase.getOrgname());
        //插入205JcContent表
        JcContent jcContent205 = saveJcContent(userId,205,formConsultationCase.getCreatetime(),parentId);
        saveJcContentExt(jcContent205,formConsultationCase.getOrgname());
        //插入206JcContent表
        JcContent jcContent206 = saveJcContent(userId,206,formConsultationCase.getCreatetime(),parentId);
        saveJcContentExt(jcContent206,formConsultationCase.getOrgname());
        //插入207JcContent表
        JcContent jcContent207 = saveJcContent(userId,207,formConsultationCase.getCreatetime(),parentId);
        saveJcContentExt(jcContent207,formConsultationCase.getOrgname());
        //插入209JcContent表
        JcContent jcContent209 = saveJcContent(userId,209,formConsultationCase.getCreatetime(),parentId);
        saveJcContentExt(jcContent209,formConsultationCase.getOrgname());
        //插入210JcContent表
        JcContent jcContent210 = saveJcContent(userId,210,formConsultationCase.getCreatetime(),parentId);
        saveJcContentExt(jcContent210,formConsultationCase.getOrgname());
        //插入211JcContent表
        JcContent jcContent211 = saveJcContent(userId,211,formConsultationCase.getCreatetime(),parentId);
        saveJcContentExt(jcContent211,formConsultationCase.getOrgname());
        //插入212JcContent表
        JcContent jcContent212 = saveJcContent(userId,212,formConsultationCase.getCreatetime(),parentId);
        saveJcContentExt(jcContent212,formConsultationCase.getOrgname());
        //插入213JcContent表
        JcContent jcContent213 = saveJcContent(userId,213,formConsultationCase.getCreatetime(),parentId);
        saveJcContentExt(jcContent213,formConsultationCase.getOrgname());
        //插入214JcContent表
        JcContent jcContent214 = saveJcContent(userId,214,formConsultationCase.getCreatetime(),parentId);
        saveJcContentExt(jcContent214,formConsultationCase.getOrgname());
        //插入215JcContent表
        JcContent jcContent215 = saveJcContent(userId,215,formConsultationCase.getCreatetime(),parentId);
        saveJcContentExt(jcContent215,formConsultationCase.getOrgname());
        //插入216JcContent表
        JcContent jcContent216 = saveJcContent(userId,216,formConsultationCase.getCreatetime(),parentId);
        saveJcContentExt(jcContent216,formConsultationCase.getOrgname());
        //插入217JcContent表
        JcContent jcContent217 = saveJcContent(userId,217,formConsultationCase.getCreatetime(),parentId);
        saveJcContentExt(jcContent217,formConsultationCase.getOrgname());
        //插入218JcContent表
        JcContent jcContent218 = saveJcContent(userId,218,formConsultationCase.getCreatetime(),parentId);
        saveJcContentExt(jcContent218,formConsultationCase.getOrgname());
        //插入219JcContent表
        JcContent jcContent219 = saveJcContent(userId,219,formConsultationCase.getCreatetime(),parentId);
        saveJcContentExt(jcContent219,formConsultationCase.getOrgname());
        //插入220JcContent表
        JcContent jcContent220 = saveJcContent(userId,220,formConsultationCase.getCreatetime(),parentId);
        saveJcContentExt(jcContent220,formConsultationCase.getOrgname());

        //整合一个流程所有的字段
        List<JcContentAttr1> jcContentAttr1s = new ArrayList<>();
        //获得202基础信息
        jcContentAttr1s.addAll(save202Entity(parentId, content202Entity));
        //获得202信息
        jcContentAttr1s.addAll(save202(instanceid,parentId));
        //获得203信息
        jcContentAttr1s.addAll(save203(instanceid,parentId));
        //获得204信息
        jcContentAttr1s.addAll(save204(instanceid,parentId));
        //获得205信息
        jcContentAttr1s.addAll(save205(instanceid,parentId));
        //获得206信息
        jcContentAttr1s.addAll(save206(instanceid,parentId));
        //获得207信息
        jcContentAttr1s.addAll(save207(instanceid,parentId));
        //获得209信息
        jcContentAttr1s.addAll(save209(instanceid,parentId));
        //获得210信息
        jcContentAttr1s.addAll(save210(instanceid,parentId));
        //获得211信息
        jcContentAttr1s.addAll(save211(instanceid,parentId));
        //获得212信息
        jcContentAttr1s.addAll(save212(instanceid,parentId));
        //获得213信息
        jcContentAttr1s.addAll(save213(instanceid,parentId));
        //获得214信息
        jcContentAttr1s.addAll(save214(instanceid,parentId));
        //获得215信息
        jcContentAttr1s.addAll(save215(instanceid,parentId));
        //获得216信息
        jcContentAttr1s.addAll(save216(instanceid,parentId));
        //获得217信息
        jcContentAttr1s.addAll(save217(instanceid,parentId));
        //获得218信息
        jcContentAttr1s.addAll(save218(instanceid,parentId));
        //获得219信息
        jcContentAttr1s.addAll(save219(instanceid,parentId));
        //获得220信息
        jcContentAttr1s.addAll(save220(instanceid,parentId));
        //获得循环表信息
        //获得208信息
        jcContentAttr1s.addAll(save208(userId,formConsultationCase,parentId));
        //获得2130信息
        jcContentAttr1s.addAll(save2130(userId,formConsultationCase,parentId));
        //获得2131信息
        jcContentAttr1s.addAll(save2131(userId,formConsultationCase,parentId));
        //获得2142信息
        jcContentAttr1s.addAll(save2142(userId,formConsultationCase,parentId));
        //获得2143信息
        jcContentAttr1s.addAll(save2143(userId,formConsultationCase,parentId));
        //获得2190信息
        jcContentAttr1s.addAll(save2190(userId,formConsultationCase,parentId));
        //获得2191信息
        jcContentAttr1s.addAll(save2191(userId,formConsultationCase,parentId));
        //获得2192信息
        jcContentAttr1s.addAll(save2192(userId,formConsultationCase,parentId));
        //获得2193信息
        jcContentAttr1s.addAll(save2193(userId,formConsultationCase,parentId));
        //获得2814信息
        jcContentAttr1s.addAll(save2814(userId,formConsultationCase,parentId));
        //获得2185信息
        jcContentAttr1s.addAll(save2185(userId,formConsultationCase,parentId));
        //获得2186信息
        jcContentAttr1s.addAll(save2186(userId,formConsultationCase,parentId));
        //获得2187信息
        jcContentAttr1s.addAll(save2187(userId,formConsultationCase,parentId));
        //获得2188信息
        jcContentAttr1s.addAll(save2188(userId,formConsultationCase,parentId));
        //获得2182信息
        jcContentAttr1s.addAll(save2182(userId,formConsultationCase,parentId));
        //获得2183信息
        jcContentAttr1s.addAll(save2183(userId,formConsultationCase,parentId));
        //获得2181信息
        jcContentAttr1s.addAll(save2181(userId,formConsultationCase,parentId));
        //获得2197信息
        jcContentAttr1s.addAll(save2197(userId,formConsultationCase,parentId));
        //获得2198信息
        jcContentAttr1s.addAll(save2198(userId,formConsultationCase,parentId));
        NewSaveJcContentAttr1Service.save(jcContentAttr1s);

        return "";
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
                    if(MyTools.isNotEmpty(content202Entity)){
                        MjzzDictionaryExample mjzzDictionaryExample = new MjzzDictionaryExample();
                        mjzzDictionaryExample.createCriteria().andIdEqualTo(formConsultationCase.getManagerorgid());
                        List<MjzzDictionary> mjzzDictionaries = oldService.selectByExample(mjzzDictionaryExample);
                        if(MyTools.isNotEmpty(mjzzDictionaries)){
                            content202Entity.setShzzZgmc(mjzzDictionaries.get(0).getName());
                        }
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
                    }else{
                        logger.info("---没有找到对应的数据---组织机构名称："+formConsultationCase.getOrgname());
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

    public List<JcContentAttr1> save202(String instanceid,Integer jcContentId){
        StNjReport3Example example = new StNjReport3Example();
        example.createCriteria().andInstanceidEqualTo(instanceid);
        List<StNjReport3> lists = oldService.selectByExample(example);
        if(MyTools.isNotEmpty(lists)){//判断匹配是否成功
            return Save202.getEntity(jcContentId, lists.get(0));//获得202模板所需要的数据
        }else {
            System.out.println("未找到202模板对应的信息");return new ArrayList<JcContentAttr1>();
        }
    }

    public List<JcContentAttr1> save203(String instanceid,Integer jcContentId){
        StNjInner4Example example = new StNjInner4Example();
        example.createCriteria().andInstanceidEqualTo(instanceid);
        List<StNjInner4> lists = oldService.selectByExample(example);
        if(MyTools.isNotEmpty(lists)){//判断匹配是否成功
            return Save203.getEntity(jcContentId, lists.get(0));//获得202模板所需要的数据
        }else {
            System.out.println("未找到203模板对应的信息");return new ArrayList<JcContentAttr1>();
        }
    }

    public List<JcContentAttr1> save204(String instanceid,Integer jcContentId){
        StNjInner4Example example = new StNjInner4Example();
        example.createCriteria().andInstanceidEqualTo(instanceid);
        List<StNjInner4> lists = oldService.selectByExample(example);
        if(MyTools.isNotEmpty(lists)){//判断匹配是否成功
            return Save204.getEntity(jcContentId, lists.get(0));//获得202模板所需要的数据
        }else {
            System.out.println("未找到204模板对应的信息");return new ArrayList<JcContentAttr1>();
        }
    }

    public List<JcContentAttr1> save205(String instanceid,Integer jcContentId){
        StNjInner4Example example = new StNjInner4Example();
        example.createCriteria().andInstanceidEqualTo(instanceid);
        List<StNjInner4> lists = oldService.selectByExample(example);
        if(MyTools.isNotEmpty(lists)){//判断匹配是否成功
            return Save205.getEntity(jcContentId, lists.get(0));//获得202模板所需要的数据
        }else {
            System.out.println("未找到205模板对应的信息");return new ArrayList<JcContentAttr1>();
        }
    }


    public List<JcContentAttr1> save206(String instanceid,Integer jcContentId){
        StDjqk4Example example = new StDjqk4Example();
        example.createCriteria().andInstanceidEqualTo(instanceid);
        List<StDjqk4> lists = oldService.selectByExample(example);
        if(MyTools.isNotEmpty(lists)){//判断匹配是否成功
            return Save206.getEntity(jcContentId, lists.get(0));//获得202模板所需要的数据
        }else {
            System.out.println("未找到206模板对应的信息");return new ArrayList<JcContentAttr1>();
        }
    }

    public List<JcContentAttr1> save207(String instanceid,Integer jcContentId){
        StDjqk4Example example = new StDjqk4Example();
        example.createCriteria().andInstanceidEqualTo(instanceid);
        List<StDjqk4> lists = oldService.selectByExample(example);
        if(MyTools.isNotEmpty(lists)){//判断匹配是否成功
            return Save207.getEntity(jcContentId, lists.get(0));//获得207模板所需要的数据
        }else {
            System.out.println("未找到207模板对应的信息");return new ArrayList<JcContentAttr1>();
        }
    }

    public List<JcContentAttr1> save208(Integer userId,FormConsultationCase formConsultationCase,Integer jcContentId){
        StNjReport11Sub1Example example = new StNjReport11Sub1Example();
        example.createCriteria().andInstanceidEqualTo(formConsultationCase.getInstanceid());
        List<StNjReport11Sub1> lists = oldService.selectByExample(example);
        List<JcContentAttr1> jcContentAttr1s = new ArrayList<>();
        if(MyTools.isNotEmpty(lists)){//判断匹配是否成功
            for(int i=0,len = lists.size();i<len;i++){
                JcContent jcContent208 = saveJcContent(userId, 208, formConsultationCase.getCreatetime(), jcContentId);
                if(MyTools.isNotEmpty(jcContent208)){
                    saveJcContentExt(jcContent208,lists.get(i).getMingcheng());
                    jcContentAttr1s.addAll(Save208.getEntity(jcContentId, lists.get(i)));//获得202模板所需要的数据
                }
            }
        }else {
            System.out.println("未找到208模板对应的信息");return new ArrayList<JcContentAttr1>();
        }
        return jcContentAttr1s;
    }

    public List<JcContentAttr1> save209(String instanceid,Integer jcContentId){
        StNjJieshoujianduExample example = new StNjJieshoujianduExample();
        example.createCriteria().andInstanceidEqualTo(instanceid);
        List<StNjJieshoujiandu> lists = oldService.selectByExample(example);
        if(MyTools.isNotEmpty(lists)){//判断匹配是否成功
            return Save209.getEntity(jcContentId, lists.get(0));//获得202模板所需要的数据
        }else {
            System.out.println("未找到209模板对应的信息");return new ArrayList<JcContentAttr1>();
        }
    }

    public List<JcContentAttr1> save210(String instanceid,Integer jcContentId){
        JjhnjReport3Example example = new JjhnjReport3Example();
        example.createCriteria().andInstanceidEqualTo(instanceid);
        List<JjhnjReport3> lists = oldService.selectByExample(example);
        if(MyTools.isNotEmpty(lists)){//判断匹配是否成功
            return Save210.getEntity(jcContentId, lists.get(0));//获得202模板所需要的数据
        }else {
            System.out.println("未找到210模板对应的信息");return new ArrayList<JcContentAttr1>();
        }
    }

    public List<JcContentAttr1> save211(String instanceid,Integer jcContentId){
        JjhnjReport4Example example = new JjhnjReport4Example();
        example.createCriteria().andInstanceidEqualTo(instanceid);
        List<JjhnjReport4> lists = oldService.selectByExample(example);
        if(MyTools.isNotEmpty(lists)){//判断匹配是否成功
            return Save211.getEntity(jcContentId, lists.get(0));//获得202模板所需要的数据
        }else {
            System.out.println("未找到211模板对应的信息");return new ArrayList<JcContentAttr1>();
        }
    }

    public List<JcContentAttr1> save212(String instanceid,Integer jcContentId){
        JjhNjReport6Example example = new JjhNjReport6Example();
        example.createCriteria().andInstanceidEqualTo(instanceid);
        List<JjhNjReport6> lists = oldService.selectByExample(example);
        if(MyTools.isNotEmpty(lists)){//判断匹配是否成功
            return Save212.getEntity(jcContentId, lists.get(0));//获得202模板所需要的数据
        }else {
            System.out.println("未找到212模板对应的信息");return new ArrayList<JcContentAttr1>();
        }
    }

    public List<JcContentAttr1> save213(String instanceid,Integer jcContentId){
        StnjYwhdSubExample example = new StnjYwhdSubExample();
        example.createCriteria().andInstanceidEqualTo(instanceid);
        List<StnjYwhdSub> lists = oldService.selectByExample(example);
        if(MyTools.isNotEmpty(lists)){//判断匹配是否成功
            return Save213.getEntity(jcContentId);//获得202模板所需要的数据
        }else {
            System.out.println("未找到213模板对应的信息");return new ArrayList<JcContentAttr1>();
        }
    }




    public List<JcContentAttr1> save2130(Integer userId,FormConsultationCase formConsultationCase,Integer jcContentId){
        StnjYwhdSubExample example = new StnjYwhdSubExample();
        example.createCriteria().andInstanceidEqualTo(formConsultationCase.getInstanceid());
        List<StnjYwhdSub> lists = oldService.selectByExample(example);
        List<JcContentAttr1> jcContentAttr1s = new ArrayList<>();
        if(MyTools.isNotEmpty(lists)){//判断匹配是否成功
            lists.forEach(stnjYwhdSub -> {
                JcContent jcContent2130 = saveJcContent(userId, 2130,formConsultationCase.getCreatetime(),jcContentId); //插入jcContent表
                saveJcContentExt(jcContent2130, "10");
                jcContentAttr1s.addAll(Save2130.getEntity(jcContent2130.getContentId(), stnjYwhdSub));//获得202模板所需要的数据
            });
        }else {
            System.out.println("未找到2130模板对应的信息");return new ArrayList<JcContentAttr1>();
        }
        return jcContentAttr1s;
    }

    public List<JcContentAttr1> save2131(Integer userId,FormConsultationCase formConsultationCase,Integer jcContentId){
        StNjGzjhSubExample example = new StNjGzjhSubExample();
        example.createCriteria().andInstanceidEqualTo(formConsultationCase.getInstanceid());
        List<StNjGzjhSub> lists = oldService.selectByExample(example);
        List<JcContentAttr1> jcContentAttr1s = new ArrayList<>();
        if(MyTools.isNotEmpty(lists)){//判断匹配是否成功
            lists.forEach(stNjGzjhSub -> {
                JcContent jcContent2131 = saveJcContent(userId, 2131,formConsultationCase.getCreatetime(),jcContentId); //插入jcContent表
                saveJcContentExt(jcContent2131, "10");
                jcContentAttr1s.addAll(Save2131.getEntity(jcContent2131.getContentId(), stNjGzjhSub));//获得202模板所需要的数据
            });
        }else {
            System.out.println("未找到2131模板对应的信息");return new ArrayList<JcContentAttr1>();
        }
        return jcContentAttr1s;
    }

    public List<JcContentAttr1> save214(String instanceid,Integer jcContentId){
        StNjReport15Example example = new StNjReport15Example();
        example.createCriteria().andInstanceidEqualTo(instanceid);
        List<StNjReport15> lists1 = oldService.selectByExample(example);
        StNjGyhdtjExample example2 = new StNjGyhdtjExample();
        example2.createCriteria().andInstanceidEqualTo(instanceid);
        List<StNjGyhdtj> lists2 = oldService.selectByExample(example2);
        List<JcContentAttr1> jcContentAttr1s = new ArrayList<>();
        if(MyTools.isNotEmpty(lists1)||MyTools.isNotEmpty(lists2)){//判断匹配是否成功
            if(MyTools.isNotEmpty(lists1)){
                jcContentAttr1s.addAll(Save214.getEntity(jcContentId, lists1.get(0),null));//获得202模板所需要的数据
            }
            if(MyTools.isNotEmpty(lists2)){
                jcContentAttr1s.addAll(Save214.getEntity(jcContentId,null,lists2.get(0)));//获得202模板所需要的数据
            }
        }else {
            System.out.println("未找到214模板对应的信息");return new ArrayList<JcContentAttr1>();
        }
        return jcContentAttr1s;
    }

    public List<JcContentAttr1> save2142(Integer userId,FormConsultationCase formConsultationCase,Integer jcContentId){
        StNjJbgyhdSubExample example = new StNjJbgyhdSubExample();
        example.createCriteria().andInstanceidEqualTo(formConsultationCase.getInstanceid());
        List<StNjJbgyhdSub> lists = oldService.selectByExample(example);
        List<JcContentAttr1> jcContentAttr1s = new ArrayList<>();
        if(MyTools.isNotEmpty(lists)){//判断匹配是否成功
            lists.forEach(stNjJbgyhdSub -> {
                JcContent jcContent2142 = saveJcContent(userId, 2142,formConsultationCase.getCreatetime(),jcContentId); //插入jcContent表
                saveJcContentExt(jcContent2142, "10");
                jcContentAttr1s.addAll(Save2142.getEntity(jcContent2142.getContentId(), stNjJbgyhdSub));//获得202模板所需要的数据
            });
        }else {
            System.out.println("未找到2142模板对应的信息");return new ArrayList<JcContentAttr1>();
        }
        return jcContentAttr1s;
    }

    public List<JcContentAttr1> save2143(Integer userId,FormConsultationCase formConsultationCase,Integer jcContentId){
        StNjGyhdzcSubExample example = new StNjGyhdzcSubExample();
        example.createCriteria().andInstanceidEqualTo(formConsultationCase.getInstanceid());
        List<StNjGyhdzcSub> lists = oldService.selectByExample(example);
        List<JcContentAttr1> jcContentAttr1s = new ArrayList<>();
        if(MyTools.isNotEmpty(lists)){//判断匹配是否成功
            lists.forEach(entity -> {
                JcContent jcContent2143 = saveJcContent(userId, 2143,formConsultationCase.getCreatetime(),jcContentId); //插入jcContent表
                if(MyTools.isNotEmpty(entity.getMingcheng())){
                    saveJcContentExt(jcContent2143, entity.getMingcheng());
                }else {
                    saveJcContentExt(jcContent2143, "10");
                }
                jcContentAttr1s.addAll(Save2143.getEntity(jcContent2143.getContentId(), entity));//获得202模板所需要的数据
            });
        }else {
            System.out.println("未找到2143模板对应的信息");return new ArrayList<JcContentAttr1>();
        }
        return jcContentAttr1s;
    }

    public List<JcContentAttr1> save215(String instanceid,Integer jcContentId){
        return Save215.getEntity(jcContentId);//获得206模板所需要的数据
    }

    public List<JcContentAttr1> save2190(Integer userId,FormConsultationCase formConsultationCase,Integer jcContentId){
        StNjReport16Sub1Example example = new StNjReport16Sub1Example();
        example.createCriteria().andInstanceidEqualTo(formConsultationCase.getInstanceid());
        List<StNjReport16Sub1> lists = oldService.selectByExample(example);
        List<JcContentAttr1> jcContentAttr1s = new ArrayList<>();
        if(MyTools.isNotEmpty(lists)){//判断匹配是否成功
            lists.forEach(entity -> {
                JcContent jcContent2190 = saveJcContent(userId, 2190,formConsultationCase.getCreatetime(),jcContentId); //插入jcContent表
                if(MyTools.isNotEmpty(entity.getXiangmumingcheng())){
                    saveJcContentExt(jcContent2190, entity.getXiangmumingcheng());
                }else {
                    saveJcContentExt(jcContent2190, "10");
                }
                jcContentAttr1s.addAll(Save2190.getEntity(jcContent2190.getContentId(), entity));//获得202模板所需要的数据
            });
        }else {
            System.out.println("未找到2190模板对应的信息");return new ArrayList<JcContentAttr1>();
        }
        return jcContentAttr1s;
    }

    public List<JcContentAttr1> save2191(Integer userId,FormConsultationCase formConsultationCase,Integer jcContentId){
        StNjReport16Sub2Example example = new StNjReport16Sub2Example();
        example.createCriteria().andInstanceidEqualTo(formConsultationCase.getInstanceid());
        List<StNjReport16Sub2> lists = oldService.selectByExample(example);
        List<JcContentAttr1> jcContentAttr1s = new ArrayList<>();
        if(MyTools.isNotEmpty(lists)){//判断匹配是否成功
            lists.forEach(entity -> {
                JcContent jcContent2191 = saveJcContent(userId, 2191,formConsultationCase.getCreatetime(),jcContentId); //插入jcContent表
                if(MyTools.isNotEmpty(entity.getHuiyimingcheng())){
                    saveJcContentExt(jcContent2191, entity.getHuiyimingcheng());
                }else {
                    saveJcContentExt(jcContent2191, "10");
                }
                jcContentAttr1s.addAll(Save2191.getEntity(jcContent2191.getContentId(), entity));//获得202模板所需要的数据
            });
        }else {
            System.out.println("未找到2191模板对应的信息");return new ArrayList<JcContentAttr1>();
        }
        return jcContentAttr1s;
    }

    public List<JcContentAttr1> save2192(Integer userId,FormConsultationCase formConsultationCase,Integer jcContentId){
        StNjReport17Sub1Example example = new StNjReport17Sub1Example();
        example.createCriteria().andInstanceidEqualTo(formConsultationCase.getInstanceid());
        List<StNjReport17Sub1> lists = oldService.selectByExample(example);
        List<JcContentAttr1> jcContentAttr1s = new ArrayList<>();
        if(MyTools.isNotEmpty(lists)){//判断匹配是否成功
            lists.forEach(entity -> {
                JcContent jcContent2192 = saveJcContent(userId, 2192,formConsultationCase.getCreatetime(),jcContentId); //插入jcContent表
                if(MyTools.isNotEmpty(entity.getGuojizuzhimingcheng())){
                    saveJcContentExt(jcContent2192, entity.getGuojizuzhimingcheng());
                }else {
                    saveJcContentExt(jcContent2192, "");
                }
                jcContentAttr1s.addAll(Save2192.getEntity(jcContent2192.getContentId(), entity));//获得202模板所需要的数据
            });
        }else {
            System.out.println("未找到2192模板对应的信息");return new ArrayList<JcContentAttr1>();
        }
        return jcContentAttr1s;
    }

    public List<JcContentAttr1> save2193(Integer userId,FormConsultationCase formConsultationCase,Integer jcContentId){
        StNjReport17Sub2Example example = new StNjReport17Sub2Example();
        example.createCriteria().andInstanceidEqualTo(formConsultationCase.getInstanceid());
        List<StNjReport17Sub2> lists = oldService.selectByExample(example);
        List<JcContentAttr1> jcContentAttr1s = new ArrayList<>();
        if(MyTools.isNotEmpty(lists)){//判断匹配是否成功
            lists.forEach(entity -> {
                JcContent jcContent2193 = saveJcContent(userId, 2193,formConsultationCase.getCreatetime(),jcContentId); //插入jcContent表
                if(MyTools.isNotEmpty(entity.getJingwaiyaoqingdanweimingcheng())){
                    saveJcContentExt(jcContent2193, entity.getJingwaiyaoqingdanweimingcheng());
                }else {
                    saveJcContentExt(jcContent2193, "10");
                }
                jcContentAttr1s.addAll(Save2193.getEntity(jcContent2193.getContentId(), entity));//获得202模板所需要的数据
            });
        }else {
            System.out.println("未找到2193模板对应的信息");return new ArrayList<JcContentAttr1>();
        }
        return jcContentAttr1s;
    }

    public List<JcContentAttr1> save216(String instanceid,Integer jcContentId){
        StNjAppraiseCostExample example = new StNjAppraiseCostExample();
        example.createCriteria().andInstanceidEqualTo(instanceid);
        List<StNjAppraiseCost> lists = oldService.selectByExample(example);
        if(MyTools.isNotEmpty(lists)){//判断匹配是否成功
            return Save216.getEntity(jcContentId, lists.get(0));//获得202模板所需要的数据
        }else {
            System.out.println("未找到216模板对应的信息");return new ArrayList<JcContentAttr1>();
        }
    }

    public List<JcContentAttr1> save2814(Integer userId,FormConsultationCase formConsultationCase,Integer jcContentId){
        StNjReprot140SubExample example = new StNjReprot140SubExample();
        example.createCriteria().andInstanceidEqualTo(formConsultationCase.getInstanceid());
        List<StNjReprot140Sub> lists = oldService.selectByExample(example);
        List<JcContentAttr1> jcContentAttr1s = new ArrayList<>();
        if(MyTools.isNotEmpty(lists)){//判断匹配是否成功
            lists.forEach(entity -> {
                JcContent jcContent2814 = saveJcContent(userId, 2814,formConsultationCase.getCreatetime(),jcContentId); //插入jcContent表
                if(MyTools.isNotEmpty(entity.getHuodongmingcheng())){
                    saveJcContentExt(jcContent2814, entity.getHuodongmingcheng());
                }else {
                    saveJcContentExt(jcContent2814, "10");
                }
                jcContentAttr1s.addAll(Save2814.getEntity(jcContent2814.getContentId(), entity));//获得202模板所需要的数据
            });
        }else {
            System.out.println("未找到2814模板对应的信息");return new ArrayList<JcContentAttr1>();
        }
        return jcContentAttr1s;
    }

    public List<JcContentAttr1> save2185(Integer userId,FormConsultationCase formConsultationCase,Integer jcContentId){
        StNjAppraiseCostExample example = new StNjAppraiseCostExample();
        example.createCriteria().andInstanceidEqualTo(formConsultationCase.getInstanceid());
        List<StNjAppraiseCost> lists = oldService.selectByExample(example);
        List<JcContentAttr1> jcContentAttr1s = new ArrayList<>();
        if(MyTools.isNotEmpty(lists)){//判断匹配是否成功
            lists.forEach(entity -> {
                JcContent jcContent2185 = saveJcContent(userId, 2185,formConsultationCase.getCreatetime(),jcContentId); //插入jcContent表
                if (MyTools.isNotEmpty(entity.getBiaozhangxiangmu())) {
                    saveJcContentExt(jcContent2185, entity.getBiaozhangxiangmu());
                }else {
                    saveJcContentExt(jcContent2185, "10");
                }
                jcContentAttr1s.addAll(Save2185.getEntity(jcContent2185.getContentId(), entity));//获得202模板所需要的数据
            });
        }else {
            System.out.println("未找到2185模板对应的信息");return new ArrayList<JcContentAttr1>();
        }
        return jcContentAttr1s;
    }

    public List<JcContentAttr1> save2186(Integer userId,FormConsultationCase formConsultationCase,Integer jcContentId){
        StNjReport13SubExample example = new StNjReport13SubExample();
        example.createCriteria().andInstanceidEqualTo(formConsultationCase.getInstanceid());
        List<StNjReport13Sub> lists = oldService.selectByExample(example);
        List<JcContentAttr1> jcContentAttr1s = new ArrayList<>();
        if(MyTools.isNotEmpty(lists)){//判断匹配是否成功
            lists.forEach(entity -> {
                JcContent jcContent2186 = saveJcContent(userId, 2186,formConsultationCase.getCreatetime(),jcContentId); //插入jcContent表
                if (MyTools.isNotEmpty(entity.getHuodongmingcheng())) {
                    saveJcContentExt(jcContent2186, entity.getHuodongmingcheng());
                }else {
                    saveJcContentExt(jcContent2186, "10");
                }
                jcContentAttr1s.addAll(Save2186.getEntity(jcContent2186.getContentId(), entity));//获得202模板所需要的数据
            });
        }else {
            System.out.println("未找到2186模板对应的信息");return new ArrayList<JcContentAttr1>();
        }
        return jcContentAttr1s;
    }

    public List<JcContentAttr1> save2187(Integer userId,FormConsultationCase formConsultationCase,Integer jcContentId){
        StNjReport14SubExample example = new StNjReport14SubExample();
        example.createCriteria().andInstanceidEqualTo(formConsultationCase.getInstanceid());
        List<StNjReport14Sub> lists = oldService.selectByExample(example);
        List<JcContentAttr1> jcContentAttr1s = new ArrayList<>();
        if(MyTools.isNotEmpty(lists)){//判断匹配是否成功
            lists.forEach(entity -> {
                JcContent jcContent2187 = saveJcContent(userId, 2187,formConsultationCase.getCreatetime(),jcContentId); //插入jcContent表
                if(MyTools.isNotEmpty(entity.getHuodongmingcheng())){
                    saveJcContentExt(jcContent2187, entity.getHuodongmingcheng());
                }else {
                    saveJcContentExt(jcContent2187, "10");
                }
                jcContentAttr1s.addAll(Save2187.getEntity(jcContent2187.getContentId(), entity));//获得
            });
        }else {
            System.out.println("未找到2187模板对应的信息");return new ArrayList<JcContentAttr1>();
        }
        return jcContentAttr1s;
    }

    public List<JcContentAttr1> save2188(Integer userId,FormConsultationCase formConsultationCase,Integer jcContentId){
        StnjSfqkJyfwSubExample example = new StnjSfqkJyfwSubExample();
        example.createCriteria().andInstanceidEqualTo(formConsultationCase.getInstanceid());
        List<StnjSfqkJyfwSub> lists = oldService.selectByExample(example);
        List<JcContentAttr1> jcContentAttr1s = new ArrayList<>();
        if(MyTools.isNotEmpty(lists)){//判断匹配是否成功
            lists.forEach(entity -> {
                JcContent jcContent2188 = saveJcContent(userId, 2188,formConsultationCase.getCreatetime(),jcContentId); //插入jcContent表
                if(MyTools.isNotEmpty(entity.getShoufeixiangmu())){
                    saveJcContentExt(jcContent2188, entity.getShoufeixiangmu());
                }else {
                    saveJcContentExt(jcContent2188, "10");
                }
                jcContentAttr1s.addAll(Save2188.getEntity(jcContent2188.getContentId(), entity));//获得
            });
        }else {
            System.out.println("未找到2188模板对应的信息");return new ArrayList<JcContentAttr1>();
        }
        return jcContentAttr1s;
    }


    public List<JcContentAttr1> save217(String instanceid,Integer jcContentId){
        StNjAdministratCostInxExample example = new StNjAdministratCostInxExample();
        example.createCriteria().andInstanceidEqualTo(instanceid);
        List<StNjAdministratCostInx> lists = oldService.selectByExample(example);
        if(MyTools.isNotEmpty(lists)){//判断匹配是否成功
            return Save217.getEntity(jcContentId, lists.get(0));//获得202模板所需要的数据
        }else {
            System.out.println("未找到217模板对应的信息");return new ArrayList<JcContentAttr1>();
        }
    }

    public List<JcContentAttr1> save2182(Integer userId,FormConsultationCase formConsultationCase,Integer jcContentId){
        JjhnjGyhdmxSubExample example = new JjhnjGyhdmxSubExample();
        example.createCriteria().andInstanceidEqualTo(formConsultationCase.getInstanceid());
        List<JjhnjGyhdmxSub> lists = oldService.selectByExample(example);
        List<JcContentAttr1> jcContentAttr1s = new ArrayList<>();
        if(MyTools.isNotEmpty(lists)){//判断匹配是否成功
            lists.forEach(entity -> {
                JcContent jcContent2182 = saveJcContent(userId, 2182,formConsultationCase.getCreatetime(),jcContentId); //插入jcContent表
                if(MyTools.isNotEmpty(entity.getXiangmumingcheng())){
                    saveJcContentExt(jcContent2182, entity.getXiangmumingcheng());
                }else {
                    saveJcContentExt(jcContent2182, "10");
                }
                jcContentAttr1s.addAll(Save2182.getEntity(jcContent2182.getContentId(), entity));//获得
            });
        }else {
            System.out.println("未找到2182模板对应的信息");return new ArrayList<JcContentAttr1>();
        }
        return jcContentAttr1s;
    }

    public List<JcContentAttr1> save2183(Integer userId,FormConsultationCase formConsultationCase,Integer jcContentId){
        StNjAdministratCostExample example = new StNjAdministratCostExample();
        example.createCriteria().andInstanceidEqualTo(formConsultationCase.getInstanceid());
        List<StNjAdministratCost> lists = oldService.selectByExample(example);
        List<JcContentAttr1> jcContentAttr1s = new ArrayList<>();
        if(MyTools.isNotEmpty(lists)){//判断匹配是否成功
            lists.forEach(entity -> {
                JcContent jcContent2183 = saveJcContent(userId, 2183,formConsultationCase.getCreatetime(),jcContentId); //插入jcContent表
                if(MyTools.isNotEmpty(entity.getShoufeixiangmu())){
                    saveJcContentExt(jcContent2183, entity.getShoufeixiangmu());
                }else {
                    saveJcContentExt(jcContent2183, "10");
                }
                jcContentAttr1s.addAll(Save2183.getEntity(jcContent2183.getContentId(), entity));//获得
            });
        }else {
            System.out.println("未找到2183模板对应的信息");return new ArrayList<JcContentAttr1>();
        }
        return jcContentAttr1s;
    }


    public List<JcContentAttr1> save218(String instanceid,Integer jcContentId){
        StNjServiceCostInxExample example = new StNjServiceCostInxExample();
        example.createCriteria().andInstanceidEqualTo(instanceid);
        List<StNjServiceCostInx> lists = oldService.selectByExample(example);
        if(MyTools.isNotEmpty(lists)){//判断匹配是否成功
            return Save218.getEntity(jcContentId, lists.get(0));//获得202模板所需要的数据
        }else {
            System.out.println("未找到218模板对应的信息");return new ArrayList<JcContentAttr1>();
        }
    }

    public List<JcContentAttr1> save2181(Integer userId,FormConsultationCase formConsultationCase,Integer jcContentId){
        StNjAdministratCostExample example = new StNjAdministratCostExample();
        example.createCriteria().andInstanceidEqualTo(formConsultationCase.getInstanceid());
        List<StNjAdministratCost> lists = oldService.selectByExample(example);
        List<JcContentAttr1> jcContentAttr1s = new ArrayList<>();
        if(MyTools.isNotEmpty(lists)){//判断匹配是否成功
            lists.forEach(entity -> {
                JcContent jcContent2181 = saveJcContent(userId, 2181,formConsultationCase.getCreatetime(),jcContentId); //插入jcContent表
                if(MyTools.isNotEmpty(entity.getShoufeixiangmu())){
                    saveJcContentExt(jcContent2181, entity.getShoufeixiangmu());
                }else {
                    saveJcContentExt(jcContent2181, "10");
                }
                jcContentAttr1s.addAll(Save2181.getEntity(jcContent2181.getContentId(), entity));//获得
            });
        }else {
            System.out.println("未找到2181模板对应的信息");return new ArrayList<JcContentAttr1>();
        }
        return jcContentAttr1s;
    }

    public List<JcContentAttr1> save219(String instanceid,Integer jcContentId){
        MfNianjianJbxxExample example = new MfNianjianJbxxExample();
        example.createCriteria().andInstanceidEqualTo(instanceid);
        List<MfNianjianJbxx> lists = oldService.selectByExample(example);
        List<JcContentAttr1> jcContentAttr1s = new ArrayList<>();
        if(MyTools.isNotEmpty(lists)){//判断匹配是否成功

        }else {
            System.out.println("未找到219模板对应的信息");return new ArrayList<JcContentAttr1>();
        }
        return jcContentAttr1s;
    }
//    ST_NJ_HFGX_TB
    public List<JcContentAttr1> save220(String instanceid,Integer jcContentId){
        StNjHfgxTbExample example = new StNjHfgxTbExample();
        example.createCriteria().andInstanceidEqualTo(instanceid);
        List<StNjHfgxTb> lists = oldService.selectByExample(example);
        if(MyTools.isNotEmpty(lists)){//判断匹配是否成功
            return Save220.getEntity(jcContentId, lists.get(0));//获得202模板所需要的数据
        }else {
            System.out.println("未找到220模板对应的信息");return new ArrayList<JcContentAttr1>();
        }
    }

    public List<JcContentAttr1> save2197(Integer userId,FormConsultationCase formConsultationCase,Integer jcContentId){
        NjGwyjzSubExample example = new NjGwyjzSubExample();
        example.createCriteria().andInstanceidEqualTo(formConsultationCase.getInstanceid());
        List<NjGwyjzSub> lists = oldService.selectByExample(example);
        List<JcContentAttr1> jcContentAttr1s = new ArrayList<>();
        if(MyTools.isNotEmpty(lists)){//判断匹配是否成功
            lists.forEach(entity -> {
                JcContent jcContent2197 = saveJcContent(userId, 2197,formConsultationCase.getCreatetime(),jcContentId); //插入jcContent表
                if(MyTools.isNotEmpty(entity.getXingming())){
                    saveJcContentExt(jcContent2197, entity.getXingming());
                }else {
                    saveJcContentExt(jcContent2197, "10");
                }
                jcContentAttr1s.addAll(Save2197.getEntity(jcContent2197.getContentId(), entity));//获得
            });
        }else {
            System.out.println("未找到2197模板对应的信息");return new ArrayList<JcContentAttr1>();
        }
        return jcContentAttr1s;
    }

    public List<JcContentAttr1> save2198(Integer userId,FormConsultationCase formConsultationCase,Integer jcContentId){
        MfGwyjzZbExample example = new MfGwyjzZbExample();
        example.createCriteria().andInstanceidEqualTo(formConsultationCase.getInstanceid());
        List<MfGwyjzZb> lists = oldService.selectByExample(example);
        List<JcContentAttr1> jcContentAttr1s = new ArrayList<>();
        if(MyTools.isNotEmpty(lists)){//判断匹配是否成功
            lists.forEach(entity -> {
                JcContent jcContent2198 = saveJcContent(userId, 2198,formConsultationCase.getCreatetime(),jcContentId); //插入jcContent表
                if (MyTools.isNotEmpty(entity.getXingming())) {
                    saveJcContentExt(jcContent2198, entity.getXingming());
                }else {
                    saveJcContentExt(jcContent2198, "10");
                }
                jcContentAttr1s.addAll(Save2198.getEntity(jcContent2198.getContentId(), entity));//获得
            });
        }else {
            System.out.println("未找到2198模板对应的信息");return new ArrayList<JcContentAttr1>();
        }
        return jcContentAttr1s;
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
    public JcContent saveJcContent( Integer jcUserId,Integer modelId,Date createDate,Integer parentId){
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
