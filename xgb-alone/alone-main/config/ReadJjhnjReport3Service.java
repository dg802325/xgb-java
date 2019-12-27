package com.xgb.service;

import com.xgb.common.Utils;
import com.xgb.model.JjhnjReport3;
import com.xgb.util.DateUtils;
import com.xgb.util.MyTools;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
* @Auther: 
* @Date: 2019年12月24日 15:59:49
* @Description:
*/
public class ReadJjhnjReport3Service {

    public static JjhnjReport3 getContent(){
        List<JjhnjReport3> lists = new ArrayList<JjhnjReport3>();
        String path = Utils.getResourceBasePath() + "/xgb-data/data-api/config/JjhnjReport3.txt";
        File file = new File(path);
        JjhnjReport3  entity = null;
        Boolean boo = file.exists() && file.isFile();
        if(boo){
            BufferedReader bufferedReader = null;
            try {
                //构造一个BufferedReader类来读取文件
                bufferedReader = new BufferedReader(new FileReader(file));
                String linetxt = null;
                //result用来存储文件内容
                StringBuilder result = new StringBuilder();
                //按使用readLine方法，一次读一行
                while ((linetxt = bufferedReader.readLine()) != null) {
                    result.append(linetxt);
                }
                //输出读出的所有数据（StringBuilder类型）
                entity = getEntity(result.toString());
                lists.add(entity);
            } catch (Exception e) {
                System.out.println("读取文件内容出错");
                e.printStackTrace();
            } finally {
                try {
                    bufferedReader.close();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        }
        return entity;
    }
    public static JjhnjReport3 getEntity(String result){
        String[] split = result.split("\\|");
        JjhnjReport3 fcc = new JjhnjReport3();
        if(MyTools.isNotEmpty(split[0])){
            fcc.setId(Long.parseLong(split[0]));
        }
        if(MyTools.isNotEmpty(split[1])){
            fcc.setInstanceid(split[1]);
        }
        if(MyTools.isNotEmpty(split[2])){
            fcc.setOrganizationid(split[2]);
        }
        if(MyTools.isNotEmpty(split[3])){
            fcc.setStatus(Short.parseShort(split[3]));
        }
        if(MyTools.isNotEmpty(split[4])){
            fcc.setBianzhidanwei(split[4]);
        }
        if(MyTools.isNotEmpty(split[5])){
            fcc.setNiandu(split[5]);
        }
        if(MyTools.isNotEmpty(split[6])){
            fcc.setNianchushu1(Integer.parseInt(split[6]));
        }
        if(MyTools.isNotEmpty(split[7])){
            fcc.setQimoshu1(Integer.parseInt(split[7]));
        }
        if(MyTools.isNotEmpty(split[8])){
            fcc.setNianchushu23(Integer.parseInt(split[8]));
        }
        if(MyTools.isNotEmpty(split[9])){
            fcc.setQimoshu22(Integer.parseInt(split[9]));
        }
        if(MyTools.isNotEmpty(split[10])){
            fcc.setNianchushu2(Integer.parseInt(split[10]));
        }
        if(MyTools.isNotEmpty(split[11])){
            fcc.setQimoshu2(Integer.parseInt(split[11]));
        }
        if(MyTools.isNotEmpty(split[12])){
            fcc.setNianchushu24(Integer.parseInt(split[12]));
        }
        if(MyTools.isNotEmpty(split[13])){
            fcc.setQimoshu23(Integer.parseInt(split[13]));
        }
        if(MyTools.isNotEmpty(split[14])){
            fcc.setNianchushu3(Integer.parseInt(split[14]));
        }
        if(MyTools.isNotEmpty(split[15])){
            fcc.setQimoshu3(Integer.parseInt(split[15]));
        }
        if(MyTools.isNotEmpty(split[16])){
            fcc.setNianchushu25(Integer.parseInt(split[16]));
        }
        if(MyTools.isNotEmpty(split[17])){
            fcc.setQimoshu24(Integer.parseInt(split[17]));
        }
        if(MyTools.isNotEmpty(split[18])){
            fcc.setNianchushu4(Integer.parseInt(split[18]));
        }
        if(MyTools.isNotEmpty(split[19])){
            fcc.setQimoshu4(Integer.parseInt(split[19]));
        }
        if(MyTools.isNotEmpty(split[20])){
            fcc.setNianchushu26(Integer.parseInt(split[20]));
        }
        if(MyTools.isNotEmpty(split[21])){
            fcc.setQimoshu25(Integer.parseInt(split[21]));
        }
        if(MyTools.isNotEmpty(split[22])){
            fcc.setNianchushu5(Integer.parseInt(split[22]));
        }
        if(MyTools.isNotEmpty(split[23])){
            fcc.setQimoshu5(Integer.parseInt(split[23]));
        }
        if(MyTools.isNotEmpty(split[24])){
            fcc.setNianchushu27(Integer.parseInt(split[24]));
        }
        if(MyTools.isNotEmpty(split[25])){
            fcc.setQimoshu26(Integer.parseInt(split[25]));
        }
        if(MyTools.isNotEmpty(split[26])){
            fcc.setNianchushu6(Integer.parseInt(split[26]));
        }
        if(MyTools.isNotEmpty(split[27])){
            fcc.setQimoshu6(Integer.parseInt(split[27]));
        }
        if(MyTools.isNotEmpty(split[28])){
            fcc.setNianchushu28(Integer.parseInt(split[28]));
        }
        if(MyTools.isNotEmpty(split[29])){
            fcc.setQimoshu27(Integer.parseInt(split[29]));
        }
        if(MyTools.isNotEmpty(split[30])){
            fcc.setNianchushu7(Integer.parseInt(split[30]));
        }
        if(MyTools.isNotEmpty(split[31])){
            fcc.setQimoshu7(Integer.parseInt(split[31]));
        }
        if(MyTools.isNotEmpty(split[32])){
            fcc.setNianchushu29(Integer.parseInt(split[32]));
        }
        if(MyTools.isNotEmpty(split[33])){
            fcc.setQimoshu28(Integer.parseInt(split[33]));
        }
        if(MyTools.isNotEmpty(split[34])){
            fcc.setNianchushu8(Integer.parseInt(split[34]));
        }
        if(MyTools.isNotEmpty(split[35])){
            fcc.setQimoshu8(Integer.parseInt(split[35]));
        }
        if(MyTools.isNotEmpty(split[36])){
            fcc.setNianchushu30(Integer.parseInt(split[36]));
        }
        if(MyTools.isNotEmpty(split[37])){
            fcc.setNianchushu9(Integer.parseInt(split[37]));
        }
        if(MyTools.isNotEmpty(split[38])){
            fcc.setQimoshu9(Integer.parseInt(split[38]));
        }
        if(MyTools.isNotEmpty(split[39])){
            fcc.setNianchushu31(Integer.parseInt(split[39]));
        }
        if(MyTools.isNotEmpty(split[40])){
            fcc.setQimoshu29(Integer.parseInt(split[40]));
        }
        if(MyTools.isNotEmpty(split[41])){
            fcc.setNianchushu32(Integer.parseInt(split[41]));
        }
        if(MyTools.isNotEmpty(split[42])){
            fcc.setQimoshu30(Integer.parseInt(split[42]));
        }
        if(MyTools.isNotEmpty(split[43])){
            fcc.setNianchushu10(Integer.parseInt(split[43]));
        }
        if(MyTools.isNotEmpty(split[44])){
            fcc.setQimoshu10(Integer.parseInt(split[44]));
        }
        if(MyTools.isNotEmpty(split[45])){
            fcc.setNianchushu11(Integer.parseInt(split[45]));
        }
        if(MyTools.isNotEmpty(split[46])){
            fcc.setQimoshu11(Integer.parseInt(split[46]));
        }
        if(MyTools.isNotEmpty(split[47])){
            fcc.setNianchushu33(Integer.parseInt(split[47]));
        }
        if(MyTools.isNotEmpty(split[48])){
            fcc.setQimoshu31(Integer.parseInt(split[48]));
        }
        if(MyTools.isNotEmpty(split[49])){
            fcc.setNianchushu12(Integer.parseInt(split[49]));
        }
        if(MyTools.isNotEmpty(split[50])){
            fcc.setNianchushu34(Integer.parseInt(split[50]));
        }
        if(MyTools.isNotEmpty(split[51])){
            fcc.setQimoshu32(Integer.parseInt(split[51]));
        }
        if(MyTools.isNotEmpty(split[52])){
            fcc.setNianchushu35(Integer.parseInt(split[52]));
        }
        if(MyTools.isNotEmpty(split[53])){
            fcc.setQimoshu33(Integer.parseInt(split[53]));
        }
        if(MyTools.isNotEmpty(split[54])){
            fcc.setNianchushu36(Integer.parseInt(split[54]));
        }
        if(MyTools.isNotEmpty(split[55])){
            fcc.setQimoshu34(Integer.parseInt(split[55]));
        }
        if(MyTools.isNotEmpty(split[56])){
            fcc.setNianchushu13(Integer.parseInt(split[56]));
        }
        if(MyTools.isNotEmpty(split[57])){
            fcc.setQimoshu12(Integer.parseInt(split[57]));
        }
        if(MyTools.isNotEmpty(split[58])){
            fcc.setNianchushu14(Integer.parseInt(split[58]));
        }
        if(MyTools.isNotEmpty(split[59])){
            fcc.setQimoshu13(Integer.parseInt(split[59]));
        }
        if(MyTools.isNotEmpty(split[60])){
            fcc.setNianchushu15(Integer.parseInt(split[60]));
        }
        if(MyTools.isNotEmpty(split[61])){
            fcc.setQimoshu14(Integer.parseInt(split[61]));
        }
        if(MyTools.isNotEmpty(split[62])){
            fcc.setNianchushu37(Integer.parseInt(split[62]));
        }
        if(MyTools.isNotEmpty(split[63])){
            fcc.setQimoshu35(Integer.parseInt(split[63]));
        }
        if(MyTools.isNotEmpty(split[64])){
            fcc.setNianchushu16(Integer.parseInt(split[64]));
        }
        if(MyTools.isNotEmpty(split[65])){
            fcc.setQimoshu15(Integer.parseInt(split[65]));
        }
        if(MyTools.isNotEmpty(split[66])){
            fcc.setNianchushu17(Integer.parseInt(split[66]));
        }
        if(MyTools.isNotEmpty(split[67])){
            fcc.setQimoshu16(Integer.parseInt(split[67]));
        }
        if(MyTools.isNotEmpty(split[68])){
            fcc.setNianchushu38(Integer.parseInt(split[68]));
        }
        if(MyTools.isNotEmpty(split[69])){
            fcc.setQimoshu36(Integer.parseInt(split[69]));
        }
        if(MyTools.isNotEmpty(split[70])){
            fcc.setNianchushu18(Integer.parseInt(split[70]));
        }
        if(MyTools.isNotEmpty(split[71])){
            fcc.setQimoshu17(Integer.parseInt(split[71]));
        }
        if(MyTools.isNotEmpty(split[72])){
            fcc.setNianchushu19(Integer.parseInt(split[72]));
        }
        if(MyTools.isNotEmpty(split[73])){
            fcc.setQimoshu18(Integer.parseInt(split[73]));
        }
        if(MyTools.isNotEmpty(split[74])){
            fcc.setNianchushu20(Integer.parseInt(split[74]));
        }
        if(MyTools.isNotEmpty(split[75])){
            fcc.setQimoshu19(Integer.parseInt(split[75]));
        }
        if(MyTools.isNotEmpty(split[76])){
            fcc.setNianchushu39(Integer.parseInt(split[76]));
        }
        if(MyTools.isNotEmpty(split[77])){
            fcc.setQimoshu37(Integer.parseInt(split[77]));
        }
        if(MyTools.isNotEmpty(split[78])){
            fcc.setNianchushu40(Integer.parseInt(split[78]));
        }
        if(MyTools.isNotEmpty(split[79])){
            fcc.setQimoshu38(Integer.parseInt(split[79]));
        }
        if(MyTools.isNotEmpty(split[80])){
            fcc.setNianchushu21(Integer.parseInt(split[80]));
        }
        if(MyTools.isNotEmpty(split[81])){
            fcc.setQimoshu20(Integer.parseInt(split[81]));
        }
        if(MyTools.isNotEmpty(split[82])){
            fcc.setNianchushu41(Integer.parseInt(split[82]));
        }
        if(MyTools.isNotEmpty(split[83])){
            fcc.setQimoshu39(Integer.parseInt(split[83]));
        }
        if(MyTools.isNotEmpty(split[84])){
            fcc.setNianchushu22(Integer.parseInt(split[84]));
        }
        if(MyTools.isNotEmpty(split[85])){
            fcc.setQimoshu21(Integer.parseInt(split[85]));
        }
        if(MyTools.isNotEmpty(split[86])){
            fcc.setNianchushu42(Integer.parseInt(split[86]));
        }
        if(MyTools.isNotEmpty(split[87])){
            fcc.setQimoshu40(Integer.parseInt(split[87]));
        }
        if(MyTools.isNotEmpty(split[88])){
            fcc.setQimoshu42(Integer.parseInt(split[88]));
        }
        if(MyTools.isNotEmpty(split[89])){
            fcc.setQimoshu41(Integer.parseInt(split[89]));
        }
        if(MyTools.isNotEmpty(split[90])){
            fcc.setTjnjjieguo1(split[90]);
        }
        if(MyTools.isNotEmpty(split[91])){
            fcc.setTjnjjieguo2(split[91]);
        }
        if(MyTools.isNotEmpty(split[92])){
            fcc.setTjnjyijian1(split[92]);
        }
        if(MyTools.isNotEmpty(split[93])){
            fcc.setTjnjyijian2(split[93]);
        }
        if(MyTools.isNotEmpty(split[94])){
            fcc.setTjnjxingming1(split[94]);
        }
        if(MyTools.isNotEmpty(split[95])){
            fcc.setTjnjxingming2(split[95]);
        }
        if(MyTools.isNotEmpty(split[96])){
            fcc.setTjnjshijian1(DateUtils.strToDateLong(split[96]));
        }
        if(MyTools.isNotEmpty(split[97])){
            fcc.setTjnjshijian2(DateUtils.strToDateLong(split[97]));
        }

        return fcc;
    }
}

