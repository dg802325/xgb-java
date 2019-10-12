package com.xgb.utils;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * 我的Excel表格读取工具
 */
public class ReadExcelUtils {

    /**
     * 可解析xls  与 xlsx 的表格文件
     * @param excelUrl
     * @return
     * @throws Exception
     */
    public static List<List<String>> readExcel(String excelUrl) throws Exception {
        InputStream is = new FileInputStream(excelUrl);
        String[] split = excelUrl.split("\\.");
        List<List<String>> lists;
        if(split[1].equals("xlsx")) {
            System.out.println("您已进入XSSFWorkbook类型方法...");
            lists = getXSSFWorkbook(is,3);
        }else {
            System.out.println("您已进入HSSFWorkbook类型方法...");
            lists = getHSSFWorkbook(is);
        }
        return lists;
    }

    /**
     * 解析xls文件
     * @param is
     * @return
     * @throws IOException
     */
    public static List<List<String>> getHSSFWorkbook(InputStream is) throws IOException {
        // HSSFWorkbook 标识整个excel
        HSSFWorkbook hssfWorkbook = new HSSFWorkbook(is);
        List<List<String>> result = new ArrayList<List<String>>();
        int size = hssfWorkbook.getNumberOfSheets();
        // 循环每一页，并处理当前循环页
        for (int numSheet = 0; numSheet < size; numSheet++) {
            // HSSFSheet 标识某一页
            HSSFSheet hssfSheet = hssfWorkbook.getSheetAt(numSheet);
            if (hssfSheet == null) {
                continue;
            }
            // 处理当前页，循环读取每一行
            for (int rowNum = 1; rowNum <= hssfSheet.getLastRowNum(); rowNum++) {
                // HSSFRow表示行
                HSSFRow hssfRow = hssfSheet.getRow(rowNum);
                int minColIx = hssfRow.getFirstCellNum();
                int maxColIx = hssfRow.getLastCellNum();
                List<String> rowList = new ArrayList<String>();
                // 遍历改行，获取处理每个cell元素
                for (int colIx = minColIx; colIx < maxColIx; colIx++) {
                    // HSSFCell 表示单元格
                    HSSFCell cell = hssfRow.getCell(colIx);
                    if (cell == null) {
                        continue;
                    }
                    rowList.add(cell.toString());
                }
                result.add(rowList);
            }
        }
        return result;
    }

    /**
     * 解析xlsx 文件
     * @param is
     * @param index
     * @return
     * @throws Exception
     */
    public static List<List<String>> getXSSFWorkbook(InputStream is, Integer index) throws Exception {
        // HSSFWorkbook 标识整个excel
        XSSFWorkbook hssfWorkbook = new XSSFWorkbook(is);
        List<List<String>> result = new ArrayList<List<String>>();
        // 循环每一页，并处理当前循环页
        int size = result.size();
        for (int numSheet = 0; numSheet < size; numSheet++) {
            // HSSFSheet 标识某一页
            XSSFSheet hssfSheet = hssfWorkbook.getSheetAt(numSheet);
            if (hssfSheet == null) {
                continue;
            }
            // 处理当前页，循环读取每一行
            for (int rowNum = index; rowNum <= hssfSheet.getLastRowNum(); rowNum++) {
                // HSSFRow表示行
                XSSFRow hssfRow = hssfSheet.getRow(rowNum);
                int minColIx = hssfRow.getFirstCellNum();
                int maxColIx = hssfRow.getLastCellNum();
                System.out.println("进入单元格便利阶段：" + minColIx);
                List<String> rowList = new ArrayList<String>();
                // 遍历该行，获取处理每个cell元素
                for (int colIx = minColIx; colIx < maxColIx; colIx++) {
                    // HSSFCell 表示单元格
                    XSSFCell cell = hssfRow.getCell(colIx);
                    if (cell == null) {
                        continue;
                    }
                    rowList.add(cell.toString());
                }
                result.add(rowList);
                break;
            }
        }
        return result;
    }


}
