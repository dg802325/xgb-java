package com.xgb.utils;


import org.apache.commons.io.FilenameUtils;
import org.apache.poi.hssf.usermodel.HSSFDataFormat;
import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public final class XLSUtils {
	
	/**index模式，以index为主键**/
	public static final int DATA_MODE_INDEX = 0;
	
	/**名称模式，以名称为主键**/
	public static final int DATA_MODE_NAME = 1;
	
	/**从下标为几的行数开始读取数据 默认为1,即第二行**/
	private int startLine;
	
	/**返回数据模式.**/
	private int dataMode;

	public XLSUtils(){
		this.startLine = 1;
		dataMode = DATA_MODE_INDEX;
	}
	
	public List<Map<String, String>> getXLSData(File file) throws Exception {
		return getXLSData(new FileInputStream(file), file.getName());
	}
	
	public List<Map<String, String>> getXLSData(InputStream inputStream, String fileName) throws Exception {
		List<Map<String, String>> retList = new ArrayList<Map<String,String>>();
		Workbook  xlsWorkbook=null;
		String extension = FilenameUtils.getExtension(fileName);
		
		if (FilenameUtils.equals("xls", extension)) {
			
			xlsWorkbook = new HSSFWorkbook(inputStream);
		} else if (FilenameUtils.equals("xlsx", extension)) {
			
			xlsWorkbook = new XSSFWorkbook(inputStream);
		} else {
			throw new RuntimeException("不支持的解析类型！");
		}
		Sheet xlsSheet = xlsWorkbook.getSheetAt(0);
		
		Row firstRow =  xlsSheet.getRow(0);
		if (firstRow == null) {
			throw new RuntimeException("没有表头行！");
		}
		short cellNum = firstRow.getLastCellNum();

		Map<String, String> headMap = new HashMap<String, String>();
		//获取表头的map
		if (dataMode == DATA_MODE_NAME) {
			for (int i = 0; i < cellNum; i++) {
				headMap.put(String.valueOf(i), getCellValue(firstRow.getCell(i)));
			}
		}
		
		//System.out.println("cellNum====>>" + cellNum);
		if(xlsSheet != null){
			for(int i = startLine; i <= xlsSheet.getLastRowNum(); i++){ // 注意lastrownum 从0开始计数
				Row row = xlsSheet.getRow(i);
				if (row != null) {
					Map<String, String> recordMap = new HashMap<String, String>();
					int emptyNum = 0;
					for (int j = 0; j < cellNum; j++) {
						Cell cell = row.getCell(j);
						String value = getCellValue(cell);
						if (value == null || value.equals("")) {
							emptyNum++;
						}
						if (dataMode == DATA_MODE_NAME) {
							recordMap.put(headMap.get(String.valueOf(j)), value);
						} else {
							recordMap.put(String.valueOf(j), value);
						}
					}
					
					if (emptyNum != cellNum) {
						retList.add(recordMap);
					}

				}
			}
		}
		return retList;
	}
	
	public List<String> getXls2Txt(InputStream inputStream, String fileName) throws Exception {
		List<String> retList = new ArrayList<String>();
		Workbook  xlsWorkbook=null;
		String extension = FilenameUtils.getExtension(fileName);
		
		if (FilenameUtils.equals("xls", extension)) {
			
			xlsWorkbook = new HSSFWorkbook(inputStream);
		} else if (FilenameUtils.equals("xlsx", extension)) {
			
			xlsWorkbook = new XSSFWorkbook(inputStream);
		} else {
			throw new RuntimeException("不支持的解析类型！");
		}
		Sheet xlsSheet = xlsWorkbook.getSheetAt(0);
		
		Row firstRow =  xlsSheet.getRow(0);
		if (firstRow == null) {
			throw new RuntimeException("没有表头行！");
		}
		short cellNum = firstRow.getLastCellNum();

		Map<String, String> headMap = new HashMap<String, String>();
		//获取表头的map
		if (dataMode == DATA_MODE_NAME) {
			for (int i = 0; i < cellNum; i++) {
				headMap.put(String.valueOf(i), getCellValue(firstRow.getCell(i)));
			}
		}
		
		//System.out.println("cellNum====>>" + cellNum);
		if(xlsSheet != null){			
			for(int i = startLine; i <= xlsSheet.getLastRowNum(); i++){ // 注意lastrownum 从0开始计数
				String p="";
				Row row = xlsSheet.getRow(i);
				if (row != null) {
					//Map<String, String> recordMap = new HashMap<String, String>();
					int emptyNum = 0;
					for (int j = 0; j < cellNum; j++) {
						Cell cell = row.getCell(j);
						String value = getCellValue(cell);
						if (value == null || value.equals("")) {
							emptyNum++;
						}
						if (dataMode == DATA_MODE_NAME) {
							p=p+value+",";
					//		recordMap.put(headMap.get(String.valueOf(j)), value);
						} 
					}
					
					retList.add(p);
					

				}
			}
		}
		return retList;
	}
	
	/**
     * 获取单元格数据.
     * @param cell 单元格对象.
     * @return 单元格数据  出错或者为空 返回“”
     * @throws Exception 异常
     */
    private String getCellValue(Cell cell) {
        if (cell == null) {
            return "";
        }
        String cellValue = "";
        switch (cell.getCellType()) {
        case Cell.CELL_TYPE_BLANK:
            cellValue = "";
            break;
        case Cell.CELL_TYPE_NUMERIC:
        	if (HSSFDateUtil.isCellDateFormatted(cell)) {
        		SimpleDateFormat sdf = null;
        		if (cell.getCellStyle().getDataFormat() == HSSFDataFormat.getBuiltinFormat("m/d/yy h:mm")) {  
                    sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
                    Date date = cell.getDateCellValue();
                    cellValue = sdf.format(date);  
                }
        	}else{
        		DecimalFormat formatter = new DecimalFormat("#########.##");
        		cellValue = formatter.format(cell.getNumericCellValue());
        	}
            break;
        case Cell.CELL_TYPE_STRING:
            cellValue = cell.getRichStringCellValue().getString();
            break;
        case Cell.CELL_TYPE_BOOLEAN:
            cellValue = String.valueOf(cell.getBooleanCellValue());
            break;
        case Cell.CELL_TYPE_FORMULA:
            cell.setCellType(Cell.CELL_TYPE_NUMERIC);
            cellValue = String.valueOf(cell.getNumericCellValue());
            break;
        default:
            cellValue = "";
            break;
        }
        return cellValue.trim();
    }
	
    
	
	public void setStartLine(int startLine) {
		this.startLine = startLine;
	}

	public void setDataMode(int dataMode) {
		this.dataMode = dataMode;
	}

	public static void main(String[] args) {
		
		File file = new File("C:\\Users\\Administrator\\Desktop\\代理商导入.xlsx");
		
		XLSUtils u = new XLSUtils();
		//u.setDataMode(DATA_MODE_NAME);
		
		try {
			List<Map<String, String>> retList = u.getXLSData(new FileInputStream(file), "xxx.xlsx");
			
			for (Map<String, String> map : retList) {
				for(String key : map.keySet()) {
					System.out.println("key=" + key + ",value=" + map.get(key));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
