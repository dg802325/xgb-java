package com.xgb.controller;


import com.xgb.model.*;
import com.xgb.service.*;
import com.xgb.util.MyTools;
import com.xgb.utils.*;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@RestController
public class NewStSaveController {

    //测试存储jcContent表 和 jcContentExt表
    public static void main(String[] args) {
        //获得要同步的基本数据
        List<FormConsultationCase> lists = ReadFormConsultationCaseService.getContent();
        List<MjzzUser> mjzzUsers = ReadMjzzUserService.getContent();
        List<MjzzDictionary> mjzzDictionaries = ReadMjzzDictionaryService.getContent();
        lists.forEach(formConsultationCase->{ //遍历每一条数据一个一个存储
            if(MyTools.isNotEmpty(formConsultationCase)){ //判断数据是否为空
                Long managerorgid = formConsultationCase.getManagerorgid(); //获得企业id
                MjzzDictionary mjzzDictionary = mjzzDictionaries.stream().filter((s) -> s.getId().equals(formConsultationCase.getManagerorgid())).findFirst().orElse(null);//匹配
                if(MyTools.isNotEmpty(mjzzDictionary)){
                    if(mjzzDictionary.getType()==1){
                        addST(mjzzUsers,formConsultationCase);
                    }else if(mjzzDictionary.getType()==2){
                        addMF(mjzzUsers,formConsultationCase);
                    }else {
                        System.out.println("--Error--企业不是社团也不是民非---");
                    }
                }
            }else {
                System.out.println("没有要同步的数据s");
            }
        });
    }

    public static boolean addST(List<MjzzUser> mjzzUsers,FormConsultationCase formConsultationCase){
        MjzzUser mjzzUser = mjzzUsers.stream().filter((s) -> s.getId().equals(formConsultationCase.getProposeid())).findFirst().orElse(null);//匹配相应的数据
        String xinyongdaima = mjzzUser.getXinyongdaima(); //获得企业信用代码
        Integer userId = NewJcShzzDetailService.selectByXinYongDaima(xinyongdaima);
        if(MyTools.isNotEmpty(userId)){//判断userId是否为空
            //存202表
            JcContent jcContent = saveJcContent(userId, 202,formConsultationCase.getCreatetime(),null); //插入jcContent表
            if(MyTools.isNotEmpty(jcContent)){//判断插入是否成功
                JcContentExt jcContentExt = saveJcContentExt(jcContent, formConsultationCase.getOrgname());//插入jcContentExt表
                if(MyTools.isNotEmpty(jcContentExt)){//判断插入是否成功
                    save202(formConsultationCase,jcContent);
                }else {
                    System.out.println("jc_contet_ext插入失败");
                }
            }else {
                System.out.println("jc_content插入失败");
            }
            //判断主表是否插入成功
            if(MyTools.isNotEmpty(jcContent)){
                //存203表
                JcContent jcContent203 = saveJcContent(userId, 203,formConsultationCase.getCreatetime(),jcContent.getContentId()); //插入jcContent表
                if(MyTools.isNotEmpty(jcContent203)){
                    JcContentExt jcContentExt = saveJcContentExt(jcContent203, "10");
                    if(MyTools.isNotEmpty(jcContentExt)){
                        save203(formConsultationCase,jcContent);
                    }
                }
            }




        }else {
            System.out.println("--------未找到对应信息-----userId为空");
        }


        return false;
    }



    public static boolean addMF(List<MjzzUser> mjzzUsers,FormConsultationCase formConsultationCase){

        return false;
    }

    public static void save202(FormConsultationCase content,JcContent jcContent){
        List<StNjReport3> stNjReport3s = ReadStNjReport3Service.getContent(); //查询202所需要的信息
        StNjReport3 stNjReport3 = stNjReport3s.stream().filter((s) -> s.getInstanceid().equals(content.getInstanceid())).findFirst().orElse(null);//匹配相应的数据
        if(MyTools.isNotEmpty(stNjReport3)){//判断匹配是否成功
            List<JcContentAttr1> jcContentAttr1s = Save202.getEntity(jcContent.getContentId(), stNjReport3);//获得202模板所需要的数据
            Integer insert = NewSaveJcContentAttr1Service.save(jcContentAttr1s);//存入数据
            if(insert>0){
                System.out.println("jc_contet_attr1插入成功");
            }else {
                System.out.println("jc_contet_attr1插入失败");
            }
        }else {
            System.out.println("未找到202模板对应的信息");
        }
    }

    public static void save203(FormConsultationCase formConsultationCase, JcContent jcContent) {
        List<StNjInner4> lists = ReadStNjInner4Service.getContent();
        StNjInner4 stNjInner4 = lists.stream().filter((s) -> s.getInstanceid().equals(formConsultationCase.getInstanceid())).findFirst().orElse(null);//匹配相应的数据
        if (MyTools.isNotEmpty(stNjInner4)){
            List<JcContentAttr1> entity = Save203.getEntity(jcContent.getContentId(), stNjInner4);
            Integer insert = NewSaveJcContentAttr1Service.save(entity);
            if(insert>0){
                System.out.println("jc_contet_attr1插入成功");
            }else {
                System.out.println("jc_contet_attr1插入失败");
            }
        }else {
            System.out.println("未找到203模板对应的信息");
        }
    }

    public static void save204(FormConsultationCase formConsultationCase, JcContent jcContent) {
        List<StNjInner4> lists = ReadStNjInner4Service.getContent();
        StNjInner4 stNjInner4 = lists.stream().filter((s) -> s.getInstanceid().equals(formConsultationCase.getInstanceid())).findFirst().orElse(null);//匹配相应的数据
        if (MyTools.isNotEmpty(stNjInner4)){
            List<JcContentAttr1> entity = Save204.getEntity(jcContent.getContentId(), stNjInner4);
            Integer insert = NewSaveJcContentAttr1Service.save(entity);
            if(insert>0){
                System.out.println("jc_contet_attr1插入成功");
            }else {
                System.out.println("jc_contet_attr1插入失败");
            }
        }else {
            System.out.println("未找到202模板对应的信息");
        }
    }

    public static void save205(FormConsultationCase formConsultationCase, JcContent jcContent) {
        List<StNjInner4> lists = ReadStNjInner4Service.getContent();
        StNjInner4 stNjInner4 = lists.stream().filter((s) -> s.getInstanceid().equals(formConsultationCase.getInstanceid())).findFirst().orElse(null);//匹配相应的数据
        if (MyTools.isNotEmpty(stNjInner4)){
            List<JcContentAttr1> entity = Save204.getEntity(jcContent.getContentId(), stNjInner4);
            Integer insert = NewSaveJcContentAttr1Service.save(entity);
            if(insert>0){
                System.out.println("jc_contet_attr1插入成功");
            }else {
                System.out.println("jc_contet_attr1插入失败");
            }
        }else {
            System.out.println("未找到202模板对应的信息");
        }
    }


    public static void save206(FormConsultationCase content,JcContent jcContent){
        List<StDjqk4> stDjqk4s = ReadStDjqk4Service.getContent(); //查询203所需要的信息
        StDjqk4 stDjqk4 = stDjqk4s.stream().filter((s) -> s.getInstanceid().equals(content.getInstanceid())).findFirst().orElse(null);//匹配相应的数据
        if(MyTools.isNotEmpty(stDjqk4)){//判断匹配是否成功
            List<JcContentAttr1> jcContentAttr1s = Save206.getEntity(jcContent.getContentId(), stDjqk4);//获得206模板所需要的数据
            Integer insert = NewSaveJcContentAttr1Service.save(jcContentAttr1s);//存入数据
            if(insert>0){
                System.out.println("jc_contet_attr1插入成功");
            }else {
                System.out.println("jc_contet_attr1插入失败");
            }
        }else {
            System.out.println("未找到202模板对应的信息");
        }
    }

    public static void save208(FormConsultationCase content,JcContent jcContent){
        List<StNjReport11Sub1> lists = ReadStNjReport11Sub1Service.getContent(); //查询208所需要的信息
        StNjReport11Sub1 entity = lists.stream().filter((s) -> s.getInstanceid().equals(content.getInstanceid())).findFirst().orElse(null);//匹配相应的数据
        if(MyTools.isNotEmpty(entity)){//判断匹配是否成功
            List<JcContentAttr1> jcContentAttr1s = Save208.getEntity(jcContent.getContentId(), entity);//获得206模板所需要的数据
            Integer insert = NewSaveJcContentAttr1Service.save(jcContentAttr1s);//存入数据
            if(insert>0){
                System.out.println("jc_contet_attr1插入成功");
            }else {
                System.out.println("jc_contet_attr1插入失败");
            }
        }else {
            System.out.println("未找到202模板对应的信息");
        }
    }

    public static void save209(FormConsultationCase content,JcContent jcContent){
        List<StNjJieshoujiandu> lists = ReadStNjJieshoujianduService.getContent(); //查询209所需要的信息
        StNjJieshoujiandu entity = lists.stream().filter((s) -> s.getInstanceid().equals(content.getInstanceid())).findFirst().orElse(null);//匹配相应的数据
        if(MyTools.isNotEmpty(entity)){//判断匹配是否成功
            List<JcContentAttr1> jcContentAttr1s = Save209.getEntity(jcContent.getContentId(), entity);//获得206模板所需要的数据
            Integer insert = NewSaveJcContentAttr1Service.save(jcContentAttr1s);//存入数据
            if(insert>0){
                System.out.println("jc_contet_attr1插入成功");
            }else {
                System.out.println("jc_contet_attr1插入失败");
            }
        }else {
            System.out.println("未找到202模板对应的信息");
        }
    }

    public static void save210(FormConsultationCase content,JcContent jcContent){
        List<JjhnjReport3> lists = ReadJjhnjReport3Service.getContent(); //查询209所需要的信息
        JjhnjReport3 entity = lists.stream().filter((s) -> s.getInstanceid().equals(content.getInstanceid())).findFirst().orElse(null);//匹配相应的数据
        if(MyTools.isNotEmpty(entity)){//判断匹配是否成功
            List<JcContentAttr1> jcContentAttr1s = Save210.getEntity(jcContent.getContentId(), entity);//获得206模板所需要的数据
            Integer insert = NewSaveJcContentAttr1Service.save(jcContentAttr1s);//存入数据
            if(insert>0){
                System.out.println("jc_contet_attr1插入成功");
            }else {
                System.out.println("jc_contet_attr1插入失败");
            }
        }else {
            System.out.println("未找到202模板对应的信息");
        }
    }

    public static void save211(FormConsultationCase content,JcContent jcContent){
        List<JjhnjReport4> lists = ReadJjhnjReport4Service.getContent(); //查询209所需要的信息
        JjhnjReport4 entity = lists.stream().filter((s) -> s.getInstanceid().equals(content.getInstanceid())).findFirst().orElse(null);//匹配相应的数据
        if(MyTools.isNotEmpty(entity)){//判断匹配是否成功
            List<JcContentAttr1> jcContentAttr1s = Save211.getEntity(jcContent.getContentId(), entity);//获得206模板所需要的数据
            Integer insert = NewSaveJcContentAttr1Service.save(jcContentAttr1s);//存入数据
            if(insert>0){
                System.out.println("jc_contet_attr1插入成功");
            }else {
                System.out.println("jc_contet_attr1插入失败");
            }
        }else {
            System.out.println("未找到202模板对应的信息");
        }
    }

    public static void save212(FormConsultationCase content,JcContent jcContent){
        List<JjhNjReport6> lists = ReadJjhNjReport6Service.getContent(); //查询209所需要的信息
        JjhNjReport6 entity = lists.stream().filter((s) -> s.getInstanceid().equals(content.getInstanceid())).findFirst().orElse(null);//匹配相应的数据
        if(MyTools.isNotEmpty(entity)){//判断匹配是否成功
            List<JcContentAttr1> jcContentAttr1s = Save212.getEntity(jcContent.getContentId(), entity);//获得206模板所需要的数据
            Integer insert = NewSaveJcContentAttr1Service.save(jcContentAttr1s);//存入数据
            if(insert>0){
                System.out.println("jc_contet_attr1插入成功");
            }else {
                System.out.println("jc_contet_attr1插入失败");
            }
        }else {
            System.out.println("未找到202模板对应的信息");
        }
    }

    public static void save213(FormConsultationCase content,JcContent jcContent){
        List<JjhNjReport6> lists = ReadJjhNjReport6Service.getContent(); //查询209所需要的信息
        JjhNjReport6 entity = lists.stream().filter((s) -> s.getInstanceid().equals(content.getInstanceid())).findFirst().orElse(null);//匹配相应的数据
        if(MyTools.isNotEmpty(entity)){//判断匹配是否成功
            List<JcContentAttr1> jcContentAttr1s = Save213.getEntity(jcContent.getContentId());//获得206模板所需要的数据
            Integer insert = NewSaveJcContentAttr1Service.save(jcContentAttr1s);//存入数据
            if(insert>0){
                System.out.println("jc_contet_attr1插入成功");
            }else {
                System.out.println("jc_contet_attr1插入失败");
            }
        }else {
            System.out.println("未找到202模板对应的信息");
        }
    }

    public static void save214(FormConsultationCase content,JcContent jcContent){
        List<StNjReport15> lists = ReadStNjReport15Service.getContent(); //查询214所需要的信息
        List<StNjGyhdtj> lists2 = ReadStNjGyhdtjService.getContent(); //查询214所需要的信息
        StNjReport15 entity = lists.stream().filter((s) -> s.getInstanceid().equals(content.getInstanceid())).findFirst().orElse(null);//匹配相应的数据
        StNjGyhdtj entity2 = lists2.stream().filter((s) -> s.getInstanceid().equals(content.getInstanceid())).findFirst().orElse(null);//匹配相应的数据
        if(MyTools.isNotEmpty(entity)){//判断匹配是否成功
            List<JcContentAttr1> jcContentAttr1s = Save214.getEntity(jcContent.getContentId(),entity,entity2);//获得206模板所需要的数据
            Integer insert = NewSaveJcContentAttr1Service.save(jcContentAttr1s);//存入数据
            if(insert>0){
                System.out.println("jc_contet_attr1插入成功");
            }else {
                System.out.println("jc_contet_attr1插入失败");
            }
        }else {
            System.out.println("未找到202模板对应的信息");
        }
    }

    public static void save215(FormConsultationCase content,JcContent jcContent){
        List<JcContentAttr1> jcContentAttr1s = Save215.getEntity(jcContent.getContentId());//获得206模板所需要的数据
        Integer insert = NewSaveJcContentAttr1Service.save(jcContentAttr1s);//存入数据
        if(insert>0){
            System.out.println("jc_contet_attr1插入成功");
        }else {
            System.out.println("jc_contet_attr1插入失败");
        }
    }

    public static void save216(FormConsultationCase content,JcContent jcContent){
        List<StNjAppraiseCost> lists = ReadStNjAppraiseCostService.getContent(); //查询209所需要的信息
        StNjAppraiseCost entity = lists.stream().filter((s) -> s.getInstanceid().equals(content.getInstanceid())).findFirst().orElse(null);//匹配相应的数据
        if(MyTools.isNotEmpty(entity)){//判断匹配是否成功
            List<JcContentAttr1> jcContentAttr1s = Save216.getEntity(jcContent.getContentId(),entity);//获得206模板所需要的数据
            Integer insert = NewSaveJcContentAttr1Service.save(jcContentAttr1s);//存入数据
            if(insert>0){
                System.out.println("jc_contet_attr1插入成功");
            }else {
                System.out.println("jc_contet_attr1插入失败");
            }
        }else {
            System.out.println("未找到202模板对应的信息");
        }
    }



















    //存jcContent
    public static JcContent saveJcContent( Integer jcUserId,Integer modelId,Date createDate,Integer parentId){
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
    public static JcContentExt saveJcContentExt(JcContent jcContent,String name){
        JcContentExt jcContentExt = new JcContentExt();
        jcContentExt.setContentId(jcContent.getContentId());
        jcContentExt.setTitle(name);
        jcContentExt.setIsBold(new BigDecimal(0));
        jcContentExt.setNeedRegenerate(new BigDecimal(1));
        jcContentExt.setReleaseDate(jcContent.getSortDate());
        jcContentExt = NewJcContentExtService.save(jcContentExt);
        return jcContentExt;
    }


}
