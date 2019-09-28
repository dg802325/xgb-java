package com.xgb.controller;

import com.xgb.lang.DateUtils;
import com.xgb.model.*;
import com.xgb.service.SysChinaDivistionService;
import com.xgb.utils.UUIDUtils;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.*;
import java.util.*;

@RestController
public class ReadExcel {

    @Autowired
    private SysChinaDivistionService sysChinaDivistionService;


    @GetMapping("/test")
    public String test() {
////        List<SysDivistion> sysDivistionList = sysDivistionService.getSysDivistionList();
////        int size1 = sysDivistionList.size();
//        ReadExcel obj = new ReadExcel();
//        // 此处为我创建Excel路径：E:/zhanhj/studysrc/jxl下
//        File file = new File("E:\\test\\ssq.xls");
//        List excelList = obj.readExcel(file);
//        Iterator iterator = excelList.iterator();
//        if (iterator.hasNext()) {
//            String[] split = iterator.next().toString().split("|");
//            int size = split.length;
//            ExcelEntiy ee = new ExcelEntiy();
//            ee.setId(randomUUID());
//            for (int i=0;i<size;i++){
//                ee.setIndustryCategory(split[0]);
//            }
//
//        }
//        List<SysChinaDivision> list2 = new ArrayList<>();
//        System.out.println("list中的数据打印出来");
//        for (int i = 0; i < excelList.size(); i++) {
//            List list = (List) excelList.get(i);
//            SysChinaDivision sd = new SysChinaDivision();
//            for (int j = 0; j < list.size(); j++) {
//                if(j==0){
//                    String substring = list.get(j).toString().substring(0, list.get(j).toString().length() - 1);
//                    if(substring.equals("省")){
//                        sd.setDivisionType("0");
//                    }else if(substring.equals("市")){
//                        sd.setDivisionType("1");
//                    }else if(substring.equals("区")){
//                        sd.setDivisionType("2");
//                    }else if(substring.equals("乡")){
//                        sd.setDivisionType("3");
//                    }
//                    continue;
//                }else if(j==1){
//                    sd.setHlbDivisionCode(list.get(j).toString().substring(0,list.get(j).toString().length()-1));
//                    continue;
//                }else if(j==2){
//                    sd.setDivisionName(list.get(j).toString().substring(0,list.get(j).toString().length()-1));
//                    continue;
//                }else if(j==3){
//                    continue;
//                }
//                System.out.print(list.get(j));
//            }
//            list2.add(sd);
//            System.out.println();
//        }
//
return null;
    }

}
