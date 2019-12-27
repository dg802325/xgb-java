package com.xgb.service;

import com.xgb.common.Utils;
import com.xgb.model.JjhnjReport3;
import com.xgb.util.DateUtils;
import com.xgb.util.MyTools;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
* @Auther: 
* @Date: 2019年12月24日 15:59:49
* @Description:
*/
public class ReadJjhnjReport3Service {

    public static List<JjhnjReport3> getContent(){
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
        return lists;
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
            fcc.setNianchushu1(new BigDecimal(split[6]));
        }
        if(MyTools.isNotEmpty(split[7])){
            fcc.setQimoshu1(new BigDecimal(split[7]));
        }
        if(MyTools.isNotEmpty(split[8])){
            fcc.setNianchushu23(new BigDecimal(split[8]));
        }
        if(MyTools.isNotEmpty(split[9])){
            fcc.setQimoshu22(new BigDecimal(split[9]));
        }
        if(MyTools.isNotEmpty(split[10])){
            fcc.setNianchushu2(new BigDecimal(split[10]));
        }
        if(MyTools.isNotEmpty(split[11])){
            fcc.setQimoshu2(new BigDecimal(split[11]));
        }
        if(MyTools.isNotEmpty(split[12])){
            fcc.setNianchushu24(new BigDecimal(split[12]));
        }
        if(MyTools.isNotEmpty(split[13])){
            fcc.setQimoshu23(new BigDecimal(split[13]));
        }
        if(MyTools.isNotEmpty(split[14])){
            fcc.setNianchushu3(new BigDecimal(split[14]));
        }
        if(MyTools.isNotEmpty(split[15])){
            fcc.setQimoshu3(new BigDecimal(split[15]));
        }
        if(MyTools.isNotEmpty(split[16])){
            fcc.setNianchushu25(new BigDecimal(split[16]));
        }
        if(MyTools.isNotEmpty(split[17])){
            fcc.setQimoshu24(new BigDecimal(split[17]));
        }
        if(MyTools.isNotEmpty(split[18])){
            fcc.setNianchushu4(new BigDecimal(split[18]));
        }
        if(MyTools.isNotEmpty(split[19])){
            fcc.setQimoshu4(new BigDecimal(split[19]));
        }
        if(MyTools.isNotEmpty(split[20])){
            fcc.setNianchushu26(new BigDecimal(split[20]));
        }
        if(MyTools.isNotEmpty(split[21])){
            fcc.setQimoshu25(new BigDecimal(split[21]));
        }
        if(MyTools.isNotEmpty(split[22])){
            fcc.setNianchushu5(new BigDecimal(split[22]));
        }
        if(MyTools.isNotEmpty(split[23])){
            fcc.setQimoshu5(new BigDecimal(split[23]));
        }
        if(MyTools.isNotEmpty(split[24])){
            fcc.setNianchushu27(new BigDecimal(split[24]));
        }
        if(MyTools.isNotEmpty(split[25])){
            fcc.setQimoshu26(new BigDecimal(split[25]));
        }
        if(MyTools.isNotEmpty(split[26])){
            fcc.setNianchushu6(new BigDecimal(split[26]));
        }
        if(MyTools.isNotEmpty(split[27])){
            fcc.setQimoshu6(new BigDecimal(split[27]));
        }
        if(MyTools.isNotEmpty(split[28])){
            fcc.setNianchushu28(new BigDecimal(split[28]));
        }
        if(MyTools.isNotEmpty(split[29])){
            fcc.setQimoshu27(new BigDecimal(split[29]));
        }
        if(MyTools.isNotEmpty(split[30])){
            fcc.setNianchushu7(new BigDecimal(split[30]));
        }
        if(MyTools.isNotEmpty(split[31])){
            fcc.setQimoshu7(new BigDecimal(split[31]));
        }
        if(MyTools.isNotEmpty(split[32])){
            fcc.setNianchushu29(new BigDecimal(split[32]));
        }
        if(MyTools.isNotEmpty(split[33])){
            fcc.setQimoshu28(new BigDecimal(split[33]));
        }
        if(MyTools.isNotEmpty(split[34])){
            fcc.setNianchushu8(new BigDecimal(split[34]));
        }
        if(MyTools.isNotEmpty(split[35])){
            fcc.setQimoshu8(new BigDecimal(split[35]));
        }
        if(MyTools.isNotEmpty(split[36])){
            fcc.setNianchushu30(new BigDecimal(split[36]));
        }
        if(MyTools.isNotEmpty(split[37])){
            fcc.setNianchushu9(new BigDecimal(split[37]));
        }
        if(MyTools.isNotEmpty(split[38])){
            fcc.setQimoshu9(new BigDecimal(split[38]));
        }
        if(MyTools.isNotEmpty(split[39])){
            fcc.setNianchushu31(new BigDecimal(split[39]));
        }
        if(MyTools.isNotEmpty(split[40])){
            fcc.setQimoshu29(new BigDecimal(split[40]));
        }
        if(MyTools.isNotEmpty(split[41])){
            fcc.setNianchushu32(new BigDecimal(split[41]));
        }
        if(MyTools.isNotEmpty(split[42])){
            fcc.setQimoshu30(new BigDecimal(split[42]));
        }
        if(MyTools.isNotEmpty(split[43])){
            fcc.setNianchushu10(new BigDecimal(split[43]));
        }
        if(MyTools.isNotEmpty(split[44])){
            fcc.setQimoshu10(new BigDecimal(split[44]));
        }
        if(MyTools.isNotEmpty(split[45])){
            fcc.setNianchushu11(new BigDecimal(split[45]));
        }
        if(MyTools.isNotEmpty(split[46])){
            fcc.setQimoshu11(new BigDecimal(split[46]));
        }
        if(MyTools.isNotEmpty(split[47])){
            fcc.setNianchushu33(new BigDecimal(split[47]));
        }
        if(MyTools.isNotEmpty(split[48])){
            fcc.setQimoshu31(new BigDecimal(split[48]));
        }
        if(MyTools.isNotEmpty(split[49])){
            fcc.setNianchushu12(new BigDecimal(split[49]));
        }
        if(MyTools.isNotEmpty(split[50])){
            fcc.setNianchushu34(new BigDecimal(split[50]));
        }
        if(MyTools.isNotEmpty(split[51])){
            fcc.setQimoshu32(new BigDecimal(split[51]));
        }
        if(MyTools.isNotEmpty(split[52])){
            fcc.setNianchushu35(new BigDecimal(split[52]));
        }
        if(MyTools.isNotEmpty(split[53])){
            fcc.setQimoshu33(new BigDecimal(split[53]));
        }
        if(MyTools.isNotEmpty(split[54])){
            fcc.setNianchushu36(new BigDecimal(split[54]));
        }
        if(MyTools.isNotEmpty(split[55])){
            fcc.setQimoshu34(new BigDecimal(split[55]));
        }
        if(MyTools.isNotEmpty(split[56])){
            fcc.setNianchushu13(new BigDecimal(split[56]));
        }
        if(MyTools.isNotEmpty(split[57])){
            fcc.setQimoshu12(new BigDecimal(split[57]));
        }
        if(MyTools.isNotEmpty(split[58])){
            fcc.setNianchushu14(new BigDecimal(split[58]));
        }
        if(MyTools.isNotEmpty(split[59])){
            fcc.setQimoshu13(new BigDecimal(split[59]));
        }
        if(MyTools.isNotEmpty(split[60])){
            fcc.setNianchushu15(new BigDecimal(split[60]));
        }
        if(MyTools.isNotEmpty(split[61])){
            fcc.setQimoshu14(new BigDecimal(split[61]));
        }
        if(MyTools.isNotEmpty(split[62])){
            fcc.setNianchushu37(new BigDecimal(split[62]));
        }
        if(MyTools.isNotEmpty(split[63])){
            fcc.setQimoshu35(new BigDecimal(split[63]));
        }
        if(MyTools.isNotEmpty(split[64])){
            fcc.setNianchushu16(new BigDecimal(split[64]));
        }
        if(MyTools.isNotEmpty(split[65])){
            fcc.setQimoshu15(new BigDecimal(split[65]));
        }
        if(MyTools.isNotEmpty(split[66])){
            fcc.setNianchushu17(new BigDecimal(split[66]));
        }
        if(MyTools.isNotEmpty(split[67])){
            fcc.setQimoshu16(new BigDecimal(split[67]));
        }
        if(MyTools.isNotEmpty(split[68])){
            fcc.setNianchushu38(new BigDecimal(split[68]));
        }
        if(MyTools.isNotEmpty(split[69])){
            fcc.setQimoshu36(new BigDecimal(split[69]));
        }
        if(MyTools.isNotEmpty(split[70])){
            fcc.setNianchushu18(new BigDecimal(split[70]));
        }
        if(MyTools.isNotEmpty(split[71])){
            fcc.setQimoshu17(new BigDecimal(split[71]));
        }
        if(MyTools.isNotEmpty(split[72])){
            fcc.setNianchushu19(new BigDecimal(split[72]));
        }
        if(MyTools.isNotEmpty(split[73])){
            fcc.setQimoshu18(new BigDecimal(split[73]));
        }
        if(MyTools.isNotEmpty(split[74])){
            fcc.setNianchushu20(new BigDecimal(split[74]));
        }
        if(MyTools.isNotEmpty(split[75])){
            fcc.setQimoshu19(new BigDecimal(split[75]));
        }
        if(MyTools.isNotEmpty(split[76])){
            fcc.setNianchushu39(new BigDecimal(split[76]));
        }
        if(MyTools.isNotEmpty(split[77])){
            fcc.setQimoshu37(new BigDecimal(split[77]));
        }
        if(MyTools.isNotEmpty(split[78])){
            fcc.setNianchushu40(new BigDecimal(split[78]));
        }
        if(MyTools.isNotEmpty(split[79])){
            fcc.setQimoshu38(new BigDecimal(split[79]));
        }
        if(MyTools.isNotEmpty(split[80])){
            fcc.setNianchushu21(new BigDecimal(split[80]));
        }
        if(MyTools.isNotEmpty(split[81])){
            fcc.setQimoshu20(new BigDecimal(split[81]));
        }
        if(MyTools.isNotEmpty(split[82])){
            fcc.setNianchushu41(new BigDecimal(split[82]));
        }
        if(MyTools.isNotEmpty(split[83])){
            fcc.setQimoshu39(new BigDecimal(split[83]));
        }
        if(MyTools.isNotEmpty(split[84])){
            fcc.setNianchushu22(new BigDecimal(split[84]));
        }
        if(MyTools.isNotEmpty(split[85])){
            fcc.setQimoshu21(new BigDecimal(split[85]));
        }
        if(MyTools.isNotEmpty(split[86])){
            fcc.setNianchushu42(new BigDecimal(split[86]));
        }
        if(MyTools.isNotEmpty(split[87])){
            fcc.setQimoshu40(new BigDecimal(split[87]));
        }
        if(MyTools.isNotEmpty(split[88])){
            fcc.setQimoshu42(new BigDecimal(split[88]));
        }
        if(MyTools.isNotEmpty(split[89])){
            fcc.setQimoshu41(new BigDecimal(split[89]));
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

