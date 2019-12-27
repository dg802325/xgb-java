package com.xgb.controller;

import com.xgb.model.*;
import com.xgb.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
public class OldSaveFormConsultationCaseController {

    @Autowired
    private OldService oldService;

    @GetMapping("/save")
    public String save(){
//        MjzzUserExample example = new MjzzUserExample();
//        example.createCriteria().andUsernameEqualTo("天津上市公司协会");
//        List<MjzzUser> mjzzUsers = oldService.selectByExample(example);
//        MjzzUser mjzzUser1 = mjzzUsers.get(0);
        FormConsultationCaseExample formConsultationCaseExample = new FormConsultationCaseExample();
//        formConsultationCaseExample.createCriteria().andOrgidEqualTo(mjzzUser1.getOrgIdentity()).andPropertyEEqualTo("2017");//查询2017年数据
        List<FormConsultationCase> lists = oldService.selectByExample(formConsultationCaseExample);
        StringBuffer buffer = new StringBuffer();
        //写入txt文件
        buffer = SaveFormConsultationCaseService.saveEntity(buffer,lists);
        SaveFormConsultationCaseService.writeToRestource(buffer);
        //1
        save2(null);
        save3(null);
        save4(null);
        save5(null);
        save6(null);
        save7(null);
        save8(null);
        save9(null);
        save10(null);
        save11(null);
        save12(null);
        save13(null);
        save14(null);
        save15(null);
        save16(null);
        save17(null);
        save18(null);
        save19(null);
        save20(null);
        save21(null);
        save22(null);
        save23(null);
        save24(null);
        save25(null);
        save26(null);
        save27(null);
        save28(null);
        save29(null);
        save31(null);
        save32(null);
        save33(null);
        save34(null);
        save35(null);
        save36(null);
        save37(null);
        save38(null);
        save39(null);
        save40(null);
        save41(null);
        save42(null);
        save43(null);
        save44(null);
        save45(null);
        save46(null);
        save47(null);
        save48(null);
        save49(null);
        return "success";
    }


    public String save2(String instanceid){
        StringBuffer buffer = new StringBuffer();
        StNjReport3Example stNjReport3Example = new StNjReport3Example();
        List<StNjReport3> lists = oldService.selectByExample(stNjReport3Example);
        buffer = SaveStNjReport3Service.saveEntity(buffer,lists);
        SaveStNjReport3Service.writeToRestource(buffer);
        return "success";
    }

    public String save3(String instanceid){
        StringBuffer buffer = new StringBuffer();
        JjhnjGyhdmxExample jjhnjGyhdmxExample = new JjhnjGyhdmxExample();
        List<JjhnjGyhdmx> lists = oldService.selectByExample(jjhnjGyhdmxExample);
        buffer = SaveJjhnjGyhdmxService.saveEntity(buffer,lists);
        SaveJjhnjGyhdmxService.writeToRestource(buffer);
        return "success";
    }

    public String save4(String instanceid){
        StringBuffer buffer = new StringBuffer();
        JjhnjGyhdmxSubExample jjhnjGyhdmxExample = new JjhnjGyhdmxSubExample();
        List<JjhnjGyhdmxSub> lists = oldService.selectByExample(jjhnjGyhdmxExample);
        buffer = SaveJjhnjGyhdmxSubService.saveEntity(buffer,lists);
        SaveJjhnjGyhdmxSubService.writeToRestource(buffer);
        return "success";
    }

    public String save5(String instanceid){
        StringBuffer buffer = new StringBuffer();
        JjhnjReport3Example exampleTo = new JjhnjReport3Example();
        List<JjhnjReport3> lists = oldService.selectByExample(exampleTo);
        buffer = SaveJjhnjReport3Service.saveEntity(buffer,lists);
        SaveJjhnjReport3Service.writeToRestource(buffer);
        return "success";
    }
    public String save6(String instanceid){
        StringBuffer buffer = new StringBuffer();
        JjhnjReport4Example exampleTo = new JjhnjReport4Example();
        List<JjhnjReport4> lists = oldService.selectByExample(exampleTo);
        buffer = SaveJjhnjReport4Service.saveEntity(buffer,lists);
        SaveJjhnjReport4Service.writeToRestource(buffer);
        return "success";
    }

    public String save7(String instanceid){
        StringBuffer buffer = new StringBuffer();
        MfGwyJzTbExample exampleTo = new MfGwyJzTbExample();
        List<MfGwyJzTb> lists = oldService.selectByExample(exampleTo);
        buffer = SaveMfGwyJzTbService.saveEntity(buffer,lists);
        SaveMfGwyJzTbService.writeToRestource(buffer);
        return "success";
    }

    public String save8(String instanceid){
        StringBuffer buffer = new StringBuffer();
        MfGwyjzZbExample exampleTo = new MfGwyjzZbExample();
        List<MfGwyjzZb> lists = oldService.selectByExample(exampleTo);
        buffer = SaveMfGwyjzZbService.saveEntity(buffer,lists);
        SaveMfGwyjzZbService.writeToRestource(buffer);
        return "success";
    }

    public String save9(String instanceid){
        StringBuffer buffer = new StringBuffer();
        StDjqk4Example exampleTo = new StDjqk4Example();
        List<StDjqk4> lists = oldService.selectByExample(exampleTo);
        buffer = SaveStDjqk4Service.saveEntity(buffer,lists);
        SaveStDjqk4Service.writeToRestource(buffer);
        return "success";
    }

    public String save10(String instanceid){
        StringBuffer buffer = new StringBuffer();
        StNjAdministratCostInxExample exampleTo = new StNjAdministratCostInxExample();
        List<StNjAdministratCostInx> lists = oldService.selectByExample(exampleTo);
        buffer = SaveStNjAdministratCostInxService.saveEntity(buffer,lists);
        SaveStNjAdministratCostInxService.writeToRestource(buffer);
        return "success";
    }

    public String save11(String instanceid){
        StringBuffer buffer = new StringBuffer();
        StNjAppraiseCostInxExample exampleTo = new StNjAppraiseCostInxExample();
        List<StNjAppraiseCostInx> lists = oldService.selectByExample(exampleTo);
        buffer = SaveStNjAppraiseCostInxService.saveEntity(buffer,lists);
        SaveStNjAppraiseCostInxService.writeToRestource(buffer);
        return "success";
    }

    public String save12(String instanceid){
        StringBuffer buffer = new StringBuffer();
        StNjAppraiseCostExample exampleTo = new StNjAppraiseCostExample();
        List<StNjAppraiseCost> lists = oldService.selectByExample(exampleTo);
        buffer = SaveStNjAppraiseCostService.saveEntity(buffer,lists);
        SaveStNjAppraiseCostService.writeToRestource(buffer);
        return "success";
    }

    public String save13(String instanceid){
        StringBuffer buffer = new StringBuffer();
        StNjCgfwExample exampleTo = new StNjCgfwExample();
        List<StNjCgfw> lists = oldService.selectByExample(exampleTo);
        buffer = SaveStNjCgfwService.saveEntity(buffer,lists);
        SaveStNjCgfwService.writeToRestource(buffer);
        return "success";
    }

    public String save14(String instanceid){
        StringBuffer buffer = new StringBuffer();
        StNjGjhyExample exampleTo = new StNjGjhyExample();
        List<StNjGjhy> lists = oldService.selectByExample(exampleTo);
        buffer = SaveStNjGjhyService.saveEntity(buffer,lists);
        SaveStNjGjhyService.writeToRestource(buffer);
        return "success";
    }

    public String save15(String instanceid){
        StringBuffer buffer = new StringBuffer();
        StNjGyhdzcExample exampleTo = new StNjGyhdzcExample();
        List<StNjGyhdzc> lists = oldService.selectByExample(exampleTo);
        buffer = SaveStNjGyhdzcService.saveEntity(buffer,lists);
        SaveStNjGyhdzcService.writeToRestource(buffer);
        return "success";
    }

    public String save16(String instanceid){
        StringBuffer buffer = new StringBuffer();
        StNjGyhdzcSubExample exampleTo = new StNjGyhdzcSubExample();
        List<StNjGyhdzcSub> lists = oldService.selectByExample(exampleTo);
        buffer = SaveStNjGyhdzcSubService.saveEntity(buffer,lists);
        SaveStNjGyhdzcSubService.writeToRestource(buffer);
        return "success";
    }

    public String save17(String instanceid){
        StringBuffer buffer = new StringBuffer();
        StNjJbgyhdExample exampleTo = new StNjJbgyhdExample();
        List<StNjJbgyhd> lists = oldService.selectByExample(exampleTo);
        buffer = SaveStNjJbgyhdService.saveEntity(buffer,lists);
        SaveStNjJbgyhdService.writeToRestource(buffer);
        return "success";
    }

    public String save18(String instanceid){
        StringBuffer buffer = new StringBuffer();
        StNjJbgyhdSubExample exampleTo = new StNjJbgyhdSubExample();
        List<StNjJbgyhdSub> lists = oldService.selectByExample(exampleTo);
        buffer = SaveStNjJbgyhdSubService.saveEntity(buffer,lists);
        SaveStNjJbgyhdSubService.writeToRestource(buffer);
        return "success";
    }

    public String save19(String instanceid){
        StringBuffer buffer = new StringBuffer();
        StNjJieshoujianduExample exampleTo = new StNjJieshoujianduExample();
        List<StNjJieshoujiandu> lists = oldService.selectByExample(exampleTo);
        buffer = SaveStNjJieshoujianduService.saveEntity(buffer,lists);
        SaveStNjJieshoujianduService.writeToRestource(buffer);
        return "success";
    }

    public String save20(String instanceid){
        StringBuffer buffer = new StringBuffer();
        StNjQgadviseExample exampleTo = new StNjQgadviseExample();
        List<StNjQgadvise> lists = oldService.selectByExample(exampleTo);
        buffer = SaveStNjQgadviseService.saveEntity(buffer,lists);
        SaveStNjQgadviseService.writeToRestource(buffer);
        return "success";
    }

    public String save21(String instanceid){
        StringBuffer buffer = new StringBuffer();
        StNjReport3Example exampleTo = new StNjReport3Example();
        List<StNjReport3> lists = oldService.selectByExample(exampleTo);
        buffer = SaveStNjReport3Service.saveEntity(buffer,lists);
        SaveStNjReport3Service.writeToRestource(buffer);
        return "success";
    }

    public String save22(String instanceid){
        StringBuffer buffer = new StringBuffer();
        StNjReport11Example exampleTo = new StNjReport11Example();
        List<StNjReport11> lists = oldService.selectByExample(exampleTo);
        buffer = SaveStNjReport11Service.saveEntity(buffer,lists);
        SaveStNjReport11Service.writeToRestource(buffer);
        return "success";
    }

    public String save23(String instanceid){
        StringBuffer buffer = new StringBuffer();
        StNjReport11Sub1Example exampleTo = new StNjReport11Sub1Example();
        List<StNjReport11Sub1> lists = oldService.selectByExample(exampleTo);
        buffer = SaveStNjReport11Sub1Service.saveEntity(buffer,lists);
        SaveStNjReport11Sub1Service.writeToRestource(buffer);
        return "success";
    }

    public String save24(String instanceid){
        StringBuffer buffer = new StringBuffer();
        StNjReport13SubExample exampleTo = new StNjReport13SubExample();
        List<StNjReport13Sub> lists = oldService.selectByExample(exampleTo);
        buffer = SaveStNjReport13SubService.saveEntity(buffer,lists);
        SaveStNjReport13SubService.writeToRestource(buffer);
        return "success";
    }

    public String save25(String instanceid){
        StringBuffer buffer = new StringBuffer();
        StNjReport14SubExample exampleTo = new StNjReport14SubExample();
        List<StNjReport14Sub> lists = oldService.selectByExample(exampleTo);
        buffer = SaveStNjReport14SubService.saveEntity(buffer,lists);
        SaveStNjReport14SubService.writeToRestource(buffer);
        return "success";
    }

    public String save26(String instanceid){
        StringBuffer buffer = new StringBuffer();
        StNjReport16Example exampleTo = new StNjReport16Example();
        List<StNjReport16> lists = oldService.selectByExample(exampleTo);
        buffer = SaveStNjReport16Service.saveEntity(buffer,lists);
        SaveStNjReport16Service.writeToRestource(buffer);
        return "success";
    }

    public String save27(String instanceid){
        StringBuffer buffer = new StringBuffer();
        StNjReport16Sub1Example exampleTo = new StNjReport16Sub1Example();
        List<StNjReport16Sub1> lists = oldService.selectByExample(exampleTo);
        buffer = SaveStNjReport16Sub1Service.saveEntity(buffer,lists);
        SaveStNjReport16Sub1Service.writeToRestource(buffer);
        return "success";
    }

    public String save28(String instanceid){
        StringBuffer buffer = new StringBuffer();
        StNjReport16Sub2Example exampleTo = new StNjReport16Sub2Example();
        List<StNjReport16Sub2> lists = oldService.selectByExample(exampleTo);
        buffer = SaveStNjReport16Sub2Service.saveEntity(buffer,lists);
        SaveStNjReport16Sub2Service.writeToRestource(buffer);
        return "success";
    }

    public String save29(String instanceid){
        StringBuffer buffer = new StringBuffer();
        StNjReport17Sub1Example exampleTo = new StNjReport17Sub1Example();
        List<StNjReport17Sub1> lists = oldService.selectByExample(exampleTo);
        buffer = SaveStNjReport17Sub1Service.saveEntity(buffer,lists);
        SaveStNjReport17Sub1Service.writeToRestource(buffer);
        return "success";
    }

    public String save30(String instanceid){
        StringBuffer buffer = new StringBuffer();
        StNjReport17Sub2Example exampleTo = new StNjReport17Sub2Example();
        List<StNjReport17Sub2> lists = oldService.selectByExample(exampleTo);
        buffer = SaveStNjReport17Sub2Service.saveEntity(buffer,lists);
        SaveStNjReport17Sub2Service.writeToRestource(buffer);
        return "success";
    }

    public String save31(String instanceid){
        StringBuffer buffer = new StringBuffer();
        StNjReprot13Example exampleTo = new StNjReprot13Example();
        List<StNjReprot13> lists = oldService.selectByExample(exampleTo);
        buffer = SaveStNjReprot13Service.saveEntity(buffer,lists);
        SaveStNjReprot13Service.writeToRestource(buffer);
        return "success";
    }

    public String save32(String instanceid){
        StringBuffer buffer = new StringBuffer();
        StNjReprot14Example exampleTo = new StNjReprot14Example();
        List<StNjReprot14> lists = oldService.selectByExample(exampleTo);
        buffer = SaveStNjReprot14Service.saveEntity(buffer,lists);
        SaveStNjReprot14Service.writeToRestource(buffer);
        return "success";
    }

    public String save33(String instanceid){
        StringBuffer buffer = new StringBuffer();
        StNjReprot140Example exampleTo = new StNjReprot140Example();
        List<StNjReprot140> lists = oldService.selectByExample(exampleTo);
        buffer = SaveStNjReprot140Service.saveEntity(buffer,lists);
        SaveStNjReprot140Service.writeToRestource(buffer);
        return "success";
    }

    public String save34(String instanceid){
        StringBuffer buffer = new StringBuffer();
        StNjReprot140SubExample exampleTo = new StNjReprot140SubExample();
        List<StNjReprot140Sub> lists = oldService.selectByExample(exampleTo);
        buffer = SaveStNjReprot140SubService.saveEntity(buffer,lists);
        SaveStNjReprot140SubService.writeToRestource(buffer);
        return "success";
    }

    public String save35(String instanceid){
        StringBuffer buffer = new StringBuffer();
        StNjServiceCostExample exampleTo = new StNjServiceCostExample();
        List<StNjServiceCost> lists = oldService.selectByExample(exampleTo);
        buffer = SaveStNjServiceCostService.saveEntity(buffer,lists);
        SaveStNjServiceCostService.writeToRestource(buffer);
        return "success";
    }

    public String save36(String instanceid){
        StringBuffer buffer = new StringBuffer();
        StnjSfqkJyfwExample exampleTo = new StnjSfqkJyfwExample();
        List<StnjSfqkJyfw> lists = oldService.selectByExample(exampleTo);
        buffer = SaveStnjSfqkJyfwService.saveEntity(buffer,lists);
        SaveStnjSfqkJyfwService.writeToRestource(buffer);
        return "success";
    }

    public String save37(String instanceid){
        StringBuffer buffer = new StringBuffer();
        StnjSfqkJyfwSubExample exampleTo = new StnjSfqkJyfwSubExample();
        List<StnjSfqkJyfwSub> lists = oldService.selectByExample(exampleTo);
        buffer = SaveStnjSfqkJyfwSubService.saveEntity(buffer,lists);
        SaveStnjSfqkJyfwSubService.writeToRestource(buffer);
        return "success";
    }

    public String save38(String instanceid){
        StringBuffer buffer = new StringBuffer();
        StnjYwhdSubExample exampleTo = new StnjYwhdSubExample();
        List<StnjYwhdSub> lists = oldService.selectByExample(exampleTo);
        buffer = SaveStnjYwhdSubService.saveEntity(buffer,lists);
        SaveStnjYwhdSubService.writeToRestource(buffer);
        return "success";
    }

    public String save39(String instanceid){
        StringBuffer buffer = new StringBuffer();
        StnjYwhdTbExample exampleTo = new StnjYwhdTbExample();
        List<StnjYwhdTb> lists = oldService.selectByExample(exampleTo);
        buffer = SaveStnjYwhdTbService.saveEntity(buffer,lists);
        SaveStnjYwhdTbService.writeToRestource(buffer);
        return "success";
    }

    public String save40(String instanceid){
        StringBuffer buffer = new StringBuffer();
        StNjInner4Example exampleTo = new StNjInner4Example();
        List<StNjInner4> lists = oldService.selectByExample(exampleTo);
        buffer = SaveStNjInner4Service.saveEntity(buffer,lists);
        SaveStNjInner4Service.writeToRestource(buffer);
        return "success";
    }

    public String save41(String instanceid){
        StringBuffer buffer = new StringBuffer();
        LsCybaZbExample exampleTo = new LsCybaZbExample();
        List<LsCybaZb> lists = oldService.selectByExample(exampleTo);
        buffer = SaveLsCybaZbService.saveEntity(buffer,lists);
        SaveLsCybaZbService.writeToRestource(buffer);
        return "success";
    }

    public String save42(String instanceid){
        StringBuffer buffer = new StringBuffer();
        MfNianjianJbxxExample exampleTo = new MfNianjianJbxxExample();
        List<MfNianjianJbxx> lists = oldService.selectByExample(exampleTo);
        buffer = SaveMfNianjianJbxxService.saveEntity(buffer,lists);
        SaveMfNianjianJbxxService.writeToRestource(buffer);
        return "success";
    }

    public String save43(String instanceid){
        StringBuffer buffer = new StringBuffer();
        NjGwyjzSubExample exampleTo = new NjGwyjzSubExample();
        List<NjGwyjzSub> lists = oldService.selectByExample(exampleTo);
        buffer = SaveNjGwyjzSubService.saveEntity(buffer,lists);
        SaveNjGwyjzSubService.writeToRestource(buffer);
        return "success";
    }

    public String save44(String instanceid){
        StringBuffer buffer = new StringBuffer();
        NjGwyjzTbExample exampleTo = new NjGwyjzTbExample();
        List<NjGwyjzTb> lists = oldService.selectByExample(exampleTo);
        buffer = SaveNjGwyjzTbService.saveEntity(buffer,lists);
        SaveNjGwyjzTbService.writeToRestource(buffer);
        return "success";
    }

    public String save45(String instanceid){
        StringBuffer buffer = new StringBuffer();
        StNijianReport13Example exampleTo = new StNijianReport13Example();
        List<StNijianReport13> lists = oldService.selectByExample(exampleTo);
        buffer = SaveStNijianReport13Service.saveEntity(buffer,lists);
        SaveStNijianReport13Service.writeToRestource(buffer);
        return "success";
    }

    public String save46(String instanceid){
        StringBuffer buffer = new StringBuffer();
        StNjGzjhSubExample exampleTo = new StNjGzjhSubExample();
        List<StNjGzjhSub> lists = oldService.selectByExample(exampleTo);
        buffer = SaveStNjGzjhSubService.saveEntity(buffer,lists);
        SaveStNjGzjhSubService.writeToRestource(buffer);
        return "success";
    }

    public String save47(String instanceid){
        StringBuffer buffer = new StringBuffer();
        StNjQgothercase19SubExample exampleTo = new StNjQgothercase19SubExample();
        List<StNjQgothercase19Sub> lists = oldService.selectByExample(exampleTo);
        buffer = SaveStNjQgothercase19SubService.saveEntity(buffer,lists);
        SaveStNjQgothercase19SubService.writeToRestource(buffer);
        return "success";
    }

    public String save48(String instanceid){
        StringBuffer buffer = new StringBuffer();
        MjzzDictionaryExample exampleTo = new MjzzDictionaryExample();
        List<MjzzDictionary> lists = oldService.selectByExample(exampleTo);
        buffer = SaveMjzzDictionaryService.saveEntity(buffer,lists);
        SaveMjzzDictionaryService.writeToRestource(buffer);
        return "success";
    }

    public String save49(String instanceid){
        StringBuffer buffer = new StringBuffer();
        SjzdNodeExample exampleTo = new SjzdNodeExample();
        List<SjzdNode> lists = oldService.selectByExample(exampleTo);
        buffer = SaveSjzdNodeService.saveEntity(buffer,lists);
        SaveSjzdNodeService.writeToRestource(buffer);
        return "success";
    }

}
