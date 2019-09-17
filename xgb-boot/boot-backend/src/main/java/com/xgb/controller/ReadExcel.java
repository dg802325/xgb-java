package com.xgb.controller;

import com.xgb.model.*;
import com.xgb.service.SysDivistionService;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

@RestController
public class ReadExcel {

    @Autowired
    private SysDivistionService sysDivistionService;


    @GetMapping("/test")
    public String test() {
        List<SysDivistion> sysDivistionList = sysDivistionService.getSysDivistionList();
        int size1 = sysDivistionList.size();
        ReadExcel obj = new ReadExcel();
        // 此处为我创建Excel路径：E:/zhanhj/studysrc/jxl下
        File file = new File("E:\\test\\ssq.xls");
        List excelList = obj.readExcel(file);
        Iterator iterator = excelList.iterator();
        if (iterator.hasNext()) {
            String[] split = iterator.next().toString().split("|");
            int size = split.length;
            ExcelEntiy ee = new ExcelEntiy();
            ee.setId(randomUUID());
            for (int i=0;i<size;i++){
                ee.setIndustryCategory(split[0]);
            }

        }
        List<SysDivistion> list2 = new ArrayList<>();
        System.out.println("list中的数据打印出来");
        for (int i = 0; i < excelList.size(); i++) {
            List list = (List) excelList.get(i);
            SysDivistion sd = new SysDivistion();
            for (int j = 0; j < list.size(); j++) {
                if(j==0){
                    continue;
                }else if(j==1){
                    sd.setHlbDivisionCode(list.get(j).toString().substring(0,list.get(j).toString().length()-1));
                    continue;
                }else if(j==2){
                    sd.setDivisionName(list.get(j).toString().substring(0,list.get(j).toString().length()-1));
                    continue;
                }else if(j==3){
                    continue;
                }

                System.out.print(list.get(j));
            }
            list2.add(sd);
            System.out.println();
        }
        int len = 0;
        int size = list2.size();
        Iterator<SysDivistion> iterator1 = list2.iterator();
        for(int i=0;i<size;i++){
            for(SysDivistion ssd :sysDivistionList){
                if(list2.get(i).getDivisionName().equals(ssd.getDivisionName())){
                    len++;
                    ssd.setHlbDivisionCode(list2.get(i).getHlbDivisionCode());
                    sysDivistionService.update(ssd);
                    list2.remove(list2.get(i));
                    sysDivistionList.remove(ssd);
                    break;
                }
            }
        }
        System.out.println(len);


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





    @GetMapping("testsssss")
    public String testsssss(){
        SysChinaDivisionExample sysShengs = new SysChinaDivisionExample();
        sysShengs.createCriteria().andParentIdEqualTo("0");
        List<SysChinaDivision> sysShengList = sysDivistionService.selectSysByExample(sysShengs);
        sysShengList.forEach(sysSheng->{
            SysChinaDivisionExample sysShis = new SysChinaDivisionExample();
            sysShis.createCriteria().andParentIdEqualTo(sysSheng.getId());
            List<SysChinaDivision> sysShiList = sysDivistionService.selectSysByExample(sysShis);
            if(sysShiList.size()>0){
                sysShiList.forEach(sysShi->{
                    SysChinaDivisionExample sysQus = new SysChinaDivisionExample();
                    sysQus.createCriteria().andParentIdEqualTo(sysShi.getId());
                    List<SysChinaDivision> sysQuList = sysDivistionService.selectSysByExample(sysQus);
                    if(sysQuList.size()>0){
                        sysQuList.forEach(sysQu->{
                            SysChinaDivisionExample sysCuns = new SysChinaDivisionExample();
                            sysCuns.createCriteria().andParentIdEqualTo(sysQu.getId());
                            List<SysChinaDivision> sysCunList = sysDivistionService.selectSysByExample(sysCuns);
                            if(sysCunList.size()>0){
                                sysCunList.forEach(sysCun->{
                                    String divisionName = sysSheng.getDivisionName();
                                    String parentId = sysSheng.getParentId();
                                    //获得bbi省级数据
                                    BbiChinaDivisionExample bbiShengs = new BbiChinaDivisionExample();
                                    bbiShengs.createCriteria().andParentIdEqualTo(parentId).andDivisionNameEqualTo(divisionName);
                                    List<BbiChinaDivision> bbiChinaDivisions = sysDivistionService.selectBbiByExample(bbiShengs);
                                    if(bbiChinaDivisions.size()>0){
                                        //获得bbi市级数据
                                        String bbiShi = sysShi.getDivisionName();
                                        String bbiShipId = bbiChinaDivisions.get(0).getId();
                                        BbiChinaDivisionExample bbiShis = new BbiChinaDivisionExample();
                                        bbiShis.createCriteria().andParentIdEqualTo(bbiShipId).andDivisionNameEqualTo(bbiShi);
                                        List<BbiChinaDivision> bbiShiChinaDivisions = sysDivistionService.selectBbiByExample(bbiShis);
                                        if(bbiShiChinaDivisions.size()>0){
                                            //获得bbi区级数据
                                            String bbiQu = sysQu.getDivisionName();
                                            String bbiQupId = bbiShiChinaDivisions.get(0).getId();
                                            BbiChinaDivisionExample bbiQus = new BbiChinaDivisionExample();
                                            bbiQus.createCriteria().andParentIdEqualTo(bbiQupId).andDivisionNameEqualTo(bbiQu);
                                            List<BbiChinaDivision> bbiQuChinaDivisions = sysDivistionService.selectBbiByExample(bbiQus);
                                            if(bbiQuChinaDivisions.size()>0){
                                                //获得bbi村级数据
                                                String bbiCun = sysCun.getDivisionName();
                                                String bbiCunpId = bbiQuChinaDivisions.get(0).getId();
                                                BbiChinaDivisionExample bbiCuns = new BbiChinaDivisionExample();
                                                bbiCuns.createCriteria().andParentIdEqualTo(bbiCunpId).andDivisionNameEqualTo(bbiCun);
                                                List<BbiChinaDivision> bbiCunChinaDivisions = sysDivistionService.selectBbiByExample(bbiCuns);
                                                if(bbiCunChinaDivisions.size()>0){
                                                    SysChinaDivisionExample ss = new SysChinaDivisionExample();
                                                    ss.createCriteria().andIdEqualTo(sysCun.getId());
                                                    sysCun.setId(bbiCunChinaDivisions.get(0).getId());
                                                    sysCun.setParentId(bbiQuChinaDivisions.get(0).getId());
                                                    sysDivistionService.updateSysChinaDivision(sysCun,ss);
                                                    System.out.println("更新村--" + sysCun.getDivisionName() + "id成功");
                                                }
                                            }else {
                                                SysChinaDivisionExample ss = new SysChinaDivisionExample();
                                                ss.createCriteria().andIdEqualTo(sysCun.getId());
                                                sysCun.setParentId(bbiQupId);
                                                sysDivistionService.updateSysChinaDivision(sysCun,ss);
                                                System.out.println("设置村--" + sysCun.getDivisionName() + "id成功");
                                            }
                                        }
                                    }
                                });
                            }
                            String divisionName = sysSheng.getDivisionName();
                            String parentId = sysSheng.getParentId();
                            //获得bbi省级数据
                            BbiChinaDivisionExample bbiShengs = new BbiChinaDivisionExample();
                            bbiShengs.createCriteria().andParentIdEqualTo(parentId).andDivisionNameEqualTo(divisionName);
                            List<BbiChinaDivision> bbiChinaDivisions = sysDivistionService.selectBbiByExample(bbiShengs);
                            if(bbiChinaDivisions.size()>0){
                                //获得bbi市级数据
                                String bbiShi = sysShi.getDivisionName();
                                String bbiShipId = bbiChinaDivisions.get(0).getId();
                                BbiChinaDivisionExample bbiShis = new BbiChinaDivisionExample();
                                bbiShis.createCriteria().andParentIdEqualTo(bbiShipId).andDivisionNameEqualTo(bbiShi);
                                List<BbiChinaDivision> bbiShiChinaDivisions = sysDivistionService.selectBbiByExample(bbiShis);
                                if(bbiShiChinaDivisions.size()>0){
                                    //获得bbi区级数据
                                    String bbiQu = sysQu.getDivisionName();
                                    String bbiQupId = bbiShiChinaDivisions.get(0).getId();
                                    BbiChinaDivisionExample bbiQus = new BbiChinaDivisionExample();
                                    bbiQus.createCriteria().andParentIdEqualTo(bbiQupId).andDivisionNameEqualTo(bbiQu);
                                    List<BbiChinaDivision> bbiQuChinaDivisions = sysDivistionService.selectBbiByExample(bbiQus);
                                    if(bbiQuChinaDivisions.size()>0){
                                        SysChinaDivisionExample ss = new SysChinaDivisionExample();
                                        ss.createCriteria().andIdEqualTo(sysQu.getId());
                                        sysQu.setId(bbiQuChinaDivisions.get(0).getId());
                                        sysQu.setParentId(bbiShiChinaDivisions.get(0).getId());
                                        sysDivistionService.updateSysChinaDivision(sysQu,ss);
                                        System.out.println("更新区--" + sysQu.getDivisionName() + "id成功");
                                    }
                                }
                            }
                        });

                    }
                    String divisionName = sysSheng.getDivisionName();
                    String parentId = sysSheng.getParentId();
                    //获得bbi省级数据
                    BbiChinaDivisionExample bbiShengs = new BbiChinaDivisionExample();
                    bbiShengs.createCriteria().andParentIdEqualTo(parentId).andDivisionNameEqualTo(divisionName);
                    List<BbiChinaDivision> bbiChinaDivisions = sysDivistionService.selectBbiByExample(bbiShengs);
                    if(bbiChinaDivisions.size()>0){
                        //获得bbi市级数据
                        String bbiShi = sysShi.getDivisionName();
                        String bbiShipId = bbiChinaDivisions.get(0).getId();
                        BbiChinaDivisionExample bbiShis = new BbiChinaDivisionExample();
                        bbiShis.createCriteria().andParentIdEqualTo(bbiShipId).andDivisionNameEqualTo(bbiShi);
                        List<BbiChinaDivision> bbiShiChinaDivisions = sysDivistionService.selectBbiByExample(bbiShis);
                        if(bbiShiChinaDivisions.size()>0){
                            SysChinaDivisionExample ss = new SysChinaDivisionExample();
                            ss.createCriteria().andIdEqualTo(sysShi.getId());
                            sysShi.setId(bbiShiChinaDivisions.get(0).getId());
                            sysShi.setParentId(bbiChinaDivisions.get(0).getId());
                            sysDivistionService.updateSysChinaDivision(sysShi,ss);
                            System.out.println("更新市--" + sysShi.getDivisionName() + "id成功");
                        }
                    }
                });
            }
            String divisionName = sysSheng.getDivisionName();
            String parentId = sysSheng.getParentId();
            BbiChinaDivisionExample bbiShengs = new BbiChinaDivisionExample();
            bbiShengs.createCriteria().andParentIdEqualTo(parentId).andDivisionNameEqualTo(divisionName);
            List<BbiChinaDivision> bbiChinaDivisions = sysDivistionService.selectBbiByExample(bbiShengs);
            if(bbiChinaDivisions.size()>0){
                SysChinaDivisionExample ss = new SysChinaDivisionExample();
                ss.createCriteria().andIdEqualTo(sysSheng.getId());
                String id = bbiChinaDivisions.get(0).getId();
                sysSheng.setId(id);
                sysDivistionService.updateSysChinaDivision(sysSheng,ss);
                System.out.println("更新省--" + sysSheng.getDivisionName() + "id成功");
            }

        });
        return null;
    }




}
