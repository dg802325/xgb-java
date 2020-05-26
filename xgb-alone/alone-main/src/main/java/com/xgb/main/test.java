package com.xgb.main;

import com.xgb.common.Utils;
import com.xgb.model.jojc;
import com.xgb.service.NewEntityGenerator;
import com.xgb.service.SqlNameGenerator;
import com.xgb.util.MyTools;
import com.xgb.utils.ReadExcel3;
import com.xgb.utils.SelectJcJo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class test {


    public static void main(String[] args) {
        List<jojc> excelResourceList = new ArrayList<>();
        String file = "F:\\txt\\01th.xlsx";
        List<jojc> list = new ArrayList<>();
        try {
            excelResourceList = ReadExcel3.getExcelResourceList(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        int len = excelResourceList.size();
        for(int i=0;i<len;i++){
            String newName = excelResourceList.get(i).getNewName().replaceAll("\\u00A0","") ;
            jojc jojc = SelectJcJo.selectByXintitle(excelResourceList.get(i), newName);
            if(MyTools.isNotEmpty(jojc)){
                list.add(jojc);
            }
        }

        String path= Utils.getResourceBasePath()+"/xgb-alone/alone-main/config";
        SqlNameGenerator.genGeratorCode(path,"",list);

        System.out.println(list);
    }
}
