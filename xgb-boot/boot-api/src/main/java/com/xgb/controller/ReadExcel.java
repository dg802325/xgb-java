package com.xgb.controller;

import com.xgb.model.ChinaBankCode;
import com.xgb.service.ChinaBankCodeService;
import com.xgb.util.DateUtils;
import com.xgb.util.UUIDUtils;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class ReadExcel {

    @Autowired
    private ChinaBankCodeService chinaBankCodeService;

    @GetMapping("/test")
    public String test() {
        ReadExcel obj = new ReadExcel();
        // 此处为我创建Excel路径：E:/zhanhj/studysrc/jxl下
        File file = new File("E:\\test\\FCF65200.xls");
        List excelList = obj.readExcel(file);
        List<Map<String,Object>> lists = new ArrayList<>();
        for (Object o : excelList) {
            Map<String,Object> map = new HashMap<>();
            String s = o.toString();
            String[] split = s.split(",");
            String s1 = split[0].toString();
            s1 = s1.substring(1, s1.length()-1);
            ChinaBankCode chinaBankCode = new ChinaBankCode();
            map.put("index",s1);
            chinaBankCode.setId(UUIDUtils.getUUID());
            String s2 = split[1].toString();
            s2 = s2.substring(1, s2.length()-1);
            map.put("CODE",s2);
            chinaBankCode.setBankCode(s2);
            String s3 = split[2].toString();
            s3 = s3.substring(1, s3.length()-2);
            map.put("NAME",s3);
            chinaBankCode.setBankName(s3);
            chinaBankCode.setStatus("0");
            chinaBankCode.setCreateId("1");
            chinaBankCode.setCreateTime(DateUtils.getNowDate());
            chinaBankCode.setIsDel("0");
            chinaBankCodeService.insert(chinaBankCode);
            lists.add(map);
        }
        System.out.println(lists);
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

}
