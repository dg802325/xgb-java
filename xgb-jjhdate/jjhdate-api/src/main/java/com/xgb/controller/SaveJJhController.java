package com.xgb.controller;

import com.xgb.model.*;
import com.xgb.service.*;
import com.xgb.util.MyTools;
import com.xgb.utils.Jjh.*;
import com.xgb.utils.Save200Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
public class SaveJJhController {

    @Autowired
    private OldService oldService;

    @RequestMapping("/saveJJh")
    public String Test(){
        List<String> codeList = getCodeList();
        for(String code:codeList){
//        String code = "53120000055266180N";
            JjhNjReport1Example jjhNjMls = new JjhNjReport1Example();
            jjhNjMls.createCriteria().andJigoudaimaEqualTo(code);
            List<JjhNjReport1> jjhNjReport1s = oldService.selectByExample(jjhNjMls);
            for (JjhNjReport1 jjhNjMl : jjhNjReport1s) {
                saveJJh(jjhNjMl);
            }
            System.out.println(jjhNjReport1s.size());
        }
        return "test";
    }

    private String saveJJh(JjhNjReport1 jjhNjMl) {
        String jigoudaima = jjhNjMl.getJigoudaima();
        String instanceid = jjhNjMl.getInstanceid();
        Date createDate = jjhNjMl.getBaogaoriqi();
        if(MyTools.isEmpty(createDate)){
            System.out.println("没有时间类型------" + jjhNjMl.getBenjijinhui());
            return "";
        }
        String jijinhuimingcheng = jjhNjMl.getBenjijinhui();
        //查询新系统的基础信息
        Content202Entity content202Entity = NewJcShzzDetailService.selectByXinYongDaima(jigoudaima);
        if (MyTools.isEmpty(content202Entity)) {
            return "与新系统匹配不上--------" + jjhNjMl.getBenjijinhui();
        }
        Integer userId = content202Entity.getUserId();
        if(MyTools.isEmpty(userId)){
            return "";
        }
        //插入221JcContent表
        JcContent jcContent202 = saveJcContent(userId, 221, createDate, null);
        Integer parentId = jcContent202.getContentId();
        saveJcContentExt(jcContent202,jjhNjMl.getBenjijinhui());
        //插入222JcContent表
        JcContent jcContent222 = saveJcContent(userId,222,createDate,parentId);
        saveJcContentExt(jcContent222,jijinhuimingcheng);
        //插入222JcContent表
        JcContent jcContent226 = saveJcContent(userId,226,createDate,parentId);
        saveJcContentExt(jcContent226,jijinhuimingcheng);
        //插入222JcContent表
        JcContent jcContent227 = saveJcContent(userId,227,createDate,parentId);
        saveJcContentExt(jcContent227,jijinhuimingcheng);
        //插入222JcContent表
        JcContent jcContent229 = saveJcContent(userId,229,createDate,parentId);
        saveJcContentExt(jcContent229,jijinhuimingcheng);
        //插入230JcContent表
        JcContent jcContent230 = saveJcContent(userId,230,createDate,parentId);
        saveJcContentExt(jcContent230,jijinhuimingcheng);
        //插入231JcContent表
        JcContent jcContent231 = saveJcContent(userId,231,createDate,parentId);
        saveJcContentExt(jcContent231,jijinhuimingcheng);
        //插入232JcContent表
        JcContent jcContent232 = saveJcContent(userId,232,createDate,parentId);
        saveJcContentExt(jcContent232,jijinhuimingcheng);
        //插入233JcContent表
        JcContent jcContent233 = saveJcContent(userId,233,createDate,parentId);
        saveJcContentExt(jcContent233,jijinhuimingcheng);
        //插入234JcContent表
        JcContent jcContent234 = saveJcContent(userId,234,createDate,parentId);
        saveJcContentExt(jcContent234,jijinhuimingcheng);
        //插入235JcContent表
        JcContent jcContent235 = saveJcContent(userId,235,createDate,parentId);
        saveJcContentExt(jcContent235,jijinhuimingcheng);
        //插入239JcContent表
        JcContent jcContent239 = saveJcContent(userId,239,createDate,parentId);
        saveJcContentExt(jcContent239,jijinhuimingcheng);
        //插入240JcContent表
        JcContent jcContent240 = saveJcContent(userId,240,createDate,parentId);
        saveJcContentExt(jcContent240,jijinhuimingcheng);
        //插入241JcContent表
        JcContent jcContent241 = saveJcContent(userId,241,createDate,parentId);
        saveJcContentExt(jcContent241,jijinhuimingcheng);
        //插入242JcContent表
        JcContent jcContent242 = saveJcContent(userId,242,createDate,parentId);
        saveJcContentExt(jcContent242,jijinhuimingcheng);
        //插入243JcContent表
        JcContent jcContent243 = saveJcContent(userId,243,createDate,parentId);
        saveJcContentExt(jcContent243,jijinhuimingcheng);
        //插入244JcContent表
        JcContent jcContent244 = saveJcContent(userId,244,createDate,parentId);
        saveJcContentExt(jcContent244,jijinhuimingcheng);
        //插入245JcContent表
        JcContent jcContent245 = saveJcContent(userId,245,createDate,parentId);
        saveJcContentExt(jcContent245,jijinhuimingcheng);
        //插入246JcContent表
        JcContent jcContent246 = saveJcContent(userId,246,createDate,parentId);
        saveJcContentExt(jcContent246,jijinhuimingcheng);
        //插入249JcContent表
        JcContent jcContent249 = saveJcContent(userId,249,createDate,parentId);
        saveJcContentExt(jcContent249,jijinhuimingcheng);
        //插入250JcContent表
        JcContent jcContent250 = saveJcContent(userId,250,createDate,parentId);
        saveJcContentExt(jcContent250,jijinhuimingcheng);
        //插入251JcContent表
        JcContent jcContent251 = saveJcContent(userId,251,createDate,parentId);
        saveJcContentExt(jcContent251,jijinhuimingcheng);
        //插入252JcContent表
        JcContent jcContent252 = saveJcContent(userId,252,createDate,parentId);
        saveJcContentExt(jcContent252,jijinhuimingcheng);
        //插入253JcContent表
        JcContent jcContent253= saveJcContent(userId,253,createDate,parentId);
        saveJcContentExt(jcContent253,jijinhuimingcheng);
        //插入256JcContent表
        JcContent jcContent256= saveJcContent(userId,256,createDate,parentId);
        saveJcContentExt(jcContent256,jijinhuimingcheng);
        //插入257JcContent表
        JcContent jcContent257 = saveJcContent(userId,257,createDate,parentId);
        saveJcContentExt(jcContent257,jijinhuimingcheng);
        //插入258JcContent表
        JcContent jcContent258= saveJcContent(userId,258,createDate,parentId);
        saveJcContentExt(jcContent258,jijinhuimingcheng);
        //整合一个流程所有的字段
        List<JcContentAttr1> jcContentAttr1s = new ArrayList<>();
        //获得202基础信息
        jcContentAttr1s.addAll(save221Entity(parentId, content202Entity));
        //获得202信息
        jcContentAttr1s.addAll(save221(instanceid,parentId));
        jcContentAttr1s.addAll(save222(instanceid,jcContent222.getContentId()));
        jcContentAttr1s.addAll(save2221(userId,createDate,instanceid,parentId));
        jcContentAttr1s.addAll(save223(userId,createDate,instanceid,parentId));
        jcContentAttr1s.addAll(save224(userId,createDate,instanceid,parentId));
        jcContentAttr1s.addAll(save225(userId,createDate,instanceid,parentId));
        jcContentAttr1s.addAll(save226(instanceid,jcContent226.getContentId()));
        jcContentAttr1s.addAll(save227(instanceid,jcContent227.getContentId()));
        jcContentAttr1s.addAll(save229(instanceid,jcContent229.getContentId()));
        jcContentAttr1s.addAll(save230(instanceid,jcContent230.getContentId()));
        jcContentAttr1s.addAll(save231(instanceid,jcContent231.getContentId()));
        jcContentAttr1s.addAll(save232(instanceid,jcContent232.getContentId()));
        jcContentAttr1s.addAll(save233(instanceid,jcContent233.getContentId()));
        jcContentAttr1s.addAll(save2331(userId,createDate,instanceid,parentId));
        jcContentAttr1s.addAll(save234(instanceid,jcContent234.getContentId()));
        jcContentAttr1s.addAll(save235(instanceid,jcContent235.getContentId()));
        jcContentAttr1s.addAll(save2351(userId,createDate,instanceid,parentId));
        jcContentAttr1s.addAll(save236(userId,createDate,instanceid,parentId));
        jcContentAttr1s.addAll(save236(userId,createDate,instanceid,parentId));
        jcContentAttr1s.addAll(save237(userId,createDate,instanceid,parentId));
        jcContentAttr1s.addAll(save238(userId,createDate,instanceid,parentId));
        jcContentAttr1s.addAll(save239(instanceid,jcContent239.getContentId()));
        jcContentAttr1s.addAll(save2391(userId,createDate,instanceid,parentId));
        jcContentAttr1s.addAll(save241(instanceid,jcContent241.getContentId()));
        jcContentAttr1s.addAll(save242(instanceid,jcContent242.getContentId()));
        jcContentAttr1s.addAll(save243(instanceid,jcContent243.getContentId()));
        jcContentAttr1s.addAll(save244(instanceid,jcContent244.getContentId()));
        jcContentAttr1s.addAll(save245(instanceid,jcContent245.getContentId()));
        jcContentAttr1s.addAll(save246(instanceid,jcContent246.getContentId()));
        jcContentAttr1s.addAll(save247(userId,createDate,instanceid,parentId));
        jcContentAttr1s.addAll(save248(userId,createDate,instanceid,parentId));
        jcContentAttr1s.addAll(save249(instanceid,jcContent249.getContentId()));
        jcContentAttr1s.addAll(save250(instanceid,jcContent250.getContentId()));
        jcContentAttr1s.addAll(save251(instanceid,jcContent251.getContentId()));
        jcContentAttr1s.addAll(save252(userId,createDate,instanceid,parentId));
        jcContentAttr1s.addAll(save253(instanceid,jcContent253.getContentId()));
        jcContentAttr1s.addAll(save255(userId,createDate,instanceid,parentId));
//        jcContentAttr1s.addAll(save256(userId,createDate,instanceid,parentId));//256本身没有字段
        jcContentAttr1s.addAll(save2561(userId,createDate,instanceid,parentId));
        jcContentAttr1s.addAll(save2562(userId,createDate,instanceid,parentId));
        jcContentAttr1s.addAll(save257(instanceid,jcContent257.getContentId()));
        jcContentAttr1s.addAll(save260(userId,createDate,instanceid,parentId));
        jcContentAttr1s.addAll(save2301(userId,createDate,instanceid,parentId));
        jcContentAttr1s.addAll(save2401(userId,createDate,instanceid,parentId));
        jcContentAttr1s.addAll(save2402(userId,createDate,instanceid,parentId));
        jcContentAttr1s.addAll(save2291(userId,createDate,instanceid,parentId));
        jcContentAttr1s.addAll(save2292(userId,createDate,instanceid,parentId));
        jcContentAttr1s.addAll(save2293(userId,createDate,instanceid,parentId));
        jcContentAttr1s.addAll(save2294(userId,createDate,instanceid,parentId));
        NewSaveJcContentAttr1Service.save(jcContentAttr1s);
        System.out.println("导入字段--------------"+jcContentAttr1s.size());
        System.out.println("导入成功----------" + jjhNjMl.getBenjijinhui());
        return "";
    }

    public List<JcContentAttr1> save221(String instanceid,Integer jcContentId){
        JjhNjReport1Example example = new JjhNjReport1Example();
        example.createCriteria().andInstanceidEqualTo(instanceid);
        List<JjhNjReport1> lists = oldService.selectByExample(example);
        if(MyTools.isNotEmpty(lists)){//判断匹配是否成功
            return Save221.getEntity(jcContentId, lists.get(0));//获得202模板所需要的数据
        }else {
            System.out.println("未找到221模板对应的信息");return new ArrayList<JcContentAttr1>();
        }
    }

    public List<JcContentAttr1> save222(String instanceid,Integer jcContentId){
        JjhnjJgjslsjqkSubExample example = new JjhnjJgjslsjqkSubExample();
        example.createCriteria().andInstanceidEqualTo(instanceid);
        List<JjhnjJgjslsjqkSub> lists = oldService.selectByExample(example);
        JjhnjJgjsljlqkExample example1 = new JjhnjJgjsljlqkExample();
        example1.createCriteria().andInstanceidEqualTo(instanceid);
        List<JjhnjJgjsljlqk> jjhnjJgjsljlqks = oldService.selectByExample(example1);
        if(MyTools.isNotEmpty(lists)){//判断匹配是否成功
            return Save222.getEntity(jcContentId, lists.get(0),jjhnjJgjsljlqks.get(0));//获得202模板所需要的数据
        }else {
            System.out.println("未找到222模板对应的信息");return new ArrayList<JcContentAttr1>();
        }
    }

    public List<JcContentAttr1> save223(Integer userId,Date createDate,String instanceid,Integer jcContentId){
        LshCircsExample example = new LshCircsExample();
        example.createCriteria().andInstanceidEqualTo(instanceid);
        List<LshCircs> lists = oldService.selectByExample(example);
        List<JcContentAttr1> jcContentAttr1s = new ArrayList<>();
        if(MyTools.isNotEmpty(lists)){//判断匹配是否成功
            for (LshCircs list : lists) {
                //插入222JcContent表
                JcContent jcContent223 = saveJcContent(userId,223,createDate,jcContentId);
                if(MyTools.isNotEmpty(list.getChengyuanxingming())){
                    saveJcContentExt(jcContent223,list.getChengyuanxingming().toString());
                }else {
                    saveJcContentExt(jcContent223,"10");
                }
                jcContentAttr1s.addAll(Save223.getEntity(jcContent223.getContentId(), list));
            }
        }else {
            System.out.println("未找到222模板对应的信息");return new ArrayList<JcContentAttr1>();
        }
        return jcContentAttr1s;
    }

    public List<JcContentAttr1> save224(Integer userId,Date createDate,String instanceid,Integer jcContentId){
        LsCircsExample example = new LsCircsExample();
        example.createCriteria().andInstanceidEqualTo(instanceid);
        List<LsCircs> lists = oldService.selectByExample(example);
        List<JcContentAttr1> jcContentAttr1s = new ArrayList<>();
        if(MyTools.isNotEmpty(lists)){//判断匹配是否成功
            for (LsCircs list : lists) {
                //插入222JcContent表
                JcContent jcContent224 = saveJcContent(userId,224,createDate,jcContentId);
                if(MyTools.isNotEmpty(list.getXingming())){
                    saveJcContentExt(jcContent224,list.getXingming().toString());
                }else {
                    saveJcContentExt(jcContent224,"10");
                }
                jcContentAttr1s.addAll(Save224.getEntity(jcContent224.getContentId(), list));
            }
        }else {
            System.out.println("未找到222模板对应的信息");return new ArrayList<JcContentAttr1>();
        }
        return jcContentAttr1s;
    }

    public List<JcContentAttr1> save225(Integer userId,Date createDate,String instanceid,Integer jcContentId){
        LshGzryExample example = new LshGzryExample();
        example.createCriteria().andInstanceidEqualTo(instanceid);
        List<LshGzry> lists = oldService.selectByExample(example);
        List<JcContentAttr1> jcContentAttr1s = new ArrayList<>();
        if(MyTools.isNotEmpty(lists)){//判断匹配是否成功
            for (LshGzry list : lists) {
                //插入222JcContent表
                JcContent jcContent225 = saveJcContent(userId,225,createDate,jcContentId);
                if(MyTools.isNotEmpty(list.getXingming())){
                    saveJcContentExt(jcContent225,list.getXingming().toString());
                }else {
                    saveJcContentExt(jcContent225,"10");
                }
                jcContentAttr1s.addAll(Save225.getEntity(jcContent225.getContentId(), list));
            }
        }else {
            System.out.println("未找到222模板对应的信息");return new ArrayList<JcContentAttr1>();
        }
        return jcContentAttr1s;
    }



    public List<JcContentAttr1> save226(String instanceid,Integer jcContentId){
        StNjInner4Example example = new StNjInner4Example();
        example.createCriteria().andInstanceidEqualTo(instanceid);
        List<StNjInner4> lists = oldService.selectByExample(example);
        if(MyTools.isNotEmpty(lists)){//判断匹配是否成功
            return Save226.getEntity(jcContentId, lists.get(0));//获得202模板所需要的数据
        }else {
            System.out.println("未找到222模板对应的信息");return new ArrayList<JcContentAttr1>();
        }
    }

    public List<JcContentAttr1> save227(String instanceid,Integer jcContentId){
        JjhNianjianDangjmesExample example = new JjhNianjianDangjmesExample();
        example.createCriteria().andInstanceidEqualTo(instanceid);
        List<JjhNianjianDangjmes> lists = oldService.selectByExample(example);
        if(MyTools.isNotEmpty(lists)){//判断匹配是否成功
            return Save227.getEntity(jcContentId, lists.get(0));//获得202模板所需要的数据
        }else {
            System.out.println("未找到222模板对应的信息");return new ArrayList<JcContentAttr1>();
        }
    }

    public List<JcContentAttr1> save229(String instanceid,Integer jcContentId){
        SNianjianBranchExample example = new SNianjianBranchExample();
        example.createCriteria().andInstanceidEqualTo(instanceid);
        List<SNianjianBranch> lists = oldService.selectByExample(example);
        if(MyTools.isNotEmpty(lists)){//判断匹配是否成功
            return Save229.getEntity(jcContentId, lists.get(0));//获得202模板所需要的数据
        }else {
            System.out.println("未找到229模板对应的信息");return new ArrayList<JcContentAttr1>();
        }
    }

    public List<JcContentAttr1> save230(String instanceid,Integer jcContentId){
        JjhnjReport2Example example = new JjhnjReport2Example();
        example.createCriteria().andInstanceidEqualTo(instanceid);
        List<JjhnjReport2> lists = oldService.selectByExample(example);
        if(MyTools.isNotEmpty(lists)){//判断匹配是否成功
            return Save230.getEntity(jcContentId, lists.get(0));//获得202模板所需要的数据
        }else {
            System.out.println("未找到222模板对应的信息");return new ArrayList<JcContentAttr1>();
        }
    }

    public List<JcContentAttr1> save231(String instanceid,Integer jcContentId){
        JjhnjReportThrExample example = new JjhnjReportThrExample();
        example.createCriteria().andInstanceidEqualTo(instanceid);
        List<JjhnjReportThr> lists = oldService.selectByExample(example);
        if(MyTools.isNotEmpty(lists)){//判断匹配是否成功
            return Save231.getEntity(jcContentId, lists.get(0));//获得202模板所需要的数据
        }else {
            System.out.println("未找到222模板对应的信息");return new ArrayList<JcContentAttr1>();
        }
    }

    public List<JcContentAttr1> save232(String instanceid,Integer jcContentId){
        JjhnjReportThrExample example = new JjhnjReportThrExample();
        example.createCriteria().andInstanceidEqualTo(instanceid);
        List<JjhnjReportThr> lists = oldService.selectByExample(example);
        if(MyTools.isNotEmpty(lists)){//判断匹配是否成功
            return Save232.getEntity(jcContentId, lists.get(0));//获得202模板所需要的数据
        }else {
            System.out.println("未找到232模板对应的信息");return new ArrayList<JcContentAttr1>();
        }
    }

    public List<JcContentAttr1> save233(String instanceid,Integer jcContentId){
        JjhnjGyhdmxExample example = new JjhnjGyhdmxExample();
        example.createCriteria().andInstanceidEqualTo(instanceid);
        List<JjhnjGyhdmx> lists = oldService.selectByExample(example);
        if(MyTools.isNotEmpty(lists)){//判断匹配是否成功
            return Save233.getEntity(jcContentId, lists.get(0));//获得202模板所需要的数据
        }else {
            System.out.println("未找到222模板对应的信息");return new ArrayList<JcContentAttr1>();
        }
    }

    public List<JcContentAttr1> save2331(Integer userId,Date createDate,String instanceid,Integer jcContentId){
        JjhnjGyhdmxSubExample example = new JjhnjGyhdmxSubExample();
        example.createCriteria().andInstanceidEqualTo(instanceid);
        List<JjhnjGyhdmxSub> lists = oldService.selectByExample(example);
        List<JcContentAttr1> jcContentAttr1s = new ArrayList<>();
        if(MyTools.isNotEmpty(lists)){//判断匹配是否成功
            for (JjhnjGyhdmxSub list : lists) {
                //插入222JcContent表
                JcContent jcContent2331 = saveJcContent(userId,2331,createDate,jcContentId);
                if(MyTools.isNotEmpty(list.getXiangmumingcheng())){
                    saveJcContentExt(jcContent2331,list.getXiangmumingcheng().toString());
                }else {
                    saveJcContentExt(jcContent2331,"10");
                }
                jcContentAttr1s.addAll(Save2331.getEntity(jcContent2331.getContentId(), list));
            }
        }else {
            System.out.println("未找到222模板对应的信息");return new ArrayList<JcContentAttr1>();
        }
        return jcContentAttr1s;
    }



    public List<JcContentAttr1> save234(String instanceid,Integer jcContentId){
        JjhnjCsbaIndexExample example = new JjhnjCsbaIndexExample();
        example.createCriteria().andInstanceidEqualTo(instanceid);
        List<JjhnjCsbaIndex> lists = oldService.selectByExample(example);
        if(MyTools.isNotEmpty(lists)){//判断匹配是否成功
            return Save234.getEntity(jcContentId, lists.get(0));//获得202模板所需要的数据
        }else {
            System.out.println("未找到222模板对应的信息");return new ArrayList<JcContentAttr1>();
        }
    }

    public List<JcContentAttr1> save235(String instanceid,Integer jcContentId){
        JjhnjYzhdqkExample example = new JjhnjYzhdqkExample();
        example.createCriteria().andInstanceidEqualTo(instanceid);
        List<JjhnjYzhdqk> lists = oldService.selectByExample(example);
        if(MyTools.isNotEmpty(lists)){//判断匹配是否成功
            return Save235.getEntity(jcContentId, lists.get(0));//获得202模板所需要的数据
        }else {
            System.out.println("未找到222模板对应的信息");return new ArrayList<JcContentAttr1>();
        }
    }

    public List<JcContentAttr1> save241(String instanceid,Integer jcContentId){
        JjhnjChengjishuomingSubExample example = new JjhnjChengjishuomingSubExample();
        example.createCriteria().andInstanceidEqualTo(instanceid);
        List<JjhnjChengjishuomingSub> lists = oldService.selectByExample(example);
        if(MyTools.isNotEmpty(lists)){//判断匹配是否成功
            return Save241.getEntity(jcContentId, lists.get(0));//获得202模板所需要的数据
        }else {
            System.out.println("未找到222模板对应的信息");return new ArrayList<JcContentAttr1>();
        }
    }

    public List<JcContentAttr1> save242(String instanceid,Integer jcContentId){
        JjhnjReport3Example example = new JjhnjReport3Example();
        example.createCriteria().andInstanceidEqualTo(instanceid);
        List<JjhnjReport3> lists = oldService.selectByExample(example);
        if(MyTools.isNotEmpty(lists)){//判断匹配是否成功
            return Save242.getEntity(jcContentId, lists.get(0));//获得202模板所需要的数据
        }else {
            System.out.println("未找到222模板对应的信息");return new ArrayList<JcContentAttr1>();
        }
    }

    public List<JcContentAttr1> save243(String instanceid,Integer jcContentId){
        JjhnjReport4Example example = new JjhnjReport4Example();
        example.createCriteria().andInstanceidEqualTo(instanceid);
        List<JjhnjReport4> lists = oldService.selectByExample(example);
        if(MyTools.isNotEmpty(lists)){//判断匹配是否成功
            return Save243.getEntity(jcContentId, lists.get(0));//获得202模板所需要的数据
        }else {
            System.out.println("未找到222模板对应的信息");return new ArrayList<JcContentAttr1>();
        }
    }

    public List<JcContentAttr1> save244(String instanceid,Integer jcContentId){
        JjhNjReport6Example example = new JjhNjReport6Example();
        example.createCriteria().andInstanceidEqualTo(instanceid);
        List<JjhNjReport6> lists = oldService.selectByExample(example);
        if(MyTools.isNotEmpty(lists)){//判断匹配是否成功
            return Save244.getEntity(jcContentId, lists.get(0));//获得202模板所需要的数据
        }else {
            System.out.println("未找到222模板对应的信息");return new ArrayList<JcContentAttr1>();
        }
    }

    public List<JcContentAttr1> save245(String instanceid,Integer jcContentId){
        JjhnjYskxjkhExample example = new JjhnjYskxjkhExample();
        example.createCriteria().andInstanceidEqualTo(instanceid);
        List<JjhnjYskxjkh> lists = oldService.selectByExample(example);
        if(MyTools.isNotEmpty(lists)){//判断匹配是否成功
            return Save245.getEntity(jcContentId, lists.get(0));//获得202模板所需要的数据
        }else {
            System.out.println("未找到222模板对应的信息");return new ArrayList<JcContentAttr1>();
        }
    }

    public List<JcContentAttr1> save246(String instanceid,Integer jcContentId){
        JjhnjYfzkjkhExample example = new JjhnjYfzkjkhExample();
        example.createCriteria().andInstanceidEqualTo(instanceid);
        List<JjhnjYfzkjkh> lists = oldService.selectByExample(example);
        if(MyTools.isNotEmpty(lists)){//判断匹配是否成功
            return Save246.getEntity(jcContentId, lists.get(0));//获得202模板所需要的数据
        }else {
            System.out.println("未找到222模板对应的信息");return new ArrayList<JcContentAttr1>();
        }
    }

    public List<JcContentAttr1> save250(String instanceid,Integer jcContentId){
        JjhnjJshjdgltabExample example = new JjhnjJshjdgltabExample();
        example.createCriteria().andInstanceidEqualTo(instanceid);
        List<JjhnjJshjdgltab> lists = oldService.selectByExample(example);
        if(MyTools.isNotEmpty(lists)){//判断匹配是否成功
            return Save250.getEntity(jcContentId, lists.get(0));//获得202模板所需要的数据
        }else {
            System.out.println("未找到222模板对应的信息");return new ArrayList<JcContentAttr1>();
        }
    }

    public List<JcContentAttr1> save251(String instanceid,Integer jcContentId){
        JjhnjJshjdgltabExample example = new JjhnjJshjdgltabExample();
        example.createCriteria().andInstanceidEqualTo(instanceid);
        List<JjhnjJshjdgltab> lists = oldService.selectByExample(example);
        if(MyTools.isNotEmpty(lists)){//判断匹配是否成功
            return Save251.getEntity(jcContentId, lists.get(0));//获得202模板所需要的数据
        }else {
            System.out.println("未找到222模板对应的信息");return new ArrayList<JcContentAttr1>();
        }
    }

    public List<JcContentAttr1> save253(String instanceid,Integer jcContentId){
        StNjQgothercase19SubExample example = new StNjQgothercase19SubExample();
        example.createCriteria().andInstanceidEqualTo(instanceid);
        List<StNjQgothercase19Sub> lists = oldService.selectByExample(example);
        if(MyTools.isNotEmpty(lists)){//判断匹配是否成功
            return Save253.getEntity(jcContentId, lists.get(0));//获得202模板所需要的数据
        }else {
            System.out.println("未找到222模板对应的信息");return new ArrayList<JcContentAttr1>();
        }
    }

    public List<JcContentAttr1> save239(String instanceid,Integer jcContentId){
        JjhNjZbCsxtExample example = new JjhNjZbCsxtExample();
        example.createCriteria().andInstanceidEqualTo(instanceid);
        List<JjhNjZbCsxt> lists = oldService.selectByExample(example);
        if(MyTools.isNotEmpty(lists)){//判断匹配是否成功
            return Save239.getEntity(jcContentId, lists.get(0));//获得202模板所需要的数据
        }else {
            System.out.println("未找到222模板对应的信息");return new ArrayList<JcContentAttr1>();
        }
    }

    public List<JcContentAttr1> save2351(Integer userId,Date createDate,String instanceid,Integer jcContentId){
        JjhnjYzhdqkSubExample example = new JjhnjYzhdqkSubExample();
        example.createCriteria().andInstanceidEqualTo(instanceid);
        List<JjhnjYzhdqkSub> lists = oldService.selectByExample(example);
        List<JcContentAttr1> jcContentAttr1s = new ArrayList<>();
        if(MyTools.isNotEmpty(lists)){//判断匹配是否成功
            for (JjhnjYzhdqkSub list : lists) {
                //插入222JcContent表
                JcContent jcContent2351 = saveJcContent(userId,2351,createDate,jcContentId);
                if(MyTools.isNotEmpty(list.getXiangmumingcheng())){
                    saveJcContentExt(jcContent2351,list.getXiangmumingcheng().toString());
                }else {
                    saveJcContentExt(jcContent2351,"10");
                }
                jcContentAttr1s.addAll(Save2351.getEntity(jcContent2351.getContentId(), list));
            }
        }else {
            System.out.println("未找到222模板对应的信息");return new ArrayList<JcContentAttr1>();
        }
        return jcContentAttr1s;
    }

    public List<JcContentAttr1> save237(Integer userId,Date createDate,String instanceid,Integer jcContentId){
        JjhnjZhdgyhdshzSubExample example = new JjhnjZhdgyhdshzSubExample();
        example.createCriteria().andInstanceidEqualTo(instanceid);
        List<JjhnjZhdgyhdshzSub> lists = oldService.selectByExample(example);
        List<JcContentAttr1> jcContentAttr1s = new ArrayList<>();
        if(MyTools.isNotEmpty(lists)){//判断匹配是否成功
            for (JjhnjZhdgyhdshzSub list : lists) {
                //插入222JcContent表
                JcContent jcContent237 = saveJcContent(userId,237,createDate,jcContentId);
                if(MyTools.isNotEmpty(list.getXiangmumingcheng())){
                    saveJcContentExt(jcContent237,list.getXiangmumingcheng().toString());
                }else {
                    saveJcContentExt(jcContent237,"10");
                }
                jcContentAttr1s.addAll(Save237.getEntity(jcContent237.getContentId(), list));
            }
        }else {
            System.out.println("未找到222模板对应的信息");return new ArrayList<JcContentAttr1>();
        }
        return jcContentAttr1s;
    }

    public List<JcContentAttr1> save238(Integer userId,Date createDate,String instanceid,Integer jcContentId){
        JjhnjZhdgyxmdezhfdxSubExample example = new JjhnjZhdgyxmdezhfdxSubExample();
        example.createCriteria().andInstanceidEqualTo(instanceid);
        List<JjhnjZhdgyxmdezhfdxSub> lists = oldService.selectByExample(example);
        List<JcContentAttr1> jcContentAttr1s = new ArrayList<>();
        if(MyTools.isNotEmpty(lists)){//判断匹配是否成功
            for (JjhnjZhdgyxmdezhfdxSub list : lists) {
                //插入222JcContent表
                JcContent jcContent238 = saveJcContent(userId,238,createDate,jcContentId);
                if(MyTools.isNotEmpty(list.getXiangmumingcheng())){
                    saveJcContentExt(jcContent238,list.getXiangmumingcheng().toString());
                }else {
                    saveJcContentExt(jcContent238,"10");
                }
                jcContentAttr1s.addAll(Save238.getEntity(jcContent238.getContentId(), list));
            }
        }else {
            System.out.println("未找到222模板对应的信息");return new ArrayList<JcContentAttr1>();
        }
        return jcContentAttr1s;
    }

    public List<JcContentAttr1> save2391(Integer userId,Date createDate,String instanceid,Integer jcContentId){
        JjhNjCsxtExample example = new JjhNjCsxtExample();
        example.createCriteria().andInstanceidEqualTo(instanceid);
        List<JjhNjCsxt> lists = oldService.selectByExample(example);
        List<JcContentAttr1> jcContentAttr1s = new ArrayList<>();
        if(MyTools.isNotEmpty(lists)){//判断匹配是否成功
            for (JjhNjCsxt list : lists) {
                //插入222JcContent表
                JcContent jcContent2391 = saveJcContent(userId,2391,createDate,jcContentId);
                if(MyTools.isNotEmpty(list.getMingcheng())){
                    saveJcContentExt(jcContent2391,list.getMingcheng().toString());
                }else {
                    saveJcContentExt(jcContent2391,"10");
                }
                jcContentAttr1s.addAll(Save2391.getEntity(jcContent2391.getContentId(), list));
            }
        }else {
            System.out.println("未找到222模板对应的信息");return new ArrayList<JcContentAttr1>();
        }
        return jcContentAttr1s;
    }


    public List<JcContentAttr1> save247(Integer userId,Date createDate,String instanceid,Integer jcContentId){
        JjhnjYfkxSubExample example = new JjhnjYfkxSubExample();
        example.createCriteria().andInstanceidEqualTo(instanceid);
        List<JjhnjYfkxSub> lists = oldService.selectByExample(example);
        List<JcContentAttr1> jcContentAttr1s = new ArrayList<>();
        if(MyTools.isNotEmpty(lists)){//判断匹配是否成功
            for (JjhnjYfkxSub list : lists) {
                //插入222JcContent表
                JcContent jcContent247 = saveJcContent(userId,247,createDate,jcContentId);
                if(MyTools.isNotEmpty(list.getXiangmu())){
                    saveJcContentExt(jcContent247,list.getXiangmu().toString());
                }else {
                    saveJcContentExt(jcContent247,"10");
                }
                jcContentAttr1s.addAll(Save247.getEntity(jcContent247.getContentId(), list));
            }
        }else {
            System.out.println("未找到222模板对应的信息");return new ArrayList<JcContentAttr1>();
        }
        return jcContentAttr1s;
    }

    public List<JcContentAttr1> save249(String instanceid,Integer jcContentId){
        JjhnjJshjdgltabExample example = new JjhnjJshjdgltabExample();
        example.createCriteria().andInstanceidEqualTo(instanceid);
        List<JjhnjJshjdgltab> lists = oldService.selectByExample(example);
        if(MyTools.isNotEmpty(lists)){//判断匹配是否成功
            return Save249.getEntity(jcContentId, lists.get(0));//获得202模板所需要的数据
        }else {
            System.out.println("未找到222模板对应的信息");return new ArrayList<JcContentAttr1>();
        }
    }

    public List<JcContentAttr1> save255(Integer userId,Date createDate,String instanceid,Integer jcContentId){
        JjhNjGmzcqkItemExample example = new JjhNjGmzcqkItemExample();
        example.createCriteria().andInstanceidEqualTo(instanceid);
        List<JjhNjGmzcqkItem> lists = oldService.selectByExample(example);
        List<JcContentAttr1> jcContentAttr1s = new ArrayList<>();
        if(MyTools.isNotEmpty(lists)){//判断匹配是否成功
            for (JjhNjGmzcqkItem list : lists) {
                //插入222JcContent表
                JcContent jcContent255 = saveJcContent(userId,255,createDate,jcContentId);
                if(MyTools.isNotEmpty(list.getMingcheng())){
                    saveJcContentExt(jcContent255,list.getMingcheng().toString());
                }else {
                    saveJcContentExt(jcContent255,"10");
                }
                jcContentAttr1s.addAll(Save255.getEntity(jcContent255.getContentId(), list));
            }
        }else {
            System.out.println("未找到222模板对应的信息");return new ArrayList<JcContentAttr1>();
        }
        return jcContentAttr1s;
    }

//    public List<JcContentAttr1> save256(Integer userId,Date createDate,String instanceid,Integer jcContentId){
//        JjhNjReportGqstqkItemExample example = new JjhNjReportGqstqkItemExample();
//        example.createCriteria().andInstanceidEqualTo(instanceid);
//        List<JjhNjReportGqstqkItem> lists = oldService.selectByExample(example);
//        List<JcContentAttr1> jcContentAttr1s = new ArrayList<>();
//        if(MyTools.isNotEmpty(lists)){//判断匹配是否成功
//            for (JjhNjReportGqstqkItem list : lists) {
//                //插入222JcContent表
//                JcContent jcContent256 = saveJcContent(userId,256,createDate,jcContentId);
//                if(MyTools.isNotEmpty(list.getMingcheng())){
//                    saveJcContentExt(jcContent256,list.getMingcheng().toString());
//                }else {
//                    saveJcContentExt(jcContent256,"10");
//                }
//                jcContentAttr1s.addAll(Save256.getEntity(jcContent256.getContentId(), list));
//            }
//        }else {
//            System.out.println("未找到222模板对应的信息");return new ArrayList<JcContentAttr1>();
//        }
//        return jcContentAttr1s;
//    }

        public List<JcContentAttr1> save2561(Integer userId,Date createDate,String instanceid,Integer jcContentId){
        JjhNjReportGqstqkItemExample example = new JjhNjReportGqstqkItemExample();
        example.createCriteria().andInstanceidEqualTo(instanceid);
        List<JjhNjReportGqstqkItem> lists = oldService.selectByExample(example);
        List<JcContentAttr1> jcContentAttr1s = new ArrayList<>();
        if(MyTools.isNotEmpty(lists)){//判断匹配是否成功
            for (JjhNjReportGqstqkItem list : lists) {
                //插入222JcContent表
                JcContent jcContent2561 = saveJcContent(userId,2561,createDate,jcContentId);
                if(MyTools.isNotEmpty(list.getMingcheng())){
                    saveJcContentExt(jcContent2561,list.getMingcheng().toString());
                }else {
                    saveJcContentExt(jcContent2561,"10");
                }
                jcContentAttr1s.addAll(Save2561.getEntity(jcContent2561.getContentId(), list));
            }
        }else {
            System.out.println("未找到2561模板对应的信息");return new ArrayList<JcContentAttr1>();
        }
        return jcContentAttr1s;
    }

        public List<JcContentAttr1> save2562(Integer userId,Date createDate,String instanceid,Integer jcContentId){
        JjhNjReportGqstqkItemExample example = new JjhNjReportGqstqkItemExample();
        example.createCriteria().andInstanceidEqualTo(instanceid);
        List<JjhNjReportGqstqkItem> lists = oldService.selectByExample(example);
        List<JcContentAttr1> jcContentAttr1s = new ArrayList<>();
        if(MyTools.isNotEmpty(lists)){//判断匹配是否成功
            for (JjhNjReportGqstqkItem list : lists) {
                //插入222JcContent表
                JcContent jcContent2562 = saveJcContent(userId,2562,createDate,jcContentId);
                if(MyTools.isNotEmpty(list.getMingcheng())){
                    saveJcContentExt(jcContent2562,list.getMingcheng().toString());
                }else {
                    saveJcContentExt(jcContent2562,"10");
                }
                jcContentAttr1s.addAll(Save2562.getEntity(jcContent2562.getContentId(), list));
            }
        }else {
            System.out.println("未找到2562模板对应的信息");return new ArrayList<JcContentAttr1>();
        }
        return jcContentAttr1s;
    }

    public List<JcContentAttr1> save257(String instanceid,Integer jcContentId){
        JjhnjXxgkExample example = new JjhnjXxgkExample();
        example.createCriteria().andInstanceidEqualTo(instanceid);
        List<JjhnjXxgk> lists = oldService.selectByExample(example);
        if(MyTools.isNotEmpty(lists)){//判断匹配是否成功
            return Save257.getEntity(jcContentId, lists.get(0));//获得202模板所需要的数据
        }else {
            System.out.println("未找到222模板对应的信息");return new ArrayList<JcContentAttr1>();
        }
    }

    public List<JcContentAttr1> save248(Integer userId,Date createDate,String instanceid,Integer jcContentId){
        JjhnjYszkSubExample example = new JjhnjYszkSubExample();
        example.createCriteria().andInstanceidEqualTo(instanceid);
        List<JjhnjYszkSub> lists = oldService.selectByExample(example);
        List<JcContentAttr1> jcContentAttr1s = new ArrayList<>();
        if(MyTools.isNotEmpty(lists)){//判断匹配是否成功
            for (JjhnjYszkSub list : lists) {
                //插入222JcContent表
                JcContent jcContent248 = saveJcContent(userId,248,createDate,jcContentId);
                if(MyTools.isNotEmpty(list.getXiangmu())){
                    saveJcContentExt(jcContent248,list.getXiangmu());
                }else {
                    saveJcContentExt(jcContent248,"10");
                }

                jcContentAttr1s.addAll(Save248.getEntity(jcContent248.getContentId(), list));
            }
        }else {
            System.out.println("未找到222模板对应的信息");return new ArrayList<JcContentAttr1>();
        }
        return jcContentAttr1s;
    }

    public List<JcContentAttr1> save252(Integer userId,Date createDate,String instanceid,Integer jcContentId){
        JjhnjJshjdglSubExample example = new JjhnjJshjdglSubExample();
        example.createCriteria().andInstanceidEqualTo(instanceid);
        List<JjhnjJshjdglSub> lists = oldService.selectByExample(example);
        List<JcContentAttr1> jcContentAttr1s = new ArrayList<>();
        if(MyTools.isNotEmpty(lists)){//判断匹配是否成功
            for (JjhnjJshjdglSub list : lists) {
                //插入222JcContent表
                JcContent jcContent252 = saveJcContent(userId,252,createDate,jcContentId);
                if(MyTools.isNotEmpty(list.getWeifaxingwei())){
                    saveJcContentExt(jcContent252,list.getWeifaxingwei());
                }else {
                    saveJcContentExt(jcContent252,"10");
                }

                jcContentAttr1s.addAll(Save252.getEntity(jcContent252.getContentId(), list));
            }
        }else {
            System.out.println("未找到222模板对应的信息");return new ArrayList<JcContentAttr1>();
        }
        return jcContentAttr1s;
    }

    public List<JcContentAttr1> save260(Integer userId,Date createDate,String instanceid,Integer jcContentId){
        JjhnjWtlcTest002SubExample example = new JjhnjWtlcTest002SubExample();
        example.createCriteria().andInstanceidEqualTo(instanceid);
        List<JjhnjWtlcTest002Sub> lists = oldService.selectByExample(example);
        List<JcContentAttr1> jcContentAttr1s = new ArrayList<>();
        if(MyTools.isNotEmpty(lists)){//判断匹配是否成功
            for (JjhnjWtlcTest002Sub list : lists) {
                //插入222JcContent表
                JcContent jcContent260 = saveJcContent(userId,260,createDate,jcContentId);
                if(MyTools.isNotEmpty(list.getShoutuoren())){
                    saveJcContentExt(jcContent260,list.getShoutuoren());
                }else {
                    saveJcContentExt(jcContent260,"10");
                }

                jcContentAttr1s.addAll(Save260.getEntity(jcContent260.getContentId(), list));
            }
        }else {
            System.out.println("未找到222模板对应的信息");return new ArrayList<JcContentAttr1>();
        }
        return jcContentAttr1s;
    }

    public List<JcContentAttr1> save236(Integer userId,Date createDate,String instanceid,Integer jcContentId){
        JjhnjYewhddaejzpageSubExample example = new JjhnjYewhddaejzpageSubExample();
        example.createCriteria().andInstanceidEqualTo(instanceid);
        List<JjhnjYewhddaejzpageSub> lists = oldService.selectByExample(example);
        List<JcContentAttr1> jcContentAttr1s = new ArrayList<>();
        if(MyTools.isNotEmpty(lists)){//判断匹配是否成功
            for (JjhnjYewhddaejzpageSub list : lists) {
                //插入222JcContent表
                JcContent jcContent236 = saveJcContent(userId,236,createDate,jcContentId);
                if(MyTools.isNotEmpty(list.getJuanzengren())){
                    saveJcContentExt(jcContent236,list.getJuanzengren());
                }else {
                    saveJcContentExt(jcContent236,"10");
                }

                jcContentAttr1s.addAll(Save2301.getEntity(jcContent236.getContentId(), list));
            }
        }else {
            System.out.println("未找到222模板对应的信息");return new ArrayList<JcContentAttr1>();
        }
        return jcContentAttr1s;
    }

    public List<JcContentAttr1> save2291(Integer userId,Date createDate,String instanceid,Integer jcContentId){
        JjhNjReportZxqkItemExample example = new JjhNjReportZxqkItemExample();
        example.createCriteria().andInstanceidEqualTo(instanceid);
        List<JjhNjReportZxqkItem> lists = oldService.selectByExample(example);
        List<JcContentAttr1> jcContentAttr1s = new ArrayList<>();
        if(MyTools.isNotEmpty(lists)){//判断匹配是否成功
            for (JjhNjReportZxqkItem list : lists) {
                //插入222JcContent表
                JcContent jcContent2291 = saveJcContent(userId,2291,createDate,jcContentId);
                if(MyTools.isNotEmpty(list.getKzgymingcheng())){
                    saveJcContentExt(jcContent2291,list.getKzgymingcheng().toString());
                }else {
                    saveJcContentExt(jcContent2291,"10");
                }

                jcContentAttr1s.addAll(Save2291.getEntity(jcContent2291.getContentId(), list));
            }
        }else {
            System.out.println("未找到222模板对应的信息");return new ArrayList<JcContentAttr1>();
        }
        return jcContentAttr1s;
    }

    public List<JcContentAttr1> save2292(Integer userId,Date createDate,String instanceid,Integer jcContentId){
        JjhNjReportZxqkItemExample example = new JjhNjReportZxqkItemExample();
        example.createCriteria().andInstanceidEqualTo(instanceid);
        List<JjhNjReportZxqkItem> lists = oldService.selectByExample(example);
        List<JcContentAttr1> jcContentAttr1s = new ArrayList<>();
        if(MyTools.isNotEmpty(lists)){//判断匹配是否成功
            for (JjhNjReportZxqkItem list : lists) {
                //插入222JcContent表
                JcContent jcContent2292 = saveJcContent(userId,2292,createDate,jcContentId);
                if(MyTools.isNotEmpty(list.getKzgymingcheng())){
                    saveJcContentExt(jcContent2292,list.getKzgymingcheng().toString());
                }else {
                    saveJcContentExt(jcContent2292,"10");
                }

                jcContentAttr1s.addAll(Save2292.getEntity(jcContent2292.getContentId(), list));
            }
        }else {
            System.out.println("未找到222模板对应的信息");return new ArrayList<JcContentAttr1>();
        }
        return jcContentAttr1s;
    }

    public List<JcContentAttr1> save2293(Integer userId,Date createDate,String instanceid,Integer jcContentId){

        Stnianjianreport9SubExample example = new Stnianjianreport9SubExample();
        example.createCriteria().andInstanceidEqualTo(instanceid);
        List<Stnianjianreport9Sub> lists = oldService.selectByExample(example);
        List<JcContentAttr1> jcContentAttr1s = new ArrayList<>();
        if(MyTools.isNotEmpty(lists)){//判断匹配是否成功
            for (Stnianjianreport9Sub list : lists) {
                //插入222JcContent表
                JcContent jcContent2293 = saveJcContent(userId,2293,createDate,jcContentId);
                if(MyTools.isNotEmpty(list.getMingcheng())){
                    saveJcContentExt(jcContent2293,list.getMingcheng().toString());
                }else {
                    saveJcContentExt(jcContent2293,"10");
                }

                jcContentAttr1s.addAll(Save2293.getEntity(jcContent2293.getContentId(), list));
            }
        }else {
            System.out.println("未找到222模板对应的信息");return new ArrayList<JcContentAttr1>();
        }
        return jcContentAttr1s;
    }

    public List<JcContentAttr1> save2294(Integer userId,Date createDate,String instanceid,Integer jcContentId){
        JjhNjReportQtnsjgItemExample example = new JjhNjReportQtnsjgItemExample();
        example.createCriteria().andInstanceidEqualTo(instanceid);
        List<JjhNjReportQtnsjgItem> lists = oldService.selectByExample(example);
        List<JcContentAttr1> jcContentAttr1s = new ArrayList<>();
        if(MyTools.isNotEmpty(lists)){//判断匹配是否成功
            for (JjhNjReportQtnsjgItem list : lists) {
                //插入222JcContent表
                JcContent jcContent2294 = saveJcContent(userId,2294,createDate,jcContentId);
                if(MyTools.isNotEmpty(list.getMingcheng())){
                    saveJcContentExt(jcContent2294,list.getMingcheng().toString());
                }else {
                    saveJcContentExt(jcContent2294,"10");
                }

                jcContentAttr1s.addAll(Save2294.getEntity(jcContent2294.getContentId(), list));
            }
        }else {
            System.out.println("未找到222模板对应的信息");return new ArrayList<JcContentAttr1>();
        }
        return jcContentAttr1s;
    }


    public List<JcContentAttr1> save2221(Integer userId,Date createDate,String instanceid,Integer jcContentId){
        JjhnjJgjslsjqkSubExample example = new JjhnjJgjslsjqkSubExample();
        example.createCriteria().andInstanceidEqualTo(instanceid);
        List<JjhnjJgjslsjqkSub> lists = oldService.selectByExample(example);
        List<JcContentAttr1> jcContentAttr1s = new ArrayList<>();
        if(MyTools.isNotEmpty(lists)){//判断匹配是否成功
            for (JjhnjJgjslsjqkSub list : lists) {
                //插入222JcContent表
                JcContent jcContent2221 = saveJcContent(userId,2221,createDate,jcContentId);
                saveJcContentExt(jcContent2221,"10");
                jcContentAttr1s.addAll(Save2221.getEntity(jcContent2221.getContentId(), list));
            }
        }else {
            System.out.println("未找到222模板对应的信息");return new ArrayList<JcContentAttr1>();
        }
        return jcContentAttr1s;
    }

    public List<JcContentAttr1> save2301(Integer userId,Date createDate,String instanceid,Integer jcContentId){
        JjhnjYewhddaejzpageSubExample example = new JjhnjYewhddaejzpageSubExample();
        example.createCriteria().andInstanceidEqualTo(instanceid);
        List<JjhnjYewhddaejzpageSub> lists = oldService.selectByExample(example);
        List<JcContentAttr1> jcContentAttr1s = new ArrayList<>();
        if(MyTools.isNotEmpty(lists)){//判断匹配是否成功
            for (JjhnjYewhddaejzpageSub list : lists) {
                //插入222JcContent表
                JcContent jcContent2301 = saveJcContent(userId,2301,createDate,jcContentId);
                if(MyTools.isNotEmpty(list.getJuanzengren())){
                    saveJcContentExt(jcContent2301,list.getJuanzengren());
                }else {
                    saveJcContentExt(jcContent2301,"10");
                }
                jcContentAttr1s.addAll(Save2301.getEntity(jcContent2301.getContentId(), list));
            }
        }else {
            System.out.println("未找到222模板对应的信息");return new ArrayList<JcContentAttr1>();
        }
        return jcContentAttr1s;
    }

    public List<JcContentAttr1> save2401(Integer userId,Date createDate,String instanceid,Integer jcContentId){
        JjhnjGlfgxjjySubExample example = new JjhnjGlfgxjjySubExample();
        example.createCriteria().andInstanceidEqualTo(instanceid);
        List<JjhnjGlfgxjjySub> lists = oldService.selectByExample(example);
        List<JcContentAttr1> jcContentAttr1s = new ArrayList<>();
        if(MyTools.isNotEmpty(lists)){//判断匹配是否成功
            for (JjhnjGlfgxjjySub list : lists) {
                //插入222JcContent表
                JcContent jcContent2401 = saveJcContent(userId,2401,createDate,jcContentId);
                if(MyTools.isNotEmpty(list.getGuanlianfang())){
                    saveJcContentExt(jcContent2401,list.getGuanlianfang());
                }else {
                    saveJcContentExt(jcContent2401,"10");
                }
                jcContentAttr1s.addAll(Save2401.getEntity(jcContent2401.getContentId(), list));
            }
        }else {
            System.out.println("未找到222模板对应的信息");return new ArrayList<JcContentAttr1>();
        }
        return jcContentAttr1s;
    }

    public List<JcContentAttr1> save2402(Integer userId,Date createDate,String instanceid,Integer jcContentId){
        JjhnjJjhyglfjySubExample example = new JjhnjJjhyglfjySubExample();
        example.createCriteria().andInstanceidEqualTo(instanceid);
        List<JjhnjJjhyglfjySub> lists = oldService.selectByExample(example);
        List<JcContentAttr1> jcContentAttr1s = new ArrayList<>();
        if(MyTools.isNotEmpty(lists)){//判断匹配是否成功
            for (JjhnjJjhyglfjySub list : lists) {
                //插入222JcContent表
                JcContent jcContent2402 = saveJcContent(userId,2402,createDate,jcContentId);
                if(MyTools.isNotEmpty(list.getGuanlianfang())){
                    saveJcContentExt(jcContent2402,list.getGuanlianfang());
                }else {
                    saveJcContentExt(jcContent2402,"10");
                }
                jcContentAttr1s.addAll(Save2402.getEntity(jcContent2402.getContentId(), list));
            }
        }else {
            System.out.println("未找到222模板对应的信息");return new ArrayList<JcContentAttr1>();
        }
        return jcContentAttr1s;
    }

    public List<JcContentAttr1> save221Entity(Integer jcContentId,Content202Entity content202Entity){
        return Save200Entity.getEntity(jcContentId, content202Entity);//获得202模板所需要的数据
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


//    //存workflow表
//    public JcWorkflowStep saveWorkflow(JcContent jcContent,String name,Date finishDate){
//        JcWorkflowStep jcWorkflowStep = new JcWorkflowStep();
//        jcWorkflowStep.setWorkflowId(6);
//        jcWorkflowStep.setContentId(jcContent.getContentId());
//        jcWorkflowStep.setNodeId(-1);
//        jcWorkflowStep.setOwnerId(1);
//        jcWorkflowStep.setValue("结论复审");
//        jcWorkflowStep.setUserId(jcContent.getUserId());
//        jcWorkflowStep.setHistory(-1);
//        jcWorkflowStep.setStartDate(finishDate);
//        jcWorkflowStep.setFinishDate(finishDate);
//        jcWorkflowStep.setPrevNodeId(99);
//        jcWorkflowStep.setStatus("结束");
//        jcWorkflowStep = NewJcWorkflowStepService.save(jcWorkflowStep);
//        return jcWorkflowStep;
//    }



    public List<String> getCodeList(){
        List<String> list = new ArrayList<>();
        list.add("53120000052067223Y");
        list.add("53120000055253187Y");
        list.add("53120000055266180N");
        list.add("53120000058702769N");
        list.add("5312000006122899XP");
        list.add("5312000008655920X0");
        list.add("53120000086597409X");
        list.add("531200000915916697");
        list.add("5312000009367015X0");
        list.add("53120000093763700K");
        list.add("531200000976400036");
        list.add("53120000300500680R");
        list.add("53120000300590911C");
        list.add("531200003006550414");
        list.add("53120000300663850Q");
        list.add("53120000300751244E");
        list.add("53120000328613193D");
        list.add("53120000328646729P");
        list.add("531200003287058211");
        list.add("53120000340896640N");
        list.add("5312000035672160XN");
        list.add("531200003567316722");
        list.add("531200005009206391");
        list.add("53120000500920954L");
        list.add("5312000050092105X6");
        list.add("53120000500921762B");
        list.add("531200005009217706");
        list.add("5312000050092180XE");
        list.add("53120000500921818E");
        list.add("53120000500922220U");
        list.add("531200005009230042");
        list.add("53120000500923098P");
        list.add("531200005009555839");
        list.add("53120000550362081K");
        list.add("531200005534379666");
        list.add("53120000556511631W");
        list.add("53120000559463284R");
        list.add("531200005594679714");
        list.add("531200005864080291");
        list.add("53120000586448805Y");
        list.add("53120000589783027Y");
        list.add("53120000592916740E");
        list.add("53120000592942834R");
        list.add("531200005929461062");
        list.add("531200006661122285");
        list.add("53120000666132990T");
        list.add("53120000668804551Q");
        list.add("5312000066881918XP");
        list.add("531200006714780721");
        list.add("531200006714787260");
        list.add("53120000675970443K");
        list.add("53120000684711822L");
        list.add("53120000690664428K");
        list.add("5312000069068236X4");
        list.add("53120000700579498W");
        list.add("53120000712845765K");
        list.add("531200007129372210");
        list.add("53120000718245525R");
        list.add("53120000718259484U");
        list.add("531200007491077238");
        list.add("53120000749147346U");
        list.add("531200007612911562");
        list.add("5312000076762541XC");
        list.add("53120000767649454F");
        list.add("53120000770610710E");
        list.add("531200007773066908");
        list.add("5312000078031822X1");
        list.add("531200007893898173");
        list.add("531200007972792042");
        list.add("53120000797291510D");
        list.add("53120000MJ06658532");
        list.add("53120000MJ0666370M");
        list.add("53120000MJ06669959");
        list.add("53120000MJ066800XM");
        list.add("53120000MJ0668835U");
        list.add("53120000MJ0668907L");
        list.add("53120000MJ0669176J");
        list.add("53120000MJ06693797");
        list.add("53120000MJ0669475G");
        list.add("53120000MJ06715679");
        list.add("53120000MJ0672017Y");
        list.add("53120000MJ0672148T");
        list.add("53120000MJ0672279N");
        list.add("53120000MJ0672818F");
        list.add("53120000MJ0672826A");
        list.add("53120000MJ0673298W");
        list.add("53120000MJ067395XH");
        list.add("53120000MJ067440X7");
        list.add("53120000MJ0674450J");
        list.add("53120000MJ0675613A");
        list.add("53120000MJ06757521");
        list.add("53120000MJY0452261");
        list.add("53120000MJY074465D");
        list.add("53120000MJY076081T");
        list.add("53120000MJY081331A");
        list.add("53120000MJY089130M");
        list.add("53120000MJY090254G");
        list.add("53120000MJY105698Q");
        list.add("53120000MJY105735Y");
        return list;
    }
}
