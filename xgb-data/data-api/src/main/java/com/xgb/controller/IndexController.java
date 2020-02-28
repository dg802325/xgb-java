package com.xgb.controller;

import com.xgb.model.FormConsultationCase;
import com.xgb.model.FormConsultationCaseExample;
import com.xgb.service.OldService;
import com.xgb.util.MyTools;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class IndexController {

    @Autowired
    private OldService oldService;

    @GetMapping("/login")
    public ModelAndView Index(ModelAndView mv){

        mv.setViewName("login");
        return mv;
    }

    @GetMapping("/getContent")
    public ModelAndView getContent(ModelAndView mv,String contentName,String year){
        System.out.println(contentName);
        FormConsultationCaseExample formConsultationCaseExample = new FormConsultationCaseExample();
        FormConsultationCaseExample.Criteria criteria = formConsultationCaseExample.createCriteria();
        if(MyTools.isNotEmpty(contentName)){
            criteria.andOrgnameEqualTo(contentName);
        }
        criteria.andPropertyEEqualTo("2018");//筛选条件
        List<FormConsultationCase> formConsultationCases = oldService.selectByExample(formConsultationCaseExample);
        FormConsultationCase formConsultationCase = null;
        if(formConsultationCases.size()>0){
            formConsultationCase = formConsultationCases.get(0);
        }
        mv.addObject("formConsultationCase",formConsultationCase);
        mv.addObject("contentName",contentName);
        mv.setViewName("content");
        return mv;
    }
}
