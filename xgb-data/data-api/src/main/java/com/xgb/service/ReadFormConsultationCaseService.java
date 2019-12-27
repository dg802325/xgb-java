package com.xgb.service;

import com.xgb.common.Utils;
import com.xgb.model.FormConsultationCase;
import com.xgb.util.DateUtils;
import com.xgb.util.MyTools;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFormConsultationCaseService {

    public static void main(String[] args) {
        String path = Utils.getResourceBasePath() + "/xgb-data/data-api/config/FormConsultationCase.txt";
        File file = new File(path);
        //判断文件存在并且是文件
        Boolean boo = file.exists() && file.isFile();
        if (boo) {
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
                FormConsultationCase analysis = ReadFormConsultationCaseService.analysis(result.toString());
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
    }

    public static List<FormConsultationCase> getContent(){
        List<FormConsultationCase> lists = new ArrayList<FormConsultationCase>();
        String path = Utils.getResourceBasePath() + "/xgb-data/data-api/config/FormConsultationCase.txt";
        File file = new File(path);
        FormConsultationCase entity =null;
        //判断文件存在并且是文件
        Boolean boo = file.exists() && file.isFile();
        if (boo) {
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
                System.out.println(result);
                entity = analysis(result.toString());
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

    public static FormConsultationCase analysis(String result){
        String[] split = result.split("\\|");
        FormConsultationCase fcc = new FormConsultationCase();
        for (int i = 0,len = split.length; i < len; i++) {
            if(MyTools.isNotEmpty(split[0])){
                fcc.setId(Long.parseLong(split[0]));
            }
            if(MyTools.isNotEmpty(split[1])){
                fcc.setInstanceid(split[1]);
            }
            if(MyTools.isNotEmpty(split[2])){
                fcc.setApplication(split[2]);
            }
            if(MyTools.isNotEmpty(split[3])){
                fcc.setCatalog(split[3]);
            }
            if(MyTools.isNotEmpty(split[4])){
                fcc.setOrgid(split[4]);
            }
            if(MyTools.isNotEmpty(split[5])){
                fcc.setOrgidentity(split[5]);
            }
            if(MyTools.isNotEmpty(split[6])){
                fcc.setOrgname(split[6]);
            }
            if(MyTools.isNotEmpty(split[7])){
                fcc.setProposer(split[7]);
            }
            if(MyTools.isNotEmpty(split[8])){
                fcc.setProposeid(Long.parseLong(split[8]));
            }
            if(MyTools.isNotEmpty(split[9])){
                fcc.setUserid(Long.parseLong(split[9]));
            }
            if(MyTools.isNotEmpty(split[10])){
                fcc.setDeptid(Long.parseLong(split[10]));
            }
            if(MyTools.isNotEmpty(split[11])){
                fcc.setCreatetime(DateUtils.strToDateLong(split[11]));
            }
            if(MyTools.isNotEmpty(split[12])){
                fcc.setLastmodifytime(DateUtils.strToDateLong(split[12]));
            }
            if(MyTools.isNotEmpty(split[13])){
                fcc.setStarttime(DateUtils.strToDateLong(split[13]));
            }
            if(MyTools.isNotEmpty(split[14])){
                fcc.setEndtime(DateUtils.strToDateLong(split[14]));
            }
            if(MyTools.isNotEmpty(split[15])){
                fcc.setCreatetype(Short.parseShort(split[15]));
            }
            if(MyTools.isNotEmpty(split[16])){
                fcc.setCasetype(Short.parseShort(split[16]));
            }
            if(MyTools.isNotEmpty(split[17])){
                fcc.setRegion(Long.parseLong(split[17]));
            }
            if(MyTools.isNotEmpty(split[18])){
                fcc.setFinished(Short.parseShort(split[18]));
            }
            if(MyTools.isNotEmpty(split[19])){
                fcc.setCasestate(Short.parseShort(split[19]));
            }
            if(MyTools.isNotEmpty(split[20])){
                fcc.setPropertyA(split[20]);
            }
            if(MyTools.isNotEmpty(split[21])){
                fcc.setPropertyB(split[21]);
            }
            if(MyTools.isNotEmpty(split[22])){
                fcc.setPropertyC(split[22]);
            }
            if(MyTools.isNotEmpty(split[23])){
                fcc.setPropertyD(split[23]);
            }
            if(MyTools.isNotEmpty(split[24])){
                fcc.setPropertyE(split[24]);
            }
            if(MyTools.isNotEmpty(split[25])){
                fcc.setHasnewmsg(Short.parseShort(split[25]));
            }
            if(MyTools.isNotEmpty(split[26])){
                fcc.setUnitType(Short.parseShort(split[26]));
            }
            if(MyTools.isNotEmpty(split[27])){
                fcc.setAcceptResult(Short.parseShort(split[27]));
            }
            if(MyTools.isNotEmpty(split[28])){
                fcc.setManagerorgid(Long.parseLong(split[28]));
            }
            if(MyTools.isNotEmpty(split[29])){
                fcc.setAuditType(Short.parseShort(split[29]));
            }
            if(MyTools.isNotEmpty(split[30])){
                fcc.setIsAllowEdit(Short.parseShort(split[30]));
            }
            if(MyTools.isNotEmpty(split[31])){
                fcc.setTemp(Long.parseLong(split[31]));
            }
            if(MyTools.isNotEmpty(split[32])){
                fcc.setTempA(split[32]);
            }
            if(MyTools.isNotEmpty(split[33])){
                fcc.setTempB(split[33]);
            }
        }
        return fcc;
    }


}
