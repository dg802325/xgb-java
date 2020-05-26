package com.xgb.utils;

import com.xgb.model.ContentAttrModel;
import com.xgb.model.jojc;
import com.xgb.util.MyTools;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadExcel3 {

    public static List<jojc> getExcelResourceList(String excelUrl) throws IOException {
        List<jojc> list = new ArrayList<jojc>();
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
                jojc jj = new jojc();
                jj.setId(row.getCell(0).getStringCellValue());
                jj.setOldName(row.getCell(1).getStringCellValue());
                jj.setNewName(row.getCell(2).getStringCellValue());
                list.add(jj);
            }
            System.out.println();
        }
        return list;
    }
}
