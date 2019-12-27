package com.xgb.service;

import com.xgb.common.Utils;
import com.xgb.model.MjzzUser;
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
* @Date: 2019年12月27日 15:31:09
* @Description:
*/
public class ReadMjzzUserService {

    public static List<MjzzUser> getContent(){
        List<MjzzUser> lists = new ArrayList<MjzzUser>();
        String path = Utils.getResourceBasePath() + "/xgb-data/data-api/config/MjzzUser.txt";
        File file = new File(path);
        MjzzUser  entity = null;
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
    public static MjzzUser getEntity(String result){
        String[] split = result.split("\\|");
        MjzzUser fcc = new MjzzUser();
        if(MyTools.isNotEmpty(split[0])){
            fcc.setId(Long.parseLong(split[0]));
        }
        if(MyTools.isNotEmpty(split[1])){
            fcc.setName(split[1]);
        }
        if(MyTools.isNotEmpty(split[2])){
            fcc.setUsername(split[2]);
        }
        if(MyTools.isNotEmpty(split[3])){
            fcc.setPassword(split[3]);
        }
        if(MyTools.isNotEmpty(split[4])){
            fcc.setDept(split[4]);
        }
        if(MyTools.isNotEmpty(split[5])){
            fcc.setIdcard(split[5]);
        }
        if(MyTools.isNotEmpty(split[6])){
            fcc.setAddress(split[6]);
        }
        if(MyTools.isNotEmpty(split[7])){
            fcc.setTelephone(split[7]);
        }
        if(MyTools.isNotEmpty(split[8])){
            fcc.setFax(split[8]);
        }
        if(MyTools.isNotEmpty(split[9])){
            fcc.setWorkdept(split[9]);
        }
        if(MyTools.isNotEmpty(split[10])){
            fcc.setResidence(split[10]);
        }
        if(MyTools.isNotEmpty(split[11])){
            fcc.setEmail(split[11]);
        }
        if(MyTools.isNotEmpty(split[12])){
            fcc.setPostcode(split[12]);
        }
        if(MyTools.isNotEmpty(split[13])){
            fcc.setOthercontact(split[13]);
        }
        if(MyTools.isNotEmpty(split[14])){
            fcc.setRegistered(split[14]);
        }
        if(MyTools.isNotEmpty(split[15])){
            fcc.setManagerdept(Long.parseLong(split[15]));
        }
        if(MyTools.isNotEmpty(split[16])){
            fcc.setOrganization(split[16]);
        }
        if(MyTools.isNotEmpty(split[17])){
            fcc.setSerialnumber(split[17]);
        }
        if(MyTools.isNotEmpty(split[18])){
            fcc.setConstitutedate(DateUtils.strToDateLong(split[18]));
        }
        if(MyTools.isNotEmpty(split[19])){
            fcc.setCorporation(split[19]);
        }
        if(MyTools.isNotEmpty(split[20])){
            fcc.setCorptelephone(split[20]);
        }
        if(MyTools.isNotEmpty(split[21])){
            fcc.setType(Short.parseShort(split[21]));
        }
        if(MyTools.isNotEmpty(split[22])){
            fcc.setStatus(Short.parseShort(split[22]));
        }
        if(MyTools.isNotEmpty(split[23])){
            fcc.setTypedeptid(Long.parseLong(split[23]));
        }
        if(MyTools.isNotEmpty(split[24])){
            fcc.setManageorg(Long.parseLong(split[24]));
        }
        if(MyTools.isNotEmpty(split[25])){
            fcc.setOrganizationId(split[25]);
        }
        if(MyTools.isNotEmpty(split[26])){
            fcc.setMfType(Short.parseShort(split[26]));
        }
        if(MyTools.isNotEmpty(split[27])){
            fcc.setRegion(Long.parseLong(split[27]));
        }
        if(MyTools.isNotEmpty(split[28])){
            fcc.setRegistedate(DateUtils.strToDateLong(split[28]));
        }
        if(MyTools.isNotEmpty(split[29])){
            fcc.setArea(Short.parseShort(split[29]));
        }
        if(MyTools.isNotEmpty(split[30])){
            fcc.setUsertype(Short.parseShort(split[30]));
        }
        if(MyTools.isNotEmpty(split[31])){
            fcc.setOrgIdentity(split[31]);
        }
        if(MyTools.isNotEmpty(split[32])){
            fcc.setUnitType(split[32]);
        }
        if(MyTools.isNotEmpty(split[33])){
            fcc.setLastLogginginTime(DateUtils.strToDateLong(split[33]));
        }
        if(MyTools.isNotEmpty(split[34])){
            fcc.setLogginginCount(Long.parseLong(split[34]));
        }
        if(MyTools.isNotEmpty(split[35])){
            fcc.setTemp(split[35]);
        }
        if(MyTools.isNotEmpty(split[36])){
            fcc.setXinyongdaima(split[36]);
        }

        return fcc;
    }
}

