package com.xgb.main;

import com.xgb.model.Shzz;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class updateshzzSql2 {

    public static void main(String[] args) {
        String file = "E:\\work\\文档\\jhsql.xlsx";
        List<Shzz> shzzes = new ArrayList<>();
        try {
            shzzes = getExcelResourceList(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        getSql(shzzes);
//        System.out.println(shzzes);
    }

    public static void getSql(List<Shzz> shzzes){
        StringBuffer sbf = null;
        for (Shzz shzz : shzzes) {
            sbf = new StringBuffer();
            sbf.append("update jc_shzz_detail set zgmc = '").append(shzz.getZgmc()).append("' where zgmc = '").append(shzz.getName()).append("';");
            System.out.println(sbf.toString());
        }
    }


    public static List<Shzz> getExcelResourceList(String excelUrl) throws IOException {
        List<Shzz> list = new ArrayList<Shzz>();
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
                Shzz jj = new Shzz();
                jj.setId(j+"");
                jj.setName(row.getCell(0).getStringCellValue());
                jj.setZgmc(row.getCell(1).getStringCellValue());
                list.add(jj);
            }
        }
        return list;
    }










}
