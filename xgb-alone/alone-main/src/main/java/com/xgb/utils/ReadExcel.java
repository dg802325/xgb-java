package com.xgb.utils;

import com.xgb.model.ContentAttrModel;
import com.xgb.util.MyTools;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadExcel {

    public static List<ContentAttrModel> getExcelResourceList(String excelUrl) throws IOException {
        List<ContentAttrModel> list = new ArrayList<ContentAttrModel>();
        //创建Excel，读取文件内容
        Workbook workbook = null;
        try {
            workbook = WorkbookFactory.create(new FileInputStream(excelUrl));
        } catch (InvalidFormatException e) {
            e.printStackTrace();
        }
        //两种方式读取工作表
//         Sheet sheet=workbook.getSheet("Sheet0");
        Sheet sheet=workbook.getSheetAt(0);
        //获取sheet中最后一行行号
        int lastRowNum=sheet.getLastRowNum();
        for (int i=0;i<=lastRowNum;i++){
            Row row=sheet.getRow(i);
            //获取当前行最后单元格列号ot
            int lastCellNum=row.getLastCellNum();
            for (int j=0;j<lastCellNum;j=j+lastCellNum){
                ContentAttrModel cam = new ContentAttrModel();

                if(MyTools.isNotEmpty(row.getCell(2))&&MyTools.isNotEmpty(row.getCell(2).getStringCellValue())&&!"null".equals(row.getCell(2).getStringCellValue())){
                    cam.setName(row.getCell(0).getStringCellValue());
                    cam.setKey(row.getCell(1).getStringCellValue());
                    cam.setValue(row.getCell(2).getStringCellValue());
                    list.add(cam);
                }
            }
            System.out.println();
        }
        return list;
    }
}
