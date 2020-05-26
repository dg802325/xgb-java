package com.xgb.main;

import com.xgb.model.Shzz;
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

public class sssssssssssss {

    public static void main(String[] args) {
        String oldfile = "E:\\work\\文档\\t1.xlsx";
        String newfile = "E:\\work\\文档\\t2.xlsx";
        List<String> str1 = new ArrayList<>();
        List<String> str2 = new ArrayList<>();
        List<String> str3 = new ArrayList<>();
        List<String> str4 = new ArrayList<>();
        try {
            str1 = getExcelResourceList(oldfile);
            str2 = getExcelResourceList(newfile);
        } catch (IOException e) {
            e.printStackTrace();
        }

        for(String s:str2){
            boolean contains = str1.contains(s);
            if(!contains){
                str3.add(s);
            }else{
                str4.add(s);
            }
        }
//        System.out.println(str1);
//        System.out.println(str2);
//        System.out.println(str3);
//        System.out.println(str4);
        StringBuffer str = new StringBuffer();
        for(String s : str3){
            str = new StringBuffer();
            str.append("CREATE SEQUENCE ").append(s).append("\n");
            str.append("INCREMENT BY 1").append("\n");
            str.append("START WITH 1").append("\n");
            str.append("NOMAXvalue").append("\n");
            str.append("NOCYCLE").append("\n");
            str.append("NOCACHE;").append("\n");
            str.append("\n");
            System.out.println(str.toString());
        }
//        for (Shzz oldShzz : oldShzzes) {
//            Shzz shzz = newShzzes.stream().filter(o -> o.getZgmc().equals(oldShzz.getZgmc()) && !o.getNewZgmc().equals(oldShzz.getNewZgmc())).findFirst().orElse(null);
//            if(MyTools.isNotEmpty(shzz)){
//                Shzz code = new Shzz();
//                code.setId(oldShzz.getZgmc());
//                code.setName(oldShzz.getNewZgmc());
//                code.setZgmc(shzz.getZgmc());
//                code.setNewZgmc(shzz.getNewZgmc());
//                codeShzzes.add(code);
//            }
//        }
//        StringBuffer sbf = new StringBuffer();
//        for (Shzz codeShzz : codeShzzes) {
//            sbf.append("update jc_shzz_detail set zgmc = '").append(codeShzz.getNewZgmc()).append("' where title = '").append(codeShzz.getId()).append("';\n");
//        }
//        System.out.println(sbf.toString());
        System.out.println("执行完成");
    }

    public static List<String> getExcelResourceList(String excelUrl) throws IOException {
        List<String> list = new ArrayList<String>();
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
                list.add(row.getCell(0).getStringCellValue().toUpperCase());
            }
        }
        return list;
    }
}
