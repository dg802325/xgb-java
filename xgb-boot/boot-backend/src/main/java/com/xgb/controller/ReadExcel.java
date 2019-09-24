package com.xgb.controller;

import com.xgb.lang.DateUtils;
import com.xgb.model.*;
import com.xgb.service.SysDivistionService;
import com.xgb.utils.UUIDUtils;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.*;
import java.util.*;
import java.util.function.Supplier;

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
        String[] sheng = {"安徽省","湖北省","重庆市","福建省","黑龙江省","湖南省","四川省","宁夏回族自治区","贵州省","山东省","浙江省","河南省","陕西省","吉林省","江西省","内蒙古自治区","云南省"};
//        String[] sheng = {"天津市"};
        List<String> tongji = new ArrayList<>();
        for(String ss : sheng){
            List<BbiChinaDivision> bbi1 = getBbi(ss);
            List<SysChinaDivision> sys = getSys(ss);
            int len = 0;
            for (BbiChinaDivision bbiChinaDivision : bbi1) {
                for (SysChinaDivision sysChinaDivision : sys) {
                    if (bbiChinaDivision.getDivisionCode().equals(sysChinaDivision.getDivisionCode().substring(0,6))) {
                        BbiChinaDivision bbi = new BbiChinaDivision();
                        bbi.setId(UUIDUtils.getUUID());
                        bbi.setDivisionCode(sysChinaDivision.getDivisionCode());
                        bbi.setCreateTime(DateUtils.getNowDate());
                        bbi.setDivisionName(sysChinaDivision.getDivisionName());
                        bbi.setParentId(bbiChinaDivision.getId());
                        int insert = sysDivistionService.insert(bbi);
                        len++;
                    }
                }
            }
            System.out.println(ss+"缺少：" + len);
            tongji.add(ss+"缺少：" + len);
        }
        tongji.forEach(item->{
            System.out.println(item);
        });
        return null;
    }

    public List<BbiChinaDivision> getBbi(String sheng){

        List<BbiChinaDivision> bshengs = new ArrayList<>();
        List<BbiChinaDivision> bshis = new ArrayList<>();
        List<BbiChinaDivision> bqus = new ArrayList<>();
        List<BbiChinaDivision> bzs = new ArrayList<>();
        int bs= 0;
        int bh = 0;
        int bq = 0;
        int bz = 0;
        BbiChinaDivisionExample bChinaDivisionExample = new BbiChinaDivisionExample();
        bChinaDivisionExample.createCriteria().andParentIdEqualTo("0").andDivisionNameEqualTo(sheng);
        List<BbiChinaDivision> bChinaDivisions = sysDivistionService.selectBbiByExample(bChinaDivisionExample);
        for (BbiChinaDivision scd : bChinaDivisions){
            bs++;
            bshengs.add(scd);
            BbiChinaDivisionExample hChinaDivisionExample = new BbiChinaDivisionExample();
            hChinaDivisionExample.createCriteria().andParentIdEqualTo(scd.getId());
            List<BbiChinaDivision> hChinaDivisions = sysDivistionService.selectBbiByExample(hChinaDivisionExample);
            for (BbiChinaDivision hcd : hChinaDivisions){
                bh++;
                bshis.add(hcd);
                BbiChinaDivisionExample qChinaDivisionExample = new BbiChinaDivisionExample();
                qChinaDivisionExample.createCriteria().andParentIdEqualTo(hcd.getId());
                List<BbiChinaDivision> qChinaDivisions = sysDivistionService.selectBbiByExample(qChinaDivisionExample);
                for (BbiChinaDivision qcd : qChinaDivisions){
                    bq++;
                    bqus.add(qcd);
                    BbiChinaDivisionExample zChinaDivisionExample = new BbiChinaDivisionExample();
                    zChinaDivisionExample.createCriteria().andParentIdEqualTo(qcd.getId());
                    List<BbiChinaDivision> zChinaDivisions = sysDivistionService.selectBbiByExample(zChinaDivisionExample);
                    for (BbiChinaDivision zcd : zChinaDivisions){
                        bz++;
                        bzs.add(zcd);
                    }
                }
            }
        }
        System.out.println("--------------sys---------------------");
        System.out.println(bs);
        System.out.println(bh);
        System.out.println(bq);
        System.out.println(bz);
        System.out.println(bshengs);
        System.out.println(bshis);
        System.out.println(bqus);
        System.out.println(bzs);
        return bqus;
    }

    public List<SysChinaDivision> getSys(String sheng){
        List<SysChinaDivision> sshengs = new ArrayList<>();
        List<SysChinaDivision> sshis = new ArrayList<>();
        List<SysChinaDivision> squs = new ArrayList<>();
        List<SysChinaDivision> szs = new ArrayList<>();
        int ss= 0;
        int sh = 0;
        int sq = 0;
        int sz = 0;
        SysChinaDivisionExample sChinaDivisionExample = new SysChinaDivisionExample();
        sChinaDivisionExample.createCriteria().andParentIdEqualTo("0").andDivisionNameEqualTo(sheng);
        List<SysChinaDivision> sChinaDivisions = sysDivistionService.selectSysByExample(sChinaDivisionExample);
        for (SysChinaDivision scd : sChinaDivisions){
            ss++;
            sshengs.add(scd);
            SysChinaDivisionExample hChinaDivisionExample = new SysChinaDivisionExample();
            hChinaDivisionExample.createCriteria().andParentIdEqualTo(scd.getId());
            List<SysChinaDivision> hChinaDivisions = sysDivistionService.selectSysByExample(hChinaDivisionExample);
            for (SysChinaDivision hcd : hChinaDivisions){
                sh++;
                sshis.add(hcd);
                SysChinaDivisionExample qChinaDivisionExample = new SysChinaDivisionExample();
                qChinaDivisionExample.createCriteria().andParentIdEqualTo(hcd.getId());
                List<SysChinaDivision> qChinaDivisions = sysDivistionService.selectSysByExample(qChinaDivisionExample);
                for (SysChinaDivision qcd : qChinaDivisions){
                    sq++;
                    squs.add(qcd);
                    SysChinaDivisionExample zChinaDivisionExample = new SysChinaDivisionExample();
                    zChinaDivisionExample.createCriteria().andParentIdEqualTo(qcd.getId());
                    List<SysChinaDivision> zChinaDivisions = sysDivistionService.selectSysByExample(zChinaDivisionExample);
                    for (SysChinaDivision zcd : zChinaDivisions){
                        sz++;
                        szs.add(zcd);
                    }
                }
            }
        }
        System.out.println("--------------sys---------------------");
        System.out.println(ss);
        System.out.println(sh);
        System.out.println(sq);
        System.out.println(sz);
        System.out.println(sshengs);
        System.out.println(sshis);
        System.out.println(squs);
        System.out.println(szs);
        return szs;
    }

}
