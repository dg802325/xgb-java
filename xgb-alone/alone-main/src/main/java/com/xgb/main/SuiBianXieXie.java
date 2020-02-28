package com.xgb.main;

import com.xgb.common.Utils;
import com.xgb.model.ContentAttrModel;
import com.xgb.service.GetNianJianSaveJava;
import com.xgb.util.MyTools;
import com.xgb.utils.ReadExcel;
import com.xgb.utils.ReadExcel2;

import java.io.IOException;
import java.util.List;

public class SuiBianXieXie {

    public static void main(String[] args) {
        List<ContentAttrModel> excelResourceList = null;
        String newTableName = "cs";
        String oldTableName = "cs";
        try {
            excelResourceList = ReadExcel2.getExcelResourceList("F:\\tt\\tt.xlsx");
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
