package com.xgb.main;

import com.xgb.common.Utils;
import com.xgb.service.GetNianJianSaveJava;
import com.xgb.utils.ReadExcel;
import com.xgb.model.ContentAttrModel;
import com.xgb.util.MyTools;

import java.io.IOException;
import java.util.List;

public class ExcelToJava {

    public static void main(String[] args) {
        List<ContentAttrModel> excelResourceList = null;
        String newTableName = "226";
        String oldTableName = "ST_NJ_INNER4";
        try {
            excelResourceList = ReadExcel.getExcelResourceList("F:\\txt\\"+newTableName+".xlsx");
        } catch (IOException e) {
            e.printStackTrace();
        }
        if(MyTools.isNotEmpty(excelResourceList)){
            getCode(newTableName,oldTableName,excelResourceList);
        }
    }

    public static boolean getCode(String newTableName,String oldTableName,List<ContentAttrModel> excelResourceList){
        String path= Utils.getResourceBasePath()+"/xgb-alone/alone-main/config";
        GetNianJianSaveJava.genGeratorCode(path,newTableName,oldTableName,excelResourceList);
        return false;
    }
}
