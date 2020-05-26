package com.xgb.main;

import com.xgb.common.GbaseUtils;
import com.xgb.model.Shzz;
import com.xgb.util.MyTools;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

public class ZgdwDuiBi {

    public static void main(String[] args) {
        String oldfile = "E:\\work\\readExcel\\shjcj.xlsx";
        String newfile = "E:\\work\\readExcel\\shjcmf.xlsx";
        List<Shzz> oldShzzes = new ArrayList<>();
        List<Shzz> newShzzes = new ArrayList<>();
        List<Shzz> codeShzzes = new ArrayList<>();
        try {
            oldShzzes = getExcelResourceList(oldfile);
            newShzzes = getExcelResourceList(newfile);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(oldShzzes);
        System.out.println(newShzzes);
        for (Shzz oldShzz : oldShzzes) {
            Shzz shzz = newShzzes.stream().filter(o -> o.getZgmc().equals(oldShzz.getZgmc()) && !o.getNewZgmc().equals(oldShzz.getNewZgmc())).findFirst().orElse(null);
            if(MyTools.isNotEmpty(shzz)){
                Shzz code = new Shzz();
                code.setId(oldShzz.getZgmc());
                code.setName(oldShzz.getNewZgmc());
                code.setZgmc(shzz.getZgmc());
                code.setNewZgmc(shzz.getNewZgmc());
                codeShzzes.add(code);
            }
        }
        StringBuffer sbf = new StringBuffer();
        for (Shzz codeShzz : codeShzzes) {
            sbf.append("update jc_shzz_detail set zgmc = '").append(codeShzz.getNewZgmc()).append("' where title = '").append(codeShzz.getId()).append("';\n");
        }
        System.out.println(sbf.toString());
        System.out.println("执行完成");
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
                jj.setZgmc(row.getCell(0).getStringCellValue());
                jj.setNewZgmc(row.getCell(1).getStringCellValue());
                list.add(jj);
            }
        }
        return list;
    }
}
