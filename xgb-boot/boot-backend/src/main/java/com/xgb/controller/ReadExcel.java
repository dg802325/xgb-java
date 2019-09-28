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
//        int len = 0;
//        int size = list2.size();
//        System.out.println(len);
//        for (SysChinaDivision sysChinaDivision : list2) {
//            if(sysChinaDivision.getDivisionType().equals("0")){
//                sysChinaDivision.setId(UUIDUtils.getUUID());
//                sysChinaDivision.setParentId("0");
//                sysChinaDivision.setStatus("0");
////                sysDivistionService.insert(sysChinaDivision);
//                //440000000000
//                for (SysChinaDivision sysChinaDivision2 : list2) {
//                    if(sysChinaDivision2.getDivisionType().equals("1")){
//                        String substring = sysChinaDivision.getDivisionCode().substring(0, 2);
//                        String substring1 = sysChinaDivision2.getDivisionCode().substring(0, 2);
//                        String substring2 = sysChinaDivision2.getDivisionCode().substring(4, 12);
//                        if(substring.equals(substring1)&&substring2.equals("00000000")){
//                            sysChinaDivision2.setId(UUIDUtils.getUUID());
//                            sysChinaDivision2.setParentId(sysChinaDivision.getId());
//                            sysChinaDivision2.setStatus("0");
////                            sysDivistionService.insert(sysChinaDivision2);
//                            for (SysChinaDivision sysChinaDivision3 : list2) {
//                                if(sysChinaDivision3.getDivisionType().equals("2")){
//                                    String substring10 = sysChinaDivision2.getDivisionCode().substring(0, 4);
//                                    String substring11 = sysChinaDivision3.getDivisionCode().substring(0, 4);
//                                    String substring12 = sysChinaDivision3.getDivisionCode().substring(6, 12);
//                                    if(substring10.equals(substring11)&&substring12.equals("000000")){
//                                        sysChinaDivision3.setId(UUIDUtils.getUUID());
//                                        sysChinaDivision3.setParentId(sysChinaDivision.getId());
//                                        sysChinaDivision3.setStatus("0");
////                                        sysDivistionService.insert(sysChinaDivision3);
//                                        for (SysChinaDivision sysChinaDivision4 : list2) {
//                                            if(sysChinaDivision4.getDivisionType().equals("3")){
//                                                String substring20 = sysChinaDivision3.getDivisionCode().substring(0, 6);
//                                                String substring21 = sysChinaDivision4.getDivisionCode().substring(0, 6);
//                                                String substring22 = sysChinaDivision4.getDivisionCode().substring(9, 12);
//                                                if(substring20.equals(substring21)&&substring22.equals("000")){
//                                                    sysChinaDivision4.setId(UUIDUtils.getUUID());
//                                                    sysChinaDivision4.setParentId(sysChinaDivision.getId());
//                                                    sysChinaDivision4.setStatus("0");
////                                                    sysDivistionService.insert(sysChinaDivision4);
//                                                }
//                                            }
//                                        }
//                                    }
//                                }
//                            }
//                        }
//                    }
//                }
//            }
//        }


        SysChinaDivisionExample sysChinaDivisionExample = new SysChinaDivisionExample();
        sysChinaDivisionExample.createCriteria().andParentIdEqualTo("0");
        List<SysChinaDivision> sysChinaDivisions = sysChinaDivistionService.selectSysByExample(sysChinaDivisionExample);
        sysChinaDivisions.forEach(item->{
            item.setDivisionType("0");
            sysChinaDivistionService.update(item);
            SysChinaDivisionExample sysChinaDivisionExample1 = new SysChinaDivisionExample();
            sysChinaDivisionExample1.createCriteria().andParentIdEqualTo(item.getId());
            List<SysChinaDivision> sysChinaDivisions1 = sysChinaDivistionService.selectSysByExample(sysChinaDivisionExample1);
            sysChinaDivisions1.forEach(item1->{
                item1.setDivisionType("1");
                sysChinaDivistionService.update(item1);
                SysChinaDivisionExample sysChinaDivisionExample2 = new SysChinaDivisionExample();
                sysChinaDivisionExample2.createCriteria().andParentIdEqualTo(item1.getId());
                List<SysChinaDivision> sysChinaDivisions2 = sysChinaDivistionService.selectSysByExample(sysChinaDivisionExample2);
                sysChinaDivisions2.forEach(item2->{
                    item2.setDivisionType("2");
                    sysChinaDivistionService.update(item2);
                    SysChinaDivisionExample sysChinaDivisionExample3 = new SysChinaDivisionExample();
                    sysChinaDivisionExample3.createCriteria().andParentIdEqualTo(item2.getId());
                    List<SysChinaDivision> sysChinaDivisions3 = sysChinaDivistionService.selectSysByExample(sysChinaDivisionExample3);
                    sysChinaDivisions3.forEach(item3->{
                        item3.setDivisionType("3");
                        sysChinaDivistionService.update(item3);
                    });
                });
            });
        });
        System.out.println("成功");
        return "success";
    }

    // 去读Excel的方法readExcel，该方法的入口参数为一个File对象
    public List readExcel(File file) {
        try {
            // 创建输入流，读取Excel
            InputStream is = new FileInputStream(file.getAbsolutePath());
            // jxl提供的Workbook类
            Workbook wb = Workbook.getWorkbook(is);
            // Excel的页签数量
            int sheet_size = wb.getNumberOfSheets();
            for (int index = 0; index < sheet_size; index++) {
                List<List> outerList=new ArrayList<List>();
                // 每个页签创建一个Sheet对象
                Sheet sheet = wb.getSheet(index);
                int rows = sheet.getRows();//返回该页的总行数
                for (int i = 0; i < rows; i++) {
                    List innerList=new ArrayList();
                    int columns = sheet.getColumns();//返回总列数
                    for (int j = 0; j < columns; j++) {
                        String cellinfo = sheet.getCell(j, i).getContents();
                        if(cellinfo.isEmpty()){
                            continue;
                        }
                        if(j==columns-1){
                            innerList.add(cellinfo);
                            continue;
                        }
                        innerList.add(cellinfo+"|");
                    }
                    outerList.add(i, innerList);
                    System.out.println();
                }
                return outerList;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (BiffException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }


    public static String randomUUID() {
        UUID uuid = UUID.randomUUID();
        return uuid.toString().replace("-", "").toUpperCase();
    }

}
